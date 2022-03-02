package com.google.android.gms.auth;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UserRecoverableAuthException extends eif {
    private final Intent a;

    public UserRecoverableAuthException(String str, Intent intent) {
        super(str);
        this.a = intent;
    }

    public final Intent a() {
        Intent intent = this.a;
        if (intent != null) {
            return new Intent(intent);
        }
        return null;
    }
}
