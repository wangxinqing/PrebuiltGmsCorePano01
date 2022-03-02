package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: adb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adb {
    public final ArrayList a = new ArrayList();
    public ArrayList b = null;
    public final ArrayList c = new ArrayList();
    public final List d = Collections.unmodifiableList(this.a);
    public int e = 2;
    int f = 2;
    public ada g;
    public adj h;
    public final /* synthetic */ RecyclerView i;

    public adb(RecyclerView recyclerView) {
        this.i = recyclerView;
    }

    private final void a(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, true);
            }
        }
        if (!z) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
            return;
        }
        int visibility = viewGroup.getVisibility();
        viewGroup.setVisibility(4);
        viewGroup.setVisibility(visibility);
    }

    public final void c() {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            c(size);
        }
        this.c.clear();
        if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
            this.i.mPrefetchRegistry.a();
        }
    }

    public final ada d() {
        if (this.g == null) {
            this.g = new ada();
        }
        return this.g;
    }

    public final View b(int i2) {
        return a(i2, Long.MAX_VALUE).a;
    }

    public final void b() {
        act act = this.i.mLayout;
        this.f = this.e + (act != null ? act.y : 0);
        for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.f; size--) {
            c(size);
        }
    }

    public final int a(int i2) {
        if (i2 < 0 || i2 >= this.i.mState.a()) {
            throw new IndexOutOfBoundsException("invalid position " + i2 + ". State item count is " + this.i.mState.a() + this.i.exceptionLabel());
        }
        RecyclerView recyclerView = this.i;
        return recyclerView.mState.g ? recyclerView.mAdapterHelper.b(i2) : i2;
    }

    public final void b(adl adl) {
        if (adl.n) {
            this.b.remove(adl);
        } else {
            this.a.remove(adl);
        }
        adl.m = null;
        adl.n = false;
        adl.i();
    }

    public final void c(int i2) {
        a((adl) this.c.get(i2), true);
        this.c.remove(i2);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0300, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04bb, code lost:
        if ((r6 + r9) < r20) goto L_0x04be;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.adl a(int r19, long r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            if (r1 < 0) goto L_0x055b
            android.support.v7.widget.RecyclerView r2 = r0.i
            adi r2 = r2.mState
            int r2 = r2.a()
            if (r1 >= r2) goto L_0x055b
            android.support.v7.widget.RecyclerView r2 = r0.i
            adi r2 = r2.mState
            boolean r2 = r2.g
            r3 = 32
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L_0x0090
            java.util.ArrayList r2 = r0.b
            if (r2 == 0) goto L_0x0089
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0028
            r8 = r6
            goto L_0x008a
        L_0x0028:
            r7 = 0
        L_0x0029:
            if (r7 >= r2) goto L_0x0047
            java.util.ArrayList r8 = r0.b
            java.lang.Object r8 = r8.get(r7)
            adl r8 = (defpackage.adl) r8
            boolean r9 = r8.h()
            if (r9 == 0) goto L_0x003a
        L_0x0039:
            goto L_0x0044
        L_0x003a:
            int r9 = r8.c()
            if (r9 != r1) goto L_0x0039
            r8.b(r3)
            goto L_0x008a
        L_0x0044:
            int r7 = r7 + 1
            goto L_0x0029
        L_0x0047:
            android.support.v7.widget.RecyclerView r7 = r0.i
            acg r8 = r7.mAdapter
            boolean r8 = r8.c
            if (r8 == 0) goto L_0x0089
            yn r7 = r7.mAdapterHelper
            int r7 = r7.b((int) r1)
            if (r7 <= 0) goto L_0x0089
            android.support.v7.widget.RecyclerView r8 = r0.i
            acg r8 = r8.mAdapter
            int r8 = r8.a()
            if (r7 >= r8) goto L_0x0089
            android.support.v7.widget.RecyclerView r8 = r0.i
            acg r8 = r8.mAdapter
            long r7 = r8.J(r7)
            r9 = 0
        L_0x006a:
            if (r9 >= r2) goto L_0x0089
            java.util.ArrayList r10 = r0.b
            java.lang.Object r10 = r10.get(r9)
            adl r10 = (defpackage.adl) r10
            boolean r11 = r10.h()
            if (r11 == 0) goto L_0x007b
        L_0x007a:
            goto L_0x0086
        L_0x007b:
            long r11 = r10.e
            int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r13 != 0) goto L_0x007a
            r10.b(r3)
            r8 = r10
            goto L_0x008a
        L_0x0086:
            int r9 = r9 + 1
            goto L_0x006a
        L_0x0089:
            r8 = r6
        L_0x008a:
            if (r8 == 0) goto L_0x008e
            r2 = 1
            goto L_0x0092
        L_0x008e:
            r2 = 0
            goto L_0x0092
        L_0x0090:
            r8 = r6
            r2 = 0
        L_0x0092:
            r7 = -1
            if (r8 != 0) goto L_0x024e
            java.util.ArrayList r8 = r0.a
            int r9 = r8.size()
            r8 = 0
        L_0x009c:
            if (r8 < r9) goto L_0x018a
            android.support.v7.widget.RecyclerView r8 = r0.i
            zv r8 = r8.mChildHelper
            java.util.List r9 = r8.b
            int r9 = r9.size()
            r10 = 0
        L_0x00a9:
            if (r10 >= r9) goto L_0x00ce
            java.util.List r11 = r8.b
            java.lang.Object r11 = r11.get(r10)
            android.view.View r11 = (android.view.View) r11
            adl r12 = android.support.v7.widget.RecyclerView.getChildViewHolderInt(r11)
            int r13 = r12.c()
            if (r13 == r1) goto L_0x00be
            goto L_0x00cb
        L_0x00be:
            boolean r13 = r12.k()
            if (r13 != 0) goto L_0x00cb
            boolean r12 = r12.n()
            if (r12 != 0) goto L_0x00cb
            goto L_0x00cf
        L_0x00cb:
            int r10 = r10 + 1
            goto L_0x00a9
        L_0x00ce:
            r11 = r6
        L_0x00cf:
            if (r11 == 0) goto L_0x015a
            adl r8 = android.support.v7.widget.RecyclerView.getChildViewHolderInt(r11)
            android.support.v7.widget.RecyclerView r9 = r0.i
            zv r9 = r9.mChildHelper
            ace r10 = r9.c
            int r10 = r10.a((android.view.View) r11)
            if (r10 < 0) goto L_0x0143
            zu r12 = r9.a
            boolean r12 = r12.c(r10)
            if (r12 == 0) goto L_0x012c
            zu r12 = r9.a
            r12.b(r10)
            r9.d((android.view.View) r11)
            android.support.v7.widget.RecyclerView r9 = r0.i
            zv r9 = r9.mChildHelper
            int r9 = r9.b((android.view.View) r11)
            if (r9 == r7) goto L_0x010c
            android.support.v7.widget.RecyclerView r10 = r0.i
            zv r10 = r10.mChildHelper
            r10.d((int) r9)
            r0.c((android.view.View) r11)
            r9 = 8224(0x2020, float:1.1524E-41)
            r8.b(r9)
            goto L_0x01b8
        L_0x010c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "layout index should not be -1 after unhiding a view:"
            r2.append(r3)
            r2.append(r8)
            android.support.v7.widget.RecyclerView r3 = r0.i
            java.lang.String r3 = r3.exceptionLabel()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x012c:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "trying to unhide a view that was not hidden"
            r2.append(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0143:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "view is not a child, cannot hide "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x015a:
            java.util.ArrayList r8 = r0.c
            int r8 = r8.size()
            r9 = 0
        L_0x0161:
            if (r9 >= r8) goto L_0x0188
            java.util.ArrayList r10 = r0.c
            java.lang.Object r10 = r10.get(r9)
            adl r10 = (defpackage.adl) r10
            boolean r11 = r10.k()
            if (r11 == 0) goto L_0x0172
        L_0x0171:
            goto L_0x0185
        L_0x0172:
            int r11 = r10.c()
            if (r11 != r1) goto L_0x0171
            boolean r11 = r10.p()
            if (r11 != 0) goto L_0x0185
            java.util.ArrayList r8 = r0.c
            r8.remove(r9)
            r8 = r10
            goto L_0x01b8
        L_0x0185:
            int r9 = r9 + 1
            goto L_0x0161
        L_0x0188:
            r8 = r6
            goto L_0x01b8
        L_0x018a:
            java.util.ArrayList r10 = r0.a
            java.lang.Object r10 = r10.get(r8)
            adl r10 = (defpackage.adl) r10
            boolean r11 = r10.h()
            if (r11 == 0) goto L_0x019a
        L_0x0198:
            goto L_0x024a
        L_0x019a:
            int r11 = r10.c()
            if (r11 != r1) goto L_0x0198
            boolean r11 = r10.k()
            if (r11 != 0) goto L_0x024a
            android.support.v7.widget.RecyclerView r11 = r0.i
            adi r11 = r11.mState
            boolean r11 = r11.g
            if (r11 != 0) goto L_0x01b4
            boolean r11 = r10.n()
            if (r11 != 0) goto L_0x024a
        L_0x01b4:
            r10.b(r3)
            r8 = r10
        L_0x01b8:
            if (r8 != 0) goto L_0x01bc
            goto L_0x024f
        L_0x01bc:
            boolean r9 = r8.n()
            if (r9 == 0) goto L_0x01ce
            android.support.v7.widget.RecyclerView r9 = r0.i
            adi r9 = r9.mState
            boolean r9 = r9.g
            if (r9 != 0) goto L_0x01cb
            goto L_0x0205
        L_0x01cb:
            r2 = 1
            goto L_0x024f
        L_0x01ce:
            int r9 = r8.c
            if (r9 < 0) goto L_0x022a
            android.support.v7.widget.RecyclerView r10 = r0.i
            acg r10 = r10.mAdapter
            int r10 = r10.a()
            if (r9 >= r10) goto L_0x022a
            android.support.v7.widget.RecyclerView r9 = r0.i
            adi r10 = r9.mState
            boolean r10 = r10.g
            if (r10 != 0) goto L_0x01f0
            acg r9 = r9.mAdapter
            int r10 = r8.c
            int r9 = r9.a((int) r10)
            int r10 = r8.f
            if (r9 != r10) goto L_0x0205
        L_0x01f0:
            android.support.v7.widget.RecyclerView r9 = r0.i
            acg r9 = r9.mAdapter
            boolean r10 = r9.c
            if (r10 == 0) goto L_0x0228
            long r10 = r8.e
            int r12 = r8.c
            long r12 = r9.J(r12)
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 != 0) goto L_0x0205
            goto L_0x0228
        L_0x0205:
            r9 = 4
            r8.b(r9)
            boolean r9 = r8.f()
            if (r9 == 0) goto L_0x021a
            android.support.v7.widget.RecyclerView r9 = r0.i
            android.view.View r10 = r8.a
            r9.removeDetachedView(r10, r5)
            r8.g()
            goto L_0x0223
        L_0x021a:
            boolean r9 = r8.h()
            if (r9 == 0) goto L_0x0223
            r8.i()
        L_0x0223:
            r0.a((defpackage.adl) r8)
            r8 = r6
            goto L_0x024f
        L_0x0228:
            r2 = 1
            goto L_0x024f
        L_0x022a:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Inconsistency detected. Invalid view holder adapter position"
            r2.append(r3)
            r2.append(r8)
            android.support.v7.widget.RecyclerView r3 = r0.i
            java.lang.String r3 = r3.exceptionLabel()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x024a:
            int r8 = r8 + 1
            goto L_0x009c
        L_0x024e:
        L_0x024f:
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r8 != 0) goto L_0x0437
            android.support.v7.widget.RecyclerView r13 = r0.i
            yn r13 = r13.mAdapterHelper
            int r13 = r13.b((int) r1)
            if (r13 < 0) goto L_0x03ff
            android.support.v7.widget.RecyclerView r14 = r0.i
            acg r14 = r14.mAdapter
            int r14 = r14.a()
            if (r13 >= r14) goto L_0x03ff
            android.support.v7.widget.RecyclerView r14 = r0.i
            acg r14 = r14.mAdapter
            int r14 = r14.a((int) r13)
            android.support.v7.widget.RecyclerView r15 = r0.i
            acg r15 = r15.mAdapter
            boolean r4 = r15.c
            if (r4 == 0) goto L_0x0308
            long r16 = r15.J(r13)
            java.util.ArrayList r4 = r0.a
            int r4 = r4.size()
            int r4 = r4 + r7
        L_0x0285:
            if (r4 < 0) goto L_0x02cf
            java.util.ArrayList r8 = r0.a
            java.lang.Object r8 = r8.get(r4)
            adl r8 = (defpackage.adl) r8
            long r9 = r8.e
            int r15 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r15 == 0) goto L_0x0296
            goto L_0x02cc
        L_0x0296:
            boolean r9 = r8.h()
            if (r9 != 0) goto L_0x02cc
            int r9 = r8.f
            if (r14 == r9) goto L_0x02b2
            java.util.ArrayList r9 = r0.a
            r9.remove(r4)
            android.support.v7.widget.RecyclerView r9 = r0.i
            android.view.View r10 = r8.a
            r9.removeDetachedView(r10, r5)
            android.view.View r8 = r8.a
            r0.b((android.view.View) r8)
            goto L_0x02cc
        L_0x02b2:
            r8.b(r3)
            boolean r3 = r8.n()
            if (r3 == 0) goto L_0x02cb
            android.support.v7.widget.RecyclerView r3 = r0.i
            adi r3 = r3.mState
            boolean r3 = r3.g
            if (r3 != 0) goto L_0x02cb
            r3 = 2
            r4 = 14
            r8.a((int) r3, (int) r4)
            goto L_0x0301
        L_0x02cb:
            goto L_0x0301
        L_0x02cc:
            int r4 = r4 + -1
            goto L_0x0285
        L_0x02cf:
            java.util.ArrayList r3 = r0.c
            int r3 = r3.size()
            int r3 = r3 + r7
        L_0x02d6:
            if (r3 < 0) goto L_0x02ff
            java.util.ArrayList r4 = r0.c
            java.lang.Object r4 = r4.get(r3)
            adl r4 = (defpackage.adl) r4
            long r8 = r4.e
            int r10 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r10 == 0) goto L_0x02e7
            goto L_0x02fc
        L_0x02e7:
            boolean r8 = r4.p()
            if (r8 != 0) goto L_0x02fc
            int r8 = r4.f
            if (r14 != r8) goto L_0x02f8
            java.util.ArrayList r8 = r0.c
            r8.remove(r3)
            r8 = r4
            goto L_0x0301
        L_0x02f8:
            r0.c((int) r3)
            goto L_0x0300
        L_0x02fc:
            int r3 = r3 + -1
            goto L_0x02d6
        L_0x02ff:
        L_0x0300:
            r8 = r6
        L_0x0301:
            if (r8 == 0) goto L_0x0307
            r8.c = r13
            r2 = 1
            goto L_0x0309
        L_0x0307:
            goto L_0x0309
        L_0x0308:
        L_0x0309:
            if (r8 != 0) goto L_0x035e
            adj r3 = r0.h
            if (r3 == 0) goto L_0x035e
            android.view.View r3 = r3.a()
            if (r3 == 0) goto L_0x035e
            android.support.v7.widget.RecyclerView r4 = r0.i
            adl r8 = r4.getChildViewHolder(r3)
            if (r8 == 0) goto L_0x0341
            boolean r3 = r8.ax()
            if (r3 != 0) goto L_0x0324
            goto L_0x035f
        L_0x0324:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
            r2.append(r3)
            android.support.v7.widget.RecyclerView r3 = r0.i
            java.lang.String r3 = r3.exceptionLabel()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0341:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
            r2.append(r3)
            android.support.v7.widget.RecyclerView r3 = r0.i
            java.lang.String r3 = r3.exceptionLabel()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x035e:
        L_0x035f:
            if (r8 != 0) goto L_0x03ac
            ada r3 = r18.d()
            android.util.SparseArray r3 = r3.a
            java.lang.Object r3 = r3.get(r14)
            acz r3 = (defpackage.acz) r3
            if (r3 == 0) goto L_0x0396
            java.util.ArrayList r4 = r3.a
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0396
            java.util.ArrayList r3 = r3.a
            int r4 = r3.size()
            int r4 = r4 + r7
        L_0x037e:
            if (r4 < 0) goto L_0x0396
            java.lang.Object r7 = r3.get(r4)
            adl r7 = (defpackage.adl) r7
            boolean r7 = r7.p()
            if (r7 != 0) goto L_0x0393
            java.lang.Object r3 = r3.remove(r4)
            adl r3 = (defpackage.adl) r3
            goto L_0x0397
        L_0x0393:
            int r4 = r4 + -1
            goto L_0x037e
        L_0x0396:
            r3 = r6
        L_0x0397:
            if (r3 == 0) goto L_0x03ab
            r3.s()
            boolean r4 = android.support.v7.widget.RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST
            if (r4 == 0) goto L_0x03ab
            android.view.View r4 = r3.a
            boolean r7 = r4 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x03ab
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r0.a((android.view.ViewGroup) r4, (boolean) r5)
        L_0x03ab:
            r8 = r3
        L_0x03ac:
            if (r8 != 0) goto L_0x03fe
            android.support.v7.widget.RecyclerView r3 = r0.i
            long r3 = r3.getNanoTime()
            int r7 = (r20 > r11 ? 1 : (r20 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x03b9
            goto L_0x03cd
        L_0x03b9:
            ada r7 = r0.g
            acz r7 = r7.a(r14)
            long r7 = r7.c
            r9 = 0
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L_0x03cd
            long r7 = r7 + r3
            int r9 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r9 < 0) goto L_0x03cd
            return r6
        L_0x03cd:
            android.support.v7.widget.RecyclerView r7 = r0.i
            acg r8 = r7.mAdapter
            adl r8 = r8.b((android.view.ViewGroup) r7, (int) r14)
            boolean r7 = android.support.v7.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r7 == 0) goto L_0x03e8
            android.view.View r7 = r8.a
            android.support.v7.widget.RecyclerView r7 = android.support.v7.widget.RecyclerView.findNestedRecyclerView(r7)
            if (r7 == 0) goto L_0x03e8
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r7)
            r8.b = r9
        L_0x03e8:
            android.support.v7.widget.RecyclerView r7 = r0.i
            long r9 = r7.getNanoTime()
            ada r7 = r0.g
            acz r7 = r7.a(r14)
            long r13 = r7.c
            long r9 = r9 - r3
            long r3 = defpackage.ada.a(r13, r9)
            r7.c = r3
            goto L_0x0438
        L_0x03fe:
            goto L_0x0438
        L_0x03ff:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Inconsistency detected. Invalid item position "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = "(offset:"
            r3.append(r1)
            r3.append(r13)
            java.lang.String r1 = ").state:"
            r3.append(r1)
            android.support.v7.widget.RecyclerView r1 = r0.i
            adi r1 = r1.mState
            int r1 = r1.a()
            r3.append(r1)
            android.support.v7.widget.RecyclerView r1 = r0.i
            java.lang.String r1 = r1.exceptionLabel()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0437:
        L_0x0438:
            if (r2 == 0) goto L_0x0466
            android.support.v7.widget.RecyclerView r3 = r0.i
            adi r3 = r3.mState
            boolean r3 = r3.g
            if (r3 == 0) goto L_0x0443
            goto L_0x0466
        L_0x0443:
            r3 = 8192(0x2000, float:1.14794E-41)
            boolean r4 = r8.a((int) r3)
            if (r4 == 0) goto L_0x0466
            r8.a((int) r5, (int) r3)
            android.support.v7.widget.RecyclerView r3 = r0.i
            adi r3 = r3.mState
            boolean r3 = r3.j
            if (r3 == 0) goto L_0x0466
            defpackage.aco.g(r8)
            r8.r()
            acn r3 = defpackage.aco.h(r8)
            android.support.v7.widget.RecyclerView r4 = r0.i
            r4.recordAnimationInfoIfBouncedHiddenView(r8, r3)
        L_0x0466:
            android.support.v7.widget.RecyclerView r3 = r0.i
            adi r3 = r3.mState
            boolean r3 = r3.g
            if (r3 == 0) goto L_0x047a
            boolean r3 = r8.m()
            if (r3 == 0) goto L_0x047a
            r8.g = r1
            r1 = 0
            r4 = 1
            goto L_0x0522
        L_0x047a:
            boolean r3 = r8.m()
            if (r3 == 0) goto L_0x0491
            boolean r3 = r8.l()
            if (r3 != 0) goto L_0x0491
            boolean r3 = r8.k()
            if (r3 == 0) goto L_0x048d
            goto L_0x0491
        L_0x048d:
            r1 = 0
            r4 = 1
            goto L_0x0522
        L_0x0491:
            android.support.v7.widget.RecyclerView r3 = r0.i
            yn r3 = r3.mAdapterHelper
            int r3 = r3.b((int) r1)
            r8.r = r6
            android.support.v7.widget.RecyclerView r4 = r0.i
            r8.q = r4
            int r6 = r8.f
            long r9 = r4.getNanoTime()
            int r4 = (r20 > r11 ? 1 : (r20 == r11 ? 0 : -1))
            if (r4 == 0) goto L_0x04be
            ada r4 = r0.g
            acz r4 = r4.a(r6)
            long r6 = r4.d
            r11 = 0
            int r4 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x04b8
            goto L_0x04be
        L_0x04b8:
            long r6 = r6 + r9
            int r4 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r4 < 0) goto L_0x04be
            goto L_0x048d
        L_0x04be:
            android.support.v7.widget.RecyclerView r4 = r0.i
            acg r4 = r4.mAdapter
            r4.b((defpackage.adl) r8, (int) r3)
            android.support.v7.widget.RecyclerView r3 = r0.i
            long r3 = r3.getNanoTime()
            ada r6 = r0.g
            int r7 = r8.f
            acz r6 = r6.a(r7)
            long r11 = r6.d
            long r3 = r3 - r9
            long r3 = defpackage.ada.a(r11, r3)
            r6.d = r3
            android.support.v7.widget.RecyclerView r3 = r0.i
            boolean r3 = r3.isAccessibilityEnabled()
            if (r3 != 0) goto L_0x04e6
            r4 = 1
            goto L_0x0517
        L_0x04e6:
            android.view.View r3 = r8.a
            int r4 = defpackage.qb.f(r3)
            if (r4 == 0) goto L_0x04f0
            r4 = 1
            goto L_0x04f5
        L_0x04f0:
            r4 = 1
            defpackage.qb.b((android.view.View) r3, (int) r4)
        L_0x04f5:
            android.support.v7.widget.RecyclerView r6 = r0.i
            adn r6 = r6.mAccessibilityDelegate
            if (r6 == 0) goto L_0x0517
            oz r6 = r6.b()
            boolean r7 = r6 instanceof defpackage.adm
            if (r7 == 0) goto L_0x0514
            r7 = r6
            adm r7 = (defpackage.adm) r7
            oz r9 = defpackage.qb.c(r3)
            if (r9 != 0) goto L_0x050d
            goto L_0x0514
        L_0x050d:
            if (r9 == r7) goto L_0x0514
            java.util.Map r7 = r7.c
            r7.put(r3, r9)
        L_0x0514:
            defpackage.qb.a((android.view.View) r3, (defpackage.oz) r6)
        L_0x0517:
            android.support.v7.widget.RecyclerView r3 = r0.i
            adi r3 = r3.mState
            boolean r3 = r3.g
            if (r3 == 0) goto L_0x0521
            r8.g = r1
        L_0x0521:
            r1 = 1
        L_0x0522:
            android.view.View r3 = r8.a
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 != 0) goto L_0x0538
            android.support.v7.widget.RecyclerView r3 = r0.i
            android.view.ViewGroup$LayoutParams r3 = r3.generateDefaultLayoutParams()
            acu r3 = (defpackage.acu) r3
            android.view.View r6 = r8.a
            r6.setLayoutParams(r3)
            goto L_0x0550
        L_0x0538:
            android.support.v7.widget.RecyclerView r6 = r0.i
            boolean r6 = r6.checkLayoutParams(r3)
            if (r6 != 0) goto L_0x054e
            android.support.v7.widget.RecyclerView r6 = r0.i
            android.view.ViewGroup$LayoutParams r3 = r6.generateLayoutParams((android.view.ViewGroup.LayoutParams) r3)
            acu r3 = (defpackage.acu) r3
            android.view.View r6 = r8.a
            r6.setLayoutParams(r3)
            goto L_0x0550
        L_0x054e:
            acu r3 = (defpackage.acu) r3
        L_0x0550:
            r3.c = r8
            if (r2 != 0) goto L_0x0556
        L_0x0554:
            r4 = 0
            goto L_0x0558
        L_0x0556:
            if (r1 == 0) goto L_0x0554
        L_0x0558:
            r3.f = r4
            return r8
        L_0x055b:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Invalid item position "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = "("
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = "). Item count:"
            r3.append(r1)
            android.support.v7.widget.RecyclerView r1 = r0.i
            adi r1 = r1.mState
            int r1 = r1.a()
            r3.append(r1)
            android.support.v7.widget.RecyclerView r1 = r0.i
            java.lang.String r1 = r1.exceptionLabel()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            goto L_0x0594
        L_0x0593:
            throw r2
        L_0x0594:
            goto L_0x0593
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adb.a(int, long):adl");
    }

    /* access modifiers changed from: package-private */
    public final void c(View view) {
        adl childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (!childViewHolderInt.a(12) && childViewHolderInt.u() && !this.i.canReuseUpdatedViewHolder(childViewHolderInt)) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            childViewHolderInt.a(this, true);
            this.b.add(childViewHolderInt);
        } else if (!childViewHolderInt.k() || childViewHolderInt.n() || this.i.mAdapter.c) {
            childViewHolderInt.a(this, false);
            this.a.add(childViewHolderInt);
        } else {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + this.i.exceptionLabel());
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(View view) {
        adl childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        childViewHolderInt.m = null;
        childViewHolderInt.n = false;
        childViewHolderInt.i();
        a(childViewHolderInt);
    }

    public final void a() {
        this.a.clear();
        c();
    }

    public final void a(adl adl) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        boolean z4 = false;
        if (adl.f() || adl.a.getParent() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(adl.f());
            sb.append(" isAttached:");
            if (adl.a.getParent() == null) {
                z3 = false;
            }
            sb.append(z3);
            sb.append(this.i.exceptionLabel());
            throw new IllegalArgumentException(sb.toString());
        } else if (adl.o()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + adl + this.i.exceptionLabel());
        } else if (!adl.ax()) {
            if ((adl.j & 16) == 0) {
                z = qb.d(adl.a);
            } else {
                z = false;
            }
            if (!adl.t()) {
                z3 = false;
            } else {
                if (this.f <= 0 || adl.a(526)) {
                    z2 = false;
                } else {
                    int size = this.c.size();
                    if (size >= this.f && size > 0) {
                        c(0);
                        size--;
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !this.i.mPrefetchRegistry.a(adl.c)) {
                        int i2 = size - 1;
                        while (i2 >= 0) {
                            if (!this.i.mPrefetchRegistry.a(((adl) this.c.get(i2)).c)) {
                                break;
                            }
                            i2--;
                        }
                        size = i2 + 1;
                    }
                    this.c.add(size, adl);
                    z2 = true;
                }
                if (!z2) {
                    a(adl, true);
                    z4 = z2;
                } else {
                    z4 = z2;
                    z3 = false;
                }
            }
            this.i.mViewInfoStore.d(adl);
            if (!z4 && !z3 && z) {
                adl.r = null;
                adl.q = null;
            }
        } else {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + this.i.exceptionLabel());
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(adl adl, boolean z) {
        oz ozVar;
        RecyclerView.clearNestedRecyclerViewIfNotNested(adl);
        View view = adl.a;
        adn adn = this.i.mAccessibilityDelegate;
        if (adn != null) {
            oz b2 = adn.b();
            if (b2 instanceof adm) {
                ozVar = (oz) ((adm) b2).c.remove(view);
            } else {
                ozVar = null;
            }
            qb.a(view, ozVar);
        }
        if (z) {
            adc adc = this.i.mRecyclerListener;
            if (adc != null) {
                adc.a(adl);
            }
            acg acg = this.i.mAdapter;
            if (acg != null) {
                acg.a(adl);
            }
            RecyclerView recyclerView = this.i;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.d(adl);
            }
        }
        adl.r = null;
        adl.q = null;
        ada d2 = d();
        int i2 = adl.f;
        ArrayList arrayList = d2.a(i2).a;
        int i3 = ((acz) d2.a.get(i2)).b;
        if (arrayList.size() < 5) {
            adl.s();
            arrayList.add(adl);
        }
    }

    public final void a(View view) {
        adl childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.o()) {
            this.i.removeDetachedView(view, false);
        }
        if (childViewHolderInt.f()) {
            childViewHolderInt.g();
        } else if (childViewHolderInt.h()) {
            childViewHolderInt.i();
        }
        a(childViewHolderInt);
        if (this.i.mItemAnimator != null && !childViewHolderInt.t()) {
            this.i.mItemAnimator.d(childViewHolderInt);
        }
    }
}
