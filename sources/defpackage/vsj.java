package defpackage;

import com.google.android.gms.nearby.sharing.SharingChimeraTileService;

/* renamed from: vsj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vsj implements acvv {
    private final SharingChimeraTileService a;

    public vsj(SharingChimeraTileService sharingChimeraTileService) {
        this.a = sharingChimeraTileService;
    }

    public final void a(Object obj) {
        SharingChimeraTileService sharingChimeraTileService = this.a;
        if (!((Boolean) obj).booleanValue()) {
            sharingChimeraTileService.a("com.google.android.gms.nearby.sharing.InternalReceiveSurfaceActivity");
        } else {
            sharingChimeraTileService.a("com.google.android.gms.nearby.sharing.SettingsActivity");
        }
    }
}
