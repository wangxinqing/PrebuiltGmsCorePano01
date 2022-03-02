package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* renamed from: aas  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aas extends acq implements acx {
    private static final int[] r = {16842919};
    private static final int[] s = new int[0];
    private int A = 0;
    private final int[] B = new int[2];
    private final int[] C = new int[2];
    private final Runnable D = new aao(this);
    private final acy E = new aap(this);
    public final int a;
    final StateListDrawable b;
    final Drawable c;
    int d;
    int e;
    float f;
    int g;
    int h;
    float i;
    public int j = 0;
    public int k = 0;
    public RecyclerView l;
    public boolean m = false;
    public boolean n = false;
    public int o = 0;
    final ValueAnimator p = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
    int q = 0;
    private final int t;
    private final int u;
    private final int v;
    private final StateListDrawable w;
    private final Drawable x;
    private final int y;
    private final int z;

    public aas(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        this.b = stateListDrawable;
        this.c = drawable;
        this.w = stateListDrawable2;
        this.x = drawable2;
        this.u = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.v = Math.max(i2, drawable.getIntrinsicWidth());
        this.y = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.z = Math.max(i2, drawable2.getIntrinsicWidth());
        this.a = i3;
        this.t = i4;
        this.b.setAlpha(255);
        this.c.setAlpha(255);
        this.p.addListener(new aaq(this));
        this.p.addUpdateListener(new aar(this));
        RecyclerView recyclerView2 = this.l;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeItemDecoration(this);
                this.l.removeOnItemTouchListener(this);
                this.l.removeOnScrollListener(this.E);
                e();
            }
            this.l = recyclerView;
            if (recyclerView != null) {
                recyclerView.addItemDecoration(this);
                this.l.addOnItemTouchListener(this);
                this.l.addOnScrollListener(this.E);
            }
        }
    }

    private static final int a(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 != 0) {
            int i6 = i2 - i4;
            int i7 = (int) (((f3 - f2) / ((float) i5)) * ((float) i6));
            int i8 = i3 + i7;
            if (i8 >= i6 || i8 < 0) {
                return 0;
            }
            return i7;
        }
        return 0;
    }

    private final void b(int i2) {
        e();
        this.l.postDelayed(this.D, (long) i2);
    }

    private final boolean d() {
        return qb.h(this.l) == 1;
    }

    private final void e() {
        this.l.removeCallbacks(this.D);
    }

    /* access modifiers changed from: package-private */
    public final boolean b(float f2, float f3) {
        if (f3 < ((float) (this.k - this.y))) {
            return false;
        }
        int i2 = this.h;
        int i3 = this.g / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i2 + i3));
    }

    public final void c() {
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.l.invalidate();
    }

    public final void b() {
        int i2 = this.q;
        if (i2 != 0) {
            if (i2 == 3) {
                this.p.cancel();
            } else {
                return;
            }
        }
        this.q = 1;
        ValueAnimator valueAnimator = this.p;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.p.setDuration(500);
        this.p.setStartDelay(0);
        this.p.start();
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (i2 == 2 && this.o != 2) {
            this.b.setState(r);
            e();
        }
        if (i2 != 0) {
            b();
        } else {
            a();
        }
        if (this.o == 2 && i2 != 2) {
            this.b.setState(s);
            b(1200);
        } else if (i2 == 1) {
            b(1500);
        }
        this.o = i2;
    }

    public final void b(Canvas canvas, RecyclerView recyclerView) {
        if (this.j != this.l.getWidth() || this.k != this.l.getHeight()) {
            this.j = this.l.getWidth();
            this.k = this.l.getHeight();
            a(0);
        } else if (this.q != 0) {
            if (this.m) {
                int i2 = this.j;
                int i3 = this.u;
                int i4 = i2 - i3;
                int i5 = this.e;
                int i6 = this.d;
                int i7 = i5 - (i6 / 2);
                this.b.setBounds(0, 0, i3, i6);
                this.c.setBounds(0, 0, this.v, this.k);
                if (d()) {
                    this.c.draw(canvas);
                    canvas.translate((float) this.u, (float) i7);
                    canvas.scale(-1.0f, 1.0f);
                    this.b.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate((float) (-this.u), (float) (-i7));
                } else {
                    canvas.translate((float) i4, 0.0f);
                    this.c.draw(canvas);
                    canvas.translate(0.0f, (float) i7);
                    this.b.draw(canvas);
                    canvas.translate((float) (-i4), (float) (-i7));
                }
            }
            if (this.n) {
                int i8 = this.k;
                int i9 = this.y;
                int i10 = i8 - i9;
                int i11 = this.h;
                int i12 = this.g;
                int i13 = i11 - (i12 / 2);
                this.w.setBounds(0, 0, i12, i9);
                this.x.setBounds(0, 0, this.j, this.z);
                canvas.translate(0.0f, (float) i10);
                this.x.draw(canvas);
                canvas.translate((float) i13, 0.0f);
                this.w.draw(canvas);
                canvas.translate((float) (-i13), (float) (-i10));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(float f2, float f3) {
        if (!d()) {
            if (f2 < ((float) (this.j - this.u))) {
                return false;
            }
        } else if (f2 > ((float) this.u)) {
            return false;
        }
        int i2 = this.e;
        int i3 = this.d / 2;
        return f3 >= ((float) (i2 - i3)) && f3 <= ((float) (i2 + i3));
    }

    public final boolean a(MotionEvent motionEvent) {
        int i2 = this.o;
        if (i2 != 1) {
            return i2 == 2;
        }
        boolean a2 = a(motionEvent.getX(), motionEvent.getY());
        boolean b2 = b(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (a2) {
            if (!b2) {
                this.A = 2;
                this.f = (float) ((int) motionEvent.getY());
                a(2);
                return true;
            }
        } else if (!b2) {
            return false;
        }
        this.A = 1;
        this.i = (float) ((int) motionEvent.getX());
        a(2);
        return true;
    }

    public final void b(MotionEvent motionEvent) {
        if (this.o == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean a2 = a(motionEvent.getX(), motionEvent.getY());
            boolean b2 = b(motionEvent.getX(), motionEvent.getY());
            if (a2) {
                if (!b2) {
                    this.A = 2;
                    this.f = (float) ((int) motionEvent.getY());
                    a(2);
                }
            } else if (!b2) {
                return;
            }
            this.A = 1;
            this.i = (float) ((int) motionEvent.getX());
            a(2);
        } else if (motionEvent.getAction() == 1 && this.o == 2) {
            this.f = 0.0f;
            this.i = 0.0f;
            a(1);
            this.A = 0;
        } else if (motionEvent.getAction() == 2 && this.o == 2) {
            b();
            if (this.A == 1) {
                float x2 = motionEvent.getX();
                int[] iArr = this.C;
                int i2 = this.t;
                iArr[0] = i2;
                int i3 = this.j - i2;
                iArr[1] = i3;
                float max = Math.max((float) iArr[0], Math.min((float) i3, x2));
                if (Math.abs(((float) this.h) - max) >= 2.0f) {
                    int a3 = a(this.i, max, iArr, this.l.computeHorizontalScrollRange(), this.l.computeHorizontalScrollOffset(), this.j);
                    if (a3 != 0) {
                        this.l.scrollBy(a3, 0);
                    }
                    this.i = max;
                }
            }
            if (this.A == 2) {
                float y2 = motionEvent.getY();
                int[] iArr2 = this.B;
                int i4 = this.t;
                iArr2[0] = i4;
                int i5 = this.k - i4;
                iArr2[1] = i5;
                float max2 = Math.max((float) iArr2[0], Math.min((float) i5, y2));
                if (Math.abs(((float) this.e) - max2) >= 2.0f) {
                    int a4 = a(this.f, max2, iArr2, this.l.computeVerticalScrollRange(), this.l.computeVerticalScrollOffset(), this.k);
                    if (a4 != 0) {
                        this.l.scrollBy(0, a4);
                    }
                    this.f = max2;
                }
            }
        }
    }
}
