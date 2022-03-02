package defpackage;

/* renamed from: aoox  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aoox extends aooz {
    public aoox(aorr aorr, Class cls, aoqb aoqb) {
        super(aorr, cls, aoqb);
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, Throwable th) {
        aoqb aoqb = (aoqb) obj;
        aorr a = aoqb.a(th);
        amrl.a((Object) a, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", (Object) aoqb);
        return a;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        b((aorr) obj);
    }
}
