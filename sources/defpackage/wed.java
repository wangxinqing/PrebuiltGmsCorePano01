package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: wed  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wed implements Runnable {
    private final wgu a;
    private final wcx b;
    private final vtx c;
    private final String d;
    private final ShareTarget e;

    public wed(wgu wgu, wcx wcx, vtx vtx, String str, ShareTarget shareTarget) {
        this.a = wgu;
        this.b = wcx;
        this.c = vtx;
        this.d = str;
        this.e = shareTarget;
    }

    public final void run() {
        wgu wgu = this.a;
        wcx wcx = this.b;
        wgu.a((Runnable) new wfg(wgu, wcx, this.c, this.d, this.e, wgu.a(wcx, vnv.RESPONSE, ayni.D())));
    }
}
