package com.tugraz.asd.modernnewsgroupapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.fragment_show_subgroups_header.*;
import android.widget.*


/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FragmentShowSubgroupsHeader : Fragment() {

    val dropDownlist = arrayOf("Test 1", "Option B", "This is located in FragmentShowSubgroupsHeader.kt")
//  dropDownList = server.newsGroups
    private fun condition1(){
        Toast.makeText(requireActivity(), "selected Item: " + newsgroups_List.selectedItem, Toast.LENGTH_LONG ).show()
    }

    private fun condition2(){
        Toast.makeText(requireActivity(), "selected Item: " + newsgroups_List.selectedItem, Toast.LENGTH_LONG ).show()
    }

    private fun condition3(){
        Toast.makeText(requireActivity(), "Checked Item: ", Toast.LENGTH_LONG ).show()
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater!!.inflate(R.layout.fragment_show_subgroups_header, container, false)
        // Inflate the layout for this fragment
        // Below is the code for Profile ImageButton


        //val list: MutableList<String> = ArrayList()

        //list.add("newsgroup-one")
        //list.add("newsgroup-two")
        //list.add("newsgroup-three")
        // Below is the code for the DropDown Menu
        //val adapter = ArrayAdapter(requireActivity(), android.R.layout.simple_spinner_dropdown_item, dropDownlist)
        //newsgroups_List.adapter = adapter







        // Return the fragment view/layout
        return inflater.inflate(R.layout.fragment_show_subgroups_header, container, false)
    //      return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /*view.findViewById<Button>(R.id.button_subscribe).setOnClickListener {
            findNavController().navigate(R.id.action_AddNewsgroup_to_Subscribe)
        }*/
    }
}