package defpackage;

import android.os.SystemClock;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: vka  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vka implements Runnable {
    private final vkd a;
    private final ShareTarget b;

    public vka(vkd vkd, ShareTarget shareTarget) {
        this.a = vkd;
        this.b = shareTarget;
    }

    public final void run() {
        int i;
        vkd vkd = this.a;
        ShareTarget shareTarget = this.b;
        NearbySharingChimeraService nearbySharingChimeraService = vkd.a;
        for (vmx vmx : nearbySharingChimeraService.m.values()) {
            vmx.a.a(shareTarget);
        }
        if (!shareTarget.n && nearbySharingChimeraService.w.b(shareTarget) == null) {
            nearbySharingChimeraService.w.a(shareTarget, "INTERNAL_PROVIDER_ID");
        }
        vva vva = nearbySharingChimeraService.r;
        long elapsedRealtime = SystemClock.elapsedRealtime() - nearbySharingChimeraService.s;
        if (!shareTarget.k) {
            i = 4;
        } else {
            i = 3;
        }
        aucd d = vvb.d(12);
        aucd o = aslf.d.o();
        aubn a2 = augi.a(elapsedRealtime);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aslf aslf = (aslf) o.b;
        a2.getClass();
        aslf.c = a2;
        aslf.a |= 2;
        o.i();
        aslz b2 = vvb.b(i);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aslf aslf2 = (aslf) o.b;
        b2.getClass();
        aslf2.b = b2;
        aslf2.a |= 1;
        aslf aslf3 = (aslf) o.i();
        if (d.c) {
            d.c();
            d.c = false;
        }
        asmc asmc = (asmc) d.b;
        asmc asmc2 = asmc.B;
        aslf3.getClass();
        asmc.m = aslf3;
        asmc.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
        vva.a(new vuu((asmc) d.i()));
    }
}
