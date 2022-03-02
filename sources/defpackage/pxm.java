package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;

/* renamed from: pxm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pxm {
    private static final IntentFilter a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    public static aoiz a(Context context) {
        boolean z;
        boolean z2;
        aucd o = aoiz.h.o();
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, a);
        int intExtra = registerReceiver.getIntExtra("status", -1);
        int intExtra2 = registerReceiver.getIntExtra("plugged", -1);
        int intExtra3 = registerReceiver.getIntExtra("level", -1);
        int intExtra4 = registerReceiver.getIntExtra("scale", -1);
        boolean z3 = true;
        if (intExtra == 2 || intExtra == 5) {
            z = true;
        } else {
            z = false;
        }
        aucd o2 = aoiy.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aoiy aoiy = (aoiy) o2.b;
        int i = aoiy.a | 1;
        aoiy.a = i;
        aoiy.b = z;
        if (intExtra2 == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = i | 2;
        aoiy.a = i2;
        aoiy.c = z2;
        if (intExtra2 != 2) {
            z3 = false;
        }
        aoiy.a = i2 | 4;
        aoiy.d = z3;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoiz aoiz = (aoiz) o.b;
        aoiy aoiy2 = (aoiy) o2.i();
        aoiy2.getClass();
        aoiz.c = aoiy2;
        aoiz.a = 2 | aoiz.a;
        double d = -1.0d;
        if (intExtra3 >= 0 && intExtra4 >= 0) {
            double d2 = (double) intExtra3;
            double d3 = (double) intExtra4;
            Double.isNaN(d2);
            Double.isNaN(d3);
            d = d2 / d3;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoiz aoiz2 = (aoiz) o.b;
        aoiz2.a |= 4;
        aoiz2.d = d;
        double doubleValue = ((Double) ozx.bQ.c()).doubleValue();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoiz aoiz3 = (aoiz) o.b;
        aoiz3.a |= 8;
        aoiz3.e = doubleValue;
        int i3 = Build.VERSION.SDK_INT;
        boolean isPowerSaveMode = ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoiz aoiz4 = (aoiz) o.b;
        int i4 = aoiz4.a | 16;
        aoiz4.a = i4;
        aoiz4.f = isPowerSaveMode;
        aoiz4.a = i4 | 32;
        aoiz4.g = isPowerSaveMode;
        return (aoiz) o.i();
    }
}
