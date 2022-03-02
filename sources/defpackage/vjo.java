package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;

/* renamed from: vjo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vjo implements Runnable {
    private final NearbySharingChimeraService a;

    public vjo(NearbySharingChimeraService nearbySharingChimeraService) {
        this.a = nearbySharingChimeraService;
    }

    public final void run() {
        this.a.f();
    }
}
