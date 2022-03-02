package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.PowerManager;
import android.util.Pair;
import android.view.Display;
import java.util.ArrayList;

/* renamed from: rqg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rqg implements rpf {
    private static adsa a;
    private final Context b;
    private final PowerManager c;
    private final anuv d;

    public rqg(Context context, anuv anuv) {
        this.b = context;
        this.c = (PowerManager) context.getSystemService("power");
        this.d = anuv;
    }

    public final adsa a() {
        if (a == null) {
            a = new rqf();
        }
        return a;
    }

    public final String a(audx audx) {
        return "";
    }

    public final boolean b() {
        return false;
    }

    public final rpe a(long j) {
        int i;
        int i2;
        aucd o = anxr.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        anxr anxr = (anxr) o.b;
        anxr.a |= 4;
        anxr.c = j;
        int i3 = Build.VERSION.SDK_INT;
        Display[] displays = ((DisplayManager) this.b.getSystemService("display")).getDisplays();
        int length = displays.length;
        int i4 = 0;
        boolean z = false;
        while (true) {
            i = 2;
            boolean z2 = true;
            if (i4 >= length) {
                break;
            }
            if (displays[i4].getState() != 2) {
                z2 = false;
            }
            z |= z2;
            i4++;
        }
        if (!z) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        anxr anxr2 = (anxr) o.b;
        anxr2.d = i2 - 1;
        anxr2.a |= 32;
        if (!this.c.isInteractive()) {
            i = 3;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        anxr anxr3 = (anxr) o.b;
        anxr3.e = i - 1;
        int i5 = anxr3.a | 64;
        anxr3.a = i5;
        anuv anuv = this.d;
        anuv.getClass();
        anxr3.b = anuv;
        anxr3.a = i5 | 1;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Pair.create("LB_D", (anxr) o.i()));
        return new rqe(arrayList.iterator());
    }
}
