package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import java.nio.charset.Charset;

/* renamed from: vjy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vjy implements Runnable {
    private final NearbySharingChimeraService.AnonymousClass5 a;

    public vjy(NearbySharingChimeraService.AnonymousClass5 r1) {
        this.a = r1;
    }

    public final void run() {
        NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.b();
    }
}
