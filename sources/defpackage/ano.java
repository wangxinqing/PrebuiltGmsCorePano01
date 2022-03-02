package defpackage;

import android.os.Bundle;

/* renamed from: ano  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ano {
    public final ann a = new ann();
    private final anp b;

    private ano(anp anp) {
        this.b = anp;
    }

    public static ano a(anp anp) {
        return new ano(anp);
    }

    public final void b(Bundle bundle) {
        ann ann = this.a;
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = ann.b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        k a2 = ann.a.a();
        while (a2.hasNext()) {
            j jVar = (j) a2.next();
            bundle2.putBundle((String) jVar.a, ((anm) jVar.b).a());
        }
        bundle.putBundle("android.arch.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public final void a(Bundle bundle) {
        ae lifecycle = this.b.getLifecycle();
        if (lifecycle.a() == ad.INITIALIZED) {
            lifecycle.a(new anj(this.b));
            ann ann = this.a;
            if (!ann.c) {
                if (bundle != null) {
                    ann.b = bundle.getBundle("android.arch.lifecycle.BundlableSavedStateRegistry.key");
                }
                lifecycle.a(new ank());
                ann.c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }
}
