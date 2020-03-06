package com.awesome.gardening;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.Navigation;

import com.awesome.gardening.databinding.ActivityMainBinding;

/**
 * the main activity to show my garden and those plants available
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION |
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//        }
//        DataBindingUtil.setContentView(this, R.layout.activity_main);
        setContentView(ActivityMainBinding.inflate(LayoutInflater.from(this)).getRoot());
    }

    /**
     * 用于拦截Back键
     * app:defaultNavHost="true"这个属性意味着你的NavGraphFragment将会
     * 拦截系统Back键的点击事件（因为系统的back键会直接关闭Activity而非切换Fragment）
     * @return
     */
//    @Override
//    public boolean onSupportNavigateUp() {
//        return Navigation.findNavController(this, R.id.nav_host).navigateUp();
//    }
}
