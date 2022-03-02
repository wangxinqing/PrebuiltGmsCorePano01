package defpackage;

import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.bootstrap.Device;

/* renamed from: tdf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tdf {
    public static final anil a = anil.a("NearbyBootstrap");
    public tdn b = null;
    public tdh c = null;
    public tdl d = null;
    public byte e;
    public final Context f;
    public final ased g;
    public final BluetoothAdapter h = BluetoothAdapter.getDefaultAdapter();
    public final Handler i;
    public final arwa j = new arwa(this.f);

    public tdf(Context context, ased ased, Handler handler) {
        iva.a((Object) context);
        this.f = context;
        iva.a((Object) ased);
        this.g = ased;
        iva.a((Object) handler);
        this.i = handler;
    }

    public final void a(Device device, String str, String str2, byte b2, byte b3, tdv tdv, tdy tdy, long j2, String str3, byte b4, teb teb) {
        tdl tdl;
        Device device2 = device;
        String str4 = str3;
        byte b5 = b4;
        teb teb2 = teb;
        if (b()) {
            a(teb2, 2982);
            return;
        }
        if (c()) {
            if (this.d.a(device2)) {
                a(teb2, -1);
                return;
            }
            this.d.m();
        }
        String str5 = device2.d;
        if (str5 == null) {
            ((anih) ((anih) a.c()).a("tdf", "a", 229, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("NearbyBootstrapController: Cannot connect to a remote device that does not exist");
            a(teb2, 2980);
            return;
        }
        if (a()) {
            this.c.a();
        }
        ased ased = this.g;
        arwa arwa = this.j;
        tde tde = new tde(this, j2);
        if (b3 == 2) {
            tdl = new tcr(ased, arwa, str, str2, b2, tdv, tdy, tde);
        } else {
            tdl = new tcw(ased, arwa, str, str2, b2, tdv, tdy, tde);
        }
        this.d = tdl;
        tdl.a(device2, str5);
        this.e = b5;
        if (b5 == 1) {
            this.j.a(8, (tdk) this.d);
            tdl tdl2 = this.d;
            tdl2.b(tdl2.s, (String) null);
        } else if (b5 != 2) {
            a(teb2, 13);
            return;
        } else if (str4 == null) {
            this.j.a(7, (tdk) this.d);
            this.d.b(aymf.b());
        } else if (!tcv.e(str3)) {
            a(teb2, 2989);
            return;
        } else {
            this.j.a(9, (tdk) this.d);
            this.d.b(str4);
        }
        b(teb2);
    }

    public final void b(teb teb) {
        a(teb, 0);
    }

    public final boolean b() {
        tdn tdn = this.b;
        return tdn != null && tdn.j;
    }

    public final boolean c() {
        tdl tdl = this.d;
        return tdl != null && tdl.j;
    }

    public final tdk d() {
        tdl tdl = this.d;
        if (tdl != null) {
            return tdl;
        }
        tdn tdn = this.b;
        if (tdn != null) {
            return tdn;
        }
        return null;
    }

    public final void a(teb teb) {
        if (!b()) {
            a(teb, -1);
            return;
        }
        this.j.a(3, (tdk) this.b);
        this.b.k();
        this.b = null;
        b(teb);
    }

    public final void a(teb teb, int i2) {
        if (teb != null) {
            try {
                teb.a(new Status(i2, (String) null, (PendingIntent) null));
            } catch (RemoteException e2) {
                anih anih = (anih) a.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("tdf", "a", 533, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to send callback status");
            }
        }
    }

    public final boolean a() {
        tdh tdh = this.c;
        return tdh != null && tdh.c();
    }
}
