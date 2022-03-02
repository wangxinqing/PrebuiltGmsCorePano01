package defpackage;

import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: abnj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abnj implements Runnable {
    final /* synthetic */ D2DDevice a;
    final /* synthetic */ abnk b;

    public abnj(abnk abnk, D2DDevice d2DDevice) {
        this.b = abnk;
        this.a = d2DDevice;
    }

    public final void run() {
        aclv aclv = this.b.a.c;
        D2DDevice d2DDevice = this.a;
        acly.a.b("Auto connecting to %s", d2DDevice.c);
        acly acly = aclv.a;
        aclw aclw = acly.b;
        if (aclw != null) {
            acly.i = true;
            acly.j = false;
            aclw.a(d2DDevice, 1, true);
            return;
        }
        acly.a.d("Listener not attached", new Object[0]);
    }
}
