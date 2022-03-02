package defpackage;

import android.content.Context;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: pst  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pst extends ppr {
    private final Context a;
    private final pas b;
    private final orf c;
    private final NativeIndex d;
    private final ozs e;
    private final oyt f;
    private final oyq n;
    private final auay o;
    private final agpk p;

    public pst(Context context, pas pas, orf orf, NativeIndex nativeIndex, ozs ozs, oyt oyt, oyq oyq, auay auay, agpk agpk) {
        super(aonk.USER_ACTIONS_PUSH_NOTIFICATIONS_HANDLE, 2);
        this.a = context;
        this.b = pas;
        this.c = orf;
        this.d = nativeIndex;
        this.e = ozs;
        this.f = oyt;
        this.n = oyq;
        this.o = auay;
        this.p = agpk;
    }

    private final void a(Exception exc) {
        oso.a((Throwable) exc, "User Actions deletion download failed!");
        this.f.a("ActionDeletionsPushTask", exc, axrp.f());
        this.n.b(4109);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        psr a2;
        oso.a("ActionsDeletionsPushTask#evaluate");
        if (!axsp.e()) {
            oso.c("App history upload disabled by flag.");
            return null;
        }
        try {
            a2 = psw.a(this.a, this.b, this.c, this.d, this.e, this.n, this.p);
            a2.d.a(this.o).get();
            if (!axsp.d()) {
                oso.c("Action deletions download disabled by flag.");
            } else {
                oso.a("Scheduling one-off task to download deletions.");
                qwq a3 = qwq.a(this.a);
                qxf qxf = new qxf();
                qxf.i = "com.google.android.gms.icing.service.IcingGcmTaskService";
                qxf.k = "action-deletions-download-push-triggered";
                qxf.a(((Boolean) ozx.d.c()).booleanValue());
                qxf.a(0, axcc.b() ? 1 : 0);
                qxf.a(0);
                qxf.b(1);
                qxf.a(axsp.a.a().n(), axsp.a.a().m());
                a3.a((qxx) qxf.b());
            }
            this.n.b(4108);
            a2.close();
            return null;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            a(e2);
            return null;
        } catch (ExecutionException e3) {
            if (e3.getCause() instanceof agom) {
                this.n.b(4110);
                return null;
            }
            a(e3);
            return null;
        } catch (psv e4) {
            this.n.b(4114);
            return null;
        } catch (agog | IOException e5) {
            a(e5);
            return null;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
