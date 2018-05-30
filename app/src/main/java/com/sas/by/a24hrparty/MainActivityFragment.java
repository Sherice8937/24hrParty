package com.sas.by.a24hrparty;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sas.by.a24hrparty.databinding.ActivityMainBinding;


/**
 * Created by Sherice on 5/29/18.
 */

public class MainActivityFragment extends Fragment {

    ActivityMainBinding mBinding;

    public static MainActivityFragment newInstance() {

        Bundle args = new Bundle();

        MainActivityFragment fragment = new MainActivityFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        mBinding = DataBindingUtil.setContentView(getActivity(), R.layout.main_fragment);


        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
