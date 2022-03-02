package defpackage;

import java.util.Arrays;

/* renamed from: ey  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ey {
    public fd a = null;
    public float b = 0.0f;
    boolean c = false;
    public final ex d;
    boolean e = false;

    public ey(ez ezVar) {
        this.d = new ex(this, ezVar);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        ex exVar = this.d;
        int i = exVar.f;
        int i2 = 0;
        while (i != -1 && i2 < exVar.a) {
            fd fdVar = exVar.b.a[exVar.c[i]];
            int i3 = 0;
            while (true) {
                int i4 = fdVar.g;
                if (i3 < i4) {
                    if (fdVar.f[i3] == this) {
                        break;
                    }
                    i3++;
                } else {
                    ey[] eyVarArr = fdVar.f;
                    int length = eyVarArr.length;
                    if (i4 >= length) {
                        fdVar.f = (ey[]) Arrays.copyOf(eyVarArr, length + length);
                    }
                    ey[] eyVarArr2 = fdVar.f;
                    int i5 = fdVar.g;
                    eyVarArr2[i5] = this;
                    fdVar.g = i5 + 1;
                }
            }
            i = exVar.d[i];
            i2++;
        }
    }

    public final void b(fd fdVar, fd fdVar2, fd fdVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = (float) i;
            if (z) {
                this.d.a(fdVar, 1.0f);
                this.d.a(fdVar2, -1.0f);
                this.d.a(fdVar3, 1.0f);
                return;
            }
        }
        this.d.a(fdVar, -1.0f);
        this.d.a(fdVar2, 1.0f);
        this.d.a(fdVar3, -1.0f);
    }

    public final String toString() {
        String str;
        boolean z;
        String str2;
        if (this.a != null) {
            str = "" + this.a;
        } else {
            str = "0";
        }
        String str3 = str + " = ";
        if (this.b != 0.0f) {
            str3 = str3 + this.b;
            z = true;
        } else {
            z = false;
        }
        int i = this.d.a;
        for (int i2 = 0; i2 < i; i2++) {
            fd a2 = this.d.a(i2);
            if (a2 != null) {
                float b2 = this.d.b(i2);
                String fdVar = a2.toString();
                if (z) {
                    if (b2 <= 0.0f) {
                        str2 = str2 + " - ";
                        b2 = -b2;
                    } else {
                        str2 = str2 + " + ";
                    }
                } else if (b2 < 0.0f) {
                    str2 = str2 + "- ";
                    b2 = -b2;
                }
                if (b2 != 1.0f) {
                    str2 = str2 + b2 + " " + fdVar;
                } else {
                    str2 = str2 + fdVar;
                }
                z = true;
            }
        }
        if (z) {
            return str2;
        }
        return str2 + "0.0";
    }

    public final void a(float f, float f2, float f3, fd fdVar, int i, fd fdVar2, int i2, fd fdVar3, int i3, fd fdVar4, int i4) {
        if (f2 == 0.0f || f == f3) {
            this.b = (float) (((-i) - i2) + i3 + i4);
            this.d.a(fdVar, 1.0f);
            this.d.a(fdVar2, -1.0f);
            this.d.a(fdVar4, 1.0f);
            this.d.a(fdVar3, -1.0f);
            return;
        }
        float f4 = (f / f2) / (f3 / f2);
        this.b = ((float) ((-i) - i2)) + (((float) i3) * f4) + (((float) i4) * f4);
        this.d.a(fdVar, 1.0f);
        this.d.a(fdVar2, -1.0f);
        this.d.a(fdVar4, f4);
        this.d.a(fdVar3, -f4);
    }

    public final void a(ey eyVar) {
        this.d.a(this, eyVar);
    }

    public final void a(fd fdVar) {
        fd fdVar2 = this.a;
        if (fdVar2 != null) {
            this.d.a(fdVar2, -1.0f);
            this.a = null;
        }
        float f = -this.d.a(fdVar);
        this.a = fdVar;
        if (f != 1.0f) {
            this.b /= f;
            ex exVar = this.d;
            int i = exVar.f;
            int i2 = 0;
            while (i != -1 && i2 < exVar.a) {
                float[] fArr = exVar.e;
                fArr[i] = fArr[i] / f;
                i = exVar.d[i];
                i2++;
            }
        }
    }

    public final void a(fd fdVar, int i) {
        if (i < 0) {
            this.b = (float) (-i);
            this.d.a(fdVar, 1.0f);
            return;
        }
        this.b = (float) i;
        this.d.a(fdVar, -1.0f);
    }

    public final void a(fd fdVar, fd fdVar2) {
        this.d.a(fdVar, 1.0f);
        this.d.a(fdVar2, -1.0f);
    }

    public final void a(fd fdVar, fd fdVar2, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = (float) i;
            if (z) {
                this.d.a(fdVar, 1.0f);
                this.d.a(fdVar2, -1.0f);
                return;
            }
        }
        this.d.a(fdVar, -1.0f);
        this.d.a(fdVar2, 1.0f);
    }

    /* access modifiers changed from: package-private */
    public final void a(fd fdVar, fd fdVar2, int i, float f, fd fdVar3, fd fdVar4, int i2) {
        if (fdVar2 == fdVar3) {
            this.d.a(fdVar, 1.0f);
            this.d.a(fdVar4, 1.0f);
            this.d.a(fdVar2, -2.0f);
        } else if (f == 0.5f) {
            this.d.a(fdVar, 1.0f);
            this.d.a(fdVar2, -1.0f);
            this.d.a(fdVar3, -1.0f);
            this.d.a(fdVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.b = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            this.d.a(fdVar, -1.0f);
            this.d.a(fdVar2, 1.0f);
            this.b = (float) i;
        } else if (f < 1.0f) {
            float f2 = 1.0f - f;
            this.d.a(fdVar, f2);
            this.d.a(fdVar2, -f2);
            this.d.a(fdVar3, -f);
            this.d.a(fdVar4, f);
            if (i > 0 || i2 > 0) {
                this.b = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        } else {
            this.d.a(fdVar3, -1.0f);
            this.d.a(fdVar4, 1.0f);
            this.b = (float) i2;
        }
    }

    public final void a(fd fdVar, fd fdVar2, fd fdVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = (float) i;
            if (z) {
                this.d.a(fdVar, 1.0f);
                this.d.a(fdVar2, -1.0f);
                this.d.a(fdVar3, -1.0f);
                return;
            }
        }
        this.d.a(fdVar, -1.0f);
        this.d.a(fdVar2, 1.0f);
        this.d.a(fdVar3, 1.0f);
    }

    public final void a(fd fdVar, fd fdVar2, fd fdVar3, fd fdVar4, float f) {
        this.d.a(fdVar, -1.0f);
        this.d.a(fdVar2, 1.0f);
        this.d.a(fdVar3, f);
        this.d.a(fdVar4, -f);
    }
}
