package org.easydarwin.easyplayer.main.fragments;


import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.juntai.wisdom.basecomponent.base.BaseMvpFragment;
import com.juntai.wisdom.basecomponent.utils.ToastUtils;

import org.easydarwin.easyplayer.R;
import org.easydarwin.easyplayer.base.BaseRecyclerviewFragment;
import org.easydarwin.easyplayer.main.MainPageContract;
import org.easydarwin.easyplayer.main.MainPagePresent;


/**
 * @aouther tobato
 * @description 描述  homepage
 * @date 2021/4/18 14:59
 */
public class HomePageFragment extends BaseRecyclerviewFragment<MainPagePresent> implements MainPageContract.IMainPageView,
        View.OnClickListener {

    @Override
    protected int getLayoutRes() {
        return R.layout.recycleview_layout;
    }

    @Override
    protected void initView() {
        super.initView();
        mSmartrefreshlayout.setEnableLoadMore(false);
        adapter.setNewData(getBaseActivity().getTestData());
    }

    @Override
    protected void freshlayoutOnLoadMore() {

    }

    @Override
    protected void freshlayoutOnRefresh() {

    }

    @Override
    protected BaseQuickAdapter getAdapter() {
        return new DevListAdapter(R.layout.video_source_item);
    }

    @Override
    protected void initData() {
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onResume() {
        super.onResume();
    }


    @Override
    protected void lazyLoad() {
    }

    @Override
    protected MainPagePresent createPresenter() {
        return new MainPagePresent();
    }


    @Override
    public void onSuccess(String tag, Object o) {
    }

    @Override
    public void onError(String tag, Object o) {
        ToastUtils.error(mContext, String.valueOf(o));
    }


    @Override
    public void onClick(View v) {
    }
}