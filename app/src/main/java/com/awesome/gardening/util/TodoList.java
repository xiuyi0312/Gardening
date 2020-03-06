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

    // TODO: 2020/3/6 Lifecycle
    // 是一个类，它持有关于组件（如 Activity 或 Fragment）生命周期状态的信息，并且允许其他对象观察此状态。
    // 3 main components: LifeCycleOwner、LifeCycle、LifeCycleObserver

    // TODO: 2020/3/6 ViewModel
    // 新的ViewModel组件直接对ViewModel层进行了标准化的规范，即使用ViewModel(或者其子类AndroidViewModel
    // Google官方建议ViewModel尽量保证 纯的业务代码，不要持有任何View层(Activity或者Fragment)或Lifecycle的
    // 引用，这样保证了ViewModel内部代码的可测试性，避免因为Context等相关的引用导致测试代码的难以编写（比如，
    // MVP中Presenter层代码的测试就需要额外成本，比如依赖注入或者Mock，以保证单元测试的进行）。
//            1.规范化了ViewModel的基类；
//            2.ViewModel不会随着Activity的屏幕旋转而销毁；
//            3.在对应的作用域内，保正只生产出对应的唯一实例，保证UI组件间的通信。

    // TODO: 2020/3/6 LiveData
    // 如你所见，LiveData实际上就像一个 容器, 本文中它存储了一个String类型的引用，每当这个容器内 String的数据
    // 发生变化，我们都能在回调函数中进行对应的处理，比如 Toast。
    // 通过在observe方法中利用LifeCycle来监听状态，可以及时在destroy中removeObserver，避免内存泄漏
    // LiveData原生的API提供了2种方式供开发者更新数据, 分别是 setValue()和postValue()

    // TODO: 2020/3/6 DataBinding 双向绑定

    // TODO: 2020/3/6 WorkManager

    // TODO: 2020/3/6 Room
    // 毫无疑问，Room在众多SQLite的ORM框架中占据着主导地位。

}
