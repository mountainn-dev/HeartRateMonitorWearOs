package com.san.heartratemonitorwearos.view.viewmodel

import androidx.lifecycle.LiveData
import com.san.heartratemonitorwearos.domain.state.UiState

interface HomeViewModel {
    val state: LiveData<UiState>

    fun updateWorkStatus()
}