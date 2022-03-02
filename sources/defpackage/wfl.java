package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: wfl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wfl implements Runnable {
    private final wgu a;
    private final boolean b;
    private final String c;
    private final ShareTarget d;
    private final vtx e;

    public wfl(wgu wgu, boolean z, String str, ShareTarget shareTarget, vtx vtx) {
        this.a = wgu;
        this.b = z;
        this.c = str;
        this.d = shareTarget;
        this.e = vtx;
    }

    public final void run() {
        wgu wgu = this.a;
        boolean z = this.b;
        String str = this.c;
        ShareTarget shareTarget = this.d;
        vtx vtx = this.e;
        if (!z) {
            vtx.a(shareTarget, new vtv(7).a());
            wgu.q.a(shareTarget);
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 1475, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to connect to outdated %s, because failed to discover the share target.", (Object) shareTarget);
            return;
        }
        wgu.c(str, shareTarget, vtx);
    }
}
