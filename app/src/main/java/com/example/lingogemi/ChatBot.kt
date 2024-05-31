package com.example.lingogemi

import android.graphics.Bitmap
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.Send
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.rounded.AddAPhoto
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.drawable.toBitmap
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import coil.compose.AsyncImagePainter
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.size.Size
import com.example.lingogemi.ui.theme.LightOrange
import com.example.lingogemi.ui.theme.ModelBG
import com.example.lingogemi.ui.theme.Orange
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update


private val uriState = MutableStateFlow("")

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatBot(navController: NavHostController, chosenLanguage: String) {

    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Orange,
                    titleContentColor = LightOrange
                ),
                navigationIcon = {
                                 IconButton(
                                     onClick = {
                                         navController.popBackStack()
                                    }
                                 ) {
                                     Icon(
                                         imageVector = Icons.Filled.ArrowBackIosNew,
                                         contentDescription = "Arrow back",
                                         tint = LightOrange
                                     )
                                 }
                },
                title = { Text(text = stringResource(id = R.string.app_name)) }
            )
//            Box(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .background(Orange)
//                    .height(81.dp)
//                    .padding(horizontal = 16.dp)
//            ) {
//                Text(
//                    modifier = Modifier
//                        .align(Alignment.BottomStart)
//                        .padding(bottom = 12.dp),
//                    text = stringResource(id = R.string.app_name),
//                    fontSize = 19.sp,
//                    color = MaterialTheme.colorScheme.onPrimary
//                )
//            }
        }
    ) {
        ChatScreen(paddingValues = it)
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatScreen(paddingValues: PaddingValues){
    val chatViewModel = viewModel<ChatViewModel>()
    val chatState = chatViewModel.chatState.collectAsState().value

    val bitmap = getBitmap()

    Column(
        modifier = Modifier
            .background(LightOrange)
            .fillMaxSize()
            .padding(top = paddingValues.calculateTopPadding(), bottom = 10.dp),
        verticalArrangement = Arrangement.Bottom
    ) {
        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            reverseLayout = true
        ) {
            itemsIndexed(chatState.chatList) { index, chat ->
                if (chat.isFromUser) {
                    UserChatItem(prompt = chat.prompt, bitmap = chat.bitmap)
                } else {
                    ModelChatItem(response = chat.prompt)
                }
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            OutlinedTextField(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 8.dp)
                    .background(LightOrange),
                value = chatState.prompt,
                onValueChange = {
                    chatViewModel.onEvent(ChatUiEvent.UpdatePrompt(it))
                },
                placeholder = {
                    Text(
                        text = "Type a message",
                        color = Orange
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Orange,
                    unfocusedBorderColor = Color.LightGray,
                ),
                shape = RoundedCornerShape(20.dp),
            )

            Spacer(modifier = Modifier.width(8.dp))

            Icon(
                modifier = Modifier
                    .size(40.dp)
                    .clickable {
                        chatViewModel.onEvent(ChatUiEvent.UpdateBitmap(bitmap))
                        chatViewModel.onEvent(ChatUiEvent.SendPrompt(chatState.prompt, bitmap))
                        uriState.update { "" }
                    },
                imageVector = Icons.AutoMirrored.Rounded.Send,
                contentDescription = "Send a message",
                tint = Orange
            )

        }

    }

}

@Composable
fun UserChatItem(prompt: String, bitmap: Bitmap?) {
    Column(
        modifier = Modifier.padding(start = 100.dp, bottom = 22.dp)
    ) {
        bitmap?.let {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(260.dp)
                    .padding(bottom = 2.dp)
                    .clip(RoundedCornerShape(12.dp)),
                bitmap = it.asImageBitmap(),
                contentDescription = "image",
                contentScale = ContentScale.Crop
            )
        }

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(Orange)
                .padding(16.dp),
            text = prompt,
            fontSize = 17.sp,
            color = Color.White
        )

    }
}

@Composable
fun ModelChatItem(response: String) {
    Column(
        modifier = Modifier.padding(end = 100.dp, bottom = 22.dp)
    ) {

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(ModelBG)
                .padding(16.dp),
            text = response,
            fontSize = 17.sp,
            color = Color.White
        )

    }
}

@Composable
private fun getBitmap(): Bitmap? {
    val uri = uriState.collectAsState().value

    val imageState: AsyncImagePainter.State = rememberAsyncImagePainter(
        model = ImageRequest.Builder(LocalContext.current)
            .data(uri)
            .size(Size.ORIGINAL)
            .build()
    ).state

    if (imageState is AsyncImagePainter.State.Success) {
        return imageState.result.drawable.toBitmap()
    }

    return null
}