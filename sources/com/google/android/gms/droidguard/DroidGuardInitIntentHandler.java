package com.google.android.gms.droidguard;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DroidGuardInitIntentHandler extends hec {
    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        try {
            mam mam = new mam(this);
            mam.a.getPackageManager().setComponentEnabledSetting(new ComponentName("com.google.android.gms", "com.google.android.gms.droidguard.DroidGuardGcmTaskService"), 1, 1);
            mam.b();
        } catch (Exception e) {
            lyp.a((Context) this).a((Throwable) e);
        }
    }
}
