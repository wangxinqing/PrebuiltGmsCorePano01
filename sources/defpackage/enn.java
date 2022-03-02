package defpackage;

import android.accounts.Account;

/* renamed from: enn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class enn {
    public static final fzi a = new enm();
    public final eny b;
    private final ekq c;

    static {
        enx enx = eqb.a;
    }

    public enn() {
        eny eny = (eny) eny.a.b();
        ekq ekq = (ekq) ekq.b.b();
        iva.a((Object) eny);
        this.b = eny;
        iva.a((Object) ekq);
        this.c = ekq;
    }

    public final String a(String str, String str2) {
        try {
            String str3 = this.c.a(str).b;
            return str + ":" + str3 + ":" + str2;
        } catch (ekp e) {
            throw new enl("Unable to get package signature.", e);
        }
    }

    public final boolean a(Account account, String str, String str2) {
        return ((Boolean) this.b.a(account, epz.a(a(str, str2)), false)).booleanValue();
    }
}
