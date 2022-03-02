package defpackage;

import com.google.android.gms.awareness.snapshot.internal.Snapshot;

/* renamed from: chy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class chy implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ Snapshot b;
    final /* synthetic */ cif c;

    public chy(cif cif, int i, Snapshot snapshot) {
        this.c = cif;
        this.a = i;
        this.b = snapshot;
    }

    public final void run() {
        this.c.b(this.a, this.b);
    }
}
