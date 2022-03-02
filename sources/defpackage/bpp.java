package defpackage;

import java.util.List;

/* renamed from: bpp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class bpp implements Runnable {
    private final bpq a;
    private final List b;

    public bpp(bpq bpq, List list) {
        this.a = bpq;
        this.b = list;
    }

    public final void run() {
        bpq bpq = this.a;
        bpq.f.a(this.b);
    }
}
