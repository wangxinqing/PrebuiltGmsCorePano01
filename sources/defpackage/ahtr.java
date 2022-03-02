package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ahtr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahtr implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ aqek b;
    final /* synthetic */ ahts c;

    public ahtr(ahts ahts, int i, aqek aqek) {
        this.c = ahts;
        this.a = i;
        this.b = aqek;
    }

    public final void run() {
        ajbe ajbe;
        ajbg ajbg;
        ahul ahul;
        this.c.g.b(ajbe.COLLECTIONLIB, 600000, this.c.f);
        try {
            ahts ahts = this.c;
            if (!ahts.a) {
                if (ahts.b() == null) {
                    boolean a2 = ahuk.a.a(ahts.b, TimeUnit.DAYS.toMillis(24));
                    ahts.a = a2;
                    if (!a2) {
                        String valueOf = String.valueOf(ahts.b);
                        if (valueOf.length() == 0) {
                            new String("Failed to lock dir ");
                        } else {
                            "Failed to lock dir ".concat(valueOf);
                        }
                    }
                }
                ahss ahss = this.c.h;
                if (ahss != null) {
                    ahss.a(this.a, (String) null, "Failed to create lock file.");
                }
                ajbg = this.c.g;
                ajbe = ajbe.COLLECTIONLIB;
                ajbg.c(ajbe);
            }
            ahts ahts2 = this.c;
            aqek aqek = this.b;
            ahts2.b();
            synchronized (ahts2) {
                if (ahts2.e == null) {
                    if (ahts2.c != null) {
                        ahts2.e = new ahrc(ahts2.b, aiab.a(ahts2.c, ahts2.i));
                    } else {
                        ahul = new ahul(false, (String) null, "Encryption Key invalid.");
                    }
                }
                ahul = ahts2.e.a(aqek);
            }
            ahss ahss2 = this.c.h;
            if (ahss2 != null) {
                String str = ahul.c;
                if (ahul.a) {
                    amrl.a((Object) str);
                    this.c.h.a(this.a, str);
                } else {
                    String str2 = ahul.d;
                    int i = this.a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    ahss2.a(i, str, str2);
                }
            }
            ajbg = this.c.g;
            ajbe = ajbe.COLLECTIONLIB;
            ajbg.c(ajbe);
        } catch (Throwable th) {
            this.c.g.c(ajbe.COLLECTIONLIB);
            throw th;
        }
    }
}
