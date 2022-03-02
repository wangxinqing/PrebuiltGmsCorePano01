package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: uph  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uph {
    public final int a;
    public final int b;
    public final boolean c;
    public final byte[] d;
    public final byte[] e;
    private final byte[] f;

    public uph(int i, int i2, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = i;
        this.b = i2;
        this.c = z;
        if (!z) {
            this.d = Arrays.copyOf(bArr, bArr.length);
        } else {
            this.d = null;
        }
        this.f = Arrays.copyOf(bArr2, bArr2.length);
        this.e = bArr3;
    }

    private static int a(int i, int i2, boolean z) {
        return (!z ? i + 8 : i + 2) + i2;
    }

    private static boolean a(int i) {
        return i == 2;
    }

    private static int b(byte[] bArr) {
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }

    private static boolean b(int i) {
        return i == 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uph) {
            uph uph = (uph) obj;
            if (aymi.v()) {
                if (this.a != uph.a || this.b != uph.b || !Arrays.equals(this.d, uph.d) || !Arrays.equals(this.f, uph.f) || !Arrays.equals(this.e, uph.e)) {
                    return false;
                }
                return true;
            } else if (this.a != uph.a || this.b != uph.b || !Arrays.equals(this.d, uph.d) || !Arrays.equals(this.f, uph.f)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (aymi.v()) {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(Arrays.hashCode(this.e))});
        }
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.f))});
    }

    public final String toString() {
        if (aymi.v()) {
            return String.format(Locale.US, "BleAdvertisement { version=%d, socketVersion=%d, serviceIdHash=%s, data=%s, deviceToken=%s }", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), ulu.a(this.d), ulu.a(this.f), ulu.a(this.e)});
        }
        return String.format(Locale.US, "BleAdvertisement { version=%d, socketVersion=%d, serviceIdHash=%s, data=%s }", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), ulu.a(this.d), ulu.a(this.f)});
    }

    public static uph a(byte[] bArr) {
        int i;
        byte[] bArr2;
        byte[] bArr3;
        boolean z;
        byte[] bArr4 = bArr;
        if (bArr4 == null) {
            ((anih) ((anih) ulh.a.d()).a("uph", "a", 82, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot deserialize BleAdvertisement: null bytes passed in.");
            return null;
        }
        int length = bArr4.length;
        if (length > 0) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            byte b2 = wrap.get();
            int i2 = (b2 & 224) >> 5;
            if (a(i2)) {
                int i3 = (b2 & 28) >> 2;
                if (b(i3)) {
                    int i4 = (b2 & 2) >> 1;
                    if (i4 == 0) {
                        i = 8;
                    } else {
                        i = 2;
                    }
                    if (length < i) {
                        ((anih) ((anih) ulh.a.d()).a("uph", "a", 118, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot deserialize BleAdvertisement: expecting min %d raw bytes, got %d", i, length);
                        return null;
                    }
                    if (i4 == 0) {
                        byte[] bArr5 = new byte[3];
                        wrap.get(bArr5);
                        bArr2 = bArr5;
                    } else {
                        bArr2 = null;
                    }
                    int i5 = i4 == 0 ? wrap.getInt() : wrap.get();
                    if (i5 < 0) {
                        ((anih) ((anih) ulh.a.d()).a("uph", "a", 134, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot deserialize BleAdvertisement: negative data size %d", i5);
                        return null;
                    } else if (wrap.remaining() < i5) {
                        ((anih) ((anih) ulh.a.d()).a("uph", "a", 141, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot deserialize BleAdvertisement: expected data to be %d bytes, but only %d bytes remain.", i5, wrap.remaining());
                        return null;
                    } else {
                        byte[] bArr6 = new byte[i5];
                        wrap.get(bArr6);
                        if (!aymi.v() || wrap.remaining() < 2) {
                            bArr3 = null;
                        } else {
                            byte[] bArr7 = new byte[2];
                            wrap.get(bArr7);
                            bArr3 = bArr7;
                        }
                        if (i4 == 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        return new uph(i2, i3, z, bArr2, bArr6, bArr3);
                    }
                } else {
                    ((anih) ((anih) ulh.a.d()).a("uph", "a", 108, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot deserialize BleAdvertisement: unsupported SocketVersion %d", i3);
                    return null;
                }
            } else {
                ((anih) ((anih) ulh.a.d()).a("uph", "a", 101, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot deserialize BleAdvertisement: unsupported Version %d", i2);
                return null;
            }
        } else {
            ((anih) ((anih) ulh.a.d()).a("uph", "a", 87, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot deserialize BleAdvertisement: expecting min %d raw bytes to parse the version, got %d", 1, 0);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final byte[] b() {
        return a(this.a, this.b, this.d, this.f, this.e, this.c);
    }

    public static byte[] a(int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z) {
        int i3;
        int length;
        int length2;
        if (!a(i)) {
            ((anih) ((anih) ulh.a.d()).a("uph", "a", 200, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot serialize BleAdvertisement: unsupported Version %d", i);
            return null;
        } else if (!b(i2)) {
            ((anih) ((anih) ulh.a.d()).a("uph", "a", 205, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot serialize BleAdvertisement: unsupported SocketVersion %d", i2);
            return null;
        } else if (bArr == null || (length2 = bArr.length) == 3) {
            if (!aymi.v()) {
                i3 = a(bArr2.length, b((byte[]) null), z);
            } else if (bArr3 == null || (length = bArr3.length) == 2) {
                i3 = a(bArr2.length, b(bArr3), z);
            } else {
                ((anih) ((anih) ulh.a.d()).a("uph", "a", 221, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot serialize BleAdvertisement: expected a deviceToken of %d bytes but got %d", 2, length);
                return null;
            }
            int i4 = !z ? 512 : 27;
            if (i3 <= i4) {
                ByteBuffer allocate = ByteBuffer.allocate(i3);
                allocate.put((byte) (((byte) (((byte) ((i << 5) & 224)) | ((i2 << 2) & 28))) | (((z ? 1 : 0) + z) & 2)));
                if (!z) {
                    allocate.put(bArr);
                    allocate.putInt(bArr2.length);
                } else {
                    allocate.put((byte) bArr2.length);
                }
                allocate.put(bArr2);
                if (aymi.v() && bArr3 != null) {
                    allocate.put(bArr3);
                }
                return allocate.array();
            }
            ((anih) ((anih) ulh.a.d()).a("uph", "a", 241, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot serialize BleAdvertisement: expected total advertisement length of at most %d bytes but got %d", i4, i3);
            return null;
        } else {
            ((anih) ((anih) ulh.a.d()).a("uph", "a", 212, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot serialize BleAdvertisement: expected a serviceIdHash of %d bytes but got %d", 3, length2);
            return null;
        }
    }

    public final byte[] a() {
        byte[] bArr = this.f;
        return Arrays.copyOf(bArr, bArr.length);
    }
}
