package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.util.Log;
import java.util.Collection;

/* renamed from: aaea  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaea extends ConnectivityManager.NetworkCallback {
    public final int a;
    boolean b = false;
    final /* synthetic */ aaeb c;
    private final Collection d;

    public aaea(aaeb aaeb, int i, Collection collection) {
        this.c = aaeb;
        this.a = i;
        this.d = collection;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [java.util.List, java.util.Collection] */
    /* access modifiers changed from: package-private */
    public final void a(ConnectivityManager connectivityManager) {
        boolean z;
        if (connectivityManager != null) {
            boolean z2 = this.b;
            aaeb aaeb = this.c;
            int i = this.a;
            if ((aaeb.a & i) != i) {
                z = false;
            } else {
                z = true;
            }
            if (z2 != z) {
                if (!z2) {
                    NetworkRequest.Builder addCapability = new NetworkRequest.Builder().addCapability(14).addCapability(12);
                    ? r1 = this.d;
                    int size = r1.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        addCapability.addCapability(((Integer) r1.get(i2)).intValue());
                    }
                    connectivityManager.requestNetwork(addCapability.build(), this);
                } else {
                    connectivityManager.unregisterNetworkCallback(this);
                }
                this.b = !this.b;
                return;
            }
            return;
        }
        Log.w("NetworkScheduler", "ConnectivityManager unavailable, not updating network listener");
    }

    public final void onAvailable(Network network) {
        synchronized (this.c) {
            aaeb aaeb = this.c;
            aaeb.a = (this.a ^ -1) & aaeb.a;
            a(aaeb.a());
            aabg.a().d.a();
        }
    }
}
