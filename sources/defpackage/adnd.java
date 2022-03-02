package defpackage;

import java.io.IOException;

/* renamed from: adnd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adnd {
    public static amri a(String str) {
        amri amri = ampu.a;
        try {
            amri = anbs.d(adkd.a(amrk.b((String) adke.i.a())), new adnb(str));
        } catch (IOException e) {
        }
        if (!amri.a()) {
            try {
                amri = anbs.d(adkd.b(amrk.b(ayox.a.a().x())), new adnc(str));
            } catch (IOException e2) {
            }
            if (!amri.a()) {
                return ampu.a;
            }
        }
        return amri;
    }
}
