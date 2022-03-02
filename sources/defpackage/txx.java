package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.google.android.gms.nearby.discovery.fastpair.battery.BatteryAdvertisement;
import java.util.regex.Pattern;

/* renamed from: txx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class txx implements txy {
    private static final Pattern a = Pattern.compile("^([0-9A-F]){6}$");
    private txb b;
    private tya c;

    public final void a(Context context, BluetoothDevice bluetoothDevice) {
    }

    public final void a(Context context, BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        String str;
        String str2 = "na";
        if (i == 1) {
            anih anih = (anih) tsp.a.d();
            if (bArr != null) {
                str2 = anml.g.a(bArr);
            }
            anih.a("DeviceInfoGroupListener: The device send model id to seeker: %s, %s", (Object) bluetoothDevice, (Object) str2);
            if (bArr != null) {
                String a2 = anml.g.a(bArr);
                if (a.matcher(a2).matches()) {
                    tws tws = (tws) thl.a(context, tws.class);
                    tws.c.execute(new twl(tws, bluetoothDevice, a2));
                    return;
                }
                ((anih) tsp.a.d()).a("DeviceInfoGroupListener: invalid model id length (%s, %s)", (Object) a2, a2.length());
            }
        } else if (i == 2) {
            anih anih2 = (anih) tsp.a.d();
            if (bArr != null) {
                str2 = anml.g.a(bArr);
            }
            anih2.a("DeviceInfoGroupListener: The device send ble address to seeker: %s, %s", (Object) bluetoothDevice, (Object) str2);
            if (bArr != null) {
                String a3 = aeez.a(bArr);
                if (BluetoothAdapter.checkBluetoothAddress(a3)) {
                    tws tws2 = (tws) thl.a(context, tws.class);
                    tws2.c.execute(new twk(tws2, bluetoothDevice, a3));
                    return;
                }
                ((anih) tsp.a.d()).a("DeviceInfoGroupListener: invalid address (%s)", (Object) a3);
            }
        } else if (i == 3) {
            boolean F = aymw.F();
            anih anih3 = (anih) tsp.a.d();
            if (!F) {
                str = "";
            } else {
                str = "handle";
            }
            if (bArr != null) {
                str2 = anml.g.a(bArr);
            }
            anih3.a("DeviceInfoGroupListener: The device pass battery info to seeker: %s, %s battery=%s", (Object) bluetoothDevice, (Object) str, (Object) str2);
            if (F) {
                if (this.b == null) {
                    this.b = (txb) thl.a(context, txb.class);
                }
                if (bArr != null && bArr.length != 0) {
                    tzi a4 = ((ttf) thl.a(context, ttf.class)).a(bluetoothDevice.getAddress());
                    if (a4 == null) {
                        BatteryAdvertisement.a(bluetoothDevice.getAddress(), (byte[]) null, bArr);
                        return;
                    }
                    txb txb = this.b;
                    BatteryAdvertisement batteryAdvertisement = new BatteryAdvertisement();
                    batteryAdvertisement.f = a4.c;
                    batteryAdvertisement.a = bluetoothDevice.getAddress();
                    batteryAdvertisement.a(bArr);
                    batteryAdvertisement.c = true;
                    uaj uaj = a4.n;
                    if (uaj == null) {
                        uaj = uaj.K;
                    }
                    batteryAdvertisement.a(uaj);
                    batteryAdvertisement.s = 2;
                    txb.b(batteryAdvertisement);
                }
            }
        } else if (i == 6) {
            ((anih) tsp.a.d()).a("DeviceInfoGroupListener: check which component is available, event code = %d", i);
            if (this.c == null) {
                this.c = (tya) thl.a(context, tya.class);
            }
            if (bArr != null && bArr.length != 0) {
                ((anih) tsp.a.d()).a("DeviceInfoGroupListener: check active component response %s", bArr[0]);
                this.c.a(bluetoothDevice, 3, 6, bArr[0]);
            }
        }
    }
}
