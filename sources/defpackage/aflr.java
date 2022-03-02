package defpackage;

import android.accounts.Account;
import android.text.TextUtils;
import android.util.Pair;

/* renamed from: aflr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aflr implements aoqb {
    private final afme a;
    private final Pair b;
    private final afkj c;

    public aflr(afme afme, Pair pair, afkj afkj) {
        this.a = afme;
        this.b = pair;
        this.c = afkj;
    }

    public final aorr a(Object obj) {
        String str;
        int i;
        afme afme = this.a;
        Pair pair = this.b;
        afkj afkj = this.c;
        amzt amzt = (amzt) obj;
        aflf aflf = (aflf) pair.first;
        afkr afkr = (afkr) pair.second;
        afjt afjt = (afjt) afkj;
        if (!afjt.a && (!TextUtils.equals((CharSequence) afjt.c.b(), aflf.b) || (afjt.b ? (aflf.a & 4) != 0 : !(!afjt.d.a() || afmj.a((Account) afjt.d.b()).equals(aflf.d))))) {
            return aorl.a((Object) amzt);
        }
        boolean z = aflf.e;
        if ((aflf.a & 4) != 0) {
            str = aflf.d;
        } else {
            str = null;
        }
        if (!z) {
            i = 3;
        } else {
            i = 2;
        }
        return aopr.a(aopr.a(afme.a(afkr, str, i), (amqy) new aflw(afme), afme.e), (amqy) new aflt(amzt), afme.e);
    }
}
