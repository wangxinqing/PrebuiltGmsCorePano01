package defpackage;

import java.util.Set;

/* renamed from: aevd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aevd implements afdn {
    private final aevh a;
    private final String b;

    public aevd(aevh aevh, String str) {
        this.a = aevh;
        this.b = str;
    }

    public final void a() {
        aevh aevh = this.a;
        String str = this.b;
        for (aerg a2 : (Set) aevh.g.a()) {
            aere aere = (aere) aevh.a;
            a2.a(str, aere.b, aere.a);
        }
    }
}
