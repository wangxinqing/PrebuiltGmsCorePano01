package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import java.lang.reflect.Field;

/* renamed from: aan  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aan extends ListView {
    public boolean a;
    aam b;
    private final Rect c = new Rect();
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h;
    private Field i;
    private aal j;
    private final boolean k;
    private boolean l;
    private rj m;

    public aan(Context context, boolean z) {
        super(context, (AttributeSet) null, R.attr.dropDownListViewStyle);
        this.k = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.i = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            apev.a(e2);
        }
    }

    private final void a() {
        Drawable selector = getSelector();
        if (selector != null && this.l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private final void a(boolean z) {
        aal aal = this.j;
        if (aal != null) {
            aal.b = z;
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.c.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.c);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        if (this.b == null) {
            super.drawableStateChanged();
            a(true);
            a();
        }
    }

    public final boolean hasFocus() {
        return this.k || super.hasFocus();
    }

    public final boolean hasWindowFocus() {
        return this.k || super.hasWindowFocus();
    }

    public final boolean isFocused() {
        return this.k || super.isFocused();
    }

    public final boolean isInTouchMode() {
        return (this.k && this.a) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.b = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.b == null) {
            aam aam = new aam(this);
            this.b = aam;
            aam.a.post(aam);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                a();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        aam aam = this.b;
        if (aam != null) {
            aan aan = aam.a;
            aan.b = null;
            aan.removeCallbacks(aam);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setSelector(Drawable drawable) {
        aal aal;
        if (drawable != null) {
            aal = new aal(drawable);
        } else {
            aal = null;
        }
        this.j = aal;
        super.setSelector(aal);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.d = rect.left;
        this.e = rect.top;
        this.f = rect.right;
        this.g = rect.bottom;
    }

    public final int a(int i2, int i3) {
        int i4;
        int i5;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0) {
            dividerHeight = 0;
        } else if (divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i7 = 0;
        int i8 = 0;
        while (i7 < count) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i8) {
                i4 = itemViewType;
            } else {
                i4 = i8;
            }
            if (itemViewType != i8) {
                view = null;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                i5 = View.MeasureSpec.makeMeasureSpec(layoutParams.height, JGCastService.FLAG_PRIVATE_DISPLAY);
            } else {
                i5 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i2, i5);
            view.forceLayout();
            if (i7 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i3) {
                return i3;
            }
            i7++;
            i8 = i4;
        }
        return i6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.view.MotionEvent r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            int r3 = r17.getActionMasked()
            r4 = 1
            r5 = 0
            if (r3 == r4) goto L_0x001a
            r0 = 2
            if (r3 == r0) goto L_0x0018
            r0 = 3
            if (r3 == r0) goto L_0x0015
            r0 = 1
            goto L_0x0131
        L_0x0015:
            r0 = 0
            goto L_0x0131
        L_0x0018:
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            int r6 = r17.findPointerIndex(r18)
            if (r6 < 0) goto L_0x012f
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 == r9) goto L_0x012d
            int r0 = r16.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.l = r4
            int r0 = android.os.Build.VERSION.SDK_INT
            r1.drawableHotspotChanged(r7, r6)
            boolean r0 = r16.isPressed()
            if (r0 != 0) goto L_0x004e
            r1.setPressed(r4)
        L_0x004e:
            r16.layoutChildren()
            int r0 = r1.h
            if (r0 == r9) goto L_0x006c
            int r11 = r16.getFirstVisiblePosition()
            int r0 = r0 - r11
            android.view.View r0 = r1.getChildAt(r0)
            if (r0 != 0) goto L_0x0061
            goto L_0x006c
        L_0x0061:
            if (r0 == r10) goto L_0x006c
            boolean r11 = r0.isPressed()
            if (r11 == 0) goto L_0x006c
            r0.setPressed(r5)
        L_0x006c:
            r1.h = r8
            int r0 = r10.getLeft()
            int r11 = r10.getTop()
            int r12 = android.os.Build.VERSION.SDK_INT
            float r0 = (float) r0
            float r0 = r7 - r0
            float r11 = (float) r11
            float r11 = r6 - r11
            r10.drawableHotspotChanged(r0, r11)
            boolean r0 = r10.isPressed()
            if (r0 != 0) goto L_0x008a
            r10.setPressed(r4)
        L_0x008a:
            android.graphics.drawable.Drawable r11 = r16.getSelector()
            if (r11 != 0) goto L_0x0092
            r12 = 0
            goto L_0x0097
        L_0x0092:
            if (r8 != r9) goto L_0x0096
            r12 = 0
            goto L_0x0097
        L_0x0096:
            r12 = 1
        L_0x0097:
            if (r12 != 0) goto L_0x009a
            goto L_0x009e
        L_0x009a:
            r11.setVisible(r5, r5)
        L_0x009e:
            android.graphics.Rect r0 = r1.c
            int r13 = r10.getLeft()
            int r14 = r10.getTop()
            int r15 = r10.getRight()
            int r5 = r10.getBottom()
            r0.set(r13, r14, r15, r5)
            int r5 = r0.left
            int r13 = r1.d
            int r5 = r5 - r13
            r0.left = r5
            int r5 = r0.top
            int r13 = r1.e
            int r5 = r5 - r13
            r0.top = r5
            int r5 = r0.right
            int r13 = r1.f
            int r5 = r5 + r13
            r0.right = r5
            int r5 = r0.bottom
            int r13 = r1.g
            int r5 = r5 + r13
            r0.bottom = r5
            java.lang.reflect.Field r0 = r1.i     // Catch:{ IllegalAccessException -> 0x00eb }
            boolean r0 = r0.getBoolean(r1)     // Catch:{ IllegalAccessException -> 0x00eb }
            boolean r5 = r10.isEnabled()     // Catch:{ IllegalAccessException -> 0x00eb }
            if (r5 == r0) goto L_0x00ef
            java.lang.reflect.Field r5 = r1.i     // Catch:{ IllegalAccessException -> 0x00eb }
            r0 = r0 ^ r4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x00eb }
            r5.set(r1, r0)     // Catch:{ IllegalAccessException -> 0x00eb }
            if (r8 == r9) goto L_0x00ef
            r16.refreshDrawableState()     // Catch:{ IllegalAccessException -> 0x00eb }
            goto L_0x00ef
        L_0x00eb:
            r0 = move-exception
            defpackage.apev.a(r0)
        L_0x00ef:
            if (r12 == 0) goto L_0x010b
            android.graphics.Rect r0 = r1.c
            float r5 = r0.exactCenterX()
            float r0 = r0.exactCenterY()
            int r12 = r16.getVisibility()
            if (r12 != 0) goto L_0x0103
            r12 = 1
            goto L_0x0104
        L_0x0103:
            r12 = 0
        L_0x0104:
            r13 = 0
            r11.setVisible(r12, r13)
            defpackage.ma.a(r11, r5, r0)
        L_0x010b:
            android.graphics.drawable.Drawable r0 = r16.getSelector()
            if (r0 != 0) goto L_0x0112
            goto L_0x0117
        L_0x0112:
            if (r8 == r9) goto L_0x0117
            defpackage.ma.a(r0, r7, r6)
        L_0x0117:
            r5 = 0
            r1.a(r5)
            r16.refreshDrawableState()
            if (r3 != r4) goto L_0x0129
            long r5 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r5)
            goto L_0x012a
        L_0x0129:
        L_0x012a:
            r0 = 1
            r5 = 0
            goto L_0x0131
        L_0x012d:
            r5 = 1
            goto L_0x0131
        L_0x012f:
            r0 = 0
            r5 = 0
        L_0x0131:
            if (r0 != 0) goto L_0x0134
            goto L_0x0136
        L_0x0134:
            if (r5 == 0) goto L_0x014f
        L_0x0136:
            r3 = 0
            r1.l = r3
            r1.setPressed(r3)
            r16.drawableStateChanged()
            int r5 = r1.h
            int r6 = r16.getFirstVisiblePosition()
            int r5 = r5 - r6
            android.view.View r5 = r1.getChildAt(r5)
            if (r5 == 0) goto L_0x014f
            r5.setPressed(r3)
        L_0x014f:
            if (r0 != 0) goto L_0x015a
            rj r2 = r1.m
            if (r2 == 0) goto L_0x0170
            r3 = 0
            r2.a(r3)
            goto L_0x0170
        L_0x015a:
            rj r3 = r1.m
            if (r3 == 0) goto L_0x015f
            goto L_0x0166
        L_0x015f:
            rj r3 = new rj
            r3.<init>(r1)
            r1.m = r3
        L_0x0166:
            rj r3 = r1.m
            r3.a(r4)
            rj r3 = r1.m
            r3.onTouch(r1, r2)
        L_0x0170:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aan.a(android.view.MotionEvent, int):boolean");
    }
}
