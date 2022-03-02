package defpackage;

import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* renamed from: agaj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class agaj implements Runnable {
    private final AccountParticleDisc a;
    private final amri b;

    public agaj(AccountParticleDisc accountParticleDisc, amri amri) {
        this.a = accountParticleDisc;
        this.b = amri;
    }

    public final void run() {
        AccountParticleDisc accountParticleDisc = this.a;
        agbc agbc = accountParticleDisc.d;
        accountParticleDisc.getResources();
        agau agau = new agau();
        agzj.b();
        agbc.a.add(agau);
        agbc.a(agbc.b);
    }
}
