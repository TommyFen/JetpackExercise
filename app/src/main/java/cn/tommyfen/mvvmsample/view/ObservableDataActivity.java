package cn.tommyfen.mvvmsample.view;

import androidx.databinding.DataBindingUtil;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import cn.tommyfen.jetpackexercise.R;
import cn.tommyfen.jetpackexercise.databinding.ActivityObservableDataBinding;
import cn.tommyfen.mvvmsample.view_model.ViewModel2;

public class ObservableDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityObservableDataBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_observable_data);
        binding.setViewModel(new ViewModel2());

        setSupportActionBar(binding.toolBar);
        ActionBar actionBar =  getSupportActionBar();
        if(actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

    }


}
