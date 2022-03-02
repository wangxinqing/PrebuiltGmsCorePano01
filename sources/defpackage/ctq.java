package defpackage;

import java.util.List;

/* renamed from: ctq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ctq implements Runnable {
    private final cts a;
    private final List b;

    public ctq(cts cts, List list) {
        this.a = cts;
        this.b = list;
    }

    public final void run() {
        cts cts = this.a;
        cts.d.a(this.b);
    }
}
