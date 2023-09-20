package com.learning.hackathon3_groupe.categorylist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.learning.hackathon3_groupe.data.CategoryDataSource
import com.learning.hackathon3_groupe.data.CategoryDataSourceImpl
import com.learning.hackathon3_groupe.databinding.FragmentListCategoryBinding


/**
 * A simple [Fragment] subclass.
 * Use the [fragment_list_category.newInstance] factory method to
 * create an instance of this fragment.
 */
class CategoryListFragment : Fragment() {
    private lateinit var binding: FragmentListCategoryBinding

    private val datasource: CategoryDataSource by lazy {
        CategoryDataSourceImpl()
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


}