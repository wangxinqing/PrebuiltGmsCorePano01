package defpackage;

/* renamed from: adly  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class adly {
    protected final adrd a = adre.a();
    private final String b;

    protected adly(String str) {
        this.b = str;
    }

    /* access modifiers changed from: protected */
    public void a() {
        iva.b(this.a.a((adri) adlz.e), "The name of the next action needs to be set.");
        iva.b(this.a.a((adri) adlz.f), "The params of the next action needs to be set.");
    }

    public final adll b() {
        String str = this.b;
        a();
        return new adll(str, this.a.a());
    }

    public void a(String str, adre adre) {
        this.a.a(adlz.e, str);
        this.a.a(adlz.f, adre);
    }
}
