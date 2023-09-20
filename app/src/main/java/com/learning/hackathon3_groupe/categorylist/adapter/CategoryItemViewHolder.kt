package com.learning.hackathon3_groupe.categorylist.adapter

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.learning.hackathon3_groupe.core.ViewHolderBinder
import com.learning.hackathon3_groupe.databinding.ItemGridCategoryBinding
import com.learning.hackathon3_groupe.model.CategoryModel

class CategoryItemViewHolder (
    private val binding : ItemGridCategoryBinding,
            private val onItemClickListener : (CategoryModel) -> Unit
) : RecyclerView.ViewHolder(binding.root), ViewHolderBinder<CategoryModel> {

    override fun bind(item: CategoryModel) {
        binding.ivCategory.load(item.imgUrl) {
            crossfade(true)
        }
        binding.tvCategoryName.text = item.name
        binding.root.setOnClickListener {
            onItemClickListener.invoke(item)
        }
    }
}