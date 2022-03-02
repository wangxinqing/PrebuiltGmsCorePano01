package defpackage;

import java.util.List;

/* renamed from: zwl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zwl {
    private static zwl g;
    public List a;
    public List b;
    public boolean c;
    public boolean d;
    public String e;
    public String f;

    private zwl() {
    }

    public static synchronized zwl a() {
        zwl zwl;
        synchronized (zwl.class) {
            if (g == null) {
                g = new zwl();
            }
            zwl = g;
        }
        return zwl;
    }

    public final void b() {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = false;
        this.e = null;
        this.f = null;
    }
}
