package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import java.nio.charset.Charset;

/* renamed from: vjx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vjx implements Runnable {
    private final NearbySharingChimeraService.AnonymousClass4 a;

    public vjx(NearbySharingChimeraService.AnonymousClass4 r1) {
        this.a = r1;
    }

    public final void run() {
        NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
        boolean a2 = wht.a();
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.c(a2);
    }
}
