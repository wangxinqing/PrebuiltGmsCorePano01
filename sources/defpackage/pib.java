package defpackage;

import java.util.concurrent.Callable;

/* renamed from: pib  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class pib implements Callable {
    private final pic a;

    public pib(pic pic) {
        this.a = pic;
    }

    public final Object call() {
        pic pic = this.a;
        if (((Boolean) pba.az.a()).booleanValue()) {
            return pic.c.a((String) ozz.h.c(), "GCM");
        }
        return nsi.a(pic.a);
    }
}
