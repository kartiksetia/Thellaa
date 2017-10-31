package in.thelaa.thelaa.views.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import butterknife.OnClick;
import in.thelaa.thelaa.R;
import in.thelaa.thelaa.mvp.views.LoginView;
import in.thelaa.thelaa.views.activities.base.BaseActivity;

public class LoginActivity extends BaseActivity implements LoginView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int getActivityLayout() {
        return R.layout.activity_login;
    }

    @OnClick(R.id.button_login)
    public void onLoginClicked(View view) {

        startActivity(new Intent(this, MainActivity.class));
    }

    @Override
    public void showErrorDialog(String title, String message) {

    }
}
