package cn.tommyfen.mvvmsample;

import androidx.databinding.DataBindingUtil;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import cn.tommyfen.mvvmsample.databinding.ActivityMainBinding;

/**
 * @author tommy
 * @since 2019/3/12
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(new ViewModel());

        setSupportActionBar(binding.toolBar);

    }
}
