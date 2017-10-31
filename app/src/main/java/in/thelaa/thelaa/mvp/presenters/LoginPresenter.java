package in.thelaa.thelaa.mvp.presenters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import in.thelaa.thelaa.mvp.models.LoginModel;
import in.thelaa.thelaa.mvp.presenters.base.BasePresenter;
import in.thelaa.thelaa.mvp.views.LoginView;
import in.thelaa.thelaa.views.activities.MainActivity;
import rx.Subscriber;


/**
 * Created by kartik on 25/12/2016.
 */
public class LoginPresenter extends BasePresenter<LoginModel, LoginView> {

    private Context mContext;

    private Subscriber mSubscriber;

    public LoginPresenter(Context context,
                          LoginModel model
                          ) {
        super();
        mContext = context;
        mModel = model;

    }

    @Override
    public void onCreate() {

        if (checkUserAlreadyLoggedIn()){
            navigateToMainScreen();
            finishCurrentActivity();
        }
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    protected void updateView() {

    }

    /**
     * Starts the user login process using the web identity provider of Auth0.
     */
    public void login(){

    }

    /**
     * Starts the user authorization process using the web identity provider of Auth0.
     *
     * @param requestCode The request code for the activity.
     * @param resultCode The result code for the activity.
     * @param data The data received from Auth0.
     */
    public void authorize(int requestCode, int resultCode, Intent data){

    }

    /**
     * Starts the user verification process using the vyn resr api.
     */
    public void verify(){


    }

    /**
     * Initializes the subscriber.
     */
    private void initSubscriber() {

    }

    /**
     * Navigates to the main screen.
     */
    public void navigateToMainScreen() {

        Intent intent = new Intent(mContext, MainActivity.class);
        mContext.startActivity(intent);
    }

    /**
     * Stores the authentication tokens.
     *
     * @param accessToken The access token.
     * @param idToken The id token.
     * @param refreshToken The refresh token.
     */
    public void storeTokens(String accessToken, String idToken, String refreshToken){

    }

    /**
     * Unsubscribes the subscriber.
     */
    private void unsubscribeSubscriber() {
        if (mSubscriber != null) {
            mSubscriber.unsubscribe();
            mSubscriber = null;
        }
    }




    /**
     * Checks if the current user is already logged in.
     *
     * @return True if the current user is logged in, else false.
     */
    private boolean checkUserAlreadyLoggedIn() {

        return true;
    }

    /**
     * Finishes the current activity.
     */
    private void finishCurrentActivity() {
        ((Activity)mContext).finish();
    }
}
