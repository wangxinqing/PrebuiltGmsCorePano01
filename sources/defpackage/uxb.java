package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* renamed from: uxb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uxb implements ComponentCallbacks2 {
    final /* synthetic */ uxd a;

    public uxb(uxd uxd) {
        this.a = uxd;
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        this.a.d.c(new uxa(this, "onTrimMemory", i));
    }
}
