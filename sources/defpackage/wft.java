package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: wft  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wft implements Runnable {
    private final wgu a;
    private final ShareTarget b;

    public wft(wgu wgu, ShareTarget shareTarget) {
        this.a = wgu;
        this.b = shareTarget;
    }

    public final void run() {
        this.a.s(this.b);
    }
}
