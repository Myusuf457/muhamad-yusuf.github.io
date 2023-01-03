package com.example.coffee_skuy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TrendingFragment : Fragment() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Menu>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_trending)

        imageId = arrayOf(
            R.drawable.makanan1,
            R.drawable.kopi1,
            R.drawable.makanan2,
            R.drawable.makanan3,
            R.drawable.kopi5,
            R.drawable.makanan5,
            R.drawable.kopi3,
            R.drawable.makanan4,
            R.drawable.kopi5,
            R.drawable.kopi7
        )

        heading = arrayOf(
            "Bakso Urat"
            "Kopi mix",
            "SUP",
            "Kopi Coklat",
            "Rendang Bakar",
            "Kopi Hitam",
            "Soto",
            "Nasi Goreng",
            "Semur",
            "Good Day"
        )

        newRecyclerView = findViewById(R.id.recycler_view)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Menu>()
        getUserData()

    }

    private fun findViewById(recyclerView: Int) {

    }

    private fun setContentView(fragmentTrending: Int) {

    }

    private fun getUserData() {
        for (i in imageId.indices){
            val  news = Menu(imageId[i],heading[i])
            newArrayList.add(news)
        }

        newRecyclerView.adapter = MyAdapter(newArrayList)
    }


}