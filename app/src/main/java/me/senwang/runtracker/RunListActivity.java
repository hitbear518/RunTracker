package me.senwang.runtracker;

import android.app.Fragment;
import android.app.ListActivity;

public class RunListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new RunListFragment();
    }
}
