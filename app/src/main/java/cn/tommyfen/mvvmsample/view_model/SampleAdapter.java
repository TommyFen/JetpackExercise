package cn.tommyfen.mvvmsample.view_model;

import androidx.databinding.BindingAdapter;
import android.graphics.Color;
import androidx.core.content.ContextCompat;
import android.view.View;

import cn.tommyfen.mvvmsample.R;

/**
 * @author : tommy
 * @version : 1.0.0
 * @since : 2019/3/16
 */
public class SampleAdapter {

    @BindingAdapter("changeBackground")
    public static void buttonAdapter(View view, int state) {
            view.setBackgroundColor(state == 1? Color.GRAY:
                    ContextCompat.getColor(view.getContext(), R.color.colorPrimary));
    }
}
