package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: ifz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ifz implements Runnable {
    final /* synthetic */ LifecycleCallback a;
    final /* synthetic */ String b;
    final /* synthetic */ iga c;

    public ifz(iga iga, LifecycleCallback lifecycleCallback, String str) {
        this.c = iga;
        this.a = lifecycleCallback;
        this.b = str;
    }

    public final void run() {
        Bundle bundle;
        iga iga = this.c;
        if (iga.b > 0) {
            LifecycleCallback lifecycleCallback = this.a;
            Bundle bundle2 = iga.c;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(this.b);
            } else {
                bundle = null;
            }
            lifecycleCallback.a(bundle);
        }
        if (this.c.b >= 2) {
            this.a.a();
        }
        if (this.c.b >= 3) {
            this.a.e();
        }
        if (this.c.b >= 4) {
            this.a.b();
        }
        int i = this.c.b;
    }
}
