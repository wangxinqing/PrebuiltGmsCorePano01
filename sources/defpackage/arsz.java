package defpackage;

/* renamed from: arsz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arsz extends argy {
    final /* synthetic */ artd a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public arsz(artd artd) {
        super(artd);
        this.a = artd;
    }

    /* renamed from: h */
    public final byte[] a() {
        return this.a.b[this.b.d()];
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            byte[] h = a();
            this.a.b[this.b.d()] = bArr;
            return h;
        }
        throw new NullPointerException("The value must not be null.");
    }
}
