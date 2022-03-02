package defpackage;

import android.accounts.Account;

/* renamed from: sfy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sfy implements awdt {
    private final bapu a;
    private final bapu b;
    private final bapu c;

    public sfy(bapu bapu, bapu bapu2, bapu bapu3) {
        this.a = bapu;
        this.b = bapu2;
        this.c = bapu3;
    }

    /* renamed from: b */
    public final afvn a() {
        aonv aonv;
        sgc sgc = (sgc) this.c.a();
        aqvz aqvz = (aqvz) ((aqvz) baos.a(new aqvy(), ((apyb) this.a.a()).a(arak.af))).a(apyq.a, (Object) apyq.a(((Account) ((awdu) this.b).a).name));
        String j = aygz.a.a().j();
        int k = (int) aygz.a.a().k();
        if (j.isEmpty()) {
            aonv = null;
        } else if (k == -1) {
            aonv = aonv.a(j);
            amrl.a(!aonv.a(), "Host has a port: %s", (Object) j);
        } else {
            aonv = aonv.a(j, k);
        }
        if (aonv != null) {
            aqvz = (aqvz) aqvz.a(apyj.a, (Object) aonv.toString());
        }
        afvm afvm = new afvm(aqvz);
        awdx.a((Object) afvm, "Cannot return null from a non-@Nullable @Provides method");
        return afvm;
    }
}
