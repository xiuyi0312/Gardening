package com.awesome.gardening.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.awesome.gardening.GardenFragment;
import com.awesome.gardening.PlantListFragment;

import java.util.ArrayList;
import java.util.List;

public class HomeViewPagerAdapter extends FragmentStateAdapter {

    private List<Fragment> fragmentList;

    public HomeViewPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
        fragmentList = new ArrayList<>();
        fragmentList.add(new GardenFragment());
        fragmentList.add(new PlantListFragment());
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getItemCount() {
        return fragmentList.size();
    }
}
