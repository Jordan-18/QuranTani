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
                "Manfaat Anggur",
                "Hama Anggur",
                "Cara Penanaman Anggur",
                "Penanganan Hama Anggur",
                "Pencatatan Anggur",
                R.drawable.anggur))

        arrayList.add(Model(
                "Delima",
                "فِيْهِمَا فَاكِهَةٌ وَّنَخْلٌ وَّرُمَّانٌۚ",
                "Manfaat Delima",
                "Hama Delima",
                "Cara Penanaman Delima",
                "Penanganan Hama Delima",
                "Pencatatan Delima",
                R.drawable.delima))

        arrayList.add(Model(
                "Jahe",
                "Ayat Jahe",
                "Manfaat Jahe",
                "Hama Jahe",
                "Cara Penanaman Jahe",
                "Penanganan Hama jahe",
                "Pencatatan Jahe",
                R.drawable.jahe))

        arrayList.add(Model(
                "Kurma",
                "وَهُزِّيْٓ اِلَيْكِ بِجِذْعِ النَّخْلَةِ تُسٰقِطْ عَلَيْكِ رُطَبًا جَنِيًّا ۖ",
                "Manfaat Kurma",
                "Hama Kurma",
                "Cara Penanaman Kurma",
                "Penanganan Hama Kurma",
                "Pencatatan Kurma",
                R.drawable.kurma))

        arrayList.add(Model(
                "Tin",
                "وَالتِّيۡنِ وَالزَّيۡتُوۡنِۙ",
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
                "Manfaat Bawang",
                "Hama Bawang",
                "Cara Penanaman Bawang",
                "Penanganan Hama Bawang",
                "Pencatatan Bawang",
                R.drawable.bawang))


        val MyAdapter = MyAdapter2(arrayList,this)

        Recycleview.layoutManager = LinearLayoutManager(this)
        Recycleview.adapter = MyAdapter

    }
}
