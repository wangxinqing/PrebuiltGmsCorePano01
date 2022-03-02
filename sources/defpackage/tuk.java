package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.libraries.bluetooth.BluetoothException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: tuk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tuk {
    public static asqm a(Context context, String str) {
        asqo asqo;
        asqm asqm;
        if (str != null) {
            twd twd = (twd) thl.a(context, twd.class);
            try {
                long b = twd.b(str);
                try {
                    tsq tsq = twd.a;
                    ClientContext a = twd.a();
                    aucd o = asqn.b.o();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    ((asqn) o.b).a = b;
                    asqn asqn = (asqn) o.i();
                    if (tsq.c == null) {
                        tsq.c = baaj.a(baai.UNARY, "location.nearby.v1.NearbyDevicesService/GetFirmware", baoq.a(asqn.b), baoq.a(asqo.b));
                    }
                    asqo = (asqo) tsq.a.a(tsq.c, a, asqn, 10000, TimeUnit.MILLISECONDS);
                } catch (babk | eif e) {
                    anih anih = (anih) tsp.a.d();
                    anih.a(e);
                    anih.a("FastPair: Failed to get device firmware info.");
                    asqo = null;
                }
            } catch (twc e2) {
                anih anih2 = (anih) tsp.a.c();
                anih2.a((Throwable) e2);
                anih2.a("FastPair: Failed to parse model ID.");
                asqo = null;
            }
            if (asqo == null || (asqm = asqo.a) == null) {
                ((anih) tsp.a.d()).a("FastPair: device %s does not support firmware version check.", (Object) str);
                return null;
            }
            ((anih) tsp.a.d()).a("FastPair: get latest firmware from server version code: %s", (Object) asqm.b);
            return asqm;
        }
        ((anih) tsp.a.d()).a("FastPair: model id is null skip get firmware version.");
        return null;
    }

    public static String a(Context context, String str, ttu ttu) {
        Throwable e;
        String str2;
        BluetoothAdapter defaultAdapter;
        try {
            ttu.a(aspb.READ_FIRMWARE_VERSION);
            aehy a = tvt.a();
            a.h(aymw.h());
            str2 = new aeha(context, str, a.a(), new tue(ttu)).d();
            try {
                ((anih) tsp.a.d()).a("FastPair: Device firmware firmware version number %s", (Object) str2);
                ttu.b();
                if (aymw.ac() && jkr.h() && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null && str2 != null) {
                    arww.a(defaultAdapter.getRemoteDevice(str), 2, str2);
                }
                return str2;
            } catch (BluetoothException | InterruptedException | ExecutionException | TimeoutException e2) {
                e = e2;
                anih anih = (anih) tsp.a.b();
                anih.a(e);
                anih.a("FastPair: Unable to get the firmware version number from device");
                ttu.a(e);
                return str2;
            }
        } catch (BluetoothException | InterruptedException | ExecutionException | TimeoutException e3) {
            e = e3;
            str2 = null;
            anih anih2 = (anih) tsp.a.b();
            anih2.a(e);
            anih2.a("FastPair: Unable to get the firmware version number from device");
            ttu.a(e);
            return str2;
        }
    }
}
