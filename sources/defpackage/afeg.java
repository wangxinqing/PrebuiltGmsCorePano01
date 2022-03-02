package defpackage;

import android.content.pm.PackageManager;
import java.util.List;

/* renamed from: afeg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afeg implements aoqb {
    private final afek a;

    public afeg(afek afek) {
        this.a = afek;
    }

    public final aorr a(Object obj) {
        afek afek = this.a;
        List<afdx> list = (List) obj;
        for (afdx a2 : list) {
            String a3 = a2.a();
            try {
                if (!"".equals(a3) && (!afek.b(a3, afek.d) || afek.a(a3, afek.d))) {
                    afek.c.a(a3, afdz.SUBSCRIPTION_CLEANUP);
                }
            } catch (PackageManager.NameNotFoundException e) {
                afek.c.a(a3, afdz.SUBSCRIPTION_CLEANUP);
            }
        }
        return afek.a((List) list);
    }
}
