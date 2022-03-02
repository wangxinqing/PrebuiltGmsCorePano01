package defpackage;

/* renamed from: adse  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class adse implements igp {
    private final String a;
    private final iby b;

    public adse(iby iby, String str) {
        this.b = iby;
        this.a = str;
    }

    public final void a(Object obj, Object obj2) {
        iby iby = this.b;
        String str = this.a;
        adry adry = (adry) iby.f;
        iva.a((Object) adry, (Object) "canLog must be called by a client that has api options.");
        ((adsv) ((adth) obj).x()).a(str, (adsp) new adsk(adry, (acwd) obj2));
    }
}
