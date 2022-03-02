package defpackage;

import android.content.Context;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: psk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class psk extends ppr {
    private final Context a;
    private final pas b;
    private final orf c;
    private final NativeIndex d;
    private final ozs e;
    private final oyt f;
    private final oyq n;
    private final agpk o;
    private final agpa p;

    public psk(Context context, pas pas, orf orf, NativeIndex nativeIndex, ozs ozs, oyt oyt, oyq oyq, agpk agpk, agpa agpa) {
        super(aonk.USER_ACTIONS_SYNC_DELETION_DOWNLOADS);
        this.a = context;
        this.b = pas;
        this.c = orf;
        this.d = nativeIndex;
        this.e = ozs;
        this.f = oyt;
        this.n = oyq;
        this.o = agpk;
        this.p = agpa;
    }

    private final void a(Exception exc) {
        oso.a((Throwable) exc, "User Actions deletion download failed!");
        this.f.a("ActionDeletionsDownloadTask", exc, axrp.f());
        this.n.b(4106);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        psq psq;
        psn psn;
        oso.a("ActionDeletionsDownloadTask#runAwake reason=%d", (Object) Integer.valueOf(this.p.ordinal()));
        try {
            psr a2 = psw.a(this.a, this.b, this.c, this.d, this.e, this.n, this.o);
            try {
                agpa agpa = this.p;
                if (((Boolean) a2.d.a().get()).booleanValue()) {
                    psq = new psq(a2);
                    psn = new psn(aoog.b(axsp.a.a().l()));
                    agpc agpc = a2.d;
                    agoz d2 = agpb.d();
                    d2.a(agpa);
                    d2.a(axsp.b());
                    aooz.a(agpc.a(d2.a(), psn, a2.e), Exception.class, (aoqb) new psm(a2), a2.e).get();
                    try {
                        psn.a(psq);
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    if (th != null) {
                        throw new ExecutionException(th);
                    }
                }
                this.n.b(4105);
                a2.close();
                return;
            } catch (Throwable th2) {
                a2.close();
                throw th2;
            }
            throw th;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            a(e2);
        } catch (ExecutionException e3) {
            if (e3.getCause() instanceof agom) {
                this.n.b(4107);
            } else {
                a(e3);
            }
        } catch (psv e4) {
            this.n.b(4114);
        } catch (agog | IOException e5) {
            a(e5);
        } catch (Throwable th3) {
            apev.a(th2, th3);
        }
    }
}
