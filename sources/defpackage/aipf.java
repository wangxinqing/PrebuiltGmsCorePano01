package defpackage;

import android.content.Context;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: aipf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aipf {
    private static aipf b;
    private final hol a;

    public aipf(Context context) {
        this.a = new hol(context, "LE", (String) null);
    }

    public static synchronized aipf a(Context context) {
        aipf aipf;
        synchronized (aipf.class) {
            aipf = new aipf(context);
            b = aipf;
        }
        return aipf;
    }

    public final void a(arnh arnh, int i) {
        if (aydr.b()) {
            a(arnh, i, 3);
        }
    }

    public final void a(arnh arnh, int i, int i2) {
        aucd o = anyg.d.o();
        long a2 = arnh.a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        anyg anyg = (anyg) o.b;
        anyg.a |= 1;
        anyg.b = a2;
        int c = arnh.c();
        if (o.c) {
            o.c();
            o.c = false;
        }
        anyg anyg2 = (anyg) o.b;
        anyg2.a |= 2;
        anyg2.c = c;
        anyg anyg3 = (anyg) o.i();
        aucd o2 = anym.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anym anym = (anym) o2.b;
        anyg3.getClass();
        anym.b = anyg3;
        int i3 = anym.a | 1;
        anym.a = i3;
        anym.c = i2 - 1;
        int i4 = i3 | 2;
        anym.a = i4;
        anym.a = i4 | 4;
        anym.d = i;
        anym anym2 = (anym) o2.i();
        aucd o3 = anyi.g.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        anyi anyi = (anyi) o3.b;
        anyi.b = 4;
        int i5 = anyi.a | 1;
        anyi.a = i5;
        anym2.getClass();
        anyi.f = anym2;
        anyi.a = i5 | 16;
        a(o3);
    }

    public final void a(aucd aucd) {
        aucd o = anui.p.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        anui anui = (anui) o.b;
        anui.b = 8;
        anui.a |= 1;
        anyi anyi = (anyi) aucd.i();
        anyi.getClass();
        anui.j = anyi;
        anui.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        this.a.a(((anui) o.i()).k()).b();
    }

    public final void a(String str) {
        if (aydr.c()) {
            aucd o = anyk.c.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            anyk anyk = (anyk) o.b;
            str.getClass();
            anyk.a |= 2;
            anyk.b = str;
            anyk anyk2 = (anyk) o.i();
            aucd o2 = anyi.g.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anyi anyi = (anyi) o2.b;
            anyi.b = 3;
            int i = anyi.a | 1;
            anyi.a = i;
            anyk2.getClass();
            anyi.e = anyk2;
            anyi.a = i | 8;
            a(o2);
        }
    }
}
