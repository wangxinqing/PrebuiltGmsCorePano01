package defpackage;

import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* renamed from: adk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adk implements Runnable {
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator d = RecyclerView.sQuinticInterpolator;
    public final /* synthetic */ RecyclerView e;
    private boolean f = false;
    private boolean g = false;

    public adk(RecyclerView recyclerView) {
        this.e = recyclerView;
        this.c = new OverScroller(recyclerView.getContext(), RecyclerView.sQuinticInterpolator);
    }

    private final void c() {
        this.e.removeCallbacks(this);
        qb.a((View) this.e, (Runnable) this);
    }

    public final void a() {
        if (this.f) {
            this.g = true;
        } else {
            c();
        }
    }

    public final void b() {
        this.e.removeCallbacks(this);
        this.c.abortAnimation();
    }

    public final void run() {
        int i;
        int i2;
        boolean z;
        int i3;
        RecyclerView recyclerView = this.e;
        if (recyclerView.mLayout != null) {
            this.g = false;
            this.f = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.a;
                int i5 = currY - this.b;
                this.a = currX;
                this.b = currY;
                RecyclerView recyclerView2 = this.e;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i4, i5, iArr, (int[]) null, 1)) {
                    int[] iArr2 = this.e.mReusableIntPair;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (this.e.getOverScrollMode() != 2) {
                    this.e.considerReleasingGlowsOnScroll(i4, i5);
                }
                RecyclerView recyclerView3 = this.e;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i4, i5, iArr3);
                    RecyclerView recyclerView4 = this.e;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i4 -= i;
                    i5 -= i2;
                    adh adh = recyclerView4.mLayout.u;
                    if (adh != null && !adh.d && adh.e) {
                        int a2 = recyclerView4.mState.a();
                        if (a2 == 0) {
                            adh.a();
                        } else if (adh.a >= a2) {
                            adh.a = a2 - 1;
                            adh.a(i, i2);
                        } else {
                            adh.a(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!this.e.mItemDecorations.isEmpty()) {
                    this.e.invalidate();
                }
                RecyclerView recyclerView5 = this.e;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i, i2, i4, i5, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = this.e;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    recyclerView6.dispatchOnScrolled(i, i2);
                }
                if (!this.e.awakenScrollBars()) {
                    this.e.invalidate();
                }
                int currX2 = overScroller.getCurrX();
                int finalX = overScroller.getFinalX();
                int currY2 = overScroller.getCurrY();
                int finalY = overScroller.getFinalY();
                if (overScroller.isFinished()) {
                    z = true;
                } else {
                    z = (currX2 == finalX || i6 != 0) && (currY2 == finalY || i7 != 0);
                }
                RecyclerView recyclerView7 = this.e;
                adh adh2 = recyclerView7.mLayout.u;
                if ((adh2 == null || !adh2.d) && z) {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i6 < 0) {
                            i3 = -currVelocity;
                        } else {
                            i3 = i6 > 0 ? currVelocity : 0;
                        }
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        this.e.absorbGlows(i3, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        this.e.mPrefetchRegistry.a();
                    }
                } else {
                    a();
                    RecyclerView recyclerView8 = this.e;
                    aaz aaz = recyclerView8.mGapWorker;
                    if (aaz != null) {
                        aaz.a(recyclerView8, i, i2);
                    }
                }
            }
            adh adh3 = this.e.mLayout.u;
            if (adh3 != null && adh3.d) {
                adh3.a(0, 0);
            }
            this.f = false;
            if (!this.g) {
                this.e.setScrollState(0);
                this.e.stopNestedScroll(1);
                return;
            }
            c();
            return;
        }
        b();
    }

    public final void a(int i, int i2, int i3, Interpolator interpolator) {
        int i4;
        int i5;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            int sqrt = (int) Math.sqrt(0.0d);
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            int height = abs <= abs2 ? this.e.getHeight() : this.e.getWidth();
            float f2 = (float) (height / 2);
            float f3 = (float) height;
            float sin = f2 + (((float) Math.sin((double) ((Math.min(1.0f, ((float) sqrt2) / f3) - 8.0f) * 0.47123894f))) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(sin / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (abs <= abs2) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f3) + 1.0f) * 300.0f);
            }
            i4 = Math.min(i5, 2000);
        } else {
            i4 = i3;
        }
        if (interpolator == null) {
            interpolator = RecyclerView.sQuinticInterpolator;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.c = new OverScroller(this.e.getContext(), interpolator);
        }
        this.b = 0;
        this.a = 0;
        this.e.setScrollState(2);
        this.c.startScroll(0, 0, i, i2, i4);
        if (Build.VERSION.SDK_INT < 23) {
            this.c.computeScrollOffset();
        }
        a();
    }
}
