package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Build;

/* renamed from: arww  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arww {
    public static int a(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return -1;
        }
        try {
            return ((Integer) aeic.a(BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str)).a("getBatteryLevel", new Class[0]).b(new Object[0])).intValue();
        } catch (aeid e) {
            ((anih) ((anih) aryq.a.d()).a("arww", "a", 68, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: Failed to get battery level from device.");
            return -1;
        }
    }

    public static String b(String str) {
        BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str);
        try {
            return (String) aeic.a(remoteDevice).a("getAliasName", new Class[0]).b(new Object[0]);
        } catch (aeid e) {
            ((anih) ((anih) aryq.a.d()).a("arww", "b", 83, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: Failed to get alias name from device");
            return remoteDevice.getName();
        }
    }

    public static String c(String str) {
        try {
            return (String) aeic.a(BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str)).a("getAlias", new Class[0]).b(new Object[0]);
        } catch (aeid e) {
            anih anih = (anih) aryq.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("arww", "c", 116, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: Failed to get alias from device");
            return null;
        }
    }

    public static String a(BluetoothDevice bluetoothDevice, int i) {
        try {
            byte[] metadata = bluetoothDevice.getMetadata(i);
            if (metadata != null) {
                return new String(metadata);
            }
            return null;
        } catch (NoSuchMethodError e) {
            return null;
        }
    }

    public static void a(BluetoothDevice bluetoothDevice, int i, String str) {
        try {
            aeib a = aeic.a(bluetoothDevice).a("setMetadata", Integer.TYPE, byte[].class);
            Integer valueOf = Integer.valueOf(i);
            a.a(valueOf, str.getBytes());
            ((anih) ((anih) aryq.a.d()).a("arww", "a", 131, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: setMetadata to %s, %d: %s", (Object) bluetoothDevice.getAddress(), (Object) valueOf, (Object) str);
        } catch (aeid e) {
            ((anih) ((anih) aryq.a.d()).a("arww", "a", 133, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: Failed to setMetadata with byte[] value, key:%d", i);
        }
    }

    public static void a(String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str);
            aryq aryq = aryq.a;
            remoteDevice.getName();
            try {
                aeic.a(remoteDevice).a("setAlias", String.class).a(str2);
            } catch (aeid e) {
                ((anih) ((anih) aryq.a.d()).a("arww", "a", 101, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: Failed to set alias.");
            }
        }
    }

    public static boolean a(BluetoothDevice bluetoothDevice) {
        try {
            byte[] metadata = bluetoothDevice.getMetadata(6);
            if (metadata != null) {
                return Boolean.parseBoolean(new String(metadata));
            }
            return false;
        } catch (NoSuchMethodError e) {
            return false;
        }
    }
}
