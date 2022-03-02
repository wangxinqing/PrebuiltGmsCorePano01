package defpackage;

import android.os.CancellationSignal;

/* renamed from: agwh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agwh implements Runnable {
    private final CancellationSignal a;

    public agwh(CancellationSignal cancellationSignal) {
        this.a = cancellationSignal;
    }

    public final void run() {
        agwj.a(this.a);
    }
}
