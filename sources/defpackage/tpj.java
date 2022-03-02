package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: tpj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tpj {
    static final Charset a = Charset.forName("UTF-8");
    private static final byte[] g = new byte[6];
    public final int b;
    public final String c;
    public final byte[] d;
    public final byte[] e;
    public final String f;

    public tpj(int i, String str, byte[] bArr, byte[] bArr2, String str2) {
        this.b = i;
        this.c = str;
        this.d = bArr;
        this.e = bArr2;
        this.f = str2;
    }

    public static tpj a(byte[] bArr) {
        String str;
        if (bArr == null) {
            ((anih) tky.a.d()).a("Cannot deserialize NfcTag: null bytes");
            return null;
        }
        int length = bArr.length;
        if (length > 146) {
            ((anih) tky.a.d()).a("Cannot deserialize NfcTag: expecting max %d raw bytes, got %d", 146, length);
            return null;
        } else if (length >= 15) {
            int i = (bArr[0] & 224) >> 5;
            if (i != 1) {
                ((anih) tky.a.d()).a("Cannot deserialize NfcTag: unsupported Version %d", i);
                return null;
            }
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            byte b2 = wrap.get() & 31;
            if (b2 == 1 || b2 == 2 || b2 == 3) {
                byte[] bArr2 = new byte[4];
                wrap.get(bArr2);
                String str2 = new String(bArr2, a);
                byte[] bArr3 = new byte[3];
                wrap.get(bArr3);
                byte b3 = wrap.get() & 255;
                int i2 = 131 - (146 - length);
                if (i2 != b3) {
                    ((anih) tky.a.d()).a("Cannot deserialize NfcTag: expected endpointInfo to be %d bytes, got %d bytes", (int) b3, i2);
                    return null;
                }
                byte[] bArr4 = new byte[i2];
                wrap.get(bArr4);
                byte[] bArr5 = new byte[6];
                wrap.get(bArr5);
                if (!Arrays.equals(bArr5, g)) {
                    str = jjp.b(bArr5);
                } else {
                    str = null;
                }
                return new tpj(b2, str2, bArr3, bArr4, str);
            }
            ((anih) tky.a.d()).a("Cannot deserialize NfcTag: unsupported V1 PCP %d", (int) b2);
            return null;
        } else {
            ((anih) tky.a.d()).a("Cannot deserialize NfcTag: expecting min %d raw bytes, got %d", 15, length);
            return null;
        }
    }

    public static byte[] a(int i, String str, byte[] bArr, byte[] bArr2, String str2) {
        int length = bArr2.length;
        if (length > 131) {
            ((anih) tky.a.c()).a("While serializing Advertisement, truncating Endpoint Info %s (%d bytes) down to %d bytesbytes", (Object) tky.a(bArr2), (Object) Integer.valueOf(length), (Object) 131);
            bArr2 = Arrays.copyOf(bArr2, 131);
        }
        int length2 = bArr2.length;
        ByteBuffer allocate = ByteBuffer.allocate(146 - (131 - length2));
        allocate.put((byte) ((i & 31) | 32));
        byte[] bArr3 = null;
        if (i != 1 && i != 2 && i != 3) {
            ((anih) tky.a.d()).a("Cannot serialize NfcTag: unsupported V1 PCP %d", i);
            return null;
        } else if (str.length() != 4) {
            ((anih) tky.a.d()).a("Cannot serialize NfcTag: V1 Endpoint ID %s (%d bytes) should be exactly %d bytes", (Object) str, (Object) Integer.valueOf(str.length()), (Object) 4);
            return null;
        } else {
            allocate.put(str.getBytes(a));
            int length3 = bArr.length;
            if (length3 != 3) {
                ((anih) tky.a.d()).a("Cannot serialize NfcTag: V1 ServiceID hash (%d bytes) should be exactly %d bytes", length3, 3);
                return null;
            }
            allocate.put(bArr);
            allocate.put((byte) (length2 & 255));
            allocate.put(bArr2);
            if (str2 != null) {
                String replace = str2.replace(":", "");
                if (replace.length() == 12) {
                    try {
                        bArr3 = jjp.a(replace);
                    } catch (NumberFormatException e2) {
                        ((anih) tky.a.d()).a("Cannot serialize Advertisement: Bluetooth MAC Address %s is not valid hex", (Object) str2);
                    }
                } else {
                    ((anih) tky.a.d()).a("Cannot serialize Advertisement: Bluetooth MAC Address %s (%d characters) should be exactly %d characters", (Object) str2, (Object) Integer.valueOf(str2.length()), (Object) 12);
                }
            }
            if (bArr3 == null) {
                bArr3 = new byte[6];
            }
            allocate.put(bArr3);
            return allocate.array();
        }
    }
}
