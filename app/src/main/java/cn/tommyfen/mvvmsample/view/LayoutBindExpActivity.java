package cn.tommyfen.mvvmsample.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.tommyfen.mvvmsample.R;
import cn.tommyfen.mvvmsample.databinding.ActivityLayoutBindExpBinding;
import cn.tommyfen.mvvmsample.view_model.ViewModel1;

public class LayoutBindExpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityLayoutBindExpBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_layout_bind_exp);
        binding.setViewModel(new ViewModel1());

        setSupportActionBar(binding.toolBar);
        ActionBar actionBar =  getSupportActionBar();
        if(actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
//            actionBar.setDisplayShowTitleEnabled(false);
        }
    }
}
