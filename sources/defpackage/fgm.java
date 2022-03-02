package defpackage;

import android.content.Context;

/* renamed from: fgm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fgm {
    private final hol a;

    private fgm(Context context) {
        this.a = new hol(context, "ANDROID_AUTH", (String) null);
    }

    public static fgm a() {
        return new fgm(ihs.b());
    }

    public final void a(anon anon) {
        this.a.a(anon.k()).b();
    }

    public final void a(anox anox) {
        if (((Boolean) fdj.f.c()).booleanValue()) {
            aucd o = anon.v.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            anon anon = (anon) o.b;
            anon.c = 10;
            int i = anon.a | 1;
            anon.a = i;
            anox.getClass();
            anon.i = anox;
            anon.a = i | 512;
            a((anon) o.i());
        }
    }
}
