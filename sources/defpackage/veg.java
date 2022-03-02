package defpackage;

import android.content.Context;
import android.os.Bundle;

/* renamed from: veg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class veg {
    public final vbp a;
    public final uws b;

    public veg(Context context) {
        this.a = (vbp) thl.a(context, vbp.class);
        this.b = (uws) thl.a(context, uws.class);
    }

    private final avcm a(Bundle bundle) {
        String string = bundle.getString("PUSH_MESSAGE");
        if (string == null) {
            return null;
        }
        try {
            return (avcm) aucj.a((aucj) avcm.c, jhy.c(string));
        } catch (auda e) {
            anih anih = (anih) tgc.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("veg", "a", 104, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s", (Object) "GcmHandler: ");
            return null;
        }
    }

    private final void a(avcm avcm) {
        jjg jjg = tgc.a;
        if ((avcm.a & 4) != 0) {
            avcn avcn = avcm.b;
            if (avcn == null) {
                avcn = avcn.c;
            }
            int size = avcn.b.size();
            avcn.a.size();
            if (size > 0) {
                for (int i = 0; i < avcn.b.size(); i++) {
                    vbp vbp = this.a;
                    avae avae = (avae) avcn.b.get(i);
                    aucd aucd = (aucd) avae.c(5);
                    aucd.a((aucj) avae);
                    vbp.a((aucf) aucd);
                }
                return;
            }
            return;
        }
        ((anih) ((anih) tgc.a.c()).a("veg", "a", 92, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring empty push message");
    }
}
