package com.shivesh.firebasechat.core.registration;

import android.app.Activity;

import com.google.firebase.auth.FirebaseUser;

/**
 * Author: Shivesh Karan Mehta
 * Created on: 12/2/2017 , 05:10 PM
 * Project: Chat Application Demo
 */

public interface RegisterContract {
    interface View {
        void onRegistrationSuccess(FirebaseUser firebaseUser);

        void onRegistrationFailure(String message);
    }

    interface Presenter {
        void register(Activity activity, String email, String password);
    }

    interface Interactor {
        void performFirebaseRegistration(Activity activity, String email, String password);
    }

    interface OnRegistrationListener {
        void onSuccess(FirebaseUser firebaseUser);

        void onFailure(String message);
    }
}
