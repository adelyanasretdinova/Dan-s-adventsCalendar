package com.example.danscalendar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class GridAdapter(
    private val context: Context,
    private val dayList: ArrayList<DayNumberWithPhoto>,

        ) :
    BaseAdapter() {
    private lateinit var textView: TextView
    private lateinit var imageView: ImageView
    var onItemClick: ((DayNumberWithPhoto) -> Unit)? = null

//    inner class ViewHolder(private val binding: ItemboxBinding) : RecyclerView.ViewHolder(binding.root) {
//
//
//        init {
//
//            binding.image.setOnClickListener {
//                onItemClick?.invoke(dayList[adapterPosition])
//            }
//        }
//    }

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
        var view:View = LayoutInflater.from(context).inflate( R.layout.itembox,parent, false)
        imageView = view.findViewById(R.id.image)
        textView = view.findViewById(R.id.textNumber)
        var listItem:DayNumberWithPhoto = dayList[position]


            imageView.setOnClickListener {
                onItemClick?.invoke(dayList[position])
            }
        imageView.setImageResource(listItem.dailyImg)
        textView.text = listItem.day


        return view
    }
}
