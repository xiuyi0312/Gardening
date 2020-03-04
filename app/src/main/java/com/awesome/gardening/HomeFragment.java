package com.awesome.gardening;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.awesome.gardening.adapter.HomeViewPagerAdapter;
import com.awesome.gardening.databinding.FragmentHomeBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentHomeBinding binding = FragmentHomeBinding.inflate(inflater, container, false);
        TabLayout tabLayout = binding.tabLayout;
        ViewPager2 viewPager2 = binding.viewPager2;
        viewPager2.setAdapter(new HomeViewPagerAdapter(this));

        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setIcon(getTabIconAt(position));
                tab.setText(getTabTextAt(position));
            }
        }).attach();

        ((AppCompatActivity) getActivity()).setSupportActionBar(binding.toolbar);
        return binding.getRoot();
    }

    public int getTabIconAt(int position) {
        if (position == 0) {
            return R.drawable.garden_tab_selector;
        } else {
            return R.drawable.plant_list_tab_selector;
        }
    }

    public String getTabTextAt(int position) {
        if (position == 0) {
            return "My Garden";
        } else {
            return "Plant List";
        }
    }
}
