package defpackage;

import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;
import com.google.android.gms.nearby.messages.internal.BleSignalImpl;
import com.google.android.gms.nearby.messages.internal.DistanceImpl;
import com.google.android.gms.nearby.messages.internal.Update;

/* renamed from: vdx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vdx {
    public int a;
    public Message b;
    public DistanceImpl c;
    public BleSignalImpl d;
    public NearbyDevice e;
    public byte[] f;

    public vdx() {
    }

    private final void a(int i) {
        this.a = i | this.a;
    }

    public final boolean b() {
        return this.a == 0;
    }

    public final void c() {
        a(1);
    }

    public final void d() {
        a(2);
    }

    public vdx(Update update) {
        this.a = update.b;
        this.b = update.c;
        this.c = update.d;
        this.d = update.e;
        this.e = update.f;
        this.f = update.g;
    }

    public final Update a() {
        return new Update(1, this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public final void a(NearbyDevice nearbyDevice) {
        a(16);
        this.e = nearbyDevice;
    }

    public final void a(BleSignalImpl bleSignalImpl) {
        a(8);
        this.d = bleSignalImpl;
    }

    public final void a(DistanceImpl distanceImpl) {
        a(4);
        this.c = distanceImpl;
    }

    public final void a(uzx uzx) {
        if (uzx != null) {
            a(uzx.c);
        }
    }

    public final void a(byte[] bArr) {
        a(32);
        this.f = bArr;
    }
}
