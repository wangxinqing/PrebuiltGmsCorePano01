package defpackage;

import android.accounts.Account;

/* renamed from: aflo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aflo implements aoqb {
    private final afme a;
    private final afkh b;

    public aflo(afme afme, afkh afkh) {
        this.a = afme;
        this.b = afkh;
    }

    public final aorr a(Object obj) {
        String str;
        afme afme = this.a;
        afkr afkr = (afkr) obj;
        afjs afjs = (afjs) this.b;
        if (afjs.b.a()) {
            str = afmj.a((Account) afjs.b.b());
        } else {
            str = null;
        }
        return aopr.a(afme.a(afkr, str, 2), aflp.a, afme.e);
    }
}
