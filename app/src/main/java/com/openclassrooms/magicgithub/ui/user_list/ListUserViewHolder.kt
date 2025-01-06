package com.openclassrooms.magicgithub.ui.user_list

import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.openclassrooms.magicgithub.R
import com.openclassrooms.magicgithub.databinding.ItemListUserBinding
import com.openclassrooms.magicgithub.model.User

class ListUserViewHolder(private val binding: ItemListUserBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(user: User, callback: UserListAdapter.Listener) {
        Glide.with(itemView.context)
            .load(user.avatarUrl)
            .apply(RequestOptions.circleCropTransform())
            .into(binding.itemListUserAvatar) // Utilisation de ViewBinding pour l'image

        binding.itemListUserUsername.text = user.login  // Utilisation de ViewBinding pour le TextView
        binding.itemListUserDeleteButton.setOnClickListener {
            callback.onClickDelete(user)  // Déclenche l'action de suppression
        }
    }
}