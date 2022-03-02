package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: abf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class abf extends ViewGroup {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    public int f;
    public Drawable g;
    public int h;
    private float i;
    private boolean j;
    private int[] k;
    private int[] l;
    private int m;
    private int n;
    private int o;

    public abf(Context context) {
        this(context, (AttributeSet) null);
    }

    private static void a(View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i4 + i2, i5 + i3);
    }

    /* renamed from: b */
    public abe generateLayoutParams(AttributeSet attributeSet) {
        return new abe(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abe generateDefaultLayoutParams() {
        int i2 = this.d;
        if (i2 == 0) {
            return new abe(-2);
        }
        if (i2 == 1) {
            return new abe(-1);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof abe;
    }

    public final void d(int i2) {
        if (this.d != i2) {
            this.d = i2;
            requestLayout();
        }
    }

    public final void e() {
        this.a = false;
    }

    public final int getBaseline() {
        int i2;
        if (this.b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.b;
        if (childCount > i3) {
            View childAt = getChildAt(i3);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i4 = this.c;
                if (this.d == 1 && (i2 = this.f & 112) != 48) {
                    if (i2 == 16) {
                        i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.e) / 2;
                    } else if (i2 == 80) {
                        i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.e;
                    }
                }
                return i4 + ((abe) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.b == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        if (this.g != null) {
            int i5 = 0;
            if (this.d != 1) {
                int childCount = getChildCount();
                boolean a2 = afs.a(this);
                while (i5 < childCount) {
                    View childAt = getChildAt(i5);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !c(i5))) {
                        abe abe = (abe) childAt.getLayoutParams();
                        if (a2) {
                            i4 = childAt.getRight() + abe.rightMargin;
                        } else {
                            i4 = (childAt.getLeft() - abe.leftMargin) - this.h;
                        }
                        b(canvas, i4);
                    }
                    i5++;
                }
                if (c(childCount)) {
                    View childAt2 = getChildAt(childCount - 1);
                    if (childAt2 != null) {
                        abe abe2 = (abe) childAt2.getLayoutParams();
                        if (a2) {
                            i3 = (childAt2.getLeft() - abe2.leftMargin) - this.h;
                        } else {
                            i3 = childAt2.getRight() + abe2.rightMargin;
                        }
                    } else if (!a2) {
                        i3 = (getWidth() - getPaddingRight()) - this.h;
                    } else {
                        i3 = getPaddingLeft();
                    }
                    b(canvas, i3);
                    return;
                }
                return;
            }
            int childCount2 = getChildCount();
            while (i5 < childCount2) {
                View childAt3 = getChildAt(i5);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !c(i5))) {
                    a(canvas, (childAt3.getTop() - ((abe) childAt3.getLayoutParams()).topMargin) - this.m);
                }
                i5++;
            }
            if (c(childCount2)) {
                View childAt4 = getChildAt(childCount2 - 1);
                if (childAt4 != null) {
                    i2 = childAt4.getBottom() + ((abe) childAt4.getLayoutParams()).bottomMargin;
                } else {
                    i2 = (getHeight() - getPaddingBottom()) - this.m;
                }
                a(canvas, i2);
            }
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.support.v7.widget.LinearLayoutCompat");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.support.v7.widget.LinearLayoutCompat");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            r22 = this;
            r0 = r22
            int r1 = r0.d
            r2 = 8
            r3 = 5
            r6 = 8388615(0x800007, float:1.1754953E-38)
            r8 = 2
            r9 = 1
            if (r1 == r9) goto L_0x012b
            boolean r1 = defpackage.afs.a(r22)
            int r10 = r22.getPaddingTop()
            int r11 = r27 - r25
            int r12 = r22.getPaddingBottom()
            int r12 = r11 - r12
            int r11 = r11 - r10
            int r13 = r22.getPaddingBottom()
            int r11 = r11 - r13
            int r13 = r22.getChildCount()
            int r14 = r0.f
            r15 = r14 & 112(0x70, float:1.57E-43)
            boolean r7 = r0.a
            int[] r4 = r0.k
            int[] r5 = r0.l
            r6 = r6 & r14
            int r14 = defpackage.qb.h(r22)
            int r6 = defpackage.pd.a(r6, r14)
            if (r6 == r9) goto L_0x0050
            if (r6 == r3) goto L_0x0044
            int r3 = r22.getPaddingLeft()
            goto L_0x005b
        L_0x0044:
            int r3 = r22.getPaddingLeft()
            int r3 = r3 + r26
            int r3 = r3 - r24
            int r6 = r0.e
            int r3 = r3 - r6
            goto L_0x005b
        L_0x0050:
            int r3 = r22.getPaddingLeft()
            int r6 = r26 - r24
            int r14 = r0.e
            int r6 = r6 - r14
            int r6 = r6 / r8
            int r3 = r3 + r6
        L_0x005b:
            if (r1 == 0) goto L_0x0061
            int r1 = r13 + -1
            r14 = -1
            goto L_0x0063
        L_0x0061:
            r1 = 0
            r14 = 1
        L_0x0063:
            r9 = 0
        L_0x0064:
            if (r9 >= r13) goto L_0x012a
            int r17 = r14 * r9
            int r8 = r1 + r17
            android.view.View r6 = r0.getChildAt(r8)
            if (r6 != 0) goto L_0x007d
            r25 = r1
            r19 = r7
            r27 = r13
            r26 = r14
            r20 = r15
            r15 = -1
            goto L_0x0119
        L_0x007d:
            r25 = r1
            int r1 = r6.getVisibility()
            if (r1 == r2) goto L_0x0110
            int r1 = r6.getMeasuredWidth()
            int r2 = r6.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r19 = r6.getLayoutParams()
            r27 = r13
            r13 = r19
            abe r13 = (defpackage.abe) r13
            if (r7 == 0) goto L_0x00a8
            r19 = r7
            int r7 = r13.height
            r26 = r14
            r14 = -1
            if (r7 == r14) goto L_0x00ac
            int r7 = r6.getBaseline()
            r14 = r7
            goto L_0x00ad
        L_0x00a8:
            r19 = r7
            r26 = r14
        L_0x00ac:
            r14 = -1
        L_0x00ad:
            int r7 = r13.h
            if (r7 < 0) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            r7 = r15
        L_0x00b3:
            r7 = r7 & 112(0x70, float:1.57E-43)
            r20 = r15
            r15 = 16
            if (r7 == r15) goto L_0x00ef
            r15 = 48
            if (r7 == r15) goto L_0x00df
            r15 = 80
            if (r7 == r15) goto L_0x00c6
            r7 = r10
            r15 = -1
            goto L_0x00fb
        L_0x00c6:
            int r7 = r12 - r2
            int r15 = r13.bottomMargin
            int r7 = r7 - r15
            r15 = -1
            if (r14 == r15) goto L_0x00dc
            int r15 = r6.getMeasuredHeight()
            r18 = 2
            r21 = r5[r18]
            int r15 = r15 - r14
            int r21 = r21 - r15
            int r7 = r7 - r21
            goto L_0x00dd
        L_0x00dc:
        L_0x00dd:
            r15 = -1
            goto L_0x00fb
        L_0x00df:
            int r7 = r13.topMargin
            int r7 = r7 + r10
            r15 = -1
            if (r14 == r15) goto L_0x00ee
            r16 = 1
            r21 = r4[r16]
            int r21 = r21 - r14
            int r7 = r7 + r21
            goto L_0x00fb
        L_0x00ee:
            goto L_0x00fb
        L_0x00ef:
            r15 = -1
            int r7 = r11 - r2
            r14 = 2
            int r7 = r7 / r14
            int r7 = r7 + r10
            int r14 = r13.topMargin
            int r7 = r7 + r14
            int r14 = r13.bottomMargin
            int r7 = r7 - r14
        L_0x00fb:
            boolean r8 = r0.c(r8)
            if (r8 != 0) goto L_0x0102
            goto L_0x0105
        L_0x0102:
            int r8 = r0.h
            int r3 = r3 + r8
        L_0x0105:
            int r8 = r13.leftMargin
            int r3 = r3 + r8
            a(r6, r3, r7, r1, r2)
            int r2 = r13.rightMargin
            int r1 = r1 + r2
            int r3 = r3 + r1
            goto L_0x0119
        L_0x0110:
            r19 = r7
            r27 = r13
            r26 = r14
            r20 = r15
            r15 = -1
        L_0x0119:
            int r9 = r9 + 1
            r1 = r25
            r14 = r26
            r13 = r27
            r7 = r19
            r15 = r20
            r2 = 8
            r8 = 2
            goto L_0x0064
        L_0x012a:
            return
        L_0x012b:
            int r1 = r22.getPaddingLeft()
            int r2 = r26 - r24
            int r4 = r22.getPaddingRight()
            int r4 = r2 - r4
            int r2 = r2 - r1
            int r5 = r22.getPaddingRight()
            int r2 = r2 - r5
            int r5 = r22.getChildCount()
            int r7 = r0.f
            r6 = r6 & r7
            r7 = r7 & 112(0x70, float:1.57E-43)
            r8 = 16
            if (r7 == r8) goto L_0x015f
            r8 = 80
            if (r7 == r8) goto L_0x0153
            int r7 = r22.getPaddingTop()
            goto L_0x016b
        L_0x0153:
            int r7 = r22.getPaddingTop()
            int r7 = r7 + r27
            int r7 = r7 - r25
            int r8 = r0.e
            int r7 = r7 - r8
            goto L_0x016b
        L_0x015f:
            int r7 = r22.getPaddingTop()
            int r8 = r27 - r25
            int r9 = r0.e
            int r8 = r8 - r9
            r9 = 2
            int r8 = r8 / r9
            int r7 = r7 + r8
        L_0x016b:
            r8 = r7
            r7 = 0
        L_0x016d:
            if (r7 >= r5) goto L_0x01d7
            android.view.View r9 = r0.getChildAt(r7)
            if (r9 != 0) goto L_0x0178
            r14 = 2
            r15 = 1
            goto L_0x01d3
        L_0x0178:
            int r10 = r9.getVisibility()
            r11 = 8
            if (r10 == r11) goto L_0x01d1
            int r10 = r9.getMeasuredWidth()
            int r12 = r9.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r13 = r9.getLayoutParams()
            abe r13 = (defpackage.abe) r13
            int r14 = r13.h
            if (r14 < 0) goto L_0x0193
            goto L_0x0194
        L_0x0193:
            r14 = r6
        L_0x0194:
            int r15 = defpackage.qb.h(r22)
            int r14 = defpackage.pd.a(r14, r15)
            r14 = r14 & 7
            r15 = 1
            if (r14 == r15) goto L_0x01b1
            if (r14 == r3) goto L_0x01a9
            int r14 = r13.leftMargin
            int r14 = r14 + r1
            r3 = r14
            r14 = 2
            goto L_0x01bc
        L_0x01a9:
            int r14 = r4 - r10
            int r3 = r13.rightMargin
            int r14 = r14 - r3
            r3 = r14
            r14 = 2
            goto L_0x01bc
        L_0x01b1:
            int r3 = r2 - r10
            r14 = 2
            int r3 = r3 / r14
            int r3 = r3 + r1
            int r11 = r13.leftMargin
            int r3 = r3 + r11
            int r11 = r13.rightMargin
            int r3 = r3 - r11
        L_0x01bc:
            boolean r11 = r0.c(r7)
            if (r11 != 0) goto L_0x01c3
            goto L_0x01c6
        L_0x01c3:
            int r11 = r0.m
            int r8 = r8 + r11
        L_0x01c6:
            int r11 = r13.topMargin
            int r8 = r8 + r11
            a(r9, r3, r8, r10, r12)
            int r3 = r13.bottomMargin
            int r12 = r12 + r3
            int r8 = r8 + r12
            goto L_0x01d3
        L_0x01d1:
            r14 = 2
            r15 = 1
        L_0x01d3:
            int r7 = r7 + 1
            r3 = 5
            goto L_0x016d
        L_0x01d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abf.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02ad, code lost:
        if (r11.width == -1) goto L_0x02b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0201, code lost:
        if (r24 > 0.0f) goto L_0x0203;
     */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0484  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0489  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x04b5  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x04b8  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04e3  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04ed  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04ef  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x050f  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x054e  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0550  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0558  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0567  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0602  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x064e  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0650  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0663  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x06a7  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x06ac  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x06e1  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x0848  */
    /* JADX WARNING: Removed duplicated region for block: B:420:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:422:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r41, int r42) {
        /*
            r40 = this;
            r6 = r40
            r7 = r41
            r8 = r42
            int r0 = r6.d
            r9 = -2
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 8
            r13 = 0
            r14 = 1073741824(0x40000000, float:2.0)
            r15 = 1
            r4 = 0
            if (r0 != r15) goto L_0x0387
            r6.e = r4
            int r3 = r40.getChildCount()
            int r2 = android.view.View.MeasureSpec.getMode(r41)
            int r1 = android.view.View.MeasureSpec.getMode(r42)
            int r0 = r6.b
            boolean r15 = r6.j
            r10 = 0
            r17 = 1
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
        L_0x0039:
            if (r10 >= r3) goto L_0x0171
            android.view.View r27 = r6.getChildAt(r10)
            if (r27 != 0) goto L_0x0042
            goto L_0x0048
        L_0x0042:
            int r4 = r27.getVisibility()
            if (r4 != r12) goto L_0x0051
        L_0x0048:
            r9 = r0
            r30 = r1
            r0 = r2
            r32 = r3
            r12 = -1
            goto L_0x0160
        L_0x0051:
            boolean r4 = r6.c(r10)
            if (r4 != 0) goto L_0x0058
            goto L_0x005f
        L_0x0058:
            int r4 = r6.e
            int r5 = r6.m
            int r4 = r4 + r5
            r6.e = r4
        L_0x005f:
            android.view.ViewGroup$LayoutParams r4 = r27.getLayoutParams()
            r5 = r4
            abe r5 = (defpackage.abe) r5
            float r4 = r5.g
            float r24 = r24 + r4
            if (r1 != r14) goto L_0x0090
            int r4 = r5.height
            if (r4 != 0) goto L_0x0090
            float r4 = r5.g
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 > 0) goto L_0x0077
            goto L_0x0090
        L_0x0077:
            int r4 = r6.e
            int r12 = r5.topMargin
            int r12 = r12 + r4
            int r14 = r5.bottomMargin
            int r12 = r12 + r14
            int r4 = java.lang.Math.max(r4, r12)
            r6.e = r4
            r9 = r0
            r30 = r1
            r31 = r2
            r32 = r3
            r13 = r5
            r19 = 1
            goto L_0x00e5
        L_0x0090:
            int r4 = r5.height
            if (r4 != 0) goto L_0x009e
            float r4 = r5.g
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x009e
            r5.height = r9
            r12 = 0
            goto L_0x00a0
        L_0x009e:
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00a0:
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 != 0) goto L_0x00a8
            int r4 = r6.e
            r14 = r4
            goto L_0x00a9
        L_0x00a8:
            r14 = 0
        L_0x00a9:
            r4 = 0
            r9 = r0
            r0 = r40
            r30 = r1
            r1 = r27
            r31 = r2
            r2 = r41
            r32 = r3
            r3 = r4
            r13 = 0
            r4 = r42
            r13 = r5
            r5 = r14
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            if (r12 != r11) goto L_0x00c3
            goto L_0x00c6
        L_0x00c3:
            r0 = 0
            r13.height = r0
        L_0x00c6:
            int r0 = r27.getMeasuredHeight()
            int r1 = r6.e
            int r2 = r1 + r0
            int r3 = r13.topMargin
            int r2 = r2 + r3
            int r3 = r13.bottomMargin
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r6.e = r1
            if (r15 == 0) goto L_0x00e3
            r4 = r25
            int r25 = java.lang.Math.max(r0, r4)
            goto L_0x00e5
        L_0x00e3:
            r4 = r25
        L_0x00e5:
            if (r9 < 0) goto L_0x00ef
            int r0 = r10 + 1
            if (r9 != r0) goto L_0x00ef
            int r0 = r6.e
            r6.c = r0
        L_0x00ef:
            if (r10 >= r9) goto L_0x0101
            float r0 = r13.g
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00f9
            goto L_0x0101
        L_0x00f9:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0101:
            r0 = r31
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L_0x010a
            r4 = 0
            r12 = -1
            goto L_0x0114
        L_0x010a:
            int r1 = r13.width
            r12 = -1
            if (r1 != r12) goto L_0x0113
            r4 = 1
            r18 = 1
            goto L_0x0114
        L_0x0113:
            r4 = 0
        L_0x0114:
            int r1 = r13.leftMargin
            int r2 = r13.rightMargin
            int r1 = r1 + r2
            int r2 = r27.getMeasuredWidth()
            int r2 = r2 + r1
            r3 = r26
            int r3 = java.lang.Math.max(r3, r2)
            int r5 = r27.getMeasuredState()
            r14 = r21
            int r5 = android.view.View.combineMeasuredStates(r14, r5)
            if (r17 == 0) goto L_0x0136
            int r14 = r13.width
            if (r14 != r12) goto L_0x0136
            r14 = 1
            goto L_0x0137
        L_0x0136:
            r14 = 0
        L_0x0137:
            float r13 = r13.g
            r17 = 0
            int r13 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r13 > 0) goto L_0x014b
            if (r4 != 0) goto L_0x0143
            r1 = r2
            goto L_0x0144
        L_0x0143:
        L_0x0144:
            r13 = r22
            int r22 = java.lang.Math.max(r13, r1)
            goto L_0x015a
        L_0x014b:
            r13 = r22
            if (r4 != 0) goto L_0x0151
            r1 = r2
            goto L_0x0152
        L_0x0151:
        L_0x0152:
            r2 = r23
            int r23 = java.lang.Math.max(r2, r1)
            r22 = r13
        L_0x015a:
            r26 = r3
            r21 = r5
            r17 = r14
        L_0x0160:
            int r10 = r10 + 1
            r2 = r0
            r0 = r9
            r1 = r30
            r3 = r32
            r4 = 0
            r9 = -2
            r12 = 8
            r13 = 0
            r14 = 1073741824(0x40000000, float:2.0)
            goto L_0x0039
        L_0x0171:
            r30 = r1
            r0 = r2
            r32 = r3
            r14 = r21
            r13 = r22
            r2 = r23
            r4 = r25
            r3 = r26
            r12 = -1
            int r1 = r6.e
            if (r1 <= 0) goto L_0x0195
            r9 = r32
            boolean r1 = r6.c(r9)
            if (r1 == 0) goto L_0x0197
            int r1 = r6.e
            int r5 = r6.m
            int r1 = r1 + r5
            r6.e = r1
            goto L_0x0197
        L_0x0195:
            r9 = r32
        L_0x0197:
            if (r15 != 0) goto L_0x019c
            r1 = r30
            goto L_0x01d4
        L_0x019c:
            r1 = r30
            if (r1 != r11) goto L_0x01a1
            goto L_0x01a3
        L_0x01a1:
            if (r1 != 0) goto L_0x01d4
        L_0x01a3:
            r5 = 0
            r6.e = r5
            r5 = 0
        L_0x01a7:
            if (r5 >= r9) goto L_0x01d4
            android.view.View r10 = r6.getChildAt(r5)
            if (r10 != 0) goto L_0x01b0
            goto L_0x01d0
        L_0x01b0:
            int r11 = r10.getVisibility()
            r12 = 8
            if (r11 == r12) goto L_0x01d0
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            abe r10 = (defpackage.abe) r10
            int r11 = r6.e
            int r25 = r11 + r4
            int r12 = r10.topMargin
            int r25 = r25 + r12
            int r10 = r10.bottomMargin
            int r10 = r25 + r10
            int r10 = java.lang.Math.max(r11, r10)
            r6.e = r10
        L_0x01d0:
            int r5 = r5 + 1
            r12 = -1
            goto L_0x01a7
        L_0x01d4:
            int r5 = r6.e
            int r10 = r40.getPaddingTop()
            int r11 = r40.getPaddingBottom()
            int r10 = r10 + r11
            int r5 = r5 + r10
            r6.e = r5
            int r10 = r40.getSuggestedMinimumHeight()
            int r5 = java.lang.Math.max(r5, r10)
            r10 = 0
            int r5 = android.view.View.resolveSizeAndState(r5, r8, r10)
            r10 = 16777215(0xffffff, float:2.3509886E-38)
            r10 = r10 & r5
            int r11 = r6.e
            int r10 = r10 - r11
            if (r19 == 0) goto L_0x01fa
            r11 = 0
            goto L_0x0203
        L_0x01fa:
            if (r10 != 0) goto L_0x01fe
            goto L_0x02e2
        L_0x01fe:
            r11 = 0
            int r12 = (r24 > r11 ? 1 : (r24 == r11 ? 0 : -1))
            if (r12 <= 0) goto L_0x02e2
        L_0x0203:
            float r2 = r6.i
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x020c
            r24 = r2
            goto L_0x020d
        L_0x020c:
        L_0x020d:
            r2 = 0
            r6.e = r2
            r4 = 0
        L_0x0211:
            if (r4 < r9) goto L_0x0223
            int r1 = r6.e
            int r2 = r40.getPaddingTop()
            int r4 = r40.getPaddingBottom()
            int r2 = r2 + r4
            int r1 = r1 + r2
            r6.e = r1
            goto L_0x02f2
        L_0x0223:
            android.view.View r2 = r6.getChildAt(r4)
            int r11 = r2.getVisibility()
            r12 = 8
            if (r11 == r12) goto L_0x02dd
            android.view.ViewGroup$LayoutParams r11 = r2.getLayoutParams()
            abe r11 = (defpackage.abe) r11
            float r12 = r11.g
            r15 = 0
            int r19 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r19 <= 0) goto L_0x0293
            float r15 = (float) r10
            float r15 = r15 * r12
            float r15 = r15 / r24
            int r15 = (int) r15
            float r24 = r24 - r12
            int r10 = r10 - r15
            int r12 = r40.getPaddingLeft()
            int r19 = r40.getPaddingRight()
            int r12 = r12 + r19
            r19 = r10
            int r10 = r11.leftMargin
            int r12 = r12 + r10
            int r10 = r11.rightMargin
            int r12 = r12 + r10
            int r10 = r11.width
            int r10 = android.view.ViewGroup.getChildMeasureSpec(r7, r12, r10)
            int r12 = r11.height
            if (r12 == 0) goto L_0x0262
            goto L_0x0273
        L_0x0262:
            r12 = 1073741824(0x40000000, float:2.0)
            if (r1 != r12) goto L_0x0273
            if (r15 <= 0) goto L_0x0269
            goto L_0x026a
        L_0x0269:
            r15 = 0
        L_0x026a:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r12)
            r2.measure(r10, r15)
            goto L_0x0286
        L_0x0273:
            int r12 = r2.getMeasuredHeight()
            int r12 = r12 + r15
            if (r12 < 0) goto L_0x027b
            goto L_0x027c
        L_0x027b:
            r12 = 0
        L_0x027c:
            r15 = 1073741824(0x40000000, float:2.0)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r15)
            r2.measure(r10, r12)
        L_0x0286:
            int r10 = r2.getMeasuredState()
            r10 = r10 & -256(0xffffffffffffff00, float:NaN)
            int r14 = android.view.View.combineMeasuredStates(r14, r10)
            r10 = r19
            goto L_0x0294
        L_0x0293:
        L_0x0294:
            int r12 = r11.leftMargin
            int r15 = r11.rightMargin
            int r12 = r12 + r15
            int r15 = r2.getMeasuredWidth()
            int r15 = r15 + r12
            int r3 = java.lang.Math.max(r3, r15)
            r19 = r3
            r3 = 1073741824(0x40000000, float:2.0)
            if (r0 == r3) goto L_0x02b0
            int r3 = r11.width
            r20 = r10
            r10 = -1
            if (r3 != r10) goto L_0x02b2
            goto L_0x02b4
        L_0x02b0:
            r20 = r10
        L_0x02b2:
            r12 = r15
        L_0x02b4:
            int r3 = java.lang.Math.max(r13, r12)
            if (r17 == 0) goto L_0x02c1
            int r10 = r11.width
            r12 = -1
            if (r10 != r12) goto L_0x02c1
            r10 = 1
            goto L_0x02c2
        L_0x02c1:
            r10 = 0
        L_0x02c2:
            int r12 = r6.e
            int r2 = r2.getMeasuredHeight()
            int r2 = r2 + r12
            int r13 = r11.topMargin
            int r2 = r2 + r13
            int r11 = r11.bottomMargin
            int r2 = r2 + r11
            int r2 = java.lang.Math.max(r12, r2)
            r6.e = r2
            r13 = r3
            r17 = r10
            r3 = r19
            r10 = r20
            goto L_0x02de
        L_0x02dd:
        L_0x02de:
            int r4 = r4 + 1
            goto L_0x0211
        L_0x02e2:
            int r13 = java.lang.Math.max(r13, r2)
            if (r15 != 0) goto L_0x02e9
        L_0x02e8:
            goto L_0x02f2
        L_0x02e9:
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r2) goto L_0x02ee
            goto L_0x02e8
        L_0x02ee:
            r1 = 0
        L_0x02ef:
            if (r1 < r9) goto L_0x0356
            goto L_0x02e8
        L_0x02f2:
            r26 = r3
            if (r17 == 0) goto L_0x02f7
            goto L_0x02fc
        L_0x02f7:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x02fc
            goto L_0x02fe
        L_0x02fc:
            r13 = r26
        L_0x02fe:
            int r0 = r40.getPaddingLeft()
            int r1 = r40.getPaddingRight()
            int r0 = r0 + r1
            int r13 = r13 + r0
            int r0 = r40.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r13, r0)
            int r0 = android.view.View.resolveSizeAndState(r0, r7, r14)
            r6.setMeasuredDimension(r0, r5)
            if (r18 == 0) goto L_0x0355
            int r0 = r40.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r10 = 0
        L_0x0324:
            if (r10 >= r9) goto L_0x0355
            android.view.View r1 = r6.getChildAt(r10)
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x0352
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            abe r11 = (defpackage.abe) r11
            int r0 = r11.width
            r2 = -1
            if (r0 != r2) goto L_0x0352
            int r12 = r11.height
            int r0 = r1.getMeasuredHeight()
            r11.height = r0
            r3 = 0
            r5 = 0
            r0 = r40
            r2 = r7
            r4 = r42
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.height = r12
        L_0x0352:
            int r10 = r10 + 1
            goto L_0x0324
        L_0x0355:
            return
        L_0x0356:
            android.view.View r2 = r6.getChildAt(r1)
            if (r2 != 0) goto L_0x035d
            goto L_0x0383
        L_0x035d:
            int r10 = r2.getVisibility()
            r11 = 8
            if (r10 == r11) goto L_0x0383
            android.view.ViewGroup$LayoutParams r10 = r2.getLayoutParams()
            abe r10 = (defpackage.abe) r10
            float r10 = r10.g
            r11 = 0
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x0383
            int r10 = r2.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r11)
            r2.measure(r10, r12)
        L_0x0383:
            int r1 = r1 + 1
            goto L_0x02ef
        L_0x0387:
            r0 = 0
            r6.e = r0
            int r9 = r40.getChildCount()
            int r10 = android.view.View.MeasureSpec.getMode(r41)
            int r12 = android.view.View.MeasureSpec.getMode(r42)
            int[] r0 = r6.k
            r13 = 4
            if (r0 != 0) goto L_0x039c
            goto L_0x03a0
        L_0x039c:
            int[] r0 = r6.l
            if (r0 != 0) goto L_0x03a9
        L_0x03a0:
            int[] r0 = new int[r13]
            r6.k = r0
            int[] r0 = new int[r13]
            r6.l = r0
        L_0x03a9:
            int[] r14 = r6.k
            int[] r15 = r6.l
            r17 = 3
            r0 = -1
            r14[r17] = r0
            r18 = 2
            r14[r18] = r0
            r1 = 1
            r14[r1] = r0
            r2 = 0
            r14[r2] = r0
            r15[r17] = r0
            r15[r18] = r0
            r15[r1] = r0
            r15[r2] = r0
            boolean r5 = r6.a
            boolean r4 = r6.j
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r13 = 0
            r19 = 1
            r21 = 0
            r22 = 0
            r24 = 0
            r33 = 0
        L_0x03d7:
            if (r3 >= r9) goto L_0x0589
            android.view.View r11 = r6.getChildAt(r3)
            if (r11 != 0) goto L_0x03e4
            r26 = r0
            r27 = r1
            goto L_0x03f0
        L_0x03e4:
            r26 = r0
            int r0 = r11.getVisibility()
            r27 = r1
            r1 = 8
            if (r0 != r1) goto L_0x03fe
        L_0x03f0:
            r28 = r4
            r29 = r5
            r0 = r26
            r1 = r27
            r27 = -2
            r26 = r3
            goto L_0x057f
        L_0x03fe:
            boolean r0 = r6.c(r3)
            if (r0 != 0) goto L_0x0405
            goto L_0x040c
        L_0x0405:
            int r0 = r6.e
            int r1 = r6.h
            int r0 = r0 + r1
            r6.e = r0
        L_0x040c:
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            r1 = r0
            abe r1 = (defpackage.abe) r1
            float r0 = r1.g
            float r24 = r24 + r0
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 != r0) goto L_0x0468
            int r0 = r1.width
            if (r0 != 0) goto L_0x0463
            float r0 = r1.g
            r28 = 0
            int r0 = (r0 > r28 ? 1 : (r0 == r28 ? 0 : -1))
            if (r0 > 0) goto L_0x042c
            r28 = r2
            r30 = r3
            goto L_0x046c
        L_0x042c:
            int r0 = r6.e
            r28 = r2
            int r2 = r1.leftMargin
            r30 = r3
            int r3 = r1.rightMargin
            int r2 = r2 + r3
            int r0 = r0 + r2
            r6.e = r0
            if (r5 == 0) goto L_0x0450
            r0 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r11.measure(r2, r2)
            r0 = r1
            r29 = r5
            r38 = r26
            r35 = r27
            r37 = r28
            r26 = r30
            goto L_0x045d
        L_0x0450:
            r0 = r1
            r29 = r5
            r38 = r26
            r35 = r27
            r37 = r28
            r26 = r30
            r22 = 1
        L_0x045d:
            r27 = -2
            r28 = r4
            goto L_0x04e9
        L_0x0463:
            r28 = r2
            r30 = r3
            goto L_0x046c
        L_0x0468:
            r28 = r2
            r30 = r3
        L_0x046c:
            int r0 = r1.width
            if (r0 != 0) goto L_0x047c
            float r0 = r1.g
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x047d
            r3 = -2
            r1.width = r3
            r0 = 0
            goto L_0x0480
        L_0x047c:
            r2 = 0
        L_0x047d:
            r3 = -2
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0480:
            int r29 = (r24 > r2 ? 1 : (r24 == r2 ? 0 : -1))
            if (r29 != 0) goto L_0x0489
            int r2 = r6.e
            r29 = r2
            goto L_0x048b
        L_0x0489:
            r29 = 0
        L_0x048b:
            r31 = 0
            r34 = r0
            r2 = r26
            r0 = r40
            r36 = r1
            r35 = r27
            r1 = r11
            r38 = r2
            r37 = r28
            r2 = r41
            r26 = r30
            r27 = -2
            r3 = r29
            r28 = r4
            r4 = r42
            r29 = r5
            r5 = r31
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r0 = r34
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto L_0x04b8
            r0 = r36
            goto L_0x04bd
        L_0x04b8:
            r0 = r36
            r1 = 0
            r0.width = r1
        L_0x04bd:
            int r1 = r11.getMeasuredWidth()
            r2 = 1073741824(0x40000000, float:2.0)
            if (r10 != r2) goto L_0x04d1
            int r2 = r6.e
            int r3 = r0.leftMargin
            int r3 = r3 + r1
            int r4 = r0.rightMargin
            int r3 = r3 + r4
            int r2 = r2 + r3
            r6.e = r2
            goto L_0x04e1
        L_0x04d1:
            int r2 = r6.e
            int r3 = r2 + r1
            int r4 = r0.leftMargin
            int r3 = r3 + r4
            int r4 = r0.rightMargin
            int r3 = r3 + r4
            int r2 = java.lang.Math.max(r2, r3)
            r6.e = r2
        L_0x04e1:
            if (r28 == 0) goto L_0x04e8
            int r13 = java.lang.Math.max(r1, r13)
            goto L_0x04e9
        L_0x04e8:
        L_0x04e9:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 != r1) goto L_0x04ef
            r4 = 0
            goto L_0x04f9
        L_0x04ef:
            int r1 = r0.height
            r2 = -1
            if (r1 != r2) goto L_0x04f8
            r4 = 1
            r21 = 1
            goto L_0x04f9
        L_0x04f8:
            r4 = 0
        L_0x04f9:
            int r1 = r0.topMargin
            int r2 = r0.bottomMargin
            int r1 = r1 + r2
            int r2 = r11.getMeasuredHeight()
            int r2 = r2 + r1
            int r3 = r11.getMeasuredState()
            r5 = r37
            int r3 = android.view.View.combineMeasuredStates(r5, r3)
            if (r29 == 0) goto L_0x053f
            int r5 = r11.getBaseline()
            r11 = -1
            if (r5 == r11) goto L_0x053c
            int r11 = r0.h
            if (r11 < 0) goto L_0x051b
            goto L_0x051d
        L_0x051b:
            int r11 = r6.f
        L_0x051d:
            r11 = r11 & 112(0x70, float:1.57E-43)
            r23 = 4
            int r11 = r11 >> 4
            r16 = 1
            int r11 = r11 >> 1
            r30 = r1
            r1 = r14[r11]
            int r1 = java.lang.Math.max(r1, r5)
            r14[r11] = r1
            r1 = r15[r11]
            int r5 = r2 - r5
            int r1 = java.lang.Math.max(r1, r5)
            r15[r11] = r1
            goto L_0x0541
        L_0x053c:
            r30 = r1
            goto L_0x0541
        L_0x053f:
            r30 = r1
        L_0x0541:
            r1 = r33
            int r1 = java.lang.Math.max(r1, r2)
            if (r19 == 0) goto L_0x0550
            int r5 = r0.height
            r11 = -1
            if (r5 != r11) goto L_0x0550
            r5 = 1
            goto L_0x0551
        L_0x0550:
            r5 = 0
        L_0x0551:
            float r0 = r0.g
            r11 = 0
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0567
            if (r4 != 0) goto L_0x055b
            goto L_0x055d
        L_0x055b:
            r2 = r30
        L_0x055d:
            r0 = r35
            int r0 = java.lang.Math.max(r0, r2)
            r2 = r0
            r0 = r38
            goto L_0x0579
        L_0x0567:
            r0 = r35
            if (r4 != 0) goto L_0x056c
            goto L_0x056e
        L_0x056c:
            r2 = r30
        L_0x056e:
            r4 = r38
            int r2 = java.lang.Math.max(r4, r2)
            r39 = r2
            r2 = r0
            r0 = r39
        L_0x0579:
            r33 = r1
            r1 = r2
            r2 = r3
            r19 = r5
        L_0x057f:
            int r3 = r26 + 1
            r4 = r28
            r5 = r29
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x03d7
        L_0x0589:
            r28 = r4
            r29 = r5
            r4 = r0
            r0 = r1
            r5 = r2
            r1 = r33
            int r2 = r6.e
            if (r2 > 0) goto L_0x0597
            goto L_0x05a4
        L_0x0597:
            boolean r2 = r6.c(r9)
            if (r2 == 0) goto L_0x05a4
            int r2 = r6.e
            int r3 = r6.h
            int r2 = r2 + r3
            r6.e = r2
        L_0x05a4:
            r2 = 1
            r3 = r14[r2]
            r2 = -1
            if (r3 != r2) goto L_0x05c0
            r37 = r5
            r11 = 0
            r5 = r14[r11]
            if (r5 != r2) goto L_0x05c2
            r5 = r14[r18]
            if (r5 != r2) goto L_0x05c2
            r5 = r14[r17]
            if (r5 == r2) goto L_0x05bb
            goto L_0x05c2
        L_0x05bb:
            r35 = r0
            r33 = r1
            goto L_0x05f2
        L_0x05c0:
            r37 = r5
        L_0x05c2:
            r2 = r14[r17]
            r5 = 0
            r11 = r14[r5]
            r5 = r14[r18]
            int r3 = java.lang.Math.max(r3, r5)
            int r3 = java.lang.Math.max(r11, r3)
            int r2 = java.lang.Math.max(r2, r3)
            r3 = r15[r17]
            r5 = 0
            r11 = r15[r5]
            r35 = r0
            r5 = 1
            r0 = r15[r5]
            r5 = r15[r18]
            int r0 = java.lang.Math.max(r0, r5)
            int r0 = java.lang.Math.max(r11, r0)
            int r0 = java.lang.Math.max(r3, r0)
            int r2 = r2 + r0
            int r33 = java.lang.Math.max(r1, r2)
        L_0x05f2:
            if (r28 != 0) goto L_0x05f5
            goto L_0x062a
        L_0x05f5:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 != r0) goto L_0x05fa
            goto L_0x05fc
        L_0x05fa:
            if (r10 != 0) goto L_0x062a
        L_0x05fc:
            r0 = 0
            r6.e = r0
            r0 = 0
        L_0x0600:
            if (r0 >= r9) goto L_0x062a
            android.view.View r1 = r6.getChildAt(r0)
            if (r1 != 0) goto L_0x0609
            goto L_0x0627
        L_0x0609:
            int r2 = r1.getVisibility()
            r3 = 8
            if (r2 == r3) goto L_0x0627
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            abe r1 = (defpackage.abe) r1
            int r2 = r6.e
            int r3 = r2 + r13
            int r5 = r1.leftMargin
            int r3 = r3 + r5
            int r1 = r1.rightMargin
            int r3 = r3 + r1
            int r1 = java.lang.Math.max(r2, r3)
            r6.e = r1
        L_0x0627:
            int r0 = r0 + 1
            goto L_0x0600
        L_0x062a:
            int r0 = r6.e
            int r1 = r40.getPaddingLeft()
            int r2 = r40.getPaddingRight()
            int r1 = r1 + r2
            int r0 = r0 + r1
            r6.e = r0
            int r1 = r40.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r1)
            r1 = 0
            int r0 = android.view.View.resolveSizeAndState(r0, r7, r1)
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r0
            int r2 = r6.e
            int r1 = r1 - r2
            if (r22 == 0) goto L_0x0650
            r3 = 0
            goto L_0x065d
        L_0x0650:
            if (r1 != 0) goto L_0x0658
            r25 = r0
            r20 = 0
            goto L_0x0808
        L_0x0658:
            r3 = 0
            int r5 = (r24 > r3 ? 1 : (r24 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0804
        L_0x065d:
            float r4 = r6.i
            int r5 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0666
            r24 = r4
            goto L_0x0667
        L_0x0666:
        L_0x0667:
            r3 = -1
            r14[r17] = r3
            r14[r18] = r3
            r4 = 1
            r14[r4] = r3
            r5 = 0
            r14[r5] = r3
            r15[r17] = r3
            r15[r18] = r3
            r15[r4] = r3
            r15[r5] = r3
            r6.e = r5
            r3 = r35
            r4 = r37
            r5 = 0
            r11 = -1
        L_0x0683:
            if (r5 < r9) goto L_0x06e1
            int r1 = r6.e
            int r5 = r40.getPaddingLeft()
            int r10 = r40.getPaddingRight()
            int r5 = r5 + r10
            int r1 = r1 + r5
            r6.e = r1
            r1 = 1
            r5 = r14[r1]
            r1 = -1
            if (r5 != r1) goto L_0x06ac
            r10 = 0
            r13 = r14[r10]
            if (r13 != r1) goto L_0x06ac
            r10 = r14[r18]
            if (r10 != r1) goto L_0x06ac
            r10 = r14[r17]
            if (r10 == r1) goto L_0x06a7
            goto L_0x06ac
        L_0x06a7:
            r33 = r11
            r20 = 0
            goto L_0x06dc
        L_0x06ac:
            r1 = r14[r17]
            r20 = 0
            r10 = r14[r20]
            r13 = r14[r18]
            int r5 = java.lang.Math.max(r5, r13)
            int r5 = java.lang.Math.max(r10, r5)
            int r1 = java.lang.Math.max(r1, r5)
            r5 = r15[r17]
            r10 = r15[r20]
            r13 = 1
            r13 = r15[r13]
            r14 = r15[r18]
            int r13 = java.lang.Math.max(r13, r14)
            int r10 = java.lang.Math.max(r10, r13)
            int r5 = java.lang.Math.max(r5, r10)
            int r1 = r1 + r5
            int r1 = java.lang.Math.max(r11, r1)
            r33 = r1
        L_0x06dc:
            r25 = r0
            r2 = r4
            goto L_0x081c
        L_0x06e1:
            r20 = 0
            android.view.View r13 = r6.getChildAt(r5)
            if (r13 != 0) goto L_0x06f1
            r25 = r0
            r16 = 1
            r23 = 4
            goto L_0x07fc
        L_0x06f1:
            int r2 = r13.getVisibility()
            r7 = 8
            if (r2 == r7) goto L_0x07f6
            android.view.ViewGroup$LayoutParams r2 = r13.getLayoutParams()
            abe r2 = (defpackage.abe) r2
            float r7 = r2.g
            r25 = 0
            int r26 = (r7 > r25 ? 1 : (r7 == r25 ? 0 : -1))
            if (r26 <= 0) goto L_0x0761
            r25 = r0
            float r0 = (float) r1
            float r0 = r0 * r7
            float r0 = r0 / r24
            int r0 = (int) r0
            float r24 = r24 - r7
            int r1 = r1 - r0
            int r7 = r40.getPaddingTop()
            int r26 = r40.getPaddingBottom()
            int r7 = r7 + r26
            r26 = r1
            int r1 = r2.topMargin
            int r7 = r7 + r1
            int r1 = r2.bottomMargin
            int r7 = r7 + r1
            int r1 = r2.height
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r8, r7, r1)
            int r7 = r2.width
            if (r7 == 0) goto L_0x072f
            goto L_0x0740
        L_0x072f:
            r7 = 1073741824(0x40000000, float:2.0)
            if (r10 != r7) goto L_0x0740
            if (r0 <= 0) goto L_0x0736
            goto L_0x0737
        L_0x0736:
            r0 = 0
        L_0x0737:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r7)
            r13.measure(r0, r1)
            goto L_0x0753
        L_0x0740:
            int r7 = r13.getMeasuredWidth()
            int r0 = r0 + r7
            if (r0 < 0) goto L_0x0748
            goto L_0x0749
        L_0x0748:
            r0 = 0
        L_0x0749:
            r7 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r7)
            r13.measure(r0, r1)
        L_0x0753:
            int r0 = r13.getMeasuredState()
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r1
            int r4 = android.view.View.combineMeasuredStates(r4, r0)
            r1 = r26
            goto L_0x0763
        L_0x0761:
            r25 = r0
        L_0x0763:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 == r0) goto L_0x077d
            int r0 = r6.e
            int r7 = r13.getMeasuredWidth()
            int r7 = r7 + r0
            r26 = r1
            int r1 = r2.leftMargin
            int r7 = r7 + r1
            int r1 = r2.rightMargin
            int r7 = r7 + r1
            int r0 = java.lang.Math.max(r0, r7)
            r6.e = r0
            goto L_0x078e
        L_0x077d:
            r26 = r1
            int r0 = r6.e
            int r1 = r13.getMeasuredWidth()
            int r7 = r2.leftMargin
            int r1 = r1 + r7
            int r7 = r2.rightMargin
            int r1 = r1 + r7
            int r0 = r0 + r1
            r6.e = r0
        L_0x078e:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 == r0) goto L_0x0799
            int r0 = r2.height
            r1 = -1
            if (r0 != r1) goto L_0x0799
            r0 = 1
            goto L_0x079a
        L_0x0799:
            r0 = 0
        L_0x079a:
            int r1 = r2.topMargin
            int r7 = r2.bottomMargin
            int r1 = r1 + r7
            int r7 = r13.getMeasuredHeight()
            int r7 = r7 + r1
            int r11 = java.lang.Math.max(r11, r7)
            if (r0 != 0) goto L_0x07ac
            r1 = r7
            goto L_0x07ad
        L_0x07ac:
        L_0x07ad:
            int r0 = java.lang.Math.max(r3, r1)
            if (r19 == 0) goto L_0x07ba
            int r1 = r2.height
            r3 = -1
            if (r1 != r3) goto L_0x07ba
            r1 = 1
            goto L_0x07bb
        L_0x07ba:
            r1 = 0
        L_0x07bb:
            if (r29 != 0) goto L_0x07c2
            r16 = 1
            r23 = 4
            goto L_0x07f0
        L_0x07c2:
            int r3 = r13.getBaseline()
            r13 = -1
            if (r3 != r13) goto L_0x07ce
            r16 = 1
            r23 = 4
            goto L_0x07f0
        L_0x07ce:
            int r2 = r2.h
            if (r2 < 0) goto L_0x07d3
            goto L_0x07d5
        L_0x07d3:
            int r2 = r6.f
        L_0x07d5:
            r2 = r2 & 112(0x70, float:1.57E-43)
            r23 = 4
            int r2 = r2 >> 4
            r16 = 1
            int r2 = r2 >> 1
            r13 = r14[r2]
            int r13 = java.lang.Math.max(r13, r3)
            r14[r2] = r13
            r13 = r15[r2]
            int r7 = r7 - r3
            int r3 = java.lang.Math.max(r13, r7)
            r15[r2] = r3
        L_0x07f0:
            r3 = r0
            r19 = r1
            r1 = r26
            goto L_0x07fc
        L_0x07f6:
            r25 = r0
            r16 = 1
            r23 = 4
        L_0x07fc:
            int r5 = r5 + 1
            r7 = r41
            r0 = r25
            goto L_0x0683
        L_0x0804:
            r25 = r0
            r20 = 0
        L_0x0808:
            r1 = r35
            int r3 = java.lang.Math.max(r1, r4)
            if (r28 != 0) goto L_0x0811
        L_0x0810:
            goto L_0x081a
        L_0x0811:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 != r0) goto L_0x0816
            goto L_0x0810
        L_0x0816:
            r4 = 0
        L_0x0817:
            if (r4 < r9) goto L_0x0887
            goto L_0x0810
        L_0x081a:
            r2 = r37
        L_0x081c:
            if (r19 == 0) goto L_0x081f
            goto L_0x0824
        L_0x081f:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 == r0) goto L_0x0824
            goto L_0x0826
        L_0x0824:
            r3 = r33
        L_0x0826:
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r2
            r0 = r25 | r0
            int r1 = r40.getPaddingTop()
            int r4 = r40.getPaddingBottom()
            int r1 = r1 + r4
            int r3 = r3 + r1
            int r1 = r40.getSuggestedMinimumHeight()
            int r1 = java.lang.Math.max(r3, r1)
            int r2 = r2 << 16
            int r1 = android.view.View.resolveSizeAndState(r1, r8, r2)
            r6.setMeasuredDimension(r0, r1)
            if (r21 == 0) goto L_0x0886
            int r0 = r40.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r8 = 0
        L_0x0853:
            if (r8 >= r9) goto L_0x0886
            android.view.View r1 = r6.getChildAt(r8)
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x0882
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r10 = r0
            abe r10 = (defpackage.abe) r10
            int r0 = r10.height
            r11 = -1
            if (r0 != r11) goto L_0x0883
            int r12 = r10.width
            int r0 = r1.getMeasuredWidth()
            r10.width = r0
            r3 = 0
            r5 = 0
            r0 = r40
            r2 = r41
            r4 = r7
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r10.width = r12
            goto L_0x0883
        L_0x0882:
            r11 = -1
        L_0x0883:
            int r8 = r8 + 1
            goto L_0x0853
        L_0x0886:
            return
        L_0x0887:
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r11 = -1
            android.view.View r1 = r6.getChildAt(r4)
            if (r1 != 0) goto L_0x0896
            r2 = 1073741824(0x40000000, float:2.0)
            r5 = 8
            r7 = 0
            goto L_0x08c3
        L_0x0896:
            int r2 = r1.getVisibility()
            r5 = 8
            if (r2 == r5) goto L_0x08c0
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            abe r2 = (defpackage.abe) r2
            float r2 = r2.g
            r7 = 0
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x08bd
            r2 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r2)
            int r14 = r1.getMeasuredHeight()
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r2)
            r1.measure(r10, r14)
            goto L_0x08c3
        L_0x08bd:
            r2 = 1073741824(0x40000000, float:2.0)
            goto L_0x08c3
        L_0x08c0:
            r2 = 1073741824(0x40000000, float:2.0)
            r7 = 0
        L_0x08c3:
            int r4 = r4 + 1
            goto L_0x0817
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abf.onMeasure(int, int):void");
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public abf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abe generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new abe(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public final void b(Canvas canvas, int i2) {
        this.g.setBounds(i2, getPaddingTop() + this.o, this.h + i2, (getHeight() - getPaddingBottom()) - this.o);
        this.g.draw(canvas);
    }

    public abf(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        boolean z = true;
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.f = 8388659;
        aev a2 = aev.a(context, attributeSet, uh.n, i2, 0);
        qb.a(this, context, uh.n, attributeSet, a2.b, i2, 0);
        int a3 = a2.a(1, -1);
        if (a3 >= 0) {
            d(a3);
        }
        int a4 = a2.a(0, -1);
        if (a4 >= 0 && this.f != a4) {
            a4 = (8388615 & a4) == 0 ? a4 | 8388611 : a4;
            this.f = (a4 & 112) == 0 ? a4 | 48 : a4;
            requestLayout();
        }
        if (!a2.a(2, true)) {
            e();
        }
        this.i = a2.b.getFloat(4, -1.0f);
        this.b = a2.a(3, -1);
        this.j = a2.a(7, false);
        Drawable a5 = a2.a(5);
        if (a5 != this.g) {
            this.g = a5;
            if (a5 != null) {
                this.h = a5.getIntrinsicWidth();
                this.m = a5.getIntrinsicHeight();
            } else {
                this.h = 0;
                this.m = 0;
            }
            setWillNotDraw(a5 != null ? false : z);
            requestLayout();
        }
        this.n = a2.a(8, 0);
        this.o = a2.d(6, 0);
        a2.a();
    }

    /* access modifiers changed from: package-private */
    public final void a(Canvas canvas, int i2) {
        this.g.setBounds(getPaddingLeft() + this.o, i2, (getWidth() - getPaddingRight()) - this.o, this.m + i2);
        this.g.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public final boolean c(int i2) {
        if (i2 == 0) {
            return (this.n & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.n & 4) != 0;
        }
        if ((this.n & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }
}
