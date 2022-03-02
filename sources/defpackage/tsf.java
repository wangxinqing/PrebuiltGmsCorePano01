package defpackage;

import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;
import com.google.android.gms.nearby.messages.internal.BleSignalImpl;

/* renamed from: tsf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tsf extends arwm {
    final /* synthetic */ Message a;
    final /* synthetic */ NearbyDevice b;
    final /* synthetic */ tsj c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tsf(tsj tsj, String str, Message message, NearbyDevice nearbyDevice) {
        super(str);
        this.c = tsj;
        this.a = message;
        this.b = nearbyDevice;
    }

    public final void run() {
        this.c.a.a.a(this.a, this.b.d, (BleSignalImpl) null, (byte[]) null);
    }
}
