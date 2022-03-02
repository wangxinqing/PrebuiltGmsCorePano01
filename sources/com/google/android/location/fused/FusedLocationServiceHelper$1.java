package com.google.android.location.fused;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FusedLocationServiceHelper$1 extends nla {
    final /* synthetic */ aiei a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FusedLocationServiceHelper$1(aiei aiei, String str) {
        super(str);
        this.a = aiei;
    }

    public final void a(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.USER_FOREGROUND".equals(action)) {
            this.a.e.a();
        } else if ("android.intent.action.USER_BACKGROUND".equals(action)) {
            this.a.e.b();
        }
    }
}
