package defpackage;

/* renamed from: ibq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ibq {
    public final String a;
    public final ibn b;
    private final ibg c;

    public ibq(String str, ibn ibn, ibg ibg) {
        iva.a((Object) ibn, (Object) "Cannot construct an Api with a null ClientBuilder");
        iva.a((Object) ibg, (Object) "Cannot construct an Api with a null ClientKey");
        this.a = str;
        this.b = ibn;
        this.c = ibg;
    }

    public final ibg a() {
        ibg ibg = this.c;
        if (ibg != null) {
            return ibg;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    public final ibn b() {
        iva.a(this.b != null, (Object) "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.b;
    }
}
