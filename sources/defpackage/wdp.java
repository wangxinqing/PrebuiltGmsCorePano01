package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: wdp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wdp {
    public final String a;
    private final List b = new ArrayList();
    private boolean c = true;
    private tfu d;

    public wdp(String str) {
        this.a = str;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        tfu tfu = this.d;
        if (tfu != null) {
            tfu.b();
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b() {
        this.c = false;
        tfu tfu = this.d;
        if (tfu != null) {
            tfu.b();
            this.d = null;
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            jjg jjg = vvj.a;
            ((Runnable) list.get(i)).run();
        }
        this.b.clear();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(int i) {
        if (this.c && i == 3) {
            ((anih) ((anih) vvj.a.d()).a("wdp", "a", 873, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Connection to endpoint %s has changed to a high quality medium.", (Object) this.a);
            b();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(long j) {
        ((anih) ((anih) vvj.a.d()).a("wdp", "a", 851, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s timed out for endpoint %s after %d ms.", (Object) "TransferManagerTimeoutAlarm", (Object) this.a, (Object) Long.valueOf(j));
        b();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(Runnable runnable) {
        if (this.c) {
            ((anih) ((anih) vvj.a.d()).a("wdp", "a", 819, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Connection to endpoint %s is waiting for a high quality medium, delaying payload transfer.", (Object) this.a);
            this.b.add(runnable);
            return;
        }
        runnable.run();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(ScheduledExecutorService scheduledExecutorService) {
        if (this.c && this.d == null) {
            long bk = ayni.a.a().bk();
            jjg jjg = vvj.a;
            this.d = tfu.b(new wdo(this, bk), bk, scheduledExecutorService);
        }
    }
}
