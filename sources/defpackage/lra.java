package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.SectionIndexer;
import com.google.android.gms.R;

/* renamed from: lra  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class lra {
    private static final int[] y = {16842919};
    private static final int[] z = new int[0];
    private final Paint A;
    public final Drawable a;
    public final Drawable b;
    public final Drawable c;
    public final int d;
    public final int e;
    public int f;
    public final RectF g;
    public final int h;
    public final RecyclerView i;
    public boolean j;
    public int k;
    public int l = -1;
    public boolean m;
    public Object[] n;
    public String o;
    public boolean p;
    public final lqz q;
    public int r;
    public final Handler s = new qvr();
    public acg t;
    public SectionIndexer u;
    public boolean v;
    public final View w;
    public final lqy x;

    public lra(Context context, RecyclerView recyclerView, View view, lqy lqy) {
        this.i = recyclerView;
        this.w = view;
        iva.a((Object) lqy);
        this.x = lqy;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843574, 16843577});
        this.a = a(context, obtainStyledAttributes.getResourceId(0, R.drawable.drive_scrollbar_handle_accelerated_anim2));
        this.e = context.getResources().getDimensionPixelSize(R.dimen.drive_fastscroll_thumb_width);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.drive_fastscroll_thumb_height);
        this.v = true;
        this.b = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        this.c = a(context, (int) R.drawable.drive_menu_submenu_background);
        this.j = true;
        d();
        this.h = context.getResources().getDimensionPixelSize(R.dimen.drive_fastscroll_overlay_size);
        this.g = new RectF();
        this.q = new lqz(this);
        Paint paint = new Paint();
        this.A = paint;
        paint.setAntiAlias(true);
        this.A.setTextAlign(Paint.Align.CENTER);
        this.A.setTextSize((float) (this.h / 2));
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{16842806});
        ColorStateList colorStateList = obtainStyledAttributes2.getColorStateList(obtainStyledAttributes2.getIndex(0));
        obtainStyledAttributes2.recycle();
        this.A.setColor(colorStateList.getDefaultColor());
        this.A.setStyle(Paint.Style.FILL_AND_STROKE);
        this.r = 0;
        e();
    }

    private final void e() {
        int[] iArr = this.r != 3 ? z : y;
        Drawable drawable = this.a;
        if (drawable != null && drawable.isStateful()) {
            this.a.setState(iArr);
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null && drawable2.isStateful()) {
            this.b.setState(iArr);
        }
    }

    public final int b() {
        return c(this.i.getWidth());
    }

    public final int c(int i2) {
        if (!lqy.LEFT.equals(this.x)) {
            return i2 - this.e;
        }
        return 0;
    }

    public final void d() {
        acg adapter = this.i.getAdapter();
        this.u = null;
        this.t = adapter;
        if (adapter instanceof low) {
            lqr lqr = ((low) adapter).f;
            SectionIndexer sectionIndexer = lqr == null ? low.e : lqr.a;
            this.u = sectionIndexer;
            this.n = sectionIndexer.getSections();
        } else if (!(adapter instanceof SectionIndexer)) {
            this.n = new String[]{" "};
        } else {
            SectionIndexer sectionIndexer2 = (SectionIndexer) adapter;
            this.u = sectionIndexer2;
            this.n = sectionIndexer2.getSections();
        }
    }

    static final Drawable a(Context context, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        return context.getResources().getDrawable(i2, context.getTheme());
    }

    public final int b(int i2) {
        return lqy.LEFT.equals(this.x) ? this.e : i2;
    }

    public final void c() {
        this.a.setBounds(b(), 0, a(), this.d);
        this.a.setAlpha(208);
    }

    public final int a() {
        return b(this.i.getWidth());
    }

    public void a(int i2) {
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        this.w.invalidate(b(), this.f, a(), this.f + this.d);
                    }
                }
            } else if (this.r != 2) {
                c();
            }
            this.s.removeCallbacks(this.q);
        } else {
            this.s.removeCallbacks(this.q);
            this.w.invalidate();
        }
        this.r = i2;
        e();
    }

    public final boolean a(float f2, float f3) {
        if (f2 <= ((float) b()) || f2 >= ((float) a())) {
            return false;
        }
        int i2 = this.f;
        return f3 >= ((float) i2) && f3 <= ((float) (i2 + this.d));
    }
}
