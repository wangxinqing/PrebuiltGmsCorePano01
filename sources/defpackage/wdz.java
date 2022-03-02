package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: wdz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wdz implements acvv {
    private final wgu a;
    private final vtx b;
    private final ShareTarget c;
    private final wgm d;
    private final long e;
    private final String f;

    public wdz(wgu wgu, vtx vtx, ShareTarget shareTarget, wgm wgm, long j, String str) {
        this.a = wgu;
        this.b = vtx;
        this.c = shareTarget;
        this.d = wgm;
        this.e = j;
        this.f = str;
    }

    public final void a(Object obj) {
        wgu wgu = this.a;
        wgu wgu2 = wgu;
        wgu.a((Runnable) new wfk(wgu2, (wcx) obj, this.b, this.c, this.d, this.e, this.f));
    }
}
