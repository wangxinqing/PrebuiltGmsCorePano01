package defpackage;

import com.google.android.gms.nearby.bootstrap.request.StopScanRequest;

/* renamed from: ter  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ter extends ihg {
    public ter(igc igc) {
        super(igc);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf, acwd acwd) {
        tdo tdo = (tdo) ibf;
        teo teo = new teo(acwd);
        tdo.w();
        ((tee) tdo.x()).a(new StopScanRequest(tea.a((idg) teo)));
    }
}
