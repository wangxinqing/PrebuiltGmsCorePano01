package defpackage;

import java.util.Arrays;

/* renamed from: baod  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baod {
    public final batd a;
    baob[] b;
    int c;
    public int d;
    private int e;

    public baod(batd batd) {
        baob[] baobArr = new baob[8];
        this.b = baobArr;
        this.d = baobArr.length - 1;
        this.a = batd;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, int i2, int i3) {
        if (i >= i2) {
            this.a.h(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.a.h(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.a.h(i4);
            return;
        }
        this.a.h(i | i3);
    }

    public final void a(baob baob) {
        int i;
        int i2 = baob.h;
        if (i2 > 4096) {
            Arrays.fill(this.b, (Object) null);
            this.d = this.b.length - 1;
            this.c = 0;
            this.e = 0;
            return;
        }
        int i3 = (this.e + i2) - 4096;
        if (i3 > 0) {
            int length = this.b.length - 1;
            int i4 = 0;
            while (true) {
                i = this.d;
                if (length >= i && i3 > 0) {
                    int i5 = this.b[length].h;
                    i3 -= i5;
                    this.e -= i5;
                    this.c--;
                    i4++;
                    length--;
                }
            }
            baob[] baobArr = this.b;
            int i6 = i + 1;
            System.arraycopy(baobArr, i6, baobArr, i6 + i4, this.c);
            this.d += i4;
        }
        int i7 = this.c;
        baob[] baobArr2 = this.b;
        int length2 = baobArr2.length;
        if (i7 + 1 > length2) {
            baob[] baobArr3 = new baob[(length2 + length2)];
            System.arraycopy(baobArr2, 0, baobArr3, length2, length2);
            this.d = this.b.length - 1;
            this.b = baobArr3;
        }
        int i8 = this.d;
        this.d = i8 - 1;
        this.b[i8] = baob;
        this.c++;
        this.e += i2;
    }

    /* access modifiers changed from: package-private */
    public final void a(batg batg) {
        a(batg.e(), 127, 0);
        this.a.b(batg);
    }
}
