package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: wfk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wfk implements Runnable {
    private final wgu a;
    private final wcx b;
    private final vtx c;
    private final ShareTarget d;
    private final wgm e;
    private final long f;
    private final String g;

    public wfk(wgu wgu, wcx wcx, vtx vtx, ShareTarget shareTarget, wgm wgm, long j, String str) {
        this.a = wgu;
        this.b = wcx;
        this.c = vtx;
        this.d = shareTarget;
        this.e = wgm;
        this.f = j;
        this.g = str;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
