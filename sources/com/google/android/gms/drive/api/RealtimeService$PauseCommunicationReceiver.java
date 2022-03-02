package com.google.android.gms.drive.api;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RealtimeService$PauseCommunicationReceiver extends nla {
    final /* synthetic */ keo a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealtimeService$PauseCommunicationReceiver(keo keo) {
        super("drive");
        this.a = keo;
    }

    public final void a(Context context, Intent intent) {
        if (((PowerManager) context.getSystemService("power")).isScreenOn()) {
            keo keo = this.a;
            ith ith = keo.a;
            if (keo.k.a()) {
                keo keo2 = this.a;
                ((jfz) keo2.g).submit(keo2.j);
                return;
            }
        }
        keo keo3 = this.a;
        ith ith2 = keo.a;
        ((jfz) keo3.g).submit(keo3.i);
    }
}
