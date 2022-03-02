package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: ead  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ead {
    private static final Property ab = new dzz("left");
    private static final Property ac = new eaa("top");
    private static final Property ad = new eab("right");
    private static final Property ae = new eac("bottom");
    public static final /* synthetic */ int j = 0;
    private static final int[] k = {16842919};
    private static final int[] l = new int[0];
    private static final long m = ((long) ViewConfiguration.getTapTimeout());
    private final int A;
    private final int B;
    private final float C;
    private final ColorStateList D;
    private final Drawable E;
    private final Drawable F;
    private AnimatorSet G;
    private AnimatorSet H;
    private int I = -1;
    private int J = -1;
    private boolean K;
    private Object[] L;
    private boolean M;
    private boolean N;
    private SectionIndexer O;
    private boolean P;
    private boolean Q;
    private final int R;
    private final boolean S;
    private float T;
    private long U = -1;
    private final int V;
    private int W;
    private final GradientDrawable X;
    private GradientDrawable Y;
    private final Runnable Z = new dzx(this);
    public final eai a;
    private final Animator.AnimatorListener aa = new dzy(this);
    public final int b;
    public boolean c;
    public long d;
    public int e;
    public acg f;
    public int g;
    public int h;
    public int i;
    private final Rect n = new Rect();
    private final Rect o = new Rect();
    private final Rect p = new Rect();
    private final TextView q;
    private final TextView r;
    private final ImageView s;
    private final ImageView t;
    private final View u;
    private final int[] v = new int[2];
    private final int w;
    private final int x;
    private final int y;
    private final int z;

    public ead(ViewGroup viewGroup, eai eai) {
        int i2;
        this.a = eai;
        this.h = eai.getAdapter() != null ? eai.getAdapter().a() : 0;
        this.i = eai.getChildCount();
        Context context = eai.getContext();
        this.V = ViewConfiguration.get(context).getScaledTouchSlop();
        this.g = eai.getScrollBarStyle();
        this.e = 1;
        this.S = context.getApplicationInfo().targetSdkVersion >= 11;
        ImageView imageView = new ImageView(context);
        this.t = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        ImageView imageView2 = new ImageView(context);
        this.s = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        View view = new View(context);
        this.u = view;
        view.setAlpha(0.0f);
        this.q = a(context);
        this.r = a(context);
        this.w = context.getResources().getDimensionPixelSize(R.dimen.appinvite_fast_scroller_minimum_touch_target);
        Resources resources = this.a.getContext().getResources();
        this.A = resources.getDimensionPixelSize(R.dimen.appinvite_fastscroller_thumbMinWidth);
        this.B = resources.getDimensionPixelSize(R.dimen.appinvite_fastscroller_thumbMinHeight);
        this.C = (float) resources.getDimensionPixelSize(R.dimen.appinvite_fastscroller_textSize);
        this.y = resources.getDimensionPixelSize(R.dimen.appinvite_fastscroller_minWidth);
        this.z = resources.getDimensionPixelSize(R.dimen.appinvite_fastscroller_minHeight);
        this.x = resources.getDimensionPixelSize(R.dimen.appinvite_fastscroller_padding);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.appinvite_fastscroll_thumb_jb2_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.appinvite_fastscroll_thumb_jb2_height);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.X = gradientDrawable;
        gradientDrawable.setShape(0);
        this.X.setSize(dimensionPixelSize, dimensionPixelSize2);
        this.X.setColor(this.W);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setSize(dimensionPixelSize, dimensionPixelSize2);
        gradientDrawable2.setColor(resources.getColor(R.color.appinvite_medium_black));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(k, this.X);
        stateListDrawable.addState(l, gradientDrawable2);
        this.E = stateListDrawable;
        this.F = resources.getDrawable(R.drawable.appinvite_fastscroll_track_material);
        int[] iArr = this.v;
        iArr[1] = R.drawable.appinvite_fastscroll_label_right_material;
        iArr[0] = R.drawable.appinvite_fastscroll_label_left_material;
        this.R = 2;
        this.D = ColorStateList.valueOf(resources.getColor(17170433));
        this.t.setImageDrawable(this.F);
        Drawable drawable = this.F;
        if (drawable != null) {
            i2 = Math.max(0, drawable.getIntrinsicWidth());
        } else {
            i2 = 0;
        }
        this.s.setImageDrawable(this.E);
        this.s.setMinimumWidth(this.A);
        this.s.setMinimumHeight(this.B);
        Drawable drawable2 = this.E;
        this.b = Math.max(drawable2 != null ? Math.max(i2, drawable2.getIntrinsicWidth()) : i2, this.A);
        this.u.setMinimumWidth(this.y);
        this.u.setMinimumHeight(this.z);
        ColorStateList colorStateList = this.D;
        if (colorStateList != null) {
            this.q.setTextColor(colorStateList);
            this.r.setTextColor(this.D);
        }
        float f2 = this.C;
        if (f2 > 0.0f) {
            this.q.setTextSize(0, f2);
            this.r.setTextSize(0, this.C);
        }
        int max = Math.max(0, this.z);
        this.q.setMinimumWidth(max);
        this.q.setMinimumHeight(max);
        this.q.setIncludeFontPadding(false);
        this.r.setMinimumWidth(max);
        this.r.setMinimumHeight(max);
        this.r.setIncludeFontPadding(false);
        f();
        ViewGroupOverlay overlay = viewGroup.getOverlay();
        overlay.add(this.t);
        overlay.add(this.s);
        overlay.add(this.u);
        overlay.add(this.q);
        overlay.add(this.r);
        i();
        a(this.i, this.h);
        b(eai.getVerticalScrollbarPosition());
        c();
    }

    private static Animator a(Property property, float f2, View... viewArr) {
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builder = null;
        for (int length = viewArr.length - 1; length >= 0; length--) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewArr[length], property, new float[]{f2});
            if (builder == null) {
                builder = animatorSet.play(ofFloat);
            } else {
                builder.with(ofFloat);
            }
        }
        return animatorSet;
    }

    private static Animator b(View view, float f2) {
        return ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{f2});
    }

    private final float c(float f2) {
        ImageView imageView = this.t;
        float top = (float) imageView.getTop();
        float bottom = ((float) imageView.getBottom()) - top;
        if (bottom > 0.0f) {
            return eal.a((f2 - top) / bottom, 0.0f, 1.0f);
        }
        return 0.0f;
    }

    private final boolean d(int i2) {
        TextView textView;
        TextView textView2;
        Object obj;
        Object[] objArr = this.L;
        String str = null;
        if (objArr != null && i2 >= 0 && i2 < objArr.length && (obj = objArr[i2]) != null) {
            str = obj.toString();
        }
        Rect rect = this.n;
        View view = this.u;
        if (this.c) {
            textView2 = this.q;
            textView = this.r;
        } else {
            textView2 = this.r;
            textView = this.q;
        }
        textView.setText(str);
        b((View) textView, rect);
        a((View) textView, rect);
        AnimatorSet animatorSet = this.H;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        Animator duration = b((View) textView, 1.0f).setDuration(50);
        Animator duration2 = b((View) textView2, 0.0f).setDuration(50);
        duration2.addListener(this.aa);
        rect.left -= view.getPaddingLeft();
        rect.top -= view.getPaddingTop();
        rect.right += view.getPaddingRight();
        rect.bottom += view.getPaddingBottom();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofInt(ab, new int[]{rect.left}), PropertyValuesHolder.ofInt(ac, new int[]{rect.top}), PropertyValuesHolder.ofInt(ad, new int[]{rect.right}), PropertyValuesHolder.ofInt(ae, new int[]{rect.bottom})});
        ofPropertyValuesHolder.setDuration(100);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.H = animatorSet2;
        AnimatorSet.Builder with = animatorSet2.play(duration2).with(duration);
        with.with(ofPropertyValuesHolder);
        int width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        int width2 = textView.getWidth();
        if (width2 > width) {
            textView.setScaleX(((float) width) / ((float) width2));
            with.with(a((View) textView, 1.0f).setDuration(100));
        } else {
            textView.setScaleX(1.0f);
        }
        int width3 = textView2.getWidth();
        if (width3 > width2) {
            with.with(a((View) textView2, ((float) width2) / ((float) width3)).setDuration(100));
        }
        this.H.start();
        return !TextUtils.isEmpty(str);
    }

    private final void f() {
        boolean z2 = this.e == 2;
        this.s.setPressed(z2);
        this.t.setPressed(z2);
    }

    private final void g() {
        AnimatorSet animatorSet = this.G;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        Animator duration = a(View.ALPHA, 1.0f, this.s, this.t).setDuration(150);
        Animator duration2 = a(View.ALPHA, 0.0f, this.u, this.q, this.r).setDuration(300);
        Animator duration3 = a(View.TRANSLATION_X, 0.0f, this.s, this.t).setDuration(150);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.G = animatorSet2;
        animatorSet2.playTogether(new Animator[]{duration, duration2, duration3});
        this.G.start();
        this.N = false;
    }

    private final void h() {
        AnimatorSet animatorSet = this.G;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        Animator duration = a(View.ALPHA, 1.0f, this.s, this.t, this.u).setDuration(150);
        Animator duration2 = a(View.TRANSLATION_X, 0.0f, this.s, this.t).setDuration(150);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.G = animatorSet2;
        animatorSet2.playTogether(new Animator[]{duration, duration2});
        this.G.start();
        this.N = true;
    }

    private final void i() {
        this.O = null;
        acg adapter = this.a.getAdapter();
        if (adapter instanceof SectionIndexer) {
            this.f = adapter;
            SectionIndexer sectionIndexer = (SectionIndexer) adapter;
            this.O = sectionIndexer;
            this.L = sectionIndexer.getSections();
            return;
        }
        this.f = adapter;
        this.L = null;
    }

    private final void j() {
        this.U = -1;
    }

    private final void k() {
        this.U = -1;
        c(2);
        if (this.f == null && this.a != null) {
            i();
        }
        eai eai = this.a;
        if (eai != null) {
            eai.requestDisallowInterceptTouchEvent(true);
            this.a.a(1);
        }
        MotionEvent obtain = MotionEvent.obtain(0, 0, 3, 0.0f, 0.0f, 0);
        this.a.onTouchEvent(obtain);
        obtain.recycle();
    }

    public final boolean a() {
        return this.Q && this.K;
    }

    public final void d() {
        this.f = null;
    }

    public final void e() {
        if (!this.Q) {
            this.Q = true;
            a(true);
        }
    }

    private final void b(float f2) {
        int i2;
        int i3;
        int i4;
        float f3;
        int a2 = this.a.getAdapter().a();
        Object[] objArr = this.L;
        int i5 = 0;
        if (objArr != null) {
            i2 = objArr.length;
        } else {
            i2 = 0;
        }
        int i6 = -1;
        if (this.a.getAdapter() instanceof dym) {
            dym dym = (dym) this.a.getAdapter();
            dym.b((RecyclerView) this.a);
            int length = objArr != null ? objArr.length - 1 : 0;
            int h2 = (int) (((float) dym.h(dym.a() - 1)) * f2);
            while (true) {
                if (i5 >= a2) {
                    i6 = length;
                    break;
                } else if (h2 <= dym.h(i5)) {
                    this.a.scrollToPosition(i5);
                    i6 = this.O.getSectionForPosition(i5);
                    break;
                } else {
                    i5++;
                }
            }
        } else if (objArr != null && i2 > 1) {
            float f4 = (float) i2;
            int i7 = i2 - 1;
            int a3 = eal.a((int) (f2 * f4), i7);
            int positionForSection = this.O.getPositionForSection(a3);
            int i8 = a3 + 1;
            if (a3 < i7) {
                i3 = this.O.getPositionForSection(i8);
            } else {
                i3 = a2;
            }
            if (i3 != positionForSection) {
                i5 = a3;
                i4 = i5;
            } else {
                i4 = a3;
                int i9 = positionForSection;
                while (true) {
                    if (i4 > 0) {
                        i4--;
                        i9 = this.O.getPositionForSection(i4);
                        if (i9 == positionForSection) {
                            if (i4 == 0) {
                                i4 = a3;
                                break;
                            }
                        } else {
                            i5 = i4;
                            break;
                        }
                    } else {
                        i5 = a3;
                        i4 = i5;
                        break;
                    }
                }
                positionForSection = i9;
            }
            int i10 = i8 + 1;
            while (i10 < i2 && this.O.getPositionForSection(i10) == i3) {
                i10++;
                i8++;
            }
            float f5 = ((float) i4) / f4;
            float f6 = ((float) i8) / f4;
            if (a2 != 0) {
                f3 = 0.125f / ((float) a2);
            } else {
                f3 = Float.MAX_VALUE;
            }
            if (i4 != a3 || f2 - f5 >= f3) {
                positionForSection += (int) ((((float) (i3 - positionForSection)) * (f2 - f5)) / (f6 - f5));
            }
            this.a.scrollToPosition(eal.a(positionForSection, a2 - 1));
            i6 = i5;
        } else {
            this.a.scrollToPosition(eal.a((int) (f2 * ((float) a2)), a2 - 1));
        }
        if (this.I != i6) {
            this.I = i6;
            boolean d2 = d(i6);
            boolean z2 = this.N;
            if (!z2 && d2) {
                h();
            } else if (z2 && !d2) {
                g();
            }
        }
    }

    public final void c() {
        this.a.removeCallbacks(this.Z);
        this.a.postDelayed(this.Z, 1500);
    }

    public final void c(int i2) {
        this.a.removeCallbacks(this.Z);
        if (i2 != this.e) {
            if (i2 == 0) {
                AnimatorSet animatorSet = this.G;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                Animator duration = a(View.ALPHA, 0.0f, this.s, this.t, this.u, this.q, this.r).setDuration(300);
                Animator duration2 = a(View.TRANSLATION_X, (float) (!this.P ? -this.s.getWidth() : this.s.getWidth()), this.s, this.t).setDuration(300);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.G = animatorSet2;
                animatorSet2.playTogether(new Animator[]{duration, duration2});
                this.G.start();
                this.N = false;
            } else if (i2 == 1) {
                g();
            } else if (d(this.I)) {
                h();
            } else {
                g();
            }
            this.e = i2;
            f();
        }
    }

    private static Animator a(View view, float f2) {
        return ObjectAnimator.ofFloat(view, View.SCALE_X, new float[]{f2});
    }

    private final TextView a(Context context) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        TextView textView = new TextView(context);
        textView.setLayoutParams(layoutParams);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        textView.setLayoutDirection(this.a.getLayoutDirection());
        return textView;
    }

    private final void a(View view, Rect rect) {
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
        view.setPivotX(this.P ? (float) (rect.right - rect.left) : 0.0f);
    }

    private final void a(View view, View view2, Rect rect, Rect rect2) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (rect != null) {
            i4 = rect.left;
            i3 = rect.top;
            i2 = rect.right;
        } else {
            i2 = 0;
            i4 = 0;
            i3 = 0;
        }
        Rect rect3 = this.p;
        int width = rect3.width();
        if (view2 != null) {
            if (!this.P) {
                width -= view2.getRight();
            } else {
                width = view2.getLeft();
            }
        }
        int i7 = (width - i4) - i2;
        view.measure(View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int min = Math.min(i7, view.getMeasuredWidth());
        if (!this.P) {
            i5 = (view2 != null ? view2.getRight() : rect3.left) + i4;
            i6 = min + i5;
        } else {
            int left = (view2 != null ? view2.getLeft() : rect3.right) - i2;
            int i8 = left - min;
            i6 = left;
            i5 = i8;
        }
        rect2.set(i5, i3, i6, view.getMeasuredHeight() + i3);
    }

    private final void b(View view, Rect rect) {
        int i2;
        int i3;
        int i4;
        Rect rect2 = this.o;
        rect2.left = this.u.getPaddingLeft();
        rect2.top = this.u.getPaddingTop();
        rect2.right = this.u.getPaddingRight();
        rect2.bottom = this.u.getPaddingBottom();
        if (this.R == 0) {
            if (rect2 != null) {
                i3 = rect2.left;
                i2 = rect2.top;
                i4 = rect2.right;
            } else {
                i4 = 0;
                i3 = 0;
                i2 = 0;
            }
            Rect rect3 = this.p;
            int width = rect3.width();
            view.measure(View.MeasureSpec.makeMeasureSpec((width - i3) - i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            int height = rect3.height();
            int measuredWidth = view.getMeasuredWidth();
            int i5 = (height / 10) + i2 + rect3.top;
            int measuredHeight = view.getMeasuredHeight();
            int i6 = ((width - measuredWidth) / 2) + rect3.left;
            rect.set(i6, i5, measuredWidth + i6, measuredHeight + i5);
            return;
        }
        a(view, this.s, rect2, rect);
    }

    private final void a(boolean z2) {
        if (a()) {
            int i2 = this.e;
            if (i2 == 2) {
                return;
            }
            if (i2 == 1) {
                c();
            } else if (z2) {
                c(1);
                c();
            }
        } else {
            c(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0032, code lost:
        if (r7 >= (((float) r6.s.getLeft()) - r3)) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(float r7, float r8) {
        /*
            r6 = this;
            android.widget.ImageView r0 = r6.s
            float r0 = r0.getTranslationX()
            android.widget.ImageView r1 = r6.s
            int r1 = r1.getLeft()
            android.widget.ImageView r2 = r6.s
            int r2 = r2.getRight()
            int r3 = r6.w
            float r3 = (float) r3
            float r2 = (float) r2
            float r2 = r2 + r0
            float r1 = (float) r1
            float r1 = r1 + r0
            float r2 = r2 - r1
            float r3 = r3 - r2
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r3 = 0
        L_0x0022:
            boolean r1 = r6.P
            r2 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0037
            android.widget.ImageView r1 = r6.s
            int r1 = r1.getLeft()
            float r1 = (float) r1
            float r1 = r1 - r3
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 < 0) goto L_0x0035
            goto L_0x0045
        L_0x0035:
            r2 = 0
            goto L_0x007a
        L_0x0037:
            android.widget.ImageView r1 = r6.s
            int r1 = r1.getRight()
            float r1 = (float) r1
            float r1 = r1 + r3
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L_0x0045
            r2 = 0
            goto L_0x007a
        L_0x0045:
            android.graphics.drawable.Drawable r7 = r6.F
            if (r7 != 0) goto L_0x0079
            android.widget.ImageView r7 = r6.s
            float r7 = r7.getTranslationY()
            android.widget.ImageView r1 = r6.s
            int r1 = r1.getTop()
            float r1 = (float) r1
            float r1 = r1 + r7
            android.widget.ImageView r3 = r6.s
            int r3 = r3.getBottom()
            float r3 = (float) r3
            float r3 = r3 + r7
            int r7 = r6.w
            float r7 = (float) r7
            float r5 = r3 - r1
            float r7 = r7 - r5
            int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r5 <= 0) goto L_0x006d
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r7 / r0
        L_0x006d:
            float r1 = r1 - r0
            int r7 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r7 < 0) goto L_0x0035
            float r3 = r3 + r0
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0078
            goto L_0x0035
        L_0x0078:
            return r2
        L_0x0079:
        L_0x007a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ead.a(float, float):boolean");
    }

    public final void b() {
        int i2;
        if (!this.M) {
            this.M = true;
            eai eai = this.a;
            Rect rect = this.p;
            rect.left = 0;
            rect.top = 0;
            rect.right = eai.getWidth();
            rect.bottom = eai.getHeight();
            int i3 = this.g;
            if (i3 == 16777216 || i3 == 0) {
                rect.left += eai.getPaddingLeft();
                rect.top += eai.getPaddingTop();
                rect.right -= eai.getPaddingRight();
                rect.bottom -= eai.getPaddingBottom();
                if (i3 == 16777216) {
                    int i4 = this.b;
                    if (this.J == 2) {
                        rect.right += i4;
                    } else {
                        rect.left -= i4;
                    }
                }
            }
            Rect rect2 = this.n;
            a(this.s, (View) null, (Rect) null, rect2);
            a((View) this.s, rect2);
            ImageView imageView = this.t;
            ImageView imageView2 = this.s;
            Rect rect3 = this.p;
            imageView.measure(View.MeasureSpec.makeMeasureSpec(rect3.width(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredWidth = imageView.getMeasuredWidth();
            if (imageView2 != null) {
                i2 = imageView2.getHeight() / 2;
            } else {
                i2 = 0;
            }
            int left = imageView2.getLeft() + ((imageView2.getWidth() - measuredWidth) / 2);
            imageView.layout(left, rect3.top + i2, measuredWidth + left, rect3.bottom - i2);
            Rect rect4 = this.n;
            b((View) this.q, rect4);
            a((View) this.q, rect4);
            b((View) this.r, rect4);
            a((View) this.r, rect4);
            if (this.u != null) {
                rect4.left -= this.u.getPaddingLeft();
                rect4.top -= this.u.getPaddingTop();
                rect4.right += this.u.getPaddingRight();
                rect4.bottom += this.u.getPaddingBottom();
                a(this.u, rect4);
            }
            this.M = false;
        }
    }

    public final float a(int i2, int i3, int i4) {
        Object[] objArr;
        float f2;
        int i5;
        int i6;
        int i7;
        int i8;
        float f3 = 0.0f;
        if (!(this.a.getAdapter() instanceof dym)) {
            if (this.O == null || this.f == null) {
                i();
            }
            if (this.O == null || (objArr = this.L) == null || objArr.length <= 0 || !this.S) {
                return ((float) i2) / ((float) (i4 - i3));
            }
            if (i2 < 0) {
                return 0.0f;
            }
            View childAt = this.a.getChildAt(0);
            if (childAt == null || childAt.getHeight() == 0) {
                f2 = 0.0f;
            } else {
                f2 = ((float) (this.a.getPaddingTop() - childAt.getTop())) / ((float) childAt.getHeight());
            }
            int sectionForPosition = this.O.getSectionForPosition(i2);
            int positionForSection = this.O.getPositionForSection(sectionForPosition);
            int length = this.L.length;
            if (sectionForPosition < length - 1) {
                int i9 = sectionForPosition + 1;
                if (i9 < length) {
                    i8 = this.O.getPositionForSection(i9);
                } else {
                    i8 = i4 - 1;
                }
                i5 = i8 - positionForSection;
            } else {
                i5 = i4 - positionForSection;
            }
            if (i5 != 0) {
                f3 = ((((float) i2) + f2) - ((float) positionForSection)) / ((float) i5);
            }
            float f4 = (((float) sectionForPosition) + f3) / ((float) length);
            if (i2 > 0 && i2 + i3 == i4) {
                View childAt2 = this.a.getChildAt(i3 - 1);
                int paddingBottom = this.a.getPaddingBottom();
                RecyclerView recyclerView = this.a.getLayoutManager().r;
                if (recyclerView != null && recyclerView.mClipToPadding) {
                    i6 = childAt2.getHeight();
                    i7 = (this.a.getHeight() - paddingBottom) - childAt2.getTop();
                } else {
                    i6 = childAt2.getHeight() + paddingBottom;
                    i7 = this.a.getHeight() - childAt2.getTop();
                }
                if (i7 > 0 && i6 > 0) {
                    return f4 + ((1.0f - f4) * (((float) i7) / ((float) i6)));
                }
            }
            return f4;
        } else if (i4 <= 0 || i2 <= 0) {
            return 0.0f;
        } else {
            dym dym = (dym) this.a.getAdapter();
            dym.b((RecyclerView) this.a);
            return eal.a(((float) dym.h(i2 - 1)) / ((float) (dym.h(i4 - 1) - this.a.getHeight())), 0.0f, 1.0f);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r0v7 */
    public final void b(int i2) {
        ? r0 = 1;
        if (i2 == 0) {
            if (this.a.getLayoutDirection() == 1) {
                i2 = 1;
            } else {
                i2 = 2;
            }
        }
        if (this.J != i2) {
            this.J = i2;
            if (i2 == 1) {
                r0 = 0;
            }
            this.P = r0;
            this.u.setBackgroundResource(this.v[r0]);
            Drawable background = this.u.getBackground();
            if (background != null) {
                Rect rect = this.n;
                background.getPadding(rect);
                int i3 = this.x;
                rect.offset(i3, i3);
                this.u.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                if (background instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) background;
                    this.Y = gradientDrawable;
                    gradientDrawable.setColor(this.W);
                }
            }
            b();
        }
    }

    public final boolean b(MotionEvent motionEvent) {
        if (!a()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            if (this.U >= 0) {
                k();
                float c2 = c(motionEvent.getY());
                a(c2);
                b(c2);
            }
            if (this.e == 2) {
                eai eai = this.a;
                if (eai != null) {
                    eai.requestDisallowInterceptTouchEvent(false);
                    this.a.a(0);
                }
                c(1);
                c();
                return true;
            }
        } else if (actionMasked == 2) {
            if (this.U >= 0 && Math.abs(motionEvent.getY() - this.T) > ((float) this.V)) {
                k();
            }
            if (this.e == 2) {
                float c3 = c(motionEvent.getY());
                a(c3);
                b(c3);
                return true;
            }
        } else if (actionMasked == 3) {
            j();
        }
        return false;
    }

    public final void a(float f2) {
        Rect rect = this.p;
        int i2 = rect.top;
        int i3 = rect.bottom;
        ImageView imageView = this.t;
        ImageView imageView2 = this.s;
        float top = (float) imageView.getTop();
        float bottom = (f2 * (((float) imageView.getBottom()) - top)) + top;
        imageView2.setTranslationY(bottom - ((float) (imageView2.getHeight() / 2)));
        View view = this.u;
        float height = ((float) view.getHeight()) / 2.0f;
        int i4 = this.R;
        if (i4 != 1) {
            if (i4 != 2) {
                bottom = 0.0f;
            } else {
                bottom -= height;
            }
        }
        float a2 = eal.a(bottom, ((float) i2) + height, ((float) i3) - height) - height;
        view.setTranslationY(a2);
        this.q.setTranslationY(a2);
        this.r.setTranslationY(a2);
    }

    public final void a(int i2) {
        this.W = i2;
        this.X.setColor(i2);
        GradientDrawable gradientDrawable = this.Y;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(this.W);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r4 < r5) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if ((r4 / r3.a.getHeight()) >= 4) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r4, int r5) {
        /*
            r3 = this;
            eai r0 = r3.a
            acg r0 = r0.getAdapter()
            boolean r0 = r0 instanceof defpackage.dym
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0036
            eai r0 = r3.a
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L_0x0036
            eai r4 = r3.a
            acg r4 = r4.getAdapter()
            dym r4 = (defpackage.dym) r4
            eai r0 = r3.a
            r4.c((android.support.v7.widget.RecyclerView) r0)
            if (r5 <= 0) goto L_0x002a
            int r5 = r5 + -1
            int r4 = r4.h(r5)
            goto L_0x002b
        L_0x002a:
            r4 = 0
        L_0x002b:
            eai r5 = r3.a
            int r5 = r5.getHeight()
            int r4 = r4 / r5
            r5 = 4
            if (r4 < r5) goto L_0x0039
            goto L_0x003a
        L_0x0036:
            if (r4 >= r5) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            boolean r4 = r3.K
            if (r4 == r1) goto L_0x0043
            r3.K = r1
            r3.a((boolean) r2)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ead.a(int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        if (r0 != 3) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.view.MotionEvent r7) {
        /*
            r6 = this;
            boolean r0 = r6.a()
            r1 = 0
            if (r0 == 0) goto L_0x008c
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x004f
            if (r0 == r2) goto L_0x004b
            r2 = 2
            if (r0 == r2) goto L_0x0018
            r7 = 3
            if (r0 == r7) goto L_0x004b
            goto L_0x008b
        L_0x0018:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r0 = r6.a((float) r0, (float) r2)
            if (r0 == 0) goto L_0x0047
            long r2 = r6.U
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x008b
            long r4 = android.os.SystemClock.uptimeMillis()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x008b
            r6.k()
            float r0 = r6.T
            float r0 = r6.c((float) r0)
            r6.b((float) r0)
            boolean r7 = r6.b((android.view.MotionEvent) r7)
            return r7
        L_0x0047:
            r6.j()
            goto L_0x008b
        L_0x004b:
            r6.j()
            goto L_0x008b
        L_0x004f:
            float r0 = r7.getX()
            float r3 = r7.getY()
            boolean r0 = r6.a((float) r0, (float) r3)
            if (r0 == 0) goto L_0x008b
            eai r0 = r6.a
            android.view.ViewParent r0 = r0.getParent()
        L_0x0063:
            if (r0 != 0) goto L_0x0066
            goto L_0x007c
        L_0x0066:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x007c
            r3 = r0
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            boolean r3 = r3.shouldDelayChildPressedState()
            if (r3 != 0) goto L_0x0078
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0063
        L_0x0078:
            r6.k()
            return r2
        L_0x007c:
            float r7 = r7.getY()
            r6.T = r7
            long r2 = android.os.SystemClock.uptimeMillis()
            long r4 = m
            long r2 = r2 + r4
            r6.U = r2
        L_0x008b:
            return r1
        L_0x008c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ead.a(android.view.MotionEvent):boolean");
    }
}
