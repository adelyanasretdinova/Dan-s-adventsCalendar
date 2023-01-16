package com.example.danscalendar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.GridView
import androidx.navigation.fragment.findNavController
import com.example.danscalendar.databinding.FragmentGeneralGridBinding

class GeneralFragmentGrid : Fragment() {

    private lateinit var binding: FragmentGeneralGridBinding
    lateinit var dayList: ArrayList<DayNumberWithPhoto>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentGeneralGridBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dayList = ArrayList<DayNumberWithPhoto>()

        dayList.add(DayNumberWithPhoto("1", R.drawable.santa, R.drawable.cat))
        dayList.add(DayNumberWithPhoto("2", R.drawable.santa, R.drawable.cookies))
        dayList.add(DayNumberWithPhoto("3", R.drawable.santa,R.drawable.bells))
        dayList.add(DayNumberWithPhoto("4", R.drawable.santa,R.drawable.coffee))
        dayList.add(DayNumberWithPhoto("5", R.drawable.santa,R.drawable.bells))
        dayList.add(DayNumberWithPhoto("6", R.drawable.santa,R.drawable.bells))
        dayList.add(DayNumberWithPhoto("7", R.drawable.santa,R.drawable.bells))
        dayList.add(DayNumberWithPhoto("8", R.drawable.santa, R.drawable.cat))
        dayList.add(DayNumberWithPhoto("9", R.drawable.santa,R.drawable.coffee))
        dayList.add(DayNumberWithPhoto("10", R.drawable.santa, R.drawable.cat))
        dayList.add(DayNumberWithPhoto("11", R.drawable.santa,R.drawable.cat))
        dayList.add(DayNumberWithPhoto("12", R.drawable.santa,R.drawable.cat))
        dayList.add(DayNumberWithPhoto("13", R.drawable.santa,R.drawable.cat))
        dayList.add(DayNumberWithPhoto("14", R.drawable.santa,R.drawable.coffee))
        dayList.add(DayNumberWithPhoto("15", R.drawable.santa,R.drawable.cat))
        dayList.add(DayNumberWithPhoto("16", R.drawable.santa,R.drawable.cat))
        dayList.add(DayNumberWithPhoto("17", R.drawable.santa,R.drawable.coffee))
        dayList.add(DayNumberWithPhoto("18", R.drawable.santa,R.drawable.coffee))
        dayList.add(DayNumberWithPhoto("19", R.drawable.santa,R.drawable.coffee))
        dayList.add(DayNumberWithPhoto("20", R.drawable.santa,R.drawable.coffee))
        dayList.add(DayNumberWithPhoto("21", R.drawable.santa,R.drawable.coffee))
        dayList.add(DayNumberWithPhoto("22", R.drawable.santa,R.drawable.coffee))
        dayList.add(DayNumberWithPhoto("23", R.drawable.santa,R.drawable.coffee))
        dayList.add(DayNumberWithPhoto("24", R.drawable.santa,R.drawable.coffee))

        val adapterGrid = GridAdapter(requireContext(), dayList!!)

        binding.grid.adapter = adapterGrid

        adapterGrid.onItemClick = { DayNumberWithPhoto ->
            val bundle = Bundle()
            bundle.putInt("photo", DayNumberWithPhoto.fullPhoto)
            findNavController().navigate(
                R.id.action_generalFragmentGrid_to_fullPhotoFragment, bundle
            )
        }

    }

}