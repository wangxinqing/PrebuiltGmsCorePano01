package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.gms.R;

/* renamed from: xf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class xf {
    public View a;
    public int b;
    public PopupWindow.OnDismissListener c;
    private final Context d;
    private final wt e;
    private final boolean f;
    private final int g;
    private boolean h;
    private xg i;
    private xd j;
    private final PopupWindow.OnDismissListener k;

    public xf(Context context, wt wtVar, View view, boolean z) {
        this(context, wtVar, view, z, R.attr.actionOverflowMenuStyle);
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [wn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.xd a() {
        /*
            r11 = this;
            xd r0 = r11.j
            if (r0 != 0) goto L_0x0071
            android.content.Context r0 = r11.d
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r0.getRealSize(r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r11.d
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165206(0x7f070016, float:1.7944623E38)
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0041
            wn r0 = new wn
            android.content.Context r1 = r11.d
            android.view.View r2 = r11.a
            int r3 = r11.g
            boolean r4 = r11.f
            r0.<init>(r1, r2, r3, r4)
            goto L_0x0051
        L_0x0041:
            xo r0 = new xo
            android.content.Context r6 = r11.d
            wt r7 = r11.e
            android.view.View r8 = r11.a
            int r9 = r11.g
            boolean r10 = r11.f
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x0051:
            wt r1 = r11.e
            r0.a((defpackage.wt) r1)
            android.widget.PopupWindow$OnDismissListener r1 = r11.k
            r0.a((android.widget.PopupWindow.OnDismissListener) r1)
            android.view.View r1 = r11.a
            r0.a((android.view.View) r1)
            xg r1 = r11.i
            r0.a((defpackage.xg) r1)
            boolean r1 = r11.h
            r0.b((boolean) r1)
            int r1 = r11.b
            r0.a((int) r1)
            r11.j = r0
        L_0x0071:
            xd r0 = r11.j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xf.a():xd");
    }

    public final boolean b() {
        if (e()) {
            return true;
        }
        if (this.a == null) {
            return false;
        }
        a(0, 0, false, false);
        return true;
    }

    public final void c() {
        if (e()) {
            this.j.d();
        }
    }

    /* access modifiers changed from: protected */
    public void d() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean e() {
        xd xdVar = this.j;
        return xdVar != null && xdVar.e();
    }

    public xf(Context context, wt wtVar, View view, boolean z, int i2) {
        this.b = 8388611;
        this.k = new xe(this);
        this.d = context;
        this.e = wtVar;
        this.a = view;
        this.f = z;
        this.g = i2;
    }

    public final void a(int i2, int i3, boolean z, boolean z2) {
        xd a2 = a();
        a2.c(z2);
        if (z) {
            if ((pd.a(this.b, qb.h(this.a)) & 7) == 5) {
                i2 -= this.a.getWidth();
            }
            a2.b(i2);
            a2.c(i3);
            int i4 = (int) ((this.d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.g = new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4);
        }
        a2.ar();
    }

    public final void a(xg xgVar) {
        this.i = xgVar;
        xd xdVar = this.j;
        if (xdVar != null) {
            xdVar.a(xgVar);
        }
    }

    public final void a(boolean z) {
        this.h = z;
        xd xdVar = this.j;
        if (xdVar != null) {
            xdVar.b(z);
        }
    }
}
