package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class Adapterclass(val List : List<itemlist>) : RecyclerView.Adapter<Adapterclass.ViewHolder>(){
    private var onClickListener: OnClickListener? = null
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var text = itemView.findViewById<TextView>(R.id.textview)
        var iamge = itemView.findViewById<ImageView>(R.id.imageview)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.recycleradapter,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
     return List.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      val Itemviewmodel = List[position]
        holder.text.text = Itemviewmodel.text
        holder.iamge.setImageResource(Itemviewmodel.image)

        holder.itemView.setOnClickListener {
            if (onClickListener != null) {
                onClickListener!!.onClick11(position, Itemviewmodel )
            }
        }
    }
    fun setOnClickListener(onClickListener: OnClickListener) {
        this.onClickListener = onClickListener
    }
    interface OnClickListener : View.OnClickListener {
        fun onClick11(position: Int, model: itemlist)
    }

}