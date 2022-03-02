package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: trt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class trt {
    static final Charset a = Charset.forName("UTF-8");
    public final int b;
    public final String c;
    public final byte[] d;
    public final byte[] e;

    public trt(int i, String str, byte[] bArr, byte[] bArr2) {
        this.b = i;
        this.c = str;
        this.d = bArr;
        this.e = bArr2;
    }

    public static trt a(byte[] bArr) {
        if (bArr == null) {
            ((anih) tky.a.d()).a("Cannot deserialize WifiAwareServiceInfo: null bytes");
            return null;
        }
        int length = bArr.length;
        if (length > 147) {
            ((anih) tky.a.d()).a("Cannot deserialize WifiAwareServiceInfo: expecting max %d raw bytes, got %d", 147, length);
            return null;
        } else if (length >= 16) {
            int i = (bArr[0] & 224) >> 5;
            if (i != 1) {
                ((anih) tky.a.d()).a("Cannot deserialize WifiAwareServiceInfo: unsupported Version %d", i);
                return null;
            }
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            byte b2 = wrap.get() & 31;
            if (b2 == 1 || b2 == 2 || b2 == 3) {
                byte[] bArr2 = new byte[4];
                wrap.get(bArr2);
                String str = new String(bArr2, a);
                byte[] bArr3 = new byte[3];
                wrap.get(bArr3);
                wrap.position(wrap.position() + 7);
                byte b3 = wrap.get() & 255;
                int i2 = 131 - (147 - length);
                if (i2 != b3) {
                    ((anih) tky.a.d()).a("Cannot deserialize WifiAwareServiceInfo: expected endpointInfo to be %d bytes, got %d bytes", (int) b3, i2);
                    return null;
                }
                byte[] bArr4 = new byte[i2];
                wrap.get(bArr4);
                return new trt(b2, str, bArr3, bArr4);
            }
            ((anih) tky.a.d()).a("Cannot deserialize WifiAwareServiceInfo: unsupported V1 PCP %d", (int) b2);
            return null;
        } else {
            ((anih) tky.a.d()).a("Cannot deserialize WifiAwareServiceInfo: expecting min %d raw bytes, got %d", 16, length);
            return null;
        }
    }

    public static byte[] a(String str, byte[] bArr, byte[] bArr2) {
        int length = bArr2.length;
        if (length > 131) {
            ((anih) tky.a.c()).a("While serializing Advertisement, truncating Endpoint Info %s (%d bytes) down to %d bytesbytes", (Object) tky.a(bArr2), (Object) Integer.valueOf(length), (Object) 131);
            bArr2 = Arrays.copyOf(bArr2, 131);
        }
        int length2 = bArr2.length;
        ByteBuffer allocate = ByteBuffer.allocate(147 - (131 - length2));
        allocate.put((byte) 35);
        if (str.length() != 4) {
            ((anih) tky.a.d()).a("Cannot serialize WifiAwareServiceInfo: V1 Endpoint ID %s (%d bytes) should be exactly %d bytes", (Object) str, (Object) Integer.valueOf(str.length()), (Object) 4);
            return null;
        }
        allocate.put(str.getBytes(a));
        int length3 = bArr.length;
        if (length3 != 3) {
            ((anih) tky.a.d()).a("Cannot serialize WifiAwareServiceInfo: V1 ServiceID hash (%d bytes) should be exactly %d bytes", length3, 3);
            return null;
        }
        allocate.put(bArr);
        allocate.position(allocate.position() + 7);
        allocate.put((byte) (length2 & 255));
        allocate.put(bArr2);
        return allocate.array();
    }
}
