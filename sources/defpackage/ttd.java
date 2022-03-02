package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ttd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ttd extends arwm {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ amsv b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ttd(String str, AtomicReference atomicReference, amsv amsv) {
        super(str);
        this.a = atomicReference;
        this.b = amsv;
    }

    public final void run() {
        this.a.set(this.b.a());
    }
}
