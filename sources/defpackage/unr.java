package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import java.util.concurrent.CountDownLatch;

/* renamed from: unr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class unr extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ CountDownLatch a;
    final /* synthetic */ unt b;

    public unr(unt unt, CountDownLatch countDownLatch) {
        this.b = unt;
        this.a = countDownLatch;
    }

    public final void onAvailable(Network network) {
        unt unt = this.b;
        int i = Build.VERSION.SDK_INT;
        Network[] c = unt.c();
        int length = c.length;
        NetworkInfo[] networkInfoArr = new NetworkInfo[length];
        for (int i2 = 0; i2 < c.length; i2++) {
            networkInfoArr[i2] = unt.b.getNetworkInfo(c[i2]);
        }
        for (int i3 = 0; i3 < length; i3++) {
            NetworkInfo networkInfo = networkInfoArr[i3];
            if (networkInfo != null && networkInfo.getType() == 1 && networkInfo.isConnected()) {
                this.a.countDown();
                return;
            }
        }
    }
}
