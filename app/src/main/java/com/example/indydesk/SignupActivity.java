package com.example.indydesk;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignupActivity extends AppCompatActivity {


        private EditText inputEmail;
        private EditText inputPassword;
        private EditText  inputName;
        private EditText inputAddress;
        private EditText inputPhone;
        private Button btnSignIn, btnSignUp, btnResetPassword;
        private ProgressBar progressBar;
        private FirebaseAuth auth;
        String name,email,address,password,phone;
        androidx.appcompat.widget.Toolbar  toolbar;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            //FirebaseApp.initializeApp(this);
            setContentView(R.layout.activity_signup);

            /*toolbar= findViewById(R.id.toolbar_signup);
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle("Sign UP");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
*/

            auth = FirebaseAuth.getInstance();

            btnSignIn = (Button) findViewById(R.id.sign_in_button);
            btnSignUp = (Button) findViewById(R.id.sign_up_button);
            inputEmail = (EditText) findViewById(R.id.email);
            inputName = (EditText) findViewById(R.id.name);
            inputAddress = (EditText) findViewById(R.id.address);
            inputPhone= (EditText) findViewById(R.id.phone_number);
            inputPassword = (EditText) findViewById(R.id.password);
            progressBar = (ProgressBar) findViewById(R.id.progressBar);
            //btnResetPassword = (Button) findViewById(R.id.btn_reset_password);



            btnSignIn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });

            btnSignUp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    name = inputName.getText().toString().trim();
                    address = inputAddress.getText().toString().trim();
                    email = inputEmail.getText().toString().trim();
                    phone = inputPhone.getText().toString().trim();
                    password = inputPassword.getText().toString().trim();
                    System.out.println(name+" "+email+" "+" "+phone+" "+password);
                    if (TextUtils.isEmpty(name)) {
                        Toast.makeText(getApplicationContext(), "Enter Name!", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if (TextUtils.isEmpty(address)) {
                        Toast.makeText(getApplicationContext(), "Enter address!", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (TextUtils.isEmpty(email)) {
                        Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if (TextUtils.isEmpty(phone)) {
                        Toast.makeText(getApplicationContext(), "Enter Phone Number!", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (TextUtils.isEmpty(password)) {
                        Toast.makeText(getApplicationContext(), "Enter password!", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (password.length() < 6) {
                        Toast.makeText(getApplicationContext(), "Password too short, enter minimum 6 characters!", Toast.LENGTH_SHORT).show();
                        return;
                    }
/**/


                    progressBar.setVisibility(View.VISIBLE);
                    auth.createUserWithEmailAndPassword(email, password)
                            .addOnCompleteListener(SignupActivity.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    Toast.makeText(SignupActivity.this, "createUserWithEmail:onComplete:" + task.isSuccessful(), Toast.LENGTH_SHORT).show();

                                    progressBar.setVisibility(View.GONE);
                                    // If sign in fails, display a message to the user. If sign in succeeds
                                    // the auth state listener will be notified and logic to handle the
                                    // signed in user can be handled in the listener.
                                    if (!task.isSuccessful()) {
                                        Toast.makeText(SignupActivity.this, "Authentication failed." + task.getException(),
                                                Toast.LENGTH_SHORT).show();
                                    } else {
                                        Toast.makeText(SignupActivity.this, "Thank You for Registration" + task.isSuccessful(), Toast.LENGTH_SHORT).show();

                                        startActivity(new Intent(SignupActivity.this, Shop.class));
                                        finish();
                                    }
                                }
                            });

                }
            });
        }

        @Override
        protected void onResume() {
            super.onResume();

            progressBar.setVisibility(View.GONE);
        }
    }
