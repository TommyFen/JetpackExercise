package cn.tommyfen.mvvmsample.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;

/**
 * @author : tommy
 * @version : 1.0.0
 * @since : 2019-04-28
 * reference: https://blog.csdn.net/mq2553299/article/details/72773265
 */
public abstract class BaseBindingAdapter<T, D extends ViewDataBinding> extends RecyclerView.Adapter<BaseBindingAdapter.BaseViewHolder<D>> {

    private List<T> mDatas;
    private int layoutId;

    public BaseBindingAdapter(List<T> mDatas, int layoutId) {
        this.mDatas = mDatas;
        this.layoutId = layoutId;
    }

    @NonNull
    @Override
    public BaseViewHolder<D> onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        BaseViewHolder<D> viewHolder = new BaseViewHolder<>((D) DataBindingUtil.inflate(inflater, layoutId, viewGroup, false));
        //abstract method
        onCreateViewHolder(viewHolder);
        return viewHolder;
    }

    public abstract void onCreateViewHolder(BaseViewHolder<D> holder);

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder<D> dBaseViewHolder, int i) {
        // all item's layout that have variable: data(T), itemPresenter(ItemPresenter).
        //reference: https://developer.android.google.cn/topic/libraries/data-binding/generated-binding
//        holder.getBinding().setVariable(BR.data, mDatas.get(position));
//        holder.getBinding().setVariable(BR.itemPresenter, new ItemPresenter());
//        holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return mDatas != null ? mDatas.size() : 0;
    }

    static class BaseViewHolder<K extends ViewDataBinding> extends RecyclerView.ViewHolder {

        protected final K binding;

        public BaseViewHolder(@NonNull K k) {
            super(k.getRoot());
            this.binding = k;
        }

        public K getBinding() {
            return binding;
        }
    }
}
