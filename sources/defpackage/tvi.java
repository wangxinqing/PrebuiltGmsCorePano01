package defpackage;

import android.accounts.Account;
import android.content.Context;

/* renamed from: tvi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tvi extends arwm {
    final /* synthetic */ arxt a;
    final /* synthetic */ Account b;
    final /* synthetic */ tzj c;
    final /* synthetic */ String d;
    final /* synthetic */ Context e;
    final /* synthetic */ tzi f;
    final /* synthetic */ aucd g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tvi(String str, aucd aucd, arxt arxt, Account account, tzj tzj, String str2, Context context, tzi tzi) {
        super(str);
        this.g = aucd;
        this.a = arxt;
        this.b = account;
        this.c = tzj;
        this.d = str2;
        this.e = context;
        this.f = tzi;
    }

    public final void run() {
        uaj uaj = (uaj) this.g.i();
        arxt arxt = this.a;
        Account account = this.b;
        arxr e2 = arxs.e();
        e2.a(this.c.b);
        e2.a(this.d);
        e2.b(this.c.d);
        e2.a(uaj);
        arxt.a(account, e2.a(), (aora) null);
        ttf ttf = (ttf) thl.a(this.e, ttf.class);
        tzi tzi = this.f;
        aucd aucd = (aucd) tzi.c(5);
        aucd.a((aucj) tzi);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        tzi tzi2 = (tzi) aucd.b;
        auct auct = tzi.m;
        uaj.getClass();
        tzi2.n = uaj;
        tzi2.a |= 1024;
        ttf.a((tzi) aucd.i());
    }
}
