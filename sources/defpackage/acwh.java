package defpackage;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: acwh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acwh extends LifecycleCallback {
    private final List a = new ArrayList();

    private acwh(ify ify) {
        super(ify);
        this.e.a("TaskOnStopCallback", (LifecycleCallback) this);
    }

    private static acwh a(ify ify) {
        acwh acwh = (acwh) ify.a("TaskOnStopCallback", acwh.class);
        return acwh == null ? new acwh(ify) : acwh;
    }

    public static acwh b(Activity activity) {
        return a(LifecycleCallback.a(activity));
    }

    public static acwh b(com.google.android.chimera.Activity activity) {
        return a(LifecycleCallback.a(activity));
    }

    public final void a(acwb acwb) {
        synchronized (this.a) {
            this.a.add(new WeakReference(acwb));
        }
    }

    public final void b() {
        synchronized (this.a) {
            for (WeakReference weakReference : this.a) {
                acwb acwb = (acwb) weakReference.get();
                if (acwb != null) {
                    acwb.a();
                }
            }
            this.a.clear();
        }
    }
}
