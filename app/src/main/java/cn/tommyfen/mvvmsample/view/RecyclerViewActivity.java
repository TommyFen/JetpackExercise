package cn.tommyfen.mvvmsample.view;

import androidx.databinding.DataBindingUtil;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import cn.tommyfen.jetpackexercise.R;
import cn.tommyfen.jetpackexercise.databinding.ActivityRecyclerViewBinding;
import cn.tommyfen.mvvmsample.adapter.PeopleAdapter;
import cn.tommyfen.mvvmsample.bean.People;
import cn.tommyfen.mvvmsample.view_model.ViewModel4;

public class RecyclerViewActivity extends AppCompatActivity {

    private ActivityRecyclerViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler_view);
        ViewModel4 viewModel = new ViewModel4();
        binding.setViewModel(viewModel);

        setSupportActionBar(binding.toolBar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }



    }

    @Override
    protected void onResume() {
        super.onResume();

        PeopleAdapter adapter = new PeopleAdapter();
        binding.recyclerView.setAdapter(adapter);

        List<People> peopleList = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            People people = new People();
            people.setFullName("Tommy Fen " + i);
            people.setIntroduce("Android developer " + i);
            peopleList.add(people);
        }

        adapter.setPeopleList(peopleList);

    }
}

