package defpackage;

import com.google.android.chimera.config.ModuleManager;
import java.lang.ref.WeakReference;

/* renamed from: bju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bju extends boi {
    private final WeakReference a;

    public bju(ModuleManager.FeatureRequestProgressListener featureRequestProgressListener) {
        this.a = new WeakReference(featureRequestProgressListener);
    }

    public final void a(int i) {
        ModuleManager.FeatureRequestProgressListener featureRequestProgressListener;
        synchronized (this) {
            featureRequestProgressListener = (ModuleManager.FeatureRequestProgressListener) this.a.get();
        }
        if (featureRequestProgressListener != null) {
            featureRequestProgressListener.onRequestComplete(i);
        }
    }
}
