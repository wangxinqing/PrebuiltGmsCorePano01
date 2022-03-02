package defpackage;

import android.os.WorkSource;
import com.android.location.provider.ProviderRequestUnbundled;
import com.google.android.location.network.NetworkLocationProvider;

/* renamed from: aisz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aisz implements Runnable {
    private final NetworkLocationProvider a;
    private final ProviderRequestUnbundled b;
    private final WorkSource c;

    public aisz(NetworkLocationProvider networkLocationProvider, ProviderRequestUnbundled providerRequestUnbundled, WorkSource workSource) {
        this.a = networkLocationProvider;
        this.b = providerRequestUnbundled;
        this.c = workSource;
    }

    public final void run() {
        NetworkLocationProvider networkLocationProvider = this.a;
        ProviderRequestUnbundled providerRequestUnbundled = this.b;
        WorkSource workSource = this.c;
        networkLocationProvider.i = providerRequestUnbundled;
        networkLocationProvider.j = workSource;
        networkLocationProvider.b(true);
    }
}
