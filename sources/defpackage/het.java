package defpackage;

import android.util.Log;

/* renamed from: het  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class het implements aora {
    final /* synthetic */ heu a;

    public het(heu heu) {
        this.a = heu;
    }

    public final void a(Object obj) {
        this.a.a();
    }

    public final void a(Throwable th) {
        Log.e("FileApkSvc", "Staging failed.", th);
        this.a.a();
    }
}
