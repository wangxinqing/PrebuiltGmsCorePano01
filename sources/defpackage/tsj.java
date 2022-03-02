package defpackage;

import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;
import com.google.android.gms.nearby.messages.internal.BleSignalImpl;
import com.google.android.gms.nearby.messages.internal.Update;

/* renamed from: tsj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tsj extends uxh {
    final /* synthetic */ tsm a;

    public tsj(tsm tsm) {
        this.a = tsm;
    }

    public final void a(Message message) {
        if (!aymq.l()) {
            this.a.b.c(new tse(this, "handleMessagesCallback", message));
        }
    }

    public final void b(Message message) {
        if (!aymq.l()) {
            this.a.b.c(new tsh(this, "handleMessagesCallback", message));
        }
    }

    public final void a(Message message, NearbyDevice nearbyDevice) {
        if (!aymq.l()) {
            this.a.b.c(new tsf(this, "handleMessagesCallback", message, nearbyDevice));
        }
    }

    public final void a(Message message, BleSignalImpl bleSignalImpl) {
        if (!aymq.l()) {
            this.a.b.c(new tsg(this, "handleMessagesCallback", message, bleSignalImpl));
        }
    }

    public final void a(Update update) {
        if (aymq.l()) {
            this.a.b.c(new tsi(this, "handleMessagesCallback", update));
        }
    }
}
