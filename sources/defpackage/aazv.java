package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.security.verifier.InternalApkUploadChimeraService;

/* renamed from: aazv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aazv {
    private final ConnectivityManager a;
    private boolean b;
    private boolean c;
    private boolean d;

    public aazv() {
        this.a = null;
    }

    private final void c() {
        NetworkInfo activeNetworkInfo = this.a.getActiveNetworkInfo();
        boolean z = false;
        if (activeNetworkInfo != null) {
            this.b = activeNetworkInfo.isConnected();
            int i = Build.VERSION.SDK_INT;
            NetworkInfo activeNetworkInfo2 = this.a.getActiveNetworkInfo();
            if (activeNetworkInfo2 != null && activeNetworkInfo2.isConnected()) {
                z = true;
            }
            this.c = z;
            this.d = ml.a(this.a);
            return;
        }
        this.b = false;
    }

    public final synchronized void a(Context context) {
        boolean b2 = b();
        c();
        if (!b2 && b()) {
            InternalApkUploadChimeraService.a(context, 0);
        }
    }

    public final synchronized boolean a() {
        return this.b && !this.d;
    }

    public final synchronized boolean b() {
        return this.b && this.c && !this.d;
    }

    public aazv(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
        c();
    }
}
