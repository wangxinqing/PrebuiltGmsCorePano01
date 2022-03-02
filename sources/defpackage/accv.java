package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: accv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class accv implements accj {
    public final Queue a = new LinkedList();
    public accj b;
    private final Handler c;

    public accv(Looper looper) {
        this.c = new qvr(looper);
    }

    public final void a(accj accj) {
        Object obj;
        this.b = accj;
        oq oqVar = (oq) this.a.poll();
        if (accj != null && oqVar != null && (obj = oqVar.a) != null && oqVar.b != null) {
            a(accj, ((Integer) obj).intValue(), (Bundle) oqVar.b);
        }
    }

    public final void b(int i, Bundle bundle) {
        accj accj = this.b;
        if (accj == null) {
            this.a.add(oq.a(Integer.valueOf(i), bundle));
        } else {
            accj.b(i, bundle);
        }
    }

    public final void a(accj accj, int i, Bundle bundle) {
        this.c.post(new accu(this, accj, i, bundle));
    }
}
