package fms.android.discipulosembh.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import fms.android.discipulosembh.R
import fms.android.discipulosembh.models.Video

class VideosAdapter(val videos: ArrayList<Video>): RecyclerView.Adapter<VideosAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_videos, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(videos[position])
    }

    override fun getItemCount(): Int {
        return videos.count()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val headerImage = itemView.findViewById<ImageView>(R.id.rv_videos_image)
        val titleText = itemView.findViewById<TextView>(R.id.rv_videos_title)

        fun bindItem(item: Video) {
            titleText.text =  item.title
        }
    }
}