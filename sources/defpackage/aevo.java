package defpackage;

import java.util.Set;

/* renamed from: aevo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aevo implements afdn {
    private final aevr a;
    private final String b;

    public aevo(aevr aevr, String str) {
        this.a = aevr;
        this.b = str;
    }

    public final void a() {
        aevr aevr = this.a;
        String str = this.b;
        for (aerg b2 : (Set) aevr.g.a()) {
            aere aere = (aere) aevr.a;
            b2.b(str, aere.b, aere.a);
        }
    }
}
