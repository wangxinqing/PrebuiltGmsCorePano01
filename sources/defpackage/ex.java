package defpackage;

import java.util.Arrays;

/* renamed from: ex  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ex {
    public int a = 0;
    public final ez b;
    public int[] c = new int[8];
    public int[] d = new int[8];
    public float[] e = new float[8];
    public int f = -1;
    public int g = -1;
    public boolean h = false;
    private final ey i;
    private int j = 8;

    public ex(ey eyVar, ez ezVar) {
        this.i = eyVar;
        this.b = ezVar;
    }

    public final float a(fd fdVar) {
        int i2 = this.f;
        if (i2 != -1) {
            int i3 = 0;
            int i4 = -1;
            while (i2 != -1 && i3 < this.a) {
                int i5 = this.c[i2];
                if (i5 != fdVar.a) {
                    i3++;
                    i4 = i2;
                    i2 = this.d[i2];
                } else {
                    if (i2 != this.f) {
                        int[] iArr = this.d;
                        iArr[i4] = iArr[i2];
                    } else {
                        this.f = this.d[i2];
                    }
                    this.b.a[i5].a(this.i);
                    this.a--;
                    this.c[i2] = -1;
                    if (this.h) {
                        this.g = i2;
                    }
                    return this.e[i2];
                }
            }
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public final float b(int i2) {
        int i3 = this.f;
        int i4 = 0;
        while (i3 != -1 && i4 < this.a) {
            if (i4 == i2) {
                return this.e[i3];
            }
            i3 = this.d[i3];
            i4++;
        }
        return 0.0f;
    }

    public final String toString() {
        int i2 = this.f;
        String str = "";
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            str = ((str + " -> ") + this.e[i2] + " : ") + this.b.a[this.c[i2]];
            i2 = this.d[i2];
            i3++;
        }
        return str;
    }

    public final float b(fd fdVar) {
        int i2 = this.f;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            if (this.c[i2] == fdVar.a) {
                return this.e[i2];
            }
            i2 = this.d[i2];
            i3++;
        }
        return 0.0f;
    }

    public final void b(fd fdVar, float f2) {
        if (f2 != 0.0f) {
            int i2 = this.f;
            if (i2 == -1) {
                this.f = 0;
                this.e[0] = f2;
                this.c[0] = fdVar.a;
                this.d[0] = -1;
                this.a++;
                if (!this.h) {
                    this.g++;
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i2 != -1 && i3 < this.a) {
                int i5 = this.c[i2];
                int i6 = fdVar.a;
                if (i5 == i6) {
                    float[] fArr = this.e;
                    float f3 = fArr[i2] + f2;
                    fArr[i2] = f3;
                    if (f3 == 0.0f) {
                        if (i2 != this.f) {
                            int[] iArr = this.d;
                            iArr[i4] = iArr[i2];
                        } else {
                            this.f = this.d[i2];
                        }
                        this.b.a[i5].a(this.i);
                        if (this.h) {
                            this.g = i2;
                        }
                        this.a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i4 = i2;
                }
                i2 = this.d[i2];
                i3++;
            }
            int i7 = this.g;
            int i8 = i7 + 1;
            if (this.h) {
                int[] iArr2 = this.c;
                if (iArr2[i7] != -1) {
                    i7 = iArr2.length;
                }
            } else {
                i7 = i8;
            }
            int length = this.c.length;
            if (i7 >= length && this.a < length) {
                int i9 = 0;
                while (true) {
                    int[] iArr3 = this.c;
                    if (i9 < iArr3.length) {
                        if (iArr3[i9] == -1) {
                            i7 = i9;
                            break;
                        }
                        i9++;
                    } else {
                        break;
                    }
                }
            }
            int length2 = this.c.length;
            if (i7 >= length2) {
                int i10 = this.j;
                int i11 = i10 + i10;
                this.j = i11;
                this.h = false;
                this.g = length2 - 1;
                this.e = Arrays.copyOf(this.e, i11);
                this.c = Arrays.copyOf(this.c, this.j);
                this.d = Arrays.copyOf(this.d, this.j);
                i7 = length2;
            }
            int[] iArr4 = this.c;
            iArr4[i7] = fdVar.a;
            this.e[i7] = f2;
            if (i4 != -1) {
                int[] iArr5 = this.d;
                iArr5[i7] = iArr5[i4];
                iArr5[i4] = i7;
            } else {
                this.d[i7] = this.f;
                this.f = i7;
            }
            this.a++;
            if (!this.h) {
                this.g++;
            }
            int i12 = this.g;
            int length3 = iArr4.length;
            if (i12 >= length3) {
                this.h = true;
                this.g = length3 - 1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final fd a(int i2) {
        int i3 = this.f;
        int i4 = 0;
        while (i3 != -1 && i4 < this.a) {
            if (i4 == i2) {
                return this.b.a[this.c[i3]];
            }
            i3 = this.d[i3];
            i4++;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void a(ey eyVar, ey eyVar2) {
        int i2 = this.f;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            int i4 = this.c[i2];
            fd fdVar = eyVar2.a;
            if (i4 == fdVar.a) {
                float f2 = this.e[i2];
                a(fdVar);
                ex exVar = eyVar2.d;
                int i5 = exVar.f;
                int i6 = 0;
                while (i5 != -1 && i6 < exVar.a) {
                    b(this.b.a[exVar.c[i5]], exVar.e[i5] * f2);
                    i5 = exVar.d[i5];
                    i6++;
                }
                eyVar.b += eyVar2.b * f2;
                eyVar2.a.a(eyVar);
                i2 = this.f;
                i3 = 0;
            } else {
                i2 = this.d[i2];
                i3++;
            }
        }
    }

    public final void a(fd fdVar, float f2) {
        if (f2 != 0.0f) {
            int i2 = this.f;
            if (i2 == -1) {
                this.f = 0;
                this.e[0] = f2;
                this.c[0] = fdVar.a;
                this.d[0] = -1;
                this.a++;
                if (!this.h) {
                    this.g++;
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i2 != -1 && i3 < this.a) {
                int i5 = this.c[i2];
                int i6 = fdVar.a;
                if (i5 == i6) {
                    this.e[i2] = f2;
                    return;
                }
                if (i5 < i6) {
                    i4 = i2;
                }
                i2 = this.d[i2];
                i3++;
            }
            int i7 = this.g;
            int i8 = i7 + 1;
            if (this.h) {
                int[] iArr = this.c;
                if (iArr[i7] != -1) {
                    i7 = iArr.length;
                }
            } else {
                i7 = i8;
            }
            int length = this.c.length;
            if (i7 >= length && this.a < length) {
                int i9 = 0;
                while (true) {
                    int[] iArr2 = this.c;
                    if (i9 < iArr2.length) {
                        if (iArr2[i9] == -1) {
                            i7 = i9;
                            break;
                        }
                        i9++;
                    } else {
                        break;
                    }
                }
            }
            int length2 = this.c.length;
            if (i7 >= length2) {
                int i10 = this.j;
                int i11 = i10 + i10;
                this.j = i11;
                this.h = false;
                this.g = length2 - 1;
                this.e = Arrays.copyOf(this.e, i11);
                this.c = Arrays.copyOf(this.c, this.j);
                this.d = Arrays.copyOf(this.d, this.j);
                i7 = length2;
            }
            int[] iArr3 = this.c;
            iArr3[i7] = fdVar.a;
            this.e[i7] = f2;
            if (i4 != -1) {
                int[] iArr4 = this.d;
                iArr4[i7] = iArr4[i4];
                iArr4[i4] = i7;
            } else {
                this.d[i7] = this.f;
                this.f = i7;
            }
            int i12 = this.a + 1;
            this.a = i12;
            if (!this.h) {
                this.g++;
            }
            if (i12 >= iArr3.length) {
                this.h = true;
                return;
            }
            return;
        }
        a(fdVar);
    }
}
