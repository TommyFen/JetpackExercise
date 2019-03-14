package cn.tommyfen.mvvmsample.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.tommyfen.mvvmsample.R;
import cn.tommyfen.mvvmsample.databinding.ActivityObservableDataBinding;
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
