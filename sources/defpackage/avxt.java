package defpackage;

/* renamed from: avxt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avxt {
    public final avxs a;
    public final int[] b;

    public avxt(avxs avxs, int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            this.a = avxs;
            int i = 1;
            if (length <= 1 || iArr[0] != 0) {
                this.b = iArr;
                return;
            }
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i != length) {
                int[] iArr2 = new int[(length - i)];
                this.b = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
                return;
            }
            this.b = avxs.b().b;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final int a() {
        return this.b.length - 1;
    }

    public final boolean b() {
        return this.b[0] == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(a() * 8);
        for (int a2 = a(); a2 >= 0; a2--) {
            int a3 = a(a2);
            if (a3 != 0) {
                if (a3 < 0) {
                    sb.append(" - ");
                    a3 = -a3;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (a2 == 0 || a3 != 1) {
                    avxs avxs = this.a;
                    avxs.a();
                    if (a3 != 0) {
                        int i = avxs.c[a3];
                        if (i == 0) {
                            sb.append('1');
                        } else if (i != 1) {
                            sb.append("a^");
                            sb.append(i);
                        } else {
                            sb.append('a');
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                if (a2 != 0) {
                    if (a2 != 1) {
                        sb.append("x^");
                        sb.append(a2);
                    } else {
                        sb.append('x');
                    }
                }
            }
        }
        return sb.toString();
    }

    public final int a(int i) {
        int[] iArr = this.b;
        return iArr[(iArr.length - 1) - i];
    }

    public final avxt a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.a.b();
        } else {
            int length = this.b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.a.b(this.b[i3], i2);
            }
            return new avxt(this.a, iArr);
        }
    }

    public final avxt a(avxt avxt) {
        int[] iArr;
        if (!this.a.equals(avxt.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (b()) {
            return avxt;
        } else {
            if (avxt.b()) {
                return this;
            }
            int[] iArr2 = this.b;
            int[] iArr3 = avxt.b;
            int length = iArr2.length;
            int length2 = iArr3.length;
            if (length > length2) {
                iArr = iArr2;
            } else {
                iArr = iArr3;
            }
            if (length > length2) {
                iArr2 = iArr3;
            }
            int length3 = iArr.length;
            int[] iArr4 = new int[length3];
            int length4 = length3 - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length4);
            for (int i = length4; i < iArr.length; i++) {
                iArr4[i] = avxs.a(iArr2[i - length4], iArr[i]);
            }
            return new avxt(this.a, iArr4);
        }
    }
}
