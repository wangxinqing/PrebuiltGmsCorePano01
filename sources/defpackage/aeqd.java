package defpackage;

import android.util.Pair;
import java.util.concurrent.Executor;

/* renamed from: aeqd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeqd {
    public static final anax a = anax.a(aomt.UNKNOWN_HOST_EXCEPTION, aomt.UNAVAILABLE, aomt.DEADLINE_EXCEEDED);
    public final awdn b;
    public final aeqn c;
    public final afgp d;
    public final afbt e;
    public final awdn f;
    public final awdn g;
    public volatile auke h;
    public long i = Long.MIN_VALUE;
    private final aeqw j;

    public aeqd(awdn awdn, aeqn aeqn, aeqw aeqw, afbt afbt, awdn awdn2, awdn awdn3) {
        this.b = awdn;
        this.c = aeqn;
        this.j = aeqw;
        this.e = afbt;
        this.f = awdn2;
        this.g = awdn3;
        afgp afgp = new afgp(awdn);
        this.d = afgp;
        aeqc aeqc = new aeqc(this);
        aoqm aoqm = aoqm.a;
        synchronized (afgp.g) {
            afgp.g.add(Pair.create(aeqc, aoqm));
        }
    }

    public final aorr a() {
        aorr aorr;
        aeqw aeqw = this.j;
        try {
            aeqo aeqo = new aeqo();
            aeqx aeqx = aeqw.a;
            awdx.a(aeqx);
            aeqo.b = aeqx;
            if (aeqo.a == null) {
                aeqo.a = new aesf();
            }
            awdx.a((Object) aeqo.b, aeqx.class);
            aorr = new aeqy(aeqo.b).a.b();
        } catch (RuntimeException e2) {
            aorr = aorl.a((Throwable) e2);
        }
        return aopr.a(aooz.a(aorr, Exception.class, (aoqb) new aepy(this), (Executor) aoqm.a), (amqy) new aepz(this), (Executor) aoqm.a);
    }
}
