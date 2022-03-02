package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import java.util.Random;

/* renamed from: vva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vva {
    public int a = a();
    public int b = a();
    private tgj c;
    private final int d = a();

    public static int a() {
        return new Random().nextInt(2147483646) + 1;
    }

    private final void a(vuw vuw, int i) {
        tgj tgj = this.c;
        if (tgj != null) {
            asmc asmc = vuw.a;
            int a2 = aspi.a(asmc.b);
            if (a2 == 0) {
                a2 = 1;
            }
            tgj.a(asmc, a2 - 1, i);
        }
    }

    public final void a(Context context, Account account) {
        if (account == null || TextUtils.isEmpty(account.name)) {
            this.c = null;
            return;
        }
        String str = account.name;
        Boolean bool = (Boolean) thr.a("isAppActivityEnabled", thr.a(vvs.a(context).a(account).a(4), ayni.h()), ayni.h());
        if (bool == null || !bool.booleanValue()) {
            jjg jjg = vvj.a;
            this.c = null;
            return;
        }
        tgj tgj = this.c;
        if (tgj == null || !str.equals(tgj.a.i)) {
            this.c = new tgj(5, vuz.a, str);
        }
    }

    public final void a(vut vut) {
        a((vuw) vut, this.b);
    }

    public final void a(vuu vuu) {
        a((vuw) vuu, this.a);
    }

    public final void a(vuv vuv) {
        a((vuw) vuv, this.d);
    }
}
