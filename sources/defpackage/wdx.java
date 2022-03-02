package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: wdx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wdx implements Runnable {
    private final wgu a;
    private final wgk b;
    private final String c;
    private final ShareTarget d;
    private final vtx e;

    public wdx(wgu wgu, wgk wgk, String str, ShareTarget shareTarget, vtx vtx) {
        this.a = wgu;
        this.b = wgk;
        this.c = str;
        this.d = shareTarget;
        this.e = vtx;
    }

    public final void run() {
        boolean z;
        wgu wgu = this.a;
        wgk wgk = this.b;
        String str = this.c;
        ShareTarget shareTarget = this.d;
        vtx vtx = this.e;
        if (thr.c("DiscoveryCancellationRunnable", wgk.a, ayni.h()) != null) {
            z = true;
        } else {
            z = false;
        }
        wgu.a((Runnable) new wfl(wgu, z, str, shareTarget, vtx));
    }
}
