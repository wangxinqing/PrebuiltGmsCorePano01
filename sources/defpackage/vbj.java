package defpackage;

import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;

/* renamed from: vbj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vbj implements vbo {
    static final vbo a = new vbj();

    private vbj() {
    }

    public final Message a(Object obj, NearbyDevice nearbyDevice) {
        return new Message(((uzx) obj).c, "__reserved_namespace", "__ble_record", nearbyDevice);
    }
}
