package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.util.Base64;
import com.google.android.gms.common.api.Status;

/* renamed from: hku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hku extends hkf {
    private final ifu b;
    private final String c;

    public hku(ifu ifu, Account account, String str) {
        super("VerifyPassphrase", account);
        iva.a((Object) ifu);
        this.b = ifu;
        iva.a((Object) str);
        this.c = str;
    }

    public final void a(Status status) {
        this.b.a(status);
    }

    public final void b(Context context) {
        hiw hiw;
        boolean a;
        hnh hnh = (hnh) hnh.a.b();
        pyv pyv = this.a;
        String str = this.c;
        synchronized (hnh.d) {
            try {
                aqpd aqpd = hnh.b.c(pyv).c;
                if (aqpd == null) {
                    aqpd = aqpd.g;
                }
                if (aqpd.d != 2) {
                    hiw = hiw.a(str);
                } else {
                    hiz a2 = hiz.a(jhy.a(aqpd.e), str);
                    hiw = new hiw(Base64.encodeToString(a2.a(hiy.a, "nigori-key"), 2), a2);
                }
                a = hnh.a(pyv, hiw);
            } catch (hit | hix e) {
                throw new hjm(hjn.a(e), "Failed to create cryptographer from the passphrase.", e);
            }
        }
        if (a) {
            ((hnl) hnl.a.b()).a(this.a);
            this.b.a(Status.a);
            return;
        }
        throw new hjm(1795, "Wrong passphrase.");
    }
}
