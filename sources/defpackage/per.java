package defpackage;

import android.accounts.Account;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: per  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class per {
    public final Executor a;
    public final awdn b;
    public final aelh c;
    public final afhs d;
    public final byte[] e;
    public final Object f = new Object();
    public boolean g;
    public anuc h;
    public aosh i;
    public boolean j;
    private final amsv k;

    public per(byte[] bArr, Account account, afif afif, awdn awdn, Executor executor, amsv amsv, aelh aelh) {
        amrl.a((Object) bArr);
        amrl.a((Object) executor);
        amrl.a((Object) awdn);
        amrl.a((Object) amsv);
        amrl.a((Object) aelh);
        this.e = bArr;
        this.a = executor;
        this.b = awdn;
        this.k = amsv;
        this.c = aelh;
        this.d = afif.a(account, 199, anuc.f);
        if (!axti.c()) {
            b();
        }
    }

    public final void a() {
        synchronized (this.f) {
            if (!this.g && this.h != null) {
                this.g = true;
                aorl.a((aorr) this.k.a(), new peo(this), this.a);
            }
        }
    }

    public final void b() {
        aepj aepj;
        if (pba.c()) {
            aepi i2 = aepj.i();
            aepl c2 = aepm.c();
            c2.a((int) axrs.a.a().r(), TimeUnit.SECONDS);
            i2.b(c2.a());
            i2.a(axti.a.a().f());
            i2.b(axti.a.a().g());
            if (axti.a.a().c()) {
                aepl c3 = aepm.c();
                c3.a((int) axti.a.a().e(), TimeUnit.SECONDS);
                i2.a(c3.a());
            }
            aepj = i2.a();
        } else {
            aepj = aepj.i;
        }
        afhs afhs = this.d;
        afhq b2 = afhr.b();
        b2.a(this.e, 1);
        afhs.a(aepj, b2.a());
    }

    public final void a(anuc anuc) {
        aorl.a(this.d.a(this.e, (audx) anuc), new peq(this), this.a);
    }

    public final void a(String str, Throwable th) {
        Log.e("AppsUpload", str, th);
        ((aetj) this.b.a()).a(12008);
        synchronized (this.f) {
            this.g = false;
            this.h = null;
            this.i.a(th);
            this.i = null;
        }
    }
}
