package defpackage;

/* renamed from: khn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class khn {
    public final khm a;
    public final khq b;
    public final khk c;
    public final khl d;

    private khn(khm khm, khq khq, khk khk, khl khl) {
        iva.a((Object) khm);
        this.a = khm;
        this.b = khq;
        this.c = khk;
        this.d = khl;
    }

    public static khn a(khm khm, khk khk) {
        iva.a((Object) khk);
        iva.b(!khm.f, "result.isSuccess() must be false");
        return new khn(khm, (khq) null, khk, (khl) null);
    }

    public static khn a(khm khm, khq khq, boolean z, Integer num) {
        iva.a((Object) khq);
        iva.b(khm.f, "result.isSuccess() must be true");
        return new khn(khm, khq, (khk) null, new khl(z, num));
    }
}
