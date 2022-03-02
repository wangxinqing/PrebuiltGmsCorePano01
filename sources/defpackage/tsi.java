package defpackage;

import com.google.android.gms.nearby.messages.devices.NearbyDevice;
import com.google.android.gms.nearby.messages.internal.Update;

/* renamed from: tsi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tsi extends arwm {
    final /* synthetic */ Update a;
    final /* synthetic */ tsj b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tsi(tsj tsj, String str, Update update) {
        super(str);
        this.b = tsj;
        this.a = update;
    }

    public final void run() {
        if (this.a.a(2)) {
            this.b.a.a.a(this.a.c);
            return;
        }
        Update update = this.a;
        NearbyDevice nearbyDevice = update.f;
        this.b.a.a.a(update.c, nearbyDevice != null ? nearbyDevice.d : null, update.e, update.g);
    }
}
