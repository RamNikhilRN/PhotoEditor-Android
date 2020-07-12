package ram.github.io.editor.editimage.fragment.crop

import androidx.annotation.StringRes
import ram.github.io.editor.R

enum class RatioText constructor(@StringRes val ratioTextId: Int, val aspectRatio: AspectRatio) {
    FREE(R.string.ram_github_io_editor_free_size, AspectRatio()),
    FIT_IMAGE(R.string.ram_github_io_editor_fit_image, AspectRatio(-1, -1)),
    SQUARE(R.string.ram_github_io_editor_square, AspectRatio(1, 1)),
    RATIO_3_4(R.string.ram_github_io_editor_ratio3_4, AspectRatio(3, 4)),
    RATIO_4_3(R.string.ram_github_io_editor_ratio4_3, AspectRatio(4, 3)),
    RATIO_9_16(R.string.ram_github_io_editor_ratio9_16, AspectRatio(9, 16)),
    RATIO_16_9(R.string.ram_github_io_editor_ratio16_9, AspectRatio(16, 9))
}

data class AspectRatio(
        val aspectX: Int = 0,
        val aspectY: Int = 0
)
