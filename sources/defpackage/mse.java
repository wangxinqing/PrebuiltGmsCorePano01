package defpackage;

import java.util.List;

/* renamed from: mse  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mse implements Runnable {
    private final msl a;
    private final List b;

    public mse(msl msl, List list) {
        this.a = msl;
        this.b = list;
    }

    public final void run() {
        msl msl = this.a;
        List list = this.b;
        msl.f.setVisibility(8);
        msl.h.a(list);
    }
}
