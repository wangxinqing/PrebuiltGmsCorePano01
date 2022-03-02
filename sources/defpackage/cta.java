package defpackage;

/* renamed from: cta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cta {
    public final aqso a;
    public final boolean b;

    private cta(aqso aqso, boolean z) {
        this.a = aqso;
        this.b = z;
    }

    public static cta a(aqso aqso) {
        return new cta(aqso, false);
    }

    public static cta b(aqso aqso) {
        return new cta(aqso, true);
    }
}
