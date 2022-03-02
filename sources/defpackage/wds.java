package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: wds  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wds implements Runnable {
    private final wgu a;
    private final String b;
    private final int c;

    public wds(wgu wgu, String str, int i) {
        this.a = wgu;
        this.b = str;
        this.c = i;
    }

    public final void run() {
        wgu wgu = this.a;
        String str = this.b;
        int i = this.c;
        if (!wgu.i()) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "b", 1096, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring distance changed for endpoint %s because we're no longer scanning", (Object) str);
            return;
        }
        ShareTarget c2 = wgu.c(str);
        if (c2 != null) {
            wgu.h.a(c2, i);
        }
    }
}
