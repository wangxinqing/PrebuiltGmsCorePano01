package defpackage;

/* renamed from: csd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class csd {
    public static final csd a = new csd();
    private cso b;

    private csd() {
        this.b = null;
    }

    public static csd a(cso cso) {
        return new csd(cso);
    }

    public final boolean a() {
        return this.b == null;
    }

    public final cso b() {
        amrl.b(this.b != null);
        cso cso = this.b;
        this.b = null;
        return cso;
    }

    private csd(cso cso) {
        amrl.a((Object) cso);
        this.b = cso;
    }
}
