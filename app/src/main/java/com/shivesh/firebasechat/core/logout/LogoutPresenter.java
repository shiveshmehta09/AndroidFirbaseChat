package com.shivesh.firebasechat.core.logout;

/**
 * Author: Shivesh Karan Mehta
 * Created on: 10/2/2017 , 01:10 PM
 * Project: Chat Application Demo
 */

public class LogoutPresenter implements LogoutContract.Presenter, LogoutContract.OnLogoutListener {
    private LogoutContract.View mLogoutView;
    private LogoutInteractor mLogoutInteractor;

    public LogoutPresenter(LogoutContract.View logoutView) {
        mLogoutView = logoutView;
        mLogoutInteractor = new LogoutInteractor(this);
    }

    @Override
    public void logout() {
        mLogoutInteractor.performFirebaseLogout();
    }

    @Override
    public void onSuccess(String message) {
        mLogoutView.onLogoutSuccess(message);
    }

    @Override
    public void onFailure(String message) {
        mLogoutView.onLogoutFailure(message);
    }
}
