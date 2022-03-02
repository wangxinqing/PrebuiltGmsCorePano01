package defpackage;

import android.accounts.Account;

/* renamed from: afln  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afln implements aoqa {
    private final afme a;
    private final afmg b;

    public afln(afme afme, afmg afmg) {
        this.a = afme;
        this.b = afmg;
    }

    public final aorr a() {
        afme afme = this.a;
        afmg afmg = this.b;
        aucd o = aflf.f.o();
        afju afju = (afju) afmg;
        String str = afju.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aflf aflf = (aflf) o.b;
        str.getClass();
        aflf.a |= 1;
        aflf.b = str;
        String packageName = afme.a.getPackageName();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aflf aflf2 = (aflf) o.b;
        packageName.getClass();
        aflf2.a |= 2;
        aflf2.c = packageName;
        if (afju.b.a()) {
            String a2 = afmj.a((Account) afju.b.b());
            if (o.c) {
                o.c();
                o.c = false;
            }
            aflf aflf3 = (aflf) o.b;
            a2.getClass();
            aflf3.a |= 4;
            aflf3.d = a2;
        }
        afqn afqn = afme.c;
        return aopr.a(aopr.a(afqn.a(), (aoqb) new afqi(afqn, (aflf) o.i()), afqn.n), aflv.a, afme.e);
    }
}
