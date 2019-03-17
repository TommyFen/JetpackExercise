package cn.tommyfen.mvvmsample;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import cn.tommyfen.mvvmsample.view.BindingAdapterActivity;
import cn.tommyfen.mvvmsample.view.LayoutBindExpActivity;
import cn.tommyfen.mvvmsample.view.ObservableDataActivity;

/**
 * @author : tommy
 * @version : 1.0.0
 * @since : 2019/3/12
 */
public class ViewModel {

    public void startLayoutBindExp(View view) {
        Context context = view.getContext();
        Intent intent = new Intent(context, LayoutBindExpActivity.class);
        context.startActivity(intent);
    }

    public void startObservableData(View view) {
        Context context = view.getContext();
        Intent intent = new Intent(context, ObservableDataActivity.class);
        context.startActivity(intent);
    }

    public void startBindingAdapter(View view) {
        Context context = view.getContext();
        Intent intent = new Intent(context, BindingAdapterActivity.class);
        context.startActivity(intent);
    }
}
