package ram.github.io.editor.editimage.adapter.viewholders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ram.github.io.editor.R

class FilterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    @JvmField
    var icon: ImageView = itemView.findViewById<View>(R.id.filter_image) as ImageView
    @JvmField
    var text: TextView = itemView.findViewById<View>(R.id.filter_name) as TextView
}