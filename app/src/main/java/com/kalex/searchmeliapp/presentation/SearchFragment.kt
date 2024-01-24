package com.kalex.searchmeliapp.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.navigation.fragment.findNavController
import com.kalex.searchmeliapp.R
import com.kalex.searchmeliapp.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {

    private var _searchBinding: FragmentSearchBinding? = null
    private val binding get() = _searchBinding!!

    private val searchView: SearchView
        get() = binding.searchView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _searchBinding = FragmentSearchBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpViews()
    }

    private fun setUpViews() {
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                findNavController().navigate(
                    SearchFragmentDirections.actionSearchFragmentToResultFragment(query ?: " ")
                )
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {

                return true
            }
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _searchBinding = null
    }

}