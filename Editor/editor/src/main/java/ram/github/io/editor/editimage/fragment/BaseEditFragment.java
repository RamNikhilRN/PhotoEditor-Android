package ram.github.io.editor.editimage.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

import ram.github.io.editor.editimage.EditImageActivity;

public abstract class BaseEditFragment extends Fragment {
    protected EditImageActivity activity;

    protected EditImageActivity ensureEditActivity(){
        if(activity == null){
            activity = (EditImageActivity) getActivity();
        }
        return activity;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ensureEditActivity();
    }

    @Override
    public void onResume() {
        super.onResume();
        ensureEditActivity();
    }

    public abstract void onShow();

    public abstract void backToMain();
}
