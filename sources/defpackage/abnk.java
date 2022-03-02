package defpackage;

import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: abnk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abnk implements Runnable {
    final /* synthetic */ abnl a;

    public abnk(abnl abnl) {
        this.a = abnl;
    }

    public final void run() {
        abnl abnl = this.a;
        D2DDevice d2DDevice = abnl.b;
        if (d2DDevice != null) {
            abnl.a.post(new abnj(this, d2DDevice));
        }
    }
}
