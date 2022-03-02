package defpackage;

import com.google.android.gms.contextmanager.ContextData;

/* renamed from: bwd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bwd implements Runnable {
    final /* synthetic */ ContextData a;
    final /* synthetic */ bwe b;

    public bwd(bwe bwe, ContextData contextData) {
        this.b = bwe;
        this.a = contextData;
    }

    public final void run() {
        this.b.b(this.a);
    }
}
