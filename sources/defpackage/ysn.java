package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;

/* renamed from: ysn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ysn extends ViewGroup implements View.OnClickListener {
    private static boolean a;
    private static Drawable b;
    private static Drawable c;
    private static Drawable d;
    private static Drawable e;
    private static int f;
    private static int g;
    private static int h;
    private static int i;
    private static int j;
    private static FrameLayout.LayoutParams k;
    private int l;
    private Drawable m;
    private final TextView n;
    private int o;
    private String p;
    private final Rect q = new Rect();
    public final Resources r;
    public int s;
    public ProgressBar t;
    public boolean u;
    public ytd v;
    private int w;
    private boolean x = true;
    private final Rect y = new Rect();

    private final void a(Drawable drawable) {
        int i2 = Build.VERSION.SDK_INT;
        setBackground(drawable);
    }

    private final void b(int i2, boolean z) {
        if (i2 == 0) {
            a(this.r.getDrawable(R.drawable.plus_red_button_nugget));
            getContext();
            yst.a(this.r, this.n, 1);
            this.x = true;
            this.m = d;
            int i3 = this.s;
            if (i3 == 1 || i3 == 2) {
                b(this.r.getString(R.string.circle_button_follow), z);
            } else if (this.o == 2) {
                b(this.r.getString(R.string.common_add), z);
            } else {
                b(this.r.getString(R.string.circle_button_add_to_circles), z);
            }
        } else if (i2 != 1) {
            a(this.r.getDrawable(R.drawable.btn_32_white));
            getContext();
            yst.a(this.r, this.n, 5);
            this.x = false;
            b(this.r.getString(R.string.circle_button_profile_blocked), z);
        } else {
            a(this.r.getDrawable(R.drawable.plus_white_button_nugget));
            getContext();
            yst.a(this.r, this.n, 3);
            this.x = true;
            this.m = b;
            b(this.p, z);
        }
    }

    public final void c(int i2) {
        this.s = i2;
        if (i2 != 3) {
            a(this.p, false);
        } else {
            b(2, false);
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        if (this.x) {
            this.m.setBounds(this.y);
            this.m.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public void onClick(View view) {
        ytd ytd = this.v;
        if (ytd != null) {
            try {
                ytd.a((Intent) getTag());
            } catch (RemoteException e2) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7 = i4 - i2;
        int i8 = i5 - i3;
        int i9 = (i7 - this.q.left) - this.q.right;
        int i10 = (i8 - this.q.top) - this.q.bottom;
        int i11 = i7 - this.q.right;
        int i12 = i8 - this.q.bottom;
        int measuredHeight = this.n.getMeasuredHeight();
        if (this.u) {
            int measuredWidth = this.t.getMeasuredWidth();
            int i13 = (i7 - measuredWidth) / 2;
            int measuredHeight2 = (i8 - this.t.getMeasuredHeight()) / 2;
            this.t.layout(i13, measuredHeight2, i13 + measuredWidth, measuredWidth + measuredHeight2);
        }
        if (this.x) {
            i6 = this.m.getIntrinsicWidth();
            if (this.n.getVisibility() == 0) {
                i6 += this.l;
            }
        } else {
            i6 = 0;
        }
        int measuredWidth2 = i6 + this.n.getMeasuredWidth();
        int i14 = this.q.left + ((i9 - measuredWidth2) / 2);
        if (i14 < this.q.left) {
            i14 = this.q.left;
        }
        int i15 = this.q.top + ((i10 - measuredHeight) / 2);
        if (i15 < this.q.top) {
            i15 = this.q.top;
        }
        int i16 = measuredWidth2 + i14;
        if (i16 <= i11) {
            i11 = i16;
        }
        int min = Math.min(i8, measuredHeight) + i15;
        if (min <= i12) {
            i12 = min;
        }
        if (this.x) {
            int intrinsicHeight = this.m.getIntrinsicHeight();
            int intrinsicWidth = this.m.getIntrinsicWidth();
            int i17 = this.q.top + ((i10 - intrinsicHeight) / 2);
            this.y.set(i14, i17, i14 + intrinsicWidth, intrinsicHeight + i17);
            i14 += intrinsicWidth + this.l;
        }
        if (this.n.getVisibility() == 0) {
            this.n.layout(i14, i15, i11, i12);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Drawable background = getBackground();
        int minimumWidth = background.getMinimumWidth();
        int minimumHeight = background.getMinimumHeight();
        int visibility = this.n.getVisibility();
        if (background != null) {
            background.getPadding(this.q);
        }
        Rect rect = this.q;
        int i9 = this.w;
        rect.right = i9;
        rect.left = i9;
        int mode = View.MeasureSpec.getMode(i2);
        int i10 = Integer.MAX_VALUE;
        if (mode != 0) {
            i4 = View.MeasureSpec.getSize(i2);
        } else {
            i4 = Integer.MAX_VALUE;
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode2 != 0) {
            i10 = View.MeasureSpec.getSize(i3);
        }
        int i11 = 0;
        if (this.x) {
            i6 = this.m.getIntrinsicWidth();
            if (visibility != 8) {
                i6 += this.l;
            }
            i5 = this.m.getIntrinsicHeight();
        } else {
            i6 = 0;
            i5 = 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
        if (visibility != 8) {
            i7 = ((i4 - i6) - this.q.left) - this.q.right;
        } else {
            i7 = 0;
        }
        if (visibility != 8) {
            this.n.measure(View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), makeMeasureSpec);
        }
        if (mode != 1073741824) {
            if (visibility != 8) {
                i11 = this.n.getMeasuredWidth();
            }
            i4 = Math.max(minimumWidth, i11 + i6) + this.q.left + this.q.right;
        }
        if (mode2 != 1073741824) {
            i10 = Math.max(minimumHeight, Math.max(i5, this.n.getMeasuredHeight())) + 6;
            if (this.o == 3 && i10 < (i8 = h)) {
                i10 = i8;
            }
        }
        int resolveSize = resolveSize(i4, i2);
        int resolveSize2 = resolveSize(i10, i3);
        if (this.u) {
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((resolveSize2 - this.q.top) - this.q.bottom, JGCastService.FLAG_PRIVATE_DISPLAY);
            this.t.measure(makeMeasureSpec2, makeMeasureSpec2);
        }
        setMeasuredDimension(resolveSize, resolveSize2);
    }

    public ysn(Context context, Context context2, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i2;
        String a2 = ivu.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", context, attributeSet, "BaseCirclesButtonView");
        int i3 = 3;
        if (!"SMALL".equalsIgnoreCase(a2)) {
            i2 = !"MEDIUM".equalsIgnoreCase(a2) ? "LARGE".equalsIgnoreCase(a2) ? 3 : 0 : 2;
        } else {
            i2 = 1;
        }
        String a3 = ivu.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "type", context, attributeSet, "BaseCirclesButtonView");
        if ("FOLLOW".equalsIgnoreCase(a3)) {
            i3 = 1;
        } else if ("ONE_CLICK_FOLLOW".equalsIgnoreCase(a3)) {
            i3 = 2;
        } else if (!"BLOCKED".equalsIgnoreCase(a3)) {
            i3 = 0;
        }
        Resources resources = context2.getResources();
        this.r = resources;
        if (!a) {
            a = true;
            f = resources.getDimensionPixelSize(R.dimen.circle_button_32_icon_spacing);
            g = this.r.getDimensionPixelSize(R.dimen.circle_button_48_icon_spacing);
            this.r.getDimensionPixelSize(R.dimen.circle_button_32_height);
            h = this.r.getDimensionPixelSize(R.dimen.circle_button_48_height);
            i = this.r.getDimensionPixelSize(R.dimen.circle_button_32_side_padding);
            j = this.r.getDimensionPixelSize(R.dimen.circle_button_48_side_padding);
            b = this.r.getDrawable(R.drawable.plus_iconic_ic_circles_red_20);
            c = this.r.getDrawable(R.drawable.ic_add_person_red_20);
            d = this.r.getDrawable(R.drawable.ic_add_person_white_20);
            e = this.r.getDrawable(R.drawable.ic_add_person_darkgrey_20);
            k = new FrameLayout.LayoutParams(-2, -2);
            b.setFilterBitmap(true);
            c.setFilterBitmap(true);
            d.setFilterBitmap(true);
            e.setFilterBitmap(true);
        }
        Resources resources2 = this.r;
        TextView textView = new TextView(context);
        yst.a(resources2, textView, 1);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(16);
        this.n = textView;
        addView(textView);
        a(i2, false);
        c(i3);
    }

    public final void a(int i2, boolean z) {
        this.o = i2;
        if (i2 == 1) {
            this.w = i;
            this.l = f;
            this.n.setVisibility(8);
            setLayoutParams(k);
        } else if (i2 == 2) {
            this.w = i;
            this.l = f;
            this.n.setVisibility(0);
            setLayoutParams(k);
        } else if (i2 != 3) {
            this.w = i;
            this.l = f;
            this.n.setVisibility(0);
        } else {
            this.w = j;
            this.l = g;
            this.n.setVisibility(0);
            setLayoutParams(k);
        }
        if (z) {
            requestLayout();
        }
    }

    public final void a(String str, boolean z) {
        this.p = str;
        if (this.s == 3) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            b(1, z);
        } else {
            b(0, z);
        }
    }

    private final void b(String str, boolean z) {
        if (!TextUtils.equals(this.n.getText(), str)) {
            this.n.setText(str);
            if (z) {
                requestLayout();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void b(int i2) {
        if (this.o == 1 && this.s == 3) {
            setVisibility(8);
        } else {
            setVisibility(i2);
        }
    }

    /* access modifiers changed from: protected */
    public final void b(boolean z) {
        if (z && this.s != 3) {
            if (TextUtils.isEmpty(this.p)) {
                a(this.r.getDrawable(R.drawable.plus_red_button_nugget));
            } else {
                a(this.r.getDrawable(R.drawable.plus_white_button_nugget));
            }
            setOnClickListener(this);
            return;
        }
        if (TextUtils.isEmpty(this.p) && this.s != 3) {
            a(this.r.getDrawable(R.drawable.btn_32_red));
        } else {
            a(this.r.getDrawable(R.drawable.btn_32_white));
        }
        setOnClickListener((View.OnClickListener) null);
    }
}
