package defpackage;

/* renamed from: aosn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aosn extends aorq {
    final /* synthetic */ aosp a;
    private final aoqa b;

    public aosn(aosp aosp, aoqa aoqa) {
        this.a = aosp;
        amrl.a((Object) aoqa);
        this.b = aoqa;
    }

    public final String a() {
        return this.b.toString();
    }

    public final /* bridge */ /* synthetic */ Object b() {
        aorr a2 = this.b.a();
        amrl.a((Object) a2, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", (Object) this.b);
        return a2;
    }

    public final boolean c() {
        return this.a.isDone();
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        aorr aorr = (aorr) obj;
        if (th == null) {
            this.a.b(aorr);
        } else {
            this.a.a(th);
        }
    }
}
