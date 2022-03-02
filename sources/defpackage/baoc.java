package defpackage;

import com.google.android.chimera.FragmentTransaction;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: baoc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baoc {
    public final List a = new ArrayList();
    public final batf b;
    public int c;
    public int d;
    baob[] e;
    int f;
    int g;
    int h;

    public baoc(baua baua) {
        baob[] baobArr = new baob[8];
        this.e = baobArr;
        this.f = baobArr.length - 1;
        this.g = 0;
        this.h = 0;
        this.c = FragmentTransaction.TRANSIT_ENTER_MASK;
        this.d = FragmentTransaction.TRANSIT_ENTER_MASK;
        this.b = batq.a(baua);
    }

    private final void c() {
        Arrays.fill(this.e, (Object) null);
        this.f = this.e.length - 1;
        this.g = 0;
        this.h = 0;
    }

    private final int d() {
        return this.b.e() & 255;
    }

    public final int a(int i) {
        return this.f + 1 + i;
    }

    /* access modifiers changed from: package-private */
    public final batg b() {
        int d2 = d();
        int a2 = a(d2, 127);
        if ((d2 & 128) != 128) {
            return this.b.d((long) a2);
        }
        baol baol = baol.a;
        byte[] g2 = this.b.g((long) a2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        baok baok = baol.b;
        int i = 0;
        byte b2 = 0;
        for (byte b3 : g2) {
            b2 = (b2 << 8) | (b3 & 255);
            i += 8;
            while (i >= 8) {
                int i2 = i - 8;
                baok = baok.a[(b2 >>> i2) & 255];
                if (baok.a == null) {
                    byteArrayOutputStream.write(baok.b);
                    i -= baok.c;
                    baok = baol.b;
                } else {
                    i = i2;
                }
            }
        }
        while (i > 0) {
            baok baok2 = baok.a[(b2 << (8 - i)) & 255];
            if (baok2.a != null || baok2.c > i) {
                break;
            }
            byteArrayOutputStream.write(baok2.b);
            i -= baok2.c;
            baok = baol.b;
        }
        return batg.a(byteArrayOutputStream.toByteArray());
    }

    public static final boolean c(int i) {
        return i >= 0 && i <= baoe.b.length + -1;
    }

    private final void d(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length >= i2 && i > 0) {
                    int i4 = this.e[length].h;
                    i -= i4;
                    this.h -= i4;
                    this.g--;
                    i3++;
                    length--;
                }
            }
            baob[] baobArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(baobArr, i5, baobArr, i5 + i3, this.g);
            this.f += i3;
        }
    }

    /* access modifiers changed from: package-private */
    public final int a(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            int d2 = d();
            if ((d2 & 128) == 0) {
                return i2 + (d2 << i4);
            }
            i2 += (d2 & 127) << i4;
            i4 += 7;
        }
    }

    public final void a() {
        int i = this.d;
        int i2 = this.h;
        if (i >= i2) {
            return;
        }
        if (i != 0) {
            d(i2 - i);
        } else {
            c();
        }
    }

    public final void a(baob baob) {
        this.a.add(baob);
        int i = baob.h;
        int i2 = this.d;
        if (i > i2) {
            c();
            return;
        }
        d((this.h + i) - i2);
        int i3 = this.g;
        baob[] baobArr = this.e;
        int length = baobArr.length;
        if (i3 + 1 > length) {
            baob[] baobArr2 = new baob[(length + length)];
            System.arraycopy(baobArr, 0, baobArr2, length, length);
            this.f = this.e.length - 1;
            this.e = baobArr2;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = baob;
        this.g++;
        this.h += i;
    }

    public final batg b(int i) {
        if (c(i)) {
            return baoe.b[i].f;
        }
        int a2 = a(i - baoe.b.length);
        if (a2 >= 0) {
            baob[] baobArr = this.e;
            if (a2 < baobArr.length) {
                return baobArr[a2].f;
            }
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("Header index too large ");
        sb.append(i + 1);
        throw new IOException(sb.toString());
    }
}
