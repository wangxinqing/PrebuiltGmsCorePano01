package defpackage;

import java.util.List;

/* renamed from: ahsj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahsj implements Runnable {
    private final ahsr a;
    private final List b;
    private final List c;
    private final long d;

    public ahsj(ahsr ahsr, List list, List list2, long j) {
        this.a = ahsr;
        this.b = list;
        this.c = list2;
        this.d = j;
    }

    public final void run() {
        ahsr ahsr = this.a;
        ahsr.a.a(this.b, this.c, this.d);
    }
}
