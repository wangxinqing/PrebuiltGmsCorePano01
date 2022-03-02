package defpackage;

import android.text.TextUtils;

/* renamed from: agik  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agik implements Runnable {
    private final agil a;
    private final agif b;
    private final String c;

    public agik(agil agil, agif agif, String str) {
        this.a = agil;
        this.b = agif;
        this.c = str;
    }

    public final void run() {
        agil agil = this.a;
        agif agif = this.b;
        String str = this.c;
        if (agif.a(agif)) {
            return;
        }
        if (!agif.c) {
            long j = agif.a;
            long b2 = agif.b();
            if (!TextUtils.isEmpty(str) && b2 > 0) {
                agnn.a(aghz.a, str, j, b2);
                return;
            }
            return;
        }
        agio agio = agil.a;
        aghz aghz = aghz.a;
        TextUtils.isEmpty(str);
        agnm a2 = agnn.a(aghz, str);
        if (a2 != null) {
            ((aorv) agio.c.a()).a(new agin(agio, a2));
        }
    }
}
