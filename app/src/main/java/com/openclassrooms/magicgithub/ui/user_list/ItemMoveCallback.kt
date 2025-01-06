package com.openclassrooms.magicgithub.ui.user_list

import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView

class ItemMoveCallback(
    private val adapter: UserListAdapter,
    private val onItemMoved: (fromPosition: Int, toPosition: Int) -> Unit
) : ItemTouchHelper.Callback() {

    override fun getMovementFlags(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder
    ): Int {
        val dragFlags = ItemTouchHelper.UP or ItemTouchHelper.DOWN
        return makeMovementFlags(dragFlags, 0) // Autorise le glisser-déposer (pas le swipe)
    }

    override fun onMove(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        target: RecyclerView.ViewHolder
    ): Boolean {
        val fromPosition = viewHolder.adapterPosition
        val toPosition = target.adapterPosition
        adapter.notifyItemMoved(fromPosition, toPosition)
        onItemMoved(fromPosition, toPosition)
        return true
    }

    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
        // Rien à faire ici, car on ne gère pas le swipe horizontal dans cette classe
    }

    override fun isLongPressDragEnabled(): Boolean {
        return true // Active le drag via un appui long
    }

    override fun isItemViewSwipeEnabled(): Boolean {
        return false // Désactive le swipe horizontal
    }
}
