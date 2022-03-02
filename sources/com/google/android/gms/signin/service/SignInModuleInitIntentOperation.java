package com.google.android.gms.signin.service;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SignInModuleInitIntentOperation extends hec {
    private static final iwd a = abeb.b("SignInModuleInitIntentOperation");

    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        try {
            jhg.a(getApplicationContext(), "com.google.android.gms.signin.activity.ConsentActivity", true);
        } catch (IllegalArgumentException e) {
            a.e("com.google.android.gms.signin.activity.ConsentActivity not present yet.", new Object[0]);
        }
    }
}
