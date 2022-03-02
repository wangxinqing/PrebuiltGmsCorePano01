package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: ajtu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajtu extends tp {
    boolean a;
    public boolean b;
    public boolean c;
    private BottomSheetBehavior d;
    private FrameLayout e;
    private final ajtn f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ajtu(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 == 0) goto L_0x0004
            goto L_0x001c
        L_0x0004:
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130968750(0x7f0400ae, float:1.7546162E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L_0x0019
            int r5 = r5.resourceId
            goto L_0x001c
        L_0x0019:
            r5 = 2132018415(0x7f1404ef, float:1.9675136E38)
        L_0x001c:
            r3.<init>(r4, r5)
            r3.a = r0
            r3.b = r0
            ajtt r4 = new ajtt
            r4.<init>(r3)
            r3.f = r4
            r3.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajtu.<init>(android.content.Context, int):void");
    }

    private final View a(int i, View view, ViewGroup.LayoutParams layoutParams) {
        d();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.e.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) this.e.findViewById(R.id.design_bottom_sheet);
        frameLayout.removeAllViews();
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new ajtq(this));
        qb.a((View) frameLayout, (oz) new ajtr(this));
        frameLayout.setOnTouchListener(new ajts());
        return this.e;
    }

    private final void d() {
        if (this.e == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, (ViewGroup) null);
            this.e = frameLayout;
            ViewGroup.LayoutParams layoutParams = ((FrameLayout) frameLayout.findViewById(R.id.design_bottom_sheet)).getLayoutParams();
            if (layoutParams instanceof ahm) {
                ahj ahj = ((ahm) layoutParams).a;
                if (ahj instanceof BottomSheetBehavior) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) ahj;
                    this.d = bottomSheetBehavior;
                    bottomSheetBehavior.a(this.f);
                    this.d.a(this.a);
                    return;
                }
                throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
            }
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
    }

    public final void cancel() {
        a();
        super.cancel();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            int i = Build.VERSION.SDK_INT;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.d;
        if (bottomSheetBehavior != null && bottomSheetBehavior.m == 5) {
            bottomSheetBehavior.c(4);
        }
    }

    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.a != z) {
            this.a = z;
            BottomSheetBehavior bottomSheetBehavior = this.d;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.a(z);
            }
        }
    }

    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.a) {
            this.a = true;
        }
        this.b = z;
        this.c = true;
    }

    public final void setContentView(int i) {
        super.setContentView(a(i, (View) null, (ViewGroup.LayoutParams) null));
    }

    public final void setContentView(View view) {
        super.setContentView(a(0, view, (ViewGroup.LayoutParams) null));
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(a(0, view, layoutParams));
    }

    public final BottomSheetBehavior a() {
        if (this.d == null) {
            d();
        }
        return this.d;
    }
}
