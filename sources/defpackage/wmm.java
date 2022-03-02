package defpackage;

import android.content.Context;
import android.os.Binder;
import android.util.Base64;

/* renamed from: wmm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wmm {
    private static wmm a;

    public wmm() {
        if (wmp.a == null) {
            wmp.a = new wmp();
        }
    }

    public static synchronized void a() {
        synchronized (wmm.class) {
            if (a == null) {
                a = new wmm();
            }
        }
    }

    public static final void a(aoip aoip) {
        ihs b = ihs.b();
        iao.a();
        iao.a((Context) b, 1, aoip);
    }

    public static final void a(String str, aucd aucd) {
        aucd o = xok.e.o();
        String e = jhg.e((Context) ihs.b());
        if (o.c) {
            o.c();
            o.c = false;
        }
        xok xok = (xok) o.b;
        e.getClass();
        int i = xok.a | 1;
        xok.a = i;
        xok.b = e;
        if ((i & 1) == 0) {
            "20.12.16 (080306-{{cl}})".getClass();
            xok.a = i | 1;
            xok.b = "20.12.16 (080306-{{cl}})";
        }
        if (xoj.a(jlo.h()) != 0) {
            int a2 = xoj.a(jlo.h());
            if (o.c) {
                o.c();
                o.c = false;
            }
            xok xok2 = (xok) o.b;
            int i2 = a2 - 1;
            if (a2 != 0) {
                xok2.d = i2;
                xok2.a |= 4;
            } else {
                throw null;
            }
        }
        long g = jlo.g();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xok xok3 = (xok) o.b;
        xok3.a |= 2;
        xok3.c = g;
        xok xok4 = (xok) o.i();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        xol xol = (xol) aucd.b;
        xol xol2 = xol.w;
        xok4.getClass();
        xol.b = xok4;
        xol.a |= 1;
        xol xol3 = (xol) aucd.i();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            byte[] k = xol3.k();
            Base64.encodeToString(k, 2);
            new hol(ihs.b(), "GMS_CORE_PEOPLE", str).a(k).b();
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }
}
