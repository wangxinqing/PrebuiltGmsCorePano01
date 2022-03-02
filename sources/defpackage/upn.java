package defpackage;

import android.text.TextUtils;
import java.nio.ByteBuffer;

/* renamed from: upn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class upn {
    public final int a;
    public final byte[] b;
    public final byte[] c;

    private upn(int i, byte[] bArr, byte[] bArr2) {
        this.a = i;
        this.b = bArr;
        this.c = bArr2;
    }

    public static upn a(byte[] bArr) {
        if (bArr.length <= 0) {
            ((anih) ((anih) ulh.a.d()).a("upn", "a", 126, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot deserialize BleL2capPacket: expected at least %d bytes, but got %d.", 1, 0);
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        byte b2 = wrap.get();
        if (b2 == 2 || b2 == 3 || b2 == 22 || b2 == 23 || b2 == 24) {
            return new upn(b2, (byte[]) null, (byte[]) null);
        }
        if (wrap.remaining() <= 2) {
            ((anih) ((anih) ulh.a.d()).a("upn", "a", 144, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot deserialize BleL2capPacket for command %d : expected two bytes length field but remaining %d bytes", (int) b2, wrap.remaining());
            return null;
        }
        int i = wrap.getShort();
        if (i < wrap.remaining()) {
            ((anih) ((anih) ulh.a.d()).a("upn", "a", 153, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot deserialize BleL2capPacket: expected data length %d bytes but remaining %d", i, wrap.remaining());
            return null;
        } else if (b2 != 1) {
            if (b2 != 21) {
                ((anih) ((anih) ulh.a.d()).a("upn", "a", 183, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot deserialize BleL2capPacket with unknown command %d", (int) b2);
                return null;
            } else if (i > 512) {
                ((anih) ((anih) ulh.a.d()).a("upn", "a", 172, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot deserialize BleL2capPacket: expected total advertisement length of at most %d bytes but got %d.", 512, i);
                return null;
            } else {
                byte[] bArr2 = new byte[i];
                wrap.get(bArr2);
                return new upn(21, (byte[]) null, bArr2);
            }
        } else if (i < 3) {
            ((anih) ((anih) ulh.a.d()).a("upn", "a", 161, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot deserialize BleL2capPacket for command %d : expected serviceIdHash length is %d but got %d.", (Object) 1, (Object) 3, (Object) Integer.valueOf(i));
            return null;
        } else {
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3);
            return new upn(1, bArr3, (byte[]) null);
        }
    }

    public static boolean a(int i) {
        return i > 0 && i < 515;
    }

    public static byte[] b() {
        return a(23, (byte[]) null);
    }

    public static byte[] c() {
        return a(24, (byte[]) null);
    }

    public static byte[] b(String str) {
        return ulu.a(str.getBytes(), 3);
    }

    public static byte[] b(byte[] bArr) {
        int length = bArr.length;
        if (length >= 8) {
            return a(21, bArr);
        }
        ((anih) ((anih) ulh.a.d()).a("upn", "b", 201, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot serialize BleL2capPacket for RESPONSE_ADVERTISEMENT : expected min %d advertisement raw bytes, but got %d", 8, length);
        return null;
    }

    public static byte[] a() {
        return a(22, (byte[]) null);
    }

    public static byte[] a(int i, byte[] bArr) {
        int i2;
        if (bArr != null) {
            i2 = bArr.length + 3;
        } else {
            i2 = 1;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i2);
        allocate.put((byte) (i & 255));
        if (bArr != null) {
            allocate.putShort((short) bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static byte[] a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return a(1, b(str));
        }
        ((anih) ((anih) ulh.a.d()).a("upn", "a", 190, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot serialize BleL2capPacket for REQUEST_ADVERTISEMENT without serviceId");
        return null;
    }
}
