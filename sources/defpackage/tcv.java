package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.text.TextUtils;
import java.security.SecureRandom;
import java.util.Locale;

/* renamed from: tcv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tcv {
    public static String a(String str) {
        if (str == null) {
            return "";
        }
        if (str.indexOf("[") != 0) {
            return str;
        }
        int indexOf = str.indexOf("]");
        if (indexOf < 0) {
            return str.substring(1);
        }
        return str.substring(1, indexOf);
    }

    public static String b(String str) {
        if (str != null) {
            int indexOf = str.indexOf("]");
            int i = indexOf + 2;
            if (indexOf >= 0 && i < str.length()) {
                return str.substring(i);
            }
        }
        return "";
    }

    public static byte c(String str) {
        byte charAt;
        if (str != null) {
            int indexOf = str.indexOf("]");
            int i = indexOf + 1;
            if (indexOf < 0 || i >= str.length() || (charAt = (byte) (str.charAt(i) - '0')) > 4 || charAt < 0) {
                return 0;
            }
            return charAt;
        }
        return 0;
    }

    static byte[] d(String str) {
        String upperCase = str.toUpperCase(Locale.US);
        if (!BluetoothAdapter.checkBluetoothAddress(upperCase)) {
            String valueOf = String.valueOf(upperCase);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Not a valid bluetooth mac: ") : "Not a valid bluetooth mac: ".concat(valueOf));
        }
        byte[] bArr = new byte[6];
        String[] split = upperCase.split(":");
        for (int i = 0; i < 6; i++) {
            String valueOf2 = String.valueOf(split[i]);
            bArr[i] = Integer.decode(valueOf2.length() == 0 ? new String("0x") : "0x".concat(valueOf2)).byteValue();
        }
        return bArr;
    }

    public static boolean e(String str) {
        return str != null && str.length() == 4 && TextUtils.isDigitsOnly(str);
    }

    static String a(SecureRandom secureRandom) {
        while (true) {
            int nextInt = secureRandom.nextInt(10000);
            String format = String.format(Locale.US, "%04d", new Object[]{Integer.valueOf(nextInt)});
            if (e(format) && !format.equals(aymf.b())) {
                return format;
            }
        }
    }

    static String a(byte[] bArr) {
        int length = bArr.length;
        if (length == 6) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (true) {
                int length2 = bArr.length;
                if (i >= length2) {
                    return sb.toString();
                }
                sb.append(String.format(Locale.US, "%02X", new Object[]{Integer.valueOf(bArr[i] & 255)}));
                if (i < length2 - 1) {
                    sb.append(":");
                }
                i++;
            }
        } else {
            StringBuilder sb2 = new StringBuilder(48);
            sb2.append("Bluetooth macs are 6 bytes long, not ");
            sb2.append(length);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
