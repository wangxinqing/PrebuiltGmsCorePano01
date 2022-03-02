package defpackage;

import com.google.android.gms.nearby.bootstrap.Device;
import java.util.HashMap;
import java.util.Map;

/* renamed from: tcp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tcp implements tdh {
    public static final anil a = anil.a("NearbyBootstrap");
    public teh b;
    public boolean c;
    final asgs d = new tco(this);
    public final arwa e;
    private final ased f;
    private asfz g;
    private final Map h;

    public tcp(ased ased, arwa arwa) {
        this.f = ased;
        this.h = new HashMap();
        this.c = false;
        this.e = arwa;
    }

    public final Device a(asgh asgh) {
        int a2;
        if (asgh.c.size() > 0 && (a2 = asgf.a(((asgd) asgh.c.get(0)).b)) != 0 && a2 == 5 && (((asgd) asgh.c.get(0)).a & 4) != 0) {
            asev asev = ((asgd) asgh.c.get(0)).d;
            if (asev == null) {
                asev = asev.h;
            }
            asfp asfp = asev.b;
            if (asfp == null) {
                asfp = asfp.c;
            }
            if ((asfp.a & 1) != 0) {
                asft asft = asev.c;
                if (asft == null) {
                    asft = asft.c;
                }
                if ((asft.a & 1) != 0) {
                    aseu a3 = aseu.a(asev.d);
                    if (a3 == null) {
                        a3 = aseu.BLE_ADVERTISE_DATA_TYPE_UNKNOWN;
                    }
                    if (a3 == aseu.BLE_ADVERTISE_MANUFACTURER_DATA) {
                        asft asft2 = asev.c;
                        if (asft2 == null) {
                            asft2 = asft.c;
                        }
                        String a4 = tcv.a(asft2.b.k());
                        this.h.put(a4, a4);
                        asfp asfp2 = asev.b;
                        if (asfp2 == null) {
                            asfp2 = asfp.c;
                        }
                        byte[] k = asfp2.b.k();
                        int length = k.length;
                        if (length <= 4) {
                            return null;
                        }
                        byte b2 = k[0];
                        if (((b2 & 224) >>> 5) != 1) {
                            return null;
                        }
                        byte b3 = b2 & 31;
                        if (b3 > 4) {
                            b3 = 0;
                        }
                        int i = length - 3;
                        byte[] bArr = new byte[i];
                        System.arraycopy(k, 3, bArr, 0, i);
                        return new Device(new String(bArr), Integer.toString(((k[1] & 255) * 256) + (k[2] & 255)), a4, (byte) b3);
                    }
                }
            }
            ((anih) ((anih) a.c()).a("tcp", "a", 94, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleScanner: scan status does not contain payload");
        }
        return null;
    }

    public final boolean b() {
        teh teh = this.b;
        return (teh == null || teh.asBinder() == null || !this.b.asBinder().isBinderAlive()) ? false : true;
    }

    public final boolean c() {
        return this.c;
    }

    public final synchronized void a() {
        if (this.c) {
            this.c = false;
            asfz asfz = this.g;
            if (asfz != null) {
                this.f.a(asfz.b);
            }
        }
    }

    public final synchronized void a(teh teh) {
        aucf aucf = (aucf) asgc.e.o();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        asgc asgc = (asgc) aucf.b;
        asgc.b = 4;
        asgc.a |= 1;
        aucd o = asfa.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asfa asfa = (asfa) o.b;
        asfa.b = 2;
        asfa.a |= 1;
        aseu aseu = aseu.BLE_ADVERTISE_MANUFACTURER_DATA;
        if (o.c) {
            o.c();
            o.c = false;
        }
        asfa asfa2 = (asfa) o.b;
        asfa2.c = aseu.e;
        asfa2.a |= 2;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        asgc asgc2 = (asgc) aucf.b;
        asfa asfa3 = (asfa) o.i();
        asfa3.getClass();
        asgc2.d = asfa3;
        asgc2.a |= 4;
        asgc asgc3 = (asgc) aucf.i();
        if (!this.f.a(asgc3)) {
            ((anih) ((anih) a.c()).a("tcp", "a", 122, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleScanner: this device is unable to do BLE scanning");
            return;
        }
        this.b = teh;
        this.c = true;
        this.g = this.f.a(asgc3, this.d);
    }
}
