package com.tugraz.asd.modernnewsgroupapp.helper

import android.app.AlertDialog
import android.content.Context
import android.text.InputType
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView
import com.tugraz.asd.modernnewsgroupapp.R
import com.tugraz.asd.modernnewsgroupapp.vo.Newsgroup
import kotlinx.android.synthetic.main.subgroup_list_entry.view.*

class SwipeAdapter(private val items: MutableList<Newsgroup>) : RecyclerView.Adapter<SwipeAdapter.VH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(parent)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bind(items[position].name)
    }

    override fun getItemCount(): Int = items.size

    fun removeAt(position: Int) {
        items[position].subscribed = false
        items.removeAt(position)
        // TODO notify user with feedback message
        //notifyItemRemoved(position)
    }

    fun editAt(position: Int, context: Context) {
        showEditDialog(items[position], context)
    }

    class VH(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.subgroup_list_entry, parent, false)) {

        fun bind(name: String) = with(itemView) {
            tv_subgroup_name.text = name
        }
    }

    private fun showEditDialog(newsgroup: Newsgroup, context: Context)
    {
        val builder: AlertDialog.Builder = AlertDialog.Builder(context)
        builder.setTitle("Edit Alias")

        val input = EditText(context)
        input.inputType = InputType.TYPE_CLASS_TEXT
        input.setText(newsgroup.alias.toString())
        builder.setView(input)

        builder.setPositiveButton("Save") { _, _ ->
            newsgroup.alias = input.text.toString()
        }
        builder.setNegativeButton("Cancel") { dialog, _ -> dialog.cancel() }
        builder.show()
    }
}