package com.example.customlistview

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class item_layout(private val context:Activity,
                    private val name:ArrayList<String>,
                    private val description:ArrayList<String>,
                    private val image:ArrayList<Int>):ArrayAdapter<String>(context,R.layout.activity_item_laout, name) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.activity_item_laout,null, true)

        val nameText = rowView.findViewById<TextView>(R.id.profileimag)
        val directionText= rowView.findViewById<TextView>(R.id.textView)
        val profileImage = rowView.findViewById<CircleImageView>(R.id.discrive)


        nameText.text = name[position]
        directionText.text = description[position]
        profileImage.setImageResource(image[position])

        return rowView
    }
}