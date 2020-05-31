package cn.tommyfen.mvvmsample.view_model;

import androidx.databinding.ObservableInt;

/**
 * @author : tommy
 * @version : 1.0.0
 * @since : 2019/3/15
 */
public class ViewModel3 {

    private ObservableInt state = new ObservableInt(1);


    public ObservableInt getState() {
        return state;
    }

    public void setState(ObservableInt state) {
        this.state = state;
    }

    public void buttonOnClick() {
        if (state.get() == 1) {
            state.set(2);
        } else {
            state.set(1);
        }
    }
}
