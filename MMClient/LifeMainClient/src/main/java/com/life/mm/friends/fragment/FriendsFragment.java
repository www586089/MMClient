package com.life.mm.friends.fragment;

import android.view.View;

import com.life.mm.R;
import com.life.mm.framework.app.base.fragment.BaseFragment;
import com.life.mm.friends.contract.FriendsContract;

/**
 * Created by Thinkpad on 2017/2/28.
 * 我的好友列表（互粉）
 */

public class FriendsFragment extends BaseFragment<FriendsContract.Presenter> {
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_friends;
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void initView(View rootView) {

    }

    @Override
    protected void doLazyLoad() {

    }
}
