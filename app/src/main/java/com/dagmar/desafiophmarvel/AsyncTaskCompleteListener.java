package com.dagmar.desafiophmarvel;

public interface AsyncTaskCompleteListener {

    void onSuccess(String response);
    void onFailed(int statusCode, String msg);

}
