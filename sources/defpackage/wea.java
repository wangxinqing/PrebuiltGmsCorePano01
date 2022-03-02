package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: wea  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wea implements acvs {
    private final wgu a;
    private final vtx b;
    private final ShareTarget c;

    public wea(wgu wgu, vtx vtx, ShareTarget shareTarget) {
        this.a = wgu;
        this.b = vtx;
        this.c = shareTarget;
    }

    public final void a(Exception exc) {
        wgu wgu = this.a;
        wgu.a((Runnable) new wfi(wgu, this.b, this.c, exc));
    }
}
