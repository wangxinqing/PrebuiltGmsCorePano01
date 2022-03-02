package defpackage;

import android.accounts.Account;
import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.identity.MatchPasswordResult;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Executor;

/* renamed from: fez  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fez extends p {
    public final String c;
    public final SavePasswordRequest d;
    public final aoru e;
    public final oq f;
    public aosh g;
    public final jls h;
    public final aw i;
    public final aw j;
    public final aw k;
    public final aw l;
    public final aw m;
    public anaf n;
    public qcu o;
    public final fex p;
    public boolean q = false;
    public final iby r;
    private final String s;
    private final fsj t;
    private aorr u;

    public fez(Application application, String str, String str2, String str3, SavePasswordRequest savePasswordRequest, oq oqVar) {
        super(application);
        this.s = str;
        this.c = str2;
        this.d = savePasswordRequest;
        this.e = jfb.a(2, 9);
        this.f = oqVar;
        fsh a = fsi.a();
        a.a = str3;
        this.t = fsg.a(application, a.a());
        wlr wlr = new wlr();
        wlr.a = 80;
        this.r = wlt.d(application, wlr.a());
        this.h = new jls((Handler) new qvr(Looper.getMainLooper()));
        this.i = new aw();
        this.j = new aw();
        this.l = new aw();
        this.k = new aw();
        this.m = new aw();
        this.o = qcu.MATCH_PASSWORDS;
        this.p = new fex(this);
    }

    public final void a() {
        qcu qcu = qcu.DEFAULT_PASSWORD_SAVING_FLOW_STEP;
        int ordinal = this.o.ordinal();
        if (ordinal == 1) {
            this.p.a.start();
            fsj fsj = this.t;
            SavePasswordRequest savePasswordRequest = this.d;
            String str = this.s;
            iva.a((Object) savePasswordRequest);
            iva.a((Object) str);
            iha b = ihb.b();
            b.a = new fuh(savePasswordRequest, str);
            this.u = aopr.a(qbc.a(((iby) fsj).a(b.a())), (aoqb) new fel(this), (Executor) this.e);
        } else if (ordinal == 2) {
            this.g = aosh.f();
            this.i.c(3);
            this.u = aopr.a((aorr) this.g, (amqy) new fep(this), (Executor) this.e);
        } else if (ordinal == 3) {
            this.g = aosh.f();
            this.i.c(2);
            this.u = aopr.a((aorr) this.g, feo.a, (Executor) this.e);
        } else if (ordinal == 4) {
            amzt j2 = amzy.j();
            MatchPasswordResult matchPasswordResult = (MatchPasswordResult) this.j.b();
            if (matchPasswordResult.b) {
                j2.b((Iterable) matchPasswordResult.a);
            } else {
                j2.c((Account) this.n.get(this.m.b()));
            }
            fsj fsj2 = this.t;
            SavePasswordRequest savePasswordRequest2 = this.d;
            amzy a = j2.a();
            String str2 = this.s;
            iva.a((Object) savePasswordRequest2);
            iva.b(true ^ a.isEmpty(), "At least 1 Account is required.");
            iva.c(str2);
            iha b2 = ihb.b();
            b2.a = new fui(savePasswordRequest2, a, str2);
            this.u = aopr.a(qbc.a(((iby) fsj2).b(b2.a())), feq.a, (Executor) this.e);
        } else {
            throw new IllegalStateException("Invalid flow step was reached");
        }
        aorl.a(this.u, new fes(this), this.h);
    }

    public final void b() {
        this.l.c(Status.e);
    }

    public final CharSequence c() {
        return (CharSequence) this.f.a;
    }
}
