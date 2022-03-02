package defpackage;

import com.google.android.chimera.config.ModuleManager;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: hfb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hfb extends ModuleManager.FeatureRequestProgressListener {
    public final ArrayBlockingQueue a = new ArrayBlockingQueue(1);

    public final void onRequestComplete(int i) {
        this.a.add(Integer.valueOf(i));
    }
}
