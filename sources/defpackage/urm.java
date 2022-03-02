package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import java.util.UUID;

/* renamed from: urm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class urm {
    public static final UUID a = UUID.fromString("0000FEF3-0000-1000-8000-00805F9B34FB");
    public static final UUID b = UUID.fromString("0000FE2C-0000-1000-8000-00805F9B34FB");
    static final UUID c = UUID.fromString("00000100-0004-1000-8000-001A11000101");
    static final UUID d;
    static final UUID e;
    static final UUID f = c;

    static {
        UUID fromString = UUID.fromString("00000100-0004-1000-8000-001A11000102");
        d = fromString;
        e = fromString;
    }

    public static int a(byte[] bArr) {
        if (bArr.length != 2) {
            return 0;
        }
        return aoom.a(bArr);
    }

    public static byte[] b(int i) {
        if (i == -1) {
            i = 0;
        }
        short s = (short) i;
        return new byte[]{(byte) (s >> 8), (byte) s};
    }

    static BluetoothDevice a(String str) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            ((anih) ((anih) ulh.a.c()).a("urm", "a", 77, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to retrieve BluetoothAdapter.");
            return null;
        }
        try {
            return defaultAdapter.getRemoteDevice(str);
        } catch (IllegalArgumentException e2) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("urm", "a", 85, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s not recognized as a valid Bluetooth MAC address.", (Object) str);
            return null;
        }
    }

    public static UUID a(int i) {
        return new UUID(12288, ((long) i) | Long.MIN_VALUE);
    }
}
