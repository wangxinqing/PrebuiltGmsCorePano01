package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.bootstrap.Device;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: abqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abqo implements abqg {
    public static final iwd a = acqa.a("D2D", "SourceDeviceConnectorNearbyBootstrap");
    public final tda b;
    public final Handler c;
    public abst d;
    public acau e;
    public Device f;
    public final abqn g = new abqn(this);
    private final acdw h;
    private final tdb i = new abqm(this);
    private final abql j = new abql(this);

    public abqo(Context context, Handler handler) {
        abnb.e();
        tda a2 = tcn.a(context);
        this.h = new acdw(context);
        this.c = handler;
        this.b = a2;
    }

    public final acwa a() {
        Device device;
        if (this.e == null || (device = this.f) == null) {
            iwd iwd = a;
            String valueOf = String.valueOf(this.e);
            String valueOf2 = String.valueOf(this.f);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54 + String.valueOf(valueOf2).length());
            sb.append("No connection in progress, callbacks: ");
            sb.append(valueOf);
            sb.append(", NearbyDevice: ");
            sb.append(valueOf2);
            iwd.b(sb.toString(), new Object[0]);
            return acws.a((Exception) new ibr(new Status(10567)));
        }
        acwa a2 = this.b.a(device);
        a2.a((acvp) new abqh(this));
        return a2;
    }

    public final acwa a(D2DDevice d2DDevice, acau acau, String str) {
        byte b2;
        this.e = acau;
        this.f = new Device(d2DDevice.c, "", d2DDevice.d, d2DDevice.e);
        if (str == null) {
            b2 = 1;
        } else {
            b2 = 2;
        }
        return a(str, b2, (tdb) new acbb(new abqi(this, this.i, (int) azlf.a.a().A(), str, b2), this.c));
    }

    public final acwa a(String str, byte b2, tdb tdb) {
        byte b3;
        tdu tdu;
        tdx tdx;
        Device device = this.f;
        if (device == null) {
            return acws.a((Exception) new ibr(Status.c));
        }
        tda tda = this.b;
        String str2 = Build.MODEL;
        if (!this.h.a()) {
            b3 = this.h.b() ? (byte) 2 : 0;
        } else {
            b3 = 1;
        }
        abql abql = this.j;
        tdr tdr = tdr.a;
        tdu tdu2 = (tdu) tdr.b.get(tdb);
        if (tdu2 == null) {
            tdu tdu3 = new tdu(tdb);
            tdr.b.put(tdb, tdu3);
            tdu = tdu3;
        } else {
            tdu = tdu2;
        }
        tds tds = tds.a;
        tdx tdx2 = (tdx) tds.b.get(abql);
        if (tdx2 == null) {
            tdx tdx3 = new tdx(abql);
            tds.b.put(abql, tdx3);
            tdx = tdx3;
        } else {
            tdx = tdx2;
        }
        tdu.a = new tes((tev) tda);
        iha b4 = ihb.b();
        b4.a = new tei(device, str2, "", b3, str, b2, tdu, tdx);
        return ((iby) tda).b(b4.a());
    }
}
