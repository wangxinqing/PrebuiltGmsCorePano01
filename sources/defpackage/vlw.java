package defpackage;

import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.SetDeviceNameParams;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: vlw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vlw implements Callable {
    private final vmt a;
    private final SetDeviceNameParams b;

    public vlw(vmt vmt, SetDeviceNameParams setDeviceNameParams) {
        this.a = vmt;
        this.b = setDeviceNameParams;
    }

    public final Object call() {
        vmt vmt = this.a;
        SetDeviceNameParams setDeviceNameParams = this.b;
        NearbySharingChimeraService nearbySharingChimeraService = vmt.c;
        String str = setDeviceNameParams.a;
        Charset charset = NearbySharingChimeraService.a;
        String trim = str.trim();
        int i = 13;
        if (TextUtils.isEmpty(trim)) {
            ((anih) vvj.a.c()).a("deviceName cannot be empty");
        } else {
            int integer = nearbySharingChimeraService.getResources().getInteger(R.integer.sharing_max_name_length_bytes);
            if (trim.getBytes(NearbySharingChimeraService.a).length > integer) {
                ((anih) vvj.a.c()).a("deviceName is too large. Expected at most %d bytes. Got %d bytes.", integer, trim.getBytes(NearbySharingChimeraService.a).length);
            } else if ("code:reset".equals(trim) && (vvb.a() == 2 || vvb.a() == 3)) {
                nearbySharingChimeraService.d(false);
                nearbySharingChimeraService.a(false);
                oq oqVar = nearbySharingChimeraService.t;
                if (oqVar != null) {
                    nearbySharingChimeraService.b((ShareTarget) oqVar.a);
                    nearbySharingChimeraService.o();
                    nearbySharingChimeraService.t = null;
                }
                nearbySharingChimeraService.p.b();
                vna.c();
                nearbySharingChimeraService.b.d();
                nearbySharingChimeraService.k.g();
                nearbySharingChimeraService.d().edit().clear().apply();
                whw.a(wij.a(nearbySharingChimeraService.q));
                nearbySharingChimeraService.a(true);
                nearbySharingChimeraService.v();
                nearbySharingChimeraService.e();
                ((anih) vvj.a.d()).a("Reset all local Nearby Sharing state");
                i = 35503;
            } else if (!nearbySharingChimeraService.d().contains("device_name") || !nearbySharingChimeraService.n().equals(trim)) {
                nearbySharingChimeraService.d().edit().putString("device_name", trim).apply();
                if (nearbySharingChimeraService.s()) {
                    nearbySharingChimeraService.t();
                    nearbySharingChimeraService.g();
                }
                nearbySharingChimeraService.k.c(trim);
                nearbySharingChimeraService.v();
                ((anih) vvj.a.d()).a("Device name set to %s", (Object) trim);
                i = 0;
            } else {
                i = 35500;
            }
        }
        return Integer.valueOf(i);
    }
}
