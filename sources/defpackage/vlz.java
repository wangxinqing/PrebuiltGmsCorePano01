package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetDeviceNameParams;

/* renamed from: vlz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vlz implements Runnable {
    private final vmt a;
    private final SetDeviceNameParams b;

    public vlz(vmt vmt, SetDeviceNameParams setDeviceNameParams) {
        this.a = vmt;
        this.b = setDeviceNameParams;
    }

    public final void run() {
        vmt vmt = this.a;
        SetDeviceNameParams setDeviceNameParams = this.b;
        NearbySharingChimeraService.a(vmt.a, "setDeviceName", setDeviceNameParams.b, new vlw(vmt, setDeviceNameParams));
    }
}
