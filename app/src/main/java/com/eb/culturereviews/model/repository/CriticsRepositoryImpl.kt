package com.eb.culturereviews.model.repository

import com.eb.culturereviews.model.Review

class ReviewsRepositoryImpl : ReviewsRepository {

    private val mockReviewsList = listOf(
        Review(
            reviewName = "Julia & Julia",
            point = 8,
            userName = "edaisik",
            type = "movie",
            reviewText =
            "Netflix'te rastgele film araştırıp izlediğim bir sürü filmden birisi. Benzer şekilde hayatlarında yemek ile değişiklik yapmaya çalışan farklı zamanlarda yaşamış Julia ve Julie'nin hikayesi. Julia eşinin göreve atanmasından sonra Fransa'ya gittiklerinde evde durup hiçbir şey yapmamaktan sıkılıyor ve aşçılık kursuna gidiyor. Ardından da bir yemek tarifleri kitabı yazma macerasına atılıyor. Julie ise pek iyi gitmeyen işinde bunaldığı için ekstra uğraşlar arıyor kendine. Bunun sonunca da yıllar önce Julia tarafından yazılmış yemek tariflerini deneyip yorumladığı bir blog oluşturuyor.\n" +
                    "Epey sıcak bir filmdi Julie & Julia. Özellikle Julie karakteri çok sevimliydi, hayata tutunma çabası izlemeye değerdi. İki karakterin de hayatlarını, yaşadıkları zorlukları izliyorduk. \n" +
                    "Her şey güzel giderken filmde Julie'nin artık yaşlanmış olan Julia'ya ulaşması ama bu fikrinin çok kötü bulunması biraz hayal kırıklığı oluşturdu bende. İzlerken hep Julia'nın da bu fikirden hoşlanacağını düşünmüştüm nedense. Gerçek bir hikayeden alınan bu filmi izlemesi keyifliydi ve düşündürdü,  harekete geçmeye itti beni yer yer. Mükemmel değildi ama kesinlikle güzel bir filmdi."
        ),
        Review(
            reviewName = "Gergedan",
            point = 7,
            userName = "edaisik",
            type = "book",
            reviewText = "Yazarı Mine Söğüt Kitap Kulübümüze söyleşiye geleceği için okuduğum bir kitaptı Gergedan. Yaklaşık 40-50 sayfa boyunca öykülerden oluştuğunu anlayamadım, çok farklı bir üslubu var yazarın. Sanki her şeyi birbirine bağlayarak yazıyor gibi.\n" +
                    "Anladığım kadarıyla Gergedan çok da tutulan bir kitap olmamış. Ben de söyleşi bahanesi ile okumasam alıp okur muydum, bunu da bilmiyorum açıkçası. Mine Söğüt'ten okuduğum ilk kitap olmasının da etkisi olsa gerek, bir türlü alışamadım kitaba. \n" +
                    "Fazla şahsına münhasır birçok öyküden oluşan Gergedan'ın olumlu görülebilecek özelliği ise kolay okunabilir olması. Çok da sevemesem de bir çırpıda okuyup bitirdim.\n" +
                    "Absürt şeyleri okumayı seven arkadaşlarıma önermek isterim bu kitabı ama önşart olarak Mine Söğüt'ten bir okuma yapmış olması gerektiği fikrimi de sunarım. Çünkü, belki de yazarın kalemine alışkınken okusam daha çok sevecektim."
        ),
        Review(
            reviewName = "Başkalarının Tanrısı",
            point = 7,
            userName = "edaisik",
            type = "book",
            reviewText = "Mine Söğüt'ün söyleşisine kulüpçe hazırlanmak adına okuyup tartıştık bu kitabı. Anketsiz okuyoruz diyerek sunduğumuz ilk kitap oldu, sebebi de son kitabını okuyup yazarı da en taze işiyle tanımak istememizdi.\n" +
                    "Başkalarının Tanrısı yanından geçip gittiklerimizi anlatıyor. Sokakta aslında gördüğümüz ama dikkatimizi çekmeyen sokak insanları. Evini ve düzenli hayatını bir anda terkedip sokaklarda yaşamaya başlayan Musa, sevdiği adam onu erkeklere sattığı için bir gün \"Belki artık satamaz beni.\" diye düşünerek bacaklarını kesen Efsun Abla, hafızasını yitirmiş ne yaptığını kim olduğunu bilmeyen Adnan Abi, hayat kadınlığı yaparak hayatını sürdüren ve bu durumdan hoşnut olmayan Hülya ve son olarak sokakta terk edilmiş ve ölmek üzereyken bulup yanlarına aldıkları bebek Matruşka. Bu beş kişiyi yazmış Mine Söğüt. Biz de bu beş kişiyi okuyup onları düşünüyoruz.\n" +
                    "Fikir olarak çok güzeldi bence Başkalarının Tanrısı. Arka kapak yazısını okuduğumda etkilendiğimi rahatlıkla söyleyebilirim. Burada bahsetmeyeceğim ama sonu ise tam bir hayal kırıklığıydı. Tüm okuduğum sayfaları boşuna okumuşum gibi hissettirdi hatta bir anlık. \n" +
                    "Mine Söğüt'ten okuduğum ilk romandı ve yeterince beğendim sonu dışında. Diğer kitaplarına da şans vermeyi düşünüyorum ilerleyen zamanlarda."
        ),
        Review(
            reviewName = "Bir Tatlı Kaşığı Çamur",
            point = 8,
            userName = "edaisik",
            type = "theatre",
            reviewText = "Kulübümüzün hesabına gelen tanıtım mesajından sonra bize sağladıkları indirim ile gittik Bir Tatlı Kaşığı Çamur'a. Ne çıkacağını bilmeden yüksek meblağda bir ücret ödeyerek gittiğim ve hatta arkadaşlarımı da ısrarımla ikna ettiğim için biraz gergindim izlemeden önce. Diğerleri ne düşündü tam olarak bilmiyorum ama ben keyif aldım bu oyundan.\n" +
                    "Net bir olay örgüsünde değildi oyun. Mutfağına hapsolmuş bir kadının röportajı gibiydi diye özetlenebilir. Bir röportajda sorular soruluyor dış ses tarafından ve soruları izlediğimiz iki karakter bize sunuyor. Hep etrafındakileri memnun etmeye çalışan, kendine vakit ayıramayan, kendi memnuniyetini olabildiğince arka plana atmış bir kadının anlattıklarını izledik de denebilir. \n" +
                    "Aslında bu oyundaki kadını hepimiz tanıyoruz. Belki annemiz, belki ananemiz, belki bir komşumuz ama özellikle bizim toplumumuzda bu durumları yaşayan çok fazla kadın olduğuna inanıyorum. Bu açıdan oyun çok güzeldi bize tekrar bunu hatırlattığı için. Ama bu konsept oyunlarda, sinemalarda çok sık karşılaştığımız bir öge haline geldi şu an, tekrara düşülüyor artık ortaya çıkan eserlerde.\n" +
                    "Taze kurulmuştu oyunun sahibi Nushu Tiyatro, aldığımız biletlerle destek olabilmiş olmayı dilerim. Herkese tavsiye etmem belki ama benim sevdiğim sıkılmadan izlediğim bir oyundu."
        ),
        Review(
            reviewName = "Hamlet",
            point = 10,
            userName = "edaisik",
            type = "theatre",
            reviewText = "Shakespeare'in belki de en meşhur oyunu Hamlet. Yaklaşık 3 saat süren ama tek bir an bile sıkmayan şahane bir iş olmuş. Asıl metnini okumadığım için karşılaştırmaya giremeyeceğim ama benim Hamlet'ten beklediğimi verdi bu oyun bana. İstanbul Şehir Tiyatrosu'ndan Sadabat Sahnesi'nde izlediğim oyun, oyuncusuyla rejisiyle, dekoruyla çok güzeldi. \n" +
                    "Kral babasının ölümünden hemen sonra amcası ile evlenen annesine çok içerleyen ve babasını amcasının öldürdüğüne inanan Hamlet çok öfkeliydi oyunun her anında. Gerçekleri ortaya çıkarmak ve intikam almak için yanıp tutuşuyordu.\n" +
                    "Gerçekler hiçbir zaman açıklanmadı ama seyirci kesinlikle Hamlet'in haklılığına inandırılıyor tabii ki. Amcası hakkında türlü suçlamalarla Hamlet'i sürgüne gönderip orada öldürülmesini emrediyor hatta ama boşa çıkıyor çabaları.\n" +
                    "Shakespeare'den beklenildiği üzere 8-10 tane ölü çıktı bu oyundan da. Biraz olsun alışkın olan birisi şaşırmaz bu sayılara ama ben hala eğleniyorum sinek avlar gibi karakter öldürüşüne Shakespeare'nin.\n" +
                    "Yazımda bahsetmek istediğim önemli bir nokta ise yan karakterlerden biri olan Ophelia'nın ne kadar başarılı canlandırıldığı. Hamlet'in oyunculuğu çok güzeldi, tiratları da hep konuşulur ama Ophelia'yı ben ayrıca çok beğendim. Delirmesi, korkması, hislerini saklamaya çalışması her an çok başarılıydı. Takdiri fazlasıyla hak ediyordu canlandıran oyuncu Zeliha Bahar Çebi.\n" +
                    "İzlemeyenlere içim çok rahat bir şekilde önereceğim bir oyun oldu İstanbul Şehir Tiyatroları'nın bu Hamlet uyarlaması. "
        ),
        Review(
            reviewName = "Beş Sevim Apartmanı",
            point = 9,
            userName = "edaisik",
            type = "book",
            reviewText = "Mine Söğüt kulübümüze söyleşiye geleceğinden kendisini tanıyabilmek ve gelmişken imzasını da alabilmek için alıp okuduğum kitaplardan biri: Beş Sevim Apartmanı. \n" +
                    "Bir roman Beş Sevim Apartmanı. Beş katında beş farklı akıl hastasının yaşadığı bir apartmanı anlatıyor. Doktor Samimi kimi kimsesi olmayan bu hastaları gizlice akıl hastanesinden bir bir apartmana kaçırmış ve böylece romanımızın iskelet kurgusu oluşmuş oluyor.\n" +
                    "Tam olarak roman denebilir mi bu kitaba ondan da emin değilim aslında. Bölümlere ayırmış Mine Söğüt anlatacaklarını ama her bölümde yeni birinin hikayesine geçiş yapıyor, bu nedenle öykü kitabı okuyormuş hissiyatı da veriyor okura. İlk bölümlerde Doktor Samimi'nin hikayesini ve apartmanın isminin hikayesini okuyoruz, devam eden bölümlerde ise bu beş akıl hastası karakterimizin yaşadıklarını sandıklarını ve asıl yaşadıkları olayları.\n" +
                    "Her karakteri yaşadığı dairenin perdesinin rengiyle tanımlamıştı yazar bölüm başlarında. Renklerin temsil ettiği şeyler var mıydı bilemiyorum ama değişik bir yaklaşımdı bence. Hastaların akıllarından geçenler ve asıl yaşadıkları hikayelerin birbirinden bu kadar uzak oluşu da ilginçti. Kitap kendimi çok fazla sorgulamama sebep oldu bu özellikleriyle. \n" +
                    "Kitapta ne gerçek ne hayal onu bile anlayamıyordum bazen. Ama tam da bu özelliğiyle çok çekti beni. Satır aralarına iliştirilmiş rüya tabirleri kitabı hem ilgi çekici hem de zaman zaman ürkütücü hale getirmişti. Yatmadan hemen önce kitap okumayı çok seven bir okur olarak beni ürperttiği için geceleri bu kitabı okumaktan mümkün oldukça uzak durdum. Bir bütün olarak bakarsam da kitabı gerçekten beğendiğimi söyleyebilirim. Mine Söğüt'ten okuduğum ikinci kitaptı ve aslında kaleminin ne kadar farklı olduğunu bir kez daha görmüş oldum böylece. Kendisinin farklı kitaplarına da şans verme isteği uyandırdı bende Beş Sevim Apartmanı."
        ),
        Review(
            reviewName = "Uçurtmanın Kuyruğu",
            point = 10,
            userName = "edaisik",
            type = "theatre",
            reviewText = "Uçurtmanın Kuyruğu, babasının katı kuralcılığı yüzünden çocukluğunu tam olarak yaşayamamış ve kendisi de bu kuralların içine sıkışıp kalmış bir adamın iç hesaplaşmasını anlatıyor. İntihar mektubunu yazmış, intiharına hazırlanırken kapısı çalınıyor ve tanımadığı birisi geliyor içeriye. Bu iki kişinin diyaloglarını izliyoruz iki perde boyunca.\n" +
                    "Aslında kendisi bu kuralların dışına çıkmak istese de babasının yüzünden asla bunu yapamamış bu adam, babasının ölümü üzerinden 8 sene geçmiş de olsa hala hapsolduğu sıkışık otoriteden kaçamıyor. Eve gelen misafir ise onu ondan daha iyi tanıyor gibi, karanlık kuytularda kalan tüm travmalarını konuşuyor adamla. Her an takım elbise ile dolaşması, kitap okumaması, dans etmemesi... \n" +
                    "Oyun sadece iki kişi ile canlandırılmış da olsa hiç sıkmayan bir yapısı vardı. Ebeveynlerin hayatımızı nasıl etkiyebileceğini yine gördük burada. Gün Koper ve Ali Yoğurtçuoğlu rollerine çok hakimdiler. İzleyiciye de geçiyordu profesyonellikleri. \n" +
                    "Ayrıca bahsetmek istediğim bir şey ise sahnede dekorların yerleşimiydi. Bir oda hayal ettirilmek istenmiş, baş karakterimizin babasından kalan evi. Ama intihar etmeyi düşünen karakterimizin sıkışmışlığını gösterircesine çarpıktı dekorlar. Duvarlar içe dönük şekilde konumlandırılmıştı. Dekorun bile başlı başına seyirciye hissettirebildikleri çok önemliydi. \n" +
                    "Hem güldüren hem duygulandıran hem de çokça düşündüren bu oyunu çok sevdim ben. Gittiğim en iyi oyunlar rafına kaldırdım zihnimin."
        )
    )

    override suspend fun getReviewsList(): List<Review> {
        return mockReviewsList
    }

}