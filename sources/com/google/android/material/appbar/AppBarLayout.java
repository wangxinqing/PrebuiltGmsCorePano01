package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.AbsSavedState;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AppBarLayout extends LinearLayout implements ahi {
    public boolean a;
    public int b;
    public qn c;
    public boolean d;
    public boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private List j;
    private boolean k;
    private boolean l;
    private int m;
    private WeakReference n;
    private ValueAnimator o;
    private int[] p;
    private Drawable q;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class BaseBehavior extends ajsl {
        private int a;
        public int b;
        private ValueAnimator d;
        private int e = -1;
        private boolean f;
        private float g;
        private WeakReference h;

        /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
        public class SavedState extends AbsSavedState {
            public static final Parcelable.Creator CREATOR = new ajsc();
            int c;
            float d;
            boolean e;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.c = parcel.readInt();
                this.d = parcel.readFloat();
                this.e = parcel.readByte() != 0;
            }

            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.c);
                parcel.writeFloat(this.d);
                parcel.writeByte(this.e ? (byte) 1 : 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }

        public BaseBehavior() {
        }

        private static final View a(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof pl) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static boolean a(int i, int i2) {
            return (i & i2) == i2;
        }

        private final void b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            qb.c(coordinatorLayout, qp.b.a());
            qb.c(coordinatorLayout, qp.c.a());
            View a2 = a(coordinatorLayout);
            if (a2 != null && appBarLayout.c() != 0 && (((ahm) a2.getLayoutParams()).a instanceof ScrollingViewBehavior)) {
                if (b() != (-appBarLayout.c()) && a2.canScrollVertically(1)) {
                    a(coordinatorLayout, appBarLayout, qp.b, false);
                }
                if (b() == 0) {
                    return;
                }
                if (a2.canScrollVertically(-1)) {
                    int i = -appBarLayout.d();
                    if (i != 0) {
                        qb.a((View) coordinatorLayout, qp.c, (rf) new ajsa(this, coordinatorLayout, appBarLayout, a2, i));
                        return;
                    }
                    return;
                }
                a(coordinatorLayout, appBarLayout, qp.c, true);
            }
        }

        public final /* bridge */ /* synthetic */ Parcelable c(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int c = c();
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + c;
                if (childAt.getTop() + c <= 0 && bottom >= 0) {
                    SavedState savedState = new SavedState(absSavedState);
                    savedState.c = i;
                    if (bottom == qb.l(childAt) + appBarLayout.g()) {
                        z = true;
                    }
                    savedState.e = z;
                    savedState.d = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return absSavedState;
        }

        public final /* bridge */ /* synthetic */ int d(View view) {
            return ((AppBarLayout) view).c();
        }

        public final /* bridge */ /* synthetic */ int e(View view) {
            return -((AppBarLayout) view).e();
        }

        public final /* bridge */ /* synthetic */ boolean f(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            WeakReference weakReference = this.h;
            if (weakReference == null) {
                return true;
            }
            View view2 = (View) weakReference.get();
            if (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private final void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int b2 = b();
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                ajse ajse = (ajse) childAt.getLayoutParams();
                if (a(ajse.a, 32)) {
                    top -= ajse.topMargin;
                    bottom += ajse.bottomMargin;
                }
                int i2 = -b2;
                if (top <= i2 && bottom >= i2) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                ajse ajse2 = (ajse) childAt2.getLayoutParams();
                int i3 = ajse2.a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == appBarLayout.getChildCount() - 1) {
                        i5 += appBarLayout.g();
                    }
                    if (a(i3, 2)) {
                        i5 += qb.l(childAt2);
                    } else if (a(i3, 5)) {
                        int l = qb.l(childAt2) + i5;
                        if (b2 >= l) {
                            i5 = l;
                        } else {
                            i4 = l;
                        }
                    }
                    if (a(i3, 32)) {
                        i4 += ajse2.topMargin;
                        i5 -= ajse2.bottomMargin;
                    }
                    if (b2 < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    a(coordinatorLayout, appBarLayout, mk.a(i4, -appBarLayout.c(), 0));
                }
            }
        }

        public final int b() {
            return c() + this.b;
        }

        /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00a9  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* bridge */ /* synthetic */ int b(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, int r10, int r11, int r12) {
            /*
                r7 = this;
                com.google.android.material.appbar.AppBarLayout r9 = (com.google.android.material.appbar.AppBarLayout) r9
                int r0 = r7.b()
                r1 = 0
                if (r11 != 0) goto L_0x000b
                goto L_0x00b1
            L_0x000b:
                if (r0 < r11) goto L_0x00b1
                if (r0 > r12) goto L_0x00b1
                int r10 = defpackage.mk.a(r10, r11, r12)
                if (r0 == r10) goto L_0x00b0
                boolean r11 = r9.a
                if (r11 == 0) goto L_0x0089
                int r11 = java.lang.Math.abs(r10)
                int r12 = r9.getChildCount()
                r2 = 0
            L_0x0022:
                if (r2 >= r12) goto L_0x0089
                android.view.View r3 = r9.getChildAt(r2)
                android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
                ajse r4 = (defpackage.ajse) r4
                android.view.animation.Interpolator r5 = r4.b
                int r6 = r3.getTop()
                if (r11 >= r6) goto L_0x0037
            L_0x0036:
                goto L_0x0086
            L_0x0037:
                int r6 = r3.getBottom()
                if (r11 > r6) goto L_0x0036
                if (r5 == 0) goto L_0x0089
                int r12 = r4.a
                r2 = r12 & 1
                if (r2 == 0) goto L_0x005a
                int r2 = r3.getHeight()
                int r6 = r4.topMargin
                int r2 = r2 + r6
                int r4 = r4.bottomMargin
                int r2 = r2 + r4
                r12 = r12 & 2
                if (r12 == 0) goto L_0x0059
                int r12 = defpackage.qb.l(r3)
                int r2 = r2 - r12
                goto L_0x005b
            L_0x0059:
                goto L_0x005b
            L_0x005a:
                r2 = 0
            L_0x005b:
                boolean r12 = defpackage.qb.s(r3)
                if (r12 == 0) goto L_0x0066
                int r12 = r9.g()
                int r2 = r2 - r12
            L_0x0066:
                if (r2 <= 0) goto L_0x0089
                int r12 = r3.getTop()
                float r2 = (float) r2
                int r11 = r11 - r12
                float r11 = (float) r11
                float r11 = r11 / r2
                float r11 = r5.getInterpolation(r11)
                float r2 = r2 * r11
                int r11 = java.lang.Math.round(r2)
                int r12 = java.lang.Integer.signum(r10)
                int r2 = r3.getTop()
                int r2 = r2 + r11
                int r12 = r12 * r2
                goto L_0x008b
            L_0x0086:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0089:
                r12 = r10
            L_0x008b:
                boolean r11 = r7.a(r12)
                int r2 = r0 - r10
                int r12 = r10 - r12
                r7.b = r12
                if (r11 != 0) goto L_0x009e
                boolean r11 = r9.a
                if (r11 == 0) goto L_0x009e
                r8.a((android.view.View) r9)
            L_0x009e:
                int r11 = r7.c()
                r9.a((int) r11)
                if (r10 >= r0) goto L_0x00a9
                r11 = -1
                goto L_0x00aa
            L_0x00a9:
                r11 = 1
            L_0x00aa:
                a((androidx.coordinatorlayout.widget.CoordinatorLayout) r8, (com.google.android.material.appbar.AppBarLayout) r9, (int) r10, (int) r11, (boolean) r1)
                r1 = r2
                goto L_0x00b3
            L_0x00b0:
                goto L_0x00b3
            L_0x00b1:
                r7.b = r1
            L_0x00b3:
                r7.b((androidx.coordinatorlayout.widget.CoordinatorLayout) r8, (com.google.android.material.appbar.AppBarLayout) r9)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        private final void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int i2;
            int abs = Math.abs(b() - i);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            }
            int b2 = b();
            if (b2 == i) {
                ValueAnimator valueAnimator = this.d;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.d.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.d = valueAnimator3;
                valueAnimator3.setInterpolator(ajrr.e);
                this.d.addUpdateListener(new ajrz(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.d.setDuration((long) Math.min(i2, 600));
            this.d.setIntValues(new int[]{b2, i});
            this.d.start();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
            if ((-r8) >= ((r4.getBottom() - r1) - r7.g())) goto L_0x005e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0071  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static final void a(androidx.coordinatorlayout.widget.CoordinatorLayout r6, com.google.android.material.appbar.AppBarLayout r7, int r8, int r9, boolean r10) {
            /*
                int r0 = java.lang.Math.abs(r8)
                int r1 = r7.getChildCount()
                r2 = 0
                r3 = 0
            L_0x000a:
                if (r3 >= r1) goto L_0x0021
                android.view.View r4 = r7.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 >= r5) goto L_0x0017
            L_0x0016:
                goto L_0x001e
            L_0x0017:
                int r5 = r4.getBottom()
                if (r0 > r5) goto L_0x0016
                goto L_0x0022
            L_0x001e:
                int r3 = r3 + 1
                goto L_0x000a
            L_0x0021:
                r4 = 0
            L_0x0022:
                if (r4 == 0) goto L_0x00ad
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                ajse r0 = (defpackage.ajse) r0
                int r0 = r0.a
                r1 = r0 & 1
                r3 = 1
                if (r1 == 0) goto L_0x005d
                int r1 = defpackage.qb.l(r4)
                if (r9 <= 0) goto L_0x004b
                r9 = r0 & 12
                if (r9 == 0) goto L_0x004b
                int r8 = -r8
                int r9 = r4.getBottom()
                int r9 = r9 - r1
                int r0 = r7.g()
                int r9 = r9 - r0
                if (r8 < r9) goto L_0x0049
                goto L_0x005e
            L_0x0049:
                r3 = 0
                goto L_0x005e
            L_0x004b:
                r9 = r0 & 2
                if (r9 == 0) goto L_0x005d
                int r8 = -r8
                int r9 = r4.getBottom()
                int r9 = r9 - r1
                int r0 = r7.g()
                int r9 = r9 - r0
                if (r8 < r9) goto L_0x005d
                goto L_0x005e
            L_0x005d:
                r3 = 0
            L_0x005e:
                boolean r8 = r7.e
                if (r8 == 0) goto L_0x006a
                android.view.View r8 = a(r6)
                boolean r3 = r7.a((android.view.View) r8)
            L_0x006a:
                boolean r8 = r7.b((boolean) r3)
                if (r10 == 0) goto L_0x0071
                goto L_0x00a9
            L_0x0071:
                if (r8 == 0) goto L_0x00ad
                ahq r8 = r6.e
                java.util.List r8 = r8.b(r7)
                java.util.List r9 = r6.f
                r9.clear()
                if (r8 == 0) goto L_0x0085
                java.util.List r9 = r6.f
                r9.addAll(r8)
            L_0x0085:
                java.util.List r6 = r6.f
                int r8 = r6.size()
            L_0x008b:
                if (r2 >= r8) goto L_0x00ad
                java.lang.Object r9 = r6.get(r2)
                android.view.View r9 = (android.view.View) r9
                android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
                ahm r9 = (defpackage.ahm) r9
                ahj r9 = r9.a
                boolean r10 = r9 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r10 != 0) goto L_0x00a2
                int r2 = r2 + 1
                goto L_0x008b
            L_0x00a2:
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r9 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r9
                int r6 = r9.d
                if (r6 != 0) goto L_0x00a9
                goto L_0x00ad
            L_0x00a9:
                r7.jumpDrawablesToCurrentState()
                return
            L_0x00ad:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        public final /* bridge */ /* synthetic */ void b(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            a(coordinatorLayout, appBarLayout);
            if (appBarLayout.e) {
                appBarLayout.b(appBarLayout.a(a(coordinatorLayout)));
            }
        }

        private static final void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, qp qpVar, boolean z) {
            qb.a((View) coordinatorLayout, qpVar, (rf) new ajsb(appBarLayout, z));
        }

        public final /* bridge */ /* synthetic */ void a(View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                this.e = savedState.c;
                this.g = savedState.d;
                this.f = savedState.e;
                return;
            }
            this.e = -1;
        }

        public final /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                iArr[1] = c(coordinatorLayout, appBarLayout, i3, -appBarLayout.e(), 0);
            }
            if (i3 == 0) {
                b(coordinatorLayout, appBarLayout);
            }
        }

        public final /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.a == 0 || i == 1) {
                a(coordinatorLayout, appBarLayout);
                if (appBarLayout.e) {
                    appBarLayout.b(appBarLayout.a(view2));
                }
            }
            this.h = new WeakReference(view2);
        }

        public final /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
            a(coordinatorLayout, (AppBarLayout) view, view2, i, iArr);
        }

        public final void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int i3;
            if (i != 0) {
                if (i < 0) {
                    int i4 = -appBarLayout.c();
                    i3 = i4;
                    i2 = appBarLayout.d() + i4;
                } else {
                    i3 = -appBarLayout.c();
                    i2 = 0;
                }
                if (i3 != i2) {
                    iArr[1] = c(coordinatorLayout, appBarLayout, i, i3, i2);
                }
            }
            if (appBarLayout.e) {
                appBarLayout.b(appBarLayout.a(view));
            }
        }

        public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
            int i2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean a2 = super.a(coordinatorLayout, appBarLayout, i);
            int i3 = appBarLayout.b;
            int i4 = this.e;
            if (i4 >= 0 && (i3 & 8) == 0) {
                View childAt = appBarLayout.getChildAt(i4);
                int i5 = -childAt.getBottom();
                if (this.f) {
                    i2 = i5 + qb.l(childAt) + appBarLayout.g();
                } else {
                    i2 = i5 + Math.round(((float) childAt.getHeight()) * this.g);
                }
                b(coordinatorLayout, (View) appBarLayout, i2);
            } else if (i3 != 0) {
                int i6 = i3 & 4;
                if ((i3 & 2) != 0) {
                    int i7 = -appBarLayout.c();
                    if (i6 != 0) {
                        a(coordinatorLayout, appBarLayout, i7);
                    } else {
                        b(coordinatorLayout, (View) appBarLayout, i7);
                    }
                } else if ((i3 & 1) != 0) {
                    if (i6 == 0) {
                        b(coordinatorLayout, (View) appBarLayout, 0);
                    } else {
                        a(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.b = 0;
            this.e = -1;
            a(mk.a(c(), -appBarLayout.c(), 0));
            a(coordinatorLayout, appBarLayout, c(), 0, true);
            appBarLayout.a(c());
            b(coordinatorLayout, appBarLayout);
            return a2;
        }

        public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ahm) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.a((View) appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            int i3 = i & 2;
            boolean z = true;
            if (i3 != 0) {
                if (!appBarLayout.e) {
                    if (appBarLayout.c() != 0) {
                        if (coordinatorLayout.getHeight() - view.getHeight() > appBarLayout.getHeight()) {
                            z = false;
                        }
                    }
                }
                if (z && (valueAnimator = this.d) != null) {
                    valueAnimator.cancel();
                }
                this.h = null;
                this.a = i2;
                return z;
            }
            z = false;
            valueAnimator.cancel();
            this.h = null;
            this.a = i2;
            return z;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class ScrollingViewBehavior extends ajsm {
        public ScrollingViewBehavior() {
        }

        static final AppBarLayout b(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public final /* bridge */ /* synthetic */ View a(List list) {
            return b(list);
        }

        public final float d(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int c = appBarLayout.c();
                int d = appBarLayout.d();
                ahj ahj = ((ahm) appBarLayout.getLayoutParams()).a;
                int b = ahj instanceof BaseBehavior ? ((BaseBehavior) ahj).b() : 0;
                if ((d == 0 || c + b > d) && (i = c - d) != 0) {
                    return (((float) b) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        public final int e(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).c();
            }
            return view.getMeasuredHeight();
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ajsn.e);
            this.d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        public final void a(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                qb.c(coordinatorLayout, qp.b.a());
                qb.c(coordinatorLayout, qp.c.a());
            }
        }

        public final boolean a(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            View a;
            int i4;
            qn qnVar;
            int i5 = view.getLayoutParams().height;
            if ((i5 != -1 && i5 != -2) || (a = a(coordinatorLayout.b(view))) == null) {
                return false;
            }
            int size = View.MeasureSpec.getSize(i3);
            if (size <= 0) {
                size = coordinatorLayout.getHeight();
            } else if (qb.s(a) && (qnVar = coordinatorLayout.g) != null) {
                size += qnVar.b() + qnVar.d();
            }
            int e = size + e(a);
            int measuredHeight = a.getMeasuredHeight();
            if (b()) {
                view.setTranslationY((float) (-measuredHeight));
            } else {
                e -= measuredHeight;
            }
            if (i5 == -1) {
                i4 = JGCastService.FLAG_PRIVATE_DISPLAY;
            } else {
                i4 = Integer.MIN_VALUE;
            }
            coordinatorLayout.a(view, i, i2, View.MeasureSpec.makeMeasureSpec(e, i4));
            return true;
        }

        public final boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout b = b(coordinatorLayout.b(view));
            if (b != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    b.a(false, !z);
                    return true;
                }
            }
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ahj ahj = ((ahm) view2.getLayoutParams()).a;
            if (ahj instanceof BaseBehavior) {
                qb.g(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) ahj).b) + this.c) - f(view2));
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.e) {
                return false;
            }
            appBarLayout.b(appBarLayout.a(view));
            return false;
        }
    }

    public AppBarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    protected static final ajse a(ViewGroup.LayoutParams layoutParams) {
        int i2 = Build.VERSION.SDK_INT;
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new ajse((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new ajse((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new ajse(layoutParams);
    }

    protected static final ajse h() {
        return new ajse();
    }

    private final boolean i() {
        return this.q != null && g() > 0;
    }

    private final void j() {
        this.g = -1;
        this.h = -1;
        this.i = -1;
    }

    private final boolean k() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            return childAt.getVisibility() != 8 && !qb.s(childAt);
        }
    }

    public final void b() {
        setWillNotDraw(!i());
    }

    public final int c() {
        int i2 = this.g;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            ajse ajse = (ajse) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ajse.a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight + ajse.topMargin + ajse.bottomMargin;
            if (i3 == 0 && qb.s(childAt)) {
                i4 -= g();
            }
            if ((i5 & 2) != 0) {
                i4 -= qb.l(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.g = max;
        return max;
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ajse;
    }

    /* access modifiers changed from: package-private */
    public final int d() {
        int i2;
        int i3 = this.h;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            ajse ajse = (ajse) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ajse.a;
            if ((i5 & 5) == 5) {
                int i6 = ajse.topMargin + ajse.bottomMargin;
                if ((i5 & 8) != 0) {
                    i2 = i6 + qb.l(childAt);
                } else {
                    i2 = (i5 & 2) != 0 ? i6 + (measuredHeight - qb.l(childAt)) : i6 + measuredHeight;
                }
                if (childCount == 0 && qb.s(childAt)) {
                    i2 = Math.min(i2, measuredHeight - g());
                }
                i4 += i2;
            } else if (i4 > 0) {
                break;
            }
        }
        int max = Math.max(0, i4);
        this.h = max;
        return max;
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (i()) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f));
            this.q.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.q;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public final int e() {
        int i2 = this.i;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            ajse ajse = (ajse) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ajse.topMargin + ajse.bottomMargin;
            int i5 = ajse.a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight;
            if ((i5 & 2) != 0) {
                i4 -= qb.l(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.i = max;
        return max;
    }

    public final int f() {
        int g2 = g();
        int l2 = qb.l(this);
        if (l2 == 0) {
            int childCount = getChildCount();
            if (childCount > 0) {
                l2 = qb.l(getChildAt(childCount - 1));
            } else {
                l2 = 0;
            }
            if (l2 == 0) {
                return getHeight() / 3;
            }
        }
        return l2 + l2 + g2;
    }

    /* access modifiers changed from: package-private */
    public final int g() {
        qn qnVar = this.c;
        if (qnVar != null) {
            return qnVar.b();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ajzg.a((View) this);
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i2) {
        int i3;
        int i4;
        if (this.p == null) {
            this.p = new int[4];
        }
        int[] iArr = this.p;
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + iArr.length);
        boolean z = this.k;
        if (!z) {
            i3 = -2130969914;
        } else {
            i3 = R.attr.state_liftable;
        }
        iArr[0] = i3;
        int i5 = -2130969915;
        if (z && this.l) {
            i5 = R.attr.state_lifted;
        }
        iArr[1] = i5;
        if (!z) {
            i4 = -2130969912;
        } else {
            i4 = R.attr.state_collapsible;
        }
        iArr[2] = i4;
        int i6 = -2130969911;
        if (z && this.l) {
            i6 = R.attr.state_collapsed;
        }
        iArr[3] = i6;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.n = null;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (qb.s(this) && k()) {
            int g2 = g();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                qb.g(getChildAt(childCount), g2);
            }
        }
        j();
        boolean z2 = false;
        this.a = false;
        int childCount2 = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 < childCount2) {
                if (((ajse) getChildAt(i6).getLayoutParams()).b != null) {
                    this.a = true;
                    break;
                }
                i6++;
            } else {
                break;
            }
        }
        Drawable drawable = this.q;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), g());
        }
        if (!this.d) {
            if (!this.e) {
                int childCount3 = getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount3) {
                        break;
                    }
                    int i8 = ((ajse) getChildAt(i7).getLayoutParams()).a;
                    if ((i8 & 1) == 1 && (i8 & 10) != 0) {
                        z2 = true;
                        break;
                    }
                    i7++;
                }
            } else {
                z2 = true;
            }
            c(z2);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != 1073741824 && qb.s(this) && k()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = mk.a(getMeasuredHeight() + g(), 0, View.MeasureSpec.getSize(i3));
            } else if (mode == 0) {
                measuredHeight += g();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        j();
    }

    public final void setElevation(float f2) {
        super.setElevation(f2);
        ajzg.a((View) this, f2);
    }

    public final void setOrientation(int i2) {
        if (i2 == 1) {
            super.setOrientation(1);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public final void setVisibility(int i2) {
        boolean z;
        super.setVisibility(i2);
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.q;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    public final void b(ajsd ajsd) {
        List list = this.j;
        if (list != null && ajsd != null) {
            list.remove(ajsd);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppBarLayout(android.content.Context r15, android.util.AttributeSet r16, int r17) {
        /*
            r14 = this;
            r1 = r14
            r0 = r16
            r8 = r17
            r2 = 2132018783(0x7f14065f, float:1.9675882E38)
            r3 = r15
            android.content.Context r2 = defpackage.akdg.a(r15, r0, r8, r2)
            r14.<init>(r2, r0, r8)
            r9 = -1
            r1.g = r9
            r1.h = r9
            r1.i = r9
            r10 = 0
            r1.b = r10
            android.content.Context r11 = r14.getContext()
            r12 = 1
            r14.setOrientation(r12)
            int r2 = android.os.Build.VERSION.SDK_INT
            int[] r2 = defpackage.ajsq.a
            android.view.ViewOutlineProvider r2 = android.view.ViewOutlineProvider.BOUNDS
            r14.setOutlineProvider(r2)
            android.content.Context r13 = r14.getContext()
            int[] r4 = defpackage.ajsq.a
            int[] r7 = new int[r10]
            r6 = 2132018783(0x7f14065f, float:1.9675882E38)
            r2 = r13
            r3 = r16
            r5 = r17
            android.content.res.TypedArray r2 = defpackage.ajya.a(r2, r3, r4, r5, r6, r7)
            boolean r3 = r2.hasValue(r10)     // Catch:{ all -> 0x0139 }
            if (r3 != 0) goto L_0x0046
            goto L_0x0052
        L_0x0046:
            int r3 = r2.getResourceId(r10, r10)     // Catch:{ all -> 0x0139 }
            android.animation.StateListAnimator r3 = android.animation.AnimatorInflater.loadStateListAnimator(r13, r3)     // Catch:{ all -> 0x0139 }
            r14.setStateListAnimator(r3)     // Catch:{ all -> 0x0139 }
        L_0x0052:
            r2.recycle()
            int[] r4 = defpackage.ajsn.a
            r6 = 2132018783(0x7f14065f, float:1.9675882E38)
            int[] r7 = new int[r10]
            r2 = r11
            r3 = r16
            r5 = r17
            android.content.res.TypedArray r0 = defpackage.ajya.a(r2, r3, r4, r5, r6, r7)
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r10)
            defpackage.qb.a((android.view.View) r14, (android.graphics.drawable.Drawable) r2)
            android.graphics.drawable.Drawable r2 = r14.getBackground()
            boolean r2 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L_0x0090
            android.graphics.drawable.Drawable r2 = r14.getBackground()
            android.graphics.drawable.ColorDrawable r2 = (android.graphics.drawable.ColorDrawable) r2
            ajzf r3 = new ajzf
            r3.<init>()
            int r2 = r2.getColor()
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r3.c((android.content.res.ColorStateList) r2)
            r3.a((android.content.Context) r11)
            defpackage.qb.a((android.view.View) r14, (android.graphics.drawable.Drawable) r3)
        L_0x0090:
            r2 = 4
            boolean r3 = r0.hasValue(r2)
            if (r3 == 0) goto L_0x009f
            boolean r2 = r0.getBoolean(r2, r10)
            r14.a(r2, r10, r10)
        L_0x009f:
            int r2 = android.os.Build.VERSION.SDK_INT
            r2 = 3
            boolean r3 = r0.hasValue(r2)
            if (r3 == 0) goto L_0x00b0
            int r2 = r0.getDimensionPixelSize(r2, r10)
            float r2 = (float) r2
            defpackage.ajsq.a(r14, r2)
        L_0x00b0:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 < r3) goto L_0x00d2
            r2 = 2
            boolean r3 = r0.hasValue(r2)
            if (r3 == 0) goto L_0x00c4
            boolean r2 = r0.getBoolean(r2, r10)
            r14.setKeyboardNavigationCluster(r2)
        L_0x00c4:
            boolean r2 = r0.hasValue(r12)
            if (r2 == 0) goto L_0x00d2
            boolean r2 = r0.getBoolean(r12, r10)
            r14.setTouchscreenBlocksFocus(r2)
        L_0x00d2:
            r2 = 5
            boolean r2 = r0.getBoolean(r2, r10)
            r1.e = r2
            r2 = 6
            int r2 = r0.getResourceId(r2, r9)
            r1.m = r2
            r2 = 7
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            android.graphics.drawable.Drawable r3 = r1.q
            if (r3 != r2) goto L_0x00ea
            goto L_0x012d
        L_0x00ea:
            r4 = 0
            if (r3 == 0) goto L_0x00f0
            r3.setCallback(r4)
        L_0x00f0:
            if (r2 == 0) goto L_0x00f7
            android.graphics.drawable.Drawable r4 = r2.mutate()
            goto L_0x00f8
        L_0x00f7:
        L_0x00f8:
            r1.q = r4
            if (r4 != 0) goto L_0x00fd
            goto L_0x0127
        L_0x00fd:
            boolean r2 = r4.isStateful()
            if (r2 == 0) goto L_0x010c
            android.graphics.drawable.Drawable r2 = r1.q
            int[] r3 = r14.getDrawableState()
            r2.setState(r3)
        L_0x010c:
            android.graphics.drawable.Drawable r2 = r1.q
            int r3 = defpackage.qb.h(r14)
            defpackage.ma.b(r2, r3)
            android.graphics.drawable.Drawable r2 = r1.q
            int r3 = r14.getVisibility()
            if (r3 != 0) goto L_0x011e
            goto L_0x011f
        L_0x011e:
            r12 = 0
        L_0x011f:
            r2.setVisible(r12, r10)
            android.graphics.drawable.Drawable r2 = r1.q
            r2.setCallback(r14)
        L_0x0127:
            r14.b()
            defpackage.qb.e(r14)
        L_0x012d:
            r0.recycle()
            ajrx r0 = new ajrx
            r0.<init>(r14)
            defpackage.qb.a((android.view.View) r14, (defpackage.pq) r0)
            return
        L_0x0139:
            r0 = move-exception
            r2.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final boolean b(boolean z) {
        float f2;
        if (this.l == z) {
            return false;
        }
        this.l = z;
        refreshDrawableState();
        if (this.e && (getBackground() instanceof ajzf)) {
            ajzf ajzf = (ajzf) getBackground();
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            if (!z) {
                f2 = dimension;
            } else {
                f2 = 0.0f;
            }
            if (!z) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.o;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f2, dimension});
            this.o = ofFloat;
            ofFloat.setDuration((long) getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.o.setInterpolator(ajrr.a);
            this.o.addUpdateListener(new ajry(ajzf));
            this.o.start();
        }
        return true;
    }

    private final void a(boolean z, boolean z2, boolean z3) {
        int i2 = 0;
        int i3 = (!z ? 2 : 1) | (!z2 ? 0 : 4);
        if (z3) {
            i2 = 8;
        }
        this.b = i3 | i2;
        requestLayout();
    }

    public final ahj a() {
        return new Behavior();
    }

    /* renamed from: a */
    public final ajse generateLayoutParams(AttributeSet attributeSet) {
        return new ajse(getContext(), attributeSet);
    }

    public final void c(boolean z) {
        if (this.k != z) {
            this.k = z;
            refreshDrawableState();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        this.f = i2;
        if (!willNotDraw()) {
            qb.e(this);
        }
        List list = this.j;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ajsd ajsd = (ajsd) this.j.get(i3);
                if (ajsd != null) {
                    ajsd.a(this, i2);
                }
            }
        }
    }

    public final void a(ajsd ajsd) {
        if (this.j == null) {
            this.j = new ArrayList();
        }
        if (ajsd != null && !this.j.contains(ajsd)) {
            this.j.add(ajsd);
        }
    }

    public final void a(boolean z) {
        a(z, qb.A(this));
    }

    public final void a(boolean z, boolean z2) {
        a(z, z2, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: android.view.View} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.view.View r5) {
        /*
            r4 = this;
            java.lang.ref.WeakReference r0 = r4.n
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L_0x0032
            int r0 = r4.m
            if (r0 != r2) goto L_0x000b
            goto L_0x0032
        L_0x000b:
            if (r5 == 0) goto L_0x0012
            android.view.View r0 = r5.findViewById(r0)
            goto L_0x0013
        L_0x0012:
            r0 = r1
        L_0x0013:
            if (r0 != 0) goto L_0x0029
            android.view.ViewParent r3 = r4.getParent()
            boolean r3 = r3 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0029
            android.view.ViewParent r0 = r4.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r3 = r4.m
            android.view.View r0 = r0.findViewById(r3)
        L_0x0029:
            if (r0 == 0) goto L_0x0032
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r0)
            r4.n = r3
        L_0x0032:
            java.lang.ref.WeakReference r0 = r4.n
            if (r0 == 0) goto L_0x003e
            java.lang.Object r0 = r0.get()
            r1 = r0
            android.view.View r1 = (android.view.View) r1
            goto L_0x003f
        L_0x003e:
        L_0x003f:
            if (r1 == 0) goto L_0x0043
            r5 = r1
            goto L_0x0044
        L_0x0043:
        L_0x0044:
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0056
            boolean r2 = r5.canScrollVertically(r2)
            if (r2 != 0) goto L_0x0057
            int r5 = r5.getScrollY()
            if (r5 > 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            return r0
        L_0x0056:
            r0 = 0
        L_0x0057:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.a(android.view.View):boolean");
    }
}
