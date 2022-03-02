package com.google.android.location.geofencer.service;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GeofencerStateMachine$Receiver extends nla {
    final /* synthetic */ aing a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GeofencerStateMachine$Receiver(aing aing) {
        super("location");
        this.a = aing;
    }

    public final void a(Context context, Intent intent) {
        String action = intent.getAction();
        aing aing = this.a;
        int i = aing.E;
        if (aing.s.matchAction(intent.getAction())) {
            aing aing2 = this.a;
            synchronized (aing2.k) {
                boolean z = aikq.a;
                aing2.b(9, intent);
            }
        } else if ("android.intent.action.USER_BACKGROUND".equals(action) || "android.intent.action.USER_FOREGROUND".equals(action)) {
            aing aing3 = this.a;
            synchronized (aing3.k) {
                if (Log.isLoggable("GeofencerStateMachine", 4)) {
                    aikq.a("GeofencerStateMachine", "sendUserSwitched");
                }
                aing3.d(11);
            }
        } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
            aing aing4 = this.a;
            if (intent.getBooleanExtra("android.intent.extra.DATA_REMOVED", false)) {
                boolean z2 = aikq.a;
                aing4.a(intent);
            }
        } else if ("android.intent.action.PACKAGE_DATA_CLEARED".equals(action) || "com.google.android.gms.INSTANT_APP_STOPPED".equals(action)) {
            this.a.a(intent);
        } else if ("com.google.android.location.activity.DEEP_STILL_MODE_DISABLED".equals(action)) {
            this.a.b(14, false);
        } else if ("com.google.android.location.activity.DEEP_STILL_MODE_ENABLED".equals(action)) {
            this.a.b(14, true);
        }
    }
}
