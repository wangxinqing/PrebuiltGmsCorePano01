package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.common.widget.phone.ScrollViewWithEvents;

/* renamed from: adgm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adgm extends adgi implements ViewTreeObserver.OnGlobalLayoutListener {
    private boolean m;
    private ScrollViewWithEvents n;
    private ViewGroup o;
    private adgl p;
    private adfc q;
    private int r;

    private final int a(int i) {
        Resources resources = getResources();
        int color = resources.getColor(R.color.udc_title_text_light);
        int color2 = resources.getColor(R.color.udc_title_text_dark);
        double a = azrb.a.a().a();
        double a2 = adfb.a(i);
        double a3 = adfb.a(adfb.a(color), a2);
        return (a3 >= a || adfb.a(adfb.a(color2), a2) <= a3) ? color : color2;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return R.layout.udc_consent_fragment;
    }

    /* access modifiers changed from: protected */
    public final void c() {
        if (this.k || this.n.a()) {
            super.c();
            return;
        }
        this.i.a(this.j);
        this.n.pageScroll(130);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        adgl adgl = this.p;
        if (adgl != null) {
            View view = adgl.c;
            if (view != null) {
                view.clearAnimation();
            }
            View view2 = adgl.d;
            if (view2 != null) {
                view2.clearAnimation();
            }
            View view3 = adgl.a;
            if (view3 != null) {
                view3.clearAnimation();
            }
            View view4 = adgl.b;
            if (view4 != null) {
                view4.clearAnimation();
            }
        }
    }

    public final void onGlobalLayout() {
        int i;
        int i2;
        int i3;
        int i4;
        adfc adfc = this.q;
        boolean z = false;
        if (adfc != null) {
            if (azrb.a.a().f()) {
                View findViewById = adfc.b.findViewById(R.id.udc_consent_header);
                if (findViewById == null) {
                    ((anih) ((anih) adfc.a.b()).a("adfc", "b", 119, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot find headerView.");
                } else {
                    int c = adfc.c();
                    if (adfc.c != null) {
                        i3 = adfc.a((TextView) findViewById.findViewById(R.id.header), c);
                        i4 = adfh.a(c - i3, adfc.c.doubleValue(), adfc.b.getWidth());
                        ImageView imageView = (ImageView) findViewById.findViewById(R.id.illustration);
                        if (imageView == null) {
                            ((anih) ((anih) adfc.a.b()).a("adfc", "b", 138, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot find illustrationView.");
                        } else if (i4 != 0) {
                            if (!(imageView.getVisibility() == 0 && imageView.getMaxHeight() == i4)) {
                                imageView.setVisibility(0);
                                imageView.setMaxHeight(i4);
                            }
                        } else if (imageView.getVisibility() != 8) {
                            imageView.setVisibility(8);
                        }
                    } else {
                        i4 = 0;
                        i3 = 0;
                    }
                    if (i4 > 0) {
                        c = i4 + i3;
                    }
                    if (findViewById.getMinimumHeight() != c) {
                        findViewById.setMinimumHeight(c);
                        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                        layoutParams.height = c;
                        findViewById.setLayoutParams(layoutParams);
                    }
                }
            } else {
                View findViewById2 = adfc.b.findViewById(R.id.udc_consent_header);
                if (findViewById2 == null) {
                    ((anih) ((anih) adfc.a.b()).a("adfc", "a", 63, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot find headerView.");
                } else {
                    int c2 = adfc.c();
                    if (adfc.c != null) {
                        i = adfc.a((TextView) findViewById2.findViewById(R.id.header), c2);
                        i2 = adfh.a(c2 - i, adfc.c.doubleValue(), adfc.b.getWidth());
                        ImageView imageView2 = (ImageView) findViewById2.findViewById(R.id.illustration);
                        if (imageView2 == null) {
                            ((anih) ((anih) adfc.a.b()).a("adfc", "a", 82, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot find illustrationView.");
                        } else if (i2 != 0) {
                            imageView2.setMaxHeight(i2);
                            if (imageView2.getVisibility() != 0) {
                                imageView2.setVisibility(0);
                            }
                        } else if (imageView2.getVisibility() != 8) {
                            imageView2.setVisibility(8);
                        }
                    } else {
                        i2 = 0;
                        i = 0;
                    }
                    if (i2 > 0) {
                        c2 = i2 + i;
                    }
                    ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
                    if (layoutParams2.height != c2) {
                        findViewById2.setMinimumHeight(c2);
                        layoutParams2.height = c2;
                        findViewById2.setLayoutParams(layoutParams2);
                    }
                }
            }
        }
        adgl adgl = this.p;
        if (adgl != null) {
            if (adgl.a()) {
                adgl.a(adgl.c, 0);
                adgl.a(adgl.d, 0);
                adgl.a(adgl.a, 4);
                adgl.a(adgl.b, 4);
            } else {
                adgl.a(adgl.c, 4);
                adgl.a(adgl.d, 4);
                adgl.a(adgl.a, 0);
                adgl.a(adgl.b, 0);
            }
        }
        ScrollViewWithEvents scrollViewWithEvents = this.n;
        if (scrollViewWithEvents != null) {
            if (this.k || scrollViewWithEvents.a()) {
                z = true;
            }
            a(z);
        }
    }

    private final oq a(atyx atyx) {
        int color = getResources().getColor(R.color.udc_header_default_background);
        atzn atzn = atyx.e;
        if (atzn == null) {
            atzn = atzn.d;
        }
        if (!adgq.a(atzn)) {
            try {
                color = Color.parseColor(atzn.c);
            } catch (IllegalArgumentException e) {
            }
            return new oq(Integer.valueOf(color), atzn);
        }
        atzn = null;
        return new oq(Integer.valueOf(color), atzn);
    }

    private final void a(View view, oq oqVar) {
        if (view != null) {
            view.setBackgroundColor(((Integer) oqVar.a).intValue());
            this.c.b((atzn) oqVar.b);
        }
    }

    private final void a(boolean z) {
        TextView textView;
        int i;
        if (getActivity() != null && (textView = (TextView) getActivity().findViewById(R.id.action_button_positive)) != null) {
            Resources resources = getResources();
            if (!z) {
                i = R.color.udc_button_default;
            } else {
                i = R.color.udc_button_highlight;
            }
            textView.setTextColor(resources.getColor(i));
        }
    }

    /* access modifiers changed from: protected */
    public final void a(adfk adfk, boolean z, boolean z2) {
        if (z) {
            adfk.a(R.layout.udc_consent_separator);
            if (z2) {
                adfk.a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0085, code lost:
        r2 = getResources().getIdentifier("status_bar_height", "dimen", "android");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.ViewGroup r17, android.view.LayoutInflater r18, com.google.android.gms.udc.ConsentFlowConfig r19, defpackage.atyx r20) {
        /*
            r16 = this;
            r6 = r16
            r0 = r17
            r1 = r18
            r7 = r20
            r2 = 2131429746(0x7f0b0972, float:1.8481173E38)
            android.view.View r2 = r0.findViewById(r2)
            com.google.android.gms.common.widget.phone.ScrollViewWithEvents r2 = (com.google.android.gms.common.widget.phone.ScrollViewWithEvents) r2
            r6.n = r2
            r2.a = r6
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
            r2.addOnGlobalLayoutListener(r6)
            r2 = 2131429741(0x7f0b096d, float:1.8481163E38)
            android.view.View r2 = r0.findViewById(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r6.a(r2)
            adfk r8 = new adfk
            r8.<init>(r1, r2)
            r4 = r19
            boolean r2 = r4.c
            r6.m = r2
            r2 = 2131429751(0x7f0b0977, float:1.8481184E38)
            android.view.View r2 = r0.findViewById(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r6.o = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            android.content.res.Resources r2 = r16.getResources()
            boolean r2 = defpackage.jix.a((android.content.res.Resources) r2)
            r9 = 1
            r2 = r2 ^ r9
            if (r2 != 0) goto L_0x004d
            goto L_0x0050
        L_0x004d:
            r16.b()
        L_0x0050:
            atzn r3 = r7.f
            if (r3 != 0) goto L_0x0056
            atzn r3 = defpackage.atzn.d
        L_0x0056:
            boolean r3 = defpackage.adgq.a(r3)
            r5 = 2131429750(0x7f0b0976, float:1.8481182E38)
            r10 = 0
            if (r3 != 0) goto L_0x00b7
            android.view.ViewGroup r3 = r6.o
            android.view.View r3 = r3.findViewById(r5)
            android.support.v7.widget.Toolbar r3 = (android.support.v7.widget.Toolbar) r3
            java.lang.CharSequence r11 = r6.g
            r3.a((java.lang.CharSequence) r11)
            oq r11 = r6.a((defpackage.atyx) r7)
            r6.a((android.view.View) r3, (defpackage.oq) r11)
            java.lang.Object r11 = r11.a
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            int r11 = r6.a((int) r11)
            r3.b((int) r11)
            if (r2 == 0) goto L_0x009e
            android.content.res.Resources r2 = r16.getResources()
            java.lang.String r11 = "status_bar_height"
            java.lang.String r12 = "dimen"
            java.lang.String r13 = "android"
            int r2 = r2.getIdentifier(r11, r12, r13)
            if (r2 <= 0) goto L_0x009e
            android.content.res.Resources r11 = r16.getResources()
            int r2 = r11.getDimensionPixelSize(r2)
            goto L_0x009f
        L_0x009e:
            r2 = 0
        L_0x009f:
            r6.r = r2
            int r2 = r3.getPaddingLeft()
            int r11 = r3.getPaddingTop()
            int r12 = r6.r
            int r11 = r11 + r12
            int r12 = r3.getPaddingRight()
            int r13 = r3.getPaddingBottom()
            r3.setPadding(r2, r11, r12, r13)
        L_0x00b7:
            boolean r2 = r6.m
            r3 = 2131428622(0x7f0b050e, float:1.8478894E38)
            r11 = 0
            if (r2 == 0) goto L_0x0131
            android.view.ViewGroup r2 = r6.o
            android.view.View r2 = r2.findViewById(r5)
            android.support.v7.widget.Toolbar r2 = (android.support.v7.widget.Toolbar) r2
            r2.setVisibility(r10)
            android.view.ViewGroup r5 = r6.o
            r12 = 2131429752(0x7f0b0978, float:1.8481186E38)
            android.view.View r5 = r5.findViewById(r12)
            r5.setVisibility(r10)
            r12 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x00dd
            r2.setAlpha(r12)
        L_0x00dd:
            if (r5 != 0) goto L_0x00e0
            goto L_0x00e4
        L_0x00e0:
            r5.setAlpha(r12)
        L_0x00e4:
            java.lang.CharSequence r2 = r6.g
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00ff
            adgq r2 = r6.c
            int r5 = r7.a
            r5 = r5 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x00fb
            atzn r5 = r7.f
            if (r5 != 0) goto L_0x00fc
            atzn r5 = defpackage.atzn.d
            goto L_0x00fc
        L_0x00fb:
            r5 = r11
        L_0x00fc:
            r2.b(r5)
        L_0x00ff:
            r2 = 2131429742(0x7f0b096e, float:1.8481165E38)
            android.view.View r0 = r0.findViewById(r2)
            int r2 = r0.getPaddingTop()
            android.content.res.Resources r5 = r16.getResources()
            r12 = 2131167502(0x7f07090e, float:1.794928E38)
            int r5 = r5.getDimensionPixelSize(r12)
            int r2 = r2 + r5
            int r5 = android.os.Build.VERSION.SDK_INT
            r12 = 22
            if (r5 >= r12) goto L_0x011d
            goto L_0x0120
        L_0x011d:
            int r5 = r6.r
            int r2 = r2 + r5
        L_0x0120:
            int r5 = r0.getPaddingLeft()
            int r12 = r0.getRight()
            int r13 = r0.getPaddingBottom()
            r0.setPadding(r5, r2, r12, r13)
            goto L_0x01c9
        L_0x0131:
            r2 = 2131625061(0x7f0e0465, float:1.887732E38)
            android.view.View r2 = r8.a(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 == 0) goto L_0x01c9
            oq r5 = r6.a((defpackage.atyx) r7)
            r6.a((android.view.View) r2, (defpackage.oq) r5)
            adfk r12 = new adfk
            r12.<init>(r1, r2)
            int r2 = r7.a
            r2 = r2 & 16
            if (r2 == 0) goto L_0x0179
            r2 = 2131625062(0x7f0e0466, float:1.8877321E38)
            android.view.View r2 = r12.a(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            adgq r13 = r6.c
            atzf r14 = r7.d
            if (r14 != 0) goto L_0x015f
            atzf r14 = defpackage.atzf.d
        L_0x015f:
            r15 = 2131428675(0x7f0b0543, float:1.8479001E38)
            com.android.volley.toolbox.ImageLoader r10 = r6.a
            r13.a((android.view.View) r2, (int) r15, (defpackage.atzf) r14, (com.android.volley.toolbox.ImageLoader) r10)
            atzf r2 = r7.d
            if (r2 == 0) goto L_0x016c
            goto L_0x016e
        L_0x016c:
            atzf r2 = defpackage.atzf.d
        L_0x016e:
            java.lang.String r2 = r2.c
            double r13 = defpackage.adfh.a(r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r13)
            goto L_0x017a
        L_0x0179:
            r2 = r11
        L_0x017a:
            r10 = 2131625066(0x7f0e046a, float:1.887733E38)
            android.view.View r10 = r12.a(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            adgq r12 = r6.c
            atzn r13 = r7.f
            if (r13 == 0) goto L_0x018a
            goto L_0x018c
        L_0x018a:
            atzn r13 = defpackage.atzn.d
        L_0x018c:
            r12.a((android.view.View) r10, (int) r3, (defpackage.atzn) r13)
            java.lang.Object r5 = r5.a
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r5 = r6.a((int) r5)
            r10.setTextColor(r5)
            adgl r5 = new adgl
            com.google.android.gms.common.widget.phone.ScrollViewWithEvents r10 = r6.n
            android.view.ViewGroup r12 = r6.o
            r5.<init>(r10, r12)
            r6.p = r5
            com.google.android.gms.common.widget.phone.ScrollViewWithEvents r10 = r6.n
            r10.b = r5
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources r10 = r16.getResources()
            r12 = 2131167475(0x7f0708f3, float:1.7949225E38)
            r10.getValue(r12, r5, r9)
            adfc r10 = new adfc
            float r5 = r5.getFloat()
            double r12 = (double) r5
            r10.<init>(r0, r12, r2)
            r6.q = r10
        L_0x01c9:
            r0 = 2131625076(0x7f0e0474, float:1.887735E38)
            r8.a(r0)
            int r0 = r7.a
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01e9
            r0 = 2131625069(0x7f0e046d, float:1.8877336E38)
            android.view.View r0 = r8.a(r0)
            adgq r2 = r6.c
            atzn r5 = r7.g
            if (r5 != 0) goto L_0x01e4
            atzn r5 = defpackage.atzn.d
        L_0x01e4:
            java.lang.String r10 = r6.b
            r2.a((android.view.View) r0, (defpackage.atzn) r5, (java.lang.String) r10)
        L_0x01e9:
            int r0 = r7.a
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0209
            r0 = 2131625068(0x7f0e046c, float:1.8877334E38)
            android.view.View r0 = r8.a(r0)
            adgq r2 = r6.c
            atzn r5 = r7.h
            if (r5 == 0) goto L_0x01fd
            goto L_0x01ff
        L_0x01fd:
            atzn r5 = defpackage.atzn.d
        L_0x01ff:
            r2.a((android.view.View) r0, (int) r3, (defpackage.atzn) r5)
            r0 = 2131625071(0x7f0e046f, float:1.887734E38)
            r8.a(r0)
        L_0x0209:
            r5 = 2131625072(0x7f0e0470, float:1.8877342E38)
            r0 = r16
            r1 = r18
            r2 = r8
            r3 = r20
            r4 = r19
            boolean r0 = r0.a(r1, r2, r3, r4, r5)
            aucx r1 = r7.j
            int r2 = r1.size()
            r3 = 0
            r4 = 1
        L_0x0221:
            if (r3 >= r2) goto L_0x0274
            java.lang.Object r5 = r1.get(r3)
            atzn r5 = (defpackage.atzn) r5
            boolean r10 = defpackage.adgq.a(r5)
            if (r10 == 0) goto L_0x0230
            goto L_0x0271
        L_0x0230:
            if (r4 != 0) goto L_0x0233
            goto L_0x0262
        L_0x0233:
            if (r0 != 0) goto L_0x025d
            android.view.ViewGroup r0 = r8.a
            int r0 = r0.getChildCount()
            if (r0 == 0) goto L_0x024a
            android.view.ViewGroup r0 = r8.a
            int r4 = r0.getChildCount()
            int r4 = r4 + -1
            android.view.View r0 = r0.getChildAt(r4)
            goto L_0x024b
        L_0x024a:
            r0 = r11
        L_0x024b:
            if (r0 == 0) goto L_0x0258
            int r0 = r0.getId()
            r4 = 2131429748(0x7f0b0974, float:1.8481177E38)
            if (r0 == r4) goto L_0x0257
            goto L_0x0258
        L_0x0257:
            goto L_0x025b
        L_0x0258:
            r8.a()
        L_0x025b:
            r0 = 1
            goto L_0x0262
        L_0x025d:
            r6.a(r8, r9, r9)
            r0 = 1
        L_0x0262:
            r4 = 2131625077(0x7f0e0475, float:1.8877352E38)
            android.view.View r4 = r8.a(r4)
            adgq r10 = r6.c
            java.lang.String r12 = r6.b
            r10.a((android.view.View) r4, (defpackage.atzn) r5, (java.lang.String) r12)
            r4 = 0
        L_0x0271:
            int r3 = r3 + 1
            goto L_0x0221
        L_0x0274:
            atzn r1 = r7.k
            if (r1 != 0) goto L_0x027a
            atzn r1 = defpackage.atzn.d
        L_0x027a:
            boolean r1 = defpackage.adgq.a(r1)
            if (r1 != 0) goto L_0x0297
            r6.a(r8, r0, r9)
            r0 = 2131625056(0x7f0e0460, float:1.887731E38)
            android.view.View r0 = r8.a(r0)
            adgq r1 = r6.c
            atzn r2 = r7.k
            if (r2 != 0) goto L_0x0292
            atzn r2 = defpackage.atzn.d
        L_0x0292:
            java.lang.String r3 = r6.b
            r1.a((android.view.View) r0, (defpackage.atzn) r2, (java.lang.String) r3)
        L_0x0297:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adgm.a(android.view.ViewGroup, android.view.LayoutInflater, com.google.android.gms.udc.ConsentFlowConfig, atyx):void");
    }

    public final void a(ScrollView scrollView, boolean z) {
        super.a(scrollView, z);
        if (z) {
            a(true);
        }
    }
}
