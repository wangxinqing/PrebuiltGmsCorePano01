package defpackage;

import com.google.android.gms.location.internal.DeviceOrientationRequestInternal;

/* renamed from: aihy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aihy implements Runnable {
    private final aiib a;
    private final int b;
    private final String c;
    private final DeviceOrientationRequestInternal d;
    private final aiib e;
    private final rdz f;

    public aihy(aiib aiib, int i, String str, DeviceOrientationRequestInternal deviceOrientationRequestInternal, aiib aiib2, rdz rdz) {
        this.a = aiib;
        this.b = i;
        this.c = str;
        this.d = deviceOrientationRequestInternal;
        this.e = aiib2;
        this.f = rdz;
    }

    public final void run() {
        aiib aiib = this.a;
        int i = this.b;
        String str = this.c;
        DeviceOrientationRequestInternal deviceOrientationRequestInternal = this.d;
        aiib aiib2 = this.e;
        rdz rdz = this.f;
        aihv aihv = new aihv(i, str, deviceOrientationRequestInternal, aiib2, rdz);
        aiib.c.a((Object) rdz.asBinder(), (jio) aihv);
    }
}
