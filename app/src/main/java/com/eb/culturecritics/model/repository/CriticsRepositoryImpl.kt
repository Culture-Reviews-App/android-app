package com.eb.culturecritics.model.repository

import com.eb.culturecritics.model.Critic

class CriticsRepositoryImpl : CriticsRepository {

    private val mockCriticsList = listOf(
        Critic(
            criticName = "Julia & Julia",
            point = 8,
            userName = "edaisik",
            type = "movie",
            criticText =
            "Netflix'te rastgele film araştırıp izlediğim bir sürü filmden birisi. Benzer şekilde hayatlarında yemek ile değişiklik yapmaya çalışan farklı zamanlarda yaşamış Julia ve Julie'nin hikayesi. Julia eşinin göreve atanmasından sonra Fransa'ya gittiklerinde evde durup hiçbir şey yapmamaktan sıkılıyor ve aşçılık kursuna gidiyor. Ardından da bir yemek tarifleri kitabı yazma macerasına atılıyor. Julie ise pek iyi gitmeyen işinde bunaldığı için ekstra uğraşlar arıyor kendine. Bunun sonunca da yıllar önce Julia tarafından yazılmış yemek tariflerini deneyip yorumladığı bir blog oluşturuyor.\n" +
                    "Epey sıcak bir filmdi Julie & Julia. Özellikle Julie karakteri çok sevimliydi, hayata tutunma çabası izlemeye değerdi. İki karakterin de hayatlarını, yaşadıkları zorlukları izliyorduk. \n" +
                    "Her şey güzel giderken filmde Julie'nin artık yaşlanmış olan Julia'ya ulaşması ama bu fikrinin çok kötü bulunması biraz hayal kırıklığı oluşturdu bende. İzlerken hep Julia'nın da bu fikirden hoşlanacağını düşünmüştüm nedense. Gerçek bir hikayeden alınan bu filmi izlemesi keyifliydi ve düşündürdü,  harekete geçmeye itti beni yer yer. Mükemmel değildi ama kesinlikle güzel bir filmdi."
        ),
        Critic(
            criticName = "Gergedan",
            point = 7,
            userName = "edaisik",
            type = "book",
            criticText = "Yazarı Mine Söğüt Kitap Kulübümüze söyleşiye geleceği için okuduğum bir kitaptı Gergedan. Yaklaşık 40-50 sayfa boyunca öykülerden oluştuğunu anlayamadım, çok farklı bir üslubu var yazarın. Sanki her şeyi birbirine bağlayarak yazıyor gibi.\n" +
                    "Anladığım kadarıyla Gergedan çok da tutulan bir kitap olmamış. Ben de söyleşi bahanesi ile okumasam alıp okur muydum, bunu da bilmiyorum açıkçası. Mine Söğüt'ten okuduğum ilk kitap olmasının da etkisi olsa gerek, bir türlü alışamadım kitaba. \n" +
                    "Fazla şahsına münhasır birçok öyküden oluşan Gergedan'ın olumlu görülebilecek özelliği ise kolay okunabilir olması. Çok da sevemesem de bir çırpıda okuyup bitirdim.\n" +
                    "Absürt şeyleri okumayı seven arkadaşlarıma önermek isterim bu kitabı ama önşart olarak Mine Söğüt'ten bir okuma yapmış olması gerektiği fikrimi de sunarım. Çünkü, belki de yazarın kalemine alışkınken okusam daha çok sevecektim."
        ),
        Critic(
            criticName = "Başkalarının Tanrısı",
            point = 7,
            userName = "edaisik",
            type = "movie",
            criticText = "Mine Söğüt'ün söyleşisine kulüpçe hazırlanmak adına okuyup tartıştık bu kitabı. Anketsiz okuyoruz diyerek sunduğumuz ilk kitap oldu, sebebi de son kitabını okuyup yazarı da en taze işiyle tanımak istememizdi.\n" +
                    "Başkalarının Tanrısı yanından geçip gittiklerimizi anlatıyor. Sokakta aslında gördüğümüz ama dikkatimizi çekmeyen sokak insanları. Evini ve düzenli hayatını bir anda terkedip sokaklarda yaşamaya başlayan Musa, sevdiği adam onu erkeklere sattığı için bir gün \"Belki artık satamaz beni.\" diye düşünerek bacaklarını kesen Efsun Abla, hafızasını yitirmiş ne yaptığını kim olduğunu bilmeyen Adnan Abi, hayat kadınlığı yaparak hayatını sürdüren ve bu durumdan hoşnut olmayan Hülya ve son olarak sokakta terk edilmiş ve ölmek üzereyken bulup yanlarına aldıkları bebek Matruşka. Bu beş kişiyi yazmış Mine Söğüt. Biz de bu beş kişiyi okuyup onları düşünüyoruz.\n" +
                    "Fikir olarak çok güzeldi bence Başkalarının Tanrısı. Arka kapak yazısını okuduğumda etkilendiğimi rahatlıkla söyleyebilirim. Burada bahsetmeyeceğim ama sonu ise tam bir hayal kırıklığıydı. Tüm okuduğum sayfaları boşuna okumuşum gibi hissettirdi hatta bir anlık. \n" +
                    "Mine Söğüt'ten okuduğum ilk romandı ve yeterince beğendim sonu dışında. Diğer kitaplarına da şans vermeyi düşünüyorum ilerleyen zamanlarda."
        ),
        Critic(
            criticName = "Bir Tatlı Kaşığı Çamur",
            point = 8,
            userName = "edaisik",
            type = "movie",
            criticText = "Kulübümüzün hesabına gelen tanıtım mesajından sonra bize sağladıkları indirim ile gittik Bir Tatlı Kaşığı Çamur'a. Ne çıkacağını bilmeden yüksek meblağda bir ücret ödeyerek gittiğim ve hatta arkadaşlarımı da ısrarımla ikna ettiğim için biraz gergindim izlemeden önce. Diğerleri ne düşündü tam olarak bilmiyorum ama ben keyif aldım bu oyundan.\n" +
                    "Net bir olay örgüsünde değildi oyun. Mutfağına hapsolmuş bir kadının röportajı gibiydi diye özetlenebilir. Bir röportajda sorular soruluyor dış ses tarafından ve soruları izlediğimiz iki karakter bize sunuyor. Hep etrafındakileri memnun etmeye çalışan, kendine vakit ayıramayan, kendi memnuniyetini olabildiğince arka plana atmış bir kadının anlattıklarını izledik de denebilir. \n" +
                    "Aslında bu oyundaki kadını hepimiz tanıyoruz. Belki annemiz, belki ananemiz, belki bir komşumuz ama özellikle bizim toplumumuzda bu durumları yaşayan çok fazla kadın olduğuna inanıyorum. Bu açıdan oyun çok güzeldi bize tekrar bunu hatırlattığı için. Ama bu konsept oyunlarda, sinemalarda çok sık karşılaştığımız bir öge haline geldi şu an, tekrara düşülüyor artık ortaya çıkan eserlerde.\n" +
                    "Taze kurulmuştu oyunun sahibi Nushu Tiyatro, aldığımız biletlerle destek olabilmiş olmayı dilerim. Herkese tavsiye etmem belki ama benim sevdiğim sıkılmadan izlediğim bir oyundu."
        ),
        Critic(
            criticName = "Hamlet",
            point = 10,
            userName = "edaisik",
            type = "movie",
            criticText = "Shakespeare'in belki de en meşhur oyunu Hamlet. Yaklaşık 3 saat süren ama tek bir an bile sıkmayan şahane bir iş olmuş. Asıl metnini okumadığım için karşılaştırmaya giremeyeceğim ama benim Hamlet'ten beklediğimi verdi bu oyun bana. İstanbul Şehir Tiyatrosu'ndan Sadabat Sahnesi'nde izlediğim oyun, oyuncusuyla rejisiyle, dekoruyla çok güzeldi. \n" +
                    "Kral babasının ölümünden hemen sonra amcası ile evlenen annesine çok içerleyen ve babasını amcasının öldürdüğüne inanan Hamlet çok öfkeliydi oyunun her anında. Gerçekleri ortaya çıkarmak ve intikam almak için yanıp tutuşuyordu.\n" +
                    "Gerçekler hiçbir zaman açıklanmadı ama seyirci kesinlikle Hamlet'in haklılığına inandırılıyor tabii ki. Amcası hakkında türlü suçlamalarla Hamlet'i sürgüne gönderip orada öldürülmesini emrediyor hatta ama boşa çıkıyor çabaları.\n" +
                    "Shakespeare'den beklenildiği üzere 8-10 tane ölü çıktı bu oyundan da. Biraz olsun alışkın olan birisi şaşırmaz bu sayılara ama ben hala eğleniyorum sinek avlar gibi karakter öldürüşüne Shakespeare'nin.\n" +
                    "Yazımda bahsetmek istediğim önemli bir nokta ise yan karakterlerden biri olan Ophelia'nın ne kadar başarılı canlandırıldığı. Hamlet'in oyunculuğu çok güzeldi, tiratları da hep konuşulur ama Ophelia'yı ben ayrıca çok beğendim. Delirmesi, korkması, hislerini saklamaya çalışması her an çok başarılıydı. Takdiri fazlasıyla hak ediyordu canlandıran oyuncu Zeliha Bahar Çebi.\n" +
                    "İzlemeyenlere içim çok rahat bir şekilde önereceğim bir oyun oldu İstanbul Şehir Tiyatroları'nın bu Hamlet uyarlaması. "
        ),
    )

    override suspend fun getCriticsList(): List<Critic> {
        return mockCriticsList
    }

}