package defpackage;

import android.accounts.Account;
import java.util.Map;

/* renamed from: shq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class shq implements shj {
    public final bapu a;
    public final bapu b;
    public final bapu c;
    final /* synthetic */ shs d;
    private final Account e;
    private final bapu f;
    private final bapu g;
    private final bapu h;
    private final bapu i = new sfw(this.d.a);
    private final bapu j;
    private final bapu k;
    private final bapu l;
    private final bapu m;
    private final bapu n;
    private final bapu o;

    public shq(shs shs, Account account) {
        this.d = shs;
        this.e = account;
        awdt a2 = awdu.a(account);
        this.a = a2;
        shs shs2 = this.d;
        this.f = awds.a(new sfz(a2, shs2.g, shs2.j, shs2.b));
        shs shs3 = this.d;
        this.g = new sfy(shs3.d, this.a, shs3.k);
        bapu bapu = this.a;
        shs shs4 = this.d;
        this.h = new sfx(bapu, shs4.a, shs4.c);
        bapu bapu2 = this.f;
        bapu bapu3 = this.g;
        bapu bapu4 = this.h;
        shs shs5 = this.d;
        this.j = awds.a(new sga(bapu2, bapu3, bapu4, shs5.m, this.i, shs5.l, shs5.k));
        bapu bapu5 = this.f;
        bapu bapu6 = this.g;
        bapu bapu7 = this.h;
        shs shs6 = this.d;
        bapu a3 = awds.a(new sgb(bapu5, bapu6, bapu7, shs6.m, this.i, shs6.l, shs6.k));
        this.k = a3;
        this.l = awds.a(new sfp(this.j, a3));
        awdo a4 = awdv.a(3);
        a4.a(set.PROFILE_FORCE_SYNC, this.l);
        a4.a(set.PROFILE_UPDATE_PERSON_ME, this.l);
        a4.a(set.PROFILE_UPDATE_PHOTO_ME, this.l);
        awdv a5 = a4.a();
        this.m = a5;
        this.b = awds.a(new slj(a5));
        sgw sgw = new sgw(this.j, this.k, this.d.f);
        this.n = sgw;
        this.o = awds.a(sgw);
        this.c = awds.a(new sjm(this.a));
    }

    public final Map a() {
        slq slq = slq.WIPEOUT;
        shs shs = this.d;
        int i2 = shs.n;
        slu slu = new slu(anax.a((Object) new shb(this.e, (afua) this.f.a(), sgg.a((aflk) shs.c.a()))));
        awdx.a((Object) slu, "Cannot return null from a non-@Nullable @Provides method");
        return anaf.a(slq, slu, slq.PROFILE_SYNC, (slm) this.o.a());
    }

    public final sho b() {
        return new sho(this);
    }
}
