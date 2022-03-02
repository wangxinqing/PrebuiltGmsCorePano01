package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: wgj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wgj {
    public final String a;
    private tfu b = null;
    private final ScheduledExecutorService c;

    public wgj(ScheduledExecutorService scheduledExecutorService, String str) {
        this.c = scheduledExecutorService;
        this.a = str;
    }

    public final synchronized void a() {
        tfu tfu = this.b;
        if (tfu != null) {
            tfu.b();
            this.b = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(long j, vtx vtx, ShareTarget shareTarget, wcx wcx) {
        ((anih) ((anih) vvj.a.d()).a("wgj", "a", 4501, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s alarm timed out after %d ms. Closing connection.", (Object) this.a, j);
        vtx.a(shareTarget, new vtv(10).a());
        wcx.b();
    }

    public final synchronized void a(ShareTarget shareTarget, wcx wcx, vtx vtx, long j) {
        a();
        jjg jjg = vvj.a;
        this.b = tfu.b(new wgi(this, j, vtx, shareTarget, wcx), j, this.c);
    }
}
