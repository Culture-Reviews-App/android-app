package com.eb.culturecritics.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.eb.culturecritics.model.Critic
import com.eb.culturecritics.model.repository.CriticsRepositoryImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CriticListViewModel : ViewModel() {
    private val repository = CriticsRepositoryImpl()
    private val _critics = MutableStateFlow<List<Critic>>(emptyList())
    val critic: StateFlow<List<Critic>> = _critics

    init {
        getCriticsList()
    }

    private fun getCriticsList() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val criticList = repository.getCriticsList()
                _critics.value = criticList
            } catch (e: Exception) {
                Log.e("CriticListViewModel", "Failed to fetch critic list", e)
            }
        }
    }
}

