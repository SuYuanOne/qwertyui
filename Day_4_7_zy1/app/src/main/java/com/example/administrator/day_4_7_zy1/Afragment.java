package com.example.administrator.day_4_7_zy1;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;

import java.nio.file.Path;

import static com.example.administrator.day_4_7_zy1.R.layout.fragment_list;

public class Afragment extends Fragment{

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        View inflate = LayoutInflater.from(Context).inflate(fragment_list, false);
        return inflate ;
    }
}
