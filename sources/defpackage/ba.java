package defpackage;

import android.app.Activity;

/* renamed from: ba  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ba extends y {
    final /* synthetic */ bb a;

    public ba(bb bbVar) {
        this.a = bbVar;
    }

    public final void onActivityPostResumed(Activity activity) {
        this.a.a.b();
    }

    public final void onActivityPostStarted(Activity activity) {
        this.a.a.a();
    }
}
