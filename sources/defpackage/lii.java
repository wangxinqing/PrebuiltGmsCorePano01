package defpackage;

import java.util.Locale;

/* renamed from: lii  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lii {
    public static void a(lih lih, khw khw, kkf kkf, khq khq, knc knc, kpd kpd) {
        kkf.d();
        try {
            kmp a = kkf.a(khq, knc);
            if (!a.aa().equals(kpd)) {
                if (!kpd.b() && !kpd.c()) {
                    a.a(kpd.UNPINNED);
                    a.m(false);
                } else if (a.e()) {
                    a.a(kpd);
                    a.m(false);
                } else {
                    throw new nja(10, String.format(Locale.US, "Pinning is not enabled for this document: %s", new Object[]{a.g()}));
                }
                kkf.f();
                kkf.e();
                if (!kpd.b()) {
                    synchronized (lih.g) {
                        lif lif = (lif) lih.g.get(knc);
                        if (lif != null) {
                            kis kis = lif.a;
                            if (kis != null) {
                                kis.a();
                            }
                        }
                        try {
                            lih.a(lih.b.a(khq, knc));
                        } catch (kcs e) {
                        }
                    }
                    khw.a();
                    return;
                }
                lih.a();
                return;
            }
            kkf.f();
            kkf.e();
        } catch (kcs e2) {
            throw new nja(1502, "Drive item not found, or you are not authorized to access it.");
        } catch (Throwable th) {
            kkf.e();
            throw th;
        }
    }
}
