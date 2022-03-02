package defpackage;

import com.google.android.location.network.NetworkLocationProvider;

/* renamed from: aisu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aisu implements ajqh {
    private final NetworkLocationProvider a;

    public aisu(NetworkLocationProvider networkLocationProvider) {
        this.a = networkLocationProvider;
    }

    public final void b(boolean z) {
        NetworkLocationProvider networkLocationProvider = this.a;
        if (networkLocationProvider.h != z) {
            networkLocationProvider.h = z;
            networkLocationProvider.b(false);
        }
    }
}
