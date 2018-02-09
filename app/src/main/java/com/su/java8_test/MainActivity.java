package com.su.java8_test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.su.java8_test.defaultMethods.MyInterface;
import com.su.java8_test.defaultMethods.UseInterfaceUtils;


public class MainActivity extends AppCompatActivity {

    private TextView mResultTv;
    private TextView mCodeTv;

    private UseInterfaceUtils mUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mUtils = new UseInterfaceUtils();


    }

    public void onBtnClick(View v) {
        switch (v.getId()) {
            case R.id.btn_for_interface:
                mResultTv.setText(mUtils.getIntrodution() + "\n"
                        + mUtils.getDelautMethod() + "\n"
                        + MyInterface.getStaticMethod());

                mCodeTv.setText("UseInterfaceUtils mUtils = new UseInterfaceUtils();\n\n"

                        + "mUtils.getIntrodution() \n"
                        + "mUtils.getDelautMethod()\n"
                        + "MyInterface.getStaticMethod()\n\n"

                        + "    default String getDelautMethod() {\n" +
                        "        return \"这是默认方法\";\n" +
                        "    }");
                break;
        }
    }

    private void initView() {
        mResultTv = (TextView) findViewById(R.id.tv_result);
        mCodeTv = (TextView) findViewById(R.id.tv_code);
    }

}
