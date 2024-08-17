package com.eb.culturecritics.model.repository

import com.eb.culturecritics.model.Critic

interface CriticsRepository {

    suspend fun getCriticsList(): List<Critic>

}