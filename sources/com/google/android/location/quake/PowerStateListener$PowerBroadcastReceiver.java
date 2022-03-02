package com.google.android.location.quake;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PowerStateListener$PowerBroadcastReceiver extends nla {
    final /* synthetic */ ajdg a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PowerStateListener$PowerBroadcastReceiver(ajdg ajdg) {
        super("location");
        this.a = ajdg;
    }

    public final void a(Context context, Intent intent) {
        int i = ajdg.c;
        intent.getAction();
        this.a.g.a();
    }
}
