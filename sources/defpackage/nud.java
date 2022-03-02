package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.gcm.clientqueue.MessageRetryIntentOperation;
import java.util.concurrent.Executor;

/* renamed from: nud  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nud extends nsg {
    public final boolean a;
    public final nub b;
    public final nua c;
    public final nuh d;
    private final Executor e = jfm.b(10);

    public nud(nsh nsh, nub nub, nua nua, nuh nuh) {
        boolean b2 = axlr.b();
        this.a = b2;
        if (b2) {
            this.b = nub;
            this.c = nua;
            this.d = nuh;
            nsh.a(this, this.e);
            return;
        }
        this.b = null;
        this.c = null;
        this.d = null;
    }

    private static final PendingIntent c(int i) {
        return IntentOperation.getPendingIntent((Context) ihs.b(), MessageRetryIntentOperation.class, new Intent("com.google.android.gms.gcm.MESSAGE_RETRY"), 0, i);
    }

    public final void a() {
        jbs jbs = new jbs(ihs.b());
        amri a2 = this.d.a();
        if (!a2.a()) {
            PendingIntent c2 = c(536870912);
            if (c2 != null) {
                jbs.a(c2);
                return;
            }
            return;
        }
        nqw.a(jbs, "FcmRetry", ((Long) a2.b()).longValue(), c(134217728));
    }

    public final void b(ntx ntx) {
        this.d.a(ntx, nxy.CLIENT_QUEUE_APP_UNINSTALLED);
    }
}
