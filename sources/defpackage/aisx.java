package defpackage;

import com.google.android.location.network.NetworkLocationProvider;

/* renamed from: aisx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aisx implements Runnable {
    private final NetworkLocationProvider a;

    public aisx(NetworkLocationProvider networkLocationProvider) {
        this.a = networkLocationProvider;
    }

    public final void run() {
        this.a.a();
    }
}
