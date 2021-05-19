package dev.wellcoded.featuremoviedetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import dev.wellcoded.base.ui.BaseFragment
import dev.wellcoded.featuremoviedetails.databinding.FragmentMovieDetailsBinding

@AndroidEntryPoint
class MovieDetailsFragment : BaseFragment() {
    //TODO implement

    private lateinit var binding: FragmentMovieDetailsBinding
    private val viewModel: MovieDetailsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMovieDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }
}