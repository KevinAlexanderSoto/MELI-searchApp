package com.kalex.searchmeliapp.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.kalex.searchmeliapp.R
import com.kalex.searchmeliapp.databinding.FragmentResultBinding
import com.kalex.searchmeliapp.databinding.FragmentSearchBinding
import com.kalex.searchmeliapp.presentation.placeholder.PlaceholderContent

/**
 * A fragment representing a list of Items.
 */
class ResultFragment : Fragment() {

    private var columnCount: String = " "


    private var _resultBinding: FragmentResultBinding? = null
    private val binding get() = _resultBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _resultBinding = FragmentResultBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            columnCount = it.getString("searchQuery","defaultValue")
        }

        Toast.makeText(this.context, "argument: $columnCount", Toast.LENGTH_SHORT).show()

    }

    override fun onDestroyView() {
        super.onDestroyView()

        _resultBinding = null
    }
}