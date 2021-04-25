package com.tugraz.asd.modernnewsgroupapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tugraz.asd.modernnewsgroupapp.vo.NewsgroupServer

open class ServerObseravble : ViewModel()
{
    val data = MutableLiveData<NewsgroupServer>()

    fun data(item: NewsgroupServer) {
        data.value = item
    }
}