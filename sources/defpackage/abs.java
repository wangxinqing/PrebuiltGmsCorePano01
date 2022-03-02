package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import java.lang.reflect.Method;

/* renamed from: abs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class abs implements xl {
    private static Method a;
    private static Method b;
    private static Method c;
    private final Rect A;
    private Rect B;
    private Context d;
    public aan e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    int k;
    public View l;
    public AdapterView.OnItemClickListener m;
    final abr n;
    final Handler o;
    public boolean p;
    public PopupWindow q;
    private ListAdapter r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private DataSetObserver w;
    private final abq x;
    private final abp y;
    private final abn z;

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException e2) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                c = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException e3) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException e4) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public abs(Context context) {
        this(context, (AttributeSet) null, R.attr.listPopupWindowStyle);
    }

    public aan a(Context context, boolean z2) {
        return new aan(context, z2);
    }

    public final void a(int i2) {
        this.t = i2;
        this.v = true;
    }

    public final void ar() {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (this.e == null) {
            Context context = this.d;
            new abl(this);
            aan a2 = a(context, !this.p);
            this.e = a2;
            a2.setAdapter(this.r);
            this.e.setOnItemClickListener(this.m);
            this.e.setFocusable(true);
            this.e.setFocusableInTouchMode(true);
            this.e.setOnItemSelectedListener(new abm(this));
            this.e.setOnScrollListener(this.y);
            this.q.setContentView(this.e);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.q.getContentView();
        }
        Drawable background = this.q.getBackground();
        int i9 = 0;
        if (background != null) {
            background.getPadding(this.A);
            i2 = this.A.top + this.A.bottom;
            if (!this.v) {
                this.t = -this.A.top;
            }
        } else {
            this.A.setEmpty();
            i2 = 0;
        }
        if (this.q.getInputMethodMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        View view = this.l;
        int i10 = this.t;
        if (Build.VERSION.SDK_INT > 23) {
            i3 = this.q.getMaxAvailableHeight(view, i10, z2);
        } else {
            Method method = b;
            if (method != null) {
                try {
                    i3 = ((Integer) method.invoke(this.q, new Object[]{view, Integer.valueOf(i10), Boolean.valueOf(z2)})).intValue();
                } catch (Exception e2) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            i3 = this.q.getMaxAvailableHeight(view, i10);
        }
        if (this.s != -1) {
            int i11 = this.f;
            if (i11 == -2) {
                i7 = View.MeasureSpec.makeMeasureSpec(this.d.getResources().getDisplayMetrics().widthPixels - (this.A.left + this.A.right), Integer.MIN_VALUE);
            } else if (i11 != -1) {
                i7 = View.MeasureSpec.makeMeasureSpec(i11, JGCastService.FLAG_PRIVATE_DISPLAY);
            } else {
                i7 = View.MeasureSpec.makeMeasureSpec(this.d.getResources().getDisplayMetrics().widthPixels - (this.A.left + this.A.right), JGCastService.FLAG_PRIVATE_DISPLAY);
            }
            int a3 = this.e.a(i7, i3);
            if (a3 > 0) {
                i8 = i2 + this.e.getPaddingTop() + this.e.getPaddingBottom();
            } else {
                i8 = 0;
            }
            i4 = a3 + i8;
        } else {
            i4 = i3 + i2;
        }
        boolean j2 = j();
        rw.a(this.q, this.u);
        if (!this.q.isShowing()) {
            int i12 = this.f;
            if (i12 == -1) {
                i12 = -1;
            } else if (i12 == -2) {
                i12 = this.l.getWidth();
            }
            int i13 = this.s;
            if (i13 == -1) {
                i4 = -1;
            } else if (i13 != -2) {
                i4 = i13;
            }
            this.q.setWidth(i12);
            this.q.setHeight(i4);
            if (Build.VERSION.SDK_INT > 28) {
                this.q.setIsClippedToScreen(true);
            } else {
                Method method2 = a;
                if (method2 != null) {
                    try {
                        method2.invoke(this.q, new Object[]{true});
                    } catch (Exception e3) {
                        Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                    }
                }
            }
            this.q.setOutsideTouchable(true);
            this.q.setTouchInterceptor(this.x);
            if (this.i) {
                rw.a(this.q, this.h);
            }
            if (Build.VERSION.SDK_INT > 28) {
                this.q.setEpicenterBounds(this.B);
            } else {
                Method method3 = c;
                if (method3 != null) {
                    try {
                        method3.invoke(this.q, new Object[]{this.B});
                    } catch (Exception e4) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e4);
                    }
                }
            }
            PopupWindow popupWindow = this.q;
            View view2 = this.l;
            int i14 = this.g;
            int i15 = this.t;
            int i16 = this.j;
            int i17 = Build.VERSION.SDK_INT;
            popupWindow.showAsDropDown(view2, i14, i15, i16);
            this.e.setSelection(-1);
            if (!this.p || this.e.isInTouchMode()) {
                i();
            }
            if (!this.p) {
                this.o.post(this.z);
            }
        } else if (qb.D(this.l)) {
            int i18 = this.f;
            if (i18 == -1) {
                i18 = -1;
            } else if (i18 == -2) {
                i18 = this.l.getWidth();
            }
            int i19 = this.s;
            if (i19 == -1) {
                if (!j2) {
                    i4 = -1;
                }
                if (!j2) {
                    PopupWindow popupWindow2 = this.q;
                    if (this.f == -1) {
                        i9 = -1;
                    }
                    popupWindow2.setWidth(i9);
                    this.q.setHeight(-1);
                } else {
                    PopupWindow popupWindow3 = this.q;
                    if (this.f == -1) {
                        i6 = -1;
                    } else {
                        i6 = 0;
                    }
                    popupWindow3.setWidth(i6);
                    this.q.setHeight(0);
                }
            } else if (i19 != -2) {
                i4 = i19;
            }
            this.q.setOutsideTouchable(true);
            PopupWindow popupWindow4 = this.q;
            View view3 = this.l;
            int i20 = this.g;
            int i21 = this.t;
            if (i18 < 0) {
                i5 = -1;
            } else {
                i5 = i18;
            }
            popupWindow4.update(view3, i20, i21, i5, i4 < 0 ? -1 : i4);
        }
    }

    public final Drawable b() {
        return this.q.getBackground();
    }

    public final void b(int i2) {
        this.g = i2;
    }

    public final int c() {
        if (this.v) {
            return this.t;
        }
        return 0;
    }

    public final void d() {
        this.q.dismiss();
        this.q.setContentView((View) null);
        this.e = null;
        this.o.removeCallbacks(this.n);
    }

    public final boolean e() {
        return this.q.isShowing();
    }

    public final int f() {
        return this.g;
    }

    public final ListView g() {
        return this.e;
    }

    public final void i() {
        aan aan = this.e;
        if (aan != null) {
            aan.a = true;
            aan.requestLayout();
        }
    }

    public final boolean j() {
        return this.q.getInputMethodMode() == 2;
    }

    public final void k() {
        this.q.setInputMethodMode(2);
    }

    public final void l() {
        this.p = true;
        this.q.setFocusable(true);
    }

    public abs(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, (byte[]) null);
    }

    public abs(Context context, AttributeSet attributeSet, int i2, byte[] bArr) {
        this.s = -2;
        this.f = -2;
        this.u = 1002;
        this.j = 0;
        this.k = Integer.MAX_VALUE;
        this.n = new abr(this);
        this.x = new abq(this);
        this.y = new abp(this);
        this.z = new abn(this);
        this.A = new Rect();
        this.d = context;
        this.o = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uh.p, i2, 0);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.t = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.v = true;
        }
        obtainStyledAttributes.recycle();
        yz yzVar = new yz(context, attributeSet, i2);
        this.q = yzVar;
        yzVar.setInputMethodMode(1);
    }

    public final void a(Rect rect) {
        this.B = rect != null ? new Rect(rect) : null;
    }

    public final void a(Drawable drawable) {
        this.q.setBackgroundDrawable(drawable);
    }

    public final void d(int i2) {
        Drawable background = this.q.getBackground();
        if (background != null) {
            background.getPadding(this.A);
            this.f = this.A.left + this.A.right + i2;
            return;
        }
        this.f = i2;
    }

    public void a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.w;
        if (dataSetObserver == null) {
            this.w = new abo(this);
        } else {
            ListAdapter listAdapter2 = this.r;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.r = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.w);
        }
        aan aan = this.e;
        if (aan != null) {
            aan.setAdapter(this.r);
        }
    }

    public final void a(PopupWindow.OnDismissListener onDismissListener) {
        this.q.setOnDismissListener(onDismissListener);
    }
}
