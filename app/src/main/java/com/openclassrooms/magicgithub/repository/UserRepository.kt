package com.openclassrooms.magicgithub.repository

import com.openclassrooms.magicgithub.api.ApiService
import com.openclassrooms.magicgithub.api.FakeApiService
import com.openclassrooms.magicgithub.model.User

class UserRepository(
    private val apiService: ApiService
) {
    fun getUsers(): List<User> {
        return apiService.getUsers()    }

    fun addRandomUser() {
        apiService.addRandomUser()
    }

    fun deleteUser(user: User) {
        apiService.deleteUser(user)

    }

    fun updateUser(user: User) {
        (apiService as? FakeApiService)?.updateUser(user)
    }
}