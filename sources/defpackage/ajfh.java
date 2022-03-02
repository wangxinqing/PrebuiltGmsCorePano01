package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: ajfh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajfh extends ajgs implements ajfe {
    public ajfm a;
    private final Context b;
    private final ajfq c;
    private final jiq d;
    private ajgx e;

    public ajfh(Context context, jiq jiq, ajfq ajfq) {
        super("SessionMgr");
        this.b = context;
        this.d = jiq;
        this.c = ajfq;
    }

    public final void a() {
        jjg jjg = ajfj.a;
        if (this.e == null) {
            if (ayek.y()) {
                this.e = ajgn.a("ea_q_h", this.d, amzy.a((Object) new ajgi(TimeUnit.MILLISECONDS.toSeconds(ayek.r() - ayek.q()), 1)), (Executor) new jls((Handler) this.h.b));
            } else {
                this.e = new ajgw(ayek.r() - ayek.q());
            }
        }
        ajfm ajfm = new ajfm(this.c.h().c, this.c.h().d, ajdg.a(this.b), System.currentTimeMillis());
        this.a = ajfm;
        ajcu.a(this.b, "start", ajfm);
        a(0);
        this.h.c();
    }

    public final void b() {
        ajcu.a(this.b, "finish", this.a);
    }

    public final void a(long j) {
        if (!this.h.b.hasMessages(5)) {
            this.h.b.a(5, (Bundle) null, j);
        }
    }

    public final boolean a(Message message) {
        int i = message.what;
        if (i == 5) {
            jjg jjg = ajfj.a;
            if (ayek.y()) {
                long b2 = this.e.b(new ajff(this));
                if (b2 > 0) {
                    a(b2 * 1000);
                }
            } else {
                this.e.a(new ajfg(this));
                a(ayek.r());
            }
        } else if (i == 6) {
            jjg jjg2 = ajfj.a;
            ajcu.a(this.b, "heartbeat", this.a);
        } else if (i == 8) {
            jjg jjg3 = ajfj.a;
            this.a.g++;
            ajcu.a(this.b, true);
        } else if (i == 9) {
            jjg jjg4 = ajfj.a;
            this.a.f++;
            ajcu.a(this.b, false);
        }
        return false;
    }
}
