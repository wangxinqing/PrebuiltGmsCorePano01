package defpackage;

/* renamed from: pnj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pnj extends pnq {
    private final String f;

    public pnj(String str, String str2) {
        super(str, "data_id");
        this.f = str2;
    }

    /* access modifiers changed from: protected */
    public final dvj a(dvi dvi) {
        dvi.a("contact_id", "contact_id");
        dvi.a("type", "type");
        dvi.a("label", "label");
        dvi.a("data", this.f);
        dvi.g = "score";
        return dvi.a();
    }
}
