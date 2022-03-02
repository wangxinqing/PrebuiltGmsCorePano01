package com.android.volley;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AuthFailureError extends VolleyError {
    private Intent b;

    public AuthFailureError() {
    }

    public String getMessage() {
        return this.b == null ? super.getMessage() : "User needs to (re)enter credentials.";
    }

    public Intent getResolutionIntent() {
        return this.b;
    }

    public AuthFailureError(Intent intent) {
        this.b = intent;
    }

    public AuthFailureError(NetworkResponse networkResponse) {
        super(networkResponse);
    }

    public AuthFailureError(String str) {
        super(str);
    }

    public AuthFailureError(String str, Exception exc) {
        super(str, exc);
    }
}
