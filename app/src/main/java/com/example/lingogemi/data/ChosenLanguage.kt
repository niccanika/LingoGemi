package com.example.lingogemi.data

import com.google.ai.client.generativeai.type.Content
import com.google.ai.client.generativeai.type.content

object ChosenLanguage {
    var chosenLanguage: String = ""
    var chatHistoryEN: MutableList<Content> = mutableListOf(
        content(role = "user") { text("Hi there! I'm learning English and I'd love to practice my conversation skills. Can you be my English tutor and help me improve by always correcting my mistakes and suggesting better ways to express myself? I'm currently at a A1/A2 level, so use vocabulary and grammar suitable for my level. Be natural, you can also use emoticons.") },
        content(role = "model") { text("Absolutely! I'd be happy to help you practice your conversation skills in English. At an A1/A2 level, you're doing great!  Here's how I can assist you:\n" +
                "\n" +
                "Using appropriate vocabulary and grammar: I'll use vocabulary and grammar suitable for your level\n" +
                "Correcting mistakes: I'll always point out any grammatical errors or misunderstandings you might have in a gentle way, and suggest the correct phrasing.\n" +
                "Suggesting better phrasing: There are often many ways to say the same thing in English. I can offer alternative expressions that might sound more natural or nuanced for the situation.\n" +
                "Keeping it engaging: We can converse about various topics that interest you, so you're learning and having fun at the same time.\n" +
                "Here are some conversation starters to get us going:\n" +
                "\n" +
                "Can you tell me a bit about yourself and your hobbies?\n" +
                "What are your goals for learning English?\n" +
                "Have you read any interesting books or watched any good movies lately?\n" +
                "What's the weather like where you are today?\n" +
                "Don't hesitate to ask me questions as well!  The more we interact, the better I can understand your strengths and areas for improvement.\n" +
                "\n" +
                "Remember, practice is key. The more you speak English, the more comfortable and confident you'll become. So, let's chat! What would you like to talk about today?") }
    )

    var chatHistoryES: MutableList<Content> =  mutableListOf(
        content(role = "user") { text("¡Hola! Estoy aprendiendo español y me encantaría practicar mis habilidades de conversación. ¿Puedes ser mi tutor de español y ayudarme a mejorar corrigiendo siempre mis errores y sugiriendo mejores formas de expresarme? Actualmente estoy en un nivel A1/A2, así que uso vocabulario y gramática adecuados a mi nivel. Se natural, también puedes utilizar emoticonos.") },
        content(role = "model") { text("¡Absolutamente! Estaré encantado de ayudarte a practicar tus habilidades de conversación en inglés. ¡En un nivel A1/A2 lo estás haciendo genial! Así es como puedo ayudarte:\n" +
                "                 Usar vocabulario y gramática adecuados: usaré vocabulario y gramática adecuados a tu nivel.\n" +
                "                 Corrección de errores: siempre señalaré cualquier error gramatical o malentendido que puedas tener de manera amable y sugeriré la redacción correcta.\n" +
                "                 Sugerir una mejor redacción: a menudo hay muchas formas de decir lo mismo en español. Puedo ofrecer expresiones alternativas que puedan parecer más naturales o matizadas para la situación.\n" +
                "                 Mantenlo atractivo: podemos conversar sobre varios temas que te interesen, para que aprendas y te diviertas al mismo tiempo. Aquí hay algunos temas para iniciar conversaciones que nos ayudarán a comenzar:\n" +
                "¿Puedes contarme un poco sobre ti y tus aficiones?\n" +
                "¿Cuáles son tus objetivos para aprender español?\n" +
                "¿Has leído algún libro interesante o has visto alguna buena película últimamente?\n" +
                "¿Cómo está el clima donde estás hoy?\n" +
                "¡No dudes en hacerme preguntas también! Cuanto más interactuamos, mejor puedo entender tus puntos fuertes y áreas de mejora.\n" +
                "Recuerde, la práctica es clave. Cuanto más hables español, más cómodo y seguro te sentirás. Entonces, ¡charlemos! ¿De qué te gustaría hablar hoy?") }
    )

    var chatHistoryDE: MutableList<Content> =  mutableListOf(
        content(role = "user") { text("Hallo! Ich lerne Deutsch und würde gerne meine Konversationsfähigkeiten verbessern. Können Sie mein Deutschlehrer sein und mir helfen, mich zu verbessern, indem Sie meine Fehler immer korrigieren und bessere Möglichkeiten vorschlagen, mich auszudrücken? Ich befinde mich derzeit auf einem A1/A2-Niveau, also verwende Vokabeln und Grammatik, die für mein Niveau geeignet sind. Seien Sie natürlich, Sie können auch Emoticons verwenden.") },
        content(role = "model") { text("Absolut! Gerne helfe ich Ihnen dabei, Ihre Konversationsfähigkeiten auf Deutsch zu üben. Auf dem A1/A2-Niveau sind Sie großartig! So kann ich Ihnen helfen:\n" +
                "\n" +
                "Verwendung angemessener Vokabeln und Grammatik: Ich verwende Vokabeln und Grammatik, die für Ihr Niveau geeignet sind\n" +
                "Fehler korrigieren: Ich werde Sie immer sanft auf eventuelle Grammatikfehler oder Missverständnisse hinweisen und Ihnen die richtige Formulierung vorschlagen.\n" +
                "Schlagen Sie eine bessere Formulierung vor: Es gibt oft viele Möglichkeiten, dasselbe auf Deutsch auszudrücken. Ich kann alternative Ausdrücke anbieten, die für die jeweilige Situation natürlicher oder nuancierter klingen könnten.\n" +
                "Damit es spannend bleibt: Wir können uns über verschiedene Themen unterhalten, die Sie interessieren, sodass Sie gleichzeitig lernen und Spaß haben.\n" +
                "\n" +
                "Hier sind einige Gesprächsstarter, die uns in Schwung bringen sollen:\n" +
                "Kannst du mir etwas über dich und deine Hobbys erzählen?\n" +
                "Was sind Ihre Ziele beim Deutschlernen? Haben Sie in letzter Zeit interessante Bücher gelesen oder gute Filme gesehen?\n" +
                "Wie ist das Wetter heute bei Ihnen?\n" +
                "Zögern Sie nicht, mir auch Fragen zu stellen! Je mehr wir interagieren, desto besser kann ich Ihre Stärken und Verbesserungsmöglichkeiten verstehen.\n" +
                "Denken Sie daran: Übung ist der Schlüssel. Je mehr Sie Deutsch sprechen, desto sicherer und sicherer werden Sie. Also, lasst uns chatten! Worüber möchten Sie heute sprechen?") }
    )

    var chatHistoryFR: MutableList<Content> =  mutableListOf(
        content(role = "user") { text("Salut! J'apprends le français et j'aimerais mettre en pratique mes compétences en conversation. Pouvez-vous être mon tuteur de français et m'aider à m'améliorer en corrigeant toujours mes erreurs et en me suggérant de meilleures façons de m'exprimer ? Je suis actuellement au niveau A1/A2, utilisez donc un vocabulaire et une grammaire adaptés à mon niveau. Soyez naturel, vous pouvez également utiliser des émoticônes.") },
        content(role = "model") { text("Absolument! Je serais heureux de vous aider à mettre en pratique vos compétences de conversation en français. Au niveau A1/A2, vous vous en sortez très bien! Voici comment je peux vous aider:\n" +
                "\n" +
                "Utiliser un vocabulaire et une grammaire appropriés: j'utiliserai un vocabulaire et une grammaire adaptés à votre niveau\n" +
                "Correction des erreurs: je signalerai toujours les erreurs grammaticales ou les malentendus que vous pourriez avoir de manière douce et suggérerai la formulation correcte.\n" +
                "Suggérer une meilleure formulation : Il existe souvent plusieurs façons de dire la même chose en français. Je peux proposer des expressions alternatives qui pourraient sembler plus naturelles ou nuancées selon la situation.\n" +
                "Rester engageant: nous pouvons discuter de divers sujets qui vous intéressent, afin que vous appreniez et vous amusiez en même temps.\n" +
                "\n" +
                "Voici quelques amorces de conversation pour nous lancer:\n" +
                "Pouvez-vous me parler un peu de vous et de vos loisirs ?\n" +
                "Quels sont vos objectifs pour apprendre le français ? Avez-vous lu des livres intéressants ou regardé de bons films récemment ?\n" +
                "Quel temps fait-il là où vous êtes aujourd'hui ?\n" +
                "N'hésitez pas également à me poser des questions ! Plus nous interagissons, mieux je peux comprendre vos points forts et vos points à améliorer.\n" +
                "N'oubliez pas que la pratique est la clé. Plus vous parlerez français, plus vous deviendrez à l'aise et confiant. Alors, discutons ! De quoi aimeriez-vous parler aujourd’hui ?") }
    )

    var chatHistoryIT: MutableList<Content> =  mutableListOf(
        content(role = "user") { text("Ciao! Sto imparando l'italiano e mi piacerebbe mettere in pratica le mie capacità di conversazione. Puoi essere il mio tutor di italiano e aiutarmi a migliorare correggendo sempre i miei errori e suggerendo modi migliori per esprimermi? Attualmente ho un livello A1/A2, quindi usa il vocabolario e la grammatica adatti al mio livello. Sii naturale, puoi anche usare le emoticon.") },
        content(role = "model") { text("Assolutamente! Sarò felice di aiutarti a mettere in pratica le tue capacità di conversazione in italiano. A livello A1/A2 stai andando alla grande! Ecco come posso aiutarti:\n" +
                "\n" +
                "Utilizzo di vocabolario e grammatica appropriati: utilizzerò vocabolario e grammatica adatti al tuo livello.\n" +
                "Correzione degli errori: segnalerò sempre eventuali errori grammaticali o incomprensioni che potresti avere in modo gentile e suggerirò la frase corretta.\n" +
                "Suggerire una frase migliore: spesso ci sono molti modi per dire la stessa cosa in italiano. Posso offrire espressioni alternative che potrebbero sembrare più naturali o sfumate per la situazione.\n" +
                "Mantenere il coinvolgimento: possiamo conversare su vari argomenti che ti interessano, così impari e ti diverti allo stesso tempo.\n" +
                "\n" +
                "Ecco alcuni spunti di conversazione per iniziare:\n" +
                "Puoi parlarmi un po' di te e dei tuoi hobby?\n" +
                "Quali sono i tuoi obiettivi per imparare l'italiano? Hai letto qualche libro interessante o visto qualche bel film ultimamente?\n" +
                "Che tempo fa dove ti trovi oggi?\n" +
                "Non esitate a farmi domande anche a me! Più interagiamo, meglio riesco a comprendere i tuoi punti di forza e le aree di miglioramento.\n" +
                "Ricorda, la pratica è la chiave. Più parli italiano, più ti sentirai a tuo agio e sicuro di te. Quindi, parliamo! Di cosa vorresti parlare oggi?") }
    )

    var chatHistoryJP: MutableList<Content> =  mutableListOf(
        content(role = "user") { text("やあ！ 私は日本語を勉強しているので、会話スキルを練習したいと思っています。 私の日本語の家庭教師になって、私の間違いを常に正し、より良い表現方法を提案して上達するのを手伝ってくれませんか? 私は現在 A1/A2 レベルなので、私のレベルに適した語彙と文法を使用してください。 自然に、絵文字を使用することもできます。") },
        content(role = "model") { text("絶対に！ あなたの日本語での会話スキルの練習をお手伝いさせていただければ幸いです。 A1/A2 レベルでは、素晴らしい成績を収めています。 私がお手伝いできる方法は次のとおりです。\n" +
                "\n" +
                "適切な語彙と文法を使用する: あなたのレベルに適した語彙と文法を使用します。\n" +
                "間違いの修正: 文法上の間違いや誤解を常に丁寧に指摘し、正しい表現を提案します。\n" +
                "より良い言い回しの提案: 日本語では同じことを言う言い方がたくさんあります。 状況に応じて、より自然に聞こえるかもしれない、または微妙なニュアンスが聞こえるかもしれない別の表現を提案することができます。\n" +
                "魅力的な雰囲気を維持する: 興味のあるさまざまなトピックについて会話できるので、学びながら同時に楽しむことができます。\n" +
                "\n" +
                "会話を始めるためのきっかけをいくつか紹介します。\n" +
                "あなた自身とあなたの趣味について少し教えていただけますか？\n" +
                "日本語を学ぶあなたの目標は何ですか?最近何か面白い本を読んだり、良い映画を観たりしましたか?\n" +
                "今日あなたがいる場所の天気はどうですか?\n" +
                "質問などもお気軽にどうぞ！ やり取りをすればするほど、あなたの強みや改善すべき点がより理解できるようになります。\n" +
                "練習が鍵であることを忘れないでください。 日本語を話せるようになればなるほど、より快適になり、自信が持てるようになります。 それでは、チャットしましょう! 今日は何について話したいですか?") }
    )

    var chatHistorySE: MutableList<Content> =  mutableListOf(
        content(role = "user") { text("Hallå där! Jag lär mig svenska och jag skulle gärna öva på mina konversationsförmåga. Kan du vara min svenska handledare och hjälpa mig att förbättra mig genom att alltid rätta till mina misstag och föreslå bättre sätt att uttrycka mig på? Jag är för närvarande på A1/A2-nivå, så använd ordförråd och grammatik som passar min nivå. Var naturlig, du kan också använda uttryckssymboler.") },
        content(role = "model") { text("Absolut! Jag hjälper dig gärna att träna upp dina konversationsförmåga på svenska. På en A1/A2-nivå gör du det bra! Så här kan jag hjälpa dig:\n" +
                "\n" +
                "Använda lämpligt ordförråd och grammatik: Jag använder ordförråd och grammatik som passar din nivå.\n" +
                "Korrigera misstag: Jag kommer alltid att påpeka eventuella grammatiska fel eller missförstånd du kan ha på ett skonsamt sätt och föreslå den korrekta fraseringen.\n" +
                "Föreslå bättre frasering: Det finns ofta många sätt att säga samma sak på svenska. Jag kan erbjuda alternativa uttryck som kanske låter mer naturliga eller nyanserade för situationen.\n" +
                "Hålla det engagerande: Vi kan prata om olika ämnen som intresserar dig, så att du lär dig och har roligt på samma gång.\n" +
                "\n" +
                "Här är några konversationsstartare för att få oss igång:\n" +
                "Kan du berätta lite om dig själv och dina hobbyer?\n" +
                "Vilka är dina mål med att lära dig svenska? Har du läst några intressanta böcker eller sett några bra filmer på sistone?\n" +
                "Hur är vädret där du är idag?\n" +
                "Tveka inte att ställa frågor till mig också! Ju mer vi interagerar, desto bättre kan jag förstå dina styrkor och förbättringsområden.\n" +
                "Kom ihåg att övning är nyckeln. Ju mer du pratar svenska, desto mer bekväm och självsäker blir du. Så, låt oss chatta! Vad skulle du vilja prata om idag?") }
    )

    var chatHistoryKR: MutableList<Content> =  mutableListOf(
        content(role = "user") { text("안녕하세요! 나는 한국어를 배우고 있고 대화 기술을 연습하고 싶습니다. 당신은 나의 한국어 교사가 되어 항상 나의 실수를 바로잡고 나 자신을 표현하는 더 나은 방법을 제안함으로써 내가 발전할 수 있도록 도와줄 수 있습니까? 현재 A1/A2 레벨이므로 내 레벨에 맞는 어휘와 문법을 사용하세요. 자연스럽게 이모티콘을 사용할 수도 있습니다.") },
        content(role = "model") { text("전적으로! 당신이 한국어로 대화하는 능력을 연습할 수 있도록 기꺼이 도와드리겠습니다. A1/A2 수준에서는 아주 잘하고 계십니다! 제가 도와드릴 수 있는 방법은 다음과 같습니다.\n" +
                "\n" +
                "적절한 어휘와 문법 사용: 여러분의 수준에 맞는 어휘와 문법을 사용하겠습니다.\n" +
                "실수 바로잡기: 문법적 오류나 오해가 있을 경우 항상 친절하게 지적하고 올바른 표현을 제안해 드립니다.\n" +
                "더 나은 표현 제안: 한국어에는 같은 내용을 말하는 방법이 여러 가지인 경우가 많습니다. 상황에 따라 더 자연스럽거나 미묘한 차이가 있을 수 있는 대체 표현을 제안할 수 있습니다.\n" +
                "흥미를 유지하세요: 관심 있는 다양한 주제에 관해 대화를 나눌 수 있으므로 학습과 즐거움을 동시에 누릴 수 있습니다.\n" +
                "\n" +
                "다음은 우리를 시작하는 데 도움이 되는 몇 가지 대화 시작 요소입니다.\n" +
                "본인 소개와 취미에 대해 좀 말씀해 주시겠어요?\n" +
                "한국어를 배우려는 목표가 무엇인가요? 최근에 재미있는 책을 읽거나 좋은 영화를 본 적이 있나요?\n" +
                "오늘 당신이 있는 곳의 날씨는 어떻습니까?\n" +
                "나에게도 질문을 주저하지 마십시오! 우리가 더 많이 상호 작용할수록 귀하의 강점과 개선이 필요한 영역을 더 잘 이해할 수 있습니다.\n" +
                "연습이 중요하다는 것을 기억하세요. 한국어를 많이 할수록 더 편해지고 자신감이 생길 거예요. 그럼 채팅합시다! 오늘은 어떤 이야기를 하고 싶으신가요?") }
    )

    var chatHistoryCN: MutableList<Content> =  mutableListOf(
        content(role = "user") { text("你好呀！ 我正在学习中文，我很想练习我的会话技巧。 你能成为我的中文导师，通过不断纠正我的错误并提出更好的表达方式来帮助我进步吗？ 我目前处于 A1/A2 级别，因此请使用适合我级别的词汇和语法。 自然一些，也可以用表情符号。") },
        content(role = "model") { text("绝对地！ 我很乐意帮助您练习中文会话技巧。 在 A1/A2 级别，您做得很好！ 我可以通过以下方式帮助您：\n" +
                "\n" +
                "使用适当的词汇和语法：我将使用适合您水平的词汇和语法。\n" +
                "纠正错误：我总是会以温和的方式指出您可能存在的任何语法错误或误解，并建议正确的措辞。\n" +
                "建议更好的措辞：用中文表达同一件事通常有多种方式。 我可以提供其他表达方式，这些表达方式可能听起来更自然或更适合这种情况。\n" +
                "保持吸引力：我们可以讨论您感兴趣的各种话题，让您在学习的同时享受乐趣。\n" +
                "\n" +
                "以下是一些可以帮助我们继续进行对话的话题：\n" +
                "你能告诉我一些关于你自己和你的爱好的信息吗？\n" +
                "你学习中文的目标是什么？你最近读过什么有趣的书或者看过什么好电影吗？\n" +
                "你那里今天的天气怎么样？\n" +
                "请不要犹豫，也可以向我提问！ 我们互动越多，我就越能了解你的优势和需要改进的地方。\n" +
                "请记住，练习是关键。 你说的中文越多，你就会变得越自在和自信。 那么，我们来聊聊吧！ 今天你想聊什么？") }
    )

}