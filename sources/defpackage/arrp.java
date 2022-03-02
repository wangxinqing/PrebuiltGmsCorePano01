package defpackage;

/* renamed from: arrp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arrp extends argy {
    public final /* synthetic */ arrs a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public arrp(arrs arrs) {
        super(arrs);
        this.a = arrs;
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object a() {
        throw new UnsupportedOperationException("Inherited get value in entry iterator is not supported.");
    }

    public final short h() {
        return ((Short) this.b.b()).shortValue();
    }

    public final long i() {
        return this.a.e[g()];
    }

    public final long j() {
        return this.a.h[g()];
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Long l = (Long) obj;
        throw new UnsupportedOperationException("Inherited set value in entry iterator is not supported.");
    }
}
