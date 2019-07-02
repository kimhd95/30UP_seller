package com.openhack.market30;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUp extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        EditText id = (EditText)findViewById(R.id.et_id);
        EditText pw = (EditText)findViewById(R.id.et_pw);
        EditText pw_confirm = (EditText)findViewById(R.id.et_pw_confirm);
        EditText phone = (EditText)findViewById(R.id.et_phone);
        EditText business = (EditText)findViewById(R.id.et_business);
        EditText registration = (EditText)findViewById(R.id.et_registration);
        Button submitBtn = (Button)findViewById(R.id.btn_submit);
        ImageButton searchBtn = (ImageButton)findViewById(R.id.btn_search);

//        login_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String userId = id_txt.getText().toString();
//                String userPwd = pwd_txt.getText().toString();
//
//                if (userId.equals("")) {
//                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
//                    dialog = builder.setMessage("Input id, please")
//                            .setNegativeButton("Check", null)
//                            .create();
//                    dialog.show();
//                }
//
//                if (userPwd.equals("")) {
//                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
//                    dialog = builder.setMessage("Input password, please")
//                            .setNegativeButton("Check", null)
//                            .create();
//                    dialog.show();
//                }
//
//                Response.Listener<String> response_listener = new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        try {
//                            JSONObject json_response = new JSONObject(response);
//                            boolean success = json_response.getBoolean("success");
//                            if (success) {
//                                login_id = json_response.getString("id");
//                                login_pwd = json_response.getString("pwd");
//                                Intent main_intent = new Intent(LoginActivity.this, com.openhack.market30.MainActivity.class);
//                                LoginActivity.this.startActivity(main_intent);
//                                finish();
//                            }
//                            else {
//                                AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
//                                dialog = builder.setMessage("Fail Login")
//                                        .setNegativeButton("Check", null)
//                                        .create();
//                                dialog.show();
//                            }
//                        }
//                        catch (Exception e)  {
//                            e.printStackTrace();
//                        }
//                    }
//                };
//
//                LoginRequest login_request = new LoginRequest(userId, userPwd, response_listener);
//                RequestQueue queue = Volley.newRequestQueue(LoginActivity.this);
//                queue.add(login_request);
//            }
//        });
        // 검색
        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(SignUp.this, BarcodeScan.class);
//                SignUp.this.startActivity(intent);
            }
        });
        // 가입완료
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUp.this, LoginActivity.class);
                SignUp.this.startActivity(intent);
            }
        });
    }
}
