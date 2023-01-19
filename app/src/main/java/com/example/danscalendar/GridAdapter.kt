package com.example.danscalendar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.danscalendar.databinding.ItemboxBinding

class GridAdapter(
    private val context: Context,
    private val dayList: ArrayList<DayNumberWithPhoto>,

        ) :
    BaseAdapter() {
    private lateinit var textView: TextView
    private lateinit var imageView: ImageView
    var onItemClick: ((DayNumberWithPhoto) -> Unit)? = null


    override fun getCount(): Int {
        return dayList.size
    }

    override fun getItem(position: Int): Any? {
        return dayList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//        var view:View = LayoutInflater.from(context).inflate( R.layout.itembox,parent, false)
        var binding = ItemboxBinding.inflate(LayoutInflater.from(context), parent, false)
        var listItem:DayNumberWithPhoto = dayList[position]

        binding.image.setOnClickListener {
            onItemClick?.invoke(dayList[position])
        }
        binding.image.setImageResource(listItem.dailyImg)
        binding.textNumber.text = listItem.day


        return binding.root
    }
}
