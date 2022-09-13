package com.example.viewmodelnavigation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BeritaViewModel : ViewModel() {

    val list = arrayListOf(
        DataBerita("Perdi Sambung Ayam", "10 September 2020", "Paijo",R.drawable.ferdisambu,"Bripka Ricky Rizal (Bripka RR) memutuskan tak lagi mengikuti skenario mantan Kadiv Propam Polri, Irjen Ferdy Sambo, terkait kasus pembunuhan berencana Brigadir Joshua Hutabarat (Brigadir J).Mengikuti jejak Bharada Richard Eliezer (Bharada E), Bripka RR mulai membongkar satu per satu fakta yang diketahuinya terkait pembunuhan Brigadir J.Lewat kuasa hukumnya, Erman Umar, Bripka RR membeberkan kejadian di Magelang, Jawa Tengah.Ia juga mengungkapkan adanya janji dari Ferdy Sambo soal uang sebagai bentuk ucapan terima kasih."),
        DataBerita("Demo Tolak Kenaikan Harga BBM", "13 September 2022", "Boim",R.drawable.demobbm,"TRIBUNNEWS.COM, JAKARTA - Demo tolak kenaikan harga Bahan Bakar Minyak (BBM) masihberlangsung, Selasa (13/9/2022) malam.Aksi massa yang tergabung dalam sejumlah elemen mahasiswa ini kembali memanas.Massa mulai menyalakan kembang api dan melempar benda-benda keras ke arah barisan pengamanan polisi."),
        DataBerita("Pencurian Motor", "16 Agustus 2022", "Anto",R.drawable.ic_android_black_24dp,"Pencurian Motor"),
        DataBerita("Permainan Anak Anak", "1 September 2020", "Sarwan",R.drawable.ic_android_black_24dp,"Permainan Anak Anak"),
        DataBerita("Momen Mencekam Evakuasi Korban Gempa di China", "12 September 2022", "Doni",R.drawable.ic_android_black_24dp,"Momen Mencekam Evakuasi Korban Gempa di China"),
        DataBerita("Sukses Ternak Lele", "12 September 2020", "Tipeng",R.drawable.ic_android_black_24dp, "Sukses Ternak Lele"),
        DataBerita("Evos Memenangkan Kejuaraan Dunia M1 Series", "15 September 2020", "Juminem",R.drawable.ic_android_black_24dp,"Evos Memenangkan Juara Dunia M1"),
        DataBerita("Data Pemerintah Bocor", "20 September 2020", "Inah",R.drawable.ic_android_black_24dp,"Data Pemerintah Bocor"),
        DataBerita("Bolang Si Anak Petualang", "4 September 2020", "Ayu",R.drawable.ic_android_black_24dp,"Bolang Si Anak Petualang"),
        DataBerita("Harga BBM Naik Drastis", "3 September 2020", "Mukhlis",R.drawable.ic_android_black_24dp,"Harga BBM Naik Drastis"),
        DataBerita("Bencana Alam", "6 September 2020", "Retno",R.drawable.ic_android_black_24dp,"Bencana Alam"),
    )
    val listberita : MutableLiveData<List<DataBerita>> = MutableLiveData()


    fun getBerita(){
        var berita = list
        listberita.value = berita
    }
}