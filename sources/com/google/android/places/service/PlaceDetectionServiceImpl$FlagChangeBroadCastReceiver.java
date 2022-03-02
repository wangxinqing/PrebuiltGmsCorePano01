package com.google.android.places.service;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlaceDetectionServiceImpl$FlagChangeBroadCastReceiver extends nla {
    private final akup a;

    public PlaceDetectionServiceImpl$FlagChangeBroadCastReceiver(akup akup) {
        super("places");
        this.a = akup;
    }

    public final void a(Context context, Intent intent) {
        String action = intent.getAction();
        if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action) || "com.google.android.gms.phenotype.COMMITTED".equals(action)) {
            akup akup = this.a;
            if (azbz.b() != akup.f) {
                akup.a();
            }
            akup.f = azbz.b();
        }
    }
}
