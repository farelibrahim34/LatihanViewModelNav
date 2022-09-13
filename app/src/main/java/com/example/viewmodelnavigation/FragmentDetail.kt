package com.example.viewmodelnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_detail.*


class FragmentDetail : Fragment() {

    private val args : FragmentDetailArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val getData = args.databerita
        txtJudulDetail.text =getData.judul
        txtJurnalisDetail.text = getData.nama
        txtTglDetail.text = getData.tanggal
        txtIsi.text = getData.isi
        imgDetail.setImageResource(getData.gambar)


    }

}