package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: ahfv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahfv {
    public final String a;
    public final ahfw b;
    public final amju c;
    public final Object d = new Object();
    public List e = new ArrayList();
    private final aorr f;
    private final ahdg g;
    private final amju h = new amju(new ahfs(this), aoqm.a);

    public ahfv(ahfw ahfw, ahdg ahdg, aorr aorr) {
        this.b = ahfw;
        this.g = ahdg;
        this.f = aorr;
        this.a = ahfw.b();
        this.c = new amju(this.b.a(), aoqm.a);
        a(new ahfn(this));
    }

    public final aorr a() {
        amkr amkr;
        amlv.a();
        if (!this.h.d.isDone()) {
            String valueOf = String.valueOf(this.a);
            amkr = amlv.a(valueOf.length() == 0 ? new String("Get ") : "Get ".concat(valueOf), amlw.a);
        } else {
            amkr = null;
        }
        try {
            aorr a2 = aopr.a(this.h.a(), amll.a((aoqb) new ahfo(this)), (Executor) aoqm.a);
            if (amkr != null) {
                amkr.a(a2);
            }
            this.g.a(aorl.a(this.f));
            if (amkr != null) {
                amkr.close();
            }
            return a2;
        } catch (Throwable th) {
            if (amkr != null) {
                amkr.close();
            }
            throw th;
        }
    }

    public final aorr a(amqy amqy, Executor executor) {
        return a(amll.a((aoqb) new ahfq(amqy)), executor);
    }

    public final aorr a(aoqb aoqb, Executor executor) {
        amlv.a();
        String valueOf = String.valueOf(this.a);
        amkr a2 = amlv.a(valueOf.length() == 0 ? new String("Update ") : "Update ".concat(valueOf), amlw.a);
        try {
            aorr a3 = aopr.a(this.h.a(), amll.a((aoqb) new ahfp(this, aoqb, executor)), (Executor) aoqm.a);
            a2.a(a3);
            this.g.b(aorl.a(this.f));
            if (a2 != null) {
                a2.close();
            }
            return a3;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void a(aoqb aoqb) {
        synchronized (this.d) {
            this.e.add(aoqb);
        }
    }
}
