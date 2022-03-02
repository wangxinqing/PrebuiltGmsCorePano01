package com.google.android.pano.widget;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Scroller;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ScrollAdapterView extends AdapterView implements akhe {
    public static final /* synthetic */ int A = 0;
    private static final int[] B = {1, 2, 3, 5};
    private akgh C;
    private akgg D;
    private int E;
    private akgt F = new akgt(10);
    private akgt G = new akgt(3);
    private int H;
    private int I;
    private int J;
    private int K = 1;
    private ArrayList L = new ArrayList();
    private ArrayList M = new ArrayList();
    private final akgo N = new akgo(this);
    private Drawable O;
    private int P = -1;
    private akgf Q;
    private boolean R = true;
    private boolean S = true;
    private GestureDetector T;
    private akhg U = new akhg(this);
    private boolean V = true;
    private float W;
    public int a = 0;
    private float aa;
    private boolean ab = true;
    private boolean ac = true;
    private DataSetObserver ad = new akgi(this);
    private akgy ae;
    public int b = -1;
    public akge c;
    public boolean d = false;
    public boolean e = true;
    public int f;
    public int g;
    public int h;
    public akgx i = new akgx(getContext());
    public akgl j;
    public final akgn k = new akgn(this);
    public boolean l;
    public int m;
    public final akgv n = new akgv();
    public int o = -1;
    public final akgv p = new akgv();
    public boolean q;
    public int r;
    public int s;
    public Animator t = null;
    public Animator u = null;
    public final ArrayList v = new ArrayList(4);
    public int w;
    public Rect x = new Rect();
    Runnable y = new akgj(this);
    public GestureDetector.OnGestureListener z = new akgk(this);

    public ScrollAdapterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setChildrenDrawingOrderEnabled(true);
        setSoundEffectsEnabled(true);
        setWillNotDraw(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, akdi.c);
        int i2 = obtainStyledAttributes.getInt(0, 0);
        this.a = i2;
        akgx akgx = this.i;
        akgw akgw = akgx.h;
        int i3 = akgw.i;
        boolean z2 = akgw.j;
        akgx.d = i2;
        if (i2 != 0) {
            akgx.h = akgx.f;
            akgx.i = akgx.g;
        } else {
            akgx.h = akgx.g;
            akgx.i = akgx.f;
        }
        akgw akgw2 = akgx.h;
        akgw2.i = i3;
        akgw akgw3 = akgx.i;
        akgw3.i = 0;
        akgw2.j = z2;
        akgw3.j = false;
        akgx.h.i = obtainStyledAttributes.getInt(17, 0);
        this.K = obtainStyledAttributes.getInt(5, 1);
        requestLayout();
        if (obtainStyledAttributes.hasValue(9)) {
            Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), obtainStyledAttributes.getResourceId(9, -1));
            l();
            akgy akgy = this.ae;
            akgy.b = loadAnimator;
            akgy.a(akgy.b, 0);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            Animator loadAnimator2 = AnimatorInflater.loadAnimator(getContext(), obtainStyledAttributes.getResourceId(6, -1));
            l();
            akgy akgy2 = this.ae;
            akgy2.a = loadAnimator2;
            akgy2.a(akgy2.a, 0);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            this.t = AnimatorInflater.loadAnimator(getContext(), obtainStyledAttributes.getResourceId(2, -1));
        }
        if (obtainStyledAttributes.hasValue(3)) {
            this.u = AnimatorInflater.loadAnimator(getContext(), obtainStyledAttributes.getResourceId(3, -1));
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(20, 0);
        this.H = dimensionPixelSize;
        int i4 = dimensionPixelSize / 2;
        this.I = i4;
        this.J = dimensionPixelSize - i4;
        this.i.h.j = obtainStyledAttributes.getBoolean(19, false);
        this.E = obtainStyledAttributes.getDimensionPixelSize(18, 0);
        this.i.h.p = obtainStyledAttributes.getInt(16, 0);
        this.i.h.q = obtainStyledAttributes.getDimensionPixelSize(14, 0);
        int i5 = obtainStyledAttributes.getInt(15, 0);
        akgw akgw4 = this.i.h;
        if (i5 < 0) {
            i5 = 0;
        } else if (i5 > 100) {
            i5 = 100;
        }
        akgw4.r = ((float) i5) / 100.0f;
        this.O = obtainStyledAttributes.getDrawable(13);
        this.i.j = obtainStyledAttributes.getInteger(4, 3);
        this.i.k = obtainStyledAttributes.getInteger(1, 3);
        this.S = obtainStyledAttributes.getBoolean(11, true);
        this.R = obtainStyledAttributes.getBoolean(12, true);
        obtainStyledAttributes.getBoolean(10, true);
        this.V = obtainStyledAttributes.getBoolean(22, true);
        this.ab = obtainStyledAttributes.getBoolean(23, true);
        akfv akfv = this.i.e;
        float f2 = obtainStyledAttributes.getFloat(8, 2.0f);
        if (f2 >= 1.0f) {
            akfv.a = f2;
            akfv.b = 1.0f / f2;
            this.U.a((float) obtainStyledAttributes.getDimensionPixelSize(27, 100));
            akhg akhg = this.U;
            float f3 = obtainStyledAttributes.getFloat(25, 1.0f);
            if (f3 > 0.0f) {
                akhg.g = f3;
                akhg akhg2 = this.U;
                float f4 = obtainStyledAttributes.getFloat(26, 1.0f);
                if (f4 > 0.0f) {
                    akhg2.h = f4;
                    this.U.i = obtainStyledAttributes.getBoolean(21, false);
                    akhg akhg3 = this.U;
                    float f5 = obtainStyledAttributes.getFloat(24, 0.0f);
                    if (f5 >= 0.0f) {
                        akhg3.f = f5;
                        obtainStyledAttributes.recycle();
                        this.T = new akgq(this, getContext());
                        a();
                        return;
                    }
                    throw new IllegalArgumentException();
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    private static akgp a(ArrayList arrayList, int i2) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            akgp akgp = (akgp) arrayList.get(i3);
            if (akgp.a == i2) {
                return akgp;
            }
        }
        return null;
    }

    private final boolean a(int i2, int i3, int i4) {
        int i5 = i3 / 2;
        return (i4 - i5) - this.I <= i2 && i2 <= (i4 + i5) + this.J;
    }

    private final void c(View view) {
        int i2;
        int i3;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
            view.setLayoutParams(layoutParams);
        }
        if (this.a == 1) {
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(this.b, 0, layoutParams.width);
            int i4 = layoutParams.height;
            if (i4 > 0) {
                i3 = View.MeasureSpec.makeMeasureSpec(i4, JGCastService.FLAG_PRIVATE_DISPLAY);
            } else {
                i3 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(childMeasureSpec, i3);
            return;
        }
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.b, 0, layoutParams.height);
        int i5 = layoutParams.width;
        if (i5 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i5, JGCastService.FLAG_PRIVATE_DISPLAY);
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(i2, childMeasureSpec2);
    }

    private final int d(View view) {
        return this.a != 1 ? (view.getTop() + view.getBottom()) / 2 : (view.getLeft() + view.getRight()) / 2;
    }

    private final int e(View view) {
        return this.a != 0 ? view.getWidth() : view.getHeight();
    }

    private final void l() {
        if (!(this.ae instanceof akgy)) {
            this.ae = new akgy(getContext());
        }
    }

    private final boolean m() {
        return (this.E == 0 && this.C == null) ? false : true;
    }

    private final int n() {
        int i2 = this.E;
        if (i2 != 0) {
            return i2;
        }
        akgh akgh = this.C;
        if (akgh != null) {
            return akgh.b();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchGenericFocusedEvent(MotionEvent motionEvent) {
        float f2;
        if (!this.V || (motionEvent.getSource() & 2097152) != 2097152) {
            return super.dispatchGenericFocusedEvent(motionEvent);
        }
        akhg akhg = this.U;
        if (motionEvent.getAction() == 3) {
            akhg.a();
        } else if (motionEvent.getDevice() == null) {
            Log.w("TrackpadNavigation", "cannot handle event without device");
        } else {
            int deviceId = motionEvent.getDeviceId();
            int i2 = 0;
            if (deviceId != akhg.b) {
                akhg.a();
                akhg.b = deviceId;
                InputDevice device = motionEvent.getDevice();
                akfu akfu = new akfu();
                if (device.getName().equals("athome_remote")) {
                    f2 = device.getMotionRange(0).getRange() / 5.4f;
                    akfu.a = true;
                    akfu.b = true;
                } else {
                    f2 = device.getMotionRange(0).getRange() / 6.2f;
                    akfu.a = true;
                    akfu.b = false;
                }
                akhg.c = false;
                akhg.a(f2);
                akhg.f = 0.0f;
                akhg.d = akfu.a;
                akhg.e = akfu.b;
                device.getMotionRange(1).getRange();
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                akhg.o = true;
                akhg.H = true;
                akhg.I = true;
                float x2 = motionEvent.getX();
                akhg.q = x2;
                akhg.u = x2;
                akhg.w = x2;
                float y2 = motionEvent.getY();
                akhg.r = y2;
                akhg.v = y2;
                akhg.x = y2;
                akhg.s = akhg.q;
                akhg.t = y2;
                akhg.B = 0;
                akhg.C = 0;
                akhg.J = motionEvent.getPointerId(0);
                long eventTime = motionEvent.getEventTime();
                akhg.p = eventTime;
                akhg.a(akhg.E, new akhd(1, eventTime));
            } else if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 6 && akhg.o) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) != akhg.J) {
                            akhg.a(motionEvent.getEventTime(), motionEvent.getX(), motionEvent.getY(), motionEvent);
                        } else {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= motionEvent.getPointerCount()) {
                                    akhg.a();
                                    break;
                                } else if (i3 != actionIndex) {
                                    akhg.H = true;
                                    akhg.I = true;
                                    float x3 = motionEvent.getX();
                                    akhg.q = x3;
                                    akhg.u = x3;
                                    akhg.w = x3;
                                    float y3 = motionEvent.getY();
                                    akhg.r = y3;
                                    akhg.v = y3;
                                    akhg.x = y3;
                                    akhg.s = akhg.q;
                                    akhg.t = y3;
                                    akhg.B = 0;
                                    akhg.C = 0;
                                    akhg.J = motionEvent.getPointerId(i3);
                                    akhg.p = motionEvent.getEventTime();
                                    akhg.a(motionEvent.getEventTime(), motionEvent.getX(), motionEvent.getY(), motionEvent);
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                } else if (akhg.o && motionEvent.findPointerIndex(akhg.J) >= 0) {
                    for (int i4 = 0; i4 < motionEvent.getHistorySize(); i4++) {
                        akhg.a(motionEvent.getHistoricalEventTime(i4), motionEvent.getHistoricalX(i4), motionEvent.getHistoricalY(i4), motionEvent);
                    }
                    akhg.a(motionEvent.getEventTime(), motionEvent.getX(), motionEvent.getY(), motionEvent);
                }
            } else if (akhg.o) {
                long eventTime2 = motionEvent.getEventTime();
                akhb akhb = akhg.G;
                akhg.G = null;
                if (akhg.H && akhg.D == 0) {
                    boolean z2 = akhg.c;
                }
                if (akhg.d && !akhg.m) {
                    if (motionEvent.findPointerIndex(akhg.J) >= 0) {
                        long j2 = eventTime2 - akhg.p;
                        float x4 = akhg.k * (motionEvent.getX() - akhg.u);
                        float y4 = akhg.l * (motionEvent.getY() - akhg.v);
                        float f3 = (float) j2;
                        float f4 = y4 / f3;
                        float f5 = x4 / f3;
                        if ((Math.abs(x4) > akhg.y || Math.abs(y4) > akhg.y) && j2 < 400) {
                            int i5 = 33;
                            if (Math.abs(f5) * akhg.k < Math.abs(f4) * akhg.l) {
                                int i6 = akhg.C;
                                if (i6 > 0) {
                                    i5 = 130;
                                } else if (i6 >= 0 && f4 >= 0.0f) {
                                    i5 = 130;
                                }
                            } else {
                                int i7 = akhg.B;
                                i5 = (i7 > 0 || (i7 >= 0 && f5 >= 0.0f)) ? 66 : 17;
                            }
                            if (akhb != null && i5 == akhb.c) {
                                i2 = akhb.d + 1;
                            }
                            akhb akhb2 = akhg.F;
                            int i8 = akhg.z;
                            int i9 = akhg.A;
                            akhb2.e = eventTime2;
                            akhb2.a = i8;
                            akhb2.b = i9;
                            akhb2.c = i5;
                            akhb2.d = i2;
                            akhg.a(akhg.E, akhb2);
                            akhg.G = akhg.F;
                        }
                    }
                }
                akhg.a();
                akhg.a(akhg.E, new akhd(10, eventTime2));
            }
        }
        return true;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        long j2;
        akhg akhg = this.U;
        if (akhg.e && keyEvent.getDeviceId() == akhg.b) {
            int keyCode = keyEvent.getKeyCode();
            int action = keyEvent.getAction();
            if (action != 0) {
                if (action == 1 && (keyCode == 23 || keyCode == 66)) {
                    j2 = keyEvent.getEventTime();
                }
            } else if (keyCode == 23 || keyCode == 66) {
                akhg.m = true;
                j2 = 0;
            }
            akhg.n = j2;
        }
        if (super.dispatchKeyEvent(keyEvent) || keyEvent.dispatch(this, (KeyEvent.DispatcherState) null, (Object) null)) {
            return true;
        }
        return false;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.T.onTouchEvent(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public final void g() {
        if (!this.q) {
            this.q = true;
            postOnAnimation(this.y);
        }
    }

    public final Adapter getAdapter() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public final float getBottomFadingEdgeStrength() {
        if (this.a != 0 || this.c == null || getChildCount() == 0) {
            return 0.0f;
        }
        if (this.g != this.c.getCount() || getScrollY() + getHeight() < getChildAt(getChildCount() - 1).getBottom()) {
            return 1.0f;
        }
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public final int getChildDrawingOrder(int i2, int i3) {
        int i4 = this.m;
        int d2 = i4 >= 0 ? d(i4) : -1;
        return (d2 < 0 || i3 < d2) ? i3 : i3 < i2 + -1 ? ((d2 + i2) - 1) - i3 : d2;
    }

    public final int getFirstVisiblePosition() {
        int k2 = k();
        if (getChildCount() != k2) {
            return c(k2);
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public final float getRightFadingEdgeStrength() {
        if (this.a != 0 || this.c == null || getChildCount() == 0) {
            return 0.0f;
        }
        if (this.g != this.c.getCount() || getScrollX() + getWidth() < getChildAt(getChildCount() - 1).getRight()) {
            return 1.0f;
        }
        return 0.0f;
    }

    public final Object getSelectedItem() {
        int i2 = this.m;
        if (i2 >= 0) {
            return this.c.getItem(i2);
        }
        return null;
    }

    public final long getSelectedItemId() {
        int i2;
        akge akge = this.c;
        if (akge == null || (i2 = this.m) < 0) {
            return Long.MIN_VALUE;
        }
        return akge.getItemId(i2);
    }

    public final int getSelectedItemPosition() {
        return this.m;
    }

    public final View getSelectedView() {
        int i2 = this.m;
        if (i2 >= 0) {
            return getChildAt(d(i2));
        }
        return null;
    }

    public final void h() {
        int i2;
        do {
        } while (b(true));
        do {
        } while (a(true));
        int i3 = 0;
        if (this.g >= 0 && this.f == -1) {
            View childAt = getChildAt(k());
            int b2 = b(childAt);
            akgw akgw = this.i.h;
            akgm akgm = (akgm) childAt.getTag(R.id.ScrollAdapterViewChild);
            int a2 = this.i.a();
            if (a2 != 0) {
                i2 = a2 != 1 ? a2 != 2 ? 0 : b2 - akgm.b : b2;
            } else {
                i2 = b2 - (akgm.b / 2);
            }
            akgw.a(b2, i2);
        } else {
            akgw akgw2 = this.i.h;
            akgw2.g = Integer.MIN_VALUE;
            akgw2.f = Integer.MIN_VALUE;
            akgw2.h = Integer.MIN_VALUE;
        }
        if (this.g == this.c.getCount()) {
            View childAt2 = getChildAt(getChildCount() - 1);
            int b3 = b(childAt2);
            akgw akgw3 = this.i.h;
            akgm akgm2 = (akgm) childAt2.getTag(R.id.ScrollAdapterViewChild);
            int a3 = this.i.a();
            if (a3 == 0) {
                i3 = b3 + (akgm2.b / 2);
            } else if (a3 == 1) {
                i3 = b3 + akgm2.b;
            } else if (a3 == 2) {
                i3 = b3;
            }
            akgw3.b(b3, i3);
            return;
        }
        akgw akgw4 = this.i.h;
        akgw4.c = Integer.MAX_VALUE;
        akgw4.e = Integer.MAX_VALUE;
        akgw4.d = Integer.MAX_VALUE;
    }

    public final void i() {
        int b2 = b();
        View childAt = getChildAt(b2);
        if (isFocused() && getDescendantFocusability() == 262144 && childAt != null) {
            childAt.requestFocus();
        }
        ArrayList arrayList = this.L;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i2 = 0;
            if (childAt != null) {
                int c2 = c(b2);
                int b3 = b(childAt);
                ArrayList arrayList2 = this.L;
                int size = arrayList2.size();
                while (i2 < size) {
                    this.i.h.a(b3);
                    ((akgr) arrayList2.get(i2)).a();
                    i2++;
                }
                this.P = c2;
            } else if (this.P != -1) {
                ArrayList arrayList3 = this.L;
                int size2 = arrayList3.size();
                while (i2 < size2) {
                    ((akgr) arrayList3.get(i2)).a();
                    i2++;
                }
                this.P = -1;
            }
        }
        sendAccessibilityEvent(4);
    }

    public final void j() {
        akgv akgv = this.n;
        int i2 = akgv.a;
        float f2 = akgv.c;
        float f3 = akgv.d;
        int a2 = this.i.h.a();
        int a3 = this.i.i.a();
        int b2 = b(a2, a3);
        if (b2 >= 0) {
            View childAt = getChildAt(b2);
            int b3 = b(childAt);
            if (a2 > b3) {
                if (this.h + b2 >= getChildCount()) {
                    akgv.c = ((float) (a2 - b3)) / ((float) f(childAt));
                } else {
                    akgv.c = ((float) (a2 - b3)) / ((float) (b(getChildAt(this.h + b2)) - b3));
                }
            } else if (a2 == b3) {
                akgv.c = 0.0f;
            } else if (b2 - this.h >= k()) {
                b2 -= this.h;
                childAt = getChildAt(b2);
                int b4 = b(childAt);
                akgv.c = ((float) (a2 - b4)) / ((float) (b3 - b4));
            } else {
                akgv.c = ((float) (a2 - b3)) / ((float) f(childAt));
            }
            int d2 = d(childAt);
            if (a3 > d2) {
                int i3 = b2 + 1;
                if (i3 >= getChildCount()) {
                    akgv.d = ((float) (a3 - d2)) / ((float) e(childAt));
                } else {
                    akgv.d = ((float) (a3 - d2)) / ((float) (d(getChildAt(i3)) - d2));
                }
            } else if (a3 != d2) {
                int i4 = b2 - 1;
                if (i4 >= k()) {
                    childAt = getChildAt(i4);
                    int d3 = d(childAt);
                    akgv.d = ((float) (a3 - d3)) / ((float) (d2 - d3));
                    b2 = i4;
                } else {
                    akgv.d = ((float) (a3 - d2)) / ((float) e(childAt));
                }
            } else {
                akgv.d = 0.0f;
            }
            akgv.a = c(b2);
            akgv.e = this.a != 0 ? childAt.getTop() : childAt.getLeft();
            if (this.c.hasStableIds()) {
                akgv.b = this.c.getItemId(akgv.a);
            }
        } else {
            akgv.a = -1;
        }
        ArrayList arrayList = this.M;
        if (arrayList != null && !arrayList.isEmpty()) {
            akgv akgv2 = this.n;
            int i5 = akgv2.a;
            if (!(i2 == i5 && f2 == akgv2.c && f3 == akgv2.d) && i5 >= 0) {
                ArrayList arrayList2 = this.M;
                int size = arrayList2.size();
                for (int i6 = 0; i6 < size; i6++) {
                    View childAt2 = getChildAt(d(this.n.a));
                    akgv akgv3 = this.n;
                    int i7 = akgv3.a;
                    float f4 = akgv3.c;
                    float f5 = akgv3.d;
                    ((akgs) arrayList2.get(i6)).a(childAt2, f4);
                }
            }
        }
    }

    public final int k() {
        return this.v.size();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (this.O != null && getChildCount() > 0) {
            int a2 = this.i.g.a() - (this.O.getIntrinsicWidth() / 2);
            int a3 = this.i.f.a() - (this.O.getIntrinsicHeight() / 2);
            Drawable drawable = this.O;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.O.getIntrinsicHeight());
            canvas.translate((float) a2, (float) a3);
            this.O.draw(canvas);
            canvas.translate((float) (-a2), (float) (-a3));
        }
    }

    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        c();
        switch (i2) {
            case 19:
                if (a(33, 0, false)) {
                    return true;
                }
                break;
            case 20:
                if (a(130, 0, false)) {
                    return true;
                }
                break;
            case 21:
                if (a(17, 0, false)) {
                    return true;
                }
                break;
            case 22:
                if (a(66, 0, false)) {
                    return true;
                }
                break;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onKeyUp(int r8, android.view.KeyEvent r9) {
        /*
            r7 = this;
            r0 = 23
            if (r8 == r0) goto L_0x0009
            r0 = 66
            if (r8 == r0) goto L_0x0009
            goto L_0x002d
        L_0x0009:
            android.widget.AdapterView$OnItemClickListener r0 = r7.getOnItemClickListener()
            if (r0 == 0) goto L_0x002d
            int r0 = r7.b()
            android.view.View r3 = r7.getChildAt(r0)
            if (r3 == 0) goto L_0x002d
            int r4 = r7.c((int) r0)
            android.widget.AdapterView$OnItemClickListener r1 = r7.getOnItemClickListener()
            akge r8 = r7.c
            long r5 = r8.getItemId(r4)
            r2 = r7
            r1.onItemClick(r2, r3, r4, r5)
            r8 = 1
            return r8
        L_0x002d:
            boolean r8 = super.onKeyUp(r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.pano.widget.ScrollAdapterView.onKeyUp(int, android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        c(true);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (this.c != null) {
            this.i.g.c(getPaddingLeft(), getPaddingRight());
            this.i.f.c(getPaddingTop(), getPaddingBottom());
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i2);
            int size2 = View.MeasureSpec.getSize(i3);
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            if (this.b == -1) {
                View a2 = this.c.a(this);
                ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = generateDefaultLayoutParams();
                    a2.setLayoutParams(layoutParams);
                }
                if (this.a == 1) {
                    i8 = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
                    int i10 = layoutParams.height;
                    if (i10 > 0) {
                        i9 = View.MeasureSpec.makeMeasureSpec(i10, JGCastService.FLAG_PRIVATE_DISPLAY);
                    } else {
                        i9 = View.MeasureSpec.makeMeasureSpec(0, 0);
                    }
                } else {
                    int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.height);
                    int i11 = layoutParams.width;
                    if (i11 > 0) {
                        int i12 = childMeasureSpec;
                        i8 = View.MeasureSpec.makeMeasureSpec(i11, JGCastService.FLAG_PRIVATE_DISPLAY);
                        i9 = i12;
                    } else {
                        int i13 = childMeasureSpec;
                        i8 = View.MeasureSpec.makeMeasureSpec(0, 0);
                        i9 = i13;
                    }
                }
                a2.measure(i8, i9);
                this.r = a2.getMeasuredWidth();
                this.s = a2.getMeasuredHeight();
            }
            int i14 = this.K;
            if (i14 <= 0) {
                i14 = this.a != 0 ? mode != 0 ? paddingLeft / this.r : 1 : mode2 != 0 ? paddingTop / this.s : 1;
            }
            this.h = i14;
            if (i14 == 0) {
                this.h = 1;
                i4 = 1;
                i14 = 1;
            } else {
                i4 = i14;
            }
            akgl akgl = this.j;
            if (!(akgl == null || i14 == akgl.a)) {
                this.j = null;
            }
            if (mode == 0 || (mode == Integer.MIN_VALUE && this.a == 1)) {
                if (this.a == 1) {
                    i7 = (this.r * i4) + (this.H * (i4 - 1));
                } else {
                    i7 = this.r;
                }
                int paddingLeft2 = i7 + getPaddingLeft() + getPaddingRight();
                size = mode == Integer.MIN_VALUE ? Math.min(paddingLeft2, size) : paddingLeft2;
            }
            if (mode2 == 0 || (mode2 == Integer.MIN_VALUE && this.a == 0)) {
                if (this.a == 0) {
                    int i15 = this.s;
                    int i16 = this.h;
                    i6 = (i15 * i16) + (this.H * (i16 - 1));
                } else {
                    i6 = this.s;
                }
                int paddingTop2 = i6 + getPaddingTop() + getPaddingBottom();
                size2 = mode2 == Integer.MIN_VALUE ? Math.min(paddingTop2, size2) : paddingTop2;
            }
            if (this.a != 0) {
                i5 = i2;
            } else {
                i5 = i3;
            }
            this.b = i5;
            setMeasuredDimension(size, size2);
            akgw akgw = this.i.i;
            int i17 = akgw.t;
            if (this.a == 0) {
                size = size2;
            }
            int i18 = size - akgw.u;
            akgw.a(i17, i17);
            this.i.i.b(i18, i18);
            int size3 = this.v.size();
            for (int i19 = 0; i19 < size3; i19++) {
                c(((akgp) this.v.get(i19)).c);
            }
            for (int k2 = k(); k2 < getChildCount(); k2++) {
                View childAt = getChildAt(k2);
                if (childAt.isLayoutRequested()) {
                    c(childAt);
                }
            }
            return;
        }
        Log.e("ScrollAdapterView", "onMeasure: Adapter not available ");
        super.onMeasure(i2, i3);
    }

    /* access modifiers changed from: protected */
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        View view;
        akgp a2 = a(this.v, this.m);
        if (a2 != null) {
            view = a2.c;
        } else {
            view = null;
        }
        if (view != null) {
            return view.requestFocus(i2, rect);
        }
        View selectedView = getSelectedView();
        if (selectedView != null) {
            return selectedView.requestFocus(i2, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.j = savedState.a;
        d();
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        SavedState savedState = new SavedState(onSaveInstanceState);
        getChildCount();
        int b2 = b();
        if (b2 < 0) {
            return onSaveInstanceState;
        }
        this.N.c();
        this.k.c();
        akgl akgl = savedState.a;
        akgl.a = this.h;
        akgl.b = c(b2);
        getChildAt(b2);
        akgl akgl2 = savedState.a;
        akgl2.c = this.N.b;
        akgl2.d = this.k.b;
        return savedState;
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        akgx akgx = this.i;
        akgx.g.s = i2;
        akgx.f.s = i3;
        g();
    }

    public final void requestChildFocus(View view, View view2) {
        boolean z2 = false;
        if (getFocusedChild() == null && view != null) {
            z2 = true;
        }
        super.requestChildFocus(view, view2);
        if (z2 && this.i.b()) {
            g();
        }
    }

    public final void setAdapter(Adapter adapter) {
        akgh akgh;
        akgg akgg;
        akge akge = this.c;
        if (akge != null) {
            akge.unregisterDataSetObserver(this.ad);
        }
        akge akge2 = (akge) adapter;
        this.c = akge2;
        this.Q = akge2.a();
        this.c.registerDataSetObserver(this.ad);
        if (adapter instanceof akgh) {
            akgh = (akgh) adapter;
        } else {
            akgh = null;
        }
        this.C = akgh;
        if (adapter instanceof akgg) {
            akgg = (akgg) adapter;
        } else {
            akgg = null;
        }
        this.D = akgg;
        this.b = -1;
        this.j = null;
        this.o = -1;
        this.k.b();
        this.N.b();
        this.n.a();
        this.p.a();
        d();
    }

    public final void setSelection(int i2) {
        a(i2, true);
    }

    private final int b(int i2, int i3) {
        int i4;
        int childCount = getChildCount();
        int k2 = k();
        while (k2 < childCount) {
            View childAt = getChildAt(k2);
            int d2 = d(childAt);
            if (this.a == 0) {
                i4 = childAt.getHeight();
            } else {
                i4 = childAt.getWidth();
            }
            int b2 = b(childAt);
            int f2 = f(childAt);
            int a2 = this.i.a();
            if (a2 != 0) {
                k2 = a2 == 1 ? k2 + 1 : k2 + 1;
            } else {
                int i5 = f2 / 2;
                if ((b2 - i5) - this.I >= i2) {
                    continue;
                } else if (i2 >= b2 + i5 + this.J) {
                    continue;
                }
            }
            if (this.h == 1 || a(i3, i4, d2)) {
                return k2;
            }
        }
        return -1;
    }

    private final akgp e(int i2) {
        akgp akgp = null;
        if (this.Q == null || i2 < 0) {
            return null;
        }
        akgp a2 = a(this.v, i2);
        if (a2 != null) {
            return a2;
        }
        int itemViewType = this.Q.getItemViewType(i2);
        View view = this.Q.getView(i2, this.G.a(itemViewType), this);
        if (view != null) {
            int i3 = 0;
            addViewInLayout(view, 0, view.getLayoutParams(), true);
            this.N.a(view, i2);
            c(view);
            akgp = new akgp(this, view, i2, itemViewType);
            int size = this.v.size();
            while (i3 < size) {
                if (akgp.a >= ((akgp) this.v.get(i3)).a) {
                    i3++;
                } else {
                    this.v.add(i3, akgp);
                    return akgp;
                }
            }
            this.v.add(akgp);
        }
        return akgp;
    }

    private final int f(int i2) {
        int i3;
        int i4;
        int childCount = getChildCount();
        int k2 = k();
        View childAt = getChildAt(k2);
        int a2 = this.i.a();
        if (a2 != 0) {
            i3 = a2 != 1 ? a2 != 2 ? 0 : this.a != 0 ? childAt.getBottom() : childAt.getRight() : this.a != 0 ? childAt.getTop() : childAt.getLeft();
        } else {
            i3 = this.a != 0 ? (childAt.getTop() + childAt.getBottom()) / 2 : (childAt.getLeft() + childAt.getRight()) / 2;
        }
        if (this.i.h.j) {
            i3 -= ((akgm) childAt.getTag(R.id.ScrollAdapterViewChild)).c;
        }
        int i5 = -1;
        while (k2 < childCount) {
            View childAt2 = getChildAt(k2);
            if (k2 <= i2 && i2 < this.h + k2) {
                return i3;
            }
            int i6 = this.h;
            if (k2 < childCount - i6) {
                View childAt3 = getChildAt(i6 + k2);
                int a3 = this.i.a();
                if (a3 == 0) {
                    i5 = ((f(childAt2) + f(childAt3)) / 2) + i3;
                } else if (a3 == 1) {
                    i5 = f(childAt2) + i3;
                } else if (a3 == 2) {
                    i5 = f(childAt3) + i3;
                }
                i4 = i5 + this.H;
            } else {
                i4 = Integer.MAX_VALUE;
            }
            k2 += this.h;
            i5 = i3;
        }
        throw new RuntimeException("Scroll out of range?");
    }

    public final int d(int i2) {
        return ((k() + i2) - this.f) - 1;
    }

    public final int getLastVisiblePosition() {
        int childCount = getChildCount();
        if (k() != childCount) {
            return c(childCount - 1);
        }
        return -1;
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new akgu();
        final akgl a;

        public SavedState(Parcel parcel) {
            super(parcel);
            akgl akgl = new akgl();
            this.a = akgl;
            akgl.a = parcel.readInt();
            this.a.b = parcel.readInt();
            ClassLoader classLoader = ScrollAdapterView.class.getClassLoader();
            this.a.c = parcel.readBundle(classLoader);
            this.a.d = parcel.readBundle(classLoader);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a.a);
            parcel.writeInt(this.a.b);
            parcel.writeBundle(this.a.c);
            parcel.writeBundle(this.a.d);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.a = new akgl();
        }
    }

    private final View a(int i2, int i3) {
        int itemViewType = this.c.getItemViewType(i2);
        View view = this.c.getView(i2, this.F.a(itemViewType), this);
        if (view == null) {
            return null;
        }
        view.setTag(R.id.ScrollAdapterViewChild, new akgm(itemViewType));
        addViewInLayout(view, i3, view.getLayoutParams(), true);
        c(view);
        return view;
    }

    public final void d() {
        this.l = true;
        g();
    }

    private final void a(int i2, View view, View view2) {
        view.getFocusedRect(this.x);
        offsetDescendantRectToMyCoords(view, this.x);
        offsetRectIntoDescendantCoords(view2, this.x);
        view2.requestFocus(i2, this.x);
    }

    public final void a() {
        akgv akgv = this.p;
        akgv akgv2 = this.n;
        akgv.a = akgv2.a;
        akgv.b = akgv2.b;
        akgv.c = akgv2.c;
        akgv.d = akgv2.d;
        akgv.e = akgv2.e;
        this.f = -1;
        this.g = 0;
        this.l = false;
        int size = this.v.size();
        for (int i2 = 0; i2 < size; i2++) {
            akgp akgp = (akgp) this.v.get(i2);
            akgp.a();
            removeViewInLayout(akgp.c);
            this.G.a(akgp.c, akgp.b);
        }
        this.v.clear();
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            removeViewInLayout(childAt);
            a(childAt);
        }
        this.F.a((akgf) this.c);
        this.G.a(this.Q);
        this.m = -1;
        this.n.a();
        this.d = false;
    }

    public final void e() {
        scrollTo(this.i.g.d(), this.i.f.d());
    }

    public static final int b(View view) {
        return ((akgm) view.getTag(R.id.ScrollAdapterViewChild)).f;
    }

    public final int b() {
        return b(this.i.h.a(), this.i.i.a());
    }

    public final View b(int i2) {
        return getChildAt(d(i2));
    }

    public final int c(int i2) {
        return (i2 - k()) + this.f + 1;
    }

    public final void b(View view, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (view != null) {
            int b2 = b(view) - this.i.h.a();
            if (this.h != 1) {
                i3 = d(view) - this.i.i.a();
            } else {
                i3 = 0;
            }
            if (b2 == 0 && i3 == 0) {
                this.w = 0;
            } else {
                this.w = 3;
                akgx akgx = this.i;
                int i10 = akgx.d;
                if (i10 == 0) {
                    i4 = i3;
                } else {
                    i4 = b2;
                }
                if (i10 != 0) {
                    b2 = i3;
                }
                int i11 = akgx.l;
                int a2 = akgx.a(1);
                akgw akgw = akgx.g;
                akgw.a = a2;
                akgx.f.a = a2;
                akgx.c = 2;
                Scroller scroller = akgx.a;
                int a3 = akgw.a();
                int a4 = akgx.f.a();
                if (!scroller.isFinished()) {
                    int currX = (a3 + b2) - scroller.getCurrX();
                    int currY = (a4 + i4) - scroller.getCurrY();
                    i6 = currX;
                    i8 = scroller.getCurrX();
                    i7 = scroller.getCurrY();
                    i5 = currY;
                } else {
                    i6 = b2;
                    i8 = a3;
                    i7 = a4;
                    i5 = i4;
                }
                akgx.a((float) i6, (float) i5);
                int sqrt = (int) (((float) ((int) Math.sqrt((double) ((i6 * i6) + (i5 * i5))))) * 0.25f);
                if (sqrt >= 250) {
                    i9 = sqrt <= 1500 ? sqrt : 1500;
                } else {
                    i9 = 250;
                }
                scroller.startScroll(i8, i7, i6, i5, i9);
            }
            a(view, i2);
            g();
            return;
        }
        this.w = 0;
    }

    public final void c() {
        if (this.w == 4) {
            this.w = 1;
            akgx akgx = this.i;
            akgx.c = 0;
            akgx.f.k = 0.0f;
            akgx.g.k = 0.0f;
            g();
        }
    }

    public final void a(float f2, float f3) {
        akgx akgx = this.i;
        int i2 = (int) f2;
        int i3 = (int) f3;
        int i4 = akgx.j;
        if (i4 != 0) {
            int a2 = akgx.a(i4);
            akgw akgw = akgx.g;
            akgw.a = a2;
            akgw akgw2 = akgx.f;
            akgw2.a = a2;
            akgx.c = 1;
            akgx.b.fling((int) akgw.b, (int) akgw2.b, i2, i3, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            akgx.a((float) i2, (float) i3);
            this.w = 1;
            g();
        }
    }

    private static final int f(View view) {
        return ((akgm) view.getTag(R.id.ScrollAdapterViewChild)).b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:226:0x048b  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x04bd A[LOOP:10: B:237:0x04bd->B:248:0x0509, LOOP_START, PHI: r8 
      PHI: (r8v6 int) = (r8v4 int), (r8v7 int) binds: [B:236:0x04bb, B:248:0x0509] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x050e  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x051f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(boolean r41) {
        /*
            r40 = this;
            r0 = r40
            int r1 = r40.getChildCount()
            akgf r2 = r0.Q
            if (r2 != 0) goto L_0x0015
            boolean r2 = r40.m()
            if (r2 != 0) goto L_0x0015
            akgg r2 = r0.D
            if (r2 != 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            if (r1 != 0) goto L_0x0021
        L_0x0017:
            if (r41 == 0) goto L_0x0020
            int r2 = r40.getChildCount()
            if (r2 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            return
        L_0x0021:
            akgx r2 = r0.i
            akgw r2 = r2.h
            int r2 = r2.a()
            akgx r3 = r0.i
            akgw r3 = r3.i
            int r3 = r3.a()
            java.util.ArrayList r4 = r0.v
            int r4 = r4.size()
            int r5 = r40.k()
            r6 = -1
            r8 = r5
            r9 = -1
            r10 = 0
            r11 = -1
        L_0x0040:
            r12 = 1
            if (r8 >= r1) goto L_0x007d
            android.view.View r13 = r0.getChildAt(r8)
            int r14 = b((android.view.View) r13)
            int r15 = r0.d((android.view.View) r13)
            int r7 = r0.a
            if (r7 == 0) goto L_0x0058
            int r7 = r13.getWidth()
            goto L_0x005c
        L_0x0058:
            int r7 = r13.getHeight()
        L_0x005c:
            if (r14 <= r2) goto L_0x005f
            goto L_0x007a
        L_0x005f:
            int r13 = r0.h
            if (r13 != r12) goto L_0x0064
            goto L_0x006b
        L_0x0064:
            boolean r7 = r0.a((int) r3, (int) r7, (int) r15)
            if (r7 != 0) goto L_0x006b
            goto L_0x007a
        L_0x006b:
            akgg r7 = r0.D
            if (r7 == 0) goto L_0x0077
            r0.c((int) r8)
            int r10 = r7.b()
            goto L_0x0078
        L_0x0077:
        L_0x0078:
            r9 = r8
            r11 = r14
        L_0x007a:
            int r8 = r8 + 1
            goto L_0x0040
        L_0x007d:
            if (r9 == r6) goto L_0x054c
            int r2 = r0.h
            int r2 = r2 + r9
            if (r2 >= r1) goto L_0x009a
            android.view.View r1 = r0.getChildAt(r2)
            int r1 = b((android.view.View) r1)
            akgg r3 = r0.D
            if (r3 == 0) goto L_0x0098
            r0.c((int) r2)
            int r3 = r3.b()
            goto L_0x0099
        L_0x0098:
            r3 = 0
        L_0x0099:
            goto L_0x009d
        L_0x009a:
            r1 = -1
            r2 = -1
            r3 = 0
        L_0x009d:
            int r7 = r0.h
            int r7 = r9 - r7
            if (r7 < r5) goto L_0x00a4
            goto L_0x00a5
        L_0x00a4:
            r7 = -1
        L_0x00a5:
            int r5 = r0.c((int) r9)
            akgp r8 = r0.e((int) r5)
            r13 = 0
            if (r2 == r6) goto L_0x00b8
            int r14 = r0.h
            int r14 = r14 + r5
            akgp r14 = r0.e((int) r14)
            goto L_0x00b9
        L_0x00b8:
            r14 = r13
        L_0x00b9:
            if (r7 == r6) goto L_0x00c3
            int r7 = r0.h
            int r5 = r5 - r7
            akgp r13 = r0.e((int) r5)
            goto L_0x00c4
        L_0x00c3:
        L_0x00c4:
            java.util.ArrayList r5 = r0.v
            int r5 = r5.size()
            int r5 = r5 - r4
            int r9 = r9 + r5
            if (r2 == r6) goto L_0x00d0
            int r2 = r2 + r5
            goto L_0x00d1
        L_0x00d0:
        L_0x00d1:
            java.util.ArrayList r4 = r0.v
            int r4 = r4.size()
            int r5 = r40.getChildCount()
            int r7 = r5 + -1
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r9 >= r7) goto L_0x012a
            akgx r12 = r0.i
            akgw r12 = r12.h
            int r12 = r12.a()
            int r12 = r1 - r12
            float r12 = (float) r12
            int r1 = r1 - r11
            float r1 = (float) r1
            float r12 = r12 / r1
            if (r8 == 0) goto L_0x010a
            int r1 = r0.a
            if (r1 != 0) goto L_0x00fc
            android.view.View r1 = r8.c
            int r1 = r1.getMeasuredWidth()
            goto L_0x0102
        L_0x00fc:
            android.view.View r1 = r8.c
            int r1 = r1.getMeasuredHeight()
        L_0x0102:
            float r1 = (float) r1
            float r1 = r1 * r12
            int r1 = (int) r1
            r8.a(r12)
            goto L_0x010b
        L_0x010a:
            r1 = 0
        L_0x010b:
            if (r14 != 0) goto L_0x010f
            r11 = 0
            goto L_0x0149
        L_0x010f:
            int r11 = r0.a
            if (r11 != 0) goto L_0x011a
            android.view.View r11 = r14.c
            int r11 = r11.getMeasuredWidth()
            goto L_0x0120
        L_0x011a:
            android.view.View r11 = r14.c
            int r11 = r11.getMeasuredHeight()
        L_0x0120:
            float r6 = r15 - r12
            float r11 = (float) r11
            float r11 = r11 * r6
            int r11 = (int) r11
            r14.a(r6)
            goto L_0x0149
        L_0x012a:
            if (r8 != 0) goto L_0x0131
            r1 = 0
            r11 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0149
        L_0x0131:
            int r1 = r0.a
            if (r1 != 0) goto L_0x013c
            android.view.View r1 = r8.c
            int r1 = r1.getMeasuredWidth()
            goto L_0x0142
        L_0x013c:
            android.view.View r1 = r8.c
            int r1 = r1.getMeasuredHeight()
        L_0x0142:
            r8.a(r15)
            r11 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
        L_0x0149:
            int r6 = r1 + r11
            int r17 = r40.k()
            int r15 = r0.h
            int r17 = r5 - r17
            int r17 = r17 + r15
            r16 = -1
            int r17 = r17 + -1
            int r15 = r17 / r15
            r17 = r1
            boolean r1 = r0.e
            if (r1 == 0) goto L_0x016f
            akgx r1 = r0.i
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x016f
            akgf r1 = r0.Q
            if (r1 == 0) goto L_0x016f
            r1 = 1
            goto L_0x0170
        L_0x016f:
            r1 = 0
        L_0x0170:
            r18 = 2147483647(0x7fffffff, float:NaN)
            r19 = r4
            r20 = r6
            r21 = r7
            r22 = r11
            r4 = 0
            r7 = 0
            r11 = 0
            r23 = 0
            r24 = 0
        L_0x0182:
            if (r4 < r15) goto L_0x02c0
            akgx r1 = r0.i
            akgw r1 = r1.h
            float r2 = (float) r10
            float r2 = r2 * r12
            float r3 = (float) r3
            r4 = 1065353216(0x3f800000, float:1.0)
            float r15 = r4 - r12
            float r3 = r3 * r15
            float r2 = r2 + r3
            int r2 = (int) r2
            r1.o = r2
            r1.l = r6
            r1.m = r7
            r1.n = r11
            r4 = r19
            r1 = 0
        L_0x019f:
            if (r1 >= r4) goto L_0x01ea
            java.util.ArrayList r2 = r0.v
            java.lang.Object r2 = r2.get(r1)
            akgp r2 = (defpackage.akgp) r2
            if (r2 != r8) goto L_0x01ac
        L_0x01ab:
            goto L_0x01e7
        L_0x01ac:
            if (r2 == r14) goto L_0x01ab
            if (r2 == r13) goto L_0x01ab
            android.view.View r3 = r2.c
            boolean r3 = r3.hasFocus()
            if (r3 == 0) goto L_0x01c5
            int r3 = r2.a
            int r3 = r0.d((int) r3)
            android.view.View r3 = r0.getChildAt(r3)
            r3.requestFocus()
        L_0x01c5:
            r2.a()
            akgo r3 = r0.N
            android.view.View r5 = r2.c
            int r6 = r2.a
            r3.c(r5, r6)
            android.view.View r3 = r2.c
            r0.removeViewInLayout(r3)
            akgt r3 = r0.G
            android.view.View r5 = r2.c
            int r2 = r2.b
            r3.a(r5, r2)
            java.util.ArrayList r2 = r0.v
            r2.remove(r1)
            int r4 = r4 + -1
            goto L_0x01e9
        L_0x01e7:
            int r1 = r1 + 1
        L_0x01e9:
            goto L_0x019f
        L_0x01ea:
            java.util.ArrayList r1 = r0.v
            int r1 = r1.size()
            r2 = 0
        L_0x01f1:
            if (r2 >= r1) goto L_0x0258
            java.util.ArrayList r3 = r0.v
            java.lang.Object r3 = r3.get(r2)
            akgp r3 = (defpackage.akgp) r3
            if (r3 != r8) goto L_0x0200
            r4 = r23
            goto L_0x0202
        L_0x0200:
            r4 = r24
        L_0x0202:
            if (r3 != r13) goto L_0x0205
            goto L_0x0214
        L_0x0205:
            if (r3 == r14) goto L_0x0208
            goto L_0x020e
        L_0x0208:
            r5 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r6 == 0) goto L_0x0214
        L_0x020e:
            android.view.View r5 = r3.c
            r6 = 0
            r5.setVisibility(r6)
        L_0x0214:
            int r5 = r0.a
            if (r5 != 0) goto L_0x0237
            android.view.View r5 = r3.c
            boolean r5 = r5.isLayoutRequested()
            if (r5 == 0) goto L_0x0225
            android.view.View r5 = r3.c
            r0.c((android.view.View) r5)
        L_0x0225:
            android.view.View r5 = r3.c
            int r6 = r5.getMeasuredWidth()
            int r6 = r6 + r4
            android.view.View r3 = r3.c
            int r3 = r3.getMeasuredHeight()
            r7 = 0
            r5.layout(r4, r7, r6, r3)
            goto L_0x0255
        L_0x0237:
            android.view.View r5 = r3.c
            boolean r5 = r5.isLayoutRequested()
            if (r5 == 0) goto L_0x0244
            android.view.View r5 = r3.c
            r0.c((android.view.View) r5)
        L_0x0244:
            android.view.View r5 = r3.c
            int r6 = r5.getMeasuredWidth()
            android.view.View r3 = r3.c
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r4
            r7 = 0
            r5.layout(r7, r4, r6, r3)
        L_0x0255:
            int r2 = r2 + 1
            goto L_0x01f1
        L_0x0258:
            java.util.ArrayList r1 = r0.v
            int r1 = r1.size()
            r6 = 0
        L_0x025f:
            if (r6 >= r1) goto L_0x027d
            java.util.ArrayList r2 = r0.v
            java.lang.Object r2 = r2.get(r6)
            akgp r2 = (defpackage.akgp) r2
            if (r2 != r13) goto L_0x026c
            goto L_0x0274
        L_0x026c:
            if (r2 != r14) goto L_0x027a
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r4 != 0) goto L_0x027a
        L_0x0274:
            android.view.View r2 = r2.c
            r3 = 4
            r2.setVisibility(r3)
        L_0x027a:
            int r6 = r6 + 1
            goto L_0x025f
        L_0x027d:
            akgf r1 = r0.Q
            if (r1 == 0) goto L_0x02bf
            boolean r1 = r40.hasFocus()
            if (r1 == 0) goto L_0x02bf
            android.view.View r1 = r40.getFocusedChild()
            int r1 = r0.indexOfChild(r1)
            int r2 = r40.k()
            if (r1 < r2) goto L_0x02bf
            java.util.ArrayList r2 = r0.v
            int r2 = r2.size()
            r7 = 0
        L_0x029c:
            if (r7 >= r2) goto L_0x02bf
            java.util.ArrayList r3 = r0.v
            java.lang.Object r3 = r3.get(r7)
            akgp r3 = (defpackage.akgp) r3
            int r4 = r3.a
            int r4 = r0.d((int) r4)
            if (r4 == r1) goto L_0x02af
            goto L_0x02bc
        L_0x02af:
            android.view.View r4 = r3.c
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L_0x02bc
            android.view.View r3 = r3.c
            r3.requestFocus()
        L_0x02bc:
            int r7 = r7 + 1
            goto L_0x029c
        L_0x02bf:
            return
        L_0x02c0:
            int r25 = r40.k()
            r26 = r3
            int r3 = r0.h
            int r27 = r4 * r3
            r28 = r8
            int r8 = r25 + r27
            int r3 = r3 + r8
            r16 = -1
            int r3 = r3 + -1
            if (r3 >= r5) goto L_0x02d6
            goto L_0x02d8
        L_0x02d6:
            r3 = r21
        L_0x02d8:
            r25 = r5
            r27 = r13
            r5 = 0
            r13 = r8
            r39 = r18
            r18 = r10
            r10 = r39
        L_0x02e4:
            r29 = r14
            r14 = 2131427348(0x7f0b0014, float:1.847631E38)
            if (r13 > r3) goto L_0x0359
            r30 = r15
            android.view.View r15 = r0.getChildAt(r13)
            java.lang.Object r14 = r15.getTag(r14)
            akgm r14 = (defpackage.akgm) r14
            if (r1 == 0) goto L_0x031f
            r31 = r1
            int r1 = r0.a
            if (r1 != 0) goto L_0x030f
            int r1 = r15.getLeft()
            float r1 = (float) r1
            r14.e = r1
            float r32 = r15.getTranslationX()
            float r1 = r1 + r32
            r14.d = r1
            goto L_0x0321
        L_0x030f:
            int r1 = r15.getTop()
            float r1 = (float) r1
            r14.e = r1
            float r32 = r15.getTranslationY()
            float r1 = r1 + r32
            r14.d = r1
            goto L_0x0321
        L_0x031f:
            r31 = r1
        L_0x0321:
            int r1 = r0.a
            if (r1 != 0) goto L_0x032a
            int r1 = r15.getMeasuredWidth()
            goto L_0x032e
        L_0x032a:
            int r1 = r15.getMeasuredHeight()
        L_0x032e:
            int r5 = java.lang.Math.max(r5, r1)
            if (r4 == 0) goto L_0x0335
            goto L_0x0350
        L_0x0335:
            int r1 = r0.a
            if (r1 == 0) goto L_0x033e
            int r1 = r15.getTop()
            goto L_0x0342
        L_0x033e:
            int r1 = r15.getLeft()
        L_0x0342:
            akgx r15 = r0.i
            akgw r15 = r15.h
            boolean r15 = r15.j
            if (r15 == 0) goto L_0x034d
            int r14 = r14.c
            int r1 = r1 - r14
        L_0x034d:
            if (r1 >= r10) goto L_0x0350
            r10 = r1
        L_0x0350:
            int r13 = r13 + 1
            r14 = r29
            r15 = r30
            r1 = r31
            goto L_0x02e4
        L_0x0359:
            r31 = r1
            r30 = r15
            int r1 = r10 + r5
            r15 = r8
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0362:
            if (r15 > r3) goto L_0x040f
            android.view.View r14 = r0.getChildAt(r15)
            r34 = r4
            int r4 = r0.a
            if (r4 != 0) goto L_0x0373
            int r4 = r14.getMeasuredWidth()
            goto L_0x0377
        L_0x0373:
            int r4 = r14.getMeasuredHeight()
        L_0x0377:
            r35 = r11
            akgx r11 = r0.i
            int r11 = r11.a()
            if (r11 == 0) goto L_0x038c
            r36 = r7
            r7 = 2
            if (r11 == r7) goto L_0x0388
            r4 = r10
            goto L_0x0395
        L_0x0388:
            int r4 = r5 - r4
            int r4 = r4 + r10
            goto L_0x0395
        L_0x038c:
            r36 = r7
            int r7 = r5 / 2
            int r4 = r4 / 2
            int r7 = r7 - r4
            int r4 = r10 + r7
        L_0x0395:
            int r7 = r0.a
            if (r7 != 0) goto L_0x03c6
            boolean r7 = r14.isLayoutRequested()
            if (r7 == 0) goto L_0x03bb
            r0.c((android.view.View) r14)
            int r7 = r14.getTop()
            int r11 = r14.getMeasuredWidth()
            int r11 = r11 + r4
            int r33 = r14.getTop()
            int r37 = r14.getMeasuredHeight()
            r38 = r10
            int r10 = r33 + r37
            r14.layout(r4, r7, r11, r10)
            goto L_0x03ef
        L_0x03bb:
            r38 = r10
            int r7 = r14.getLeft()
            int r4 = r4 - r7
            r14.offsetLeftAndRight(r4)
            goto L_0x03ef
        L_0x03c6:
            r38 = r10
            boolean r7 = r14.isLayoutRequested()
            if (r7 == 0) goto L_0x03e7
            r0.c((android.view.View) r14)
            int r7 = r14.getLeft()
            int r10 = r14.getLeft()
            int r11 = r14.getMeasuredWidth()
            int r10 = r10 + r11
            int r11 = r14.getMeasuredHeight()
            int r11 = r11 + r4
            r14.layout(r7, r4, r10, r11)
            goto L_0x03ef
        L_0x03e7:
            int r7 = r14.getTop()
            int r4 = r4 - r7
            r14.offsetTopAndBottom(r4)
        L_0x03ef:
            boolean r4 = r40.m()
            if (r4 == 0) goto L_0x0400
            r0.c((int) r15)
            int r4 = r40.n()
            int r13 = java.lang.Math.max(r13, r4)
        L_0x0400:
            int r15 = r15 + 1
            r4 = r34
            r11 = r35
            r7 = r36
            r10 = r38
            r14 = 2131427348(0x7f0b0014, float:1.847631E38)
            goto L_0x0362
        L_0x040f:
            r34 = r4
            r36 = r7
            r35 = r11
            r4 = r8
        L_0x0416:
            if (r4 > r3) goto L_0x0433
            android.view.View r7 = r0.getChildAt(r4)
            r10 = 2131427348(0x7f0b0014, float:1.847631E38)
            java.lang.Object r7 = r7.getTag(r10)
            akgm r7 = (defpackage.akgm) r7
            r7.b = r5
            r10 = 0
            r7.c = r10
            int r11 = r0.f((int) r4)
            r7.f = r11
            int r4 = r4 + 1
            goto L_0x0416
        L_0x0433:
            r10 = 0
            if (r8 <= r9) goto L_0x0438
            r4 = 0
            goto L_0x043d
        L_0x0438:
            if (r9 > r3) goto L_0x043c
            r4 = 1
            goto L_0x043d
        L_0x043c:
            r4 = 0
        L_0x043d:
            if (r8 <= r2) goto L_0x0441
            r7 = 0
            goto L_0x0446
        L_0x0441:
            if (r2 > r3) goto L_0x0445
            r7 = 1
            goto L_0x0446
        L_0x0445:
            r7 = 0
        L_0x0446:
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 != r11) goto L_0x044c
            goto L_0x04b9
        L_0x044c:
            if (r4 == 0) goto L_0x0454
            int r13 = r13 - r5
            float r5 = (float) r13
            float r5 = r5 * r12
            int r5 = (int) r5
            goto L_0x0461
        L_0x0454:
            if (r7 == 0) goto L_0x0460
            int r13 = r13 - r5
            float r5 = (float) r13
            r11 = 1065353216(0x3f800000, float:1.0)
            float r15 = r11 - r12
            float r5 = r5 * r15
            int r5 = (int) r5
            goto L_0x0461
        L_0x0460:
            r5 = 0
        L_0x0461:
            if (r5 <= 0) goto L_0x04b8
            akgx r11 = r0.i
            akgw r13 = r11.h
            boolean r13 = r13.j
            if (r13 == 0) goto L_0x047c
            int r1 = r1 + r5
            int r6 = r6 + r5
            int r11 = r11.a()
            if (r11 == 0) goto L_0x047c
            r13 = 2
            if (r11 == r13) goto L_0x0479
            r11 = r6
            r6 = 0
            goto L_0x0483
        L_0x0479:
            r11 = r6
            r6 = r5
            goto L_0x0483
        L_0x047c:
            int r11 = r5 >> 1
            r39 = r11
            r11 = r6
            r6 = r39
        L_0x0483:
            int r13 = r36 + r6
            int r5 = r5 - r6
            int r5 = r35 + r5
            r14 = r8
        L_0x0489:
            if (r14 > r3) goto L_0x04b3
            android.view.View r15 = r0.getChildAt(r14)
            akgx r10 = r0.i
            akgw r10 = r10.h
            boolean r10 = r10.j
            if (r10 != 0) goto L_0x0498
            goto L_0x04af
        L_0x0498:
            int r10 = r0.a
            if (r10 != 0) goto L_0x04a0
            r15.offsetLeftAndRight(r6)
            goto L_0x04a3
        L_0x04a0:
            r15.offsetTopAndBottom(r6)
        L_0x04a3:
            r10 = 2131427348(0x7f0b0014, float:1.847631E38)
            java.lang.Object r15 = r15.getTag(r10)
            akgm r15 = (defpackage.akgm) r15
            r15.c = r6
        L_0x04af:
            int r14 = r14 + 1
            r10 = 0
            goto L_0x0489
        L_0x04b3:
            r6 = r11
            r36 = r13
            r11 = r5
            goto L_0x04bb
        L_0x04b8:
        L_0x04b9:
            r11 = r35
        L_0x04bb:
            if (r31 == 0) goto L_0x050c
        L_0x04bd:
            if (r8 > r3) goto L_0x050c
            android.view.View r5 = r0.getChildAt(r8)
            r10 = 2131427348(0x7f0b0014, float:1.847631E38)
            java.lang.Object r13 = r5.getTag(r10)
            akgm r13 = (defpackage.akgm) r13
            int r14 = r0.a
            if (r14 == 0) goto L_0x04d5
            int r14 = r5.getTop()
            goto L_0x04d9
        L_0x04d5:
            int r14 = r5.getLeft()
        L_0x04d9:
            float r14 = (float) r14
            float r15 = r13.e
            int r15 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r15 != 0) goto L_0x04e1
            goto L_0x0509
        L_0x04e1:
            int r15 = r0.a
            r10 = 0
            if (r15 != 0) goto L_0x04f8
            float r13 = r13.d
            float r13 = r13 - r14
            r5.setTranslationX(r13)
            android.view.ViewPropertyAnimator r5 = r5.animate()
            android.view.ViewPropertyAnimator r5 = r5.translationX(r10)
            r5.start()
            goto L_0x0509
        L_0x04f8:
            float r13 = r13.d
            float r13 = r13 - r14
            r5.setTranslationY(r13)
            android.view.ViewPropertyAnimator r5 = r5.animate()
            android.view.ViewPropertyAnimator r5 = r5.translationY(r10)
            r5.start()
        L_0x0509:
            int r8 = r8 + 1
            goto L_0x04bd
        L_0x050c:
            if (r4 == 0) goto L_0x051f
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r4 != 0) goto L_0x0517
            r3 = r17
            goto L_0x0518
        L_0x0517:
            r3 = 0
        L_0x0518:
            int r3 = r3 + r1
            r23 = r1
            r1 = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0531
        L_0x051f:
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r7 != 0) goto L_0x0524
            goto L_0x0531
        L_0x0524:
            int r4 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x052b
            r4 = r20
            goto L_0x052d
        L_0x052b:
            r4 = r22
        L_0x052d:
            int r4 = r4 + r1
            r24 = r1
            r1 = r4
        L_0x0531:
            int r4 = r0.H
            int r1 = r1 + r4
            int r4 = r34 + 1
            r10 = r18
            r5 = r25
            r3 = r26
            r13 = r27
            r8 = r28
            r14 = r29
            r15 = r30
            r7 = r36
            r18 = r1
            r1 = r31
            goto L_0x0182
        L_0x054c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.pano.widget.ScrollAdapterView.c(boolean):void");
    }

    public final void f() {
        int i2;
        if (this.ae != null) {
            int childCount = getChildCount();
            for (int k2 = k(); k2 < childCount; k2++) {
                View childAt = getChildAt(k2);
                akgy akgy = this.ae;
                int b2 = b(childAt) - this.i.h.a();
                if (this.h != 1) {
                    i2 = d(childAt) - this.i.i.a();
                } else {
                    i2 = 0;
                }
                if (akgy.b != null || akgy.a != null) {
                    int abs = Math.abs(b2) + Math.abs(i2);
                    if (b2 < 0) {
                        akgy.a(abs, akgy.b, childAt);
                    } else {
                        akgy.a(abs, akgy.a, childAt);
                    }
                }
            }
        }
    }

    public final void a(int i2, boolean z2) {
        akge akge;
        if (i2 >= 0 && (akge = this.c) != null && i2 < akge.getCount() && this.c.isEnabled(i2)) {
            int d2 = d(i2);
            if (this.l || d2 < k() || d2 >= getChildCount()) {
                this.o = i2;
                d();
                return;
            }
            View childAt = getChildAt(d2);
            int b2 = b(childAt);
            int d3 = d(childAt);
            int f2 = (int) (((float) f(childAt)) * 0.0f);
            if (this.a == 0) {
                this.i.a(b2 + f2, d3);
            } else {
                this.i.a(d3, b2 + f2);
            }
            a(childAt, 0);
            e();
            f();
            if (z2) {
                c(false);
                j();
                i();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("invalid selection index = ");
        sb.append(i2);
        Log.w("ScrollAdapterView", sb.toString());
    }

    public final boolean b(boolean z2) {
        int i2;
        boolean z3;
        if (this.g >= this.c.getCount()) {
            return false;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        if (getChildCount() - k() > 0) {
            int childCount = getChildCount() - 1;
            int c2 = childCount - (c(childCount) % this.h);
            boolean z4 = false;
            while (true) {
                if (c2 >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(c2);
                akgp a2 = a(this.v, c(c2));
                if (a2 == null) {
                    if (this.a != 0) {
                        if (!z4) {
                            paddingTop = childAt.getBottom();
                        } else if (childAt.getBottom() > paddingTop) {
                            paddingTop = childAt.getBottom();
                        }
                    } else if (!z4) {
                        paddingLeft = childAt.getRight();
                    } else if (childAt.getRight() > paddingLeft) {
                        paddingLeft = childAt.getRight();
                    }
                    c2++;
                    z4 = true;
                } else if (this.a == 0) {
                    paddingLeft = a2.c.getRight();
                } else {
                    paddingTop = a2.c.getBottom();
                }
            }
            if (this.a == 0) {
                paddingLeft += this.H;
                if (paddingLeft - getScrollX() >= getWidth()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i2 = getPaddingTop();
            } else {
                int i3 = paddingTop + this.H;
                int i4 = i3;
                z3 = i3 - getScrollY() >= getHeight();
                paddingLeft = getPaddingLeft();
                i2 = i4;
            }
            if (z3 && z2) {
                return false;
            }
            paddingTop = i2;
        }
        return a(paddingLeft, paddingTop, true, true);
    }

    public final void a(akgs akgs) {
        if (!this.M.contains(akgs)) {
            this.M.add(akgs);
        }
    }

    public final void a(View view) {
        akgm akgm = (akgm) view.getTag(R.id.ScrollAdapterViewChild);
        if (akgm != null) {
            this.F.a(view, akgm.a);
        }
    }

    public final void a(View view, int i2) {
        if (view != getSelectedView()) {
            this.m = c(indexOfChild(view));
            View findFocus = findFocus();
            if (findFocus != null) {
                if (i2 == 0) {
                    view.requestFocus();
                } else {
                    a(i2, findFocus, view);
                }
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = getOnItemSelectedListener();
            if (onItemSelectedListener != null) {
                onItemSelectedListener.onItemSelected(this, getSelectedView(), this.m, getSelectedItemId());
            }
            sendAccessibilityEvent(4);
        }
    }

    public final boolean a(int i2) {
        if (getChildAt(i2).hasFocus()) {
            return true;
        }
        akgp a2 = a(this.v, c(i2));
        if (a2 == null || !a2.c.hasFocus()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01af A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a7 A[LOOP:2: B:52:0x0097->B:57:0x00a7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00b4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r9, int r10, boolean r11) {
        /*
            r8 = this;
            android.view.View r0 = r8.getFocusedChild()
            r1 = 0
            if (r0 == 0) goto L_0x002a
            java.util.ArrayList r2 = r8.v
            int r2 = r2.size()
            r3 = 0
        L_0x000e:
            if (r3 >= r2) goto L_0x002a
            java.util.ArrayList r4 = r8.v
            java.lang.Object r4 = r4.get(r3)
            akgp r4 = (defpackage.akgp) r4
            android.view.View r5 = r4.c
            if (r5 != r0) goto L_0x0027
            int r2 = r4.a
            int r2 = r8.d((int) r2)
            android.view.View r2 = r8.getChildAt(r2)
            goto L_0x002c
        L_0x0027:
            int r3 = r3 + 1
            goto L_0x000e
        L_0x002a:
            r2 = r0
        L_0x002c:
            android.view.View r3 = r8.findFocus()
            r4 = 1
            if (r0 == r2) goto L_0x0034
            goto L_0x0054
        L_0x0034:
            if (r3 == 0) goto L_0x0054
            if (r11 != 0) goto L_0x0054
            android.view.View r5 = r3.focusSearch(r9)
            if (r5 == 0) goto L_0x0054
            if (r5 == r3) goto L_0x0054
            r6 = r5
        L_0x0041:
            if (r6 == 0) goto L_0x0054
            android.view.ViewParent r6 = r6.getParent()
            if (r6 == r0) goto L_0x0050
            boolean r7 = r6 instanceof android.view.View
            if (r7 == 0) goto L_0x0054
            android.view.View r6 = (android.view.View) r6
            goto L_0x0041
        L_0x0050:
            r8.a((int) r9, (android.view.View) r3, (android.view.View) r5)
            return r4
        L_0x0054:
            r3 = 130(0x82, float:1.82E-43)
            r5 = 66
            if (r9 != r5) goto L_0x005c
            r6 = 1
            goto L_0x0061
        L_0x005c:
            if (r9 != r3) goto L_0x0060
            r6 = 1
            goto L_0x0061
        L_0x0060:
            r6 = 0
        L_0x0061:
            if (r9 == r5) goto L_0x0074
            r5 = 17
            if (r9 != r5) goto L_0x0068
            goto L_0x0074
        L_0x0068:
            if (r9 == r3) goto L_0x006e
            r3 = 33
            if (r9 != r3) goto L_0x007a
        L_0x006e:
            int r3 = r8.a
            if (r3 != 0) goto L_0x007a
            r3 = 1
            goto L_0x007b
        L_0x0074:
            int r3 = r8.a
            if (r3 != r4) goto L_0x007a
            r3 = 1
            goto L_0x007b
        L_0x007a:
            r3 = 0
        L_0x007b:
            r5 = 0
            if (r0 != r2) goto L_0x007f
            goto L_0x00b5
        L_0x007f:
            if (r11 != 0) goto L_0x00b5
            boolean r11 = r0 instanceof android.view.ViewGroup
            if (r11 == 0) goto L_0x0095
            android.view.FocusFinder r11 = android.view.FocusFinder.getInstance()
            r2 = r0
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r7 = r8.findFocus()
            android.view.View r11 = r11.findNextFocus(r2, r7, r9)
            goto L_0x0096
        L_0x0095:
            r11 = r5
        L_0x0096:
            r2 = r11
        L_0x0097:
            if (r2 == 0) goto L_0x00ae
            android.view.ViewParent r7 = r2.getParent()
            if (r7 == r8) goto L_0x00ae
            android.view.ViewParent r7 = r2.getParent()
            boolean r7 = r7 instanceof android.view.View
            if (r7 == 0) goto L_0x00ae
            android.view.ViewParent r2 = r2.getParent()
            android.view.View r2 = (android.view.View) r2
            goto L_0x0097
        L_0x00ae:
            if (r2 != 0) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r11 = r2
        L_0x00b2:
            if (r11 != r0) goto L_0x00b5
            return r1
        L_0x00b5:
            int r11 = r8.m
            int r11 = r8.d((int) r11)
            if (r11 < 0) goto L_0x01af
            if (r3 != 0) goto L_0x016b
            int r11 = r8.c((int) r11)
            int r10 = r10 + r4
            r0 = r11
        L_0x00c5:
            if (r10 <= 0) goto L_0x011a
            if (r6 != 0) goto L_0x00ce
            int r2 = r8.h
            int r2 = r0 - r2
            goto L_0x00d1
        L_0x00ce:
            int r2 = r8.h
            int r2 = r2 + r0
        L_0x00d1:
            if (r6 == 0) goto L_0x00dc
            akge r3 = r8.c
            int r3 = r3.getCount()
            if (r2 < r3) goto L_0x00dc
            goto L_0x00e1
        L_0x00dc:
            if (r6 == 0) goto L_0x00df
            goto L_0x010e
        L_0x00df:
            if (r2 >= 0) goto L_0x010e
        L_0x00e1:
            if (r0 == r11) goto L_0x00eb
            akge r10 = r8.c
            boolean r10 = r10.isEnabled(r0)
            if (r10 != 0) goto L_0x011a
        L_0x00eb:
            boolean r9 = r8.hasFocus()
            if (r9 == 0) goto L_0x0108
            boolean r9 = r8.S
            if (r9 == 0) goto L_0x0108
            int r9 = r8.d((int) r0)
            android.view.View r9 = r8.getChildAt(r9)
            if (r9 == 0) goto L_0x0108
            boolean r10 = r9.hasFocus()
            if (r10 != 0) goto L_0x0108
            r9.requestFocus()
        L_0x0108:
            boolean r9 = r8.S
            if (r9 != 0) goto L_0x010d
            return r4
        L_0x010d:
            return r1
        L_0x010e:
            akge r0 = r8.c
            boolean r0 = r0.isEnabled(r2)
            if (r0 == 0) goto L_0x0118
            int r10 = r10 + -1
        L_0x0118:
            r0 = r2
            goto L_0x00c5
        L_0x011a:
            if (r6 == 0) goto L_0x0144
        L_0x011c:
            int r10 = r8.getChildCount()
            int r10 = r10 + -1
            int r10 = r8.c((int) r10)
            if (r0 <= r10) goto L_0x012f
            boolean r10 = r8.b((boolean) r1)
            if (r10 != 0) goto L_0x011c
            goto L_0x0137
        L_0x012f:
            int r10 = r8.d((int) r0)
            android.view.View r5 = r8.getChildAt(r10)
        L_0x0137:
            if (r5 != 0) goto L_0x0167
            int r10 = r8.getChildCount()
            int r10 = r10 + -1
            android.view.View r5 = r8.getChildAt(r10)
            goto L_0x0167
        L_0x0144:
            int r10 = r8.k()
            int r10 = r8.c((int) r10)
            if (r0 >= r10) goto L_0x0155
            boolean r10 = r8.a((boolean) r1)
            if (r10 != 0) goto L_0x0144
            goto L_0x015d
        L_0x0155:
            int r10 = r8.d((int) r0)
            android.view.View r5 = r8.getChildAt(r10)
        L_0x015d:
            if (r5 != 0) goto L_0x0167
            int r10 = r8.k()
            android.view.View r5 = r8.getChildAt(r10)
        L_0x0167:
            if (r5 == 0) goto L_0x016a
            goto L_0x019a
        L_0x016a:
            return r4
        L_0x016b:
            if (r6 != 0) goto L_0x0183
            int r10 = r11 + -1
            int r0 = r8.k()
            if (r10 < r0) goto L_0x01a9
            int r11 = r8.c((int) r11)
            int r0 = r8.h
            int r11 = r11 % r0
            if (r11 == 0) goto L_0x01a9
            android.view.View r5 = r8.getChildAt(r10)
            goto L_0x019a
        L_0x0183:
            int r10 = r11 + 1
            int r0 = r8.getChildCount()
            if (r10 >= r0) goto L_0x01a9
            int r11 = r8.c((int) r11)
            int r0 = r8.h
            int r11 = r11 % r0
            int r0 = r0 + -1
            if (r11 == r0) goto L_0x01a9
            android.view.View r5 = r8.getChildAt(r10)
        L_0x019a:
            r8.b((android.view.View) r5, (int) r9)
            boolean r10 = r8.ac
            if (r10 == 0) goto L_0x01a8
            int r9 = android.view.SoundEffectConstants.getContantForFocusDirection(r9)
            r8.playSoundEffect(r9)
        L_0x01a8:
            return r4
        L_0x01a9:
            boolean r9 = r8.R
            if (r9 != 0) goto L_0x01ae
            return r4
        L_0x01ae:
            return r1
        L_0x01af:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.pano.widget.ScrollAdapterView.a(int, int, boolean):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r18, int r19, boolean r20, boolean r21) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r17.getChildCount()
            if (r20 == 0) goto L_0x0018
            int r2 = r0.h
            akge r3 = r0.c
            int r3 = r3.getCount()
            int r4 = r0.g
            int r3 = r3 - r4
            int r2 = java.lang.Math.min(r2, r3)
            goto L_0x001a
        L_0x0018:
            int r2 = r0.h
        L_0x001a:
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x001d:
            r7 = -1
            if (r4 < r2) goto L_0x0148
            if (r20 != 0) goto L_0x0034
            int r1 = r17.k()
            int r4 = r0.a
            if (r4 == 0) goto L_0x0031
            int r4 = r19 - r5
            r6 = r1
            r1 = r4
            r4 = r18
            goto L_0x0039
        L_0x0031:
            int r4 = r18 - r5
            goto L_0x0036
        L_0x0034:
            r4 = r18
        L_0x0036:
            r6 = r1
            r1 = r19
        L_0x0039:
            r8 = 0
        L_0x003a:
            r9 = 1
            if (r8 >= r2) goto L_0x0147
            int r10 = r6 + r8
            android.view.View r11 = r0.getChildAt(r10)
            r12 = 2131427348(0x7f0b0014, float:1.847631E38)
            java.lang.Object r12 = r11.getTag(r12)
            akgm r12 = (defpackage.akgm) r12
            r12.b = r5
            int r13 = r0.a
            r14 = 2
            if (r13 != 0) goto L_0x00a2
            akgx r13 = r0.i
            int r13 = r13.a()
            if (r13 == 0) goto L_0x007f
            if (r13 == r9) goto L_0x0071
            if (r13 == r14) goto L_0x0060
            goto L_0x0099
        L_0x0060:
            int r13 = r4 + r5
            int r14 = r11.getMeasuredWidth()
            int r14 = r13 - r14
            int r15 = r11.getMeasuredHeight()
            int r15 = r15 + r1
            r11.layout(r14, r1, r13, r15)
            goto L_0x0099
        L_0x0071:
            int r13 = r11.getMeasuredWidth()
            int r13 = r13 + r4
            int r14 = r11.getMeasuredHeight()
            int r14 = r14 + r1
            r11.layout(r4, r1, r13, r14)
            goto L_0x0099
        L_0x007f:
            int r13 = r5 / 2
            int r13 = r13 + r4
            int r15 = r11.getMeasuredWidth()
            int r15 = r15 / r14
            int r15 = r13 - r15
            int r16 = r11.getMeasuredWidth()
            int r16 = r16 / 2
            int r13 = r13 + r16
            int r14 = r11.getMeasuredHeight()
            int r14 = r14 + r1
            r11.layout(r15, r1, r13, r14)
        L_0x0099:
            int r13 = r11.getMeasuredHeight()
            int r1 = r1 + r13
            int r13 = r0.H
            int r1 = r1 + r13
            goto L_0x00f1
        L_0x00a2:
            akgx r13 = r0.i
            int r13 = r13.a()
            if (r13 == 0) goto L_0x00ce
            if (r13 == r9) goto L_0x00c0
            if (r13 == r14) goto L_0x00af
            goto L_0x00e9
        L_0x00af:
            int r13 = r1 + r5
            int r14 = r11.getMeasuredHeight()
            int r14 = r13 - r14
            int r15 = r17.getMeasuredWidth()
            int r15 = r15 + r4
            r11.layout(r4, r14, r15, r13)
            goto L_0x00e9
        L_0x00c0:
            int r13 = r11.getMeasuredWidth()
            int r13 = r13 + r4
            int r14 = r11.getMeasuredHeight()
            int r14 = r14 + r1
            r11.layout(r4, r1, r13, r14)
            goto L_0x00e9
        L_0x00ce:
            int r13 = r5 / 2
            int r13 = r13 + r1
            int r15 = r11.getMeasuredHeight()
            int r15 = r15 / r14
            int r15 = r13 - r15
            int r16 = r11.getMeasuredWidth()
            int r3 = r4 + r16
            int r16 = r11.getMeasuredHeight()
            int r16 = r16 / 2
            int r13 = r13 + r16
            r11.layout(r4, r15, r3, r13)
        L_0x00e9:
            int r3 = r11.getMeasuredWidth()
            int r4 = r4 + r3
            int r3 = r0.H
            int r4 = r4 + r3
        L_0x00f1:
            if (r20 != 0) goto L_0x0100
            akgn r3 = r0.k
            int r13 = r0.f
            r3.a(r11, r13)
            int r3 = r0.f
            int r3 = r3 + r7
            r0.f = r3
            goto L_0x010c
        L_0x0100:
            akgn r3 = r0.k
            int r13 = r0.g
            r3.a(r11, r13)
            int r3 = r0.g
            int r3 = r3 + r9
            r0.g = r3
        L_0x010c:
            int r3 = r0.f((int) r10)
            r12.f = r3
            if (r21 != 0) goto L_0x0115
        L_0x0114:
            goto L_0x0143
        L_0x0115:
            if (r20 == 0) goto L_0x0114
            akge r3 = r0.c
            int r10 = r0.g
            int r10 = r10 + r7
            boolean r3 = r3.isEnabled(r10)
            if (r3 == 0) goto L_0x0143
            boolean r3 = r0.d
            if (r3 != 0) goto L_0x0143
            int r3 = b((android.view.View) r11)
            int r10 = r0.d((android.view.View) r11)
            int r12 = r0.a
            if (r12 != 0) goto L_0x0138
            akgx r12 = r0.i
            r12.a((int) r3, (int) r10)
            goto L_0x013d
        L_0x0138:
            akgx r12 = r0.i
            r12.a((int) r10, (int) r3)
        L_0x013d:
            r0.d = r9
            r3 = 0
            r0.a((android.view.View) r11, (int) r3)
        L_0x0143:
            int r8 = r8 + 1
            goto L_0x003a
        L_0x0147:
            return r9
        L_0x0148:
            if (r20 != 0) goto L_0x0156
            int r3 = r0.f
            int r3 = r3 - r4
            int r7 = r17.k()
            android.view.View r3 = r0.a((int) r3, (int) r7)
            goto L_0x015d
        L_0x0156:
            int r3 = r0.g
            int r3 = r3 + r4
            android.view.View r3 = r0.a((int) r3, (int) r7)
        L_0x015d:
            if (r3 == 0) goto L_0x017c
            int r7 = r0.a
            if (r7 != 0) goto L_0x0168
            int r3 = r3.getMeasuredWidth()
            goto L_0x016c
        L_0x0168:
            int r3 = r3.getMeasuredHeight()
        L_0x016c:
            int r5 = java.lang.Math.max(r5, r3)
            int r3 = r17.n()
            int r6 = java.lang.Math.max(r6, r3)
            int r4 = r4 + 1
            goto L_0x001d
        L_0x017c:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.pano.widget.ScrollAdapterView.a(int, int, boolean, boolean):boolean");
    }

    public final boolean a(akhd akhd) {
        int i2;
        float f2;
        float f3;
        int i3 = akhd.f;
        if (i3 == 3) {
            akhb akhb = (akhb) akhd;
            int i4 = akhb.c;
            View childAt = getChildAt(k());
            if (childAt != null) {
                if (i4 == 17 || i4 == 66) {
                    if (this.a == 0) {
                        double floor = Math.floor((double) (((float) this.i.g.c()) / ((float) childAt.getWidth())));
                        long j2 = akhb.e;
                        int i5 = B[0] * ((int) floor);
                        i2 = i4 == 17 ? i5 + akhb.a : i5 - akhb.a;
                    } else {
                        i2 = 0;
                    }
                } else if (this.a == 1) {
                    double floor2 = Math.floor((double) (((float) this.i.f.c()) / ((float) childAt.getHeight())));
                    long j3 = akhb.e;
                    int i6 = B[0] * ((int) floor2);
                    i2 = i4 == 33 ? i6 + akhb.b : i6 - akhb.b;
                } else {
                    i2 = 0;
                }
                if (i2 == 0) {
                    i2 = 1;
                }
            } else {
                i2 = 0;
            }
            if (a(akhb.c, i2 - 1, true)) {
                return true;
            }
        } else if (i3 != 4) {
            if (i3 == 10) {
                c();
            }
        } else if (this.ab) {
            akhf akhf = (akhf) akhd;
            if (this.i.b() || this.w == 4) {
                if (this.h > 1) {
                    if (Math.abs(akhf.b) > Math.abs(akhf.a)) {
                        f3 = akhf.b * ((float) this.s) * 0.05f;
                        f2 = 0.0f;
                    } else {
                        f2 = akhf.a * ((float) this.r) * 0.05f;
                        f3 = 0.0f;
                    }
                } else if (this.a == 0) {
                    f2 = Math.abs(akhf.b) <= Math.abs(akhf.a) ? akhf.a * ((float) this.r) * 0.05f : 0.0f;
                    f3 = 0.0f;
                } else {
                    f3 = Math.abs(akhf.a) <= Math.abs(akhf.b) ? akhf.b * ((float) this.s) * 0.05f : 0.0f;
                    f2 = 0.0f;
                }
                if (!(f2 == 0.0f && f3 == 0.0f)) {
                    if (this.w == 4) {
                        if (this.i.b(f2 - this.W, f3 - this.aa)) {
                            g();
                        }
                        this.W = f2;
                        this.aa = f3;
                    } else {
                        this.W = f2;
                        this.aa = f3;
                        this.w = 4;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean a(boolean z2) {
        int i2;
        int i3;
        boolean z3;
        if (this.f < 0 || getChildCount() - k() <= 0) {
            return false;
        }
        int k2 = k();
        int min = Math.min(getChildCount(), this.h + k2);
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MAX_VALUE;
        while (k2 < min) {
            View childAt = getChildAt(k2);
            if (this.a == 0) {
                if (childAt.getLeft() < i5) {
                    i5 = childAt.getLeft();
                }
            } else if (childAt.getTop() < i4) {
                i4 = childAt.getTop();
            }
            k2++;
        }
        if (this.a == 0) {
            i2 = i5 - this.H;
            if (i2 - getScrollX() <= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            i3 = getPaddingTop();
        } else {
            i3 = i4 - this.H;
            z3 = i3 - getScrollY() <= 0;
            i2 = getPaddingLeft();
        }
        if (z3 && z2) {
            return false;
        }
        return a(i2, i3, false, true);
    }
}
