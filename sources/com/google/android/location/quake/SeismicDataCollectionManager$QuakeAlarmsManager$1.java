package com.google.android.location.quake;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SeismicDataCollectionManager$QuakeAlarmsManager$1 extends nla {
    final /* synthetic */ ajey a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SeismicDataCollectionManager$QuakeAlarmsManager$1(ajey ajey, String str) {
        super(str);
        this.a = ajey;
    }

    public final void a(Context context, Intent intent) {
        ajey ajey = this.a;
        String action = intent.getAction();
        if (ajey.e && "com.google.android.location.intent.action.ONLINE_CHECKIN_ALARM".equals(action)) {
            jjg jjg = ajfj.a;
            ajey.b.d();
            ajey.d = ((Long) ajey.a.a()).longValue();
            ajey.c();
        }
    }
}
