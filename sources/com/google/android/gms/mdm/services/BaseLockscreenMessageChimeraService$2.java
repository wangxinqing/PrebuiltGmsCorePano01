package com.google.android.gms.mdm.services;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.android.volley.Response;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BaseLockscreenMessageChimeraService$2 extends nla {
    public BaseLockscreenMessageChimeraService$2(String str) {
        super(str);
    }

    public final void a(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            snb.e(context);
            snb.f(context);
            smh.a(new avuj[]{avuj.SCREEN_UNLOCKED}, (Location) null, (avtx) null, (avty) null, (String) smo.l.a(), (avue) null, snh.a(context), (String) null, (Response.Listener) null, (Response.ErrorListener) null);
            smu.a(context);
        }
    }
}
