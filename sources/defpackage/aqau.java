package defpackage;

/* renamed from: aqau  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqau {
    public final baaf a;
    public final azxh b;
    public final baaj c;
    public final String d;

    private aqau(baaj baaj, azxh azxh, baaf baaf, String str) {
        this.b = azxh;
        this.c = baaj;
        this.a = baaf;
        this.d = str;
    }

    public static aqau a(baaj baaj, azxh azxh, baaf baaf, String str) {
        amrl.a((Object) baaj);
        amrl.a((Object) azxh);
        amrl.a((Object) baaf);
        amrl.a((Object) str);
        return new aqau(baaj, azxh, baaf, str);
    }
}
