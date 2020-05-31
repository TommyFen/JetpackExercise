package cn.tommyfen.mvvmsample.view_model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import cn.tommyfen.mvvmsample.BR;

/**
 * @author : tommy
 * @version : 1.0.0
 * @since : 2019/3/14
 */
public class ViewModel2 {

    private ObservableInt num = new ObservableInt(1);

    private ObservableField<String> content = new ObservableField<>("Hello, JetPack");

    public User user = new User("Jake", "Wharton");

    public ObservableField<String> getContent() {
        return content;
    }

    public ObservableInt getNum() {
        return num;
    }


    public void changeNum() {
        num.set(num.get()+1);
    }

    public void changeContent() {
        content.set("MVVM Sample");
    }

    public void changeFirstName() {
        user.setFirstName("Tommy");
    }

    public void changeLastName() {
        user.setLastName("Guo");
    }

    public void changeUserName() {
        user.changeAll("Chris", "Banes");
    }

    public class User extends BaseObservable {

        private String firstName;
        private String lastName;

        public User(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Bindable
        public String getFirstName() {
            return firstName;
        }

        @Bindable
        public String getLastName() {
            return lastName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
            notifyPropertyChanged(BR.firstName);
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
            notifyPropertyChanged(BR.lastName);
        }

        public void changeAll(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            notifyChange();
        }
    }

}
