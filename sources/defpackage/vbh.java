package defpackage;

import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;

/* renamed from: vbh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vbh implements vbo {
    static final vbo a = new vbh();

    private vbh() {
    }

    public final Message a(Object obj, NearbyDevice nearbyDevice) {
        auzf auzf = (auzf) obj;
        int a2 = avaw.a(auzf.b);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 1;
        if (i == 1) {
            return new Message(new uwz(auzf.c.k()).a.a, "__reserved_namespace", "__i_beacon_id", nearbyDevice);
        }
        if (i != 2) {
            return null;
        }
        return new Message(new uwx(auzf.c.k()).a.a, "__reserved_namespace", "__eddystone_uid", nearbyDevice);
    }
}
