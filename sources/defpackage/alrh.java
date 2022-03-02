package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: alrh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alrh implements alre {
    private final ScheduledExecutorService a;

    public alrh(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    public final alrf a(alrj alrj) {
        return new alri(alrj, this.a);
    }
}
