package defpackage;

import java.util.Set;

/* renamed from: akky  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akky implements Runnable {
    final /* synthetic */ akld a;
    final /* synthetic */ Set b;
    final /* synthetic */ long[] c;

    public akky(akld akld, Set set, long[] jArr) {
        this.a = akld;
        this.b = set;
        this.c = jArr;
    }

    public final void run() {
        this.a.a(this.b, this.c);
    }
}
