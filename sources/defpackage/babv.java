package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: babv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class babv extends BroadcastReceiver {
    final /* synthetic */ babw a;
    private boolean b = false;

    public babv(babw babw) {
        this.a = babw;
    }

    public final void onReceive(Context context, Intent intent) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        boolean z = this.b;
        boolean z2 = false;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z2 = true;
        }
        this.b = z2;
        if (z2 && !z) {
            this.a.a.e();
        }
    }
}
