package defpackage;

import android.app.Activity;
import android.content.pm.PackageManager;

/* renamed from: fn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fn implements Runnable {
    final /* synthetic */ String[] a;
    final /* synthetic */ Activity b;

    public fn(String[] strArr, Activity activity) {
        this.a = strArr;
        this.b = activity;
    }

    public final void run() {
        int[] iArr = new int[this.a.length];
        PackageManager packageManager = this.b.getPackageManager();
        String packageName = this.b.getPackageName();
        int length = this.a.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = packageManager.checkPermission(this.a[i], packageName);
        }
        ((fo) this.b).onRequestPermissionsResult(0, this.a, iArr);
    }
}
