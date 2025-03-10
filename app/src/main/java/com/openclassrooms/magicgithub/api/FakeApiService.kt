package com.openclassrooms.magicgithub.api

import com.openclassrooms.magicgithub.model.User

class FakeApiService : ApiService {
    private val _users = FakeApiServiceGenerator.FAKE_USERS
    private val _randomUsers = FakeApiServiceGenerator.FAKE_USERS_RANDOM

    /**
     * Return a list of [User]
     * Those users must be generated by [FakeApiServiceGenerator]
     */
    override fun getUsers(): List<User> {
        return _users
    }

    /**
     * Generate a random [User] and add it [FakeApiService.users] list.
     * This user must be get from the [FakeApiServiceGenerator.FAKE_USERS_RANDOM] list.
     */
    override fun addRandomUser() {
        val randomUser = _randomUsers.random() // Choisit un utilisateur aléatoire parmi FAKE_USERS_RANDOM
        _users.add(randomUser)
    }

    /**
     * Delete a [User] from the [FakeApiService.users] list.
     */
    override fun deleteUser(user: User) {
        _users.remove(user)
    }

    fun updateUser(user: User) {
        val index = _users.indexOfFirst { it.id == user.id }
        if (index != -1) {
            _users[index] = user
        }
    }

    override fun setUsers(users: List<User>) {
        _users.clear()
        _users.addAll(users)
    }
}