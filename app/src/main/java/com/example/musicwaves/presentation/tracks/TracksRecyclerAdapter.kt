package com.example.musicwaves.presentation.tracks

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.RecyclerView
import com.example.musicwaves.R
import com.example.musicwaves.models.local.tracks.TrackLocal
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

class TracksRecyclerAdapter(private val updateTracks: (tracks: List<TrackLocal>) -> Unit) :
    RecyclerView.Adapter<TracksRecyclerAdapter.TracksViewHolder>() {

    private val tracks = mutableListOf<TrackLocal>()

    fun setTracks(tracks: List<TrackLocal>) {
        this.tracks.clear()
        this.tracks.addAll(tracks)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TracksViewHolder {
        return TracksViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_track, parent, false)
        )
    }

    override fun onBindViewHolder(holder: TracksViewHolder, position: Int) {
        holder.setTrack(tracks[position])
    }

    override fun getItemCount() = tracks.size

    inner class TracksViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        private lateinit var buttonLike: MaterialButton
        fun setTrack(track: TrackLocal) {
            view.findViewById<MaterialTextView>(R.id.text_view_track_name).text = track.name
            buttonLike = view.findViewById(R.id.button_like)
            setButtonLikeBackground(track.favourite)
            buttonLike.setOnClickListener {
                track.favourite = !track.favourite
                setButtonLikeBackground(track.favourite)
                updateTracks(tracks)
            }

        }

        private fun setButtonLikeBackground(liked: Boolean) {
            buttonLike.background = AppCompatResources.getDrawable(
                buttonLike.context,
                if (liked) R.drawable.like_act else R.drawable.like
            )
        }
    }
}