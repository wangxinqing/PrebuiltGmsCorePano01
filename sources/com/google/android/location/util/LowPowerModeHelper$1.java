package com.google.android.location.util;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LowPowerModeHelper$1 extends nla {
    final /* synthetic */ ajqi a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LowPowerModeHelper$1(ajqi ajqi, String str) {
        super(str);
        this.a = ajqi;
    }

    public final void a(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(action)) {
            ajqi ajqi = this.a;
            boolean c = ajqi.c();
            if (ajqi.a != c) {
                ajqi.a = c;
                ajqi.b(false);
            }
        } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
            this.a.a(false);
        } else if ("android.intent.action.SCREEN_ON".equals(action)) {
            this.a.a(true);
        }
    }
}
