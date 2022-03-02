package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: ahol  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahol {
    private static final Object b = new Object();
    private static ahol c;
    public final hol a;

    private ahol(Context context) {
        this.a = new hol(context, "ACTIVITY_RECOGNITION", (String) null);
    }

    public static ahol a(Context context) {
        ahol ahol;
        synchronized (b) {
            if (c == null) {
                c = new ahol(context.getApplicationContext());
            }
            ahol = c;
        }
        return ahol;
    }

    public static ares a(String str, String str2) {
        aucd o = ares.d.o();
        if (!TextUtils.isEmpty(str)) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            ares ares = (ares) o.b;
            str.getClass();
            ares.a |= 1;
            ares.b = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            ares ares2 = (ares) o.b;
            str2.getClass();
            ares2.a |= 2;
            ares2.c = str2;
        }
        return (ares) o.i();
    }

    public final void a(int i) {
        int i2 = i - 1;
        String valueOf = String.valueOf(Integer.toString(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("logging dnd notification action, action type = ");
        sb.append(valueOf);
        sb.toString();
        aucd o = arfk.d.o();
        long currentTimeMillis = System.currentTimeMillis();
        if (o.c) {
            o.c();
            o.c = false;
        }
        arfk arfk = (arfk) o.b;
        int i3 = arfk.a | 2;
        arfk.a = i3;
        arfk.c = currentTimeMillis;
        arfk.b = i2;
        arfk.a = i3 | 1;
        arfk arfk2 = (arfk) o.i();
        aucd o2 = arec.q.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        arec arec = (arec) o2.b;
        arfk2.getClass();
        arec.f = arfk2;
        arec.a |= 32;
        hoi a2 = this.a.a((audx) (arec) o2.i());
        a2.b(7);
        a2.b();
    }

    public final void a(arfw arfw) {
        aucd o = arec.q.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        arec arec = (arec) o.b;
        arfw.getClass();
        arec.n = arfw;
        arec.a |= 16384;
        hoi a2 = this.a.a((audx) (arec) o.i());
        a2.b(16);
        a2.b();
    }

    public final void a(String str, String str2, int i, long j) {
        aucd o = arec.q.o();
        aucd o2 = areh.f.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        areh areh = (areh) o2.b;
        areh.b = i - 1;
        areh.a |= 1;
        ares a2 = a(str, str2);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        areh areh2 = (areh) o2.b;
        a2.getClass();
        areh2.c = a2;
        int i2 = areh2.a | 2;
        areh2.a = i2;
        areh2.d = 1;
        int i3 = i2 | 4;
        areh2.a = i3;
        areh2.a = i3 | 8;
        areh2.e = j;
        if (o.c) {
            o.c();
            o.c = false;
        }
        arec arec = (arec) o.b;
        areh areh3 = (areh) o2.i();
        areh3.getClass();
        arec.g = areh3;
        arec.a |= 64;
        hoi a3 = this.a.a((audx) (arec) o.i());
        a3.b(8);
        a3.b();
    }

    public final void a(boolean z, int i) {
        StringBuilder sb = new StringBuilder(44);
        sb.append("logging dnd rule status, ruleEnabled = ");
        sb.append(z);
        sb.toString();
        aucd o = arfi.e.o();
        long currentTimeMillis = System.currentTimeMillis();
        if (o.c) {
            o.c();
            o.c = false;
        }
        arfi arfi = (arfi) o.b;
        int i2 = arfi.a | 1;
        arfi.a = i2;
        arfi.b = currentTimeMillis;
        int i3 = i2 | 2;
        arfi.a = i3;
        arfi.c = z;
        arfi.d = i - 1;
        arfi.a = i3 | 64;
        arfi arfi2 = (arfi) o.i();
        aucd o2 = arec.q.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        arec arec = (arec) o2.b;
        arfi2.getClass();
        arec.d = arfi2;
        arec.a |= 4;
        hoi a2 = this.a.a((audx) (arec) o2.i());
        a2.b(4);
        a2.b();
    }
}
