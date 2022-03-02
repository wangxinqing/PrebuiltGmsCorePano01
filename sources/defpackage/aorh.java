package defpackage;

import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: aorh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
enum aorh implements aorg {
    ;
    
    private static final Set b = null;

    static {
        b = new CopyOnWriteArraySet();
    }

    private aorh(String str) {
    }

    public final void a(Class cls) {
        for (WeakReference weakReference : b) {
            if (cls.equals(weakReference.get())) {
                return;
            }
        }
        aorj.a(cls);
        if (b.size() > 1000) {
            b.clear();
        }
        b.add(new WeakReference(cls));
    }
}
