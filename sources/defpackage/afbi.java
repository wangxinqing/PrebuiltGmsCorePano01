package defpackage;

import android.accounts.Account;
import java.util.concurrent.Executor;

/* renamed from: afbi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afbi implements afgb {
    public final afbj a;
    public final awdn b;

    public afbi(afbj afbj) {
        this.a = afbj;
        afbj.getClass();
        this.b = new afbg(afbj);
    }

    public final aorr a(aukh aukh, Account account, boolean z, boolean z2) {
        if (!this.a.n().q()) {
            return aorl.a((Object) aokp.o);
        }
        afar afar = new afar();
        afbj afbj = this.a;
        awdx.a(afbj);
        afar.b = afbj;
        aucd o = aukh.c.o();
        auly auly = auly.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aukh aukh2 = (aukh) o.b;
        auly.getClass();
        aukh2.b = auly;
        aukh2.a = 3;
        afgc afgc = new afgc(account, (aukh) o.i());
        awdx.a(afgc);
        afar.a = afgc;
        awdx.a((Object) afar.a, afgc.class);
        awdx.a((Object) afar.b, afbj.class);
        return aooz.a(new afbk(afar.a, afar.b).b.b(), Exception.class, (aoqb) new afbh(this), (Executor) aoqm.a);
    }
}
