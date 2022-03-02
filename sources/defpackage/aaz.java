package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: aaz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaz implements Runnable {
    public static final ThreadLocal a = new ThreadLocal();
    static final Comparator e = new aaw();
    public final ArrayList b = new ArrayList();
    long c;
    public long d;
    private final ArrayList f = new ArrayList();

    private static final adl a(RecyclerView recyclerView, int i, long j) {
        int b2 = recyclerView.mChildHelper.b();
        for (int i2 = 0; i2 < b2; i2++) {
            adl childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.c(i2));
            if (childViewHolderInt.c == i && !childViewHolderInt.k()) {
                return null;
            }
        }
        adb adb = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            adl a2 = adb.a(i, j);
            if (a2 != null) {
                if (!a2.m() || a2.k()) {
                    adb.a(a2, false);
                } else {
                    adb.a(a2.a);
                }
            }
            return a2;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    public final void run() {
        aay aay;
        RecyclerView recyclerView;
        long j;
        RecyclerView recyclerView2;
        aay aay2;
        boolean z;
        long j2 = 0;
        try {
            mv.a("RV Prefetch");
            if (!this.b.isEmpty()) {
                int size = this.b.size();
                long j3 = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView3 = (RecyclerView) this.b.get(i);
                    if (recyclerView3.getWindowVisibility() == 0) {
                        j3 = Math.max(recyclerView3.getDrawingTime(), j3);
                    }
                }
                if (j3 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j3) + this.d;
                    int size2 = this.b.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size2; i3++) {
                        RecyclerView recyclerView4 = (RecyclerView) this.b.get(i3);
                        if (recyclerView4.getWindowVisibility() == 0) {
                            recyclerView4.mPrefetchRegistry.a(recyclerView4, false);
                            i2 += recyclerView4.mPrefetchRegistry.d;
                        }
                    }
                    this.f.ensureCapacity(i2);
                    int i4 = 0;
                    for (int i5 = 0; i5 < size2; i5++) {
                        RecyclerView recyclerView5 = (RecyclerView) this.b.get(i5);
                        if (recyclerView5.getWindowVisibility() == 0) {
                            aax aax = recyclerView5.mPrefetchRegistry;
                            int abs = Math.abs(aax.a) + Math.abs(aax.b);
                            int i6 = 0;
                            while (true) {
                                int i7 = aax.d;
                                if (i6 >= i7 + i7) {
                                    break;
                                }
                                if (i4 >= this.f.size()) {
                                    aay2 = new aay();
                                    this.f.add(aay2);
                                } else {
                                    aay2 = (aay) this.f.get(i4);
                                }
                                int[] iArr = aax.c;
                                int i8 = iArr[i6 + 1];
                                if (i8 <= abs) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                aay2.a = z;
                                aay2.b = abs;
                                aay2.c = i8;
                                aay2.d = recyclerView5;
                                aay2.e = iArr[i6];
                                i4++;
                                i6 += 2;
                            }
                        }
                    }
                    Collections.sort(this.f, e);
                    for (int i9 = 0; i9 < this.f.size() && (recyclerView = aay.d) != null; i9++) {
                        if (!(aay = (aay) this.f.get(i9)).a) {
                            j = nanos;
                        } else {
                            j = Long.MAX_VALUE;
                        }
                        adl a2 = a(recyclerView, aay.e, j);
                        if (a2 != null && a2.b != null) {
                            if (a2.m() && !a2.k() && (recyclerView2 = (RecyclerView) a2.b.get()) != null) {
                                if (recyclerView2.mDataSetHasChangedAfterLayout) {
                                    if (recyclerView2.mChildHelper.b() != 0) {
                                        recyclerView2.removeAndRecycleViews();
                                    }
                                }
                                aax aax2 = recyclerView2.mPrefetchRegistry;
                                aax2.a(recyclerView2, true);
                                if (aax2.d != 0) {
                                    mv.a("RV Nested Prefetch");
                                    adi adi = recyclerView2.mState;
                                    acg acg = recyclerView2.mAdapter;
                                    adi.d = 1;
                                    adi.e = acg.a();
                                    adi.g = false;
                                    adi.h = false;
                                    adi.i = false;
                                    int i10 = 0;
                                    while (true) {
                                        int i11 = aax2.d;
                                        if (i10 >= i11 + i11) {
                                            break;
                                        }
                                        a(recyclerView2, aax2.c[i10], nanos);
                                        i10 += 2;
                                    }
                                    mv.a();
                                }
                            }
                        }
                        aay.a = false;
                        aay.b = 0;
                        aay.c = 0;
                        aay.d = null;
                        aay.e = 0;
                    }
                    this.c = 0;
                    mv.a();
                }
                j2 = 0;
            }
            this.c = j2;
            mv.a();
        } catch (Throwable th) {
            this.c = 0;
            throw th;
        } finally {
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.c == 0) {
            this.c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        aax aax = recyclerView.mPrefetchRegistry;
        aax.a = i;
        aax.b = i2;
    }
}
