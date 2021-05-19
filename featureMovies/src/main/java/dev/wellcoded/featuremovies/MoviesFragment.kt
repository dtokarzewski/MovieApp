package dev.wellcoded.featuremovies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import dev.wellcoded.base.ui.BaseFragment
import dev.wellcoded.featuremovies.databinding.FragmentMoviesBinding

@AndroidEntryPoint
class MoviesFragment : BaseFragment() {
    //TODO implement

    private lateinit var binding: FragmentMoviesBinding
    private val viewModel: MoviesViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMoviesBinding.inflate(inflater, container, false)
        return binding.root
    }
}