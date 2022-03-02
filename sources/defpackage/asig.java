package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: asig  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asig {
    public static final asib a = ashw.a;
    public final Handler b;
    public final HashMap c;
    public final aneu d;
    public final ArrayList e;
    public final HashSet f;
    public final Runnable g = new ashx(this);

    public asig(Handler handler) {
        this.b = handler;
        this.c = new HashMap();
        this.e = new ArrayList();
        this.f = new HashSet();
        this.d = amzg.q();
    }

    public final ashy a(asic asic) {
        asif asif = (asif) this.c.get(asic);
        if (asif != null) {
            return asif.b;
        }
        return null;
    }

    public final void b(asic asic) {
        synchronized (this.c) {
            asif asif = (asif) this.c.remove(asic);
            this.e.remove(asif);
            this.b.removeCallbacks(asif);
            for (Runnable removeCallbacks : ((amxb) this.d).e(asif)) {
                this.b.removeCallbacks(removeCallbacks);
            }
            if (asif != null) {
                asif.c = true;
                asif.run();
            }
        }
    }

    public final void a(asic asic, ashy ashy, asic... asicArr) {
        synchronized (this.c) {
            b(asic);
            asif asif = new asif(this, asic, ashy, asicArr);
            this.c.put(asic, asif);
            a(asif, 0);
        }
    }

    public final void a(asif asif, long j) {
        ashz ashz = new ashz(this, asif);
        this.d.a((Object) asif, (Object) ashz);
        this.b.postDelayed(ashz, j);
    }
}
