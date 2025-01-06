package com.openclassrooms.magicgithub.ui.user_list

import android.graphics.Canvas
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.openclassrooms.magicgithub.R
import com.openclassrooms.magicgithub.databinding.ActivityListUserBinding
import com.openclassrooms.magicgithub.di.Injection.getRepository
import com.openclassrooms.magicgithub.model.User

class ListUserActivity : AppCompatActivity(), UserListAdapter.Listener {
    private lateinit var binding: ActivityListUserBinding
    private lateinit var adapter: UserListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        configureFab()
        configureRecyclerView()
        configureSwipeActions()
    }

    override fun onResume() {
        super.onResume()
        loadData()
    }

    private fun configureRecyclerView() {
        adapter = UserListAdapter(this)
        binding.activityListUserRv.adapter = adapter
    }

    private fun configureFab() {
        binding.activityListUserFab.setOnClickListener {
            getRepository().addRandomUser()
            loadData()
        }
    }

    private fun loadData() {
        adapter.updateList(getRepository().getUsers())
    }

    private fun configureSwipeActions() {
        val itemTouchHelperCallback = object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT) {
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                return false
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val position = viewHolder.adapterPosition
                val user = adapter.getUserAtPosition(position)

                user?.let {
                    // Inverse le statut actif/inactif
                    it.isActive = !it.isActive
                    getRepository().updateUser(it)

                    // Affiche un message de confirmation
                    val status = if (it.isActive) "activé" else "désactivé"
                    Snackbar.make(binding.root, "Utilisateur ${it.login} $status", Snackbar.LENGTH_SHORT).show()

                    // Recharge les données
                    loadData()
                }
            }

            override fun onChildDraw(
                c: Canvas,
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                dX: Float,
                dY: Float,
                actionState: Int,
                isCurrentlyActive: Boolean
            ) {
                super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive)
            }
        }

        val itemTouchHelper = ItemTouchHelper(itemTouchHelperCallback)
        itemTouchHelper.attachToRecyclerView(binding.activityListUserRv)
    }

    override fun onClickDelete(user: User) {
        Log.d(ListUserActivity::class.java.name, "User tries to delete an item.")
        getRepository().deleteUser(user)
        loadData()
    }
}