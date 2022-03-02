package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aawk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aawk {
    public static final /* synthetic */ int a = 0;
    private final byte[] b;
    private int c = 0;
    private long d;
    private int e = 0;
    private final int f;

    static {
        aawk.class.getSimpleName();
    }

    public aawk(int i, byte[] bArr) {
        this.f = i;
        this.b = bArr;
        if (bArr.length != 0) {
            this.d = a(bArr, 0);
        }
    }

    private final long a(int i) {
        long j = this.d;
        this.d = j >>> i;
        this.e += i;
        return j & (4294967295 >>> (32 - i));
    }

    static List b(long j, int i, int i2, byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        if (!a(j, i, i2, bArr, arrayList, new aawh())) {
            return null;
        }
        return arrayList;
    }

    private static long a(byte[] bArr, int i) {
        int length = bArr.length;
        if (i >= length) {
            return 0;
        }
        long j = ((long) bArr[i]) & 255;
        int i2 = i + 1;
        if (i2 >= length) {
            return j;
        }
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i3 = i + 2;
        if (i3 >= length) {
            return j2;
        }
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i4 = i + 3;
        if (i4 >= length) {
            return j3;
        }
        return ((((long) bArr[i4]) & 255) << 24) | j3;
    }

    static List a(long j, int i, int i2, byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        if (!a(j, i, i2, bArr, arrayList, new aawg())) {
            return null;
        }
        return arrayList;
    }

    private final void a() {
        this.e = 0;
        int i = this.c + 4;
        this.c = i;
        byte[] bArr = this.b;
        if (i < bArr.length) {
            this.d = a(bArr, i);
        }
    }

    static boolean a(long j, int i, int i2, byte[] bArr, List list, aawj aawj) {
        long j2;
        int i3 = i;
        int i4 = i2;
        byte[] bArr2 = bArr;
        List list2 = list;
        aawj aawj2 = aawj;
        long j3 = j;
        list2.add(aawj2.a(j3));
        boolean z = true;
        if (i4 == 0) {
            return true;
        }
        boolean z2 = false;
        if (bArr2 == null || bArr2.length == 0 || i3 < 2 || i3 > 28) {
            return false;
        }
        try {
            aawk aawk = new aawk(i3, bArr2);
            int i5 = 0;
            while (i5 < i4) {
                long j4 = 0;
                while (aawk.c < aawk.b.length) {
                    long j5 = aawk.d;
                    long j6 = j5 & 1;
                    int i6 = aawk.e + (z ? 1 : 0);
                    aawk.e = i6;
                    aawk.d = j5 >>> (z ? 1 : 0);
                    if (i6 == 32) {
                        aawk.a();
                    }
                    if (j6 != 0) {
                        j4++;
                    }
                    if (j6 == 0) {
                        int i7 = aawk.f;
                        if (aawk.c < aawk.b.length) {
                            int i8 = 32 - aawk.e;
                            if (i8 < i7) {
                                long j7 = aawk.d;
                                int i9 = i7 - i8;
                                aawk.a();
                                j2 = j7 | (aawk.a(i9) << (i7 - i9));
                            } else {
                                j2 = aawk.a(i7);
                            }
                            if (aawk.e == 32) {
                                aawk.a();
                            }
                            j3 += (j4 << aawk.f) + j2;
                            list2.add(aawj2.a(j3));
                            i5++;
                            z = true;
                            z2 = false;
                        } else {
                            throw new aawi();
                        }
                    } else {
                        z = true;
                    }
                }
                throw new aawi();
            }
            return list.size() != i4 + (z ? 1 : 0) ? z2 : z;
        } catch (aawi e2) {
            return false;
        }
    }
}
