package com.learning.hackathon3_groupe.categorylist.adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import com.learning.hackathon3_groupe.databinding.ItemGridCategoryBinding
import com.learning.hackathon3_groupe.model.CategoryModel

class CategoryListAdapter (
    private val onClickListener: (CategoryModel) -> Unit
) : RecyclerView.Adapter<ViewHolder>() {

    private val dataDiffer = AsyncListDiffer(this, object : DiffUtil.ItemCallback<CategoryModel>() {
        override fun areItemsTheSame(oldItem: CategoryModel, newItem: CategoryModel): Boolean {
            return oldItem.position == newItem.position &&
                    oldItem.name == newItem.name &&
                    oldItem.desc == newItem.desc
        }

        override fun areContentsTheSame(oldItem: CategoryModel, newItem: CategoryModel): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }
    })

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return when(viewType) {
           AdapterLayoutMode.GRID.ordinal -> {
               CategoryItemViewHolder(
                   binding = ItemGridCategoryBinding.inflate(
                       LayoutInflater.from(parent.context),parent,false
                   ),onClickListener
               )
           }

           else -> {
               CategoryItemViewHolder(
                   binding = ItemGridCategoryBinding.inflate(
                       LayoutInflater.from(parent.context),parent,false
                   ),onClickListener)

           }
       }
       }

    override fun getItemCount(): Int = dataDiffer.currentList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}


