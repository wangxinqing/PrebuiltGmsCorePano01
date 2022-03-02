package defpackage;

import android.os.Handler;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: hgz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hgz extends ModuleManager.FeatureRequestProgressListener {
    private Handler a;
    private ModuleManager b;
    private final ModuleManager.FeatureList c;

    public hgz(Handler handler, ModuleManager.FeatureList featureList, ModuleManager moduleManager) {
        this.a = handler;
        this.c = featureList;
        this.b = moduleManager;
    }

    public final synchronized void b() {
        this.a = null;
        this.b = null;
    }

    public final synchronized void onRequestComplete() {
        int i;
        ModuleManager moduleManager = this.b;
        Handler handler = this.a;
        if (!(handler == null || moduleManager == null)) {
            if (moduleManager.checkFeaturesAreAvailable(this.c) != 0) {
                i = 3;
            } else {
                i = 1;
            }
            handler.obtainMessage(0, i, 0).sendToTarget();
        }
    }
}
