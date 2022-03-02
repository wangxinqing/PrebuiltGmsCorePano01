package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: tya  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tya {
    public final Context a;
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    public txz d;

    public static String a(int i, int i2) {
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("-");
        sb.append(i2);
        return sb.toString();
    }

    public tya(Context context) {
        this.a = context;
    }

    public final void a(BluetoothDevice bluetoothDevice, int i, int i2, int i3) {
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        Integer valueOf3 = Integer.valueOf(i3);
        ((anih) tsp.a.d()).a("FindDevice: Updating RFcomm response for %s: group %s, code %s, ackCode %s", bluetoothDevice, valueOf, valueOf2, valueOf3);
        if (bluetoothDevice != null) {
            String address = bluetoothDevice.getAddress();
            Map map = (Map) this.c.get(address);
            if (map == null) {
                map = new HashMap();
                this.c.put(address, map);
                ((anih) tsp.a.d()).a("FindDevice: Inserted new device response map for %s", (Object) address);
            }
            map.put(a(i, i2), valueOf3);
            ((anih) tsp.a.d()).a("FindDevice: Inserted event code and ack code for device %s: eventGroup %s,eventCode %s", (Object) address, (Object) valueOf, (Object) valueOf2);
        }
    }

    public final void a(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        tyb tyb = (tyb) this.b.get(bluetoothDevice);
        String a2 = anml.g.a(bArr);
        if (tyb != null) {
            ((anih) tsp.a.d()).a("EventStreamManager: Sending %s to device (%s) on code %s", (Object) a2, (Object) bluetoothDevice, (Object) Integer.valueOf(i));
            tyb.a(3, i, bArr);
            return;
        }
        ((anih) tsp.a.d()).a("EventStreamManager: Failed to send %s to device (%s) on code %s", (Object) a2, (Object) bluetoothDevice, (Object) Integer.valueOf(i));
    }

    public final boolean a(BluetoothDevice bluetoothDevice) {
        tyb tyb = (tyb) this.b.get(bluetoothDevice);
        if (tyb == null) {
            jjg jjg = tsp.a;
            return false;
        } else if (!tyb.b()) {
            jjg jjg2 = tsp.a;
            this.b.remove(bluetoothDevice);
            return false;
        } else {
            jjg jjg3 = tsp.a;
            return true;
        }
    }
}
