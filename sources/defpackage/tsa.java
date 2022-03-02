package defpackage;

import android.net.nsd.NsdServiceInfo;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: tsa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tsa {
    static final Charset a = Charset.forName("UTF-8");
    public final int b;
    public final String c;
    public final byte[] d;
    public final byte[] e;

    public tsa(int i, String str, byte[] bArr, byte[] bArr2) {
        this.b = i;
        this.c = str;
        this.d = bArr;
        this.e = bArr2;
    }

    public static NsdServiceInfo a(int i, String str, byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr2.length;
        if (length > 131) {
            ((anih) tky.a.c()).a("While serializing Advertisement, truncating Endpoint Info %s (%d bytes) down to %d bytes", (Object) tky.a(bArr2), (Object) Integer.valueOf(length), (Object) 131);
            bArr2 = Arrays.copyOf(bArr2, 131);
        }
        ByteBuffer allocate = ByteBuffer.allocate(9);
        allocate.put((byte) ((i & 31) | 32));
        if (i != 1 && i != 2 && i != 3) {
            ((anih) tky.a.d()).a("Cannot serialize WifiLanServiceInfo: unsupported V1 PCP %d", i);
            bArr3 = null;
        } else if (str.length() != 4) {
            ((anih) tky.a.d()).a("Cannot serialize WifiLanServiceInfo: V1 Endpoint ID %s (%d bytes) should be exactly %d bytes", (Object) str, (Object) Integer.valueOf(str.length()), (Object) 4);
            bArr3 = null;
        } else {
            allocate.put(str.getBytes(a));
            int length2 = bArr.length;
            if (length2 != 3) {
                ((anih) tky.a.d()).a("Cannot serialize WifiLanServiceInfo: V1 ServiceID hash (%d bytes) should be exactly %d bytes", length2, 3);
                bArr3 = null;
            } else {
                allocate.put(bArr);
                bArr3 = allocate.array();
            }
        }
        if (bArr3 == null) {
            return null;
        }
        String d2 = jhy.d(bArr3);
        String d3 = jhy.d(bArr2);
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceName(d2);
        nsdServiceInfo.setAttribute("n", d3);
        return nsdServiceInfo;
    }

    public static tsa a(NsdServiceInfo nsdServiceInfo) {
        byte[] bArr;
        byte[] bArr2;
        String serviceName = nsdServiceInfo.getServiceName();
        try {
            bArr = jhy.c(serviceName);
        } catch (IllegalArgumentException e2) {
            bArr = null;
        }
        if (bArr == null) {
            ((anih) tky.a.d()).a("Cannot deserialize WifiLanServiceInfo: failed Base64 decoding of %s", (Object) serviceName);
            return null;
        }
        int length = bArr.length;
        if (length > 47) {
            ((anih) tky.a.d()).a("Cannot deserialize WifiLanServiceInfo: expecting max %d raw bytes, got %d", 47, length);
            return null;
        } else if (length >= 9) {
            int i = (bArr[0] & 224) >> 5;
            if (i != 1) {
                ((anih) tky.a.d()).a("Cannot deserialize WifiLanServiceInfo: unsupported Version %d", i);
                return null;
            }
            try {
                bArr2 = jhy.a(nsdServiceInfo.getAttributes().get("n"));
            } catch (IllegalArgumentException e3) {
                anih anih = (anih) tky.a.c();
                anih.a((Throwable) e3);
                anih.a("Failed to decode Wifi LAN endpoint name");
                bArr2 = null;
            }
            if (bArr2 == null) {
                return null;
            }
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            byte b2 = wrap.get() & 31;
            if (b2 == 1 || b2 == 2 || b2 == 3) {
                byte[] bArr3 = new byte[4];
                wrap.get(bArr3);
                String str = new String(bArr3, a);
                byte[] bArr4 = new byte[3];
                wrap.get(bArr4);
                return new tsa(b2, str, bArr4, bArr2);
            }
            ((anih) tky.a.d()).a("Cannot deserialize WifiLanServiceInfo: unsupported V1 PCP %d", (int) b2);
            return null;
        } else {
            ((anih) tky.a.d()).a("Cannot deserialize WifiLanServiceInfo: expecting min %d raw bytes, got %d", 9, length);
            return null;
        }
    }
}
