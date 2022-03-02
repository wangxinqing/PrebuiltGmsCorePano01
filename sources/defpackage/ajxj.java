package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;

/* renamed from: ajxj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajxj {
    private ajyk A;
    private ajyk B;
    private CharSequence C;
    private float D;
    private float E;
    private int[] F;
    private boolean G;
    private final TextPaint H;
    private TimeInterpolator I;
    private float J;
    private float K;
    private float L;
    private ColorStateList M;
    private float N;
    private float O;
    private float P;
    private ColorStateList Q;
    private StaticLayout R;
    private float S;
    private float T;
    private float U;
    private CharSequence V;
    public float a;
    public final Rect b;
    public float c = 15.0f;
    public ColorStateList d;
    public Typeface e;
    public CharSequence f;
    public boolean g;
    public final TextPaint h;
    public TimeInterpolator i;
    public int j = 1;
    private final View k;
    private boolean l;
    private final Rect m;
    private final RectF n;
    private int o = 16;
    private int p = 16;
    private float q = 15.0f;
    private ColorStateList r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private float x;
    private Typeface y;
    private Typeface z;

    static {
        int i2 = Build.VERSION.SDK_INT;
    }

    public ajxj(View view) {
        this.k = view;
        this.H = new TextPaint(129);
        this.h = new TextPaint(this.H);
        this.b = new Rect();
        this.m = new Rect();
        this.n = new RectF();
    }

    private static float a(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return ajrr.a(f2, f3, f4);
    }

    private final int c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.F;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    private final void d(float f2) {
        boolean z2;
        float f3;
        boolean z3;
        int i2;
        StaticLayout staticLayout;
        TextDirectionHeuristic textDirectionHeuristic;
        boolean z4;
        boolean z5;
        boolean z6;
        float f4 = f2;
        if (this.f != null) {
            float width = (float) this.b.width();
            float width2 = (float) this.m.width();
            if (a(f4, this.q)) {
                f3 = this.q;
                this.D = 1.0f;
                Typeface typeface = this.z;
                Typeface typeface2 = this.y;
                if (typeface != typeface2) {
                    this.z = typeface2;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                float f5 = this.c;
                Typeface typeface3 = this.z;
                Typeface typeface4 = this.e;
                if (typeface3 != typeface4) {
                    this.z = typeface4;
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!a(f4, f5)) {
                    this.D = f4 / this.c;
                } else {
                    this.D = 1.0f;
                }
                float f6 = this.q / this.c;
                width = width2 * f6 > width ? Math.min(width / f6, width2) : width2;
                f3 = f5;
                z2 = z6;
            }
            StaticLayout staticLayout2 = null;
            if (width > 0.0f) {
                if (this.E == f3) {
                    if (this.G) {
                        z5 = true;
                    } else if (!z2) {
                        z5 = false;
                    }
                    this.E = f3;
                    this.G = false;
                }
                z5 = true;
                this.E = f3;
                this.G = false;
            }
            if (this.C == null || z2) {
                this.H.setTextSize(this.E);
                this.H.setTypeface(this.z);
                TextPaint textPaint = this.H;
                if (this.D != 1.0f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                textPaint.setLinearText(z3);
                this.g = a(this.f);
                if (g()) {
                    i2 = this.j;
                } else {
                    i2 = 1;
                }
                boolean z7 = this.g;
                try {
                    ajxu ajxu = new ajxu(this.f, this.H, (int) width);
                    ajxu.l = TextUtils.TruncateAt.END;
                    ajxu.k = z7;
                    ajxu.h = Layout.Alignment.ALIGN_NORMAL;
                    ajxu.j = false;
                    ajxu.i = i2;
                    if (ajxu.d == null) {
                        ajxu.d = "";
                    }
                    int max = Math.max(0, ajxu.f);
                    CharSequence charSequence = ajxu.d;
                    if (ajxu.i == 1) {
                        charSequence = TextUtils.ellipsize(charSequence, ajxu.e, (float) max, ajxu.l);
                    }
                    ajxu.g = Math.min(charSequence.length(), ajxu.g);
                    if (Build.VERSION.SDK_INT < 23) {
                        if (!ajxu.a) {
                            try {
                                if (!ajxu.k || Build.VERSION.SDK_INT < 23) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                int i3 = Build.VERSION.SDK_INT;
                                Class<TextDirectionHeuristic> cls = TextDirectionHeuristic.class;
                                ajxu.c = !z4 ? TextDirectionHeuristics.LTR : TextDirectionHeuristics.RTL;
                                ajxu.b = StaticLayout.class.getDeclaredConstructor(new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, cls, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE});
                                ajxu.b.setAccessible(true);
                                ajxu.a = true;
                            } catch (Exception e2) {
                                throw new ajxt(e2);
                            } catch (ajxt e3) {
                                e = e3;
                                Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
                                staticLayout = staticLayout2;
                                ot.a((Object) staticLayout);
                                this.R = staticLayout;
                                this.C = staticLayout.getText();
                            }
                        }
                        try {
                            Constructor constructor = ajxu.b;
                            ot.a((Object) constructor);
                            Object[] objArr = new Object[13];
                            objArr[0] = charSequence;
                            objArr[1] = 0;
                            objArr[2] = Integer.valueOf(ajxu.g);
                            objArr[3] = ajxu.e;
                            Integer valueOf = Integer.valueOf(max);
                            objArr[4] = valueOf;
                            objArr[5] = ajxu.h;
                            Object obj = ajxu.c;
                            ot.a(obj);
                            objArr[6] = obj;
                            objArr[7] = Float.valueOf(1.0f);
                            objArr[8] = Float.valueOf(0.0f);
                            objArr[9] = Boolean.valueOf(ajxu.j);
                            staticLayout2 = null;
                            try {
                                objArr[10] = null;
                                objArr[11] = valueOf;
                                objArr[12] = Integer.valueOf(ajxu.i);
                                staticLayout = (StaticLayout) constructor.newInstance(objArr);
                            } catch (Exception e4) {
                                e = e4;
                                throw new ajxt(e);
                            }
                        } catch (Exception e5) {
                            e = e5;
                            staticLayout2 = null;
                            throw new ajxt(e);
                        }
                    } else {
                        if (ajxu.k) {
                            ajxu.h = Layout.Alignment.ALIGN_OPPOSITE;
                        }
                        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, ajxu.g, ajxu.e, max);
                        obtain.setAlignment(ajxu.h);
                        obtain.setIncludePad(ajxu.j);
                        if (ajxu.k) {
                            textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        } else {
                            textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        }
                        obtain.setTextDirection(textDirectionHeuristic);
                        TextUtils.TruncateAt truncateAt = ajxu.l;
                        if (truncateAt != null) {
                            obtain.setEllipsize(truncateAt);
                        }
                        obtain.setMaxLines(ajxu.i);
                        staticLayout = obtain.build();
                    }
                } catch (ajxt e6) {
                    e = e6;
                    staticLayout2 = null;
                    Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
                    staticLayout = staticLayout2;
                    ot.a((Object) staticLayout);
                    this.R = staticLayout;
                    this.C = staticLayout.getText();
                }
                ot.a((Object) staticLayout);
                this.R = staticLayout;
                this.C = staticLayout.getText();
            }
        }
    }

    private final void f() {
        float f2 = this.a;
        this.n.left = a((float) this.m.left, (float) this.b.left, f2, this.i);
        this.n.top = a(this.s, this.t, f2, this.i);
        this.n.right = a((float) this.m.right, (float) this.b.right, f2, this.i);
        this.n.bottom = a((float) this.m.bottom, (float) this.b.bottom, f2, this.i);
        this.w = a(this.u, this.v, f2, this.i);
        this.x = a(this.s, this.t, f2, this.i);
        c(a(this.c, this.q, f2, this.I));
        this.S = 1.0f - a(0.0f, 1.0f, 1.0f - f2, ajrr.b);
        qb.e(this.k);
        this.T = a(1.0f, 0.0f, f2, ajrr.b);
        qb.e(this.k);
        ColorStateList colorStateList = this.d;
        ColorStateList colorStateList2 = this.r;
        if (colorStateList != colorStateList2) {
            this.H.setColor(a(c(colorStateList2), d(), f2));
        } else {
            this.H.setColor(d());
        }
        this.H.setShadowLayer(a(this.N, this.J, f2, (TimeInterpolator) null), a(this.O, this.K, f2, (TimeInterpolator) null), a(this.P, this.L, f2, (TimeInterpolator) null), a(c(this.Q), c(this.M), f2));
        qb.e(this.k);
    }

    private final boolean g() {
        return this.j > 1 && !this.g;
    }

    public final float b() {
        a(this.h);
        return -this.h.ascent();
    }

    public final void e() {
        float f2;
        float f3;
        float f4;
        float f5;
        StaticLayout staticLayout;
        if (this.k.getHeight() > 0 && this.k.getWidth() > 0) {
            float f6 = this.E;
            d(this.q);
            CharSequence charSequence = this.C;
            if (!(charSequence == null || (staticLayout = this.R) == null)) {
                this.V = TextUtils.ellipsize(charSequence, this.H, (float) staticLayout.getWidth(), TextUtils.TruncateAt.END);
            }
            CharSequence charSequence2 = this.V;
            float f7 = 0.0f;
            if (charSequence2 != null) {
                f2 = this.H.measureText(charSequence2, 0, charSequence2.length());
            } else {
                f2 = 0.0f;
            }
            int a2 = pd.a(this.p, this.g ? 1 : 0);
            StaticLayout staticLayout2 = this.R;
            if (staticLayout2 != null) {
                f3 = (float) staticLayout2.getHeight();
            } else {
                f3 = 0.0f;
            }
            int i2 = a2 & 112;
            if (i2 == 48) {
                this.t = ((float) this.b.top) - this.H.ascent();
            } else if (i2 != 80) {
                float descent = (this.H.descent() - this.H.ascent()) / 2.0f;
                this.t = g() ? ((float) this.b.centerY()) - descent : (descent - this.H.descent()) + ((float) this.b.centerY());
            } else {
                this.t = (float) this.b.bottom;
            }
            int i3 = a2 & 8388615;
            if (i3 == 1) {
                this.v = ((float) this.b.centerX()) - (f2 / 2.0f);
            } else if (i3 != 5) {
                this.v = (float) this.b.left;
            } else {
                this.v = ((float) this.b.right) - f2;
            }
            d(this.c);
            CharSequence charSequence3 = this.C;
            if (charSequence3 != null) {
                f4 = this.H.measureText(charSequence3, 0, charSequence3.length());
            } else {
                f4 = 0.0f;
            }
            StaticLayout staticLayout3 = this.R;
            if (staticLayout3 != null && this.j > 1 && !this.g) {
                f4 = staticLayout3.getLineWidth(0);
            }
            StaticLayout staticLayout4 = this.R;
            if (staticLayout4 != null) {
                f5 = staticLayout4.getLineLeft(0);
            } else {
                f5 = 0.0f;
            }
            this.U = f5;
            int a3 = pd.a(this.o, this.g ? 1 : 0);
            int i4 = a3 & 112;
            if (i4 == 48) {
                this.s = ((float) this.m.top) - this.H.ascent();
            } else if (i4 != 80) {
                this.s = g() ? ((float) this.m.centerY()) - (f3 / 2.0f) : (((this.H.descent() - this.H.ascent()) / 2.0f) - this.H.descent()) + ((float) this.m.centerY());
            } else {
                if (g()) {
                    f7 = f3 - this.H.descent();
                }
                this.s = ((float) this.m.bottom) - f7;
            }
            int i5 = a3 & 8388615;
            if (i5 == 1) {
                this.u = ((float) this.m.centerX()) - (f4 / 2.0f);
            } else if (i5 != 5) {
                this.u = (float) this.m.left;
            } else {
                this.u = ((float) this.m.right) - f4;
            }
            c(f6);
            f();
        }
    }

    private static int a(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((((float) Color.alpha(i2)) * f3) + (((float) Color.alpha(i3)) * f2)), (int) ((((float) Color.red(i2)) * f3) + (((float) Color.red(i3)) * f2)), (int) ((((float) Color.green(i2)) * f3) + (((float) Color.green(i3)) * f2)), (int) ((((float) Color.blue(i2)) * f3) + (((float) Color.blue(i3)) * f2)));
    }

    private final void c(float f2) {
        d(f2);
        qb.e(this.k);
    }

    public final void b(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.a) {
            this.a = f2;
            f();
        }
    }

    private final void a(TextPaint textPaint) {
        textPaint.setTextSize(this.q);
        textPaint.setTypeface(this.y);
    }

    public final void b(int i2) {
        if (this.p != i2) {
            this.p = i2;
            e();
        }
    }

    private static boolean a(float f2, float f3) {
        return Math.abs(f2 - f3) < 0.001f;
    }

    public final void b(int i2, int i3, int i4, int i5) {
        if (!a(this.b, i2, i3, i4, i5)) {
            this.b.set(i2, i3, i4, i5);
            this.G = true;
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        boolean z2 = false;
        if (this.b.width() > 0 && this.b.height() > 0 && this.m.width() > 0 && this.m.height() > 0) {
            z2 = true;
        }
        this.l = z2;
    }

    private static boolean a(Rect rect, int i2, int i3, int i4, int i5) {
        return rect.left == i2 && rect.top == i3 && rect.right == i4 && rect.bottom == i5;
    }

    public final void c(int i2) {
        ajyq ajyq = new ajyq(this.k.getContext(), i2);
        ColorStateList colorStateList = ajyq.b;
        if (colorStateList != null) {
            this.d = colorStateList;
        }
        float f2 = ajyq.a;
        if (f2 != 0.0f) {
            this.q = f2;
        }
        ColorStateList colorStateList2 = ajyq.f;
        if (colorStateList2 != null) {
            this.M = colorStateList2;
        }
        this.K = ajyq.g;
        this.L = ajyq.h;
        this.J = ajyq.i;
        ajyk ajyk = this.B;
        if (ajyk != null) {
            ajyk.a();
        }
        this.B = new ajyk(new ajxh(this), ajyq.a());
        ajyq.a(this.k.getContext(), (ajyr) this.B);
        e();
    }

    public final float a() {
        if (this.f == null) {
            return 0.0f;
        }
        a(this.h);
        TextPaint textPaint = this.h;
        CharSequence charSequence = this.f;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final void b(ColorStateList colorStateList) {
        if (this.r != colorStateList) {
            this.r = colorStateList;
            e();
        }
    }

    public final void a(float f2) {
        if (this.c != f2) {
            this.c = f2;
            e();
        }
    }

    public final void b(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f, charSequence)) {
            this.f = charSequence;
            this.C = null;
            e();
        }
    }

    public final void a(int i2) {
        if (this.o != i2) {
            this.o = i2;
            e();
        }
    }

    public final void a(int i2, int i3, int i4, int i5) {
        if (!a(this.m, i2, i3, i4, i5)) {
            this.m.set(i2, i3, i4, i5);
            this.G = true;
            c();
        }
    }

    public final boolean b(Typeface typeface) {
        ajyk ajyk = this.A;
        if (ajyk != null) {
            ajyk.a();
        }
        if (this.e == typeface) {
            return false;
        }
        this.e = typeface;
        return true;
    }

    public final void a(TimeInterpolator timeInterpolator) {
        this.I = timeInterpolator;
        e();
    }

    public final void a(ColorStateList colorStateList) {
        if (this.d != colorStateList) {
            this.d = colorStateList;
            e();
        }
    }

    public final void a(Canvas canvas) {
        int save = canvas.save();
        if (this.C != null && this.l) {
            float f2 = this.w;
            float lineLeft = this.R.getLineLeft(0);
            float f3 = this.U;
            float f4 = (f2 + lineLeft) - (f3 + f3);
            this.H.setTextSize(this.E);
            float f5 = this.w;
            float f6 = this.x;
            float lineAscent = (float) this.R.getLineAscent(0);
            float f7 = this.D;
            if (f7 != 1.0f) {
                canvas.scale(f7, f7, f5, f6);
            }
            if (!g()) {
                canvas.translate(f5, f6 + lineAscent);
                this.R.draw(canvas);
            } else {
                int alpha = this.H.getAlpha();
                canvas.translate(f4, f6);
                float f8 = (float) alpha;
                this.H.setAlpha((int) (this.T * f8));
                this.R.draw(canvas);
                canvas.translate(f5 - f4, 0.0f);
                this.H.setAlpha((int) (this.S * f8));
                CharSequence charSequence = this.V;
                float f9 = -lineAscent;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f9 / this.D, this.H);
                String trim = this.V.toString().trim();
                String substring = trim.endsWith("…") ? trim.substring(0, trim.length() - 1) : trim;
                this.H.setAlpha(alpha);
                canvas.drawText(substring, 0, Math.min(this.R.getLineEnd(0), substring.length()), 0.0f, f9 / this.D, this.H);
            }
            canvas.restoreToCount(save);
        }
    }

    public final boolean a(Typeface typeface) {
        ajyk ajyk = this.B;
        if (ajyk != null) {
            ajyk.a();
        }
        if (this.y == typeface) {
            return false;
        }
        this.y = typeface;
        return true;
    }

    public final boolean a(CharSequence charSequence) {
        np npVar;
        if (qb.h(this.k) != 1) {
            npVar = nw.c;
        } else {
            npVar = nw.d;
        }
        return npVar.a(charSequence, charSequence.length());
    }

    public final int d() {
        return c(this.d);
    }

    public final void d(int i2) {
        ajyq ajyq = new ajyq(this.k.getContext(), i2);
        ColorStateList colorStateList = ajyq.b;
        if (colorStateList != null) {
            this.r = colorStateList;
        }
        float f2 = ajyq.a;
        if (f2 != 0.0f) {
            this.c = f2;
        }
        ColorStateList colorStateList2 = ajyq.f;
        if (colorStateList2 != null) {
            this.Q = colorStateList2;
        }
        this.O = ajyq.g;
        this.P = ajyq.h;
        this.N = ajyq.i;
        ajyk ajyk = this.A;
        if (ajyk != null) {
            ajyk.a();
        }
        this.A = new ajyk(new ajxi(this), ajyq.a());
        ajyq.a(this.k.getContext(), (ajyr) this.A);
        e();
    }

    public final boolean a(int[] iArr) {
        ColorStateList colorStateList;
        this.F = iArr;
        ColorStateList colorStateList2 = this.d;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = this.r) == null || !colorStateList.isStateful())) {
            return false;
        }
        e();
        return true;
    }
}
