package cn.tommyfen.mvvmsample.view_model;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author : tommy
 * @version : 1.0.0
 * @since : 2019/3/12
 */
public class ViewModel1 {

    private String title = "MVVM Sample";
    private String title2 = null;

    public String getTitle() {
        return title;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void changeSelfDesc(View view,  String desc) {
        if (view instanceof TextView) {
            ((TextView) view).setText(desc);
            Toast.makeText(view.getContext(), "Change self", Toast.LENGTH_SHORT).show();
        }
    }

    public void completeChanged(View view, boolean isChecked) {
        if (view instanceof CheckBox) {
            ((CheckBox) view).setText(isChecked? "checked" : "unchecked");
        }
    }

    public boolean onLongClick(View view) {

        Toast.makeText(view.getContext(), "Long Click", Toast.LENGTH_SHORT).show();

        return true;
    }
}
