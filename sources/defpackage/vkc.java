package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: vkc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vkc implements Runnable {
    private final vkd a;
    private final ShareTarget b;
    private final int c;

    public vkc(vkd vkd, ShareTarget shareTarget, int i) {
        this.a = vkd;
        this.b = shareTarget;
        this.c = i;
    }

    public final void run() {
        vkd vkd = this.a;
        ShareTarget shareTarget = this.b;
        int i = this.c;
        for (vmx vmx : vkd.a.m.values()) {
            vmx.a.a(shareTarget, i);
        }
    }
}
