package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: weg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class weg implements Callable {
    private final wgu a;
    private final ShareTarget b;

    public weg(wgu wgu, ShareTarget shareTarget) {
        this.a = wgu;
        this.b = shareTarget;
    }

    public final Object call() {
        wgu wgu = this.a;
        ShareTarget shareTarget = this.b;
        wcx i = wgu.i(shareTarget);
        if (i == null) {
            ((anih) ((anih) vvj.a.c()).a("wgu", "t", 2424, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Deny invoked for unknown share target");
            return 35511;
        }
        int i2 = 35510;
        if (ayni.a.a().aI()) {
            jjg jjg = vvj.a;
            i.a((wcw) new wez(wgu, tfu.b(new wex(i), ayni.w(), wgu.d), shareTarget));
            aucd o = vne.c.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            vne vne = (vne) o.b;
            vne.b = 2;
            vne.a |= 1;
            try {
                wgu.a(i, (vne) o.i());
                ((anih) ((anih) vvj.a.d()).a("wgu", "t", 2458, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully wrote a rejection response frame");
                i2 = 0;
            } catch (IOException e) {
                anih anih = (anih) vvj.a.c();
                anih.a((Throwable) e);
                ((anih) anih.a("wgu", "t", 2460, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to write the rejection response frame");
            }
        } else {
            i.a((wcw) new wfa(wgu, shareTarget));
            aucd o2 = vne.c.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            vne vne2 = (vne) o2.b;
            vne2.b = 2;
            vne2.a |= 1;
            try {
                wgu.a(i, (vne) o2.i());
                ((anih) ((anih) vvj.a.d()).a("wgu", "t", 2477, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully wrote a rejection response frame");
                i2 = 0;
            } catch (IOException e2) {
                anih anih2 = (anih) vvj.a.c();
                anih2.a((Throwable) e2);
                ((anih) anih2.a("wgu", "t", 2479, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to write the rejection response frame");
            }
            i.a((wcw) new wfc(wgu, tfu.b(new wfb(i), ayni.w(), wgu.d), shareTarget));
        }
        vtx k = wgu.k(shareTarget);
        if (k != null) {
            k.a(shareTarget, new vtv(8).a());
        }
        return Integer.valueOf(i2);
    }
}
