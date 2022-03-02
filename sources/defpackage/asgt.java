package defpackage;

import android.bluetooth.BluetoothAdapter;

/* renamed from: asgt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asgt {
    public static String a(byte[] bArr) {
        int length = bArr.length;
        if (length == 6) {
            return jjp.b(bArr);
        }
        StringBuilder sb = new StringBuilder(48);
        sb.append("Bluetooth macs are 6 bytes long, not ");
        sb.append(length);
        throw new IllegalArgumentException(sb.toString());
    }

    public static byte[] a(String str) {
        if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Not a valid bluetooth mac hex string: ") : "Not a valid bluetooth mac hex string: ".concat(valueOf));
        }
        byte[] bArr = new byte[6];
        String[] split = str.split(":");
        for (int i = 0; i < 6; i++) {
            String valueOf2 = String.valueOf(split[i]);
            bArr[i] = Integer.decode(valueOf2.length() == 0 ? new String("0x") : "0x".concat(valueOf2)).byteValue();
        }
        return bArr;
    }
}
