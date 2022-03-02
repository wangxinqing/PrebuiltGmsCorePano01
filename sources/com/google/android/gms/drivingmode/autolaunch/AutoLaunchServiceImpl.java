package com.google.android.gms.drivingmode.autolaunch;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AutoLaunchServiceImpl extends Service {
    public lty a;

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        lty lty = new lty(this);
        this.a = lty;
        lty.g = new lxk(this);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null && awqd.d()) {
            lty lty = this.a;
            String action = intent.getAction();
            if ("com.google.android.gms.carsetup.drivingmode.ACTIVITY_TRANSITION_START".equals(action) || "com.google.android.gms.carsetup.drivingmode.ACTIVITY_TRANSITION_END".equals(action) || "com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_ACCEPT".equals(action) || "com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_TIMEOUT".equals(action) || "com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_CANCEL".equals(action)) {
                String valueOf = String.valueOf(intent);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                sb.append("DrivingModeAutoLaunch received intent: ");
                sb.append(valueOf);
                Log.i("CAR.DRIVINGMODE", sb.toString());
                lty.e = true;
                lty.d.a((lut) new ltw(lty, action));
                lty.d.k();
            } else {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (bluetoothDevice == null) {
                    String valueOf2 = String.valueOf(intent);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 11);
                    sb2.append("No device: ");
                    sb2.append(valueOf2);
                    Log.i("CAR.DRIVINGMODE", sb2.toString());
                } else {
                    boolean booleanExtra = intent.getBooleanExtra("car_startup.HAS_WIFI", true);
                    if ((!awqy.a.a().d() || bluetoothDevice.getBondState() != 10) && ("android.bluetooth.device.action.ACL_CONNECTED".equals(action) || "android.bluetooth.device.action.ACL_DISCONNECTED".equals(action))) {
                        lty.e = true;
                        lty.d.a((lut) new ltx(lty, action, bluetoothDevice, booleanExtra));
                        lty.d.k();
                    }
                }
            }
            return 1;
        }
        return 2;
    }
}
