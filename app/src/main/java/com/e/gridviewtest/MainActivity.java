package com.e.gridviewtest;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    List<Bean> data;

    Bean bean;

    GridViewAdapter gridViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.girdView);
        data = new ArrayList<>();

        //图片数据
        int[] images = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3,
                R.drawable.pic4, R.drawable.pic5, R.drawable.pic6,
                R.drawable.pic7, R.drawable.pic8, R.drawable.pic9,
                R.drawable.pic10, R.drawable.pic11, R.drawable.pic12,
                R.drawable.pic13, R.drawable.pic14, R.drawable.pic15};
        //图片编号
        String[] name = {"No.1", "No.2", "No.3", "No.4", "No.5", "No.6",
                "No.7", "No.8", "No.9", "No.10", "No.11", "No.12",
                "No.13", "No.14", "No.15"};

        /*
        //第一种写法
        //初始化数据
        List<Map<String, Object>> data = new ArrayList<>();
        for (int i = 0; i < images.length; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("ItemImage", images[i]);
            //如果只需要显示图片，可以不用这一行，需要同时将from和to中的相关内容删去
            map.put("ItemText", name[i]);
            data.add(map);
        }
        //from数组中的是map-key的值，to数组和from是相对应的
        String[] from = {"ItemImage", "ItemText"};
        int[] to = {R.id.image1, R.id.text1};
        //实例化一个适配器
        SimpleAdapter adapter = new SimpleAdapter(this, data, R.layout.item, from, to);
        */

        //第二种写法
        //初始化数据
        for (int i = 0; i < images.length; i++) {
            bean = new Bean(images[i], name[i]);
            data.add(bean);
        }
        //实例化适配器
        gridViewAdapter = new GridViewAdapter(data, this);

        //设置适配器
        gridView.setAdapter(gridViewAdapter);
    }
}
