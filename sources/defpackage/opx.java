package defpackage;

import android.content.Context;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: opx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class opx extends ppr {
    private final Context a;
    private final prp b;
    private final ozs c;
    private final ozb d;
    private final pas e;
    private final NativeIndex f;
    private final oyq n;
    private final orf o;
    private final oyt p;
    private final agtt q;
    private final agpk r;

    public opx(Context context, prp prp, ozs ozs, ozb ozb, pas pas, NativeIndex nativeIndex, oyq oyq, orf orf, oyt oyt, agtt agtt, agpk agpk) {
        super(aonk.APP_HISTORY_EVENT_UPLOAD, 2);
        this.a = context;
        this.b = prp;
        this.c = ozs;
        this.d = ozb;
        this.e = pas;
        this.f = nativeIndex;
        this.n = oyq;
        this.o = orf;
        this.p = oyt;
        this.q = agtt;
        this.r = agpk;
    }

    public static void a(Context context) {
        qwq a2 = qwq.a(context);
        qxf qxf = new qxf();
        qxf.i = "com.google.android.gms.icing.service.IcingGcmTaskService";
        qxf.k = "app-history-upload";
        qxf.a(((Boolean) ozx.d.c()).booleanValue());
        qxf.b(0);
        qxf.a(((Long) ozx.S.c()).longValue(), ((Long) ozx.T.c()).longValue());
        a2.a((qxx) qxf.b());
    }

    private final void a(Exception exc) {
        oso.a((Throwable) exc, "User Actions upload failed!");
        this.p.a("AppHistoryEventUploadTask uploadUserActions", exc, axrp.f());
        this.n.b(4103);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        ptb a2;
        psr a3;
        if (!((Boolean) ozx.Q.c()).booleanValue()) {
            oso.c("App history upload disabled by flag.");
            return null;
        } else if (!axsp.e()) {
            return null;
        } else {
            try {
                a2 = psw.a(this.a, this.d, this.e, this.b, this.c, this.o, this.f, this.n, this.q);
                try {
                    a3 = psw.a(this.a, this.e, this.o, this.f, this.c, this.n, this.r);
                    a3.d.a(axsp.b()).get();
                    a3.close();
                    aopr.a(a2.g, (aoqb) new psz(), a2.h).get();
                    this.n.b(4102);
                } catch (ExecutionException e2) {
                    if (e2.getCause() instanceof agom) {
                        this.n.b(4107);
                    } else {
                        a((Exception) e2);
                    }
                } catch (Throwable th) {
                    apev.a(th, th);
                }
                a2.close();
                return null;
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
                a((Exception) e3);
                return null;
            } catch (ExecutionException e4) {
                if (e4.getCause() instanceof agom) {
                    this.n.b(4104);
                    return null;
                }
                a((Exception) e4);
                return null;
            } catch (psv e5) {
                this.n.b(4114);
                return null;
            } catch (agog | IOException e6) {
                a(e6);
                return null;
            } catch (Throwable th2) {
                apev.a(th, th2);
            }
        }
        throw th;
        throw th;
    }
}
