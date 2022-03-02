package defpackage;

import android.os.Parcel;
import com.google.android.gms.nearby.bootstrap.Device;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: teg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class teg extends bhw implements teh {
    private final abqn a;

    public teg() {
        super("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
    }

    public final void a(Device device) {
        abqn abqn = this.a;
        iwd iwd = abqo.a;
        String str = device.b;
        String str2 = device.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length());
        sb.append("Found Nearby Bootstrap device: ");
        sb.append(str);
        sb.append(" (");
        sb.append(str2);
        sb.append(")");
        iwd.a(sb.toString(), new Object[0]);
        D2DDevice d2DDevice = new D2DDevice(1, device.b, device.d, device.e, 0);
        amrl.a((Object) abqn.a.d, (Object) "ScanController is null.");
        abqn.a.d.a(d2DDevice);
    }

    public final void b() {
        abqn abqn = this.a;
        abqo.a.a("Nearby.Bootstrap scan stopped.", new Object[0]);
        abst abst = abqn.a.d;
        if (abst != null) {
            abst.a();
            abqn.a.d = null;
        }
    }

    public teg(abqn abqn) {
        super("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
        this.a = abqn;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((Device) bhx.a(parcel, Device.CREATOR));
        } else if (i == 2) {
            b();
        } else if (i != 3) {
            return false;
        } else {
            int readInt = parcel.readInt();
            abqn abqn = this.a;
            iwd iwd = abqo.a;
            String valueOf = String.valueOf(tdg.g(readInt));
            iwd.e(valueOf.length() == 0 ? new String("Nearby.Bootstrap error: ") : "Nearby.Bootstrap error: ".concat(valueOf), new Object[0]);
            amrl.a((Object) abqn.a.d, (Object) "ScanController is null.");
            abqn.a.d.a(10557);
            abqo abqo = abqn.a;
            abqo.a.a("resetScanController()", new Object[0]);
            abqo.d = null;
        }
        return true;
    }
}
