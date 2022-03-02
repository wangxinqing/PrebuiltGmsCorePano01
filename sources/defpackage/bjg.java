package defpackage;

import com.google.android.chimera.FragmentManager;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: bjg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bjg implements hi {
    private static final WeakHashMap b = new WeakHashMap();
    final FragmentManager.OnBackStackChangedListener a;

    public bjg(FragmentManager.OnBackStackChangedListener onBackStackChangedListener) {
        this.a = onBackStackChangedListener;
    }

    public static bjg a(FragmentManager.OnBackStackChangedListener onBackStackChangedListener, boolean z) {
        bjg bjg;
        WeakReference weakReference = (WeakReference) b.get(onBackStackChangedListener);
        if (weakReference != null) {
            bjg = (bjg) weakReference.get();
            if (bjg == null) {
                b.remove(weakReference);
            }
        } else {
            bjg = null;
        }
        if (bjg != null || !z) {
            return bjg;
        }
        bjg bjg2 = new bjg(onBackStackChangedListener);
        b.put(onBackStackChangedListener, new WeakReference(bjg2));
        return bjg2;
    }

    public final void a() {
        this.a.onBackStackChanged();
    }
}
