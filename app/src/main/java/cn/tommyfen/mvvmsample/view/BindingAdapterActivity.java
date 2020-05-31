package cn.tommyfen.mvvmsample.view;

import androidx.databinding.DataBindingUtil;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import cn.tommyfen.mvvmsample.R;
import cn.tommyfen.mvvmsample.databinding.ActivityBindingAdapterBinding;
import cn.tommyfen.mvvmsample.view_model.ViewModel3;

public class BindingAdapterActivity extends AppCompatActivity {

    private ActivityBindingAdapterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_binding_adapter);
        binding.setViewModel(new ViewModel3());

        setSupportActionBar(binding.toolBar);
        ActionBar actionBar =  getSupportActionBar();
        if(actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
}
