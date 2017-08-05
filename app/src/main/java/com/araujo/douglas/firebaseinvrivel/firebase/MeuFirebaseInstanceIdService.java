package com.araujo.douglas.firebaseinvrivel.firebase;

import android.util.Log;

import com.google.firebase.iid.*;

/**
 * Created by logonrm on 05/08/2017.
 */

public class MeuFirebaseInstanceIdService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String resefhedToken = FirebaseInstanceId.getInstance().getToken();

        sendRegistrationToServer(resefhedToken);

    }

    private void sendRegistrationToServer(String resefhedToken) {
        Log.d("TOKEN", resefhedToken);
    }
}
