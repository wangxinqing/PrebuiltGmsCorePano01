package defpackage;

import android.accounts.Account;
import android.content.pm.PackageManager;
import java.util.HashSet;
import java.util.List;

/* renamed from: afeh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afeh implements aoqb {
    private final afek a;

    public afeh(afek afek) {
        this.a = afek;
    }

    public final aorr a(Object obj) {
        afek afek = this.a;
        try {
            HashSet hashSet = new HashSet((List) obj);
            List<afdx> a2 = afek.c.a();
            for (afdx afdx : a2) {
                Account b = afdx.b();
                if (!hashSet.contains(b)) {
                    afek.c.a(b, afdz.SUBSCRIPTION_CLEANUP);
                } else {
                    String a3 = afdx.a();
                    try {
                        if (!"".equals(a3) && (!afek.b(a3, afek.d) || afek.a(a3, afek.d))) {
                            afek.c.a(a3, afdz.SUBSCRIPTION_CLEANUP);
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        afek.c.a(a3, afdz.SUBSCRIPTION_CLEANUP);
                    }
                }
            }
            return afek.a((List) a2);
        } catch (afdy e2) {
            ((pia) afek.a.a()).e("Failed to get subscriptions list.", e2, new Object[0]);
            throw e2;
        }
    }
}
