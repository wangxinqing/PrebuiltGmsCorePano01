package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: upi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class upi {
    public static final Charset a = Charset.forName("UTF-8");
    public final int b;
    public final byte[] c;
    public final int d;
    private final int e;
    private final byte[] f;

    public upi(int i, int i2, byte[] bArr, byte[] bArr2, int i3) {
        this.e = i;
        this.b = i2;
        this.c = bArr;
        this.f = bArr2;
        this.d = i3;
    }

    public static upi a(byte[] bArr) {
        int i;
        try {
            byte[] a2 = jhy.a(bArr);
            if (a2 == null) {
                ((anih) ((anih) ulh.a.d()).a("upi", "a", 72, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot deserialize BleAdvertisementHeader: null bytes passed in.");
                return null;
            }
            int length = a2.length;
            if (length >= 15) {
                ByteBuffer wrap = ByteBuffer.wrap(a2);
                byte b2 = wrap.get();
                int i2 = (b2 & 224) >> 5;
                if (i2 == 2) {
                    byte b3 = b2 & 31;
                    byte[] bArr2 = new byte[10];
                    wrap.get(bArr2);
                    byte[] bArr3 = new byte[4];
                    wrap.get(bArr3);
                    byte[] bArr4 = new byte[2];
                    if (wrap.remaining() >= 2) {
                        wrap.get(bArr4);
                        i = urm.a(bArr4);
                    } else {
                        i = 0;
                    }
                    return new upi(2, b3, bArr2, bArr3, i);
                }
                ((anih) ((anih) ulh.a.d()).a("upi", "a", 91, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot deserialize BleAdvertisementHeader: unsupported Version %d", i2);
                return null;
            }
            ((anih) ((anih) ulh.a.d()).a("upi", "a", 77, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot deserialize BleAdvertisementHeader: expecting at least %d raw bytes, got %d", 15, length);
            return null;
        } catch (IllegalArgumentException e2) {
            ((anih) ((anih) ulh.a.d()).a("upi", "a", 67, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot deserialize BleAdvertisementHeader: failed Base64 decoding.");
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof upi) {
            upi upi = (upi) obj;
            if (this.e == upi.e && this.b == upi.b && Arrays.equals(this.c, upi.c) && Arrays.equals(this.f, upi.f) && this.d == upi.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.e), Integer.valueOf(this.b), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(this.d)});
    }

    public final String toString() {
        return String.format(Locale.US, "BleAdvertisementHeader { version=%d, numSlots=%d, serviceIdBloomFilter=%s, advertisementHash=%s, psm=%s}", new Object[]{Integer.valueOf(this.e), Integer.valueOf(this.b), ulu.a(this.c), ulu.a(this.f), Integer.valueOf(this.d)});
    }

    public static byte[] a(int i, int i2, byte[] bArr, byte[] bArr2, int i3) {
        if (i != 2) {
            ((anih) ((anih) ulh.a.d()).a("upi", "a", 128, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot serialize BleAdvertisementHeader: unsupported Version %d", i);
            return null;
        }
        int length = bArr.length;
        if (length != 10) {
            ((anih) ((anih) ulh.a.d()).a("upi", "a", 134, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot serialize BleAdvertisementHeader: expected serviceIdBloomFilter to be length %d but got %d instead", 10, length);
            return null;
        }
        int length2 = bArr2.length;
        if (length2 != 4) {
            ((anih) ((anih) ulh.a.d()).a("upi", "a", 142, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot serialize BleAdvertisementHeader: expected advertisementHash to be length %d but got %d instead", 4, length2);
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(17);
        allocate.put((byte) ((i2 & 31) | 64));
        allocate.put(bArr);
        allocate.put(bArr2);
        allocate.put(urm.b(i3));
        return jhy.d(allocate.array()).getBytes(a);
    }
}
