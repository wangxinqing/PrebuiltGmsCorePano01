package defpackage;

import com.google.android.gms.nearby.sharing.SharingChimeraTileService;

/* renamed from: vsk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vsk implements acvv {
    private final SharingChimeraTileService.AnonymousClass1 a;

    public vsk(SharingChimeraTileService.AnonymousClass1 r1) {
        this.a = r1;
    }

    public final void a(Object obj) {
        SharingChimeraTileService sharingChimeraTileService = SharingChimeraTileService.this;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = SharingChimeraTileService.b;
        sharingChimeraTileService.a(booleanValue);
    }
}
