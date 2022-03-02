package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import java.nio.charset.Charset;

/* renamed from: vjz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vjz implements Runnable {
    private final NearbySharingChimeraService.AnonymousClass6 a;

    public vjz(NearbySharingChimeraService.AnonymousClass6 r1) {
        this.a = r1;
    }

    public final void run() {
        NearbySharingChimeraService.AnonymousClass6 r0 = this.a;
        NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.t();
        NearbySharingChimeraService.this.g();
    }
}
