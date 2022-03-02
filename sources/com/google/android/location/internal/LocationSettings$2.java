package com.google.android.location.internal;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LocationSettings$2 extends nla {
    final /* synthetic */ aioi a;
    final /* synthetic */ aiok b;
    private boolean c = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocationSettings$2(aioi aioi, String str, aiok aiok) {
        super(str);
        this.a = aioi;
        this.b = aiok;
    }

    public final void a(Context context, Intent intent) {
        if (intent.getAction().equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
            switch (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE)) {
                case 10:
                case 12:
                    if (this.c) {
                        this.a.a.unregisterReceiver(this);
                        this.b.a();
                        return;
                    }
                    return;
                case 11:
                    this.c = true;
                    return;
                default:
                    return;
            }
        }
    }
}
