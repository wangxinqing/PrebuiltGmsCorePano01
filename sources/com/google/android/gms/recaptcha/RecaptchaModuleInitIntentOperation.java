package com.google.android.gms.recaptcha;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RecaptchaModuleInitIntentOperation extends hec {
    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        int i2 = i & 8;
        if ((i & 4) != 0 || i2 != 0) {
            jhg.a((Context) this, "com.google.android.gms.recaptcha.RecaptchaActivity", true);
        }
    }
}
