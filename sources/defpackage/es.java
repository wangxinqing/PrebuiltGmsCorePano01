package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: es  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class es extends ViewGroup.MarginLayoutParams {
    public float A = 0.0f;
    public float B = 0.0f;
    public int C = 0;
    public int D = 0;
    public int E = 0;
    public int F = 0;
    public int G = 0;
    public int H = 0;
    public int I = 0;
    public int J = 0;
    public int K = -1;
    public int L = -1;
    public int M = -1;
    public boolean N = true;
    public boolean O = true;
    public boolean P = false;
    public boolean Q = false;
    public int R = -1;
    public int S = -1;
    public int T = -1;
    public int U = -1;
    public int V = -1;
    public int W = -1;
    public float X = 0.5f;
    public fg Y = new fg();
    public int a = -1;
    public int b = -1;
    public float c = -1.0f;
    public int d = -1;
    public int e = -1;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = -1;
    public int n = -1;
    public int o = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = -1;
    public int v = -1;
    public float w = 0.5f;
    public float x = 0.5f;
    public String y = null;
    int z = 1;

    public es() {
        super(-2, -2);
    }

    public final void a() {
        this.Q = false;
        this.N = true;
        this.O = true;
        if (this.width == 0 || this.width == -1) {
            this.N = false;
        }
        if (this.height == 0 || this.height == -1) {
            this.O = false;
        }
        if (this.c != -1.0f || this.a != -1 || this.b != -1) {
            this.Q = true;
            this.N = true;
            this.O = true;
            if (!(this.Y instanceof fi)) {
                this.Y = new fi();
            }
            ((fi) this.Y).h(this.M);
        }
    }

    public final void resolveLayoutDirection(int i2) {
        super.resolveLayoutDirection(i2);
        this.T = -1;
        this.U = -1;
        this.R = -1;
        this.S = -1;
        this.V = this.q;
        this.W = this.s;
        this.X = this.w;
        if (getLayoutDirection() == 1) {
            int i3 = this.m;
            if (i3 == -1) {
                int i4 = this.n;
                if (i4 != -1) {
                    this.U = i4;
                }
            } else {
                this.T = i3;
            }
            int i5 = this.o;
            if (i5 != -1) {
                this.S = i5;
            }
            int i6 = this.p;
            if (i6 != -1) {
                this.R = i6;
            }
            int i7 = this.u;
            if (i7 != -1) {
                this.W = i7;
            }
            int i8 = this.v;
            if (i8 != -1) {
                this.V = i8;
            }
            this.X = 1.0f - this.w;
        } else {
            int i9 = this.m;
            if (i9 != -1) {
                this.S = i9;
            }
            int i10 = this.n;
            if (i10 != -1) {
                this.R = i10;
            }
            int i11 = this.o;
            if (i11 != -1) {
                this.T = i11;
            }
            int i12 = this.p;
            if (i12 != -1) {
                this.U = i12;
            }
            int i13 = this.u;
            if (i13 != -1) {
                this.V = i13;
            }
            int i14 = this.v;
            if (i14 != -1) {
                this.W = i14;
            }
        }
        if (this.o == -1 && this.p == -1) {
            int i15 = this.f;
            if (i15 == -1) {
                int i16 = this.g;
                if (i16 != -1) {
                    this.U = i16;
                }
            } else {
                this.T = i15;
            }
        }
        if (this.n == -1 && this.m == -1) {
            int i17 = this.d;
            if (i17 == -1) {
                int i18 = this.e;
                if (i18 != -1) {
                    this.S = i18;
                    return;
                }
                return;
            }
            this.R = i17;
        }
    }

    public es(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ew.a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            if (index == 59) {
                int resourceId = obtainStyledAttributes.getResourceId(59, this.d);
                this.d = resourceId;
                if (resourceId == -1) {
                    this.d = obtainStyledAttributes.getInt(59, -1);
                }
            } else if (index == 60) {
                int resourceId2 = obtainStyledAttributes.getResourceId(60, this.e);
                this.e = resourceId2;
                if (resourceId2 == -1) {
                    this.e = obtainStyledAttributes.getInt(60, -1);
                }
            } else if (index == 62) {
                int resourceId3 = obtainStyledAttributes.getResourceId(62, this.f);
                this.f = resourceId3;
                if (resourceId3 == -1) {
                    this.f = obtainStyledAttributes.getInt(62, -1);
                }
            } else if (index == 63) {
                int resourceId4 = obtainStyledAttributes.getResourceId(63, this.g);
                this.g = resourceId4;
                if (resourceId4 == -1) {
                    this.g = obtainStyledAttributes.getInt(63, -1);
                }
            } else if (index == 69) {
                int resourceId5 = obtainStyledAttributes.getResourceId(69, this.h);
                this.h = resourceId5;
                if (resourceId5 == -1) {
                    this.h = obtainStyledAttributes.getInt(69, -1);
                }
            } else if (index == 68) {
                int resourceId6 = obtainStyledAttributes.getResourceId(68, this.i);
                this.i = resourceId6;
                if (resourceId6 == -1) {
                    this.i = obtainStyledAttributes.getInt(68, -1);
                }
            } else if (index == 41) {
                int resourceId7 = obtainStyledAttributes.getResourceId(41, this.j);
                this.j = resourceId7;
                if (resourceId7 == -1) {
                    this.j = obtainStyledAttributes.getInt(41, -1);
                }
            } else if (index == 40) {
                int resourceId8 = obtainStyledAttributes.getResourceId(40, this.k);
                this.k = resourceId8;
                if (resourceId8 == -1) {
                    this.k = obtainStyledAttributes.getInt(40, -1);
                }
            } else if (index == 38) {
                int resourceId9 = obtainStyledAttributes.getResourceId(38, this.l);
                this.l = resourceId9;
                if (resourceId9 == -1) {
                    this.l = obtainStyledAttributes.getInt(38, -1);
                }
            } else if (index == 77) {
                this.K = obtainStyledAttributes.getDimensionPixelOffset(77, this.K);
            } else if (index == 78) {
                this.L = obtainStyledAttributes.getDimensionPixelOffset(78, this.L);
            } else if (index == 48) {
                this.a = obtainStyledAttributes.getDimensionPixelOffset(48, this.a);
            } else if (index == 49) {
                this.b = obtainStyledAttributes.getDimensionPixelOffset(49, this.b);
            } else if (index == 50) {
                this.c = obtainStyledAttributes.getFloat(50, this.c);
            } else if (index == 0) {
                this.M = obtainStyledAttributes.getInt(0, this.M);
            } else if (index == 64) {
                int resourceId10 = obtainStyledAttributes.getResourceId(64, this.m);
                this.m = resourceId10;
                if (resourceId10 == -1) {
                    this.m = obtainStyledAttributes.getInt(64, -1);
                }
            } else if (index == 65) {
                int resourceId11 = obtainStyledAttributes.getResourceId(65, this.n);
                this.n = resourceId11;
                if (resourceId11 == -1) {
                    this.n = obtainStyledAttributes.getInt(65, -1);
                }
            } else if (index == 47) {
                int resourceId12 = obtainStyledAttributes.getResourceId(47, this.o);
                this.o = resourceId12;
                if (resourceId12 == -1) {
                    this.o = obtainStyledAttributes.getInt(47, -1);
                }
            } else if (index == 46) {
                int resourceId13 = obtainStyledAttributes.getResourceId(46, this.p);
                this.p = resourceId13;
                if (resourceId13 == -1) {
                    this.p = obtainStyledAttributes.getInt(46, -1);
                }
            } else if (index == 81) {
                this.q = obtainStyledAttributes.getDimensionPixelSize(81, this.q);
            } else if (index == 84) {
                this.r = obtainStyledAttributes.getDimensionPixelSize(84, this.r);
            } else if (index == 82) {
                this.s = obtainStyledAttributes.getDimensionPixelSize(82, this.s);
            } else if (index == 79) {
                this.t = obtainStyledAttributes.getDimensionPixelSize(79, this.t);
            } else if (index == 83) {
                this.u = obtainStyledAttributes.getDimensionPixelSize(83, this.u);
            } else if (index == 80) {
                this.v = obtainStyledAttributes.getDimensionPixelSize(80, this.v);
            } else if (index == 55) {
                this.w = obtainStyledAttributes.getFloat(55, this.w);
            } else if (index == 70) {
                this.x = obtainStyledAttributes.getFloat(70, this.x);
            } else if (index == 45) {
                String string = obtainStyledAttributes.getString(45);
                this.y = string;
                this.z = -1;
                if (string != null) {
                    int length = string.length();
                    int indexOf = this.y.indexOf(44);
                    if (indexOf <= 0 || indexOf >= length - 1) {
                        i2 = 0;
                    } else {
                        String substring = this.y.substring(0, indexOf);
                        if (substring.equalsIgnoreCase("W")) {
                            this.z = 0;
                        } else if (substring.equalsIgnoreCase("H")) {
                            this.z = 1;
                        }
                        i2 = indexOf + 1;
                    }
                    int indexOf2 = this.y.indexOf(58);
                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                        String substring2 = this.y.substring(i2, indexOf2);
                        String substring3 = this.y.substring(indexOf2 + 1);
                        if (substring2.length() > 0 && substring3.length() > 0) {
                            try {
                                float parseFloat = Float.parseFloat(substring2);
                                float parseFloat2 = Float.parseFloat(substring3);
                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                    if (this.z != 1) {
                                        Math.abs(parseFloat / parseFloat2);
                                    } else {
                                        Math.abs(parseFloat2 / parseFloat);
                                    }
                                }
                            } catch (NumberFormatException e2) {
                            }
                        }
                    } else {
                        String substring4 = this.y.substring(i2);
                        if (substring4.length() > 0) {
                            Float.parseFloat(substring4);
                        }
                    }
                }
            } else if (index == 57) {
                this.A = obtainStyledAttributes.getFloat(57, 0.0f);
            } else if (index == 72) {
                this.B = obtainStyledAttributes.getFloat(72, 0.0f);
            } else if (index == 56) {
                this.C = obtainStyledAttributes.getInt(56, 0);
            } else if (index == 71) {
                this.D = obtainStyledAttributes.getInt(71, 0);
            } else if (index == 73) {
                this.E = obtainStyledAttributes.getInt(73, 0);
            } else if (index == 51) {
                this.F = obtainStyledAttributes.getInt(51, 0);
            } else if (index == 75) {
                this.G = obtainStyledAttributes.getDimensionPixelSize(75, this.G);
            } else if (index == 74) {
                this.I = obtainStyledAttributes.getDimensionPixelSize(74, this.I);
            } else if (index == 53) {
                this.H = obtainStyledAttributes.getDimensionPixelSize(53, this.H);
            } else if (index == 52) {
                this.J = obtainStyledAttributes.getDimensionPixelSize(52, this.J);
            }
        }
        obtainStyledAttributes.recycle();
        a();
    }

    public es(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
