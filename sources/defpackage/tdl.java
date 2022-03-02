package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.nearby.bootstrap.Device;

/* renamed from: tdl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class tdl extends tdk {
    public static final anil a = anil.a("NearbyBootstrap");
    public String s = null;

    public tdl(ased ased, arwa arwa, String str, String str2, byte b, tdv tdv, tdy tdy, tde tde) {
        super(ased, arwa, str, str2, b, tdv, tdy, tde);
    }

    private final void a() {
        if (this.o.c()) {
            try {
                if (a((IInterface) this.p)) {
                    this.p.c();
                }
            } catch (RemoteException e) {
                ((anih) ((anih) a.c()).a("tdl", "a", 144, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("TargetDevice: fail to call ConnectionListener.onTokenNeeded");
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract asfj a(String str, String str2);

    public final void b(String str) {
        b(this.s, str);
    }

    public final void d() {
        a();
        this.o.b();
    }

    public final void e() {
        m();
        a();
        this.o.b();
    }

    public final boolean b(String str, String str2) {
        this.o.a();
        if (this.g) {
            ((anih) ((anih) a.c()).a("tdl", "b", 58, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("TargetDevice: Source device is receiving");
            return false;
        }
        this.s = str;
        a(a(str, str2));
        return true;
    }

    public final void a(Device device, String str) {
        super.j();
        this.k = device;
        this.s = str;
    }

    public final boolean a(Device device) {
        Device device2 = this.k;
        return device2 != null && device2.d.equals(device.d) && device != null && n();
    }
}
