package defpackage;

import android.os.SystemClock;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: tve  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tve implements Runnable {
    private final tvg a;
    private final ModuleManager.FeatureRequestProgressListener b;

    public tve(tvg tvg, ModuleManager.FeatureRequestProgressListener featureRequestProgressListener) {
        this.a = tvg;
        this.b = featureRequestProgressListener;
    }

    public final void run() {
        tvg tvg = this.a;
        ModuleManager.FeatureRequestProgressListener featureRequestProgressListener = this.b;
        if (SystemClock.elapsedRealtime() - tvg.b < aymt.y()) {
            jjg jjg = tsp.a;
            aymt.y();
            return;
        }
        tvg.b = SystemClock.elapsedRealtime();
        if (tvg.b()) {
            ((anih) tsp.a.d()).a("loadFastPairModule: FastPair module is downloaded.");
            return;
        }
        ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
        featureRequest.setUrgent(featureRequestProgressListener);
        featureRequest.requestFeatureAtLatestVersion("fast_pair");
        if (ModuleManager.get(tvg.a).requestFeatures(featureRequest)) {
            ((anih) tsp.a.d()).a("loadFastPairModule: feature request succeeded.");
            tvg.a(tvg.a, asom.FAST_PAIR_OPTIONAL_MODULE_REQUEST_SUCCEEDED);
            return;
        }
        ((anih) tsp.a.c()).a("loadFastPairModule: feature request failed.");
        tvg.a(tvg.a, asom.FAST_PAIR_OPTIONAL_MODULE_REQUEST_FAILED);
    }
}
