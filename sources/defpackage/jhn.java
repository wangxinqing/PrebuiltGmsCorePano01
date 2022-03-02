package defpackage;

import android.app.ActivityManager;

/* renamed from: jhn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jhn implements ActivityManager.OnUidImportanceListener {
    final /* synthetic */ jho a;

    public jhn(jho jho) {
        this.a = jho;
    }

    public final void onUidImportance(int i, int i2) {
        this.a.a(i, jho.b(i2));
    }
}
