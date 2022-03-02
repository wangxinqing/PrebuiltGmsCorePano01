package defpackage;

import android.text.TextUtils;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: acla  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acla implements abst {
    final /* synthetic */ aclm a;
    private boolean b = false;

    public acla(aclm aclm) {
        this.a = aclm;
    }

    public final void a() {
        if (!this.b) {
            iwd iwd = aclm.a;
            D2DDevice d2DDevice = this.a.d;
            iwd.d(String.format("Scan timed out while searching for device: %s, %s", new Object[]{d2DDevice.d, d2DDevice.c}), new Object[0]);
            this.a.b.c(6);
        }
    }

    public final void b(D2DDevice d2DDevice) {
    }

    public final void a(int i) {
        iwd iwd = aclm.a;
        String valueOf = String.valueOf(abpp.g(i));
        iwd.e(valueOf.length() == 0 ? new String("Error: ") : "Error: ".concat(valueOf), new Object[0]);
        this.a.b.c(5);
    }

    public final void a(D2DDevice d2DDevice) {
        aclm.a.a(String.format("Found device: %s, %s", new Object[]{d2DDevice.d, d2DDevice.c}), new Object[0]);
        if (!TextUtils.isEmpty(d2DDevice.d) && ampw.a(d2DDevice.d, this.a.d.d) && !this.b) {
            this.a.c.p();
            this.a.a();
            this.b = true;
        }
    }
}
