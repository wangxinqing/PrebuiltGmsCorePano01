package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: tll  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tll implements Runnable {
    private final tlt a;
    private final String b;
    private final CountDownLatch c;

    public tll(tlt tlt, String str, CountDownLatch countDownLatch) {
        this.a = tlt;
        this.b = str;
        this.c = countDownLatch;
    }

    public final void run() {
        tlt tlt = this.a;
        String str = this.b;
        CountDownLatch countDownLatch = this.c;
        try {
            if (tlt.i == asoe.UNKNOWN_MEDIUM) {
                ((anih) tky.a.d()).a("BandwidthUpgradeManager has processed endpoint disconnection for %s because there is no current BandwidthUpgradeMedium.", (Object) str);
            } else {
                tnm tnm = (tnm) tlt.f.remove(str);
                if (tnm != null) {
                    tnm.a(6);
                }
                tlt.g.remove(str);
                tlt.a(str);
                tlt.h.remove(str);
                if (tlt.b.b() <= 1) {
                    ((tlx) tlt.e.get(tlt.i)).a();
                    tlt.i = asoe.UNKNOWN_MEDIUM;
                }
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
