package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: wfy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wfy implements Runnable {
    private final wgu a;
    private final String b;

    public wfy(wgu wgu, String str) {
        this.a = wgu;
        this.b = str;
    }

    public final void run() {
        wgu wgu = this.a;
        String str = this.b;
        if (!wgu.i()) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "g", 1070, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring lost endpoint %s because we're no longer scanning", (Object) str);
            return;
        }
        vsh vsh = wgu.h;
        wgu.a.remove(str);
        ShareTarget d = wgu.d(str);
        if (d == null) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "g", 1079, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring lost endpoint %s because we don't have an associated ShareTarget", (Object) str);
            return;
        }
        vsh.b(d);
        wgu.q.a(d);
        ((anih) ((anih) vvj.a.d()).a("wgu", "g", 1086, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Reported onShareTargetLost for %s", (Object) d);
    }
}
