package com.lmiot.tiblebarlibrary;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * 创建日期：2017-11-13 14:41
 * 作者:Mr Li
 * 描述:
 */
public class LmiotTitleBar extends RelativeLayout {

    private onItemClickListener onItemClickListener;
    private ImageView mBack;
    private ImageView mIv_menu;
    private TextView mTitle;
    private TextView mMenu;
    private RelativeLayout mMain;

    public void setOnItemClickListener(LmiotTitleBar.onItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public LmiotTitleBar(Context context) {
        super(context);
    }


    public LmiotTitleBar(Context context, AttributeSet attrs) {
        super(context, attrs);

        int colorAccent = getResources().getColor(R.color.colorAccent);
        int white = getResources().getColor(R.color.white);

        TypedArray attributes = context.obtainStyledAttributes(attrs, R.styleable.LmiotTitleBar);


        int imgBack = attributes.getResourceId(R.styleable.LmiotTitleBar_iv_back, R.drawable.title_back);
        int imgMenu = attributes.getResourceId(R.styleable.LmiotTitleBar_iv_menu, R.drawable.title_menu);
        String tvTitle = attributes.getString(R.styleable.LmiotTitleBar_tv_title);
        String tvMenu = attributes.getString(R.styleable.LmiotTitleBar_tv_menu);
        boolean showImgMenu = attributes.getBoolean(R.styleable.LmiotTitleBar_show_iv_menu, false);
        boolean showTvMenu = attributes.getBoolean(R.styleable.LmiotTitleBar_show_tv_menu, false);
        int tibleBg = attributes.getColor(R.styleable.LmiotTitleBar_titlebar_bg, colorAccent);
        int titleColor = attributes.getColor(R.styleable.LmiotTitleBar_text_color_title, white);
        int menuColor = attributes.getColor(R.styleable.LmiotTitleBar_text_color_menu, white);

        View inflate = LayoutInflater.from(context).inflate(R.layout.title_bar_layout, this, true);

        mBack = inflate.findViewById(R.id.btn_back);
        mIv_menu = inflate.findViewById(R.id.iv_menu);
        mTitle = inflate.findViewById(R.id.tv_title);
        mMenu = inflate.findViewById(R.id.tv_menu);
        mMain = inflate.findViewById(R.id.id_main);

        mBack.setImageResource(imgBack);
        mIv_menu.setImageResource(imgMenu);
        mTitle.setText(tvTitle);
        mMenu.setText(tvMenu);
        mIv_menu.setVisibility(showImgMenu ? VISIBLE : GONE);
        mMenu.setVisibility(showTvMenu ? VISIBLE : GONE);
        mMain.setBackgroundColor(tibleBg);
        mTitle.setTextColor(titleColor);
        mMenu.setTextColor(menuColor);


        mTitle.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onItemClickListener != null) {
                    onItemClickListener.onTitleClick(view);
                }
            }
        });

        mBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onItemClickListener != null) {
                    onItemClickListener.onBackClick(view);
                }

            }
        });

        mIv_menu.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                if (onItemClickListener != null) {
                    onItemClickListener.onMenuClick(view);
                }
            }
        });

        mMenu.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onItemClickListener != null) {
                    onItemClickListener.onMenuClick(view);
                }

            }
        });


    }


    /**
     * 监听点击事件
     */
    public interface onItemClickListener {
        void onBackClick(View var1);
        void onMenuClick(View var1);
        void onTitleClick(View var1);
    }


    /**
     * 设置返回图片
     * @param resID
     */
    public void setImgBack(int resID) {
        mBack.setImageResource(resID);
    }

    /**
     * 设置菜单图片
     * @param resID
     */
    public void setImgMenu(int resID) {
        mIv_menu.setImageResource(resID);
    }

    /**
     * 设置标题
     * @param tvTitle
     */
    public void setTitle(String tvTitle) {
        mTitle.setText(tvTitle);
    }

    /**
     * 设置菜单
     * @param tvMenu
     */
    public void setMenu(String tvMenu) {
        mMenu.setText(tvMenu);
    }

    /**
     * 设置背景颜色
     * @param tibleBg
     */
    public void setBg(int tibleBg) {
        mMain.setBackgroundColor(tibleBg);
    }

    /**
     * 设置标题颜色
     * @param titleColor
     */
    public void setTitleColor(int titleColor) {
        mTitle.setTextColor(titleColor);
    }

    /**
     * 设置菜单颜色
     * @param menuColor
     */
    public void setMenuColor(int menuColor) {
        mMenu.setTextColor(menuColor);
    }

    /**
     * 显示菜单（文字）
     * @param showTvMenu
     */
    public void showTvMenu(Boolean  showTvMenu) {
        mMenu.setVisibility(showTvMenu ? VISIBLE : GONE);
    }

    /**
     * 显示菜单（图片）
     * @param showImgMenu
     */
    public void showIvMenu(Boolean  showImgMenu) {
        mIv_menu.setVisibility(showImgMenu ? VISIBLE : GONE);
    }





}
