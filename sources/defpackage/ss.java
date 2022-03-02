package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.widget.NestedScrollView;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.ListView;
import com.google.android.gms.R;

/* renamed from: ss  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ss extends tp implements DialogInterface {
    public final sq a = new sq(getContext(), this, getWindow());

    protected ss(Context context, int i) {
        super(context, a(context, i));
    }

    static int a(Context context, int i) {
        if ((i >>> 24) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final Button a(int i) {
        sq sqVar = this.a;
        return i != -2 ? sqVar.j : sqVar.m;
    }

    public final ListView a() {
        return this.a.f;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02ad A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            super.onCreate(r15)
            sq r15 = r14.a
            int r0 = r15.C
            if (r0 == 0) goto L_0x000c
            int r0 = r15.B
            goto L_0x000e
        L_0x000c:
            int r0 = r15.B
        L_0x000e:
            tp r1 = r15.b
            r1.setContentView((int) r0)
            android.view.Window r0 = r15.c
            r1 = 2131429130(0x7f0b070a, float:1.8479924E38)
            android.view.View r0 = r0.findViewById(r1)
            r1 = 2131429712(0x7f0b0950, float:1.8481104E38)
            android.view.View r2 = r0.findViewById(r1)
            r3 = 2131427838(0x7f0b01fe, float:1.8477304E38)
            android.view.View r4 = r0.findViewById(r3)
            r5 = 2131427682(0x7f0b0162, float:1.8476987E38)
            android.view.View r6 = r0.findViewById(r5)
            r7 = 2131427902(0x7f0b023e, float:1.8477433E38)
            android.view.View r0 = r0.findViewById(r7)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r7 = r15.g
            r8 = 0
            r9 = 0
            if (r7 == 0) goto L_0x0041
            goto L_0x0053
        L_0x0041:
            int r7 = r15.h
            if (r7 == 0) goto L_0x0052
            android.content.Context r7 = r15.a
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r10 = r15.h
            android.view.View r7 = r7.inflate(r10, r0, r9)
            goto L_0x0053
        L_0x0052:
            r7 = r8
        L_0x0053:
            r10 = -1
            r11 = 8
            if (r7 != 0) goto L_0x0059
            goto L_0x005f
        L_0x0059:
            boolean r12 = defpackage.sq.a((android.view.View) r7)
            if (r12 != 0) goto L_0x006e
        L_0x005f:
            android.view.Window r12 = r15.c
            r13 = 131072(0x20000, float:1.83671E-40)
            r12.setFlags(r13, r13)
            if (r7 == 0) goto L_0x0069
            goto L_0x006e
        L_0x0069:
            r0.setVisibility(r11)
            goto L_0x0090
        L_0x006e:
            android.view.Window r12 = r15.c
            r13 = 2131427901(0x7f0b023d, float:1.8477431E38)
            android.view.View r12 = r12.findViewById(r13)
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            android.view.ViewGroup$LayoutParams r13 = new android.view.ViewGroup$LayoutParams
            r13.<init>(r10, r10)
            r12.addView(r7, r13)
            boolean r7 = r15.i
            android.widget.ListView r7 = r15.f
            if (r7 == 0) goto L_0x0090
            android.view.ViewGroup$LayoutParams r7 = r0.getLayoutParams()
            abe r7 = (defpackage.abe) r7
            r12 = 0
            r7.g = r12
        L_0x0090:
            android.view.View r1 = r0.findViewById(r1)
            android.view.View r3 = r0.findViewById(r3)
            android.view.View r5 = r0.findViewById(r5)
            android.view.ViewGroup r1 = defpackage.sq.a(r1, r2)
            android.view.ViewGroup r2 = defpackage.sq.a(r3, r4)
            android.view.ViewGroup r3 = defpackage.sq.a(r5, r6)
            android.view.Window r4 = r15.c
            r5 = 2131429390(0x7f0b080e, float:1.8480451E38)
            android.view.View r4 = r4.findViewById(r5)
            android.support.v4.widget.NestedScrollView r4 = (android.support.v4.widget.NestedScrollView) r4
            r15.s = r4
            android.support.v4.widget.NestedScrollView r4 = r15.s
            r4.setFocusable(r9)
            android.support.v4.widget.NestedScrollView r4 = r15.s
            r4.setNestedScrollingEnabled(r9)
            r4 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r15.x = r4
            android.widget.TextView r4 = r15.x
            if (r4 == 0) goto L_0x0105
            java.lang.CharSequence r5 = r15.e
            if (r5 != 0) goto L_0x0102
            r4.setVisibility(r11)
            android.support.v4.widget.NestedScrollView r4 = r15.s
            android.widget.TextView r5 = r15.x
            r4.removeView(r5)
            android.widget.ListView r4 = r15.f
            if (r4 == 0) goto L_0x00fd
            android.support.v4.widget.NestedScrollView r4 = r15.s
            android.view.ViewParent r4 = r4.getParent()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.support.v4.widget.NestedScrollView r5 = r15.s
            int r5 = r4.indexOfChild(r5)
            r4.removeViewAt(r5)
            android.widget.ListView r6 = r15.f
            android.view.ViewGroup$LayoutParams r7 = new android.view.ViewGroup$LayoutParams
            r7.<init>(r10, r10)
            r4.addView(r6, r5, r7)
            goto L_0x0105
        L_0x00fd:
            r2.setVisibility(r11)
            goto L_0x0105
        L_0x0102:
            r4.setText(r5)
        L_0x0105:
            r4 = 16908313(0x1020019, float:2.38773E-38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.Button r4 = (android.widget.Button) r4
            r15.j = r4
            android.widget.Button r4 = r15.j
            android.view.View$OnClickListener r5 = r15.I
            r4.setOnClickListener(r5)
            java.lang.CharSequence r4 = r15.k
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r5 = 1
            if (r4 == 0) goto L_0x0127
            android.widget.Button r4 = r15.j
            r4.setVisibility(r11)
            r4 = 0
            goto L_0x0134
        L_0x0127:
            android.widget.Button r4 = r15.j
            java.lang.CharSequence r6 = r15.k
            r4.setText(r6)
            android.widget.Button r4 = r15.j
            r4.setVisibility(r9)
            r4 = 1
        L_0x0134:
            r6 = 16908314(0x102001a, float:2.3877302E-38)
            android.view.View r6 = r3.findViewById(r6)
            android.widget.Button r6 = (android.widget.Button) r6
            r15.m = r6
            android.widget.Button r6 = r15.m
            android.view.View$OnClickListener r7 = r15.I
            r6.setOnClickListener(r7)
            java.lang.CharSequence r6 = r15.n
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x0154
            android.widget.Button r6 = r15.m
            r6.setVisibility(r11)
            goto L_0x0162
        L_0x0154:
            android.widget.Button r6 = r15.m
            java.lang.CharSequence r7 = r15.n
            r6.setText(r7)
            android.widget.Button r6 = r15.m
            r6.setVisibility(r9)
            r4 = r4 | 2
        L_0x0162:
            r6 = 16908315(0x102001b, float:2.3877305E-38)
            android.view.View r6 = r3.findViewById(r6)
            android.widget.Button r6 = (android.widget.Button) r6
            r15.p = r6
            android.widget.Button r6 = r15.p
            android.view.View$OnClickListener r7 = r15.I
            r6.setOnClickListener(r7)
            java.lang.CharSequence r6 = r15.q
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x0182
            android.widget.Button r6 = r15.p
            r6.setVisibility(r11)
            goto L_0x0190
        L_0x0182:
            android.widget.Button r6 = r15.p
            java.lang.CharSequence r7 = r15.q
            r6.setText(r7)
            android.widget.Button r6 = r15.p
            r6.setVisibility(r9)
            r4 = r4 | 4
        L_0x0190:
            android.content.Context r6 = r15.a
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            android.content.res.Resources$Theme r6 = r6.getTheme()
            r12 = 2130968619(0x7f04002b, float:1.7545897E38)
            r6.resolveAttribute(r12, r7, r5)
            int r6 = r7.data
            r7 = 2
            if (r6 == 0) goto L_0x01bf
            if (r4 != r5) goto L_0x01ae
            android.widget.Button r4 = r15.j
            defpackage.sq.a((android.widget.Button) r4)
            goto L_0x01c4
        L_0x01ae:
            if (r4 != r7) goto L_0x01b6
            android.widget.Button r4 = r15.m
            defpackage.sq.a((android.widget.Button) r4)
            goto L_0x01c4
        L_0x01b6:
            r6 = 4
            if (r4 != r6) goto L_0x01bf
            android.widget.Button r4 = r15.p
            defpackage.sq.a((android.widget.Button) r4)
            goto L_0x01c4
        L_0x01bf:
            if (r4 != 0) goto L_0x01c4
            r3.setVisibility(r11)
        L_0x01c4:
            android.view.View r4 = r15.y
            r6 = 2131429697(0x7f0b0941, float:1.8481074E38)
            if (r4 == 0) goto L_0x01e1
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r12 = -2
            r4.<init>(r10, r12)
            android.view.View r10 = r15.y
            r1.addView(r10, r9, r4)
            android.view.Window r4 = r15.c
            android.view.View r4 = r4.findViewById(r6)
            r4.setVisibility(r11)
            goto L_0x0257
        L_0x01e1:
            android.view.Window r4 = r15.c
            r10 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r4 = r4.findViewById(r10)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r15.v = r4
            java.lang.CharSequence r4 = r15.d
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x01f7
            goto L_0x0246
        L_0x01f7:
            boolean r4 = r15.G
            if (r4 == 0) goto L_0x0246
            android.view.Window r4 = r15.c
            r6 = 2131427507(0x7f0b00b3, float:1.8476632E38)
            android.view.View r4 = r4.findViewById(r6)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r15.w = r4
            android.widget.TextView r4 = r15.w
            java.lang.CharSequence r6 = r15.d
            r4.setText(r6)
            int r4 = r15.t
            if (r4 != 0) goto L_0x0240
            android.graphics.drawable.Drawable r4 = r15.u
            if (r4 != 0) goto L_0x023a
            android.widget.TextView r4 = r15.w
            android.widget.ImageView r6 = r15.v
            int r6 = r6.getPaddingLeft()
            android.widget.ImageView r10 = r15.v
            int r10 = r10.getPaddingTop()
            android.widget.ImageView r12 = r15.v
            int r12 = r12.getPaddingRight()
            android.widget.ImageView r13 = r15.v
            int r13 = r13.getPaddingBottom()
            r4.setPadding(r6, r10, r12, r13)
            android.widget.ImageView r4 = r15.v
            r4.setVisibility(r11)
            goto L_0x0257
        L_0x023a:
            android.widget.ImageView r6 = r15.v
            r6.setImageDrawable(r4)
            goto L_0x0257
        L_0x0240:
            android.widget.ImageView r6 = r15.v
            r6.setImageResource(r4)
            goto L_0x0257
        L_0x0246:
            android.view.Window r4 = r15.c
            android.view.View r4 = r4.findViewById(r6)
            r4.setVisibility(r11)
            android.widget.ImageView r4 = r15.v
            r4.setVisibility(r11)
            r1.setVisibility(r11)
        L_0x0257:
            if (r0 == 0) goto L_0x0261
            int r0 = r0.getVisibility()
            if (r0 == r11) goto L_0x0261
            r0 = 1
            goto L_0x0262
        L_0x0261:
            r0 = 0
        L_0x0262:
            if (r1 == 0) goto L_0x026c
            int r4 = r1.getVisibility()
            if (r4 == r11) goto L_0x026c
            r4 = 1
            goto L_0x026d
        L_0x026c:
            r4 = 0
        L_0x026d:
            if (r3 == 0) goto L_0x0277
            int r3 = r3.getVisibility()
            if (r3 == r11) goto L_0x0277
            r3 = 1
            goto L_0x0278
        L_0x0277:
            r3 = 0
        L_0x0278:
            if (r3 != 0) goto L_0x0288
            if (r2 == 0) goto L_0x0288
            r6 = 2131429649(0x7f0b0911, float:1.8480977E38)
            android.view.View r6 = r2.findViewById(r6)
            if (r6 == 0) goto L_0x0288
            r6.setVisibility(r9)
        L_0x0288:
            if (r4 == 0) goto L_0x02ad
            android.support.v4.widget.NestedScrollView r6 = r15.s
            if (r6 != 0) goto L_0x028f
            goto L_0x0293
        L_0x028f:
            r6.setClipToPadding(r5)
        L_0x0293:
            java.lang.CharSequence r6 = r15.e
            if (r6 != 0) goto L_0x029e
            android.widget.ListView r6 = r15.f
            if (r6 == 0) goto L_0x029c
            goto L_0x029e
        L_0x029c:
            r1 = r8
            goto L_0x02a5
        L_0x029e:
            r6 = 2131429685(0x7f0b0935, float:1.848105E38)
            android.view.View r1 = r1.findViewById(r6)
        L_0x02a5:
            if (r1 != 0) goto L_0x02a8
            goto L_0x02bb
        L_0x02a8:
            r1.setVisibility(r9)
            goto L_0x02bb
        L_0x02ad:
            if (r2 == 0) goto L_0x02bb
            r1 = 2131429650(0x7f0b0912, float:1.8480979E38)
            android.view.View r1 = r2.findViewById(r1)
            if (r1 == 0) goto L_0x02bb
            r1.setVisibility(r9)
        L_0x02bb:
            android.widget.ListView r1 = r15.f
            boolean r6 = r1 instanceof android.support.v7.app.AlertController$RecycleListView
            if (r6 == 0) goto L_0x02ec
            if (r3 != 0) goto L_0x02c4
            goto L_0x02c7
        L_0x02c4:
            if (r4 == 0) goto L_0x02c7
            goto L_0x02ec
        L_0x02c7:
            android.support.v7.app.AlertController$RecycleListView r1 = (android.support.v7.app.AlertController$RecycleListView) r1
            int r6 = r1.getPaddingLeft()
            if (r4 != 0) goto L_0x02d3
            int r10 = r1.a
            goto L_0x02d8
        L_0x02d3:
            int r10 = r1.getPaddingTop()
        L_0x02d8:
            int r11 = r1.getPaddingRight()
            if (r3 != 0) goto L_0x02e3
            int r12 = r1.b
            goto L_0x02e8
        L_0x02e3:
            int r12 = r1.getPaddingBottom()
        L_0x02e8:
            r1.setPadding(r6, r10, r11, r12)
        L_0x02ec:
            if (r0 != 0) goto L_0x037a
            android.widget.ListView r0 = r15.f
            if (r0 != 0) goto L_0x02f4
            android.support.v4.widget.NestedScrollView r0 = r15.s
        L_0x02f4:
            if (r0 != 0) goto L_0x02f8
            goto L_0x037a
        L_0x02f8:
            if (r3 != 0) goto L_0x02fb
            goto L_0x02fc
        L_0x02fb:
            r9 = 2
        L_0x02fc:
            r1 = r4 | r9
            android.view.Window r3 = r15.c
            r4 = 2131429389(0x7f0b080d, float:1.848045E38)
            android.view.View r3 = r3.findViewById(r4)
            android.view.Window r4 = r15.c
            r6 = 2131429388(0x7f0b080c, float:1.8480447E38)
            android.view.View r4 = r4.findViewById(r6)
            int r6 = android.os.Build.VERSION.SDK_INT
            r9 = 23
            if (r6 < r9) goto L_0x0324
            defpackage.qb.j(r0, r1)
            if (r3 == 0) goto L_0x031e
            r2.removeView(r3)
        L_0x031e:
            if (r4 == 0) goto L_0x037a
            r2.removeView(r4)
            goto L_0x037a
        L_0x0324:
            if (r3 == 0) goto L_0x032f
            r0 = r1 & 1
            if (r0 != 0) goto L_0x032f
            r2.removeView(r3)
            r3 = r8
            goto L_0x0330
        L_0x032f:
        L_0x0330:
            if (r4 == 0) goto L_0x033a
            r0 = r1 & 2
            if (r0 != 0) goto L_0x033a
            r2.removeView(r4)
            goto L_0x033c
        L_0x033a:
            r8 = r4
        L_0x033c:
            if (r3 == 0) goto L_0x033f
            goto L_0x0341
        L_0x033f:
            if (r8 == 0) goto L_0x037a
        L_0x0341:
            java.lang.CharSequence r0 = r15.e
            if (r0 == 0) goto L_0x0359
            android.support.v4.widget.NestedScrollView r0 = r15.s
            si r1 = new si
            r1.<init>(r3, r8)
            r0.a = r1
            android.support.v4.widget.NestedScrollView r0 = r15.s
            sj r1 = new sj
            r1.<init>(r15, r3, r8)
            r0.post(r1)
            goto L_0x037a
        L_0x0359:
            android.widget.ListView r0 = r15.f
            if (r0 == 0) goto L_0x0370
            sk r1 = new sk
            r1.<init>(r3, r8)
            r0.setOnScrollListener(r1)
            android.widget.ListView r0 = r15.f
            sl r1 = new sl
            r1.<init>(r15, r3, r8)
            r0.post(r1)
            goto L_0x037a
        L_0x0370:
            if (r3 == 0) goto L_0x0375
            r2.removeView(r3)
        L_0x0375:
            if (r8 == 0) goto L_0x037a
            r2.removeView(r8)
        L_0x037a:
            android.widget.ListView r0 = r15.f
            if (r0 == 0) goto L_0x038f
            android.widget.ListAdapter r1 = r15.z
            if (r1 == 0) goto L_0x038f
            r0.setAdapter(r1)
            int r15 = r15.A
            if (r15 < 0) goto L_0x038f
            r0.setItemChecked(r15, r5)
            r0.setSelection(r15)
        L_0x038f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ss.onCreate(android.os.Bundle):void");
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.a.s;
        if (nestedScrollView == null || !nestedScrollView.a(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.a.s;
        if (nestedScrollView == null || !nestedScrollView.a(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.a.a(charSequence);
    }
}
