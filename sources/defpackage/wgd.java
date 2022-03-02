package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: wgd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wgd implements wdl {
    final /* synthetic */ ShareTarget a;
    final /* synthetic */ vtx b;
    final /* synthetic */ wgk c;
    final /* synthetic */ wgu d;

    public wgd(wgu wgu, ShareTarget shareTarget, vtx vtx, wgk wgk) {
        this.d = wgu;
        this.a = shareTarget;
        this.b = vtx;
        this.c = wgk;
    }

    public final void a(String str) {
    }

    public final void a(String str, int i) {
    }

    public final void a(String str, byte[] bArr) {
        this.d.a((Runnable) new wgc(this, bArr, this.a, str, this.b, this.c));
    }
}
