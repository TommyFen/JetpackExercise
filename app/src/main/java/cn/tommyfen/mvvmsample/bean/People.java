package cn.tommyfen.mvvmsample.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import java.io.Serializable;

import cn.tommyfen.mvvmsample.BR;

/**
 * @author : tommy
 * @version : 1.0.0
 * @since : 2019-04-29
 */
public class People extends BaseObservable implements Serializable {

    private String fullName;

    private String introduce;

    @Bindable
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
        notifyPropertyChanged(BR.fullName);
    }

    @Bindable
    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
        notifyPropertyChanged(BR.introduce);
    }
}
