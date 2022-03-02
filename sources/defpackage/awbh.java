package defpackage;

import com.google.android.chimera.FragmentTransaction;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: awbh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awbh {
    public final List a = new ArrayList();
    public final batf b;
    public int c;
    public int d;
    awbg[] e;
    int f;
    int g;
    int h;

    public awbh(baua baua) {
        awbg[] awbgArr = new awbg[8];
        this.e = awbgArr;
        this.f = awbgArr.length - 1;
        this.g = 0;
        this.h = 0;
        this.c = FragmentTransaction.TRANSIT_ENTER_MASK;
        this.d = FragmentTransaction.TRANSIT_ENTER_MASK;
        this.b = batq.a(baua);
    }

    private final void c() {
        this.a.clear();
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
        awbq awbq = awbq.a;
        byte[] g2 = this.b.g((long) a2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        awbp awbp = awbq.b;
        int i = 0;
        byte b2 = 0;
        for (byte b3 : g2) {
            b2 = (b2 << 8) | (b3 & 255);
            i += 8;
            while (i >= 8) {
                int i2 = i - 8;
                awbp = awbp.a[(b2 >>> i2) & 255];
                if (awbp.a == null) {
                    byteArrayOutputStream.write(awbp.b);
                    i -= awbp.c;
                    awbp = awbq.b;
                } else {
                    i = i2;
                }
            }
        }
        while (i > 0) {
            awbp awbp2 = awbp.a[(b2 << (8 - i)) & 255];
            if (awbp2.a != null || awbp2.c > i) {
                break;
            }
            byteArrayOutputStream.write(awbp2.b);
            i -= awbp2.c;
            awbp = awbq.b;
        }
        return batg.a(byteArrayOutputStream.toByteArray());
    }

    public static final boolean c(int i) {
        return i >= 0 && i <= awbj.a.length + -1;
    }

    private final void d(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length >= i2 && i > 0) {
                    int i4 = this.e[length].j;
                    i -= i4;
                    this.h -= i4;
                    this.g--;
                    i3++;
                    length--;
                }
            }
            awbg[] awbgArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(awbgArr, i5, awbgArr, i5 + i3, this.g);
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

    public final void a(awbg awbg) {
        this.a.add(awbg);
        int i = awbg.j;
        int i2 = this.d;
        if (i > i2) {
            c();
            return;
        }
        d((this.h + i) - i2);
        int i3 = this.g;
        awbg[] awbgArr = this.e;
        int length = awbgArr.length;
        if (i3 + 1 > length) {
            awbg[] awbgArr2 = new awbg[(length + length)];
            System.arraycopy(awbgArr, 0, awbgArr2, length, length);
            this.f = this.e.length - 1;
            this.e = awbgArr2;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = awbg;
        this.g++;
        this.h += i;
    }

    public final batg b(int i) {
        if (c(i)) {
            return awbj.a[i].h;
        }
        return this.e[a(i - awbj.a.length)].h;
    }
}
