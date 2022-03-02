package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;
import com.google.android.gms.plus.audience.AudienceSelectionListView;
import com.google.android.gms.plus.audience.AudienceSelectionScrollView;

/* renamed from: yqb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class yqb extends bjs implements LoaderManager.LoaderCallbacks, View.OnClickListener, AbsListView.OnScrollListener, ypc, ypt, ypr, ypq, yps, ypb {
    private int a;
    private int b;
    private boolean c;
    public AudienceSelectionScrollView g;
    public FrameLayout h;
    public int i = 0;
    public int j;
    public FrameLayout k;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public boolean o;
    public int p = 0;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;

    public static final int d(int i2) {
        return (i2 & -16777216) == 0 ? i2 | -16777216 : i2;
    }

    public final void a(int i2, boolean z) {
        if (i2 >= this.a && z && this.i == 0) {
            this.a = i2;
            this.i = 1;
        }
    }

    public final boolean a() {
        return this.n;
    }

    public final void b(int i2) {
        int i3;
        if (this.n) {
            if (this.s != i2 && i2 <= this.t) {
                this.m = false;
            }
            this.s = i2;
            int i4 = this.q;
            if (i4 != 0) {
                this.u = false;
                this.k.setLayoutParams(new LinearLayout.LayoutParams(-1, i4));
                int dimension = this.q - ((int) getResources().getDimension(R.dimen.plus_add_to_circles_view_margin));
                int dimension2 = (int) getResources().getDimension(R.dimen.plus_add_to_circles_view_padding);
                int dimension3 = i2 == 0 ? (int) getResources().getDimension(R.dimen.plus_audience_selection_loading_bar_height) : 0;
                int dimension4 = (int) getResources().getDimension(R.dimen.plus_audience_selection_list_update_item_height);
                int dimension5 = (int) getResources().getDimension(R.dimen.plus_audience_selection_list_update_item_padding_extra);
                int dimension6 = (int) getResources().getDimension(R.dimen.plus_create_circle_list_item_height);
                int i5 = dimension5 + dimension5;
                int dimension7 = (i2 * dimension4) + dimension3 + i5 + ((int) getResources().getDimension(R.dimen.plus_create_circle_list_item_height));
                int i6 = this.r;
                float dimension8 = getResources().getDimension(R.dimen.plus_add_to_circles_view_margin);
                int i7 = i6 - ((int) (dimension8 + dimension8));
                int i8 = (dimension - this.j) - dimension2;
                if (dimension7 > i8) {
                    dimension7 = i8;
                }
                int dimension9 = (int) getResources().getDimension(R.dimen.plus_add_to_circles_picker_max_width);
                if (i7 > dimension9) {
                    i7 = dimension9;
                }
                this.h.setLayoutParams(new LinearLayout.LayoutParams(-1, dimension7));
                LinearLayout linearLayout = (LinearLayout) this.h.getParent();
                if (linearLayout != null) {
                    linearLayout.setLayoutParams(new LinearLayout.LayoutParams(i7, -2));
                }
                if (!this.m) {
                    this.m = true;
                    float f = (float) i2;
                    int i9 = this.t;
                    if (i2 > i9 && !this.c) {
                        i3 = (int) (((((float) i9) + 0.6f) * ((float) dimension4)) + ((float) dimension5) + ((float) this.j) + ((float) dimension2) + ((float) dimension3));
                    } else {
                        i3 = (int) ((f * ((float) dimension4)) + ((float) i5) + ((float) dimension6) + ((float) this.j) + ((float) dimension2) + ((float) dimension3));
                    }
                    if (i3 < dimension) {
                        dimension = i3;
                    } else {
                        this.v = true;
                    }
                    int i10 = this.j;
                    this.a = dimension7 + i10;
                    if (this.s > 2) {
                        this.b = i10 + dimension4 + dimension4 + dimension6;
                    } else {
                        this.b = i10;
                    }
                    ObjectAnimator duration = ObjectAnimator.ofInt(this.g, "scrollY", new int[]{dimension}).setDuration(200);
                    duration.setInterpolator(new DecelerateInterpolator());
                    duration.addListener(new yqa(this));
                    this.g.postDelayed(new ypx(duration), 50);
                    this.g.postDelayed(new ypv(this), 750);
                    return;
                }
                return;
            }
            this.u = true;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean c(int i2) {
        int i3;
        if (!this.n || (i3 = this.p) == 2) {
            return true;
        }
        if (i3 != 1) {
            this.p = 1;
            a((Animator.AnimatorListener) null);
            this.g.postDelayed(new ypu(this, i2), 250);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract void f();

    public final void finish() {
        super.finish();
        if (this.n) {
            overridePendingTransition(0, 0);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void h();

    /* access modifiers changed from: protected */
    public final void o() {
        this.c = true;
        this.u = true;
        int i2 = 0;
        this.m = false;
        this.v = true;
        p();
        this.g.setVisibility(0);
        this.o = true;
        int i3 = Build.VERSION.SDK_INT;
        this.g.setScrollY(0);
        ypl q2 = q();
        if (q2 != null && q2.getListView() != null) {
            ListView listView = q2.getListView();
            if (this.c) {
                i2 = this.s;
            }
            listView.setSelection(i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = true;
        if (bundle != null && !bundle.getBoolean("STATE_IS_LIST_CONTAINER_VISIBLE", true)) {
            z = false;
        }
        this.o = z;
        this.c = false;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("STATE_IS_LIST_CONTAINER_VISIBLE", this.o);
    }

    public final void onScroll(AbsListView absListView, int i2, int i3, int i4) {
    }

    public final void onScrollStateChanged(AbsListView absListView, int i2) {
        if (i2 == 0 && this.g.getScrollY() >= this.a) {
            this.a = this.g.getScrollY();
            boolean z = true;
            this.i = 1;
            ViewParent parent = absListView.getParent();
            if (this.i == 0) {
                z = false;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.n && this.h.getVisibility() == 8) {
            this.h.setVisibility(0);
            this.g.scrollTo(0, 0);
            TextView textView = (TextView) findViewById(R.id.add_to_circles_title);
            textView.requestFocus();
            textView.sendAccessibilityEvent(8);
        }
    }

    public final void p() {
        ViewTreeObserver viewTreeObserver = this.g.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ypw(this));
        }
    }

    /* access modifiers changed from: protected */
    public ypl q() {
        return null;
    }

    public final void a(Animator.AnimatorListener animatorListener) {
        this.l = false;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.g, "scrollY", new int[]{0});
        float dimension = getResources().getDimension(R.dimen.plus_add_to_circles_view_padding);
        int i2 = this.t;
        ObjectAnimator duration = ofInt.setDuration(Math.max(150, (((long) this.g.getScrollY()) * 200) / ((long) ((int) (((((((float) i2) + 0.6f) * getResources().getDimension(R.dimen.plus_audience_selection_list_update_item_height)) + ((float) this.j)) + ((float) ((int) (dimension + 0.5f)))) + 0.5f)))));
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        if (animatorListener != null) {
            duration.addListener(animatorListener);
        }
        this.g.postDelayed(new ypy(duration), 50);
    }

    public final void a(AudienceSelectionListView audienceSelectionListView) {
        if (this.n) {
            audienceSelectionListView.getParent().requestDisallowInterceptTouchEvent(this.i != 0);
        }
    }

    public final void a(AudienceSelectionListView audienceSelectionListView, boolean z) {
        if (z && audienceSelectionListView.getChildAt(0) != null && audienceSelectionListView.getFirstVisiblePosition() == 0 && audienceSelectionListView.getChildAt(0).getTop() == 0 && this.i == 1) {
            this.i = 0;
            audienceSelectionListView.getParent().requestDisallowInterceptTouchEvent(false);
        }
    }

    public final void a(AudienceSelectionScrollView audienceSelectionScrollView, int i2) {
        if (audienceSelectionScrollView.getId() != R.id.audience_selection_container_view) {
            return;
        }
        if (this.l && i2 < this.b) {
            this.l = false;
            h();
        } else if (this.i == 1 && i2 < this.a) {
            this.i = 0;
        }
    }
}
