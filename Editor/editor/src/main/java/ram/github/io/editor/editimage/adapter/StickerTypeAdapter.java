package ram.github.io.editor.editimage.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import ram.github.io.editor.R;
import ram.github.io.editor.editimage.fragment.StickerFragment;

public class StickerTypeAdapter extends RecyclerView.Adapter<ViewHolder> {
    private String[] stickerPath ;
    private String[] stickerPathName;
    private int[] stickerCount;
    private StickerFragment stickerFragment;
    private ImageClick imageClick = new ImageClick();

    public StickerTypeAdapter(StickerFragment fragment) {
        super();
        this.stickerFragment = fragment;
        stickerPath = stickerFragment.getResources().getStringArray(R.array.ram_github_io_editor_types);
        stickerPathName = stickerFragment.getResources().getStringArray(R.array.ram_github_io_editor_type_names);
        stickerCount = stickerFragment.getResources().getIntArray(R.array.ram_github_io_editor_type_count);
    }

    public class ImageHolder extends ViewHolder {
        public ImageView icon;
        public TextView text;

        ImageHolder(View itemView) {
            super(itemView);
            this.icon = itemView.findViewById(R.id.icon);
            this.text = itemView.findViewById(R.id.text);
        }
    }

    @Override
    public int getItemCount() {
        return stickerPathName.length;
    }

    @Override
    public int getItemViewType(int position) {
        return 1;
    }

    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewtype) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.view_sticker_type_item, parent, false);
        return new ImageHolder(view);
    }

    @Override
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        ImageHolder imageHolder = (ImageHolder) holder;
        String name = stickerPathName[position];
        imageHolder.text.setText(name);
        imageHolder.text.setTag(R.id.ram_github_io_editor_TAG_STICKERS_PATH, stickerPath[position]);
        imageHolder.text.setTag(R.id.ram_github_io_editor_TAG_STICKERS_COUNT, stickerCount[position]);
        imageHolder.text.setOnClickListener(imageClick);
    }

    private final class ImageClick implements OnClickListener {
        @Override
        public void onClick(View v) {
            String data = (String) v.getTag(R.id.ram_github_io_editor_TAG_STICKERS_PATH);
            int count = (int) v.getTag(R.id.ram_github_io_editor_TAG_STICKERS_COUNT);
            stickerFragment.swipToStickerDetails(data, count);
        }
    }
}
