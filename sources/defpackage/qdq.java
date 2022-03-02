package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: qdq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qdq {
    public final Context a;
    public final ScheduledExecutorService b;
    private qdm c = new qdm(this);
    private int d = 1;

    public qdq(Context context) {
        ScheduledExecutorService a2 = qvj.b.a((ThreadFactory) new jlt("MessengerIpcClient"), 2);
        this.a = context.getApplicationContext();
        this.b = a2;
    }

    public final synchronized int a() {
        int i;
        i = this.d;
        this.d = i + 1;
        return i;
    }

    public final synchronized acwa a(qdo qdo) {
        if (!this.c.a(qdo)) {
            qdm qdm = new qdm(this);
            this.c = qdm;
            qdm.a(qdo);
        }
        return qdo.b.a;
    }
}
