package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: tws  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tws {
    public final Context a;
    public final jiq b;
    public final Executor c;
    public final Map d = new HashMap();
    private final ttf e;
    private final txr f;
    private final twd g;

    public tws(Context context) {
        aoru b2 = jfm.b(10);
        this.a = context;
        this.b = (jiq) thl.a(context, jiq.class);
        this.e = (ttf) thl.a(context, ttf.class);
        this.f = (txr) thl.a(context, txr.class);
        this.g = (twd) thl.a(context, twd.class);
        this.c = b2;
    }

    public final void a(BluetoothDevice bluetoothDevice) {
        this.c.execute(new twm(this, bluetoothDevice));
    }

    public final twr b(BluetoothDevice bluetoothDevice) {
        twr twr = (twr) this.d.get(bluetoothDevice);
        if (twr != null) {
            return twr;
        }
        twr twr2 = new twr();
        this.d.put(bluetoothDevice, twr2);
        return twr2;
    }

    public final void a(BluetoothDevice bluetoothDevice, Runnable runnable) {
        if (bluetoothDevice.getBondState() != 12) {
            ((anih) tsp.a.d()).a("RetroactivePairManager: Skip, device (%s) is not bonded", (Object) bluetoothDevice);
        } else if (this.e.a(bluetoothDevice.getAddress()) != null) {
            jjg jjg = tsp.a;
        } else {
            runnable.run();
            twr b2 = b(bluetoothDevice);
            long b3 = this.b.b();
            long j = b2.a;
            long j2 = j != -1 ? j - b3 : 0;
            String str = b2.b;
            String str2 = b2.c;
            ((tvg) thl.a(this.a, tvg.class)).a();
            if (!b2.e) {
                ((anih) tsp.a.d()).a("RetroactivePairManager: Skip, the ble address is not changed.");
            } else if (str == null || str2 == null) {
                jjg jjg2 = tsp.a;
            } else {
                ((anih) tsp.a.d()).a("RetroactivePairManager: device=%s, remainingTime=%s, bleAddress=%s, modelId=%s", bluetoothDevice, Long.valueOf(j2), str, str2);
                if (j2 > aymt.a.a().aM()) {
                    uaj a2 = tvq.a(this.e, this.f, this.g, str2);
                    if (a2 == null) {
                        ((anih) tsp.a.d()).a("RetroactivePairManager: Skip, no item for model id (%s)", (Object) str2);
                        return;
                    }
                    b2.d++;
                    b2.e = false;
                    ((anih) tsp.a.d()).a("RetroactivePairManager: Start retroactive pairing attempt#%d for device (%s, %s)", (Object) Integer.valueOf(b2.d), (Object) bluetoothDevice, (Object) str);
                    aucd aucd = (aucd) a2.c(5);
                    aucd.a((aucj) a2);
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    uaj uaj = (uaj) aucd.b;
                    str.getClass();
                    uaj.a |= 4;
                    uaj.e = str;
                    uaj uaj2 = (uaj) aucd.i();
                    Intent putExtra = DiscoveryChimeraService.a(this.a).setAction("com.google.android.gms.nearby.discovery:ACTION_MAGIC_PAIR").putExtra("com.google.android.gms.nearby.discovery.EXTRA_DISCOVERY_ITEM", uaj2.k()).putExtra("com.google.android.gms.nearby.discovery.EXTRA_RETROACTIVE_PAIR", true);
                    if ((uaj2.a & 8) != 0) {
                        putExtra.putExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP", tvq.a(uaj2));
                    }
                    this.a.startService(putExtra);
                    ((arwg) thl.a(this.a, arwg.class)).a(new twq(this, "RemoveRetroactiveDeviceCache", bluetoothDevice), j2);
                    return;
                }
                ((anih) tsp.a.d()).a("RetroactivePairManager: Skip, timeout for device (%s) is expired", (Object) bluetoothDevice);
            }
        }
    }
}
