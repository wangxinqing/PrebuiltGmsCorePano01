package defpackage;

import com.google.android.gms.nearby.bootstrap.Device;

/* renamed from: tct  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tct extends tdn {
    public static final anil a = anil.a("NearbyBootstrap");
    private asfz v = null;

    public tct(ased ased, arwa arwa, String str, String str2, byte b, tdv tdv, tdy tdy, tde tde) {
        super(ased, arwa, str, str2, b, tdv, tdy, tde);
    }

    /* access modifiers changed from: protected */
    public final Device a(asem asem) {
        if ((asem.a & 2) == 0) {
            return null;
        }
        asfs asfs = asem.c;
        if (asfs == null) {
            asfs = asfs.f;
        }
        int a2 = asfy.a(asfs.b);
        if (a2 == 0 || a2 != 3) {
            return null;
        }
        asfs asfs2 = asem.c;
        if (asfs2 == null) {
            asfs2 = asfs.f;
        }
        if ((asfs2.a & 16) == 0) {
            return null;
        }
        asfs asfs3 = asem.c;
        if (asfs3 == null) {
            asfs3 = asfs.f;
        }
        asfw asfw = asfs3.c;
        if (asfw == null) {
            asfw = asfw.c;
        }
        String str = asfw.b;
        asfs asfs4 = asem.c;
        if (asfs4 == null) {
            asfs4 = asfs.f;
        }
        asft asft = asfs4.e;
        if (asft == null) {
            asft = asft.c;
        }
        return new Device(tcv.a(asft.b.k()), "", str, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final asel b() {
        aucd o = asel.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asel asel = (asel) o.b;
        asel.b = 2;
        asel.a |= 1;
        return (asel) o.i();
    }

    /* access modifiers changed from: protected */
    public final void c() {
        asfz asfz = this.v;
        if (asfz != null) {
            this.c.a(asfz.b);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        byte[] a2 = tcq.a(this.l, this.m, this.n);
        aucf aucf = (aucf) asep.f.o();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        asep asep = (asep) aucf.b;
        asep.b = 3;
        asep.a |= 1;
        aucd o = asfp.c.o();
        auay a3 = auay.a(a2);
        if (o.c) {
            o.c();
            o.c = false;
        }
        asfp asfp = (asfp) o.b;
        a3.getClass();
        asfp.a |= 1;
        asfp.b = a3;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        asep asep2 = (asep) aucf.b;
        asfp asfp2 = (asfp) o.i();
        asfp2.getClass();
        asep2.c = asfp2;
        asep2.a |= 2;
        aucd o2 = asew.d.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asew asew = (asew) o2.b;
        asew.a |= 1;
        asew.b = true;
        aseu aseu = aseu.BLE_ADVERTISE_MANUFACTURER_DATA;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asew asew2 = (asew) o2.b;
        asew2.c = aseu.e;
        asew2.a |= 2;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        asep asep3 = (asep) aucf.b;
        asew asew3 = (asew) o2.i();
        asew3.getClass();
        asep3.e = asew3;
        asep3.a |= 8;
        asep asep4 = (asep) aucf.i();
        if (!this.c.a(asep4)) {
            ((anih) ((anih) a.c()).a("tct", "a", 56, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleTargetDevice:  this device is not able to do BLE advertising");
            return false;
        }
        this.v = this.c.a(asep4, (asgs) new tcs());
        return true;
    }
}
