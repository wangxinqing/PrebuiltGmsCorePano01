package defpackage;

import android.content.Context;

/* renamed from: aldi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aldi {
    public final icc a;
    public final icc b;
    public final icc c;
    public int d;
    final ibz e;
    final ibz f;
    final ibz g;

    public aldi(Context context, String str, String str2, String str3) {
        riq riq = new riq();
        riq.c = 1;
        a(riq, str, str2);
        rir a2 = riq.a();
        ibz ibz = new ibz(context.getApplicationContext());
        ibz.a(str3);
        ibz.a(rij.a, (ibj) a2);
        ibz.a(rij.b, (ibj) a2);
        this.e = ibz;
        this.a = ibz.b();
        riq riq2 = new riq();
        riq2.c = 0;
        a(riq2, str, str2);
        rir a3 = riq2.a();
        ibz ibz2 = new ibz(context.getApplicationContext());
        ibz2.a(str3);
        ibz2.a(rij.a, (ibj) a3);
        this.f = ibz2;
        this.b = ibz2.b();
        ibz ibz3 = new ibz(context.getApplicationContext());
        ibz3.a(ren.a);
        this.g = ibz3;
        this.c = ibz3.b();
    }

    static void a(riq riq, String str, String str2) {
        if (str.equals("com.google.android.gms")) {
            riq.b = str2;
        } else {
            riq.a = str;
        }
    }
}
