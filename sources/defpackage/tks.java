package defpackage;

import com.google.android.gms.nearby.internal.connection.InitiateBandwidthUpgradeParams;
import java.util.concurrent.Callable;

/* renamed from: tks  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tks implements Callable {
    private final tku a;
    private final tlh b;
    private final InitiateBandwidthUpgradeParams c;

    public tks(tku tku, tlh tlh, InitiateBandwidthUpgradeParams initiateBandwidthUpgradeParams) {
        this.a = tku;
        this.b = tlh;
        this.c = initiateBandwidthUpgradeParams;
    }

    public final Object call() {
        tku tku = this.a;
        tlh tlh = this.b;
        InitiateBandwidthUpgradeParams initiateBandwidthUpgradeParams = this.c;
        if (!tlh.e(initiateBandwidthUpgradeParams.b)) {
            return 8009;
        }
        tku.a.b(tlh, initiateBandwidthUpgradeParams.b);
        return 0;
    }
}
