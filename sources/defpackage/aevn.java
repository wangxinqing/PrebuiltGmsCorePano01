package defpackage;

import java.util.Set;

/* renamed from: aevn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aevn implements afdn {
    private final aevr a;
    private final String b;

    public aevn(aevr aevr, String str) {
        this.a = aevr;
        this.b = str;
    }

    public final void a() {
        aevr aevr = this.a;
        String str = this.b;
        for (aerg a2 : (Set) aevr.g.a()) {
            aere aere = (aere) aevr.a;
            a2.a(str, aere.b, aere.a);
        }
    }
}
