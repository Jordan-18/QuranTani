package com.example.qurantani

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.time.Instant

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Mengubah Nama dari actionBar
        val actionBar = supportActionBar
        actionBar!!.title = "QuranTani"


        val arrayList = ArrayList<Model>()

        arrayList.add(Model(
                "Anggur",
                "وَّعِنَبًا وَّقَضْبًاۙ",
                "dan anggur dan sayur-sayuran,",
                "Manfaat Anggur",
                "Hama Anggur",
                "Cara Penanaman Anggur",
                "Penanganan Hama Anggur",
                "Pencatatan Anggur",
                R.drawable.anggur))

        arrayList.add(Model(
                "Delima",
                "فِيْهِمَا فَاكِهَةٌ وَّنَخْلٌ وَّرُمَّانٌۚ",
                "Di dalam kedua surga itu ada buah-buahan, kurma dan delima.",
                "Manfaat Delima",
                "Hama Delima",
                "Cara Penanaman Delima",
                "Penanganan Hama Delima",
                "Pencatatan Delima",
                R.drawable.delima))

        arrayList.add(Model(
                "Jahe",
                "وَيُسْقَوْنَ فِيْهَا كَأْسًا كَانَ مِزَاجُهَا زَنْجَبِيْلًاۚ",
                "Dan di sana mereka diberi segelas minuman bercampur jahe.",
                "Manfaat Jahe",
                "Hama Jahe",
                "Cara Penanaman Jahe",
                "Penanganan Hama jahe",
                "Pencatatan Jahe",
                R.drawable.jahe))

        arrayList.add(Model(
                "Kurma",
                "وَهُزِّيْٓ اِلَيْكِ بِجِذْعِ النَّخْلَةِ تُسٰقِطْ عَلَيْكِ رُطَبًا جَنِيًّا ۖ",
                "Dan goyanglah pangkal pohon kurma itu ke arahmu, niscaya (pohon) itu akan menggugurkan buah kurma yang masak kepadamu.",
                "Manfaat Kurma",
                "Hama Kurma",
                "Cara Penanaman Kurma",
                "Penanganan Hama Kurma",
                "Pencatatan Kurma",
                R.drawable.kurma))

        arrayList.add(Model(
                "Tin",
                "وَالتِّيۡنِ وَالزَّيۡتُوۡنِۙ",
                "Demi (buah) Tin dan (buah) Zaitun,",
                "" +
                        "Obat Anemia \n \n" +
                        "Mengobati sulit buang air besar \n \n" +
                        "Membantu usaha penurunan berat badan \n \n" +
                        "Mengendalikan nafsu makan",
                "Diptera (Musca domestica dan Dolichopus acuminatus) \n \n" +
                        "Hymenoptera ( Oecophyla smaragdina, Lasius niger dan Solenopsis spp ) \n \n" +
                        "Coleoptera ( Batocera rufomaculata dan Epilachna spp. ) \n \n" +
                        "Orthoptera ( Oxya Chinensis )",
                "Lubang tanam di lahan berukuran 30 x 30 x 20 cm ( Panjang x Lebar x Dalam ) \n \n" +
                            "Lebih bagus ditanam pada tanah lempung serta berdrainase baik ( tanah yang tidak pernah terendam air ) \n \n" +
                            "A. Media tumbuh bebas dari jamur dan bakteri pathogen atau sejenis parasite lainnya \n \n" +
                            "B. Mencampur media tanam dengan tanah dari galian lubang + pupuk kendang + sekam padi ( jika ada ) \n \n" +
                            "C. Bibit Tin disiapkan dengan merobek/ menggunting polybag. Remahkan media tanam sebelumnya secara perlahan agar perakaran tidak rusak \n \n" +
                            "D. Lubang diisi dengan campuran media yang disiapkan, kemudian bibit tin dimasukkan dengan sedikit media sebelumnya \n \n" +
                            "E. seluruh lubang ditutup dengan sisa campuran media ",
                "Penggunaan Insektisida Alami \n \n" +
                        "Penggunaan Jaring Tertutup ( Paranet ) \n \n" +
                        "Pemanfaatan Tanaman Kucai ( Tanaman sejenis bawang )",

                "Buah Tin dapat tumbuh pada iklim tropis dan sub tropis \n \n" +
                        "Penggunaan arang sekam lebih menguntungkan karena menyuburkan tanah \n \n" +
                        "Penyiraman tidak harus setiap hari, karena Tin menyukai tanah yang kering \n \n" +
                        "Pemupukan dengan pupuk NPK satu sendok the setiap 2 minggu sekali",
                R.drawable.tin))

        arrayList.add(Model(
                "Bawang",
                "وَاِذْ قُلْتُمْ يٰمُوْسٰى لَنْ نَّصْبِرَ عَلٰى طَعَامٍ وَّاحِدٍ فَادْعُ لَنَا رَبَّكَ يُخْرِجْ لَنَا مِمَّا تُنْۢبِتُ الْاَرْضُ مِنْۢ بَقْلِهَا وَقِثَّاۤىِٕهَا وَفُوْمِهَا وَعَدَسِهَا وَبَصَلِهَا ۗ",
                "Dan (ingatlah), ketika kamu berkata, “Wahai Musa! Kami tidak tahan hanya (makan) dengan satu macam makanan saja, maka mohonkanlah kepada Tuhanmu untuk kami, agar Dia memberi kami apa yang ditumbuhkan bumi, seperti: sayur-mayur, mentimun, bawang putih, kacang adas dan bawang merah.….",
                "Manfaat Bawang",
                "Hama Bawang",
                "Cara Penanaman Bawang",
                "Penanganan Hama Bawang",
                "Pencatatan Bawang",
                R.drawable.bawang))
        arrayList.add(Model(
                "Labu",
                " ۗ فَسَاهَمَ فَكَانَ مِنَ الْمُدْحَضِينَ (141)\n" +
                        " فَالْتَقَمَهُ الْحُوتُ وَهُوَ مُلِيمٌ (142)\n" +
                        " فَلَوْلا أَنَّهُ كَانَ مِنَ الْمُسَبِّحِينَ (143)\n" +
                        " لَلَبِثَ فِي بَطْنِهِ إِلَى يَوْمِ يُبْعَثُونَ (144)\n" +
                        "  فَنَبَذْنَاهُ بِالْعَرَاءِ وَهُوَ سَقِيمٌ (145)\n" +
                        "وَأَنْبَتْنَا عَلَيْهِ شَجَرَةً مِنْ يَقْطِينٍ(146)",
                "kemudian dia ikut diundi ternyata dia termasuk orang-orang yang kalah (dalam undian). (141)\n" +
                        "Maka dia ditelan oleh ikan besar dalam keadaan tercela.(142) \n " +
                        "Maka sekiranya dia tidak termasuk orang yang banyak berzikir (bertasbih) kepada Allah,(143) \n" +
                        "niscaya dia akan tetap tinggal di perut (ikan itu) sampai hari kebangkitan.(144) \n" +
                        "Kemudian Kami lemparkan dia ke daratan yang tandus, sedang dia dalam keadaan sakit.(145)\n" +
                        "Kemudian untuk dia Kami tumbuhkan sebatang pohon dari jenis labu.(146)",
                "Manfaatnya yang muda bisa di jadikan sayuran, sedangkan kulit buah masak yang telah di keringkan dapat digunakan sebagai botol, alat keperluan sehari-hari, hingga pipa. Daerah asal labu hingga saat ini masih diperdebatkan. Menurut satu sumber, labu berasal dari Afrika, sedangkan yang lainnya menyatakan bahwa labu berasal dari Asia.",
                "\tMentimun, labu mengandung cucurbitacins, unsur yang berpotensi racun. Unsur kimia ini dikenal memberi rasa pahit apabila berada dalam konsentrasi tinggi, dan diketahui dapat mengakibatkan kerusakan lambung. Bahkan pada beberapa kasus yang ekstrem seseorang bisa saja meninggal setelah minum jus labu.\n \n" +
                        "1.Busuk Daun \n " +
                        "\tGejala penyakit ini terlihat dari permukaan atas daun yaitu bercak-bercak kuning, sering agak bersudut karena dibatasi oleh tulang-tulang daun. Pada cuaca lembap pada sisi bawah bercak terdapat parang (cendawan) seperti bulu yang warnanya keunguan. \n \n" +
                        "\tPenyebab penyakit ini adalah Pseudoperonospora cubensis (Holliday, 1980), yang saat ini masih banyak disebut dengan nama Peronospora cubensis. Merupakan parasit obligat \n \n" +
                        "\tFaktor-faktor yang mempengaruhi penyakit dintaranya kelembapan dan akan berkembang hebat jika terdapat benyak kabut dan embun.\n \n" +
                        "2.Embun Tepung \n " +
                        "\tGejala yang ditimbulkan oleh penyakit ini adalah permukaan daun dan batang muda terdapat lapisan putih bertepung, yang terdiri atas miselium, konidiofor dan konidium cendawan penyebab penyakit. Bercak kemudian menjadi kering dan akhirnya mongering. Jika penyakit berat, daun dan batang muda dapat mati.\n \n" +
                        "\tPenyebab penyakit ini adalah Erysiphe cichoracearum, yang masih dikenal stadium tidak sempurnanya denagn naman Oidium tabaci. Konidiofor berbentuk tong (tabung), membentuk rantai-rantai berukurn lebih kurang 63,8 x 31,9 µm (Singh, 1969). \n \n" +
                        "\tPengelolaan penyakit ini dengan cara tanaman yang sakit parah dicabut dan dipendam untuk mengurangi sumber infeksi. Pengedalian gulma yang menjadi tumbuhan inang, penyemprotan dinokap atau penyerbukan belirang, atau menggunakan pestisida.\n \n \n" +
                        "3.Antraknos\n" +
                        "\tGejala yang pada daun umumnya bercak mulai dari tulang daun, yang meluas menjadi bercak coklat, bersudut-sudut atau agak bulat, garis tengahnya mencapai 1 cm atau bahkan dapat lebih. Daun yang masih berkembang dapat menjadi tidak rata. Beberapa bercak dapat bersatu dan dapat menyebabkan matinya seluruh daun. Bercak pada tangkai dan batang agak mengendap, memanjang berwarna coklat tua. Bercak pada buah muncul pada saat buah mulai masak. Di sini bercak berbentuk bulat, melekuk, tampak kebasah-basahan dan dapat sangat meluas.\n \n" +
                        "\tPenyakit ini disebabkan oleh Colletotrichum langenarium. Konidium hialin, bersel satu, jorong atau bulat telur, dengan ukuran 13-19 x 4-6 µm.\n \n" +
                        "\tPengelolaan dapat dilakukan dengan cara menanam benih yang sehat, mengadakan pergiliran tanaman, atau dengan penyemprotan fungisida\n \n \n" +
                        "4.Busuk Bunga \n" +
                        "\tGejala timbul sehabis berkembang mahkota bunga ditumbuhi oleh cendawan putih yang lebat, yang terutama terdiri dari konidiofor yang masih muda. “kepala-kepala” konidium berkembang dengan cepat, setelah masak berwarna hitam ungu, berkilat seperti logam.\n \n" +
                        "\tPenyebab penyakit ini adalah kapang Choanephora cucurbitarum, anggota dari suku Choanephoraceae. Cendawan membentuk koidium dan sporangiofor. Konidiofor tidak bercabang, mempunyai kepala yang bulat, dan muncul banyak kapitulum bulat membawa sterigma.\n \n \n" +
                        "5.Layu Bakteri\n" +
                        "\tGejala pertama dari penyakit ini adalah menjadi lemasnya satu daun. Kemudian lebih banyak lagi daun yang layu, sementara itu warnanya tetap hijau. Akhirnya kelayuan menjadi lebih parah, tanaman keriput dan mati. Bekteri menyumbat pembuluh-pembuluh kayu dalam batang\n \n" +
                        "\tPenyebab penyakit ini adalah bakteri Erwinia tracheiphila. Berbentuk batang, bergerak dengan 4-8 ulu cambuk peritrich. Bakteri membentuk kapsula, konidia berbentuk jala, kecil, bulat, halus, mengkilat, putih dan lekat. Bakteri dapat bertahan dalam badan kumbang mentimun, dan kumbang inilah yang memencarkan penyakit. Pengelolaan dilakukan dengan pengendalian kumbang mentimun.\n \n" +
                        "6.\tMosaik\n " +
                        "\tGejala pada tanaman sakit mempunyai daun-daun yang mempunyai belang hijau tua dan hiaju muda, dengan bermacam-macam corak. Bentuknya dapat berubah, berkerut, kerdil, atau tepinya menggulung ke bawah. Buah mengalami bercak-bercak hijau pucat atau putih, bersaling dengan bercak tua yang agak menonjol ke luar. Jika tanaman bertambah tua gambaran mosaik makin kabur. Ruas-ruas yang muda terhambat pertumbuhannya, sehingga daun-daun ujung membentuk roset.\n \n" +
                        "\tPenyebab mosaik mentimun adalah virus misaic mentimun (Cucumber Mosaic Virus, CMV) yang mempunyai banyak strain virus. Sifat fisik macammacam strain banayk persamaannya. Titik inaktivasi pemanasannya adalah 55-70 oC, dapat bertahan dalam sap tumbuhan sakit 1-10 hari\n \n" +
                        "\tVirus dapat ditularkan secara mekanis dengan gosokan, atau lebih dari 60 serangga, khususnya kutu-kutu daun secara non persisten, dan sering kali dapat terbawa olah biji. Penyakit mosaik mentimun sukar dikendalikan karena banyaknya tumbuhan inang virus. Untuk mengurangi penularan secara mekanik oleh manusia, diusahakan tidak memegang tanaman terlalu keras, khususnya tanaman-tanaman yang masih kecil atau dengan mencuci tangan.",
                "Cara Penanaman Labu",
                "Penanganan Hama Labu",
                "Yaqtin (lagenaria siceraria) termasuk kelompok labu-labuan (Cucurbitaceae) . Labu yang dikenal dengan berbagai nama, seperti clabash, bottlr gourd, opo squash, atau long melon, ditanam untuk dimanfaatkan buahnya, baik yang masih muda maupun yang sudah masak. Dalam Bahasa Arab, kata Yaqţīn mencakup semua tumbuhan tak bercabang (dalam artian seperti tumbuhan merambat), termasuk di dalamnya semangka dan mentimun.",
                R.drawable.labu))


        val MyAdapter = MyAdapter2(arrayList,this)

        Recycleview.layoutManager = LinearLayoutManager(this)
        Recycleview.adapter = MyAdapter

    }
}
