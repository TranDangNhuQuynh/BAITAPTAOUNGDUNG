package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Thiết lập giao diện cho Activity này
        setContentView(R.layout.activity_register);

        // Ánh xạ TextView từ layout bằng ID
        TextView btn = findViewById(R.id.alreadyHaveAccount);

        // Thiết lập sự kiện khi nhấp chuột
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // TẠO INTENT CHUẨN:
                // Intent(Context hiện tại, Activity đích)
                // "RegisterActivity.this" cung cấp context chính xác
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);

                // Bắt đầu Activity mới (chuyển sang màn hình Đăng nhập)
                startActivity(intent);

            }
        });
    }
}