package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: tnd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tnd {
    static final Charset a = Charset.forName("UTF-8");
    public final int b;
    public final String c;
    public final byte[] d;
    public final byte[] e;

    public tnd(int i, String str, byte[] bArr, byte[] bArr2) {
        this.b = i;
        this.c = str;
        this.d = bArr;
        this.e = bArr2;
    }

    public static String a(int i, String str, byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr2.length;
        if (length > 131) {
            ((anih) tky.a.c()).a("While serializing Advertisement, truncating Endpoint Info %s (%d bytes) down to %d bytes", (Object) tky.a(bArr2), (Object) Integer.valueOf(length), (Object) 131);
            bArr2 = Arrays.copyOf(bArr2, 131);
        }
        int length2 = bArr2.length;
        ByteBuffer allocate = ByteBuffer.allocate(147 - (131 - length2));
        allocate.put((byte) ((i & 31) | 32));
        if (i != 1 && i != 2 && i != 3) {
            ((anih) tky.a.d()).a("Cannot serialize BluetoothDeviceName: unsupported V1 PCP %d", i);
            bArr3 = null;
        } else if (str.length() != 4) {
            ((anih) tky.a.d()).a("Cannot serialize BluetoothDeviceName: V1 Endpoint ID %s (%d bytes) should be exactly %d bytes", (Object) str, (Object) Integer.valueOf(str.length()), (Object) 4);
            bArr3 = null;
        } else {
            allocate.put(str.getBytes(a));
            int length3 = bArr.length;
            if (length3 != 3) {
                ((anih) tky.a.d()).a("Cannot serialize BluetoothDeviceName: V1 ServiceID hash (%d bytes) should be exactly %d bytes", length3, 3);
                bArr3 = null;
            } else {
                allocate.put(bArr);
                allocate.position(allocate.position() + 7);
                allocate.put((byte) (length2 & 255));
                allocate.put(bArr2);
                bArr3 = allocate.array();
            }
        }
        if (bArr3 != null) {
            return jhy.d(bArr3);
        }
        return null;
    }

    public static tnd a(String str) {
        byte[] bArr;
        try {
            bArr = jhy.c(str);
        } catch (IllegalArgumentException e2) {
            bArr = null;
        }
        if (bArr != null) {
            int length = bArr.length;
            if (length > 147) {
                jjg jjg = tky.a;
                return null;
            } else if (length < 16) {
                jjg jjg2 = tky.a;
                return null;
            } else if (((bArr[0] & 224) >> 5) != 1) {
                jjg jjg3 = tky.a;
                return null;
            } else {
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                byte b2 = wrap.get() & 31;
                if (b2 == 1 || b2 == 2 || b2 == 3) {
                    byte[] bArr2 = new byte[4];
                    wrap.get(bArr2);
                    String str2 = new String(bArr2, a);
                    byte[] bArr3 = new byte[3];
                    wrap.get(bArr3);
                    wrap.position(wrap.position() + 7);
                    byte b3 = wrap.get() & 255;
                    int i = 131 - (147 - length);
                    if (i != b3) {
                        ((anih) tky.a.d()).a("Cannot deserialize BluetoothDeviceName: expected endpointInfo to be %d bytes, got %d bytes", (int) b3, i);
                        return null;
                    }
                    byte[] bArr4 = new byte[i];
                    wrap.get(bArr4);
                    return new tnd(b2, str2, bArr3, bArr4);
                }
                ((anih) tky.a.d()).a("Cannot deserialize BluetoothDeviceName: unsupported V1 PCP %d", (int) b2);
                return null;
            }
        } else {
            jjg jjg4 = tky.a;
            return null;
        }
    }
}
