package com.example.viewmodelnavigation

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_detail.*
import kotlinx.android.synthetic.main.fragment_detail.view.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.item_berita.*


class FragmentHome : Fragment() {
    lateinit var beritaVM : BeritaViewModel
    lateinit var adapterBerita : AdapterBerita



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataBerita()

        beritaVM = ViewModelProvider(requireActivity()).get(BeritaViewModel::class.java)
        beritaVM.getBerita()
        beritaVM.listberita.observe(viewLifecycleOwner, {
            adapterBerita.setDataBerita(it as ArrayList<DataBerita>)
        })

    }
    fun dataBerita(){
        adapterBerita = AdapterBerita(ArrayList())
        rvBerita.adapter = adapterBerita
        rvBerita.layoutManager = LinearLayoutManager(context)
        adapterBerita.onClick = {
            val pindah = FragmentHomeDirections.actionFragmentHomeToFragmentDetail(it)
            findNavController().navigate(pindah)



//           view?.let { it1 -> Navigation.findNavController(it1).navigate(R.id.action_fragmentHome_to_fragmentDetail) }
        }
    }


}