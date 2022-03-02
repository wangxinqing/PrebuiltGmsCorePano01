package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: igq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class igq implements Runnable {
    final /* synthetic */ igs a;

    public igq(igs igs) {
        this.a = igs;
    }

    public final void run() {
        this.a.f.b(new ConnectionResult(4));
    }
}
