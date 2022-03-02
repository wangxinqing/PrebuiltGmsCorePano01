package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ReceiverCallNotAllowedException;

/* renamed from: ajnn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajnn {
    static final IntentFilter a = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    public final Context b;

    public ajnn(Context context) {
        this.b = context;
    }

    public static ajjp a(Context context) {
        Intent intent = null;
        try {
            intent = context.registerReceiver((BroadcastReceiver) null, a);
        } catch (ReceiverCallNotAllowedException e) {
        }
        aucd o = ajjp.f.o();
        if (intent != null) {
            int a2 = ajjo.a(intent.getIntExtra("plugged", 0));
            if (a2 == 0) {
                a2 = 4;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            ajjp ajjp = (ajjp) o.b;
            ajjp.b = a2 - 1;
            ajjp.a |= 1;
            int intExtra = intent.getIntExtra("level", 0);
            if (o.c) {
                o.c();
                o.c = false;
            }
            ajjp ajjp2 = (ajjp) o.b;
            ajjp2.a |= 2;
            ajjp2.c = intExtra;
            int intExtra2 = intent.getIntExtra("scale", 0);
            if (o.c) {
                o.c();
                o.c = false;
            }
            ajjp ajjp3 = (ajjp) o.b;
            ajjp3.a = 4 | ajjp3.a;
            ajjp3.d = intExtra2;
            int intExtra3 = intent.getIntExtra("voltage", 0);
            if (o.c) {
                o.c();
                o.c = false;
            }
            ajjp ajjp4 = (ajjp) o.b;
            ajjp4.a |= 8;
            ajjp4.e = intExtra3;
        }
        return (ajjp) o.i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r2 = defpackage.ajjo.a(r2.b);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(defpackage.ajjp r2) {
        /*
            if (r2 == 0) goto L_0x0013
            int r0 = r2.a
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0013
            int r2 = r2.b
            int r2 = defpackage.ajjo.a(r2)
            if (r2 == 0) goto L_0x0013
            if (r2 == r1) goto L_0x0013
            return r1
        L_0x0013:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajnn.a(ajjp):boolean");
    }
}
