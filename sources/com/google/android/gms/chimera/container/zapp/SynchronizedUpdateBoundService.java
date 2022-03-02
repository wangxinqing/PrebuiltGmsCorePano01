package com.google.android.gms.chimera.container.zapp;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SynchronizedUpdateBoundService extends BoundService {
    public static byte[] a(int i) {
        aucd o = aedo.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aedo aedo = (aedo) o.b;
        aedo.b = i - 1;
        aedo.a |= 1;
        return ((aedo) o.i()).k();
    }

    public final IBinder onBind(Intent intent) {
        return new cqp(this);
    }
}
