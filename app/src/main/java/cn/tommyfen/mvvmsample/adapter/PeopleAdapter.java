package cn.tommyfen.mvvmsample.adapter;

import androidx.databinding.DataBindingUtil;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.List;

import cn.tommyfen.jetpackexercise.R;
import cn.tommyfen.jetpackexercise.databinding.ItemPeopleBinding;
import cn.tommyfen.mvvmsample.bean.People;

/**
 * @author : tommy
 * @version : 1.0.0
 * @since : 2019-04-29
 * reference: https://github.com/erikjhordan-rey/People-MVVM
 */
public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.PeopleAdapterViewHolder> {

    private List<People> peopleList;

    public PeopleAdapter() {
        this.peopleList = Collections.emptyList();
    }

    @NonNull
    @Override
    public PeopleAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ItemPeopleBinding itemPeopleBinding = DataBindingUtil.inflate(
                LayoutInflater.from(viewGroup.getContext()), R.layout.item_people,
                viewGroup, false);
        return new PeopleAdapterViewHolder(itemPeopleBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull PeopleAdapterViewHolder peopleAdapterViewHolder, int i) {
        peopleAdapterViewHolder.bindPeople(peopleList.get(i));
    }

    @Override
    public int getItemCount() {
        return null == peopleList ? 0 : peopleList.size();
    }

    public void setPeopleList(List<People> peopleList) {
        this.peopleList = peopleList;
        notifyDataSetChanged();
    }

    static class PeopleAdapterViewHolder extends RecyclerView.ViewHolder {

        ItemPeopleBinding mItemPeopleBinding;

        public PeopleAdapterViewHolder(ItemPeopleBinding itemPeopleBinding) {
            super(itemPeopleBinding.getRoot());
            mItemPeopleBinding = itemPeopleBinding;
        }

        void bindPeople(People people) {
            mItemPeopleBinding.setPeople(people);
        }
    }
}
