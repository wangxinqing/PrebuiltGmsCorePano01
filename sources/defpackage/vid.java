package defpackage;

import android.accounts.Account;
import com.google.android.gms.nearby.sharing.ConsentsChimeraActivity;

/* renamed from: vid  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vid implements acvf {
    private final ConsentsChimeraActivity a;

    public vid(ConsentsChimeraActivity consentsChimeraActivity) {
        this.a = consentsChimeraActivity;
    }

    public final Object a(acwa acwa) {
        vvq vvq = new vvq(this.a);
        agqt a2 = vvq.a(vvq.a, (Account) acwa.d());
        aucd o = atxi.f.o();
        aucd o2 = atxh.d.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atxh atxh = (atxh) o2.b;
        int i = atxh.a | 1;
        atxh.a = i;
        atxh.b = 10;
        atxh.a = i | 2;
        atxh.c = true;
        atxh atxh2 = (atxh) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atxi atxi = (atxi) o.b;
        atxh2.getClass();
        if (!atxi.b.a()) {
            atxi.b = aucj.a(atxi.b);
        }
        atxi.b.add(atxh2);
        return thr.a(a2.a((atxi) o.i()), ayni.h()).b(new vvm(a2)).a((acvf) new vvn(vvq));
    }
}
