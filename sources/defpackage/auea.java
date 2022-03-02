package defpackage;

import com.google.android.chimera.Service;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlRequest;
import sun.misc.Unsafe;

/* renamed from: auea  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class auea implements aueq {
    private static final int[] a = new int[0];
    private static final Unsafe b = aufp.a();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final audx g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final int[] k;
    private final int l;
    private final int m;
    private final audk n;
    private final auff o;

    private auea(int[] iArr, Object[] objArr, int i2, int i3, audx audx, boolean z, int[] iArr2, int i4, int i5, audk audk, auff auff, aubt aubt) {
        this.c = iArr;
        this.d = objArr;
        this.e = i2;
        this.f = i3;
        this.i = audx instanceof aucj;
        this.j = z;
        boolean z2 = false;
        if (aubt != null && (audx instanceof aucg)) {
            z2 = true;
        }
        this.h = z2;
        this.k = iArr2;
        this.l = i4;
        this.m = i5;
        this.n = audk;
        this.o = auff;
        this.g = audx;
    }

    private final int a(int i2, int i3) {
        if (i2 < this.e || i2 > this.f) {
            return -1;
        }
        return b(i2, i3);
    }

    private static double b(Object obj, long j2) {
        return ((Double) aufp.f(obj, j2)).doubleValue();
    }

    private static float c(Object obj, long j2) {
        return ((Float) aufp.f(obj, j2)).floatValue();
    }

    private final int d(int i2) {
        return this.c[i2];
    }

    private final int e(int i2) {
        return this.c[i2 + 1];
    }

    private final int f(int i2) {
        return this.c[i2 + 2];
    }

    private static int g(int i2) {
        return (i2 >>> 20) & 255;
    }

    private static boolean h(int i2) {
        return (i2 & 536870912) != 0;
    }

    private static long i(int i2) {
        return (long) (i2 & 1048575);
    }

    private final int j(int i2) {
        if (i2 < this.e || i2 > this.f) {
            return -1;
        }
        return b(i2, 0);
    }

    private final int a(Object obj, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, auah auah) {
        Object obj2;
        Object obj3;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i10 = i2;
        int i11 = i4;
        int i12 = i5;
        int i13 = i6;
        long j3 = j2;
        int i14 = i9;
        auah auah2 = auah;
        Unsafe unsafe = b;
        long j4 = (long) (this.c[i14 + 2] & 1048575);
        switch (i8) {
            case 51:
                if (i13 == 1) {
                    unsafe.putObject(obj4, j3, Double.valueOf(auai.c(bArr, i2)));
                    unsafe.putInt(obj4, j4, i12);
                    return i10 + 8;
                }
                break;
            case 52:
                if (i13 == 5) {
                    unsafe.putObject(obj4, j3, Float.valueOf(auai.d(bArr, i2)));
                    unsafe.putInt(obj4, j4, i12);
                    return i10 + 4;
                }
                break;
            case 53:
            case 54:
                if (i13 == 0) {
                    int b2 = auai.b(bArr2, i10, auah2);
                    unsafe.putObject(obj4, j3, Long.valueOf(auah2.b));
                    unsafe.putInt(obj4, j4, i12);
                    return b2;
                }
                break;
            case 55:
            case 62:
                if (i13 == 0) {
                    int a2 = auai.a(bArr2, i10, auah2);
                    unsafe.putObject(obj4, j3, Integer.valueOf(auah2.a));
                    unsafe.putInt(obj4, j4, i12);
                    return a2;
                }
                break;
            case 56:
            case 65:
                if (i13 == 1) {
                    unsafe.putObject(obj4, j3, Long.valueOf(auai.b(bArr, i2)));
                    unsafe.putInt(obj4, j4, i12);
                    return i10 + 8;
                }
                break;
            case 57:
            case 64:
                if (i13 == 5) {
                    unsafe.putObject(obj4, j3, Integer.valueOf(auai.a(bArr, i2)));
                    unsafe.putInt(obj4, j4, i12);
                    return i10 + 4;
                }
                break;
            case 58:
                if (i13 == 0) {
                    int b3 = auai.b(bArr2, i10, auah2);
                    unsafe.putObject(obj4, j3, Boolean.valueOf(auah2.b != 0));
                    unsafe.putInt(obj4, j4, i12);
                    return b3;
                }
                break;
            case 59:
                if (i13 == 2) {
                    int a3 = auai.a(bArr2, i10, auah2);
                    int i15 = auah2.a;
                    if (i15 == 0) {
                        unsafe.putObject(obj4, j3, "");
                    } else if ((i7 & 536870912) != 0 && !aufv.a(bArr2, a3, a3 + i15)) {
                        throw auda.i();
                    } else {
                        unsafe.putObject(obj4, j3, new String(bArr2, a3, i15, aucy.a));
                        a3 += i15;
                    }
                    unsafe.putInt(obj4, j4, i12);
                    return a3;
                }
                break;
            case 60:
                if (i13 == 2) {
                    int a4 = auai.a(a(i14), bArr2, i10, i3, auah2);
                    if (unsafe.getInt(obj4, j4) == i12) {
                        obj2 = unsafe.getObject(obj4, j3);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        unsafe.putObject(obj4, j3, aucy.a(obj2, auah2.c));
                    } else {
                        unsafe.putObject(obj4, j3, auah2.c);
                    }
                    unsafe.putInt(obj4, j4, i12);
                    return a4;
                }
                break;
            case 61:
                if (i13 == 2) {
                    int e2 = auai.e(bArr2, i10, auah2);
                    unsafe.putObject(obj4, j3, auah2.c);
                    unsafe.putInt(obj4, j4, i12);
                    return e2;
                }
                break;
            case 63:
                if (i13 == 0) {
                    int a5 = auai.a(bArr2, i10, auah2);
                    int i16 = auah2.a;
                    aucq c2 = c(i14);
                    if (c2 == null || c2.a(i16)) {
                        unsafe.putObject(obj4, j3, Integer.valueOf(i16));
                        unsafe.putInt(obj4, j4, i12);
                    } else {
                        c(obj).a(i11, (Object) Long.valueOf((long) i16));
                    }
                    return a5;
                }
                break;
            case 66:
                if (i13 == 0) {
                    int a6 = auai.a(bArr2, i10, auah2);
                    unsafe.putObject(obj4, j3, Integer.valueOf(aubc.g(auah2.a)));
                    unsafe.putInt(obj4, j4, i12);
                    return a6;
                }
                break;
            case 67:
                if (i13 == 0) {
                    int b4 = auai.b(bArr2, i10, auah2);
                    unsafe.putObject(obj4, j3, Long.valueOf(aubc.a(auah2.b)));
                    unsafe.putInt(obj4, j4, i12);
                    return b4;
                }
                break;
            case 68:
                if (i13 == 3) {
                    int a7 = auai.a(a(i14), bArr, i2, i3, (i11 & -8) | 4, auah);
                    if (unsafe.getInt(obj4, j4) == i12) {
                        obj3 = unsafe.getObject(obj4, j3);
                    } else {
                        obj3 = null;
                    }
                    if (obj3 != null) {
                        unsafe.putObject(obj4, j3, aucy.a(obj3, auah2.c));
                    } else {
                        unsafe.putObject(obj4, j3, auah2.c);
                    }
                    unsafe.putInt(obj4, j4, i12);
                    return a7;
                }
                break;
        }
        return i10;
    }

    private final int b(int i2, int i3) {
        int length = (this.c.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int d2 = d(i5);
            if (i2 == d2) {
                return i5;
            }
            if (i2 >= d2) {
                i3 = i4 + 1;
            } else {
                length = i4 - 1;
            }
        }
        return -1;
    }

    private final aucq c(int i2) {
        int i3 = i2 / 3;
        return (aucq) this.d[i3 + i3 + 1];
    }

    private static int d(Object obj, long j2) {
        return ((Integer) aufp.f(obj, j2)).intValue();
    }

    private static long e(Object obj, long j2) {
        return ((Long) aufp.f(obj, j2)).longValue();
    }

    private final int f(Object obj) {
        int i2;
        Unsafe unsafe = b;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < this.c.length; i6 += 3) {
            int e2 = e(i6);
            int d2 = d(i6);
            int g2 = g(e2);
            if (g2 <= 17) {
                int i7 = this.c[i6 + 2];
                int i8 = 1048575 & i7;
                i2 = 1 << (i7 >>> 20);
                if (i8 != i3) {
                    i5 = unsafe.getInt(obj, (long) i8);
                    i3 = i8;
                }
            } else {
                i2 = 0;
            }
            long i9 = i(e2);
            switch (g2) {
                case 0:
                    if ((i5 & i2) == 0) {
                        break;
                    } else {
                        i4 += aubk.p(d2);
                        break;
                    }
                case 1:
                    if ((i5 & i2) == 0) {
                        break;
                    } else {
                        i4 += aubk.s(d2);
                        break;
                    }
                case 2:
                    if ((i5 & i2) == 0) {
                        break;
                    } else {
                        i4 += aubk.d(d2, unsafe.getLong(obj, i9));
                        break;
                    }
                case 3:
                    if ((i5 & i2) == 0) {
                        break;
                    } else {
                        i4 += aubk.e(d2, unsafe.getLong(obj, i9));
                        break;
                    }
                case 4:
                    if ((i5 & i2) == 0) {
                        break;
                    } else {
                        i4 += aubk.g(d2, unsafe.getInt(obj, i9));
                        break;
                    }
                case 5:
                    if ((i5 & i2) == 0) {
                        break;
                    } else {
                        i4 += aubk.r(d2);
                        break;
                    }
                case 6:
                    if ((i5 & i2) == 0) {
                        break;
                    } else {
                        i4 += aubk.q(d2);
                        break;
                    }
                case 7:
                    if ((i5 & i2) == 0) {
                        break;
                    } else {
                        i4 += aubk.o(d2);
                        break;
                    }
                case 8:
                    if ((i5 & i2) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, i9);
                        if (!(object instanceof auay)) {
                            i4 += aubk.b(d2, (String) object);
                            break;
                        } else {
                            i4 += aubk.c(d2, (auay) object);
                            break;
                        }
                    }
                case 9:
                    if ((i5 & i2) == 0) {
                        break;
                    } else {
                        i4 += auer.a(d2, unsafe.getObject(obj, i9), a(i6));
                        break;
                    }
                case 10:
                    if ((i5 & i2) == 0) {
                        break;
                    } else {
                        i4 += aubk.c(d2, (auay) unsafe.getObject(obj, i9));
                        break;
                    }
                case 11:
                    if ((i5 & i2) == 0) {
                        break;
                    } else {
                        i4 += aubk.h(d2, unsafe.getInt(obj, i9));
                        break;
                    }
                case 12:
                    if ((i5 & i2) == 0) {
                        break;
                    } else {
                        i4 += aubk.j(d2, unsafe.getInt(obj, i9));
                        break;
                    }
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    if ((i5 & i2) == 0) {
                        break;
                    } else {
                        i4 += aubk.t(d2);
                        break;
                    }
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    if ((i5 & i2) == 0) {
                        break;
                    } else {
                        i4 += aubk.u(d2);
                        break;
                    }
                case Service.START_CONTINUATION_MASK:
                    if ((i5 & i2) == 0) {
                        break;
                    } else {
                        i4 += aubk.i(d2, unsafe.getInt(obj, i9));
                        break;
                    }
                case 16:
                    if ((i5 & i2) == 0) {
                        break;
                    } else {
                        i4 += aubk.f(d2, unsafe.getLong(obj, i9));
                        break;
                    }
                case 17:
                    if ((i5 & i2) == 0) {
                        break;
                    } else {
                        i4 += aubk.b(d2, (audx) unsafe.getObject(obj, i9), a(i6));
                        break;
                    }
                case 18:
                    i4 += auer.f(d2, (List) unsafe.getObject(obj, i9));
                    break;
                case 19:
                    i4 += auer.e(d2, (List) unsafe.getObject(obj, i9));
                    break;
                case 20:
                    i4 += auer.h(d2, (List) unsafe.getObject(obj, i9));
                    break;
                case 21:
                    i4 += auer.l(d2, (List) unsafe.getObject(obj, i9));
                    break;
                case 22:
                    i4 += auer.g(d2, (List) unsafe.getObject(obj, i9));
                    break;
                case 23:
                    i4 += auer.f(d2, (List) unsafe.getObject(obj, i9));
                    break;
                case 24:
                    i4 += auer.e(d2, (List) unsafe.getObject(obj, i9));
                    break;
                case 25:
                    i4 += auer.c(d2, (List) unsafe.getObject(obj, i9));
                    break;
                case 26:
                    i4 += auer.a(d2, (List) unsafe.getObject(obj, i9));
                    break;
                case 27:
                    i4 += auer.a(d2, (List) unsafe.getObject(obj, i9), a(i6));
                    break;
                case 28:
                    i4 += auer.b(d2, (List) unsafe.getObject(obj, i9));
                    break;
                case 29:
                    i4 += auer.k(d2, (List) unsafe.getObject(obj, i9));
                    break;
                case 30:
                    i4 += auer.d(d2, (List) unsafe.getObject(obj, i9));
                    break;
                case 31:
                    i4 += auer.e(d2, (List) unsafe.getObject(obj, i9));
                    break;
                case 32:
                    i4 += auer.f(d2, (List) unsafe.getObject(obj, i9));
                    break;
                case 33:
                    i4 += auer.i(d2, (List) unsafe.getObject(obj, i9));
                    break;
                case 34:
                    i4 += auer.j(d2, (List) unsafe.getObject(obj, i9));
                    break;
                case 35:
                    int i10 = auer.i((List) unsafe.getObject(obj, i9));
                    if (i10 <= 0) {
                        break;
                    } else {
                        i4 += aubk.i(d2) + aubk.k(i10) + i10;
                        break;
                    }
                case 36:
                    int h2 = auer.h((List) unsafe.getObject(obj, i9));
                    if (h2 <= 0) {
                        break;
                    } else {
                        i4 += aubk.i(d2) + aubk.k(h2) + h2;
                        break;
                    }
                case 37:
                    int a2 = auer.a((List) unsafe.getObject(obj, i9));
                    if (a2 <= 0) {
                        break;
                    } else {
                        i4 += aubk.i(d2) + aubk.k(a2) + a2;
                        break;
                    }
                case 38:
                    int b2 = auer.b((List) unsafe.getObject(obj, i9));
                    if (b2 <= 0) {
                        break;
                    } else {
                        i4 += aubk.i(d2) + aubk.k(b2) + b2;
                        break;
                    }
                case 39:
                    int e3 = auer.e((List) unsafe.getObject(obj, i9));
                    if (e3 <= 0) {
                        break;
                    } else {
                        i4 += aubk.i(d2) + aubk.k(e3) + e3;
                        break;
                    }
                case 40:
                    int i11 = auer.i((List) unsafe.getObject(obj, i9));
                    if (i11 <= 0) {
                        break;
                    } else {
                        i4 += aubk.i(d2) + aubk.k(i11) + i11;
                        break;
                    }
                case 41:
                    int h3 = auer.h((List) unsafe.getObject(obj, i9));
                    if (h3 <= 0) {
                        break;
                    } else {
                        i4 += aubk.i(d2) + aubk.k(h3) + h3;
                        break;
                    }
                case 42:
                    int j2 = auer.j((List) unsafe.getObject(obj, i9));
                    if (j2 <= 0) {
                        break;
                    } else {
                        i4 += aubk.i(d2) + aubk.k(j2) + j2;
                        break;
                    }
                case 43:
                    int f2 = auer.f((List) unsafe.getObject(obj, i9));
                    if (f2 <= 0) {
                        break;
                    } else {
                        i4 += aubk.i(d2) + aubk.k(f2) + f2;
                        break;
                    }
                case 44:
                    int d3 = auer.d((List) unsafe.getObject(obj, i9));
                    if (d3 <= 0) {
                        break;
                    } else {
                        i4 += aubk.i(d2) + aubk.k(d3) + d3;
                        break;
                    }
                case 45:
                    int h4 = auer.h((List) unsafe.getObject(obj, i9));
                    if (h4 <= 0) {
                        break;
                    } else {
                        i4 += aubk.i(d2) + aubk.k(h4) + h4;
                        break;
                    }
                case 46:
                    int i12 = auer.i((List) unsafe.getObject(obj, i9));
                    if (i12 <= 0) {
                        break;
                    } else {
                        i4 += aubk.i(d2) + aubk.k(i12) + i12;
                        break;
                    }
                case 47:
                    int g3 = auer.g((List) unsafe.getObject(obj, i9));
                    if (g3 <= 0) {
                        break;
                    } else {
                        i4 += aubk.i(d2) + aubk.k(g3) + g3;
                        break;
                    }
                case 48:
                    int c2 = auer.c((List) unsafe.getObject(obj, i9));
                    if (c2 <= 0) {
                        break;
                    } else {
                        i4 += aubk.i(d2) + aubk.k(c2) + c2;
                        break;
                    }
                case 49:
                    i4 += auer.b(d2, (List) unsafe.getObject(obj, i9), a(i6));
                    break;
                case 50:
                    i4 += auds.a(d2, unsafe.getObject(obj, i9), b(i6));
                    break;
                case 51:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i4 += aubk.p(d2);
                        break;
                    }
                case 52:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i4 += aubk.s(d2);
                        break;
                    }
                case 53:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i4 += aubk.d(d2, e(obj, i9));
                        break;
                    }
                case 54:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i4 += aubk.e(d2, e(obj, i9));
                        break;
                    }
                case 55:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i4 += aubk.g(d2, d(obj, i9));
                        break;
                    }
                case 56:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i4 += aubk.r(d2);
                        break;
                    }
                case 57:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i4 += aubk.q(d2);
                        break;
                    }
                case 58:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i4 += aubk.o(d2);
                        break;
                    }
                case 59:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(obj, i9);
                        if (!(object2 instanceof auay)) {
                            i4 += aubk.b(d2, (String) object2);
                            break;
                        } else {
                            i4 += aubk.c(d2, (auay) object2);
                            break;
                        }
                    }
                case 60:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i4 += auer.a(d2, unsafe.getObject(obj, i9), a(i6));
                        break;
                    }
                case 61:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i4 += aubk.c(d2, (auay) unsafe.getObject(obj, i9));
                        break;
                    }
                case 62:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i4 += aubk.h(d2, d(obj, i9));
                        break;
                    }
                case 63:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i4 += aubk.j(d2, d(obj, i9));
                        break;
                    }
                case 64:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i4 += aubk.t(d2);
                        break;
                    }
                case 65:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i4 += aubk.u(d2);
                        break;
                    }
                case 66:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i4 += aubk.i(d2, d(obj, i9));
                        break;
                    }
                case 67:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i4 += aubk.f(d2, e(obj, i9));
                        break;
                    }
                case 68:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i4 += aubk.b(d2, (audx) unsafe.getObject(obj, i9), a(i6));
                        break;
                    }
            }
        }
        int h5 = i4 + h(obj);
        if (!this.h) {
            return h5;
        }
        aubx a3 = aubt.a(obj);
        int i13 = 0;
        for (int i14 = 0; i14 < a3.a.a(); i14++) {
            Map.Entry b3 = a3.a.b(i14);
            i13 += aubx.b((auch) b3.getKey(), b3.getValue());
        }
        for (Map.Entry entry : a3.a.b()) {
            i13 += aubx.b((auch) entry.getKey(), entry.getValue());
        }
        return h5 + i13;
    }

    private final int g(Object obj) {
        Unsafe unsafe = b;
        int i2 = 0;
        for (int i3 = 0; i3 < this.c.length; i3 += 3) {
            int e2 = e(i3);
            int g2 = g(e2);
            int d2 = d(i3);
            long i4 = i(e2);
            if (g2 >= auby.DOUBLE_LIST_PACKED.Z && g2 <= auby.SINT64_LIST_PACKED.Z) {
                int i5 = this.c[i3 + 2];
            }
            switch (g2) {
                case 0:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += aubk.p(d2);
                        break;
                    }
                case 1:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += aubk.s(d2);
                        break;
                    }
                case 2:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += aubk.d(d2, aufp.b(obj, i4));
                        break;
                    }
                case 3:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += aubk.e(d2, aufp.b(obj, i4));
                        break;
                    }
                case 4:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += aubk.g(d2, aufp.a(obj, i4));
                        break;
                    }
                case 5:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += aubk.r(d2);
                        break;
                    }
                case 6:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += aubk.q(d2);
                        break;
                    }
                case 7:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += aubk.o(d2);
                        break;
                    }
                case 8:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        Object f2 = aufp.f(obj, i4);
                        if (!(f2 instanceof auay)) {
                            i2 += aubk.b(d2, (String) f2);
                            break;
                        } else {
                            i2 += aubk.c(d2, (auay) f2);
                            break;
                        }
                    }
                case 9:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += auer.a(d2, aufp.f(obj, i4), a(i3));
                        break;
                    }
                case 10:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += aubk.c(d2, (auay) aufp.f(obj, i4));
                        break;
                    }
                case 11:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += aubk.h(d2, aufp.a(obj, i4));
                        break;
                    }
                case 12:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += aubk.j(d2, aufp.a(obj, i4));
                        break;
                    }
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += aubk.t(d2);
                        break;
                    }
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += aubk.u(d2);
                        break;
                    }
                case Service.START_CONTINUATION_MASK:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += aubk.i(d2, aufp.a(obj, i4));
                        break;
                    }
                case 16:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += aubk.f(d2, aufp.b(obj, i4));
                        break;
                    }
                case 17:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += aubk.b(d2, (audx) aufp.f(obj, i4), a(i3));
                        break;
                    }
                case 18:
                    i2 += auer.f(d2, a(obj, i4));
                    break;
                case 19:
                    i2 += auer.e(d2, a(obj, i4));
                    break;
                case 20:
                    i2 += auer.h(d2, a(obj, i4));
                    break;
                case 21:
                    i2 += auer.l(d2, a(obj, i4));
                    break;
                case 22:
                    i2 += auer.g(d2, a(obj, i4));
                    break;
                case 23:
                    i2 += auer.f(d2, a(obj, i4));
                    break;
                case 24:
                    i2 += auer.e(d2, a(obj, i4));
                    break;
                case 25:
                    i2 += auer.c(d2, a(obj, i4));
                    break;
                case 26:
                    i2 += auer.a(d2, a(obj, i4));
                    break;
                case 27:
                    i2 += auer.a(d2, a(obj, i4), a(i3));
                    break;
                case 28:
                    i2 += auer.b(d2, a(obj, i4));
                    break;
                case 29:
                    i2 += auer.k(d2, a(obj, i4));
                    break;
                case 30:
                    i2 += auer.d(d2, a(obj, i4));
                    break;
                case 31:
                    i2 += auer.e(d2, a(obj, i4));
                    break;
                case 32:
                    i2 += auer.f(d2, a(obj, i4));
                    break;
                case 33:
                    i2 += auer.i(d2, a(obj, i4));
                    break;
                case 34:
                    i2 += auer.j(d2, a(obj, i4));
                    break;
                case 35:
                    int i6 = auer.i((List) unsafe.getObject(obj, i4));
                    if (i6 <= 0) {
                        break;
                    } else {
                        i2 += aubk.i(d2) + aubk.k(i6) + i6;
                        break;
                    }
                case 36:
                    int h2 = auer.h((List) unsafe.getObject(obj, i4));
                    if (h2 <= 0) {
                        break;
                    } else {
                        i2 += aubk.i(d2) + aubk.k(h2) + h2;
                        break;
                    }
                case 37:
                    int a2 = auer.a((List) unsafe.getObject(obj, i4));
                    if (a2 <= 0) {
                        break;
                    } else {
                        i2 += aubk.i(d2) + aubk.k(a2) + a2;
                        break;
                    }
                case 38:
                    int b2 = auer.b((List) unsafe.getObject(obj, i4));
                    if (b2 <= 0) {
                        break;
                    } else {
                        i2 += aubk.i(d2) + aubk.k(b2) + b2;
                        break;
                    }
                case 39:
                    int e3 = auer.e((List) unsafe.getObject(obj, i4));
                    if (e3 <= 0) {
                        break;
                    } else {
                        i2 += aubk.i(d2) + aubk.k(e3) + e3;
                        break;
                    }
                case 40:
                    int i7 = auer.i((List) unsafe.getObject(obj, i4));
                    if (i7 <= 0) {
                        break;
                    } else {
                        i2 += aubk.i(d2) + aubk.k(i7) + i7;
                        break;
                    }
                case 41:
                    int h3 = auer.h((List) unsafe.getObject(obj, i4));
                    if (h3 <= 0) {
                        break;
                    } else {
                        i2 += aubk.i(d2) + aubk.k(h3) + h3;
                        break;
                    }
                case 42:
                    int j2 = auer.j((List) unsafe.getObject(obj, i4));
                    if (j2 <= 0) {
                        break;
                    } else {
                        i2 += aubk.i(d2) + aubk.k(j2) + j2;
                        break;
                    }
                case 43:
                    int f3 = auer.f((List) unsafe.getObject(obj, i4));
                    if (f3 <= 0) {
                        break;
                    } else {
                        i2 += aubk.i(d2) + aubk.k(f3) + f3;
                        break;
                    }
                case 44:
                    int d3 = auer.d((List) unsafe.getObject(obj, i4));
                    if (d3 <= 0) {
                        break;
                    } else {
                        i2 += aubk.i(d2) + aubk.k(d3) + d3;
                        break;
                    }
                case 45:
                    int h4 = auer.h((List) unsafe.getObject(obj, i4));
                    if (h4 <= 0) {
                        break;
                    } else {
                        i2 += aubk.i(d2) + aubk.k(h4) + h4;
                        break;
                    }
                case 46:
                    int i8 = auer.i((List) unsafe.getObject(obj, i4));
                    if (i8 <= 0) {
                        break;
                    } else {
                        i2 += aubk.i(d2) + aubk.k(i8) + i8;
                        break;
                    }
                case 47:
                    int g3 = auer.g((List) unsafe.getObject(obj, i4));
                    if (g3 <= 0) {
                        break;
                    } else {
                        i2 += aubk.i(d2) + aubk.k(g3) + g3;
                        break;
                    }
                case 48:
                    int c2 = auer.c((List) unsafe.getObject(obj, i4));
                    if (c2 <= 0) {
                        break;
                    } else {
                        i2 += aubk.i(d2) + aubk.k(c2) + c2;
                        break;
                    }
                case 49:
                    i2 += auer.b(d2, a(obj, i4), a(i3));
                    break;
                case 50:
                    i2 += auds.a(d2, aufp.f(obj, i4), b(i3));
                    break;
                case 51:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += aubk.p(d2);
                        break;
                    }
                case 52:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += aubk.s(d2);
                        break;
                    }
                case 53:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += aubk.d(d2, e(obj, i4));
                        break;
                    }
                case 54:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += aubk.e(d2, e(obj, i4));
                        break;
                    }
                case 55:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += aubk.g(d2, d(obj, i4));
                        break;
                    }
                case 56:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += aubk.r(d2);
                        break;
                    }
                case 57:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += aubk.q(d2);
                        break;
                    }
                case 58:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += aubk.o(d2);
                        break;
                    }
                case 59:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        Object f4 = aufp.f(obj, i4);
                        if (!(f4 instanceof auay)) {
                            i2 += aubk.b(d2, (String) f4);
                            break;
                        } else {
                            i2 += aubk.c(d2, (auay) f4);
                            break;
                        }
                    }
                case 60:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += auer.a(d2, aufp.f(obj, i4), a(i3));
                        break;
                    }
                case 61:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += aubk.c(d2, (auay) aufp.f(obj, i4));
                        break;
                    }
                case 62:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += aubk.h(d2, d(obj, i4));
                        break;
                    }
                case 63:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += aubk.j(d2, d(obj, i4));
                        break;
                    }
                case 64:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += aubk.t(d2);
                        break;
                    }
                case 65:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += aubk.u(d2);
                        break;
                    }
                case 66:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += aubk.i(d2, d(obj, i4));
                        break;
                    }
                case 67:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += aubk.f(d2, e(obj, i4));
                        break;
                    }
                case 68:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += aubk.b(d2, (audx) aufp.f(obj, i4), a(i3));
                        break;
                    }
            }
        }
        return i2 + h(obj);
    }

    private static final int h(Object obj) {
        return auff.a(obj).c();
    }

    private final Object b(int i2) {
        int i3 = i2 / 3;
        return this.d[i3 + i3];
    }

    static aufg c(Object obj) {
        aucj aucj = (aucj) obj;
        aufg aufg = aucj.T;
        if (aufg != aufg.a) {
            return aufg;
        }
        aufg a2 = aufg.a();
        aucj.T = a2;
        return a2;
    }

    public final void d(Object obj) {
        int i2;
        int i3 = this.l;
        while (true) {
            i2 = this.m;
            if (i3 >= i2) {
                break;
            }
            long i4 = i(e(this.k[i3]));
            Object f2 = aufp.f(obj, i4);
            if (f2 != null) {
                ((audr) f2).b();
                aufp.a(obj, i4, f2);
            }
            i3++;
        }
        int length = this.k.length;
        while (i2 < length) {
            this.n.b(obj, (long) this.k[i2]);
            i2++;
        }
        auff.c(obj);
        if (this.h) {
            aubt.c(obj);
        }
    }

    public final boolean e(Object obj) {
        int i2;
        int i3 = -1;
        int i4 = 0;
        for (int i5 = 0; i5 < this.l; i5++) {
            int i6 = this.k[i5];
            int d2 = d(i6);
            int e2 = e(i6);
            if (!this.j) {
                int i7 = this.c[i6 + 2];
                int i8 = 1048575 & i7;
                i2 = 1 << (i7 >>> 20);
                if (i8 != i3) {
                    i4 = b.getInt(obj, (long) i8);
                    i3 = i8;
                }
            } else {
                i2 = 0;
            }
            if ((268435456 & e2) != 0 && !a(obj, i6, i4, i2)) {
                return false;
            }
            int g2 = g(e2);
            if (g2 != 9 && g2 != 17) {
                if (g2 != 27) {
                    if (g2 == 60 || g2 == 68) {
                        if (a(obj, d2, i6) && !a(obj, e2, a(i6))) {
                            return false;
                        }
                    } else if (g2 != 49) {
                        if (g2 != 50) {
                            continue;
                        } else {
                            audr audr = (audr) aufp.f(obj, i(e2));
                            if (!audr.isEmpty() && auds.a(b(i6)).c.s == aufx.MESSAGE) {
                                aueq aueq = null;
                                for (Object next : audr.values()) {
                                    if (aueq == null) {
                                        aueq = aueh.a.a((Class) next.getClass());
                                    }
                                    if (!aueq.e(next)) {
                                        return false;
                                    }
                                }
                                continue;
                            }
                        }
                    }
                }
                List list = (List) aufp.f(obj, i(e2));
                if (!list.isEmpty()) {
                    aueq a2 = a(i6);
                    for (int i9 = 0; i9 < list.size(); i9++) {
                        if (!a2.e(list.get(i9))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (a(obj, i6, i4, i2) && !a(obj, e2, a(i6))) {
                return false;
            }
        }
        return !this.h || aubt.a(obj).e();
    }

    private final void b(Object obj, int i2) {
        if (!this.j) {
            int f2 = f(i2);
            long j2 = (long) (1048575 & f2);
            aufp.a(obj, j2, (1 << (f2 >>> 20)) | aufp.a(obj, j2));
        }
    }

    private static final void c(Object obj, aubl aubl) {
        auff.a(obj).a(aubl);
    }

    private final void b(Object obj, int i2, int i3) {
        aufp.a(obj, (long) (f(i3) & 1048575), i2);
    }

    private final boolean c(Object obj, Object obj2, int i2) {
        return a(obj, i2) == a(obj2, i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.util.Map$Entry} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x04ff  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(java.lang.Object r18, defpackage.aubl r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.h
            if (r3 == 0) goto L_0x001f
            aubx r3 = defpackage.aubt.a((java.lang.Object) r18)
            boolean r5 = r3.a()
            if (r5 != 0) goto L_0x001f
            java.util.Iterator r3 = r3.d()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0021
        L_0x001f:
            r3 = 0
            r5 = 0
        L_0x0021:
            int[] r6 = r0.c
            int r6 = r6.length
            sun.misc.Unsafe r7 = b
            r8 = -1
            r10 = 0
            r11 = 0
        L_0x0029:
            if (r10 >= r6) goto L_0x04fb
            int r12 = r0.e((int) r10)
            int r13 = r0.d((int) r10)
            int r14 = g((int) r12)
            boolean r15 = r0.j
            if (r15 == 0) goto L_0x003d
            r4 = 0
            goto L_0x0064
        L_0x003d:
            r15 = 17
            if (r14 > r15) goto L_0x0061
            int[] r15 = r0.c
            int r16 = r10 + 2
            r15 = r15[r16]
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r15 & r16
            if (r9 == r8) goto L_0x0057
            r16 = r5
            long r4 = (long) r9
            int r11 = r7.getInt(r1, r4)
            r8 = r9
            goto L_0x0059
        L_0x0057:
            r16 = r5
        L_0x0059:
            int r4 = r15 >>> 20
            r5 = 1
            int r4 = r5 << r4
            r5 = r16
            goto L_0x0064
        L_0x0061:
            r16 = r5
            r4 = 0
        L_0x0064:
            if (r5 != 0) goto L_0x0067
            goto L_0x007f
        L_0x0067:
            int r9 = defpackage.aubt.a((java.util.Map.Entry) r5)
            if (r9 > r13) goto L_0x007f
            defpackage.aubt.a(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007d
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0064
        L_0x007d:
            r5 = 0
            goto L_0x0064
        L_0x007f:
            r15 = r5
            r9 = r6
            long r5 = i(r12)
            switch(r14) {
                case 0: goto L_0x04ea;
                case 1: goto L_0x04de;
                case 2: goto L_0x04d2;
                case 3: goto L_0x04c6;
                case 4: goto L_0x04ba;
                case 5: goto L_0x04ae;
                case 6: goto L_0x04a2;
                case 7: goto L_0x0496;
                case 8: goto L_0x048a;
                case 9: goto L_0x0479;
                case 10: goto L_0x046a;
                case 11: goto L_0x045d;
                case 12: goto L_0x0450;
                case 13: goto L_0x0443;
                case 14: goto L_0x0436;
                case 15: goto L_0x0429;
                case 16: goto L_0x041c;
                case 17: goto L_0x040b;
                case 18: goto L_0x03fb;
                case 19: goto L_0x03eb;
                case 20: goto L_0x03db;
                case 21: goto L_0x03cb;
                case 22: goto L_0x03bb;
                case 23: goto L_0x03ab;
                case 24: goto L_0x039b;
                case 25: goto L_0x038b;
                case 26: goto L_0x037b;
                case 27: goto L_0x0367;
                case 28: goto L_0x0357;
                case 29: goto L_0x0347;
                case 30: goto L_0x0337;
                case 31: goto L_0x0327;
                case 32: goto L_0x0317;
                case 33: goto L_0x0307;
                case 34: goto L_0x02f7;
                case 35: goto L_0x02e6;
                case 36: goto L_0x02d5;
                case 37: goto L_0x02c4;
                case 38: goto L_0x02b3;
                case 39: goto L_0x02a2;
                case 40: goto L_0x0291;
                case 41: goto L_0x0280;
                case 42: goto L_0x026f;
                case 43: goto L_0x025e;
                case 44: goto L_0x024d;
                case 45: goto L_0x023c;
                case 46: goto L_0x022b;
                case 47: goto L_0x021a;
                case 48: goto L_0x0209;
                case 49: goto L_0x01f5;
                case 50: goto L_0x01eb;
                case 51: goto L_0x01d8;
                case 52: goto L_0x01c5;
                case 53: goto L_0x01b2;
                case 54: goto L_0x019f;
                case 55: goto L_0x018c;
                case 56: goto L_0x0179;
                case 57: goto L_0x0166;
                case 58: goto L_0x0153;
                case 59: goto L_0x0140;
                case 60: goto L_0x0129;
                case 61: goto L_0x0114;
                case 62: goto L_0x0101;
                case 63: goto L_0x00ee;
                case 64: goto L_0x00db;
                case 65: goto L_0x00c8;
                case 66: goto L_0x00b5;
                case 67: goto L_0x00a2;
                case 68: goto L_0x008b;
                default: goto L_0x0088;
            }
        L_0x0088:
            r12 = 0
            goto L_0x04f5
        L_0x008b:
            boolean r4 = r0.a((java.lang.Object) r1, (int) r13, (int) r10)
            if (r4 == 0) goto L_0x009f
            java.lang.Object r4 = r7.getObject(r1, r5)
            aueq r5 = r0.a((int) r10)
            r2.b(r13, r4, r5)
            r12 = 0
            goto L_0x04f5
        L_0x009f:
            r12 = 0
            goto L_0x04f5
        L_0x00a2:
            boolean r4 = r0.a((java.lang.Object) r1, (int) r13, (int) r10)
            if (r4 == 0) goto L_0x00b2
            long r4 = e(r1, r5)
            r2.e((int) r13, (long) r4)
            r12 = 0
            goto L_0x04f5
        L_0x00b2:
            r12 = 0
            goto L_0x04f5
        L_0x00b5:
            boolean r4 = r0.a((java.lang.Object) r1, (int) r13, (int) r10)
            if (r4 == 0) goto L_0x00c5
            int r4 = d(r1, r5)
            r2.f(r13, r4)
            r12 = 0
            goto L_0x04f5
        L_0x00c5:
            r12 = 0
            goto L_0x04f5
        L_0x00c8:
            boolean r4 = r0.a((java.lang.Object) r1, (int) r13, (int) r10)
            if (r4 == 0) goto L_0x00d8
            long r4 = e(r1, r5)
            r2.b((int) r13, (long) r4)
            r12 = 0
            goto L_0x04f5
        L_0x00d8:
            r12 = 0
            goto L_0x04f5
        L_0x00db:
            boolean r4 = r0.a((java.lang.Object) r1, (int) r13, (int) r10)
            if (r4 == 0) goto L_0x00eb
            int r4 = d(r1, r5)
            r2.a((int) r13, (int) r4)
            r12 = 0
            goto L_0x04f5
        L_0x00eb:
            r12 = 0
            goto L_0x04f5
        L_0x00ee:
            boolean r4 = r0.a((java.lang.Object) r1, (int) r13, (int) r10)
            if (r4 == 0) goto L_0x00fe
            int r4 = d(r1, r5)
            r2.b((int) r13, (int) r4)
            r12 = 0
            goto L_0x04f5
        L_0x00fe:
            r12 = 0
            goto L_0x04f5
        L_0x0101:
            boolean r4 = r0.a((java.lang.Object) r1, (int) r13, (int) r10)
            if (r4 == 0) goto L_0x0111
            int r4 = d(r1, r5)
            r2.e((int) r13, (int) r4)
            r12 = 0
            goto L_0x04f5
        L_0x0111:
            r12 = 0
            goto L_0x04f5
        L_0x0114:
            boolean r4 = r0.a((java.lang.Object) r1, (int) r13, (int) r10)
            if (r4 == 0) goto L_0x0126
            java.lang.Object r4 = r7.getObject(r1, r5)
            auay r4 = (defpackage.auay) r4
            r2.a((int) r13, (defpackage.auay) r4)
            r12 = 0
            goto L_0x04f5
        L_0x0126:
            r12 = 0
            goto L_0x04f5
        L_0x0129:
            boolean r4 = r0.a((java.lang.Object) r1, (int) r13, (int) r10)
            if (r4 == 0) goto L_0x013d
            java.lang.Object r4 = r7.getObject(r1, r5)
            aueq r5 = r0.a((int) r10)
            r2.a(r13, r4, r5)
            r12 = 0
            goto L_0x04f5
        L_0x013d:
            r12 = 0
            goto L_0x04f5
        L_0x0140:
            boolean r4 = r0.a((java.lang.Object) r1, (int) r13, (int) r10)
            if (r4 == 0) goto L_0x0150
            java.lang.Object r4 = r7.getObject(r1, r5)
            a((int) r13, (java.lang.Object) r4, (defpackage.aubl) r2)
            r12 = 0
            goto L_0x04f5
        L_0x0150:
            r12 = 0
            goto L_0x04f5
        L_0x0153:
            boolean r4 = r0.a((java.lang.Object) r1, (int) r13, (int) r10)
            if (r4 == 0) goto L_0x0163
            boolean r4 = f(r1, r5)
            r2.a((int) r13, (boolean) r4)
            r12 = 0
            goto L_0x04f5
        L_0x0163:
            r12 = 0
            goto L_0x04f5
        L_0x0166:
            boolean r4 = r0.a((java.lang.Object) r1, (int) r13, (int) r10)
            if (r4 == 0) goto L_0x0176
            int r4 = d(r1, r5)
            r2.d((int) r13, (int) r4)
            r12 = 0
            goto L_0x04f5
        L_0x0176:
            r12 = 0
            goto L_0x04f5
        L_0x0179:
            boolean r4 = r0.a((java.lang.Object) r1, (int) r13, (int) r10)
            if (r4 == 0) goto L_0x0189
            long r4 = e(r1, r5)
            r2.d((int) r13, (long) r4)
            r12 = 0
            goto L_0x04f5
        L_0x0189:
            r12 = 0
            goto L_0x04f5
        L_0x018c:
            boolean r4 = r0.a((java.lang.Object) r1, (int) r13, (int) r10)
            if (r4 == 0) goto L_0x019c
            int r4 = d(r1, r5)
            r2.c((int) r13, (int) r4)
            r12 = 0
            goto L_0x04f5
        L_0x019c:
            r12 = 0
            goto L_0x04f5
        L_0x019f:
            boolean r4 = r0.a((java.lang.Object) r1, (int) r13, (int) r10)
            if (r4 == 0) goto L_0x01af
            long r4 = e(r1, r5)
            r2.c((int) r13, (long) r4)
            r12 = 0
            goto L_0x04f5
        L_0x01af:
            r12 = 0
            goto L_0x04f5
        L_0x01b2:
            boolean r4 = r0.a((java.lang.Object) r1, (int) r13, (int) r10)
            if (r4 == 0) goto L_0x01c2
            long r4 = e(r1, r5)
            r2.a((int) r13, (long) r4)
            r12 = 0
            goto L_0x04f5
        L_0x01c2:
            r12 = 0
            goto L_0x04f5
        L_0x01c5:
            boolean r4 = r0.a((java.lang.Object) r1, (int) r13, (int) r10)
            if (r4 == 0) goto L_0x01d5
            float r4 = c((java.lang.Object) r1, (long) r5)
            r2.a((int) r13, (float) r4)
            r12 = 0
            goto L_0x04f5
        L_0x01d5:
            r12 = 0
            goto L_0x04f5
        L_0x01d8:
            boolean r4 = r0.a((java.lang.Object) r1, (int) r13, (int) r10)
            if (r4 == 0) goto L_0x01e8
            double r4 = b((java.lang.Object) r1, (long) r5)
            r2.a((int) r13, (double) r4)
            r12 = 0
            goto L_0x04f5
        L_0x01e8:
            r12 = 0
            goto L_0x04f5
        L_0x01eb:
            java.lang.Object r4 = r7.getObject(r1, r5)
            r0.a((defpackage.aubl) r2, (int) r13, (java.lang.Object) r4, (int) r10)
            r12 = 0
            goto L_0x04f5
        L_0x01f5:
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            aueq r6 = r0.a((int) r10)
            defpackage.auer.b((int) r4, (java.util.List) r5, (defpackage.aubl) r2, (defpackage.aueq) r6)
            r12 = 0
            goto L_0x04f5
        L_0x0209:
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 1
            defpackage.auer.e(r4, r5, r2, r12)
            r12 = 0
            goto L_0x04f5
        L_0x021a:
            r12 = 1
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.auer.j(r4, r5, r2, r12)
            r12 = 0
            goto L_0x04f5
        L_0x022b:
            r12 = 1
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.auer.g(r4, r5, r2, r12)
            r12 = 0
            goto L_0x04f5
        L_0x023c:
            r12 = 1
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.auer.l(r4, r5, r2, r12)
            r12 = 0
            goto L_0x04f5
        L_0x024d:
            r12 = 1
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.auer.m(r4, r5, r2, r12)
            r12 = 0
            goto L_0x04f5
        L_0x025e:
            r12 = 1
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.auer.i(r4, r5, r2, r12)
            r12 = 0
            goto L_0x04f5
        L_0x026f:
            r12 = 1
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.auer.n(r4, r5, r2, r12)
            r12 = 0
            goto L_0x04f5
        L_0x0280:
            r12 = 1
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.auer.k(r4, r5, r2, r12)
            r12 = 0
            goto L_0x04f5
        L_0x0291:
            r12 = 1
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.auer.f(r4, r5, r2, r12)
            r12 = 0
            goto L_0x04f5
        L_0x02a2:
            r12 = 1
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.auer.h(r4, r5, r2, r12)
            r12 = 0
            goto L_0x04f5
        L_0x02b3:
            r12 = 1
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.auer.d(r4, r5, r2, r12)
            r12 = 0
            goto L_0x04f5
        L_0x02c4:
            r12 = 1
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.auer.c(r4, r5, r2, r12)
            r12 = 0
            goto L_0x04f5
        L_0x02d5:
            r12 = 1
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.auer.b((int) r4, (java.util.List) r5, (defpackage.aubl) r2, (boolean) r12)
            r12 = 0
            goto L_0x04f5
        L_0x02e6:
            r12 = 1
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.auer.a((int) r4, (java.util.List) r5, (defpackage.aubl) r2, (boolean) r12)
            r12 = 0
            goto L_0x04f5
        L_0x02f7:
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            defpackage.auer.e(r4, r5, r2, r12)
            goto L_0x04f5
        L_0x0307:
            r12 = 0
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.auer.j(r4, r5, r2, r12)
            goto L_0x04f5
        L_0x0317:
            r12 = 0
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.auer.g(r4, r5, r2, r12)
            goto L_0x04f5
        L_0x0327:
            r12 = 0
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.auer.l(r4, r5, r2, r12)
            goto L_0x04f5
        L_0x0337:
            r12 = 0
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.auer.m(r4, r5, r2, r12)
            goto L_0x04f5
        L_0x0347:
            r12 = 0
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.auer.i(r4, r5, r2, r12)
            goto L_0x04f5
        L_0x0357:
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.auer.b((int) r4, (java.util.List) r5, (defpackage.aubl) r2)
            r12 = 0
            goto L_0x04f5
        L_0x0367:
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            aueq r6 = r0.a((int) r10)
            defpackage.auer.a((int) r4, (java.util.List) r5, (defpackage.aubl) r2, (defpackage.aueq) r6)
            r12 = 0
            goto L_0x04f5
        L_0x037b:
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.auer.a((int) r4, (java.util.List) r5, (defpackage.aubl) r2)
            r12 = 0
            goto L_0x04f5
        L_0x038b:
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            defpackage.auer.n(r4, r5, r2, r12)
            goto L_0x04f5
        L_0x039b:
            r12 = 0
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.auer.k(r4, r5, r2, r12)
            goto L_0x04f5
        L_0x03ab:
            r12 = 0
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.auer.f(r4, r5, r2, r12)
            goto L_0x04f5
        L_0x03bb:
            r12 = 0
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.auer.h(r4, r5, r2, r12)
            goto L_0x04f5
        L_0x03cb:
            r12 = 0
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.auer.d(r4, r5, r2, r12)
            goto L_0x04f5
        L_0x03db:
            r12 = 0
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.auer.c(r4, r5, r2, r12)
            goto L_0x04f5
        L_0x03eb:
            r12 = 0
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.auer.b((int) r4, (java.util.List) r5, (defpackage.aubl) r2, (boolean) r12)
            goto L_0x04f5
        L_0x03fb:
            r12 = 0
            int r4 = r0.d((int) r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.auer.a((int) r4, (java.util.List) r5, (defpackage.aubl) r2, (boolean) r12)
            goto L_0x04f5
        L_0x040b:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            java.lang.Object r4 = r7.getObject(r1, r5)
            aueq r5 = r0.a((int) r10)
            r2.b(r13, r4, r5)
            goto L_0x04f5
        L_0x041c:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            long r4 = r7.getLong(r1, r5)
            r2.e((int) r13, (long) r4)
            goto L_0x04f5
        L_0x0429:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            int r4 = r7.getInt(r1, r5)
            r2.f(r13, r4)
            goto L_0x04f5
        L_0x0436:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            long r4 = r7.getLong(r1, r5)
            r2.b((int) r13, (long) r4)
            goto L_0x04f5
        L_0x0443:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            int r4 = r7.getInt(r1, r5)
            r2.a((int) r13, (int) r4)
            goto L_0x04f5
        L_0x0450:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            int r4 = r7.getInt(r1, r5)
            r2.b((int) r13, (int) r4)
            goto L_0x04f5
        L_0x045d:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            int r4 = r7.getInt(r1, r5)
            r2.e((int) r13, (int) r4)
            goto L_0x04f5
        L_0x046a:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            java.lang.Object r4 = r7.getObject(r1, r5)
            auay r4 = (defpackage.auay) r4
            r2.a((int) r13, (defpackage.auay) r4)
            goto L_0x04f5
        L_0x0479:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            java.lang.Object r4 = r7.getObject(r1, r5)
            aueq r5 = r0.a((int) r10)
            r2.a(r13, r4, r5)
            goto L_0x04f5
        L_0x048a:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            java.lang.Object r4 = r7.getObject(r1, r5)
            a((int) r13, (java.lang.Object) r4, (defpackage.aubl) r2)
            goto L_0x04f5
        L_0x0496:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            boolean r4 = defpackage.aufp.c(r1, r5)
            r2.a((int) r13, (boolean) r4)
            goto L_0x04f5
        L_0x04a2:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            int r4 = r7.getInt(r1, r5)
            r2.d((int) r13, (int) r4)
            goto L_0x04f5
        L_0x04ae:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            long r4 = r7.getLong(r1, r5)
            r2.d((int) r13, (long) r4)
            goto L_0x04f5
        L_0x04ba:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            int r4 = r7.getInt(r1, r5)
            r2.c((int) r13, (int) r4)
            goto L_0x04f5
        L_0x04c6:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            long r4 = r7.getLong(r1, r5)
            r2.c((int) r13, (long) r4)
            goto L_0x04f5
        L_0x04d2:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            long r4 = r7.getLong(r1, r5)
            r2.a((int) r13, (long) r4)
            goto L_0x04f5
        L_0x04de:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            float r4 = defpackage.aufp.d(r1, r5)
            r2.a((int) r13, (float) r4)
            goto L_0x04f5
        L_0x04ea:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            double r4 = defpackage.aufp.e(r1, r5)
            r2.a((int) r13, (double) r4)
        L_0x04f5:
            int r10 = r10 + 3
            r6 = r9
            r5 = r15
            goto L_0x0029
        L_0x04fb:
            r16 = r5
        L_0x04fd:
            if (r5 == 0) goto L_0x0512
            defpackage.aubt.a(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0510
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x04fd
        L_0x0510:
            r5 = 0
            goto L_0x04fd
        L_0x0512:
            c((java.lang.Object) r18, (defpackage.aubl) r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auea.b(java.lang.Object, aubl):void");
    }

    private final int a(Object obj, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, long j2, int i8, long j3, auah auah) {
        boolean z;
        int i9;
        int i10;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i11 = i2;
        int i12 = i3;
        int i13 = i4;
        int i14 = i6;
        int i15 = i7;
        long j4 = j3;
        auah auah2 = auah;
        aucx aucx = (aucx) b.getObject(obj2, j4);
        if (!aucx.a()) {
            int size = aucx.size();
            aucx = aucx.b(size != 0 ? size + size : 10);
            b.putObject(obj2, j4, aucx);
        }
        switch (i8) {
            case 18:
            case 35:
                if (i14 == 2) {
                    aubm aubm = (aubm) aucx;
                    int a2 = auai.a(bArr2, i11, auah2);
                    int i16 = auah2.a + a2;
                    while (a2 < i16) {
                        aubm.a(auai.c(bArr2, a2));
                        a2 += 8;
                    }
                    if (a2 == i16) {
                        return a2;
                    }
                    throw auda.a();
                } else if (i14 == 1) {
                    aubm aubm2 = (aubm) aucx;
                    aubm2.a(auai.c(bArr, i2));
                    int i17 = i11 + 8;
                    while (i17 < i12) {
                        int a3 = auai.a(bArr2, i17, auah2);
                        if (i13 != auah2.a) {
                            return i17;
                        }
                        aubm2.a(auai.c(bArr2, a3));
                        i17 = a3 + 8;
                    }
                    return i17;
                }
                break;
            case 19:
            case 36:
                if (i14 == 2) {
                    aubz aubz = (aubz) aucx;
                    int a4 = auai.a(bArr2, i11, auah2);
                    int i18 = auah2.a + a4;
                    while (a4 < i18) {
                        aubz.a(auai.d(bArr2, a4));
                        a4 += 4;
                    }
                    if (a4 == i18) {
                        return a4;
                    }
                    throw auda.a();
                } else if (i14 == 5) {
                    aubz aubz2 = (aubz) aucx;
                    aubz2.a(auai.d(bArr, i2));
                    int i19 = i11 + 4;
                    while (i19 < i12) {
                        int a5 = auai.a(bArr2, i19, auah2);
                        if (i13 != auah2.a) {
                            return i19;
                        }
                        aubz2.a(auai.d(bArr2, a5));
                        i19 = a5 + 4;
                    }
                    return i19;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    audl audl = (audl) aucx;
                    int a6 = auai.a(bArr2, i11, auah2);
                    int i20 = auah2.a + a6;
                    while (a6 < i20) {
                        a6 = auai.b(bArr2, a6, auah2);
                        audl.a(auah2.b);
                    }
                    if (a6 == i20) {
                        return a6;
                    }
                    throw auda.a();
                } else if (i14 == 0) {
                    audl audl2 = (audl) aucx;
                    int b2 = auai.b(bArr2, i11, auah2);
                    audl2.a(auah2.b);
                    while (b2 < i12) {
                        int a7 = auai.a(bArr2, b2, auah2);
                        if (i13 != auah2.a) {
                            return b2;
                        }
                        b2 = auai.b(bArr2, a7, auah2);
                        audl2.a(auah2.b);
                    }
                    return b2;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return auai.a(bArr2, i11, aucx, auah2);
                }
                if (i14 == 0) {
                    return auai.a(i4, bArr, i2, i3, aucx, auah);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    audl audl3 = (audl) aucx;
                    int a8 = auai.a(bArr2, i11, auah2);
                    int i21 = auah2.a + a8;
                    while (a8 < i21) {
                        audl3.a(auai.b(bArr2, a8));
                        a8 += 8;
                    }
                    if (a8 == i21) {
                        return a8;
                    }
                    throw auda.a();
                } else if (i14 == 1) {
                    audl audl4 = (audl) aucx;
                    audl4.a(auai.b(bArr, i2));
                    int i22 = i11 + 8;
                    while (i22 < i12) {
                        int a9 = auai.a(bArr2, i22, auah2);
                        if (i13 != auah2.a) {
                            return i22;
                        }
                        audl4.a(auai.b(bArr2, a9));
                        i22 = a9 + 8;
                    }
                    return i22;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    aucl aucl = (aucl) aucx;
                    int a10 = auai.a(bArr2, i11, auah2);
                    int i23 = auah2.a + a10;
                    while (a10 < i23) {
                        aucl.d(auai.a(bArr2, a10));
                        a10 += 4;
                    }
                    if (a10 == i23) {
                        return a10;
                    }
                    throw auda.a();
                } else if (i14 == 5) {
                    aucl aucl2 = (aucl) aucx;
                    aucl2.d(auai.a(bArr, i2));
                    int i24 = i11 + 4;
                    while (i24 < i12) {
                        int a11 = auai.a(bArr2, i24, auah2);
                        if (i13 != auah2.a) {
                            return i24;
                        }
                        aucl2.d(auai.a(bArr2, a11));
                        i24 = a11 + 4;
                    }
                    return i24;
                }
                break;
            case 25:
            case 42:
                if (i14 == 2) {
                    aual aual = (aual) aucx;
                    int a12 = auai.a(bArr2, i11, auah2);
                    int i25 = auah2.a + a12;
                    while (a12 < i25) {
                        a12 = auai.b(bArr2, a12, auah2);
                        aual.a(auah2.b != 0);
                    }
                    if (a12 == i25) {
                        return a12;
                    }
                    throw auda.a();
                } else if (i14 == 0) {
                    aual aual2 = (aual) aucx;
                    int b3 = auai.b(bArr2, i11, auah2);
                    if (auah2.b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aual2.a(z);
                    while (b3 < i12) {
                        int a13 = auai.a(bArr2, b3, auah2);
                        if (i13 != auah2.a) {
                            return b3;
                        }
                        b3 = auai.b(bArr2, a13, auah2);
                        aual2.a(auah2.b != 0);
                    }
                    return b3;
                }
                break;
            case 26:
                if (i14 == 2) {
                    if ((j2 & 536870912) != 0) {
                        int a14 = auai.a(bArr2, i11, auah2);
                        int i26 = auah2.a;
                        if (i26 >= 0) {
                            if (i26 == 0) {
                                aucx.add("");
                            } else {
                                int i27 = a14 + i26;
                                if (aufv.a(bArr2, a14, i27)) {
                                    aucx.add(new String(bArr2, a14, i26, aucy.a));
                                    a14 = i27;
                                } else {
                                    throw auda.i();
                                }
                            }
                            while (i11 < i12) {
                                int a15 = auai.a(bArr2, i11, auah2);
                                if (i13 != auah2.a) {
                                    break;
                                } else {
                                    i11 = auai.a(bArr2, a15, auah2);
                                    int i28 = auah2.a;
                                    if (i28 < 0) {
                                        throw auda.b();
                                    } else if (i28 == 0) {
                                        aucx.add("");
                                    } else {
                                        int i29 = i11 + i28;
                                        if (aufv.a(bArr2, i11, i29)) {
                                            aucx.add(new String(bArr2, i11, i28, aucy.a));
                                            i11 = i29;
                                        } else {
                                            throw auda.i();
                                        }
                                    }
                                }
                            }
                            break;
                        } else {
                            throw auda.b();
                        }
                    } else {
                        int a16 = auai.a(bArr2, i11, auah2);
                        int i30 = auah2.a;
                        if (i30 >= 0) {
                            if (i30 != 0) {
                                aucx.add(new String(bArr2, a16, i30, aucy.a));
                                a16 += i30;
                            } else {
                                aucx.add("");
                            }
                            while (i11 < i12) {
                                int a17 = auai.a(bArr2, i11, auah2);
                                if (i13 != auah2.a) {
                                    break;
                                } else {
                                    int i31 = auai.a(bArr2, a17, auah2);
                                    int i32 = auah2.a;
                                    if (i32 < 0) {
                                        throw auda.b();
                                    } else if (i32 != 0) {
                                        aucx.add(new String(bArr2, i31, i32, aucy.a));
                                        i31 += i32;
                                    } else {
                                        aucx.add("");
                                    }
                                }
                            }
                            break;
                        } else {
                            throw auda.b();
                        }
                    }
                }
                break;
            case 27:
                if (i14 == 2) {
                    return auai.a(a(i15), i4, bArr, i2, i3, aucx, auah);
                }
                break;
            case 28:
                if (i14 == 2) {
                    int a18 = auai.a(bArr2, i11, auah2);
                    int i33 = auah2.a;
                    if (i33 < 0) {
                        throw auda.b();
                    } else if (i33 <= bArr2.length - a18) {
                        if (i33 != 0) {
                            aucx.add(auay.a(bArr2, a18, i33));
                            a18 += i33;
                        } else {
                            aucx.add(auay.b);
                        }
                        while (i9 < i12) {
                            int a19 = auai.a(bArr2, i9, auah2);
                            if (i13 != auah2.a) {
                                return i9;
                            }
                            i9 = auai.a(bArr2, a19, auah2);
                            int i34 = auah2.a;
                            if (i34 < 0) {
                                throw auda.b();
                            } else if (i34 > bArr2.length - i9) {
                                throw auda.a();
                            } else if (i34 != 0) {
                                aucx.add(auay.a(bArr2, i9, i34));
                                i9 += i34;
                            } else {
                                aucx.add(auay.b);
                            }
                        }
                        return i9;
                    } else {
                        throw auda.a();
                    }
                }
                break;
            case 30:
            case 44:
                if (i14 == 2) {
                    i10 = auai.a(bArr2, i11, aucx, auah2);
                } else if (i14 == 0) {
                    i10 = auai.a(i4, bArr, i2, i3, aucx, auah);
                }
                aucj aucj = (aucj) obj2;
                aufg aufg = aucj.T;
                if (aufg == aufg.a) {
                    aufg = null;
                }
                aufg aufg2 = (aufg) auer.a(i5, (List) aucx, c(i15), (Object) aufg);
                if (aufg2 == null) {
                    return i10;
                }
                aucj.T = aufg2;
                return i10;
            case 33:
            case 47:
                if (i14 == 2) {
                    aucl aucl3 = (aucl) aucx;
                    int a20 = auai.a(bArr2, i11, auah2);
                    int i35 = auah2.a + a20;
                    while (a20 < i35) {
                        a20 = auai.a(bArr2, a20, auah2);
                        aucl3.d(aubc.g(auah2.a));
                    }
                    if (a20 == i35) {
                        return a20;
                    }
                    throw auda.a();
                } else if (i14 == 0) {
                    aucl aucl4 = (aucl) aucx;
                    int a21 = auai.a(bArr2, i11, auah2);
                    aucl4.d(aubc.g(auah2.a));
                    while (a21 < i12) {
                        int a22 = auai.a(bArr2, a21, auah2);
                        if (i13 != auah2.a) {
                            return a21;
                        }
                        a21 = auai.a(bArr2, a22, auah2);
                        aucl4.d(aubc.g(auah2.a));
                    }
                    return a21;
                }
                break;
            case 34:
            case 48:
                if (i14 == 2) {
                    audl audl5 = (audl) aucx;
                    int a23 = auai.a(bArr2, i11, auah2);
                    int i36 = auah2.a + a23;
                    while (a23 < i36) {
                        a23 = auai.b(bArr2, a23, auah2);
                        audl5.a(aubc.a(auah2.b));
                    }
                    if (a23 == i36) {
                        return a23;
                    }
                    throw auda.a();
                } else if (i14 == 0) {
                    audl audl6 = (audl) aucx;
                    int b4 = auai.b(bArr2, i11, auah2);
                    audl6.a(aubc.a(auah2.b));
                    while (b4 < i12) {
                        int a24 = auai.a(bArr2, b4, auah2);
                        if (i13 != auah2.a) {
                            return b4;
                        }
                        b4 = auai.b(bArr2, a24, auah2);
                        audl6.a(aubc.a(auah2.b));
                    }
                    return b4;
                }
                break;
            default:
                if (i14 == 3) {
                    aueq a25 = a(i15);
                    int i37 = (i13 & -8) | 4;
                    int a26 = auai.a(a25, bArr, i2, i3, i37, auah);
                    aucx.add(auah2.c);
                    while (a26 < i12) {
                        int a27 = auai.a(bArr2, a26, auah2);
                        if (i13 != auah2.a) {
                            return a26;
                        }
                        a26 = auai.a(a25, bArr, a27, i3, i37, auah);
                        aucx.add(auah2.c);
                    }
                    return a26;
                }
                break;
        }
        return i11;
    }

    private final void b(Object obj, Object obj2, int i2) {
        int e2 = e(i2);
        int d2 = d(i2);
        long i3 = i(e2);
        if (a(obj2, d2, i2)) {
            Object f2 = aufp.f(obj, i3);
            Object f3 = aufp.f(obj2, i3);
            if (f2 != null && f3 != null) {
                aufp.a(obj, i3, aucy.a(f2, f3));
                b(obj, d2, i2);
            } else if (f3 != null) {
                aufp.a(obj, i3, f3);
                b(obj, d2, i2);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(java.lang.Object r27, byte[] r28, int r29, int r30, defpackage.auah r31) {
        /*
            r26 = this;
            r15 = r26
            r14 = r27
            r12 = r28
            r13 = r30
            r11 = r31
            sun.misc.Unsafe r9 = b
            r10 = -1
            r16 = 0
            r0 = r29
            r1 = -1
            r2 = 0
        L_0x0013:
            if (r0 >= r13) goto L_0x0380
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0025
            int r0 = defpackage.auai.a((int) r0, (byte[]) r12, (int) r3, (defpackage.auah) r11)
            int r3 = r11.a
            r8 = r0
            r17 = r3
            goto L_0x0028
        L_0x0025:
            r17 = r0
            r8 = r3
        L_0x0028:
            int r7 = r17 >>> 3
            r6 = r17 & 7
            if (r7 <= r1) goto L_0x0036
            int r2 = r2 / 3
            int r0 = r15.a((int) r7, (int) r2)
            r4 = r0
            goto L_0x003b
        L_0x0036:
            int r0 = r15.j(r7)
            r4 = r0
        L_0x003b:
            if (r4 == r10) goto L_0x0357
            int[] r0 = r15.c
            int r1 = r4 + 1
            r5 = r0[r1]
            int r3 = g((int) r5)
            long r1 = i(r5)
            r0 = 17
            r10 = 2
            if (r3 > r0) goto L_0x020e
            r0 = 1
            switch(r3) {
                case 0: goto L_0x01f2;
                case 1: goto L_0x01d5;
                case 2: goto L_0x01b5;
                case 3: goto L_0x01b5;
                case 4: goto L_0x0199;
                case 5: goto L_0x0178;
                case 6: goto L_0x015b;
                case 7: goto L_0x0136;
                case 8: goto L_0x0110;
                case 9: goto L_0x00e0;
                case 10: goto L_0x00c4;
                case 11: goto L_0x0199;
                case 12: goto L_0x00a8;
                case 13: goto L_0x015b;
                case 14: goto L_0x0178;
                case 15: goto L_0x0088;
                case 16: goto L_0x005f;
                default: goto L_0x0054;
            }
        L_0x0054:
            r10 = r4
            r24 = r7
            r3 = r8
            r8 = r9
            r7 = r14
            r9 = r15
            r18 = -1
            goto L_0x0355
        L_0x005f:
            if (r6 != 0) goto L_0x007d
            int r6 = defpackage.auai.b(r12, r8, r11)
            r19 = r1
            long r0 = r11.b
            long r21 = defpackage.aubc.a((long) r0)
            r0 = r9
            r2 = r19
            r1 = r27
            r10 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            r0 = r6
            r1 = r7
            r2 = r10
            r10 = -1
            goto L_0x0013
        L_0x007d:
            r10 = r4
            r24 = r7
            r3 = r8
            r8 = r9
            r7 = r14
            r9 = r15
            r18 = -1
            goto L_0x0355
        L_0x0088:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x009e
            int r0 = defpackage.auai.a(r12, r8, r11)
            int r1 = r11.a
            int r1 = defpackage.aubc.g(r1)
            r9.putInt(r14, r2, r1)
            r1 = r7
            r2 = r10
            r10 = -1
            goto L_0x0013
        L_0x009e:
            r24 = r7
            r3 = r8
            r8 = r9
            r7 = r14
            r9 = r15
            r18 = -1
            goto L_0x0355
        L_0x00a8:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x00ba
            int r0 = defpackage.auai.a(r12, r8, r11)
            int r1 = r11.a
            r9.putInt(r14, r2, r1)
            r1 = r7
            r2 = r10
            r10 = -1
            goto L_0x0013
        L_0x00ba:
            r24 = r7
            r3 = r8
            r8 = r9
            r7 = r14
            r9 = r15
            r18 = -1
            goto L_0x0355
        L_0x00c4:
            r2 = r1
            if (r6 != r10) goto L_0x00d5
            int r0 = defpackage.auai.e(r12, r8, r11)
            java.lang.Object r1 = r11.c
            r9.putObject(r14, r2, r1)
            r2 = r4
            r1 = r7
            r10 = -1
            goto L_0x0013
        L_0x00d5:
            r10 = r4
            r24 = r7
            r3 = r8
            r8 = r9
            r7 = r14
            r9 = r15
            r18 = -1
            goto L_0x0355
        L_0x00e0:
            r2 = r1
            if (r6 != r10) goto L_0x0105
            aueq r0 = r15.a((int) r4)
            int r0 = defpackage.auai.a((defpackage.aueq) r0, (byte[]) r12, (int) r8, (int) r13, (defpackage.auah) r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x00f7
            java.lang.Object r1 = r11.c
            r9.putObject(r14, r2, r1)
            goto L_0x0100
        L_0x00f7:
            java.lang.Object r5 = r11.c
            java.lang.Object r1 = defpackage.aucy.a((java.lang.Object) r1, (java.lang.Object) r5)
            r9.putObject(r14, r2, r1)
        L_0x0100:
            r2 = r4
            r1 = r7
            r10 = -1
            goto L_0x0013
        L_0x0105:
            r10 = r4
            r24 = r7
            r3 = r8
            r8 = r9
            r7 = r14
            r9 = r15
            r18 = -1
            goto L_0x0355
        L_0x0110:
            r2 = r1
            if (r6 != r10) goto L_0x012b
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 == 0) goto L_0x011d
            int r0 = defpackage.auai.d(r12, r8, r11)
            goto L_0x0121
        L_0x011d:
            int r0 = defpackage.auai.c(r12, r8, r11)
        L_0x0121:
            java.lang.Object r1 = r11.c
            r9.putObject(r14, r2, r1)
            r2 = r4
            r1 = r7
            r10 = -1
            goto L_0x0013
        L_0x012b:
            r10 = r4
            r24 = r7
            r3 = r8
            r8 = r9
            r7 = r14
            r9 = r15
            r18 = -1
            goto L_0x0355
        L_0x0136:
            r2 = r1
            if (r6 != 0) goto L_0x0150
            int r1 = defpackage.auai.b(r12, r8, r11)
            long r5 = r11.b
            r19 = 0
            int r8 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r8 == 0) goto L_0x0146
            goto L_0x0147
        L_0x0146:
            r0 = 0
        L_0x0147:
            defpackage.aufp.a((java.lang.Object) r14, (long) r2, (boolean) r0)
            r0 = r1
            r2 = r4
            r1 = r7
            r10 = -1
            goto L_0x0013
        L_0x0150:
            r10 = r4
            r24 = r7
            r3 = r8
            r8 = r9
            r7 = r14
            r9 = r15
            r18 = -1
            goto L_0x0355
        L_0x015b:
            r2 = r1
            r0 = 5
            if (r6 != r0) goto L_0x016d
            int r0 = defpackage.auai.a(r12, r8)
            r9.putInt(r14, r2, r0)
            int r0 = r8 + 4
            r2 = r4
            r1 = r7
            r10 = -1
            goto L_0x0013
        L_0x016d:
            r10 = r4
            r24 = r7
            r3 = r8
            r8 = r9
            r7 = r14
            r9 = r15
            r18 = -1
            goto L_0x0355
        L_0x0178:
            r2 = r1
            if (r6 != r0) goto L_0x018e
            long r5 = defpackage.auai.b(r12, r8)
            r0 = r9
            r1 = r27
            r10 = r4
            r4 = r5
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            r1 = r7
            r2 = r10
            r10 = -1
            goto L_0x0013
        L_0x018e:
            r10 = r4
            r24 = r7
            r3 = r8
            r8 = r9
            r7 = r14
            r9 = r15
            r18 = -1
            goto L_0x0355
        L_0x0199:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x01ab
            int r0 = defpackage.auai.a(r12, r8, r11)
            int r1 = r11.a
            r9.putInt(r14, r2, r1)
            r1 = r7
            r2 = r10
            r10 = -1
            goto L_0x0013
        L_0x01ab:
            r24 = r7
            r3 = r8
            r8 = r9
            r7 = r14
            r9 = r15
            r18 = -1
            goto L_0x0355
        L_0x01b5:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x01cb
            int r6 = defpackage.auai.b(r12, r8, r11)
            long r4 = r11.b
            r0 = r9
            r1 = r27
            r0.putLong(r1, r2, r4)
            r0 = r6
            r1 = r7
            r2 = r10
            r10 = -1
            goto L_0x0013
        L_0x01cb:
            r24 = r7
            r3 = r8
            r8 = r9
            r7 = r14
            r9 = r15
            r18 = -1
            goto L_0x0355
        L_0x01d5:
            r2 = r1
            r10 = r4
            r0 = 5
            if (r6 != r0) goto L_0x01e8
            float r0 = defpackage.auai.d(r12, r8)
            defpackage.aufp.a((java.lang.Object) r14, (long) r2, (float) r0)
            int r0 = r8 + 4
            r1 = r7
            r2 = r10
            r10 = -1
            goto L_0x0013
        L_0x01e8:
            r24 = r7
            r3 = r8
            r8 = r9
            r7 = r14
            r9 = r15
            r18 = -1
            goto L_0x0355
        L_0x01f2:
            r2 = r1
            r10 = r4
            if (r6 != r0) goto L_0x0204
            double r0 = defpackage.auai.c(r12, r8)
            defpackage.aufp.a((java.lang.Object) r14, (long) r2, (double) r0)
            int r0 = r8 + 8
            r1 = r7
            r2 = r10
            r10 = -1
            goto L_0x0013
        L_0x0204:
            r24 = r7
            r3 = r8
            r8 = r9
            r7 = r14
            r9 = r15
            r18 = -1
            goto L_0x0355
        L_0x020e:
            r0 = 27
            if (r3 == r0) goto L_0x02f4
            r0 = 49
            if (r3 > r0) goto L_0x0263
            r19 = r9
            long r9 = (long) r5
            r0 = r26
            r20 = r1
            r1 = r27
            r2 = r28
            r5 = r3
            r3 = r8
            r29 = r4
            r4 = r30
            r22 = r5
            r5 = r17
            r23 = r6
            r6 = r7
            r24 = r7
            r7 = r23
            r15 = r8
            r8 = r29
            r25 = r19
            r18 = -1
            r11 = r22
            r12 = r20
            r14 = r31
            int r0 = r0.a((java.lang.Object) r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (defpackage.auah) r14)
            if (r0 == r15) goto L_0x0258
            r15 = r26
            r14 = r27
            r12 = r28
            r2 = r29
            r13 = r30
            r11 = r31
            r1 = r24
            r9 = r25
            r10 = -1
            goto L_0x0013
        L_0x0258:
            r9 = r26
            r7 = r27
            r10 = r29
            r2 = r0
            r8 = r25
            goto L_0x0361
        L_0x0263:
            r20 = r1
            r22 = r3
            r29 = r4
            r23 = r6
            r24 = r7
            r15 = r8
            r25 = r9
            r18 = -1
            r0 = 50
            r9 = r22
            if (r9 == r0) goto L_0x02b2
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r15
            r4 = r30
            r8 = r5
            r5 = r17
            r6 = r24
            r7 = r23
            r10 = r20
            r12 = r29
            r13 = r31
            int r0 = r0.a((java.lang.Object) r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (defpackage.auah) r13)
            if (r0 == r15) goto L_0x02a7
            r15 = r26
            r14 = r27
            r12 = r28
            r2 = r29
            r13 = r30
            r11 = r31
            r1 = r24
            r9 = r25
            r10 = -1
            goto L_0x0013
        L_0x02a7:
            r9 = r26
            r7 = r27
            r10 = r29
            r2 = r0
            r8 = r25
            goto L_0x0361
        L_0x02b2:
            r0 = r23
            if (r0 != r10) goto L_0x02e9
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r15
            r4 = r30
            r5 = r29
            r6 = r20
            r8 = r31
            int r0 = r0.a(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x02de
            r15 = r26
            r14 = r27
            r12 = r28
            r2 = r29
            r13 = r30
            r11 = r31
            r1 = r24
            r9 = r25
            r10 = -1
            goto L_0x0013
        L_0x02de:
            r9 = r26
            r7 = r27
            r10 = r29
            r2 = r0
            r8 = r25
            goto L_0x0361
        L_0x02e9:
            r9 = r26
            r7 = r27
            r10 = r29
            r3 = r15
            r8 = r25
            goto L_0x0355
        L_0x02f4:
            r20 = r1
            r29 = r4
            r0 = r6
            r24 = r7
            r15 = r8
            r25 = r9
            r18 = -1
            if (r0 != r10) goto L_0x034c
            r7 = r27
            r0 = r20
            r8 = r25
            java.lang.Object r2 = r8.getObject(r7, r0)
            aucx r2 = (defpackage.aucx) r2
            boolean r3 = r2.a()
            if (r3 != 0) goto L_0x0327
            int r3 = r2.size()
            if (r3 == 0) goto L_0x031c
            int r3 = r3 + r3
            goto L_0x031e
        L_0x031c:
            r3 = 10
        L_0x031e:
            aucx r2 = r2.b(r3)
            r8.putObject(r7, r0, r2)
            r5 = r2
            goto L_0x0328
        L_0x0327:
            r5 = r2
        L_0x0328:
            r9 = r26
            r10 = r29
            r3 = r15
            aueq r0 = r9.a((int) r10)
            r1 = r17
            r2 = r28
            r4 = r30
            r6 = r31
            int r0 = defpackage.auai.a(r0, r1, r2, r3, r4, r5, r6)
            r12 = r28
            r13 = r30
            r11 = r31
            r14 = r7
            r15 = r9
            r2 = r10
            r1 = r24
            r10 = -1
            r9 = r8
            goto L_0x0013
        L_0x034c:
            r9 = r26
            r7 = r27
            r10 = r29
            r3 = r15
            r8 = r25
        L_0x0355:
            r2 = r3
            goto L_0x0361
        L_0x0357:
            r24 = r7
            r3 = r8
            r8 = r9
            r7 = r14
            r9 = r15
            r18 = -1
            r2 = r3
            r10 = 0
        L_0x0361:
            aufg r4 = c((java.lang.Object) r27)
            r0 = r17
            r1 = r28
            r3 = r30
            r5 = r31
            int r0 = defpackage.auai.a((int) r0, (byte[]) r1, (int) r2, (int) r3, (defpackage.aufg) r4, (defpackage.auah) r5)
            r12 = r28
            r13 = r30
            r11 = r31
            r14 = r7
            r15 = r9
            r2 = r10
            r1 = r24
            r10 = -1
            r9 = r8
            goto L_0x0013
        L_0x0380:
            r9 = r15
            r1 = r30
            if (r0 != r1) goto L_0x0386
            return
        L_0x0386:
            auda r0 = defpackage.auda.h()
            goto L_0x038c
        L_0x038b:
            throw r0
        L_0x038c:
            goto L_0x038b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auea.b(java.lang.Object, byte[], int, int, auah):void");
    }

    private static boolean f(Object obj, long j2) {
        return ((Boolean) aufp.f(obj, j2)).booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v6, types: [int, byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int a(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, long r22, defpackage.auah r24) {
        /*
            r16 = this;
            r0 = r17
            r6 = r18
            r7 = r20
            r1 = r22
            r8 = r24
            sun.misc.Unsafe r3 = b
            r9 = r16
            r4 = r21
            java.lang.Object r4 = r9.b((int) r4)
            java.lang.Object r5 = r3.getObject(r0, r1)
            boolean r10 = defpackage.auds.b(r5)
            if (r10 == 0) goto L_0x0029
            java.lang.Object r10 = defpackage.auds.a()
            defpackage.auds.a(r10, r5)
            r3.putObject(r0, r1, r10)
            r5 = r10
        L_0x0029:
            audp r10 = defpackage.auds.a(r4)
            r11 = r5
            audr r11 = (defpackage.audr) r11
            r0 = r19
            int r0 = defpackage.auai.a(r6, r0, r8)
            int r1 = r8.a
            if (r1 < 0) goto L_0x00a1
            int r2 = r7 - r0
            if (r1 > r2) goto L_0x00a1
            int r12 = r0 + r1
            java.lang.Object r1 = r10.b
            java.lang.Object r2 = r10.d
            r13 = r1
            r14 = r2
        L_0x0046:
            if (r0 >= r12) goto L_0x0096
            int r1 = r0 + 1
            byte r0 = r6[r0]
            if (r0 >= 0) goto L_0x0058
            int r0 = defpackage.auai.a((int) r0, (byte[]) r6, (int) r1, (defpackage.auah) r8)
            int r1 = r8.a
            r15 = r1
            r1 = r0
            r0 = r15
            goto L_0x0059
        L_0x0058:
        L_0x0059:
            r2 = r0 & 7
            int r3 = r0 >>> 3
            r4 = 1
            if (r3 == r4) goto L_0x007d
            r4 = 2
            if (r3 == r4) goto L_0x0064
            goto L_0x0091
        L_0x0064:
            aufw r3 = r10.c
            int r4 = r3.t
            if (r2 != r4) goto L_0x0091
            java.lang.Object r0 = r10.d
            java.lang.Class r4 = r0.getClass()
            r0 = r18
            r2 = r20
            r5 = r24
            int r0 = a((byte[]) r0, (int) r1, (int) r2, (defpackage.aufw) r3, (java.lang.Class) r4, (defpackage.auah) r5)
            java.lang.Object r14 = r8.c
            goto L_0x0046
        L_0x007d:
            aufw r3 = r10.a
            int r4 = r3.t
            if (r2 != r4) goto L_0x0091
            r4 = 0
            r0 = r18
            r2 = r20
            r5 = r24
            int r0 = a((byte[]) r0, (int) r1, (int) r2, (defpackage.aufw) r3, (java.lang.Class) r4, (defpackage.auah) r5)
            java.lang.Object r13 = r8.c
            goto L_0x0046
        L_0x0091:
            int r0 = defpackage.auai.a((int) r0, (byte[]) r6, (int) r1, (int) r7, (defpackage.auah) r8)
            goto L_0x0046
        L_0x0096:
            if (r0 != r12) goto L_0x009c
            r11.put(r13, r14)
            return r12
        L_0x009c:
            auda r0 = defpackage.auda.h()
            throw r0
        L_0x00a1:
            auda r0 = defpackage.auda.a()
            goto L_0x00a7
        L_0x00a6:
            throw r0
        L_0x00a7:
            goto L_0x00a6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auea.a(java.lang.Object, byte[], int, int, int, long, auah):int");
    }

    private static final int a(byte[] bArr, int i2, int i3, aufw aufw, Class cls, auah auah) {
        aufw aufw2 = aufw.DOUBLE;
        switch (aufw.ordinal()) {
            case 0:
                auah.c = Double.valueOf(auai.c(bArr, i2));
                return i2 + 8;
            case 1:
                auah.c = Float.valueOf(auai.d(bArr, i2));
                return i2 + 4;
            case 2:
            case 3:
                int b2 = auai.b(bArr, i2, auah);
                auah.c = Long.valueOf(auah.b);
                return b2;
            case 4:
            case 12:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                int a2 = auai.a(bArr, i2, auah);
                auah.c = Integer.valueOf(auah.a);
                return a2;
            case 5:
            case Service.START_CONTINUATION_MASK:
                auah.c = Long.valueOf(auai.b(bArr, i2));
                return i2 + 8;
            case 6:
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                auah.c = Integer.valueOf(auai.a(bArr, i2));
                return i2 + 4;
            case 7:
                int b3 = auai.b(bArr, i2, auah);
                auah.c = Boolean.valueOf(auah.b != 0);
                return b3;
            case 8:
                return auai.d(bArr, i2, auah);
            case 10:
                return auai.a(aueh.a.a(cls), bArr, i2, i3, auah);
            case 11:
                return auai.e(bArr, i2, auah);
            case 16:
                int a3 = auai.a(bArr, i2, auah);
                auah.c = Integer.valueOf(aubc.g(auah.a));
                return a3;
            case 17:
                int b4 = auai.b(bArr, i2, auah);
                auah.c = Long.valueOf(aubc.a(auah.b));
                return b4;
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    static auea a(audu audu, aued aued, audk audk, auff auff, aubt aubt, auds auds) {
        if (audu instanceof auej) {
            return a((auej) audu, audk, auff, aubt, auds);
        }
        auez auez = (auez) audu;
        throw null;
    }

    public final int b(Object obj) {
        return !this.j ? f(obj) : g(obj);
    }

    public final void b(Object obj, Object obj2) {
        if (obj2 != null) {
            for (int i2 = 0; i2 < this.c.length; i2 += 3) {
                int e2 = e(i2);
                long i3 = i(e2);
                int d2 = d(i2);
                switch (g(e2)) {
                    case 0:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            aufp.a(obj, i3, aufp.e(obj2, i3));
                            b(obj, i2);
                            break;
                        }
                    case 1:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            aufp.a(obj, i3, aufp.d(obj2, i3));
                            b(obj, i2);
                            break;
                        }
                    case 2:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            aufp.a(obj, i3, aufp.b(obj2, i3));
                            b(obj, i2);
                            break;
                        }
                    case 3:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            aufp.a(obj, i3, aufp.b(obj2, i3));
                            b(obj, i2);
                            break;
                        }
                    case 4:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            aufp.a(obj, i3, aufp.a(obj2, i3));
                            b(obj, i2);
                            break;
                        }
                    case 5:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            aufp.a(obj, i3, aufp.b(obj2, i3));
                            b(obj, i2);
                            break;
                        }
                    case 6:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            aufp.a(obj, i3, aufp.a(obj2, i3));
                            b(obj, i2);
                            break;
                        }
                    case 7:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            aufp.a(obj, i3, aufp.c(obj2, i3));
                            b(obj, i2);
                            break;
                        }
                    case 8:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            aufp.a(obj, i3, aufp.f(obj2, i3));
                            b(obj, i2);
                            break;
                        }
                    case 9:
                        a(obj, obj2, i2);
                        break;
                    case 10:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            aufp.a(obj, i3, aufp.f(obj2, i3));
                            b(obj, i2);
                            break;
                        }
                    case 11:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            aufp.a(obj, i3, aufp.a(obj2, i3));
                            b(obj, i2);
                            break;
                        }
                    case 12:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            aufp.a(obj, i3, aufp.a(obj2, i3));
                            b(obj, i2);
                            break;
                        }
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            aufp.a(obj, i3, aufp.a(obj2, i3));
                            b(obj, i2);
                            break;
                        }
                    case UrlRequest.Status.READING_RESPONSE /*14*/:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            aufp.a(obj, i3, aufp.b(obj2, i3));
                            b(obj, i2);
                            break;
                        }
                    case Service.START_CONTINUATION_MASK:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            aufp.a(obj, i3, aufp.a(obj2, i3));
                            b(obj, i2);
                            break;
                        }
                    case 16:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            aufp.a(obj, i3, aufp.b(obj2, i3));
                            b(obj, i2);
                            break;
                        }
                    case 17:
                        a(obj, obj2, i2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.n.a(obj, obj2, i3);
                        break;
                    case 50:
                        auer.a(obj, obj2, i3);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!a(obj2, d2, i2)) {
                            break;
                        } else {
                            aufp.a(obj, i3, aufp.f(obj2, i3));
                            b(obj, d2, i2);
                            break;
                        }
                    case 60:
                        b(obj, obj2, i2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!a(obj2, d2, i2)) {
                            break;
                        } else {
                            aufp.a(obj, i3, aufp.f(obj2, i3));
                            b(obj, d2, i2);
                            break;
                        }
                    case 68:
                        b(obj, obj2, i2);
                        break;
                }
            }
            auer.c(obj, obj2);
            if (this.h) {
                auer.b(obj, obj2);
                return;
            }
            return;
        }
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: int[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0351  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static defpackage.auea a(defpackage.auej r36, defpackage.audk r37, defpackage.auff r38, defpackage.aubt r39, defpackage.auds r40) {
        /*
            r0 = r36
            int r1 = r36.c()
            r2 = 0
            r4 = 2
            if (r1 != r4) goto L_0x000c
            r11 = 1
            goto L_0x000d
        L_0x000c:
            r11 = 0
        L_0x000d:
            java.lang.String r1 = r0.b
            int r4 = r1.length()
            char r5 = r1.charAt(r2)
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r7) goto L_0x0034
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r8 = 1
            r9 = 13
        L_0x0021:
            int r10 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x0031
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r5 = r5 | r8
            int r9 = r9 + 13
            r8 = r10
            goto L_0x0021
        L_0x0031:
            int r8 = r8 << r9
            r5 = r5 | r8
            goto L_0x0035
        L_0x0034:
            r10 = 1
        L_0x0035:
            int r8 = r10 + 1
            char r9 = r1.charAt(r10)
            if (r9 < r7) goto L_0x0055
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0041:
            int r12 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x0051
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r10
            r9 = r9 | r8
            int r10 = r10 + 13
            r8 = r12
            goto L_0x0041
        L_0x0051:
            int r8 = r8 << r10
            r9 = r9 | r8
            r8 = r12
            goto L_0x0056
        L_0x0055:
        L_0x0056:
            if (r9 != 0) goto L_0x0063
            int[] r9 = a
            r12 = r9
            r6 = 0
            r9 = 0
            r10 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            goto L_0x018d
        L_0x0063:
            int r9 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x0083
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x006f:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r7) goto L_0x007f
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r8 = r8 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L_0x006f
        L_0x007f:
            int r9 = r9 << r10
            r8 = r8 | r9
            r9 = r12
            goto L_0x0084
        L_0x0083:
        L_0x0084:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r7) goto L_0x00a4
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x0090:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r7) goto L_0x00a0
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L_0x0090
        L_0x00a0:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
            goto L_0x00a5
        L_0x00a4:
        L_0x00a5:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r7) goto L_0x00c5
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00b1:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r7) goto L_0x00c1
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00b1
        L_0x00c1:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
            goto L_0x00c6
        L_0x00c5:
        L_0x00c6:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r7) goto L_0x00e6
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00d2:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r7) goto L_0x00e2
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00d2
        L_0x00e2:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
            goto L_0x00e7
        L_0x00e6:
        L_0x00e7:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r7) goto L_0x0109
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x00f3:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r7) goto L_0x0104
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x00f3
        L_0x0104:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
            goto L_0x010a
        L_0x0109:
        L_0x010a:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r7) goto L_0x012e
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0116:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x0128
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0116
        L_0x0128:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
            goto L_0x012f
        L_0x012e:
        L_0x012f:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x0155
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r2 = r16
            r16 = 13
        L_0x013d:
            int r17 = r2 + 1
            char r2 = r1.charAt(r2)
            if (r2 < r7) goto L_0x014f
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r16
            r15 = r15 | r2
            int r16 = r16 + 13
            r2 = r17
            goto L_0x013d
        L_0x014f:
            int r2 = r2 << r16
            r15 = r15 | r2
            r2 = r17
            goto L_0x0157
        L_0x0155:
            r2 = r16
        L_0x0157:
            int r16 = r2 + 1
            char r2 = r1.charAt(r2)
            if (r2 < r7) goto L_0x017d
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r6 = r16
            r16 = 13
        L_0x0165:
            int r18 = r6 + 1
            char r6 = r1.charAt(r6)
            if (r6 < r7) goto L_0x0177
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r16
            r2 = r2 | r6
            int r16 = r16 + 13
            r6 = r18
            goto L_0x0165
        L_0x0177:
            int r6 = r6 << r16
            r2 = r2 | r6
            r16 = r18
            goto L_0x017e
        L_0x017d:
        L_0x017e:
            int r6 = r2 + r14
            int r6 = r6 + r15
            int[] r6 = new int[r6]
            int r15 = r8 + r8
            int r15 = r15 + r9
            r9 = r12
            r12 = r6
            r6 = r14
            r14 = r2
            r2 = r8
            r8 = r16
        L_0x018d:
            sun.misc.Unsafe r3 = b
            java.lang.Object[] r7 = r0.c
            r19 = r8
            audx r8 = r0.a
            java.lang.Class r8 = r8.getClass()
            r20 = r15
            int r15 = r13 * 3
            int[] r15 = new int[r15]
            int r13 = r13 + r13
            java.lang.Object[] r13 = new java.lang.Object[r13]
            int r21 = r14 + r6
            r23 = r14
            r6 = r19
            r24 = r21
            r19 = 0
            r22 = 0
        L_0x01ae:
            if (r6 >= r4) goto L_0x0437
            int r25 = r6 + 1
            char r6 = r1.charAt(r6)
            r26 = r4
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r4) goto L_0x01e2
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r4 = r25
            r25 = 13
        L_0x01c3:
            int r27 = r4 + 1
            char r4 = r1.charAt(r4)
            r28 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r14) goto L_0x01dc
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r25
            r6 = r6 | r4
            int r25 = r25 + 13
            r4 = r27
            r14 = r28
            goto L_0x01c3
        L_0x01dc:
            int r4 = r4 << r25
            r6 = r6 | r4
            r4 = r27
            goto L_0x01e6
        L_0x01e2:
            r28 = r14
            r4 = r25
        L_0x01e6:
            int r14 = r4 + 1
            char r4 = r1.charAt(r4)
            r25 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r14) goto L_0x0218
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r14 = r25
            r25 = 13
        L_0x01f9:
            int r27 = r14 + 1
            char r14 = r1.charAt(r14)
            r29 = r11
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r11) goto L_0x0212
            r11 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r25
            r4 = r4 | r11
            int r25 = r25 + 13
            r14 = r27
            r11 = r29
            goto L_0x01f9
        L_0x0212:
            int r11 = r14 << r25
            r4 = r4 | r11
            r14 = r27
            goto L_0x021c
        L_0x0218:
            r29 = r11
            r14 = r25
        L_0x021c:
            r11 = r4 & 255(0xff, float:3.57E-43)
            r25 = r9
            r9 = r4 & 1024(0x400, float:1.435E-42)
            if (r9 != 0) goto L_0x0225
            goto L_0x022b
        L_0x0225:
            int r9 = r22 + 1
            r12[r22] = r19
            r22 = r9
        L_0x022b:
            r9 = 51
            if (r11 >= r9) goto L_0x0361
            int r9 = r20 + 1
            r20 = r7[r20]
            r27 = r10
            r10 = r20
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = a((java.lang.Class) r8, (java.lang.String) r10)
            r0 = 9
            if (r11 != r0) goto L_0x0246
            r32 = r4
            r4 = 1
            goto L_0x02b8
        L_0x0246:
            r0 = 17
            if (r11 == r0) goto L_0x02b5
            r0 = 27
            if (r11 != r0) goto L_0x0251
            r32 = r4
            goto L_0x02a5
        L_0x0251:
            r0 = 49
            if (r11 == r0) goto L_0x02a3
            r0 = 12
            if (r11 == r0) goto L_0x028d
            r0 = 30
            if (r11 == r0) goto L_0x028d
            r0 = 44
            if (r11 == r0) goto L_0x028d
            r0 = 50
            if (r11 != r0) goto L_0x028c
            int r0 = r23 + 1
            r12[r23] = r19
            int r23 = r19 / 3
            int r30 = r9 + 1
            int r23 = r23 + r23
            r9 = r7[r9]
            r13[r23] = r9
            r9 = r4 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x0284
            int r9 = r30 + 1
            int r23 = r23 + 1
            r30 = r7[r30]
            r13[r23] = r30
            r23 = r0
        L_0x0281:
            r32 = r4
            goto L_0x028a
        L_0x0284:
            r23 = r0
            r32 = r4
            r9 = r30
        L_0x028a:
            r4 = 1
            goto L_0x02c2
        L_0x028c:
            goto L_0x0281
        L_0x028d:
            r0 = r5 & 1
            r32 = r4
            r4 = 1
            if (r0 != r4) goto L_0x02a2
            int r0 = r19 / 3
            int r30 = r9 + 1
            int r0 = r0 + r0
            int r0 = r0 + r4
            r4 = r7[r9]
            r13[r0] = r4
            r9 = r30
        L_0x02a0:
            r4 = 1
            goto L_0x02c2
        L_0x02a2:
            goto L_0x02a0
        L_0x02a3:
            r32 = r4
        L_0x02a5:
            int r0 = r19 / 3
            int r4 = r9 + 1
            int r0 = r0 + r0
            r30 = r4
            r4 = 1
            int r0 = r0 + r4
            r9 = r7[r9]
            r13[r0] = r9
            r9 = r30
            goto L_0x02c2
        L_0x02b5:
            r32 = r4
            r4 = 1
        L_0x02b8:
            int r0 = r19 / 3
            int r0 = r0 + r0
            int r0 = r0 + r4
            java.lang.Class r16 = r10.getType()
            r13[r0] = r16
        L_0x02c2:
            r0 = r5
            long r4 = r3.objectFieldOffset(r10)
            int r5 = (int) r4
            r4 = r0 & 1
            r10 = 1
            if (r4 == r10) goto L_0x02d5
            r33 = r2
            r30 = r9
            r4 = r15
            r2 = 0
            r10 = 0
            goto L_0x0331
        L_0x02d5:
            r4 = 17
            if (r11 > r4) goto L_0x032a
            int r4 = r14 + 1
            char r10 = r1.charAt(r14)
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r10 < r14) goto L_0x0303
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r30 = 13
        L_0x02e8:
            int r31 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r14) goto L_0x02fd
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r30
            r10 = r10 | r4
            int r30 = r30 + 13
            r4 = r31
            r14 = 55296(0xd800, float:7.7486E-41)
            goto L_0x02e8
        L_0x02fd:
            int r4 = r4 << r30
            r10 = r10 | r4
            r14 = r31
            goto L_0x0304
        L_0x0303:
            r14 = r4
        L_0x0304:
            int r4 = r2 + r2
            int r30 = r10 / 32
            int r4 = r4 + r30
            r33 = r2
            r2 = r7[r4]
            r30 = r9
            boolean r9 = r2 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x0317
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            goto L_0x031f
        L_0x0317:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.reflect.Field r2 = a((java.lang.Class) r8, (java.lang.String) r2)
            r7[r4] = r2
        L_0x031f:
            r9 = r14
            r4 = r15
            long r14 = r3.objectFieldOffset(r2)
            int r2 = (int) r14
            int r10 = r10 % 32
            r14 = r9
            goto L_0x0331
        L_0x032a:
            r33 = r2
            r30 = r9
            r4 = r15
            r2 = 0
            r10 = 0
        L_0x0331:
            r9 = 18
            if (r11 >= r9) goto L_0x0336
            goto L_0x0351
        L_0x0336:
            r9 = 49
            if (r11 > r9) goto L_0x0350
            int r9 = r24 + 1
            r12[r24] = r5
            r24 = r9
            r20 = r30
            r15 = 1
            r34 = r14
            r14 = r0
            r0 = r34
            r35 = r5
            r5 = r1
            r1 = r10
            r10 = r35
            goto L_0x03f8
        L_0x0350:
        L_0x0351:
            r20 = r30
            r15 = 1
            r34 = r14
            r14 = r0
            r0 = r34
            r35 = r5
            r5 = r1
            r1 = r10
            r10 = r35
            goto L_0x03f8
        L_0x0361:
            r33 = r2
            r32 = r4
            r0 = r5
            r27 = r10
            r4 = r15
            int r2 = r14 + 1
            char r5 = r1.charAt(r14)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r5 >= r9) goto L_0x0378
            r14 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0392
        L_0x0378:
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x037c:
            int r10 = r2 + 1
            char r2 = r1.charAt(r2)
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r14) goto L_0x038f
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r9
            r5 = r5 | r2
            int r9 = r9 + 13
            r2 = r10
            goto L_0x037c
        L_0x038f:
            int r2 = r2 << r9
            r5 = r5 | r2
            r2 = r10
        L_0x0392:
            int r9 = r11 + -51
            r10 = 9
            if (r9 != r10) goto L_0x0399
            goto L_0x03b7
        L_0x0399:
            r10 = 17
            if (r9 == r10) goto L_0x03b7
            r10 = 12
            if (r9 != r10) goto L_0x03b4
            r9 = r0 & 1
            r10 = 1
            if (r9 != r10) goto L_0x03b4
            int r9 = r19 / 3
            int r15 = r20 + 1
            int r9 = r9 + r9
            int r9 = r9 + r10
            r10 = r7[r20]
            r13[r9] = r10
            r20 = r15
            r15 = 1
            goto L_0x03c4
        L_0x03b4:
            r15 = 1
            goto L_0x03c4
        L_0x03b7:
            int r9 = r19 / 3
            int r10 = r20 + 1
            int r9 = r9 + r9
            r15 = 1
            int r9 = r9 + r15
            r16 = r7[r20]
            r13[r9] = r16
            r20 = r10
        L_0x03c4:
            int r5 = r5 + r5
            r9 = r7[r5]
            boolean r10 = r9 instanceof java.lang.reflect.Field
            if (r10 == 0) goto L_0x03ce
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x03d6
        L_0x03ce:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = a((java.lang.Class) r8, (java.lang.String) r9)
            r7[r5] = r9
        L_0x03d6:
            long r9 = r3.objectFieldOffset(r9)
            int r10 = (int) r9
            int r5 = r5 + 1
            r9 = r7[r5]
            boolean r14 = r9 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x03e6
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x03ee
        L_0x03e6:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = a((java.lang.Class) r8, (java.lang.String) r9)
            r7[r5] = r9
        L_0x03ee:
            r14 = r0
            r5 = r1
            long r0 = r3.objectFieldOffset(r9)
            int r1 = (int) r0
            r0 = r2
            r2 = r1
            r1 = 0
        L_0x03f8:
            int r9 = r19 + 1
            r4[r19] = r6
            int r6 = r9 + 1
            r19 = r0
            r15 = r32
            r0 = r15 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0409
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x040a
        L_0x0409:
            r0 = 0
        L_0x040a:
            r15 = r15 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L_0x0411
            r15 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0412
        L_0x0411:
            r15 = 0
        L_0x0412:
            r0 = r0 | r15
            int r11 = r11 << 20
            r0 = r0 | r11
            r0 = r0 | r10
            r4[r9] = r0
            int r0 = r6 + 1
            int r1 = r1 << 20
            r1 = r1 | r2
            r4[r6] = r1
            r15 = r4
            r1 = r5
            r5 = r14
            r6 = r19
            r9 = r25
            r4 = r26
            r10 = r27
            r14 = r28
            r11 = r29
            r2 = r33
            r19 = r0
            r0 = r36
            goto L_0x01ae
        L_0x0437:
            r25 = r9
            r27 = r10
            r29 = r11
            r28 = r14
            r4 = r15
            auea r0 = new auea
            r1 = r36
            audx r10 = r1.a
            r5 = r0
            r6 = r4
            r7 = r13
            r8 = r27
            r13 = r28
            r14 = r21
            r15 = r37
            r16 = r38
            r17 = r39
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auea.a(auej, audk, auff, aubt, auds):auea");
    }

    private final aueq a(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        aueq aueq = (aueq) this.d[i4];
        if (aueq != null) {
            return aueq;
        }
        aueq a2 = aueh.a.a((Class) this.d[i4 + 1]);
        this.d[i4] = a2;
        return a2;
    }

    private final Object a(Object obj, int i2, Object obj2) {
        int d2 = d(i2);
        Object f2 = aufp.f(obj, i(e(i2)));
        if (f2 == null) {
            return obj2;
        }
        aucq c2 = c(i2);
        if (c2 != null) {
            audp a2 = auds.a(b(i2));
            Iterator it = ((audr) f2).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!c2.a(((Integer) entry.getValue()).intValue())) {
                    if (obj2 == null) {
                        obj2 = aufg.a();
                    }
                    auat d3 = auay.d(audq.a(a2, entry.getKey(), entry.getValue()));
                    try {
                        audq.a(d3.a, a2, entry.getKey(), entry.getValue());
                        ((aufg) obj2).a(aufy.a(d2, 2), (Object) d3.a());
                        it.remove();
                    } catch (IOException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
        }
        return obj2;
    }

    private static Field a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e2) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private static List a(Object obj, long j2) {
        return (List) aufp.f(obj, j2);
    }

    private static final void a(int i2, Object obj, aubl aubl) {
        if (obj instanceof String) {
            aubl.a(i2, (String) obj);
        } else {
            aubl.a(i2, (auay) obj);
        }
    }

    private final void a(aubl aubl, int i2, Object obj, int i3) {
        if (obj != null) {
            audp a2 = auds.a(b(i3));
            for (Map.Entry entry : ((audr) obj).entrySet()) {
                aubl.a.b(i2, 2);
                aubl.a.d(audq.a(a2, entry.getKey(), entry.getValue()));
                audq.a(aubl.a, a2, entry.getKey(), entry.getValue());
            }
        }
    }

    private final void a(Object obj, int i2, auek auek) {
        if (h(i2)) {
            aufp.a(obj, i(i2), (Object) auek.m());
        } else if (this.i) {
            aufp.a(obj, i(i2), (Object) auek.l());
        } else {
            aufp.a(obj, i(i2), (Object) auek.n());
        }
    }

    private final void a(Object obj, Object obj2, int i2) {
        long i3 = i(e(i2));
        if (a(obj2, i2)) {
            Object f2 = aufp.f(obj, i3);
            Object f3 = aufp.f(obj2, i3);
            if (f2 != null && f3 != null) {
                aufp.a(obj, i3, aucy.a(f2, f3));
                b(obj, i2);
            } else if (f3 != null) {
                aufp.a(obj, i3, f3);
                b(obj, i2);
            }
        }
    }

    private final boolean a(Object obj, int i2) {
        if (!this.j) {
            int f2 = f(i2);
            return (aufp.a(obj, (long) (1048575 & f2)) & (1 << (f2 >>> 20))) != 0;
        }
        int e2 = e(i2);
        long i3 = i(e2);
        switch (g(e2)) {
            case 0:
                return aufp.e(obj, i3) != 0.0d;
            case 1:
                return aufp.d(obj, i3) != 0.0f;
            case 2:
                return aufp.b(obj, i3) != 0;
            case 3:
                return aufp.b(obj, i3) != 0;
            case 4:
                return aufp.a(obj, i3) != 0;
            case 5:
                return aufp.b(obj, i3) != 0;
            case 6:
                return aufp.a(obj, i3) != 0;
            case 7:
                return aufp.c(obj, i3);
            case 8:
                Object f3 = aufp.f(obj, i3);
                if (f3 instanceof String) {
                    return !((String) f3).isEmpty();
                }
                if (f3 instanceof auay) {
                    return !auay.b.equals(f3);
                }
                throw new IllegalArgumentException();
            case 9:
                return aufp.f(obj, i3) != null;
            case 10:
                return !auay.b.equals(aufp.f(obj, i3));
            case 11:
                return aufp.a(obj, i3) != 0;
            case 12:
                return aufp.a(obj, i3) != 0;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return aufp.a(obj, i3) != 0;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return aufp.b(obj, i3) != 0;
            case Service.START_CONTINUATION_MASK:
                return aufp.a(obj, i3) != 0;
            case 16:
                return aufp.b(obj, i3) != 0;
            case 17:
                return aufp.f(obj, i3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean a(Object obj, int i2, int i3) {
        return aufp.a(obj, (long) (f(i3) & 1048575)) == i2;
    }

    private final boolean a(Object obj, int i2, int i3, int i4) {
        if (!this.j) {
            return (i3 & i4) != 0;
        }
        return a(obj, i2);
    }

    private static boolean a(Object obj, int i2, aueq aueq) {
        return aueq.e(aufp.f(obj, i(i2)));
    }

    public final int a(Object obj) {
        int length = this.c.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int e2 = e(i3);
            int d2 = d(i3);
            long i4 = i(e2);
            int i5 = 37;
            switch (g(e2)) {
                case 0:
                    i2 = (i2 * 53) + aucy.a(Double.doubleToLongBits(aufp.e(obj, i4)));
                    break;
                case 1:
                    i2 = (i2 * 53) + Float.floatToIntBits(aufp.d(obj, i4));
                    break;
                case 2:
                    i2 = (i2 * 53) + aucy.a(aufp.b(obj, i4));
                    break;
                case 3:
                    i2 = (i2 * 53) + aucy.a(aufp.b(obj, i4));
                    break;
                case 4:
                    i2 = (i2 * 53) + aufp.a(obj, i4);
                    break;
                case 5:
                    i2 = (i2 * 53) + aucy.a(aufp.b(obj, i4));
                    break;
                case 6:
                    i2 = (i2 * 53) + aufp.a(obj, i4);
                    break;
                case 7:
                    i2 = (i2 * 53) + aucy.a(aufp.c(obj, i4));
                    break;
                case 8:
                    i2 = (i2 * 53) + ((String) aufp.f(obj, i4)).hashCode();
                    break;
                case 9:
                    Object f2 = aufp.f(obj, i4);
                    if (f2 != null) {
                        i5 = f2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i2 = (i2 * 53) + aufp.f(obj, i4).hashCode();
                    break;
                case 11:
                    i2 = (i2 * 53) + aufp.a(obj, i4);
                    break;
                case 12:
                    i2 = (i2 * 53) + aufp.a(obj, i4);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    i2 = (i2 * 53) + aufp.a(obj, i4);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    i2 = (i2 * 53) + aucy.a(aufp.b(obj, i4));
                    break;
                case Service.START_CONTINUATION_MASK:
                    i2 = (i2 * 53) + aufp.a(obj, i4);
                    break;
                case 16:
                    i2 = (i2 * 53) + aucy.a(aufp.b(obj, i4));
                    break;
                case 17:
                    Object f3 = aufp.f(obj, i4);
                    if (f3 != null) {
                        i5 = f3.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = (i2 * 53) + aufp.f(obj, i4).hashCode();
                    break;
                case 50:
                    i2 = (i2 * 53) + aufp.f(obj, i4).hashCode();
                    break;
                case 51:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + aucy.a(Double.doubleToLongBits(b(obj, i4)));
                        break;
                    }
                case 52:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + Float.floatToIntBits(c(obj, i4));
                        break;
                    }
                case 53:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + aucy.a(e(obj, i4));
                        break;
                    }
                case 54:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + aucy.a(e(obj, i4));
                        break;
                    }
                case 55:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + d(obj, i4);
                        break;
                    }
                case 56:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + aucy.a(e(obj, i4));
                        break;
                    }
                case 57:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + d(obj, i4);
                        break;
                    }
                case 58:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + aucy.a(f(obj, i4));
                        break;
                    }
                case 59:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + ((String) aufp.f(obj, i4)).hashCode();
                        break;
                    }
                case 60:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + aufp.f(obj, i4).hashCode();
                        break;
                    }
                case 61:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + aufp.f(obj, i4).hashCode();
                        break;
                    }
                case 62:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + d(obj, i4);
                        break;
                    }
                case 63:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + d(obj, i4);
                        break;
                    }
                case 64:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + d(obj, i4);
                        break;
                    }
                case 65:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + aucy.a(e(obj, i4));
                        break;
                    }
                case 66:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + d(obj, i4);
                        break;
                    }
                case 67:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + aucy.a(e(obj, i4));
                        break;
                    }
                case 68:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + aufp.f(obj, i4).hashCode();
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + auff.a(obj).hashCode();
        return this.h ? (hashCode * 53) + aubt.a(obj).hashCode() : hashCode;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v44, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v45, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v47, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v49, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v52, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v53, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v55, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v58, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v61, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v67, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v69, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v71, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v74, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v76, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v81, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0305, code lost:
        r23 = r7;
        r2 = r8;
        r8 = r10;
        r7 = r14;
        r9 = r15;
        r26 = r25;
        r18 = true;
        r25 = r11;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, defpackage.auah r35) {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            sun.misc.Unsafe r10 = b
            r16 = 0
            r0 = r32
            r1 = 0
            r2 = -1
            r3 = 0
            r6 = 0
            r7 = -1
        L_0x0017:
            r17 = 0
            if (r0 >= r13) goto L_0x06a9
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002a
            int r0 = defpackage.auai.a((int) r0, (byte[]) r12, (int) r1, (defpackage.auah) r9)
            int r1 = r9.a
            r5 = r0
            r4 = r1
            goto L_0x002c
        L_0x002a:
            r4 = r0
            r5 = r1
        L_0x002c:
            int r1 = r4 >>> 3
            r0 = r4 & 7
            r8 = 3
            if (r1 <= r2) goto L_0x0039
            int r3 = r3 / r8
            int r2 = r15.a((int) r1, (int) r3)
            goto L_0x003d
        L_0x0039:
            int r2 = r15.j(r1)
        L_0x003d:
            r19 = 0
            r3 = -1
            if (r2 == r3) goto L_0x048b
            int[] r3 = r15.c
            int r22 = r2 + 1
            r3 = r3[r22]
            int r8 = g((int) r3)
            r23 = r4
            r24 = r5
            long r4 = i(r3)
            r25 = r1
            r1 = 17
            if (r8 > r1) goto L_0x0313
            int[] r1 = r15.c
            int r26 = r2 + 2
            r1 = r1[r26]
            int r26 = r1 >>> 20
            r22 = 1
            int r26 = r22 << r26
            r27 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r27
            if (r1 != r7) goto L_0x006e
            goto L_0x007c
        L_0x006e:
            r11 = -1
            if (r7 != r11) goto L_0x0072
            goto L_0x0076
        L_0x0072:
            long r11 = (long) r7
            r10.putInt(r14, r11, r6)
        L_0x0076:
            long r6 = (long) r1
            int r6 = r10.getInt(r14, r6)
            r7 = r1
        L_0x007c:
            r1 = 5
            switch(r8) {
                case 0: goto L_0x02c5;
                case 1: goto L_0x02a3;
                case 2: goto L_0x0277;
                case 3: goto L_0x0277;
                case 4: goto L_0x0254;
                case 5: goto L_0x022a;
                case 6: goto L_0x0207;
                case 7: goto L_0x01dd;
                case 8: goto L_0x01af;
                case 9: goto L_0x0178;
                case 10: goto L_0x0154;
                case 11: goto L_0x0254;
                case 12: goto L_0x010e;
                case 13: goto L_0x0207;
                case 14: goto L_0x022a;
                case 15: goto L_0x00e7;
                case 16: goto L_0x00ae;
                default: goto L_0x0080;
            }
        L_0x0080:
            r12 = r31
            r11 = r23
            r8 = r24
            r24 = r7
            r7 = r2
            r2 = 1
            r1 = 3
            if (r0 != r1) goto L_0x0304
            aueq r0 = r15.a((int) r7)
            int r1 = r25 << 3
            r17 = r1 | 4
            r1 = r31
            r2 = r8
            r3 = r33
            r12 = r4
            r4 = r17
            r5 = r35
            int r0 = defpackage.auai.a((defpackage.aueq) r0, (byte[]) r1, (int) r2, (int) r3, (int) r4, (defpackage.auah) r5)
            r1 = r6 & r26
            if (r1 != 0) goto L_0x02e7
            java.lang.Object r1 = r9.c
            r10.putObject(r14, r12, r1)
            goto L_0x02f4
        L_0x00ae:
            if (r0 != 0) goto L_0x00db
            r12 = r31
            r8 = r24
            int r8 = defpackage.auai.b(r12, r8, r9)
            long r0 = r9.b
            long r19 = defpackage.aubc.a((long) r0)
            r0 = r10
            r11 = r25
            r1 = r30
            r24 = r7
            r7 = r2
            r2 = r4
            r11 = r23
            r4 = r19
            r0.putLong(r1, r2, r4)
            r6 = r6 | r26
            r3 = r7
            r0 = r8
            r1 = r11
            r7 = r24
            r2 = r25
            r11 = r34
            goto L_0x0017
        L_0x00db:
            r12 = r31
            r11 = r23
            r8 = r24
            r24 = r7
            r7 = r2
            r2 = 1
            goto L_0x0305
        L_0x00e7:
            r12 = r31
            r11 = r23
            r8 = r24
            r24 = r7
            r7 = r2
            if (r0 != 0) goto L_0x010b
            int r0 = defpackage.auai.a(r12, r8, r9)
            int r1 = r9.a
            int r1 = defpackage.aubc.g(r1)
            r10.putInt(r14, r4, r1)
            r6 = r6 | r26
            r3 = r7
            r1 = r11
            r7 = r24
            r2 = r25
            r11 = r34
            goto L_0x0017
        L_0x010b:
            r2 = 1
            goto L_0x0305
        L_0x010e:
            r12 = r31
            r11 = r23
            r8 = r24
            r24 = r7
            r7 = r2
            if (r0 != 0) goto L_0x0151
            int r0 = defpackage.auai.a(r12, r8, r9)
            int r1 = r9.a
            aucq r2 = r15.c((int) r7)
            if (r2 == 0) goto L_0x0142
            boolean r2 = r2.a(r1)
            if (r2 == 0) goto L_0x012c
            goto L_0x0142
        L_0x012c:
            aufg r2 = c((java.lang.Object) r30)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.a((int) r11, (java.lang.Object) r1)
            r3 = r7
            r1 = r11
            r7 = r24
            r2 = r25
            r11 = r34
            goto L_0x0017
        L_0x0142:
            r10.putInt(r14, r4, r1)
            r6 = r6 | r26
            r3 = r7
            r1 = r11
            r7 = r24
            r2 = r25
            r11 = r34
            goto L_0x0017
        L_0x0151:
            r2 = 1
            goto L_0x0305
        L_0x0154:
            r12 = r31
            r11 = r23
            r8 = r24
            r24 = r7
            r7 = r2
            r1 = 2
            if (r0 != r1) goto L_0x0175
            int r0 = defpackage.auai.e(r12, r8, r9)
            java.lang.Object r1 = r9.c
            r10.putObject(r14, r4, r1)
            r6 = r6 | r26
            r3 = r7
            r1 = r11
            r7 = r24
            r2 = r25
            r11 = r34
            goto L_0x0017
        L_0x0175:
            r2 = 1
            goto L_0x0305
        L_0x0178:
            r12 = r31
            r11 = r23
            r8 = r24
            r1 = 2
            r24 = r7
            r7 = r2
            if (r0 != r1) goto L_0x01bb
            aueq r0 = r15.a((int) r7)
            int r0 = defpackage.auai.a((defpackage.aueq) r0, (byte[]) r12, (int) r8, (int) r13, (defpackage.auah) r9)
            r1 = r6 & r26
            if (r1 != 0) goto L_0x0196
            java.lang.Object r1 = r9.c
            r10.putObject(r14, r4, r1)
            goto L_0x01a3
        L_0x0196:
            java.lang.Object r1 = r10.getObject(r14, r4)
            java.lang.Object r2 = r9.c
            java.lang.Object r1 = defpackage.aucy.a((java.lang.Object) r1, (java.lang.Object) r2)
            r10.putObject(r14, r4, r1)
        L_0x01a3:
            r6 = r6 | r26
            r3 = r7
            r1 = r11
            r7 = r24
            r2 = r25
            r11 = r34
            goto L_0x0017
        L_0x01af:
            r12 = r31
            r11 = r23
            r8 = r24
            r24 = r7
            r7 = r2
            r1 = 2
            if (r0 == r1) goto L_0x01be
        L_0x01bb:
            r2 = 1
            goto L_0x0305
        L_0x01be:
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x01c8
            int r0 = defpackage.auai.d(r12, r8, r9)
            goto L_0x01cc
        L_0x01c8:
            int r0 = defpackage.auai.c(r12, r8, r9)
        L_0x01cc:
            java.lang.Object r1 = r9.c
            r10.putObject(r14, r4, r1)
            r6 = r6 | r26
            r3 = r7
            r1 = r11
            r7 = r24
            r2 = r25
            r11 = r34
            goto L_0x0017
        L_0x01dd:
            r12 = r31
            r11 = r23
            r8 = r24
            r24 = r7
            r7 = r2
            if (r0 != 0) goto L_0x0204
            int r0 = defpackage.auai.b(r12, r8, r9)
            long r1 = r9.b
            int r3 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r3 == 0) goto L_0x01f4
            r8 = 1
            goto L_0x01f5
        L_0x01f4:
            r8 = 0
        L_0x01f5:
            defpackage.aufp.a((java.lang.Object) r14, (long) r4, (boolean) r8)
            r6 = r6 | r26
            r3 = r7
            r1 = r11
            r7 = r24
            r2 = r25
            r11 = r34
            goto L_0x0017
        L_0x0204:
            r2 = 1
            goto L_0x0305
        L_0x0207:
            r12 = r31
            r11 = r23
            r8 = r24
            r24 = r7
            r7 = r2
            if (r0 != r1) goto L_0x0227
            int r0 = defpackage.auai.a(r12, r8)
            r10.putInt(r14, r4, r0)
            int r0 = r8 + 4
            r6 = r6 | r26
            r3 = r7
            r1 = r11
            r7 = r24
            r2 = r25
            r11 = r34
            goto L_0x0017
        L_0x0227:
            r2 = 1
            goto L_0x0305
        L_0x022a:
            r12 = r31
            r11 = r23
            r8 = r24
            r24 = r7
            r7 = r2
            r1 = 1
            if (r0 != r1) goto L_0x0251
            long r19 = defpackage.auai.b(r12, r8)
            r0 = r10
            r1 = r30
            r2 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            r6 = r6 | r26
            r3 = r7
            r1 = r11
            r7 = r24
            r2 = r25
            r11 = r34
            goto L_0x0017
        L_0x0251:
            r2 = 1
            goto L_0x0305
        L_0x0254:
            r12 = r31
            r11 = r23
            r8 = r24
            r24 = r7
            r7 = r2
            if (r0 != 0) goto L_0x0274
            int r0 = defpackage.auai.a(r12, r8, r9)
            int r1 = r9.a
            r10.putInt(r14, r4, r1)
            r6 = r6 | r26
            r3 = r7
            r1 = r11
            r7 = r24
            r2 = r25
            r11 = r34
            goto L_0x0017
        L_0x0274:
            r2 = 1
            goto L_0x0305
        L_0x0277:
            r12 = r31
            r11 = r23
            r8 = r24
            r24 = r7
            r7 = r2
            if (r0 != 0) goto L_0x02a0
            int r8 = defpackage.auai.b(r12, r8, r9)
            long r2 = r9.b
            r0 = r10
            r1 = r30
            r19 = r2
            r2 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
            r6 = r6 | r26
            r3 = r7
            r0 = r8
            r1 = r11
            r7 = r24
            r2 = r25
            r11 = r34
            goto L_0x0017
        L_0x02a0:
            r2 = 1
            goto L_0x0305
        L_0x02a3:
            r12 = r31
            r11 = r23
            r8 = r24
            r24 = r7
            r7 = r2
            if (r0 != r1) goto L_0x02c3
            float r0 = defpackage.auai.d(r12, r8)
            defpackage.aufp.a((java.lang.Object) r14, (long) r4, (float) r0)
            int r0 = r8 + 4
            r6 = r6 | r26
            r3 = r7
            r1 = r11
            r7 = r24
            r2 = r25
            r11 = r34
            goto L_0x0017
        L_0x02c3:
            r2 = 1
            goto L_0x0305
        L_0x02c5:
            r12 = r31
            r11 = r23
            r8 = r24
            r24 = r7
            r7 = r2
            r2 = 1
            if (r0 != r2) goto L_0x02e6
            double r0 = defpackage.auai.c(r12, r8)
            defpackage.aufp.a((java.lang.Object) r14, (long) r4, (double) r0)
            int r0 = r8 + 8
            r6 = r6 | r26
            r3 = r7
            r1 = r11
            r7 = r24
            r2 = r25
            r11 = r34
            goto L_0x0017
        L_0x02e6:
            goto L_0x0305
        L_0x02e7:
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r9.c
            java.lang.Object r1 = defpackage.aucy.a((java.lang.Object) r1, (java.lang.Object) r2)
            r10.putObject(r14, r12, r1)
        L_0x02f4:
            r6 = r6 | r26
            r12 = r31
            r13 = r33
            r3 = r7
            r1 = r11
            r7 = r24
            r2 = r25
            r11 = r34
            goto L_0x0017
        L_0x0304:
        L_0x0305:
            r23 = r7
            r2 = r8
            r8 = r10
            r7 = r14
            r9 = r15
            r26 = r25
            r18 = 1
            r25 = r11
            goto L_0x049c
        L_0x0313:
            r12 = r4
            r11 = r23
            r5 = r24
            r24 = r7
            r7 = r2
            r2 = 1
            r1 = 27
            if (r8 == r1) goto L_0x041e
            r1 = 49
            if (r8 > r1) goto L_0x037e
            long r3 = (long) r3
            r1 = r0
            r0 = r29
            r32 = r1
            r1 = r30
            r22 = 1
            r2 = r31
            r26 = r3
            r4 = 10
            r3 = r5
            r4 = r33
            r15 = r5
            r5 = r11
            r21 = r6
            r6 = r25
            r23 = r7
            r7 = r32
            r22 = r8
            r18 = 1
            r8 = r23
            r28 = r10
            r9 = r26
            r26 = r25
            r25 = r11
            r11 = r22
            r14 = r35
            int r0 = r0.a((java.lang.Object) r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (defpackage.auah) r14)
            if (r0 == r15) goto L_0x0373
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            r6 = r21
            r3 = r23
            r7 = r24
            r1 = r25
            r2 = r26
            r10 = r28
            goto L_0x0017
        L_0x0373:
            r9 = r29
            r7 = r30
            r2 = r0
            r6 = r21
            r8 = r28
            goto L_0x049c
        L_0x037e:
            r32 = r0
            r15 = r5
            r21 = r6
            r23 = r7
            r22 = r8
            r28 = r10
            r26 = r25
            r18 = 1
            r25 = r11
            r0 = 50
            r9 = r22
            if (r9 == r0) goto L_0x03d5
            r0 = r29
            r1 = r30
            r2 = r31
            r8 = r3
            r3 = r15
            r4 = r33
            r5 = r25
            r6 = r26
            r7 = r32
            r10 = r12
            r12 = r23
            r13 = r35
            int r0 = r0.a((java.lang.Object) r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (defpackage.auah) r13)
            if (r0 == r15) goto L_0x03ca
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            r6 = r21
            r3 = r23
            r7 = r24
            r1 = r25
            r2 = r26
            r10 = r28
            goto L_0x0017
        L_0x03ca:
            r9 = r29
            r7 = r30
            r2 = r0
            r6 = r21
            r8 = r28
            goto L_0x049c
        L_0x03d5:
            r0 = r32
            r1 = 2
            if (r0 == r1) goto L_0x03e5
            r9 = r29
            r7 = r30
            r3 = r15
            r10 = r23
            r8 = r28
            goto L_0x0485
        L_0x03e5:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r23
            r6 = r12
            r8 = r35
            int r0 = r0.a(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0413
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            r6 = r21
            r3 = r23
            r7 = r24
            r1 = r25
            r2 = r26
            r10 = r28
            goto L_0x0017
        L_0x0413:
            r9 = r29
            r7 = r30
            r2 = r0
            r6 = r21
            r8 = r28
            goto L_0x049c
        L_0x041e:
            r15 = r5
            r21 = r6
            r23 = r7
            r28 = r10
            r26 = r25
            r18 = 1
            r25 = r11
            r1 = 2
            if (r0 != r1) goto L_0x047c
            r7 = r30
            r8 = r28
            java.lang.Object r0 = r8.getObject(r7, r12)
            aucx r0 = (defpackage.aucx) r0
            boolean r1 = r0.a()
            if (r1 != 0) goto L_0x0452
            int r1 = r0.size()
            if (r1 == 0) goto L_0x0447
            int r3 = r1 + r1
            goto L_0x0449
        L_0x0447:
            r3 = 10
        L_0x0449:
            aucx r0 = r0.b(r3)
            r8.putObject(r7, r12, r0)
            r5 = r0
            goto L_0x0453
        L_0x0452:
            r5 = r0
        L_0x0453:
            r9 = r29
            r3 = r15
            r10 = r23
            aueq r0 = r9.a((int) r10)
            r1 = r25
            r2 = r31
            r4 = r33
            r6 = r35
            int r0 = defpackage.auai.a(r0, r1, r2, r3, r4, r5, r6)
            r12 = r31
            r13 = r33
            r11 = r34
            r14 = r7
            r15 = r9
            r3 = r10
            r6 = r21
            r7 = r24
            r2 = r26
            r9 = r35
            r10 = r8
            goto L_0x0017
        L_0x047c:
            r9 = r29
            r7 = r30
            r3 = r15
            r10 = r23
            r8 = r28
        L_0x0485:
            r2 = r3
            r23 = r10
            r6 = r21
            goto L_0x049c
        L_0x048b:
            r26 = r1
            r25 = r4
            r3 = r5
            r21 = r6
            r24 = r7
            r8 = r10
            r7 = r14
            r9 = r15
            r18 = 1
            r2 = r3
            r23 = 0
        L_0x049c:
            r10 = r34
            r11 = r25
            if (r11 == r10) goto L_0x04a3
            goto L_0x04ae
        L_0x04a3:
            if (r10 == 0) goto L_0x04ae
            r0 = r2
            r2 = r6
            r1 = r11
            r3 = r24
            r6 = r33
            goto L_0x06b6
        L_0x04ae:
            boolean r0 = r9.h
            if (r0 != 0) goto L_0x04be
            r13 = r31
            r12 = r35
            r32 = r6
            r25 = r26
            r6 = r33
            goto L_0x0688
        L_0x04be:
            r12 = r35
            aubs r0 = r12.d
            aubs r1 = defpackage.aubs.b()
            if (r0 == r1) goto L_0x0680
            audx r0 = r9.g
            aubs r1 = r12.d
            r13 = r26
            auci r14 = r1.a(r0, r13)
            if (r14 != 0) goto L_0x04ed
            aufg r4 = c((java.lang.Object) r30)
            r0 = r11
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = defpackage.auai.a((int) r0, (byte[]) r1, (int) r2, (int) r3, (defpackage.aufg) r4, (defpackage.auah) r5)
            r32 = r6
            r25 = r13
            r13 = r31
            r6 = r33
            goto L_0x0697
        L_0x04ed:
            r0 = r7
            aucg r0 = (defpackage.aucg) r0
            r0.c()
            aubx r15 = r0.m
            aufw r0 = r14.b()
            aufw r1 = defpackage.aufw.ENUM
            if (r0 == r1) goto L_0x067a
            aufw r0 = r14.b()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0642;
                case 1: goto L_0x062d;
                case 2: goto L_0x0618;
                case 3: goto L_0x0618;
                case 4: goto L_0x0603;
                case 5: goto L_0x05ee;
                case 6: goto L_0x05d8;
                case 7: goto L_0x05bb;
                case 8: goto L_0x05ab;
                case 9: goto L_0x0581;
                case 10: goto L_0x0563;
                case 11: goto L_0x0552;
                case 12: goto L_0x0603;
                case 13: goto L_0x054a;
                case 14: goto L_0x05d8;
                case 15: goto L_0x05ee;
                case 16: goto L_0x052f;
                case 17: goto L_0x0514;
                default: goto L_0x0508;
            }
        L_0x0508:
            r32 = r6
            r25 = r13
            r13 = r31
            r6 = r33
            r0 = r17
            goto L_0x0656
        L_0x0514:
            r5 = r31
            int r2 = defpackage.auai.b(r5, r2, r12)
            long r0 = r12.b
            long r0 = defpackage.aubc.a((long) r0)
            java.lang.Long r17 = java.lang.Long.valueOf(r0)
            r32 = r6
            r25 = r13
            r0 = r17
            r6 = r33
            r13 = r5
            goto L_0x0656
        L_0x052f:
            r5 = r31
            int r2 = defpackage.auai.a(r5, r2, r12)
            int r0 = r12.a
            int r0 = defpackage.aubc.g(r0)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            r32 = r6
            r25 = r13
            r0 = r17
            r6 = r33
            r13 = r5
            goto L_0x0656
        L_0x054a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Shouldn't reach here."
            r0.<init>(r1)
            throw r0
        L_0x0552:
            r5 = r31
            int r2 = defpackage.auai.e(r5, r2, r12)
            java.lang.Object r0 = r12.c
            r32 = r6
            r25 = r13
            r6 = r33
            r13 = r5
            goto L_0x0656
        L_0x0563:
            r5 = r31
            aueh r0 = defpackage.aueh.a
            audx r1 = r14.c
            java.lang.Class r1 = r1.getClass()
            aueq r0 = r0.a((java.lang.Class) r1)
            r4 = r33
            int r2 = defpackage.auai.a((defpackage.aueq) r0, (byte[]) r5, (int) r2, (int) r4, (defpackage.auah) r12)
            java.lang.Object r0 = r12.c
            r32 = r6
            r25 = r13
            r6 = r4
            r13 = r5
            goto L_0x0656
        L_0x0581:
            r5 = r31
            r4 = r33
            aueh r0 = defpackage.aueh.a
            audx r1 = r14.c
            java.lang.Class r1 = r1.getClass()
            aueq r0 = r0.a((java.lang.Class) r1)
            int r1 = r13 << 3
            r17 = r1 | 4
            r1 = r31
            r3 = r33
            r32 = r6
            r6 = r4
            r4 = r17
            r25 = r13
            r13 = r5
            r5 = r35
            int r2 = defpackage.auai.a((defpackage.aueq) r0, (byte[]) r1, (int) r2, (int) r3, (int) r4, (defpackage.auah) r5)
            java.lang.Object r0 = r12.c
            goto L_0x0656
        L_0x05ab:
            r32 = r6
            r25 = r13
            r13 = r31
            r6 = r33
            int r2 = defpackage.auai.c(r13, r2, r12)
            java.lang.Object r0 = r12.c
            goto L_0x0656
        L_0x05bb:
            r32 = r6
            r25 = r13
            r13 = r31
            r6 = r33
            int r2 = defpackage.auai.b(r13, r2, r12)
            long r0 = r12.b
            int r3 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r3 == 0) goto L_0x05ce
            goto L_0x05d0
        L_0x05ce:
            r18 = 0
        L_0x05d0:
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r18)
            r0 = r17
            goto L_0x0656
        L_0x05d8:
            r32 = r6
            r25 = r13
            r13 = r31
            r6 = r33
            int r0 = defpackage.auai.a(r13, r2)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            int r2 = r2 + 4
            r0 = r17
            goto L_0x0656
        L_0x05ee:
            r32 = r6
            r25 = r13
            r13 = r31
            r6 = r33
            long r0 = defpackage.auai.b(r13, r2)
            java.lang.Long r17 = java.lang.Long.valueOf(r0)
            int r2 = r2 + 8
            r0 = r17
            goto L_0x0656
        L_0x0603:
            r32 = r6
            r25 = r13
            r13 = r31
            r6 = r33
            int r2 = defpackage.auai.a(r13, r2, r12)
            int r0 = r12.a
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            r0 = r17
            goto L_0x0656
        L_0x0618:
            r32 = r6
            r25 = r13
            r13 = r31
            r6 = r33
            int r2 = defpackage.auai.b(r13, r2, r12)
            long r0 = r12.b
            java.lang.Long r17 = java.lang.Long.valueOf(r0)
            r0 = r17
            goto L_0x0656
        L_0x062d:
            r32 = r6
            r25 = r13
            r13 = r31
            r6 = r33
            float r0 = defpackage.auai.d(r13, r2)
            java.lang.Float r17 = java.lang.Float.valueOf(r0)
            int r2 = r2 + 4
            r0 = r17
            goto L_0x0656
        L_0x0642:
            r32 = r6
            r25 = r13
            r13 = r31
            r6 = r33
            double r0 = defpackage.auai.c(r13, r2)
            java.lang.Double r17 = java.lang.Double.valueOf(r0)
            int r2 = r2 + 8
            r0 = r17
        L_0x0656:
            aufw r1 = r14.b()
            int r1 = r1.ordinal()
            r3 = 9
            if (r1 == r3) goto L_0x0667
            r3 = 10
            if (r1 == r3) goto L_0x0667
            goto L_0x0673
        L_0x0667:
            auch r1 = r14.d
            java.lang.Object r1 = r15.b((defpackage.auch) r1)
            if (r1 == 0) goto L_0x0673
            java.lang.Object r0 = defpackage.aucy.a((java.lang.Object) r1, (java.lang.Object) r0)
        L_0x0673:
            auch r1 = r14.d
            r15.a(r1, r0)
            r0 = r2
            goto L_0x0697
        L_0x067a:
            r13 = r31
            defpackage.auai.a(r13, r2, r12)
            throw r17
        L_0x0680:
            r13 = r31
            r32 = r6
            r25 = r26
            r6 = r33
        L_0x0688:
            aufg r4 = c((java.lang.Object) r30)
            r0 = r11
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = defpackage.auai.a((int) r0, (byte[]) r1, (int) r2, (int) r3, (defpackage.aufg) r4, (defpackage.auah) r5)
        L_0x0697:
            r14 = r7
            r15 = r9
            r1 = r11
            r9 = r12
            r12 = r13
            r3 = r23
            r7 = r24
            r2 = r25
            r13 = r6
            r11 = r10
            r6 = r32
            r10 = r8
            goto L_0x0017
        L_0x06a9:
            r21 = r6
            r24 = r7
            r8 = r10
            r10 = r11
            r6 = r13
            r7 = r14
            r9 = r15
            r2 = r21
            r3 = r24
        L_0x06b6:
            r4 = -1
            if (r3 != r4) goto L_0x06ba
            goto L_0x06be
        L_0x06ba:
            long r3 = (long) r3
            r8.putInt(r7, r3, r2)
        L_0x06be:
            int r2 = r9.l
            r3 = r17
        L_0x06c2:
            int r4 = r9.m
            if (r2 >= r4) goto L_0x06d3
            int[] r4 = r9.k
            r4 = r4[r2]
            java.lang.Object r3 = r9.a((java.lang.Object) r7, (int) r4, (java.lang.Object) r3)
            aufg r3 = (defpackage.aufg) r3
            int r2 = r2 + 1
            goto L_0x06c2
        L_0x06d3:
            if (r3 == 0) goto L_0x06d8
            defpackage.auff.a((java.lang.Object) r7, (defpackage.aufg) r3)
        L_0x06d8:
            if (r10 == 0) goto L_0x06e4
            if (r0 > r6) goto L_0x06df
            if (r1 != r10) goto L_0x06df
            goto L_0x06e6
        L_0x06df:
            auda r0 = defpackage.auda.h()
            throw r0
        L_0x06e4:
            if (r0 != r6) goto L_0x06e7
        L_0x06e6:
            return r0
        L_0x06e7:
            auda r0 = defpackage.auda.h()
            goto L_0x06ed
        L_0x06ec:
            throw r0
        L_0x06ed:
            goto L_0x06ec
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auea.a(java.lang.Object, byte[], int, int, int, auah):int");
    }

    public final Object a() {
        return ((aucj) this.g).c(4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0588  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Object r13, defpackage.aubl r14) {
        /*
            r12 = this;
            boolean r0 = r12.j
            if (r0 == 0) goto L_0x059e
            boolean r0 = r12.h
            r1 = 0
            if (r0 == 0) goto L_0x001e
            aubx r0 = defpackage.aubt.a((java.lang.Object) r13)
            boolean r2 = r0.a()
            if (r2 != 0) goto L_0x001e
            java.util.Iterator r0 = r0.d()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0020
        L_0x001e:
            r0 = r1
            r2 = r0
        L_0x0020:
            int[] r3 = r12.c
            int r3 = r3.length
            r4 = 0
            r5 = 0
        L_0x0025:
            if (r5 >= r3) goto L_0x0585
            int r6 = r12.e((int) r5)
            int r7 = r12.d((int) r5)
        L_0x002f:
            if (r2 != 0) goto L_0x0032
            goto L_0x004a
        L_0x0032:
            int r8 = defpackage.aubt.a((java.util.Map.Entry) r2)
            if (r8 > r7) goto L_0x004a
            defpackage.aubt.a(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0048
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x002f
        L_0x0048:
            r2 = r1
            goto L_0x002f
        L_0x004a:
            int r8 = g((int) r6)
            r9 = 1
            switch(r8) {
                case 0: goto L_0x0570;
                case 1: goto L_0x055e;
                case 2: goto L_0x054c;
                case 3: goto L_0x053a;
                case 4: goto L_0x0528;
                case 5: goto L_0x0516;
                case 6: goto L_0x0504;
                case 7: goto L_0x04f1;
                case 8: goto L_0x04de;
                case 9: goto L_0x04c7;
                case 10: goto L_0x04b2;
                case 11: goto L_0x049f;
                case 12: goto L_0x048c;
                case 13: goto L_0x0479;
                case 14: goto L_0x0466;
                case 15: goto L_0x0453;
                case 16: goto L_0x0440;
                case 17: goto L_0x0429;
                case 18: goto L_0x0416;
                case 19: goto L_0x0403;
                case 20: goto L_0x03f0;
                case 21: goto L_0x03dd;
                case 22: goto L_0x03ca;
                case 23: goto L_0x03b7;
                case 24: goto L_0x03a4;
                case 25: goto L_0x0391;
                case 26: goto L_0x037e;
                case 27: goto L_0x0367;
                case 28: goto L_0x0354;
                case 29: goto L_0x0341;
                case 30: goto L_0x032e;
                case 31: goto L_0x031b;
                case 32: goto L_0x0308;
                case 33: goto L_0x02f5;
                case 34: goto L_0x02e2;
                case 35: goto L_0x02cf;
                case 36: goto L_0x02bc;
                case 37: goto L_0x02a9;
                case 38: goto L_0x0296;
                case 39: goto L_0x0283;
                case 40: goto L_0x0270;
                case 41: goto L_0x025d;
                case 42: goto L_0x024a;
                case 43: goto L_0x0237;
                case 44: goto L_0x0224;
                case 45: goto L_0x0211;
                case 46: goto L_0x01fe;
                case 47: goto L_0x01eb;
                case 48: goto L_0x01d8;
                case 49: goto L_0x01c1;
                case 50: goto L_0x01b4;
                case 51: goto L_0x01a1;
                case 52: goto L_0x018e;
                case 53: goto L_0x017b;
                case 54: goto L_0x0168;
                case 55: goto L_0x0155;
                case 56: goto L_0x0142;
                case 57: goto L_0x012f;
                case 58: goto L_0x011c;
                case 59: goto L_0x0109;
                case 60: goto L_0x00f2;
                case 61: goto L_0x00dd;
                case 62: goto L_0x00ca;
                case 63: goto L_0x00b7;
                case 64: goto L_0x00a4;
                case 65: goto L_0x0091;
                case 66: goto L_0x007e;
                case 67: goto L_0x006b;
                case 68: goto L_0x0054;
                default: goto L_0x0052;
            }
        L_0x0052:
            goto L_0x0581
        L_0x0054:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r8)
            aueq r8 = r12.a((int) r5)
            r14.b(r7, r6, r8)
            goto L_0x0581
        L_0x006b:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            long r8 = e(r13, r8)
            r14.e((int) r7, (long) r8)
            goto L_0x0581
        L_0x007e:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            int r6 = d(r13, r8)
            r14.f(r7, r6)
            goto L_0x0581
        L_0x0091:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            long r8 = e(r13, r8)
            r14.b((int) r7, (long) r8)
            goto L_0x0581
        L_0x00a4:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            int r6 = d(r13, r8)
            r14.a((int) r7, (int) r6)
            goto L_0x0581
        L_0x00b7:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            int r6 = d(r13, r8)
            r14.b((int) r7, (int) r6)
            goto L_0x0581
        L_0x00ca:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            int r6 = d(r13, r8)
            r14.e((int) r7, (int) r6)
            goto L_0x0581
        L_0x00dd:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r8)
            auay r6 = (defpackage.auay) r6
            r14.a((int) r7, (defpackage.auay) r6)
            goto L_0x0581
        L_0x00f2:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r8)
            aueq r8 = r12.a((int) r5)
            r14.a(r7, r6, r8)
            goto L_0x0581
        L_0x0109:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r8)
            a((int) r7, (java.lang.Object) r6, (defpackage.aubl) r14)
            goto L_0x0581
        L_0x011c:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            boolean r6 = f(r13, r8)
            r14.a((int) r7, (boolean) r6)
            goto L_0x0581
        L_0x012f:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            int r6 = d(r13, r8)
            r14.d((int) r7, (int) r6)
            goto L_0x0581
        L_0x0142:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            long r8 = e(r13, r8)
            r14.d((int) r7, (long) r8)
            goto L_0x0581
        L_0x0155:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            int r6 = d(r13, r8)
            r14.c((int) r7, (int) r6)
            goto L_0x0581
        L_0x0168:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            long r8 = e(r13, r8)
            r14.c((int) r7, (long) r8)
            goto L_0x0581
        L_0x017b:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            long r8 = e(r13, r8)
            r14.a((int) r7, (long) r8)
            goto L_0x0581
        L_0x018e:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            float r6 = c((java.lang.Object) r13, (long) r8)
            r14.a((int) r7, (float) r6)
            goto L_0x0581
        L_0x01a1:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            double r8 = b((java.lang.Object) r13, (long) r8)
            r14.a((int) r7, (double) r8)
            goto L_0x0581
        L_0x01b4:
            long r8 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r8)
            r12.a((defpackage.aubl) r14, (int) r7, (java.lang.Object) r6, (int) r5)
            goto L_0x0581
        L_0x01c1:
            int r7 = r12.d((int) r5)
            long r8 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            aueq r8 = r12.a((int) r5)
            defpackage.auer.b((int) r7, (java.util.List) r6, (defpackage.aubl) r14, (defpackage.aueq) r8)
            goto L_0x0581
        L_0x01d8:
            int r7 = r12.d((int) r5)
            long r10 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.e(r7, r6, r14, r9)
            goto L_0x0581
        L_0x01eb:
            int r7 = r12.d((int) r5)
            long r10 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.j(r7, r6, r14, r9)
            goto L_0x0581
        L_0x01fe:
            int r7 = r12.d((int) r5)
            long r10 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.g(r7, r6, r14, r9)
            goto L_0x0581
        L_0x0211:
            int r7 = r12.d((int) r5)
            long r10 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.l(r7, r6, r14, r9)
            goto L_0x0581
        L_0x0224:
            int r7 = r12.d((int) r5)
            long r10 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.m(r7, r6, r14, r9)
            goto L_0x0581
        L_0x0237:
            int r7 = r12.d((int) r5)
            long r10 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.i(r7, r6, r14, r9)
            goto L_0x0581
        L_0x024a:
            int r7 = r12.d((int) r5)
            long r10 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.n(r7, r6, r14, r9)
            goto L_0x0581
        L_0x025d:
            int r7 = r12.d((int) r5)
            long r10 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.k(r7, r6, r14, r9)
            goto L_0x0581
        L_0x0270:
            int r7 = r12.d((int) r5)
            long r10 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.f(r7, r6, r14, r9)
            goto L_0x0581
        L_0x0283:
            int r7 = r12.d((int) r5)
            long r10 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.h(r7, r6, r14, r9)
            goto L_0x0581
        L_0x0296:
            int r7 = r12.d((int) r5)
            long r10 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.d(r7, r6, r14, r9)
            goto L_0x0581
        L_0x02a9:
            int r7 = r12.d((int) r5)
            long r10 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.c(r7, r6, r14, r9)
            goto L_0x0581
        L_0x02bc:
            int r7 = r12.d((int) r5)
            long r10 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.b((int) r7, (java.util.List) r6, (defpackage.aubl) r14, (boolean) r9)
            goto L_0x0581
        L_0x02cf:
            int r7 = r12.d((int) r5)
            long r10 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.a((int) r7, (java.util.List) r6, (defpackage.aubl) r14, (boolean) r9)
            goto L_0x0581
        L_0x02e2:
            int r7 = r12.d((int) r5)
            long r8 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.e(r7, r6, r14, r4)
            goto L_0x0581
        L_0x02f5:
            int r7 = r12.d((int) r5)
            long r8 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.j(r7, r6, r14, r4)
            goto L_0x0581
        L_0x0308:
            int r7 = r12.d((int) r5)
            long r8 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.g(r7, r6, r14, r4)
            goto L_0x0581
        L_0x031b:
            int r7 = r12.d((int) r5)
            long r8 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.l(r7, r6, r14, r4)
            goto L_0x0581
        L_0x032e:
            int r7 = r12.d((int) r5)
            long r8 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.m(r7, r6, r14, r4)
            goto L_0x0581
        L_0x0341:
            int r7 = r12.d((int) r5)
            long r8 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.i(r7, r6, r14, r4)
            goto L_0x0581
        L_0x0354:
            int r7 = r12.d((int) r5)
            long r8 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.b((int) r7, (java.util.List) r6, (defpackage.aubl) r14)
            goto L_0x0581
        L_0x0367:
            int r7 = r12.d((int) r5)
            long r8 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            aueq r8 = r12.a((int) r5)
            defpackage.auer.a((int) r7, (java.util.List) r6, (defpackage.aubl) r14, (defpackage.aueq) r8)
            goto L_0x0581
        L_0x037e:
            int r7 = r12.d((int) r5)
            long r8 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.a((int) r7, (java.util.List) r6, (defpackage.aubl) r14)
            goto L_0x0581
        L_0x0391:
            int r7 = r12.d((int) r5)
            long r8 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.n(r7, r6, r14, r4)
            goto L_0x0581
        L_0x03a4:
            int r7 = r12.d((int) r5)
            long r8 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.k(r7, r6, r14, r4)
            goto L_0x0581
        L_0x03b7:
            int r7 = r12.d((int) r5)
            long r8 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.f(r7, r6, r14, r4)
            goto L_0x0581
        L_0x03ca:
            int r7 = r12.d((int) r5)
            long r8 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.h(r7, r6, r14, r4)
            goto L_0x0581
        L_0x03dd:
            int r7 = r12.d((int) r5)
            long r8 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.d(r7, r6, r14, r4)
            goto L_0x0581
        L_0x03f0:
            int r7 = r12.d((int) r5)
            long r8 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.c(r7, r6, r14, r4)
            goto L_0x0581
        L_0x0403:
            int r7 = r12.d((int) r5)
            long r8 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.b((int) r7, (java.util.List) r6, (defpackage.aubl) r14, (boolean) r4)
            goto L_0x0581
        L_0x0416:
            int r7 = r12.d((int) r5)
            long r8 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.auer.a((int) r7, (java.util.List) r6, (defpackage.aubl) r14, (boolean) r4)
            goto L_0x0581
        L_0x0429:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r8)
            aueq r8 = r12.a((int) r5)
            r14.b(r7, r6, r8)
            goto L_0x0581
        L_0x0440:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            long r8 = defpackage.aufp.b(r13, r8)
            r14.e((int) r7, (long) r8)
            goto L_0x0581
        L_0x0453:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            int r6 = defpackage.aufp.a((java.lang.Object) r13, (long) r8)
            r14.f(r7, r6)
            goto L_0x0581
        L_0x0466:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            long r8 = defpackage.aufp.b(r13, r8)
            r14.b((int) r7, (long) r8)
            goto L_0x0581
        L_0x0479:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            int r6 = defpackage.aufp.a((java.lang.Object) r13, (long) r8)
            r14.a((int) r7, (int) r6)
            goto L_0x0581
        L_0x048c:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            int r6 = defpackage.aufp.a((java.lang.Object) r13, (long) r8)
            r14.b((int) r7, (int) r6)
            goto L_0x0581
        L_0x049f:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            int r6 = defpackage.aufp.a((java.lang.Object) r13, (long) r8)
            r14.e((int) r7, (int) r6)
            goto L_0x0581
        L_0x04b2:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r8)
            auay r6 = (defpackage.auay) r6
            r14.a((int) r7, (defpackage.auay) r6)
            goto L_0x0581
        L_0x04c7:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r8)
            aueq r8 = r12.a((int) r5)
            r14.a(r7, r6, r8)
            goto L_0x0581
        L_0x04de:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            java.lang.Object r6 = defpackage.aufp.f(r13, r8)
            a((int) r7, (java.lang.Object) r6, (defpackage.aubl) r14)
            goto L_0x0581
        L_0x04f1:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            boolean r6 = defpackage.aufp.c(r13, r8)
            r14.a((int) r7, (boolean) r6)
            goto L_0x0581
        L_0x0504:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            int r6 = defpackage.aufp.a((java.lang.Object) r13, (long) r8)
            r14.d((int) r7, (int) r6)
            goto L_0x0581
        L_0x0516:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            long r8 = defpackage.aufp.b(r13, r8)
            r14.d((int) r7, (long) r8)
            goto L_0x0581
        L_0x0528:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            int r6 = defpackage.aufp.a((java.lang.Object) r13, (long) r8)
            r14.c((int) r7, (int) r6)
            goto L_0x0581
        L_0x053a:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            long r8 = defpackage.aufp.b(r13, r8)
            r14.c((int) r7, (long) r8)
            goto L_0x0581
        L_0x054c:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            long r8 = defpackage.aufp.b(r13, r8)
            r14.a((int) r7, (long) r8)
            goto L_0x0581
        L_0x055e:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            float r6 = defpackage.aufp.d(r13, r8)
            r14.a((int) r7, (float) r6)
            goto L_0x0581
        L_0x0570:
            boolean r8 = r12.a((java.lang.Object) r13, (int) r5)
            if (r8 == 0) goto L_0x0581
            long r8 = i(r6)
            double r8 = defpackage.aufp.e(r13, r8)
            r14.a((int) r7, (double) r8)
        L_0x0581:
            int r5 = r5 + 3
            goto L_0x0025
        L_0x0585:
        L_0x0586:
            if (r2 == 0) goto L_0x059a
            defpackage.aubt.a(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0598
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0586
        L_0x0598:
            r2 = r1
            goto L_0x0586
        L_0x059a:
            c((java.lang.Object) r13, (defpackage.aubl) r14)
            return
        L_0x059e:
            r12.b((java.lang.Object) r13, (defpackage.aubl) r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auea.a(java.lang.Object, aubl):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:206:0x06f4 A[LOOP:5: B:204:0x06f0->B:206:0x06f4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0701  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Object r12, defpackage.auek r13, defpackage.aubs r14) {
        /*
            r11 = this;
            r0 = 0
            if (r14 == 0) goto L_0x0705
            auff r1 = r11.o
            r2 = r0
            r3 = r2
        L_0x0007:
            int r4 = r13.a()     // Catch:{ all -> 0x06ed }
            int r5 = r11.j(r4)     // Catch:{ all -> 0x06ed }
            if (r5 < 0) goto L_0x05b2
            int r6 = r11.e((int) r5)     // Catch:{ all -> 0x06ed }
            int r7 = g((int) r6)     // Catch:{ aucz -> 0x058d }
            switch(r7) {
                case 0: goto L_0x0557;
                case 1: goto L_0x0547;
                case 2: goto L_0x0537;
                case 3: goto L_0x0527;
                case 4: goto L_0x0517;
                case 5: goto L_0x0507;
                case 6: goto L_0x04f7;
                case 7: goto L_0x04e7;
                case 8: goto L_0x04df;
                case 9: goto L_0x04a8;
                case 10: goto L_0x0498;
                case 11: goto L_0x0488;
                case 12: goto L_0x0465;
                case 13: goto L_0x0455;
                case 14: goto L_0x0445;
                case 15: goto L_0x0435;
                case 16: goto L_0x0425;
                case 17: goto L_0x03ee;
                case 18: goto L_0x03df;
                case 19: goto L_0x03d0;
                case 20: goto L_0x03c1;
                case 21: goto L_0x03b2;
                case 22: goto L_0x03a3;
                case 23: goto L_0x0394;
                case 24: goto L_0x0385;
                case 25: goto L_0x0376;
                case 26: goto L_0x0352;
                case 27: goto L_0x033f;
                case 28: goto L_0x0330;
                case 29: goto L_0x0321;
                case 30: goto L_0x030a;
                case 31: goto L_0x02fb;
                case 32: goto L_0x02ec;
                case 33: goto L_0x02dd;
                case 34: goto L_0x02ce;
                case 35: goto L_0x02bf;
                case 36: goto L_0x02b0;
                case 37: goto L_0x02a1;
                case 38: goto L_0x0292;
                case 39: goto L_0x0283;
                case 40: goto L_0x0274;
                case 41: goto L_0x0265;
                case 42: goto L_0x0256;
                case 43: goto L_0x0247;
                case 44: goto L_0x0230;
                case 45: goto L_0x0221;
                case 46: goto L_0x0212;
                case 47: goto L_0x0203;
                case 48: goto L_0x01f4;
                case 49: goto L_0x01e1;
                case 50: goto L_0x01ab;
                case 51: goto L_0x0197;
                case 52: goto L_0x0183;
                case 53: goto L_0x016f;
                case 54: goto L_0x015b;
                case 55: goto L_0x0147;
                case 56: goto L_0x0133;
                case 57: goto L_0x011f;
                case 58: goto L_0x010b;
                case 59: goto L_0x0103;
                case 60: goto L_0x00ca;
                case 61: goto L_0x00ba;
                case 62: goto L_0x00a6;
                case 63: goto L_0x007f;
                case 64: goto L_0x006c;
                case 65: goto L_0x0059;
                case 66: goto L_0x0046;
                case 67: goto L_0x0033;
                case 68: goto L_0x0020;
                default: goto L_0x001c;
            }     // Catch:{ aucz -> 0x058d }
        L_0x001c:
            if (r2 == 0) goto L_0x0567
            goto L_0x056b
        L_0x0020:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            aueq r8 = r11.a((int) r5)     // Catch:{ aucz -> 0x058d }
            java.lang.Object r8 = r13.b((defpackage.aueq) r8, (defpackage.aubs) r14)     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (java.lang.Object) r8)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r4, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0033:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            long r8 = r13.t()     // Catch:{ aucz -> 0x058d }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (java.lang.Object) r8)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r4, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0046:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            int r8 = r13.s()     // Catch:{ aucz -> 0x058d }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (java.lang.Object) r8)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r4, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0059:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            long r8 = r13.r()     // Catch:{ aucz -> 0x058d }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (java.lang.Object) r8)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r4, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x006c:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            int r8 = r13.q()     // Catch:{ aucz -> 0x058d }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (java.lang.Object) r8)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r4, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x007f:
            int r7 = r13.p()     // Catch:{ aucz -> 0x058d }
            aucq r8 = r11.c((int) r5)     // Catch:{ aucz -> 0x058d }
            if (r8 != 0) goto L_0x008a
            goto L_0x0096
        L_0x008a:
            boolean r8 = r8.a(r7)     // Catch:{ aucz -> 0x058d }
            if (r8 != 0) goto L_0x0096
            java.lang.Object r2 = defpackage.auer.a((int) r4, (int) r7, (java.lang.Object) r2)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0096:
            long r8 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r8, (java.lang.Object) r6)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r4, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x00a6:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            int r8 = r13.o()     // Catch:{ aucz -> 0x058d }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (java.lang.Object) r8)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r4, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x00ba:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            auay r8 = r13.n()     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (java.lang.Object) r8)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r4, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x00ca:
            boolean r7 = r11.a((java.lang.Object) r12, (int) r4, (int) r5)     // Catch:{ aucz -> 0x058d }
            if (r7 != 0) goto L_0x00e3
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            aueq r8 = r11.a((int) r5)     // Catch:{ aucz -> 0x058d }
            java.lang.Object r8 = r13.a((defpackage.aueq) r8, (defpackage.aubs) r14)     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (java.lang.Object) r8)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x00fe
        L_0x00e3:
            long r7 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.lang.Object r7 = defpackage.aufp.f(r12, r7)     // Catch:{ aucz -> 0x058d }
            aueq r8 = r11.a((int) r5)     // Catch:{ aucz -> 0x058d }
            java.lang.Object r8 = r13.a((defpackage.aueq) r8, (defpackage.aubs) r14)     // Catch:{ aucz -> 0x058d }
            long r9 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.lang.Object r6 = defpackage.aucy.a((java.lang.Object) r7, (java.lang.Object) r8)     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r9, (java.lang.Object) r6)     // Catch:{ aucz -> 0x058d }
        L_0x00fe:
            r11.b((java.lang.Object) r12, (int) r4, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0103:
            r11.a((java.lang.Object) r12, (int) r6, (defpackage.auek) r13)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r4, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x010b:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            boolean r8 = r13.k()     // Catch:{ aucz -> 0x058d }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (java.lang.Object) r8)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r4, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x011f:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            int r8 = r13.j()     // Catch:{ aucz -> 0x058d }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (java.lang.Object) r8)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r4, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0133:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            long r8 = r13.i()     // Catch:{ aucz -> 0x058d }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (java.lang.Object) r8)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r4, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0147:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            int r8 = r13.h()     // Catch:{ aucz -> 0x058d }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (java.lang.Object) r8)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r4, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x015b:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            long r8 = r13.f()     // Catch:{ aucz -> 0x058d }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (java.lang.Object) r8)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r4, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x016f:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            long r8 = r13.g()     // Catch:{ aucz -> 0x058d }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (java.lang.Object) r8)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r4, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0183:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            float r8 = r13.e()     // Catch:{ aucz -> 0x058d }
            java.lang.Float r8 = java.lang.Float.valueOf(r8)     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (java.lang.Object) r8)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r4, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0197:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            double r8 = r13.d()     // Catch:{ aucz -> 0x058d }
            java.lang.Double r8 = java.lang.Double.valueOf(r8)     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (java.lang.Object) r8)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r4, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x01ab:
            java.lang.Object r4 = r11.b((int) r5)     // Catch:{ aucz -> 0x058d }
            int r5 = r11.e((int) r5)     // Catch:{ aucz -> 0x058d }
            long r5 = i(r5)     // Catch:{ aucz -> 0x058d }
            java.lang.Object r7 = defpackage.aufp.f(r12, r5)     // Catch:{ aucz -> 0x058d }
            if (r7 != 0) goto L_0x01c5
            java.lang.Object r7 = defpackage.auds.a()     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r5, (java.lang.Object) r7)     // Catch:{ aucz -> 0x058d }
            goto L_0x01d6
        L_0x01c5:
            boolean r8 = defpackage.auds.b(r7)     // Catch:{ aucz -> 0x058d }
            if (r8 == 0) goto L_0x01d6
            java.lang.Object r8 = defpackage.auds.a()     // Catch:{ aucz -> 0x058d }
            defpackage.auds.a(r8, r7)     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r5, (java.lang.Object) r8)     // Catch:{ aucz -> 0x058d }
            r7 = r8
        L_0x01d6:
            audr r7 = (defpackage.audr) r7     // Catch:{ aucz -> 0x058d }
            audp r4 = defpackage.auds.a(r4)     // Catch:{ aucz -> 0x058d }
            r13.a((java.util.Map) r7, (defpackage.audp) r4, (defpackage.aubs) r14)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x01e1:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            aueq r4 = r11.a((int) r5)     // Catch:{ aucz -> 0x058d }
            audk r5 = r11.n     // Catch:{ aucz -> 0x058d }
            java.util.List r5 = r5.a(r12, r6)     // Catch:{ aucz -> 0x058d }
            r13.b(r5, r4, r14)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x01f4:
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.q(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0203:
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.p(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0212:
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.o(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0221:
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.n(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0230:
            audk r7 = r11.n     // Catch:{ aucz -> 0x058d }
            long r8 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r6 = r7.a(r12, r8)     // Catch:{ aucz -> 0x058d }
            r13.m(r6)     // Catch:{ aucz -> 0x058d }
            aucq r5 = r11.c((int) r5)     // Catch:{ aucz -> 0x058d }
            java.lang.Object r2 = defpackage.auer.a((int) r4, (java.util.List) r6, (defpackage.aucq) r5, (java.lang.Object) r2)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0247:
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.l(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0256:
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.h(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0265:
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.g(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0274:
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.f(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0283:
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.e(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0292:
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.c(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x02a1:
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.d(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x02b0:
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.b(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x02bf:
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.a(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x02ce:
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.q(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x02dd:
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.p(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x02ec:
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.o(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x02fb:
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.n(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x030a:
            audk r7 = r11.n     // Catch:{ aucz -> 0x058d }
            long r8 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r6 = r7.a(r12, r8)     // Catch:{ aucz -> 0x058d }
            r13.m(r6)     // Catch:{ aucz -> 0x058d }
            aucq r5 = r11.c((int) r5)     // Catch:{ aucz -> 0x058d }
            java.lang.Object r2 = defpackage.auer.a((int) r4, (java.util.List) r6, (defpackage.aucq) r5, (java.lang.Object) r2)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0321:
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.l(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0330:
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.k(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x033f:
            aueq r4 = r11.a((int) r5)     // Catch:{ aucz -> 0x058d }
            audk r5 = r11.n     // Catch:{ aucz -> 0x058d }
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r5 = r5.a(r12, r6)     // Catch:{ aucz -> 0x058d }
            r13.a((java.util.List) r5, (defpackage.aueq) r4, (defpackage.aubs) r14)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0352:
            boolean r4 = h((int) r6)     // Catch:{ aucz -> 0x058d }
            if (r4 == 0) goto L_0x0367
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.j(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0367:
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.i(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0376:
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.h(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0385:
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.g(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0394:
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.f(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x03a3:
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.e(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x03b2:
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.c(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x03c1:
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.d(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x03d0:
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.b(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x03df:
            audk r4 = r11.n     // Catch:{ aucz -> 0x058d }
            long r5 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.util.List r4 = r4.a(r12, r5)     // Catch:{ aucz -> 0x058d }
            r13.a(r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x03ee:
            boolean r4 = r11.a((java.lang.Object) r12, (int) r5)     // Catch:{ aucz -> 0x058d }
            if (r4 != 0) goto L_0x0408
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            aueq r4 = r11.a((int) r5)     // Catch:{ aucz -> 0x058d }
            java.lang.Object r4 = r13.b((defpackage.aueq) r4, (defpackage.aubs) r14)     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (java.lang.Object) r4)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0408:
            long r7 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.lang.Object r4 = defpackage.aufp.f(r12, r7)     // Catch:{ aucz -> 0x058d }
            aueq r5 = r11.a((int) r5)     // Catch:{ aucz -> 0x058d }
            java.lang.Object r5 = r13.b((defpackage.aueq) r5, (defpackage.aubs) r14)     // Catch:{ aucz -> 0x058d }
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.lang.Object r4 = defpackage.aucy.a((java.lang.Object) r4, (java.lang.Object) r5)     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (java.lang.Object) r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0425:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            long r8 = r13.t()     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (long) r8)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0435:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            int r4 = r13.s()     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (int) r4)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0445:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            long r8 = r13.r()     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (long) r8)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0455:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            int r4 = r13.q()     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (int) r4)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0465:
            int r7 = r13.p()     // Catch:{ aucz -> 0x058d }
            aucq r8 = r11.c((int) r5)     // Catch:{ aucz -> 0x058d }
            if (r8 == 0) goto L_0x047c
            boolean r8 = r8.a(r7)     // Catch:{ aucz -> 0x058d }
            if (r8 == 0) goto L_0x0476
            goto L_0x047c
        L_0x0476:
            java.lang.Object r2 = defpackage.auer.a((int) r4, (int) r7, (java.lang.Object) r2)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x047c:
            long r8 = i(r6)     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r8, (int) r7)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0488:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            int r4 = r13.o()     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (int) r4)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0498:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            auay r4 = r13.n()     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (java.lang.Object) r4)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x04a8:
            boolean r4 = r11.a((java.lang.Object) r12, (int) r5)     // Catch:{ aucz -> 0x058d }
            if (r4 != 0) goto L_0x04c2
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            aueq r4 = r11.a((int) r5)     // Catch:{ aucz -> 0x058d }
            java.lang.Object r4 = r13.a((defpackage.aueq) r4, (defpackage.aubs) r14)     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (java.lang.Object) r4)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x04c2:
            long r7 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.lang.Object r4 = defpackage.aufp.f(r12, r7)     // Catch:{ aucz -> 0x058d }
            aueq r5 = r11.a((int) r5)     // Catch:{ aucz -> 0x058d }
            java.lang.Object r5 = r13.a((defpackage.aueq) r5, (defpackage.aubs) r14)     // Catch:{ aucz -> 0x058d }
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            java.lang.Object r4 = defpackage.aucy.a((java.lang.Object) r4, (java.lang.Object) r5)     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (java.lang.Object) r4)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x04df:
            r11.a((java.lang.Object) r12, (int) r6, (defpackage.auek) r13)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x04e7:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            boolean r4 = r13.k()     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (boolean) r4)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x04f7:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            int r4 = r13.j()     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (int) r4)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0507:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            long r8 = r13.i()     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (long) r8)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0517:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            int r4 = r13.h()     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (int) r4)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0527:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            long r8 = r13.f()     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (long) r8)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0537:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            long r8 = r13.g()     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (long) r8)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0547:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            float r4 = r13.e()     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (float) r4)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0557:
            long r6 = i(r6)     // Catch:{ aucz -> 0x058d }
            double r8 = r13.d()     // Catch:{ aucz -> 0x058d }
            defpackage.aufp.a((java.lang.Object) r12, (long) r6, (double) r8)     // Catch:{ aucz -> 0x058d }
            r11.b((java.lang.Object) r12, (int) r5)     // Catch:{ aucz -> 0x058d }
            goto L_0x0007
        L_0x0567:
            aufg r2 = defpackage.aufg.a()     // Catch:{ aucz -> 0x058d }
        L_0x056b:
            boolean r4 = r1.a((java.lang.Object) r2, (defpackage.auek) r13)     // Catch:{ aucz -> 0x058b, all -> 0x0588 }
            if (r4 != 0) goto L_0x0007
            int r13 = r11.l
        L_0x0573:
            int r14 = r11.m
            if (r13 >= r14) goto L_0x0582
            int[] r14 = r11.k
            r14 = r14[r13]
            java.lang.Object r2 = r11.a((java.lang.Object) r12, (int) r14, (java.lang.Object) r2)
            int r13 = r13 + 1
            goto L_0x0573
        L_0x0582:
            if (r2 == 0) goto L_0x06ea
        L_0x0584:
            defpackage.auff.a((java.lang.Object) r12, (defpackage.aufg) r2)
            return
        L_0x0588:
            r13 = move-exception
            goto L_0x06ee
        L_0x058b:
            r4 = move-exception
            goto L_0x058e
        L_0x058d:
            r4 = move-exception
        L_0x058e:
            if (r2 == 0) goto L_0x0591
            goto L_0x0595
        L_0x0591:
            java.lang.Object r2 = defpackage.auff.b(r12)     // Catch:{ all -> 0x05af }
        L_0x0595:
            boolean r4 = r1.a((java.lang.Object) r2, (defpackage.auek) r13)     // Catch:{ all -> 0x05af }
            if (r4 != 0) goto L_0x0007
            int r13 = r11.l
        L_0x059d:
            int r14 = r11.m
            if (r13 >= r14) goto L_0x05ac
            int[] r14 = r11.k
            r14 = r14[r13]
            java.lang.Object r2 = r11.a((java.lang.Object) r12, (int) r14, (java.lang.Object) r2)
            int r13 = r13 + 1
            goto L_0x059d
        L_0x05ac:
            if (r2 == 0) goto L_0x06ea
            goto L_0x0584
        L_0x05af:
            r13 = move-exception
            goto L_0x06ee
        L_0x05b2:
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L_0x05cb
            int r13 = r11.l
        L_0x05b9:
            int r14 = r11.m
            if (r13 >= r14) goto L_0x05c8
            int[] r14 = r11.k
            r14 = r14[r13]
            java.lang.Object r2 = r11.a((java.lang.Object) r12, (int) r14, (java.lang.Object) r2)
            int r13 = r13 + 1
            goto L_0x05b9
        L_0x05c8:
            if (r2 == 0) goto L_0x06ea
            goto L_0x0584
        L_0x05cb:
            boolean r5 = r11.h     // Catch:{ all -> 0x06ed }
            if (r5 == 0) goto L_0x05d6
            audx r5 = r11.g     // Catch:{ all -> 0x06ed }
            auci r4 = r14.a(r5, r4)     // Catch:{ all -> 0x06ed }
            goto L_0x05d7
        L_0x05d6:
            r4 = r0
        L_0x05d7:
            if (r4 == 0) goto L_0x06c8
            if (r3 == 0) goto L_0x05dc
            goto L_0x05e0
        L_0x05dc:
            aubx r3 = defpackage.aubt.b(r12)     // Catch:{ all -> 0x06ed }
        L_0x05e0:
            r4.a()     // Catch:{ all -> 0x06ed }
            auch r5 = r4.d     // Catch:{ all -> 0x06ed }
            aufw r5 = r4.b()     // Catch:{ all -> 0x06ed }
            aufw r6 = defpackage.aufw.ENUM     // Catch:{ all -> 0x06ed }
            if (r5 == r6) goto L_0x06c2
            aufw r5 = r4.b()     // Catch:{ all -> 0x06ed }
            int r5 = r5.ordinal()     // Catch:{ all -> 0x06ed }
            switch(r5) {
                case 0: goto L_0x0693;
                case 1: goto L_0x068a;
                case 2: goto L_0x0681;
                case 3: goto L_0x0678;
                case 4: goto L_0x066f;
                case 5: goto L_0x0666;
                case 6: goto L_0x065d;
                case 7: goto L_0x0654;
                case 8: goto L_0x064f;
                case 9: goto L_0x0644;
                case 10: goto L_0x0639;
                case 11: goto L_0x0634;
                case 12: goto L_0x062a;
                case 13: goto L_0x0622;
                case 14: goto L_0x0618;
                case 15: goto L_0x060e;
                case 16: goto L_0x0604;
                case 17: goto L_0x05fa;
                default: goto L_0x05f8;
            }     // Catch:{ all -> 0x06ed }
        L_0x05f8:
            goto L_0x069c
        L_0x05fa:
            long r5 = r13.t()     // Catch:{ all -> 0x06ed }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x06ed }
            goto L_0x069d
        L_0x0604:
            int r5 = r13.s()     // Catch:{ all -> 0x06ed }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x06ed }
            goto L_0x069d
        L_0x060e:
            long r5 = r13.r()     // Catch:{ all -> 0x06ed }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x06ed }
            goto L_0x069d
        L_0x0618:
            int r5 = r13.q()     // Catch:{ all -> 0x06ed }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x06ed }
            goto L_0x069d
        L_0x0622:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch:{ all -> 0x06ed }
            java.lang.String r14 = "Shouldn't reach here."
            r13.<init>(r14)     // Catch:{ all -> 0x06ed }
            throw r13     // Catch:{ all -> 0x06ed }
        L_0x062a:
            int r5 = r13.o()     // Catch:{ all -> 0x06ed }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x06ed }
            goto L_0x069d
        L_0x0634:
            auay r5 = r13.n()     // Catch:{ all -> 0x06ed }
            goto L_0x069d
        L_0x0639:
            audx r5 = r4.c     // Catch:{ all -> 0x06ed }
            java.lang.Class r5 = r5.getClass()     // Catch:{ all -> 0x06ed }
            java.lang.Object r5 = r13.a((java.lang.Class) r5, (defpackage.aubs) r14)     // Catch:{ all -> 0x06ed }
            goto L_0x069d
        L_0x0644:
            audx r5 = r4.c     // Catch:{ all -> 0x06ed }
            java.lang.Class r5 = r5.getClass()     // Catch:{ all -> 0x06ed }
            java.lang.Object r5 = r13.b((java.lang.Class) r5, (defpackage.aubs) r14)     // Catch:{ all -> 0x06ed }
            goto L_0x069d
        L_0x064f:
            java.lang.String r5 = r13.l()     // Catch:{ all -> 0x06ed }
            goto L_0x069d
        L_0x0654:
            boolean r5 = r13.k()     // Catch:{ all -> 0x06ed }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x06ed }
            goto L_0x069d
        L_0x065d:
            int r5 = r13.j()     // Catch:{ all -> 0x06ed }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x06ed }
            goto L_0x069d
        L_0x0666:
            long r5 = r13.i()     // Catch:{ all -> 0x06ed }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x06ed }
            goto L_0x069d
        L_0x066f:
            int r5 = r13.h()     // Catch:{ all -> 0x06ed }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x06ed }
            goto L_0x069d
        L_0x0678:
            long r5 = r13.f()     // Catch:{ all -> 0x06ed }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x06ed }
            goto L_0x069d
        L_0x0681:
            long r5 = r13.g()     // Catch:{ all -> 0x06ed }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x06ed }
            goto L_0x069d
        L_0x068a:
            float r5 = r13.e()     // Catch:{ all -> 0x06ed }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ all -> 0x06ed }
            goto L_0x069d
        L_0x0693:
            double r5 = r13.d()     // Catch:{ all -> 0x06ed }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ all -> 0x06ed }
            goto L_0x069d
        L_0x069c:
            r5 = r0
        L_0x069d:
            aufw r6 = r4.b()     // Catch:{ all -> 0x06ed }
            int r6 = r6.ordinal()     // Catch:{ all -> 0x06ed }
            r7 = 9
            if (r6 == r7) goto L_0x06ae
            r7 = 10
            if (r6 == r7) goto L_0x06ae
            goto L_0x06bb
        L_0x06ae:
            auch r6 = r4.d     // Catch:{ all -> 0x06ed }
            java.lang.Object r6 = r3.b((defpackage.auch) r6)     // Catch:{ all -> 0x06ed }
            if (r6 != 0) goto L_0x06b7
            goto L_0x06bb
        L_0x06b7:
            java.lang.Object r5 = defpackage.aucy.a((java.lang.Object) r6, (java.lang.Object) r5)     // Catch:{ all -> 0x06ed }
        L_0x06bb:
            auch r4 = r4.d     // Catch:{ all -> 0x06ed }
            r3.a(r4, r5)     // Catch:{ all -> 0x06ed }
            goto L_0x0007
        L_0x06c2:
            r13.h()     // Catch:{ all -> 0x06ed }
            auch r13 = r4.d     // Catch:{ all -> 0x06ed }
            throw r0     // Catch:{ all -> 0x06ed }
        L_0x06c8:
            if (r2 == 0) goto L_0x06cb
            goto L_0x06cf
        L_0x06cb:
            java.lang.Object r2 = defpackage.auff.b(r12)     // Catch:{ all -> 0x06ed }
        L_0x06cf:
            boolean r4 = r1.a((java.lang.Object) r2, (defpackage.auek) r13)     // Catch:{ all -> 0x06eb }
            if (r4 != 0) goto L_0x0007
            int r13 = r11.l
        L_0x06d7:
            int r14 = r11.m
            if (r13 >= r14) goto L_0x06e6
            int[] r14 = r11.k
            r14 = r14[r13]
            java.lang.Object r2 = r11.a((java.lang.Object) r12, (int) r14, (java.lang.Object) r2)
            int r13 = r13 + 1
            goto L_0x06d7
        L_0x06e6:
            if (r2 == 0) goto L_0x06ea
            goto L_0x0584
        L_0x06ea:
            return
        L_0x06eb:
            r13 = move-exception
            goto L_0x06ee
        L_0x06ed:
            r13 = move-exception
        L_0x06ee:
            int r14 = r11.l
        L_0x06f0:
            int r0 = r11.m
            if (r14 >= r0) goto L_0x06ff
            int[] r0 = r11.k
            r0 = r0[r14]
            java.lang.Object r2 = r11.a((java.lang.Object) r12, (int) r0, (java.lang.Object) r2)
            int r14 = r14 + 1
            goto L_0x06f0
        L_0x06ff:
            if (r2 == 0) goto L_0x0704
            defpackage.auff.a((java.lang.Object) r12, (defpackage.aufg) r2)
        L_0x0704:
            throw r13
        L_0x0705:
            goto L_0x0708
        L_0x0707:
            throw r0
        L_0x0708:
            goto L_0x0707
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auea.a(java.lang.Object, auek, aubs):void");
    }

    public final void a(Object obj, byte[] bArr, int i2, int i3, auah auah) {
        if (!this.j) {
            a(obj, bArr, i2, i3, 0, auah);
        } else {
            b(obj, bArr, i2, i3, auah);
        }
    }

    public final boolean a(Object obj, Object obj2) {
        boolean z;
        int length = this.c.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int e2 = e(i2);
            long i3 = i(e2);
            switch (g(e2)) {
                case 0:
                    if (c(obj, obj2, i2) && Double.doubleToLongBits(aufp.e(obj, i3)) == Double.doubleToLongBits(aufp.e(obj2, i3))) {
                        continue;
                    }
                case 1:
                    if (c(obj, obj2, i2) && Float.floatToIntBits(aufp.d(obj, i3)) == Float.floatToIntBits(aufp.d(obj2, i3))) {
                        continue;
                    }
                case 2:
                    if (c(obj, obj2, i2) && aufp.b(obj, i3) == aufp.b(obj2, i3)) {
                        continue;
                    }
                case 3:
                    if (c(obj, obj2, i2) && aufp.b(obj, i3) == aufp.b(obj2, i3)) {
                        continue;
                    }
                case 4:
                    if (c(obj, obj2, i2) && aufp.a(obj, i3) == aufp.a(obj2, i3)) {
                        continue;
                    }
                case 5:
                    if (c(obj, obj2, i2) && aufp.b(obj, i3) == aufp.b(obj2, i3)) {
                        continue;
                    }
                case 6:
                    if (c(obj, obj2, i2) && aufp.a(obj, i3) == aufp.a(obj2, i3)) {
                        continue;
                    }
                case 7:
                    if (c(obj, obj2, i2) && aufp.c(obj, i3) == aufp.c(obj2, i3)) {
                        continue;
                    }
                case 8:
                    if (c(obj, obj2, i2) && auer.a(aufp.f(obj, i3), aufp.f(obj2, i3))) {
                        continue;
                    }
                case 9:
                    if (c(obj, obj2, i2) && auer.a(aufp.f(obj, i3), aufp.f(obj2, i3))) {
                        continue;
                    }
                case 10:
                    if (c(obj, obj2, i2) && auer.a(aufp.f(obj, i3), aufp.f(obj2, i3))) {
                        continue;
                    }
                case 11:
                    if (c(obj, obj2, i2) && aufp.a(obj, i3) == aufp.a(obj2, i3)) {
                        continue;
                    }
                case 12:
                    if (c(obj, obj2, i2) && aufp.a(obj, i3) == aufp.a(obj2, i3)) {
                        continue;
                    }
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    if (c(obj, obj2, i2) && aufp.a(obj, i3) == aufp.a(obj2, i3)) {
                        continue;
                    }
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    if (c(obj, obj2, i2) && aufp.b(obj, i3) == aufp.b(obj2, i3)) {
                        continue;
                    }
                case Service.START_CONTINUATION_MASK:
                    if (c(obj, obj2, i2) && aufp.a(obj, i3) == aufp.a(obj2, i3)) {
                        continue;
                    }
                case 16:
                    if (c(obj, obj2, i2) && aufp.b(obj, i3) == aufp.b(obj2, i3)) {
                        continue;
                    }
                case 17:
                    if (c(obj, obj2, i2) && auer.a(aufp.f(obj, i3), aufp.f(obj2, i3))) {
                        continue;
                    }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    z = auer.a(aufp.f(obj, i3), aufp.f(obj2, i3));
                    break;
                case 50:
                    z = auer.a(aufp.f(obj, i3), aufp.f(obj2, i3));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long f2 = (long) (f(i2) & 1048575);
                    if (aufp.a(obj, f2) == aufp.a(obj2, f2) && auer.a(aufp.f(obj, i3), aufp.f(obj2, i3))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!auff.a(obj).equals(auff.a(obj2))) {
            return false;
        }
        if (this.h) {
            return aubt.a(obj).equals(aubt.a(obj2));
        }
        return true;
    }
}
