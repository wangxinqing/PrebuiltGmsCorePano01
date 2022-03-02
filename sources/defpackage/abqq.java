package defpackage;

import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: abqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abqq extends tiz {
    final /* synthetic */ abqw a;

    public abqq(abqw abqw) {
        this.a = abqw;
    }

    public final void a(String str) {
        iwd iwd = abqw.b;
        String valueOf = String.valueOf(str);
        iwd.e(valueOf.length() == 0 ? new String("Nearby.Connections error: lost endpoint with ID ") : "Nearby.Connections error: lost endpoint with ID ".concat(valueOf), new Object[0]);
        abqw abqw = this.a;
        abst abst = abqw.f;
        D2DDevice d2DDevice = (D2DDevice) abqw.j.remove(str);
        if (abst != null && d2DDevice != null) {
            abst.b(d2DDevice);
        }
    }

    public final void a(String str, tiv tiv) {
        byte b;
        abqw.b.b("Found endpoint: %s", str);
        acbs a2 = acbr.a(tiv.a);
        acbp b2 = a2.b();
        int d = b2.d();
        if (azky.a.a().d()) {
            int i = d - 1;
            if (d != 0) {
                switch (i) {
                    case 2:
                        b = 3;
                        break;
                    case 3:
                        b = 5;
                        break;
                    case 4:
                        b = 4;
                        break;
                    case 5:
                        break;
                    case 6:
                        b = 2;
                        break;
                    case 7:
                        b = 6;
                        break;
                    default:
                        b = 0;
                        break;
                }
            } else {
                throw null;
            }
        }
        b = 1;
        abqw.b.a("Device name: %s", a2.a());
        abqw.b.a("Verification style: %s", b2.a());
        D2DDevice d2DDevice = new D2DDevice(2, a2.a(), str, b, b2.a().g);
        this.a.j.put(str, d2DDevice);
        amrl.a((Object) this.a.f, (Object) "ScanController is null.");
        this.a.f.a(d2DDevice);
    }
}
