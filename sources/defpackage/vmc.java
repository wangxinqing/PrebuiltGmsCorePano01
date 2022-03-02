package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.RegisterSharingProviderParams;

/* renamed from: vmc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vmc implements Runnable {
    private final vmt a;
    private final RegisterSharingProviderParams b;
    private final wbv c;
    private final String d;

    public vmc(vmt vmt, RegisterSharingProviderParams registerSharingProviderParams, wbv wbv, String str) {
        this.a = vmt;
        this.b = registerSharingProviderParams;
        this.c = wbv;
        this.d = str;
    }

    public final void run() {
        vmt vmt = this.a;
        NearbySharingChimeraService.a(vmt.a, "registerSharingProvider", this.b.a, new vlv(vmt, this.c, this.d));
    }
}
