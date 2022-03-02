package defpackage;

import android.accounts.Account;
import java.util.concurrent.Executor;

/* renamed from: aeun  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeun implements afgb {
    public final aeuo a;
    public final awdn b;

    public aeun(aeuo aeuo) {
        this.a = aeuo;
        aeuo.getClass();
        this.b = new aeul(aeuo);
    }

    public final aorr a(aukh aukh, Account account, boolean z, boolean z2) {
        aeto aeto = new aeto();
        aeuo aeuo = this.a;
        awdx.a(aeuo);
        aeto.c = aeuo;
        afgc afgc = new afgc(account, aukh);
        awdx.a(afgc);
        aeto.a = afgc;
        affy affy = new affy(z, z2);
        awdx.a(affy);
        aeto.b = affy;
        awdx.a((Object) aeto.a, afgc.class);
        awdx.a((Object) aeto.b, affy.class);
        awdx.a((Object) aeto.c, aeuo.class);
        return aooz.a(new aeup(aeto.a, aeto.b, aeto.c).b.b(), Exception.class, (aoqb) new aeum(this), (Executor) aoqm.a);
    }
}
