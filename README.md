# LmiotTitleBar
  自定义TitleBar
  
  

## 一.首先在项目的gradle中引用：

    allprojects {
    repositories {
        jcenter()
        maven { url 'https://jitpack.io' } //此处插入 
        }
    }



## 二.其次在dependencies中添加：
<pre><code>
dependencies {
    compile 'com.github.lmiot:TitleBarSDK:1.0'
}
</code></pre>


## 四.XML中：
    <com.lmiot.tiblebarlibrary.LmiotTitleBar
        android:id="@+id/id_lmiot_title_bar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:tv_title="标题"
        app:tv_menu="菜单"
        app:show_iv_menu="true"
        app:show_tv_menu="false"
        app:iv_back="@drawable/title_back"
        app:iv_menu="@drawable/title_menu"
        app:titlebar_bg="@color/colorAccent"
        app:text_color_title="@color/white"
        app:text_color_menu="@color/white"
        />


## 五.对外提供的方法：
      public void setImgBack(int resID) //设置返回图片
      public void setImgMenu(int resID)//设置菜单图片
      public void setTitle(String tvTitle) //设置标题
      public void setMenu(String tvMenu) // 设置菜单
      public void setBg(int tibleBg) //设置背景颜色
      public void setTitleColor(int titleColor) //设置标题颜色
      public void setMenuColor(int menuColor) //设置菜单颜色
      public void showTvMenu(Boolean  showTvMenu) //显示菜单（文字）
      public void showIvMenu(Boolean  showImgMenu) //显示菜单（图片）

## 六.Java中监听按钮：返回，标题，菜单

     lmiotTitleBar.setOnItemClickListener(new LmiotTitleBar.onItemClickListener() {
               @Override
               public void onBackClick(View var1) {
                   //返回键点击监听

               }

               @Override
               public void onMenuClick(View var1) {

                   //菜单键返回监听

               }

               @Override
               public void onTitleClick(View var1) {
                   //标题点击监听

               }
           });



## 六.参考效果图：
![](https://github.com/alijiahua/Image/blob/master/circleCorlorBg.png)
