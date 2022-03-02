package defpackage;

import java.util.concurrent.ScheduledFuture;

/* renamed from: babp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class babp {
    private final babo a;
    private final ScheduledFuture b;

    public babp(babo babo, ScheduledFuture scheduledFuture) {
        amrl.a((Object) babo, (Object) "runnable");
        this.a = babo;
        amrl.a((Object) scheduledFuture, (Object) "future");
        this.b = scheduledFuture;
    }

    public final void a() {
        this.a.b = true;
        this.b.cancel(false);
    }

    public final boolean b() {
        babo babo = this.a;
        return !babo.c && !babo.b;
    }
}
