package defpackage;

import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;

/* renamed from: vbi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vbi implements vbo {
    static final vbo a = new vbi();

    private vbi() {
    }

    public final Message a(Object obj, NearbyDevice nearbyDevice) {
        return new Message(new uwy((String) obj).a.toString().getBytes(), "__reserved_namespace", "__eddystone_url", nearbyDevice);
    }
}
