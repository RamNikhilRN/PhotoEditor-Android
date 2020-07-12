package ram.github.io.editor.editimage.adapter.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import ram.github.io.editor.R

class ColorViewHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
    @JvmField var colorPanelView: View = itemView.findViewById(R.id.color_panel_view)
}