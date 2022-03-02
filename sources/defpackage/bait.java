package defpackage;

import java.util.concurrent.Executor;

/* renamed from: bait  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bait {
    private final bajz a;
    private Executor b;

    public bait(bajz bajz) {
        amrl.a((Object) bajz, (Object) "executorPool");
        this.a = bajz;
    }

    /* access modifiers changed from: package-private */
    public final synchronized Executor a() {
        if (this.b == null) {
            Executor executor = (Executor) this.a.a();
            amrl.a((Object) executor, "%s.getObject()", (Object) this.b);
            this.b = executor;
        }
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b() {
        Executor executor = this.b;
        if (executor != null) {
            this.b = (Executor) this.a.a(executor);
        }
    }
}
