package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: tna  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tna {
    private static final Charset f = Charset.forName("UTF-8");
    public final int a;
    public final byte[] b;
    public final String c;
    public final byte[] d;
    public final String e;

    private tna(int i, byte[] bArr, String str, byte[] bArr2, String str2) {
        this.a = i;
        this.b = bArr;
        this.c = str;
        this.d = bArr2;
        this.e = str2;
    }

    public static tna a(byte[] bArr, boolean z) {
        byte[] bArr2;
        int i;
        String str;
        if (bArr == null) {
            ((anih) tky.a.d()).a("Cannot deserialize BleAdvertisement: null bytes passed in.");
            return null;
        }
        int i2 = !z ? 15 : 6;
        int length = bArr.length;
        if (length >= i2) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            byte b2 = wrap.get();
            int i3 = (b2 & 224) >> 5;
            if (i3 == 1) {
                byte b3 = b2 & 31;
                if (b3 == 2 || b3 == 1 || b3 == 3) {
                    if (!z) {
                        byte[] bArr3 = new byte[3];
                        wrap.get(bArr3);
                        bArr2 = bArr3;
                    } else {
                        bArr2 = null;
                    }
                    byte[] bArr4 = new byte[4];
                    wrap.get(bArr4);
                    String str2 = new String(bArr4, f);
                    int i4 = wrap.get() & 255;
                    if (!z) {
                        i = length - 15;
                    } else {
                        i = length - 6;
                    }
                    if (i < i4) {
                        ((anih) tky.a.d()).a("Cannot deserialize BleAdvertisement: expected endpointInfo to be %d bytes, got %d bytes", i4, i);
                        return null;
                    }
                    byte[] bArr5 = new byte[i4];
                    wrap.get(bArr5);
                    if (!z) {
                        byte[] bArr6 = new byte[6];
                        wrap.get(bArr6);
                        int i5 = 0;
                        while (true) {
                            if (i5 >= 6) {
                                break;
                            } else if (bArr6[i5] != 0) {
                                str = jjp.b(bArr6);
                                break;
                            } else {
                                i5++;
                            }
                        }
                        return new tna(b3, bArr2, str2, bArr5, str);
                    }
                    str = null;
                    return new tna(b3, bArr2, str2, bArr5, str);
                }
                ((anih) tky.a.d()).a("Cannot deserialize BleAdvertisement: unsupported V1 PCP %d", (int) b3);
                return null;
            }
            ((anih) tky.a.d()).a("Cannot deserialize BleAdvertisement: unsupported Version %d", i3);
            return null;
        }
        ((anih) tky.a.d()).a("Cannot deserialize BleAdvertisement: expecting min %d raw bytes, got %d", i2, length);
        return null;
    }

    public static byte[] a(int i, byte[] bArr, String str, byte[] bArr2, String str2, boolean z) {
        byte[] bArr3 = null;
        if (i == 2 || i == 1 || i == 3) {
            int i2 = !z ? 131 : 17;
            int length = bArr2.length;
            if (length <= i2) {
                ByteBuffer allocate = ByteBuffer.allocate(!z ? length + 15 : length + 6);
                allocate.put((byte) ((i & 31) | 32));
                if (!z) {
                    allocate.put(bArr);
                }
                allocate.put(str.getBytes(f));
                allocate.put((byte) length);
                allocate.put(bArr2);
                if (!z) {
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
                    } else {
                        bArr3 = new byte[6];
                    }
                    allocate.put(bArr3);
                }
                return allocate.array();
            }
            ((anih) tky.a.d()).a("Cannot serialize BleAdvertisement: expected an endpointInfo of at most %d bytes but got %d", i2, length);
            return null;
        }
        ((anih) tky.a.d()).a("Cannot serialize BleAdvertisement: unsupported V1 PCP %d", i);
        return null;
    }
}
