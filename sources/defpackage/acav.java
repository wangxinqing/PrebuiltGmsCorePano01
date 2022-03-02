package defpackage;

import com.google.android.gms.nearby.bootstrap.Device;

/* renamed from: acav  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acav implements Runnable {
    final /* synthetic */ Device a;
    final /* synthetic */ byte[] b;
    final /* synthetic */ acbb c;

    public acav(acbb acbb, Device device, byte[] bArr) {
        this.c = acbb;
        this.a = device;
        this.b = bArr;
    }

    public final void run() {
        this.c.e.a(this.a, this.b);
    }
}
