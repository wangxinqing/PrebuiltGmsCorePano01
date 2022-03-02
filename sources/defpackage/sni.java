package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: sni  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sni {
    public static final IntentFilter a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    public static avtx a(Context context) {
        int i;
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, a);
        if (registerReceiver == null) {
            registerReceiver = new Intent();
        }
        aucd o = avtx.h.o();
        boolean booleanExtra = registerReceiver.getBooleanExtra("present", false);
        if (o.c) {
            o.c();
            o.c = false;
        }
        avtx avtx = (avtx) o.b;
        int i2 = 1;
        avtx.a |= 1;
        avtx.b = booleanExtra;
        int intExtra = registerReceiver.getIntExtra("level", 0);
        if (o.c) {
            o.c();
            o.c = false;
        }
        avtx avtx2 = (avtx) o.b;
        avtx2.a |= 2;
        avtx2.c = intExtra;
        int intExtra2 = registerReceiver.getIntExtra("scale", 0);
        if (o.c) {
            o.c();
            o.c = false;
        }
        avtx avtx3 = (avtx) o.b;
        avtx3.a |= 4;
        avtx3.d = intExtra2;
        int intExtra3 = registerReceiver.getIntExtra("plugged", -1);
        int i3 = intExtra3 != 0 ? intExtra3 != 1 ? intExtra3 != 2 ? intExtra3 != 4 ? 1 : 5 : 4 : 3 : 2;
        if (o.c) {
            o.c();
            o.c = false;
        }
        avtx avtx4 = (avtx) o.b;
        avtx4.e = i3 - 1;
        avtx4.a |= 8;
        int intExtra4 = registerReceiver.getIntExtra("status", 1);
        if (intExtra4 != 2) {
            i = intExtra4 != 3 ? intExtra4 != 4 ? intExtra4 != 5 ? 1 : 5 : 4 : 3;
        } else {
            i = 2;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        avtx avtx5 = (avtx) o.b;
        avtx5.f = i - 1;
        avtx5.a |= 16;
        switch (registerReceiver.getIntExtra("health", 1)) {
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 4;
                break;
            case 5:
                i2 = 5;
                break;
            case 6:
                i2 = 6;
                break;
            case 7:
                i2 = 7;
                break;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        avtx avtx6 = (avtx) o.b;
        avtx6.g = i2 - 1;
        avtx6.a |= 32;
        return (avtx) o.i();
    }
}
