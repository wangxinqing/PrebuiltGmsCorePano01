package com.google.android.gms.smart_profile;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Scroller;
import com.google.android.gms.R;
import com.google.android.gms.smart_profile.header.view.HeaderView;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SmartProfileContainerView extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener, abld {
    public int a;
    public SmartProfileChimeraActivity b;
    public HeaderView c;
    public View d;
    public ScrollView e;
    public Scroller f;
    public abfw g;
    public boolean h;
    public float i;
    private int j;
    private int k;
    private ViewGroup l;
    private pc m;
    private rm n;
    private int o;
    private int p;
    private float q;
    private float r;
    private float s;
    private int t;
    private Point u;
    private boolean v;
    private abgy w;
    private ColorDrawable x;
    private int y;

    public SmartProfileContainerView(Context context) {
        super(context);
        a(context);
    }

    private final void a(Context context) {
        this.n = new rm(context);
        this.b = (SmartProfileChimeraActivity) context;
        this.a = 3;
        this.s = 500.0f;
        this.v = false;
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    private final void c(float f2) {
        this.q = f2;
        this.r = d();
        this.p = this.e.getScrollY();
        this.o = this.c.getHeight();
        this.f.forceFinished(true);
    }

    private final void d(float f2) {
        float max = Math.max(Math.min(f2, (float) this.k), (float) this.j);
        int i2 = this.j;
        this.c.b(1.0f - ((max - ((float) i2)) / ((float) (this.k - i2))));
    }

    private final int f() {
        return this.e.getChildAt(0).getHeight() - this.e.getHeight();
    }

    private final Point g() {
        Point point = this.u;
        if (point != null) {
            return point;
        }
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        Point point2 = new Point();
        this.u = point2;
        defaultDisplay.getSize(point2);
        return this.u;
    }

    private final void h() {
        this.v = false;
        this.r = d();
        if (i()) {
            c();
        } else if (!this.f.isFinished()) {
        } else {
            if (this.y == 0) {
                this.c.a();
            } else {
                this.c.b();
            }
        }
    }

    private final boolean i() {
        int i2 = g().y;
        if (this.l == null || this.v || d() <= ((float) (i2 / 2))) {
            return false;
        }
        return true;
    }

    public final void b() {
        this.d.setVisibility(0);
    }

    public final void computeScroll() {
        super.computeScroll();
        Scroller scroller = this.f;
        if (scroller != null && scroller.computeScrollOffset()) {
            float currY = (float) this.f.getCurrY();
            int i2 = Build.VERSION.SDK_INT;
            float currVelocity = this.f.getCurrVelocity();
            int i3 = this.a;
            if (i3 != 3) {
                if (i3 == 1) {
                    float f2 = (float) this.j;
                    if (currY >= f2) {
                        float f3 = (float) this.k;
                        if (currY <= f3) {
                            d(currY);
                            int finalY = this.f.getFinalY();
                            if (finalY > this.j && finalY < this.k) {
                                this.f.forceFinished(true);
                                if (((float) finalY) < currY) {
                                    this.c.b();
                                } else {
                                    this.c.a();
                                }
                            }
                        } else {
                            d(f3);
                            this.a = 3;
                            this.f.forceFinished(true);
                        }
                    } else {
                        d(f2);
                        this.a = 2;
                        a(0.0f, currVelocity);
                    }
                } else if (i3 == 2) {
                    if (currY < 0.0f) {
                        this.e.scrollTo(0, 0);
                        this.a = 1;
                        a((float) this.j, currVelocity);
                    } else if (currY > ((float) f())) {
                        this.e.scrollTo(0, f());
                        this.n.a.onAbsorb((int) currVelocity);
                        this.f.forceFinished(true);
                    } else {
                        this.e.scrollTo(0, (int) currY);
                    }
                    this.g.a();
                }
            } else if (currY < 0.0f) {
                b(0.0f);
                this.a = 1;
                a((float) this.k, -currVelocity);
            } else if (currY > ((float) g().y)) {
                this.f.forceFinished(true);
                b((float) g().y);
                this.b.finish();
                return;
            } else if (currVelocity < this.s && i()) {
                this.f.forceFinished(true);
                b((float) this.f.getCurrY());
                c();
                return;
            } else {
                b((float) this.f.getCurrY());
            }
        }
        qb.e(this);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        pc pcVar = this.m;
        if (pcVar != null) {
            pcVar.a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int a2 = qb.a(this);
        if (a2 != 0 && a2 != 1) {
            this.n.a.finish();
        } else if (!this.n.a.isFinished()) {
            int save = canvas.save();
            canvas.rotate(180.0f);
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.translate((float) (-width), (float) (-height));
            this.n.a.setSize(width, height);
            boolean draw = this.n.a.draw(canvas);
            canvas.restoreToCount(save);
            if (draw) {
                qb.e(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SmartProfileChimeraActivity smartProfileChimeraActivity = this.b;
        if (smartProfileChimeraActivity != null) {
            this.t = ViewConfiguration.get(smartProfileChimeraActivity).getScaledTouchSlop();
            this.w = new abgy(this);
            this.m = new pc(this.b, this.w);
            this.f = new Scroller(this.b);
            this.k = this.c.g;
            this.j = getResources().getDimensionPixelSize(R.dimen.profile_header_collapsed_height);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.l = (ViewGroup) findViewById(R.id.container);
        this.e = (ScrollView) findViewById(R.id.scrollview);
        this.d = findViewById(R.id.content_progress_container);
        HeaderView headerView = (HeaderView) findViewById(R.id.header_view);
        this.c = headerView;
        headerView.l = this;
        int i2 = Build.VERSION.SDK_INT;
        if (!azim.b() || !azhl.a.a().e()) {
            this.x = new ColorDrawable(getResources().getColor(R.color.profile_background_color));
        } else {
            this.x = new ColorDrawable(getResources().getColor(R.color.profile_card_background));
        }
        this.x.setAlpha(0);
        this.b.getWindow().setBackgroundDrawable(this.x);
    }

    public final void onGlobalLayout() {
        if (this.c.f()) {
            b((float) g().y);
            this.a = 3;
            this.e.scrollTo(0, 0);
            double intExtra = (double) (100 - this.b.getIntent().getIntExtra("com.google.android.gms.people.smart_profile.SLIDE_IN_PERCENTAGE", 100));
            Double.isNaN(intExtra);
            double d2 = (double) g().y;
            Double.isNaN(d2);
            int i2 = (int) ((intExtra / 100.0d) * d2);
            float f2 = (float) i2;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.l, "translationY", new float[]{d(), f2});
            ofFloat.addUpdateListener(new abgx(this));
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.setDuration((long) ((Math.abs(d() - f2) / ((float) g().y)) * 300.0f));
            ofFloat.addListener(new abgu(this, i2));
            ofFloat.start();
        }
        int i3 = Build.VERSION.SDK_INT;
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    return a(rawY);
                }
                if (action != 3) {
                    return false;
                }
            }
            h();
            return false;
        }
        c(rawY);
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        z2 = false;
                        z = false;
                    }
                } else if (a(rawY)) {
                    this.v = true;
                    float f2 = this.q;
                    float f3 = rawY - f2;
                    int i2 = (int) (((float) this.p) - f3);
                    int i3 = (int) (((float) this.o) + f3);
                    int i4 = (int) (this.r + f3);
                    if (f2 > rawY) {
                        if (d() <= 0.0f) {
                            if (this.c.e()) {
                                this.e.scrollTo(0, i2);
                                this.a = 2;
                                if (i2 > f()) {
                                    this.n.a.onPull(((float) (i2 - f())) / ((float) getHeight()));
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                this.g.a();
                            } else {
                                int i5 = this.j;
                                if (i3 <= i5) {
                                    d((float) i5);
                                    this.e.scrollTo(0, this.j - i3);
                                    this.a = 2;
                                    c(rawY);
                                    z2 = false;
                                } else {
                                    d((float) i3);
                                    this.a = 1;
                                    z2 = false;
                                }
                            }
                        } else if (i4 <= 0) {
                            b(0.0f);
                            this.a = 1;
                            c(rawY);
                            z2 = false;
                        } else {
                            b((float) i4);
                            this.a = 3;
                            z2 = false;
                        }
                        if (Math.abs(f3) > ((float) this.t)) {
                            this.y = 1;
                        }
                    } else {
                        if (this.e.getScrollY() > 0) {
                            if (i2 <= 0) {
                                this.e.scrollTo(0, 0);
                                this.a = 1;
                                c(rawY);
                            } else {
                                this.e.scrollTo(0, i2);
                                this.a = 2;
                            }
                            this.g.a();
                        } else if (this.c.f()) {
                            b((float) i4);
                            this.a = 3;
                        } else {
                            int i6 = this.k;
                            if (i3 >= i6) {
                                d((float) i6);
                                b((float) (i3 - this.k));
                                this.a = 3;
                                c(rawY);
                            } else {
                                d((float) i3);
                                this.a = 1;
                            }
                        }
                        if (Math.abs(f3) > ((float) this.t)) {
                            this.y = 0;
                        }
                        z2 = false;
                    }
                    z = true;
                } else {
                    z2 = false;
                    z = false;
                }
            }
            rm rmVar = this.n;
            rmVar.a.onRelease();
            z2 = rmVar.a.isFinished();
            h();
            z = false;
        } else {
            this.c.c();
            c(rawY);
            z2 = false;
            z = false;
        }
        if (z2) {
            qb.e(this);
        }
        return z || super.onTouchEvent(motionEvent);
    }

    public SmartProfileContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public final void b(float f2) {
        if (f2 != this.i) {
            this.g.a();
        }
        this.i = f2;
        a();
        if (this.l != null && f2 != d()) {
            this.l.setTranslationY(f2);
            e();
        }
    }

    public final void c() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{d(), (float) g().y});
        ofFloat.addUpdateListener(new abgv(this));
        ofFloat.addListener(new abgw(this));
        ofFloat.setDuration(250);
        ofFloat.start();
    }

    public final void e() {
        int i2 = Build.VERSION.SDK_INT;
        this.x.setAlpha((int) ((1.0f - (d() / ((float) g().y))) * 0.6f * 255.0f));
    }

    public SmartProfileContainerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context);
    }

    public final void a() {
        if (azim.b()) {
            if (this.c.e()) {
                int i2 = Build.VERSION.SDK_INT;
                qb.a((View) this.c, (float) getResources().getDimensionPixelSize(R.dimen.header_shadow_elevation));
                this.c.setOutlineProvider(ViewOutlineProvider.BOUNDS);
            } else {
                int i3 = Build.VERSION.SDK_INT;
                qb.a((View) this.c, 0.0f);
            }
            HeaderView headerView = this.c;
            int[] iArr = new int[2];
            if (headerView.f) {
                headerView.getLocationOnScreen(iArr);
            } else {
                headerView.findViewById(R.id.toolbar).getLocationOnScreen(iArr);
            }
            if (iArr[1] > headerView.h) {
                this.g.e();
            } else {
                this.g.d();
            }
        }
        if (!this.h) {
            if (this.i == 0.0f) {
                this.g.b();
                this.h = true;
            }
        } else if (this.i != 0.0f) {
            this.g.c();
            this.h = false;
        }
        this.g.a();
        this.k = this.c.g;
    }

    public final float d() {
        return this.l.getTranslationY();
    }

    public final void a(float f2, float f3) {
        this.f.forceFinished(true);
        this.f.fling(0, (int) f2, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: protected */
    public final boolean a(float f2) {
        return this.v || Math.abs(this.q - f2) > ((float) this.t);
    }
}
