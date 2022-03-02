package defpackage;

import android.content.Context;
import com.google.android.libraries.rocket.impressions.Session;

/* renamed from: lgl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class lgl implements lgd {
    protected final agyg a;
    protected final Context b;

    public lgl(agyg agyg, Context context) {
        iva.a((Object) agyg);
        this.a = agyg;
        iva.a((Object) context);
        this.b = context;
    }

    public final void a() {
        agyg agyg = this.a;
        synchronized (agyg.a) {
            agyg.a(agyj.NOT_STARTED, "startSession");
            agyg.a();
            agyg.c.c = agyj.IN_PROGRESS;
        }
    }

    public final void b() {
        agyg agyg = this.a;
        synchronized (agyg.a) {
            agyg.a(agyj.IN_PROGRESS, "sendHeartbeat");
            if (!agyg.b()) {
                agyl agyl = agyg.d;
                Session session = agyg.c;
                agyg.a(agyf.a(agyl, session.g, session.h));
            }
        }
    }

    public /* bridge */ /* synthetic */ lfq c() {
        throw null;
    }

    public lgc d() {
        return new lgc(this, this.b);
    }

    public void a(lgc lgc) {
        agyg agyg = this.a;
        agyf agyf = new agyf(lgc.b);
        synchronized (agyg.a) {
            agyg.a(agyj.IN_PROGRESS, "log");
            agyg.b();
            Session session = agyg.c;
            long j = session.f;
            session.f = 1 + j;
            agyf.b(j);
            agyf.a(agyg.c.g);
            agyg.b(agyf);
        }
    }
}
