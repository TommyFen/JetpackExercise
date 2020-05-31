package cn.tommyfen.mvvmsample.view;

import androidx.databinding.DataBindingUtil;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import cn.tommyfen.jetpackexercise.R;
import cn.tommyfen.jetpackexercise.databinding.ActivityLayoutBindExpBinding;
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
