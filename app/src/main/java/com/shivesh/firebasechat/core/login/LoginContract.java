package com.shivesh.firebasechat.core.login;

import android.app.Activity;

/**
 * Author: Shivesh Karan Mehta
 * Created on: 10/2/2017 , 11:06 AM
 * Project: Chat Application Demo
 */

public interface LoginContract {
    interface View {
        void onLoginSuccess(String message);

        void onLoginFailure(String message);
    }

    interface Presenter {
        void login(Activity activity, String email, String password);
    }

    interface Interactor {
        void performFirebaseLogin(Activity activity, String email, String password);
    }

    interface OnLoginListener {
        void onSuccess(String message);

        void onFailure(String message);
    }
}
