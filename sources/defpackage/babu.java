package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* renamed from: babu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class babu extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ babw a;
    private boolean b = false;

    public babu(babw babw) {
        this.a = babw;
    }

    public final void onAvailable(Network network) {
        if (this.b) {
            this.a.a.f();
        } else {
            this.a.a.e();
        }
        this.b = true;
    }

    public final void onLost(Network network) {
        this.b = false;
    }
}
