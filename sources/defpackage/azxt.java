package defpackage;

/* renamed from: azxt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azxt {
    public final azxh a;
    private final azxa b;

    public azxt(azxa azxa, azxh azxh) {
        amrl.a((Object) azxa, (Object) "transportAttrs");
        this.b = azxa;
        amrl.a((Object) azxh, (Object) "callOptions");
        this.a = azxh;
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("transportAttrs", (Object) this.b);
        a2.a("callOptions", (Object) this.a);
        return a2.toString();
    }
}
