package defpackage;

import java.util.Arrays;

/* renamed from: aufg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aufg {
    public static final aufg a = new aufg(0, new int[0], new Object[0], false);
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    private boolean f;

    private aufg() {
        this(0, new int[8], new Object[8], true);
    }

    static aufg a() {
        return new aufg(0, new int[8], new Object[8], true);
    }

    public final void b() {
        this.f = false;
    }

    public final int c() {
        int i;
        int i2 = this.e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.b; i4++) {
            int i5 = this.c[i4];
            int b2 = aufy.b(i5);
            int a2 = aufy.a(i5);
            if (a2 == 0) {
                i = aubk.e(b2, ((Long) this.d[i4]).longValue());
            } else if (a2 == 1) {
                ((Long) this.d[i4]).longValue();
                i = aubk.r(b2);
            } else if (a2 == 2) {
                i = aubk.c(b2, (auay) this.d[i4]);
            } else if (a2 == 3) {
                int i6 = aubk.i(b2);
                i = i6 + i6 + ((aufg) this.d[i4]).c();
            } else if (a2 == 5) {
                ((Integer) this.d[i4]).intValue();
                i = aubk.q(b2);
            } else {
                throw new IllegalStateException(auda.f());
            }
            i3 += i;
        }
        this.e = i3;
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof aufg)) {
            aufg aufg = (aufg) obj;
            int i = this.b;
            if (i == aufg.b) {
                int[] iArr = this.c;
                int[] iArr2 = aufg.c;
                int i2 = 0;
                while (true) {
                    if (i2 < i) {
                        if (iArr[i2] != iArr2[i2]) {
                            break;
                        }
                        i2++;
                    } else {
                        Object[] objArr = this.d;
                        Object[] objArr2 = aufg.d;
                        int i3 = this.b;
                        int i4 = 0;
                        while (i4 < i3) {
                            if (objArr[i4].equals(objArr2[i4])) {
                                i4++;
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = (i + 527) * 31;
        int[] iArr = this.c;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.d;
        int i7 = this.b;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    private aufg(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    static aufg a(aufg aufg, aufg aufg2) {
        int i = aufg.b + aufg2.b;
        int[] copyOf = Arrays.copyOf(aufg.c, i);
        System.arraycopy(aufg2.c, 0, copyOf, aufg.b, aufg2.b);
        Object[] copyOf2 = Arrays.copyOf(aufg.d, i);
        System.arraycopy(aufg2.d, 0, copyOf2, aufg.b, aufg2.b);
        return new aufg(i, copyOf, copyOf2, true);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, Object obj) {
        int i2;
        if (this.f) {
            int i3 = this.b;
            int[] iArr = this.c;
            if (i3 == iArr.length) {
                if (i3 >= 4) {
                    i2 = i3 >> 1;
                } else {
                    i2 = 8;
                }
                int i4 = i3 + i2;
                this.c = Arrays.copyOf(iArr, i4);
                this.d = Arrays.copyOf(this.d, i4);
            }
            int[] iArr2 = this.c;
            int i5 = this.b;
            iArr2[i5] = i;
            this.d[i5] = obj;
            this.b = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void a(aubl aubl) {
        if (this.b != 0) {
            for (int i = 0; i < this.b; i++) {
                int i2 = this.c[i];
                Object obj = this.d[i];
                int b2 = aufy.b(i2);
                int a2 = aufy.a(i2);
                if (a2 == 0) {
                    aubl.a(b2, ((Long) obj).longValue());
                } else if (a2 == 1) {
                    aubl.d(b2, ((Long) obj).longValue());
                } else if (a2 == 2) {
                    aubl.a(b2, (auay) obj);
                } else if (a2 == 3) {
                    aubl.a.b(b2, 3);
                    ((aufg) obj).a(aubl);
                    aubl.a.b(b2, 4);
                } else if (a2 == 5) {
                    aubl.d(b2, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(auda.f());
                }
            }
        }
    }
}
