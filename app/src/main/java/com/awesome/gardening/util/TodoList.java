package com.awesome.gardening.util;

public class TodoList {

    // TODO: 2020/3/4 what's androidx.navigation.fragment.NavHostFragment
    // TODO: 2020/3/4 what does app:defaultNavHost="true" means?
    // TODO: 2020/3/4 <navigation>
    // https://www.jianshu.com/p/ad040aab0e66




    // TODO: 2020/3/4 android:fitsSystemWindows="true">  60%
    // part1: basic fitSystemWindows https://www.cnblogs.com/xgjblog/p/9517645.html
    // 1. when statusBar or navigationBar is translucent && api > 19 && flags (FLAG_TRANSLUCENT_NAVIGATION and
    // FLAG_TRANSLUCENT_STATUS) is set
    // 2. fitsSystemWindows is true(default is false) will leave space for navigationBar and statusBar and
    // we can use app:statusBarBackground="some color" to set the bg of statusBar
    // besides, Some Layout like CoordinatorLayout and its child layout have their own way to handle this.


    // TODO: 2020/3/4 ?attr/ v.s. style 100%
    // style is fixed and won't change when theme changes, while ?attr or ?android:attr will change when theme changes.
    //    <style name="AppTheme" parent="Theme.MaterialComponents.DayNight.NoActionBar"?
    //        ...
    //        <item name="colorAccent">@color/colorAccent</item>
    //    </style>
    //
    //    <style name="Theme.Gardening" parent="Theme.MaterialComponents.DayNight.NoActionBar">
    //        ...
    //        <item name="colorAccent">@android:color/holo_orange_light</item>
    //    </style>
    // you can use ?attr/colorAccent，when current theme is AppTheme the colorAccent is color/colorAccent,
    // when theme changes to Theme.Gardening, the colorAccent is @android:color/holo_orange_light





    // TODO: 2020/3/4 CoordinatorLayout
    // from its name `coordinator`, we know it is used to coordinate its child views.
//    <CoordinatorLayout>
//        <AppbarLayout/>
//        <scrollableView/>
//        <FloatingActionButton/>
//    </CoordinatorLayout>




    // TODO: 2020/3/4 androidx.viewpager2.widget.ViewPager2
    // TODO: 2020/3/4 com.google.android.material.appbar.CollapsingToolbarLayout ??


    // TODO: 2020/3/5 tools:text= v.s. android:text when preview
    // https://www.jianshu.com/p/2912bcba4465

    // TODO: 2020/3/5 android:clipToPadding="false"

    // TODO: 2020/3/5 android:tint="@android:color/white"
    // to save apk size by using less resources

    // TODO: 2020/3/5 app:layout_scrollFlags="scroll|exitUntilCollapsed"
    // TODO: 2020/3/5 app:layout_collapseMode="pin"
    // TODO: 2020/3/5 androidx.core.widget.NestedScrollView
    // TODO: 2020/3/5 app:layout_behavior="@string/appbar_scrolling_view_behavior">
    // TODO: 2020/3/5 com.google.android.material.appbar.AppBarLayout
    // TODO: 2020/3/5 com.google.android.material.appbar.CollapsingToolbarLayout
    // TODO: 2020/3/5 app:shapeAppearance
}
