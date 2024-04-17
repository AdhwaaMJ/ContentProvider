package com.project.contentprovider

import android.provider.MediaStore.Images
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class ContentProviderViewModel:ViewModel() {
    var imagesSate = mutableStateOf(emptyList<ContentProviderDataItem>())

    fun updateImages(images: List<ContentProviderDataItem>){
        imagesSate.value = images
    }
}