package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.Iterator;

/* renamed from: adfe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class adfe implements icm {
    private final adff a;
    private final String b;
    private final atzn c;

    public adfe(adff adff, String str, atzn atzn) {
        this.a = adff;
        this.b = str;
        this.c = atzn;
    }

    public final void a(icl icl) {
        xaa xaa;
        adff adff = this.a;
        String str = this.b;
        atzn atzn = this.c;
        wla wla = (wla) icl;
        try {
            Status aO = wla.aO();
            String str2 = null;
            if (!aO.c()) {
                ((anih) ((anih) adff.a.c()).a("adff", "a", 147, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Error (%d) loading owner data: %s", aO.i, (Object) aO.j);
            } else {
                xfh b2 = wla.b();
                if (b2 != null) {
                    Iterator it = b2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            xaa = (xaa) it.next();
                            if (xaa.c().equals(str)) {
                                break;
                            }
                        } else {
                            ((anih) ((anih) adff.a.c()).a("adff", "a", 172, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No Owner found for the current account");
                            xaa = null;
                            break;
                        }
                    }
                } else {
                    ((anih) ((anih) adff.a.c()).a("adff", "a", 162, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No owners data arrived with successful response");
                    xaa = null;
                }
                if (xaa != null && xaa.e()) {
                    str2 = xaa.d();
                }
            }
            adff.a(str2, atzn);
        } finally {
            wla.c();
        }
    }
}
