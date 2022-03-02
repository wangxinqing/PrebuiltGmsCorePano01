package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.google.android.gms.R;
import java.util.List;

/* renamed from: cxt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cxt extends czj {
    private final int A;
    private final int B;
    private final int C;
    public final FrameLayout s;
    public final LinearLayout t;
    public final int u;
    final /* synthetic */ cxu v;
    private final CardView w;
    private final View x;
    private final int y;
    private final int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cxt(cxu cxu, View view) {
        super(view);
        this.v = cxu;
        this.w = (CardView) view.findViewById(R.id.card_view);
        this.s = (FrameLayout) view.findViewById(R.id.summary_card);
        this.t = (LinearLayout) view.findViewById(R.id.dynamic_content);
        this.x = view.findViewById(R.id.background);
        Resources resources = cxu.j.getResources();
        this.y = resources.getDimensionPixelSize(R.dimen.as_card_horizontal_spacing);
        this.z = resources.getDimensionPixelSize(R.dimen.as_card_block_vertical_padding);
        this.A = resources.getDimensionPixelSize(R.dimen.as_card_borderless_block_vertical_padding);
        this.B = resources.getDimensionPixelSize(R.dimen.as_card_deck_outer_padding);
        this.u = resources.getDimensionPixelSize(R.dimen.as_card_max_width);
        this.C = resources.getDimensionPixelSize(R.dimen.as_tappable_item_min_height);
        cxu.a((View) this.w, 1);
    }

    private final int a(int i, List list) {
        if (list.size() == 1) {
            return que.a(this.v.j, R.attr.asCardRoundedRipple, R.drawable.as_card_rounded_ripple_light);
        }
        if (i == 0) {
            return que.a(this.v.j, R.attr.asRippleRoundedTop, R.drawable.as_ripple_rounded_top_light);
        }
        if (i == list.size() - 1) {
            return que.a(this.v.j, R.attr.asRippleRoundedBottom, R.drawable.as_ripple_rounded_bottom_light);
        }
        return que.a(this.v.j, R.attr.asRipple, R.drawable.as_ripple_light);
    }

    private final View a(View view) {
        LinearLayout linearLayout = new LinearLayout(this.v.j);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i = -this.B;
        layoutParams.setMargins(i, 0, i, 0);
        linearLayout.setLayoutParams(layoutParams);
        int i2 = this.B;
        linearLayout.setPadding(i2, 0, i2, 0);
        linearLayout.addView(view);
        return linearLayout;
    }

    /* JADX WARNING: type inference failed for: r3v68, types: [acg] */
    /* JADX WARNING: type inference failed for: r16v4, types: [cwp] */
    /* JADX WARNING: type inference failed for: r10v74, types: [cwo] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.view.View a(defpackage.aqpx r34) {
        /*
            r33 = this;
            r0 = r33
            r2 = r34
            int r1 = r2.b
            r8 = 4
            r3 = 2131428677(0x7f0b0545, float:1.8479005E38)
            r9 = 1
            r4 = 0
            if (r1 != r9) goto L_0x0091
            cww r1 = new cww
            android.widget.LinearLayout r5 = r0.t
            cxu r6 = r0.v
            cyg r7 = r6.h
            djk r6 = r6.k
            r1.<init>(r2, r5, r7, r6)
            java.lang.Object r2 = r1.a
            aqpx r2 = (defpackage.aqpx) r2
            int r5 = r2.b
            if (r5 != r9) goto L_0x0028
            java.lang.Object r2 = r2.c
            aqqy r2 = (defpackage.aqqy) r2
            goto L_0x002a
        L_0x0028:
            aqqy r2 = defpackage.aqqy.g
        L_0x002a:
            android.view.View r5 = r1.c
            r6 = 2131429684(0x7f0b0934, float:1.8481048E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            android.view.View r6 = r1.c
            r7 = 2131427940(0x7f0b0264, float:1.847751E38)
            android.view.View r6 = r6.findViewById(r7)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.String r7 = r2.b
            defpackage.cyd.a((android.widget.TextView) r5, (java.lang.String) r7)
            java.lang.String r7 = r2.c
            defpackage.cyd.a((android.widget.TextView) r6, (java.lang.String) r7)
            int r7 = r2.a
            r7 = r7 & r9
            if (r7 != 0) goto L_0x005b
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r7 = (android.widget.LinearLayout.LayoutParams) r7
            r7.setMargins(r4, r4, r4, r4)
            r6.setLayoutParams(r7)
        L_0x005b:
            java.lang.String r7 = r2.e
            aqsr r10 = r2.f
            if (r10 != 0) goto L_0x0063
            aqsr r10 = defpackage.aqsr.d
        L_0x0063:
            cyg r11 = r1.d
            defpackage.cyd.a((android.widget.TextView) r6, (java.lang.String) r7, (defpackage.aqsr) r10, (defpackage.cyg) r11)
            djk r6 = r1.f
            android.view.View r7 = r1.c
            android.view.View r3 = r7.findViewById(r3)
            com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView r3 = (com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView) r3
            int r7 = r2.a
            r7 = r7 & r8
            if (r7 == 0) goto L_0x0079
            r4 = 1
            goto L_0x007a
        L_0x0079:
        L_0x007a:
            aqrl r2 = r2.d
            if (r2 != 0) goto L_0x0080
            aqrl r2 = defpackage.aqrl.g
        L_0x0080:
            defpackage.cyd.a((defpackage.djk) r6, (com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView) r3, (boolean) r4, (defpackage.aqrl) r2)
            android.view.View r2 = r1.c
            r2.setFocusable(r9)
            r2 = 2132017245(0x7f14005d, float:1.9672763E38)
            defpackage.ry.a((android.widget.TextView) r5, (int) r2)
            android.view.View r1 = r1.c
            return r1
        L_0x0091:
            r10 = 2
            if (r1 != r10) goto L_0x00d7
            cxu r1 = r0.v
            android.content.Context r1 = r1.j
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r5 = 2131624043(0x7f0e006b, float:1.8875255E38)
            androidx.cardview.widget.CardView r6 = r0.w
            android.view.View r1 = r1.inflate(r5, r6, r4)
            cxu r5 = r0.v
            djk r5 = r5.k
            android.view.View r3 = r1.findViewById(r3)
            com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView r3 = (com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView) r3
            int r6 = r2.b
            if (r6 != r10) goto L_0x00b8
            java.lang.Object r6 = r2.c
            aqrm r6 = (defpackage.aqrm) r6
            goto L_0x00ba
        L_0x00b8:
            aqrm r6 = defpackage.aqrm.c
        L_0x00ba:
            int r6 = r6.a
            r6 = r6 & r9
            int r7 = r2.b
            if (r7 != r10) goto L_0x00c6
            java.lang.Object r2 = r2.c
            aqrm r2 = (defpackage.aqrm) r2
            goto L_0x00c8
        L_0x00c6:
            aqrm r2 = defpackage.aqrm.c
        L_0x00c8:
            aqrl r2 = r2.b
            if (r2 != 0) goto L_0x00ce
            aqrl r2 = defpackage.aqrl.g
        L_0x00ce:
            if (r6 != 0) goto L_0x00d2
            r9 = 0
            goto L_0x00d3
        L_0x00d2:
        L_0x00d3:
            defpackage.cyd.a((defpackage.djk) r5, (com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView) r3, (boolean) r9, (defpackage.aqrl) r2)
            return r1
        L_0x00d7:
            r11 = 3
            if (r1 == r11) goto L_0x0ad6
            r5 = 2131428659(0x7f0b0533, float:1.8478969E38)
            r6 = 5
            r7 = 2131427837(0x7f0b01fd, float:1.8477302E38)
            r13 = 16
            r14 = 17
            r16 = 0
            r12 = 8
            if (r1 != r6) goto L_0x02a4
            cwy r1 = new cwy
            android.widget.LinearLayout r11 = r0.t
            cxu r8 = r0.v
            cyg r15 = r8.h
            djk r8 = r8.k
            r1.<init>(r2, r11, r15, r8)
            java.lang.Object r2 = r1.a
            aqpx r2 = (defpackage.aqpx) r2
            int r8 = r2.b
            if (r8 != r6) goto L_0x0105
            java.lang.Object r2 = r2.c
            aqrs r2 = (defpackage.aqrs) r2
            goto L_0x0107
        L_0x0105:
            aqrs r2 = defpackage.aqrs.k
        L_0x0107:
            android.view.View r6 = r1.c
            android.view.View r5 = r6.findViewById(r5)
            com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView r5 = (com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView) r5
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r6 = (android.widget.LinearLayout.LayoutParams) r6
            int r8 = r2.i
            if (r8 != r9) goto L_0x011e
            r8 = 48
            r6.gravity = r8
            goto L_0x0120
        L_0x011e:
            r6.gravity = r14
        L_0x0120:
            r5.setLayoutParams(r6)
            djk r8 = r1.f
            int r11 = r2.a
            r11 = r11 & r12
            if (r11 == 0) goto L_0x012c
            r11 = 1
            goto L_0x012d
        L_0x012c:
            r11 = 0
        L_0x012d:
            aqrl r12 = r2.g
            if (r12 != 0) goto L_0x0133
            aqrl r12 = defpackage.aqrl.g
        L_0x0133:
            defpackage.cyd.a((defpackage.djk) r8, (com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView) r5, (boolean) r11, (defpackage.aqrl) r12)
            android.view.View r5 = r1.c
            r8 = 2131429419(0x7f0b082b, float:1.848051E38)
            android.view.View r5 = r5.findViewById(r8)
            com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView r5 = (com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView) r5
            r5.setLayoutParams(r6)
            r5.setVisibility(r4)
            djk r6 = r1.f
            int r8 = r2.a
            r8 = r8 & r13
            if (r8 == 0) goto L_0x0150
            r8 = 1
            goto L_0x0151
        L_0x0150:
            r8 = 0
        L_0x0151:
            aqrl r11 = r2.h
            if (r11 == 0) goto L_0x0156
            goto L_0x0158
        L_0x0156:
            aqrl r11 = defpackage.aqrl.g
        L_0x0158:
            defpackage.cyd.a((defpackage.djk) r6, (com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView) r5, (boolean) r8, (defpackage.aqrl) r11)
            djk r5 = r1.f
            android.view.View r6 = r1.c
            android.view.View r6 = r6.findViewById(r3)
            com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView r6 = (com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView) r6
            int r8 = r2.a
            r8 = r8 & r9
            aqrl r11 = r2.b
            if (r11 != 0) goto L_0x016e
            aqrl r11 = defpackage.aqrl.g
        L_0x016e:
            if (r8 != 0) goto L_0x0172
            r8 = 0
            goto L_0x0173
        L_0x0172:
            r8 = 1
        L_0x0173:
            defpackage.cyd.a((defpackage.djk) r5, (com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView) r6, (boolean) r8, (defpackage.aqrl) r11)
            android.view.View r5 = r1.c
            android.view.View r5 = r5.findViewById(r7)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            aucx r6 = r2.j
            int r6 = r6.size()
            if (r6 > 0) goto L_0x0295
            int r6 = r2.a
            r6 = r6 & r10
            if (r6 == 0) goto L_0x01a7
            android.widget.TextView r6 = new android.widget.TextView
            android.content.Context r7 = r1.e
            r6.<init>(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r8 = -2
            r11 = -1
            r7.<init>(r11, r8)
            r6.setLayoutParams(r7)
            defpackage.cyd.a((android.widget.TextView) r6, (int) r10)
            java.lang.String r7 = r2.c
            defpackage.cyd.a((android.widget.TextView) r6, (java.lang.String) r7)
            r5.addView(r6)
        L_0x01a7:
            aucx r6 = r2.d
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x01ea
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            android.content.Context r7 = r1.e
            r6.<init>(r7)
            r6.setOrientation(r9)
            aucx r7 = r2.d
            int r8 = r7.size()
            r11 = 0
        L_0x01c0:
            if (r11 >= r8) goto L_0x01e7
            java.lang.Object r12 = r7.get(r11)
            java.lang.String r12 = (java.lang.String) r12
            android.widget.TextView r13 = new android.widget.TextView
            android.content.Context r14 = r1.e
            r13.<init>(r14)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r10 = -1
            r15 = -2
            r14.<init>(r10, r15)
            r13.setLayoutParams(r14)
            r10 = 3
            defpackage.cyd.a((android.widget.TextView) r13, (int) r10)
            defpackage.cyd.a((android.widget.TextView) r13, (java.lang.String) r12)
            r6.addView(r13)
            int r11 = r11 + 1
            r10 = 2
            goto L_0x01c0
        L_0x01e7:
            r5.addView(r6)
        L_0x01ea:
            aucx r6 = r2.e
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x022c
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            android.content.Context r7 = r1.e
            r6.<init>(r7)
            r6.setOrientation(r9)
            aucx r7 = r2.e
            int r8 = r7.size()
            r10 = 0
        L_0x0203:
            if (r10 >= r8) goto L_0x0229
            java.lang.Object r11 = r7.get(r10)
            java.lang.String r11 = (java.lang.String) r11
            android.widget.TextView r12 = new android.widget.TextView
            android.content.Context r13 = r1.e
            r12.<init>(r13)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r14 = -2
            r15 = -1
            r13.<init>(r15, r14)
            r12.setLayoutParams(r13)
            r13 = 4
            defpackage.cyd.a((android.widget.TextView) r12, (int) r13)
            defpackage.cyd.a((android.widget.TextView) r12, (java.lang.String) r11)
            r6.addView(r12)
            int r10 = r10 + 1
            goto L_0x0203
        L_0x0229:
            r5.addView(r6)
        L_0x022c:
            int r6 = r2.a
            r7 = 4
            r6 = r6 & r7
            if (r6 == 0) goto L_0x0284
            android.content.Context r6 = r1.e
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r7 = 2131624050(0x7f0e0072, float:1.8875269E38)
            android.widget.LinearLayout r8 = r1.b
            android.view.View r6 = r6.inflate(r7, r8, r4)
            aqtd r2 = r2.f
            if (r2 != 0) goto L_0x0247
            aqtd r2 = defpackage.aqtd.e
        L_0x0247:
            r7 = 2131429645(0x7f0b090d, float:1.8480969E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.String r8 = r2.b
            int r10 = r2.a
            r11 = 4
            r10 = r10 & r11
            if (r10 == 0) goto L_0x0262
            avoo r10 = r2.d
            if (r10 != 0) goto L_0x0264
            avoo r16 = defpackage.avoo.e
            r10 = r16
            goto L_0x0264
        L_0x0262:
            r10 = r16
        L_0x0264:
            defpackage.cyd.a((android.widget.TextView) r7, (java.lang.String) r8, (defpackage.avoo) r10)
            djk r7 = r1.f
            android.view.View r3 = r6.findViewById(r3)
            com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView r3 = (com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView) r3
            int r8 = r2.a
            r10 = 2
            r8 = r8 & r10
            if (r8 == 0) goto L_0x0277
            r4 = 1
            goto L_0x0278
        L_0x0277:
        L_0x0278:
            aqrl r2 = r2.c
            if (r2 != 0) goto L_0x027e
            aqrl r2 = defpackage.aqrl.g
        L_0x027e:
            defpackage.cyd.a((defpackage.djk) r7, (com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView) r3, (boolean) r4, (defpackage.aqrl) r2)
            r5.addView(r6)
        L_0x0284:
            android.content.Context r2 = r1.e
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131165506(0x7f070142, float:1.7945231E38)
            int r2 = r2.getDimensionPixelOffset(r3)
            defpackage.cyd.b(r5, r2)
            goto L_0x029c
        L_0x0295:
            djk r3 = r1.f
            aucx r2 = r2.j
            defpackage.cyd.a((defpackage.djk) r3, (android.widget.LinearLayout) r5, (java.util.List) r2)
        L_0x029c:
            android.view.View r2 = r1.c
            r2.setFocusable(r9)
            android.view.View r1 = r1.c
            return r1
        L_0x02a4:
            r6 = 6
            if (r1 != r6) goto L_0x02ac
            java.lang.Object r1 = r2.c
            aqqm r1 = (defpackage.aqqm) r1
            goto L_0x02ae
        L_0x02ac:
            aqqm r1 = defpackage.aqqm.h
        L_0x02ae:
            aucx r1 = r1.b
            int r1 = r1.size()
            if (r1 != 0) goto L_0x05ec
            int r1 = r2.b
            r8 = 9
            if (r1 != r8) goto L_0x0345
            cwf r1 = new cwf
            android.widget.LinearLayout r3 = r0.t
            cxu r5 = r0.v
            cyg r6 = r5.h
            djk r5 = r5.k
            r1.<init>(r2, r3, r6, r5)
            java.lang.Object r2 = r1.a
            aqpx r2 = (defpackage.aqpx) r2
            int r3 = r2.b
            if (r3 != r8) goto L_0x02d6
            java.lang.Object r2 = r2.c
            aqpn r2 = (defpackage.aqpn) r2
            goto L_0x02d8
        L_0x02d6:
            aqpn r2 = defpackage.aqpn.b
        L_0x02d8:
            awgy r3 = defpackage.awgy.a
            awgz r3 = r3.a()
            boolean r3 = r3.l()
            if (r3 != 0) goto L_0x02f5
            cwo r3 = new cwo
            android.content.Context r11 = r1.e
            aucx r12 = r2.a
            cyg r13 = r1.d
            android.widget.LinearLayout r14 = r1.b
            djk r15 = r1.f
            r10 = r3
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x0310
        L_0x02f5:
            cwp r3 = new cwp
            android.content.Context r5 = r1.e
            aucx r2 = r2.a
            cyg r6 = r1.d
            android.widget.LinearLayout r7 = r1.b
            djk r8 = r1.f
            r16 = r3
            r17 = r5
            r18 = r2
            r19 = r6
            r20 = r7
            r21 = r8
            r16.<init>(r17, r18, r19, r20, r21)
        L_0x0310:
            android.view.View r2 = r1.c
            r5 = 2131428648(0x7f0b0528, float:1.8478946E38)
            android.view.View r2 = r2.findViewById(r5)
            android.support.v7.widget.RecyclerView r2 = (android.support.v7.widget.RecyclerView) r2
            abk r5 = new abk
            r5.<init>(r4)
            czk r6 = new czk
            android.content.Context r7 = r1.e
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131165368(0x7f0700b8, float:1.7944951E38)
            int r7 = r7.getDimensionPixelSize(r8)
            r6.<init>(r7)
            r2.addItemDecoration(r6)
            r2.setNestedScrollingEnabled(r4)
            r2.setLayoutManager(r5)
            r2.swapAdapter(r3, r9)
            android.view.View r1 = r1.c
            android.view.View r1 = r0.a((android.view.View) r1)
            return r1
        L_0x0345:
            if (r1 != r12) goto L_0x0391
            cwq r1 = new cwq
            android.widget.LinearLayout r3 = r0.t
            cxu r6 = r0.v
            cyg r7 = r6.h
            djk r6 = r6.k
            r1.<init>(r2, r3, r7, r6)
            java.lang.Object r2 = r1.a
            aqpx r2 = (defpackage.aqpx) r2
            int r3 = r2.b
            if (r3 != r12) goto L_0x0361
            java.lang.Object r2 = r2.c
            aqpo r2 = (defpackage.aqpo) r2
            goto L_0x0363
        L_0x0361:
            aqpo r2 = defpackage.aqpo.d
        L_0x0363:
            android.view.View r3 = r1.c
            r6 = 2131428794(0x7f0b05ba, float:1.8479243E38)
            android.view.View r3 = r3.findViewById(r6)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.String r6 = r2.b
            defpackage.cyd.a((android.widget.TextView) r3, (java.lang.String) r6)
            djk r3 = r1.f
            android.view.View r6 = r1.c
            android.view.View r5 = r6.findViewById(r5)
            com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView r5 = (com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView) r5
            int r6 = r2.a
            r7 = 2
            r6 = r6 & r7
            if (r6 == 0) goto L_0x0384
            goto L_0x0385
        L_0x0384:
            r9 = 0
        L_0x0385:
            aqrl r2 = r2.c
            if (r2 != 0) goto L_0x038b
            aqrl r2 = defpackage.aqrl.g
        L_0x038b:
            defpackage.cyd.a((defpackage.djk) r3, (com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView) r5, (boolean) r9, (defpackage.aqrl) r2)
            android.view.View r1 = r1.c
            return r1
        L_0x0391:
            r8 = 10
            if (r1 != r8) goto L_0x0497
            cwz r10 = new cwz
            android.widget.LinearLayout r3 = r0.t
            cxu r1 = r0.v
            cyg r4 = r1.h
            djk r5 = r1.k
            agcf r6 = r1.e
            dii r7 = r1.f
            r1 = r10
            r2 = r34
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.lang.Object r1 = r10.a
            aqpx r1 = (defpackage.aqpx) r1
            int r2 = r1.b
            if (r2 != r8) goto L_0x03b6
            java.lang.Object r1 = r1.c
            aqsf r1 = (defpackage.aqsf) r1
            goto L_0x03b8
        L_0x03b6:
            aqsf r1 = defpackage.aqsf.g
        L_0x03b8:
            android.view.View r2 = r10.c
            r3 = 2131429656(0x7f0b0918, float:1.848099E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            aucx r3 = r1.f
            int r3 = r3.size()
            if (r3 > 0) goto L_0x044b
            java.lang.String r3 = r1.b
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x03f0
            android.widget.TextView r3 = new android.widget.TextView
            android.content.Context r4 = r10.e
            r3.<init>(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r6 = -1
            r4.<init>(r6, r5)
            r3.setLayoutParams(r4)
            r4 = 2
            defpackage.cyd.a((android.widget.TextView) r3, (int) r4)
            java.lang.String r4 = r1.b
            defpackage.cyd.a((android.widget.TextView) r3, (java.lang.String) r4)
            r2.addView(r3)
        L_0x03f0:
            java.lang.String r3 = r1.c
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0415
            android.widget.TextView r3 = new android.widget.TextView
            android.content.Context r4 = r10.e
            r3.<init>(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r6 = -1
            r4.<init>(r6, r5)
            r3.setLayoutParams(r4)
            r4 = 3
            defpackage.cyd.a((android.widget.TextView) r3, (int) r4)
            java.lang.String r4 = r1.c
            defpackage.cyd.a((android.widget.TextView) r3, (java.lang.String) r4)
            r2.addView(r3)
        L_0x0415:
            java.lang.String r3 = r1.d
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x043a
            android.widget.TextView r3 = new android.widget.TextView
            android.content.Context r4 = r10.e
            r3.<init>(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r6 = -1
            r4.<init>(r6, r5)
            r3.setLayoutParams(r4)
            r4 = 4
            defpackage.cyd.a((android.widget.TextView) r3, (int) r4)
            java.lang.String r4 = r1.d
            defpackage.cyd.a((android.widget.TextView) r3, (java.lang.String) r4)
            r2.addView(r3)
        L_0x043a:
            android.content.Context r3 = r10.e
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131165506(0x7f070142, float:1.7945231E38)
            int r3 = r3.getDimensionPixelOffset(r4)
            defpackage.cyd.b(r2, r3)
            goto L_0x0452
        L_0x044b:
            djk r3 = r10.f
            aucx r4 = r1.f
            defpackage.cyd.a((defpackage.djk) r3, (android.widget.LinearLayout) r2, (java.util.List) r4)
        L_0x0452:
            android.view.View r2 = r10.c
            r3 = 2131427619(0x7f0b0123, float:1.847686E38)
            android.view.View r2 = r2.findViewById(r3)
            com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc r2 = (com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc) r2
            cxv r3 = new cxv
            agcf r4 = r10.g
            r3.<init>(r2, r4)
            dii r4 = r10.h
            amri r4 = defpackage.amri.c(r4)
            r3.a(r4)
            int r3 = r1.a
            r3 = r3 & r12
            if (r3 == 0) goto L_0x0488
            r2.setClickable(r9)
            r2.setFocusable(r9)
            android.content.Context r3 = r10.e
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131952170(0x7f13022a, float:1.9540775E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setContentDescription(r3)
        L_0x0488:
            aqsr r1 = r1.e
            if (r1 == 0) goto L_0x048d
            goto L_0x048f
        L_0x048d:
            aqsr r1 = defpackage.aqsr.d
        L_0x048f:
            cyg r3 = r10.d
            defpackage.cyd.a((android.view.View) r2, (defpackage.aqsr) r1, (defpackage.cyg) r3)
            android.view.View r1 = r10.c
            return r1
        L_0x0497:
            r5 = 12
            if (r1 != r5) goto L_0x0556
            cxa r1 = new cxa
            android.widget.LinearLayout r3 = r0.t
            cxu r4 = r0.v
            cyg r6 = r4.h
            djk r4 = r4.k
            r1.<init>(r2, r3, r6, r4)
            java.lang.Object r2 = r1.a
            aqpx r2 = (defpackage.aqpx) r2
            int r3 = r2.b
            if (r3 != r5) goto L_0x04b5
            java.lang.Object r2 = r2.c
            aqsh r2 = (defpackage.aqsh) r2
            goto L_0x04b7
        L_0x04b5:
            aqsh r2 = defpackage.aqsh.c
        L_0x04b7:
            android.view.View r3 = r1.c
            r4 = 2131429658(0x7f0b091a, float:1.8480995E38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            djk r4 = r1.f
            aucx r5 = r2.a
            defpackage.cyd.a((defpackage.djk) r4, (android.widget.LinearLayout) r3, (java.util.List) r5)
            android.view.View r3 = r1.c
            r4 = 2131428733(0x7f0b057d, float:1.8479119E38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            aqsg r4 = r2.b
            if (r4 == 0) goto L_0x04d9
            goto L_0x04db
        L_0x04d9:
            aqsg r4 = defpackage.aqsg.g
        L_0x04db:
            java.lang.String r4 = r4.e
            defpackage.cyd.a((android.widget.TextView) r3, (java.lang.String) r4)
            android.view.View r3 = r1.c
            r4 = 2131428732(0x7f0b057c, float:1.8479117E38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            aqsg r4 = r2.b
            if (r4 == 0) goto L_0x04f0
            goto L_0x04f2
        L_0x04f0:
            aqsg r4 = defpackage.aqsg.g
        L_0x04f2:
            java.lang.String r4 = r4.f
            defpackage.cyd.a((android.widget.TextView) r3, (java.lang.String) r4)
            android.view.View r3 = r1.c
            r4 = 2131429262(0x7f0b078e, float:1.8480192E38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
            aqsg r4 = r2.b
            if (r4 == 0) goto L_0x0507
            goto L_0x0509
        L_0x0507:
            aqsg r4 = defpackage.aqsg.g
        L_0x0509:
            float r4 = r4.b
            r5 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            r3.setProgress(r4)
            aqsg r4 = r2.b
            if (r4 == 0) goto L_0x0518
            goto L_0x051a
        L_0x0518:
            aqsg r4 = defpackage.aqsg.g
        L_0x051a:
            int r4 = r4.a
            r5 = 2
            r4 = r4 & r5
            if (r4 == 0) goto L_0x052f
            aqsg r4 = r2.b
            if (r4 == 0) goto L_0x0525
            goto L_0x0527
        L_0x0525:
            aqsg r4 = defpackage.aqsg.g
        L_0x0527:
            avoo r4 = r4.c
            if (r4 == 0) goto L_0x052c
            goto L_0x0531
        L_0x052c:
            avoo r4 = defpackage.avoo.e
            goto L_0x0531
        L_0x052f:
            r4 = r16
        L_0x0531:
            aqsg r5 = r2.b
            if (r5 == 0) goto L_0x0536
            goto L_0x0538
        L_0x0536:
            aqsg r5 = defpackage.aqsg.g
        L_0x0538:
            int r5 = r5.a
            r6 = 4
            r5 = r5 & r6
            if (r5 == 0) goto L_0x054e
            aqsg r2 = r2.b
            if (r2 == 0) goto L_0x0543
            goto L_0x0545
        L_0x0543:
            aqsg r2 = defpackage.aqsg.g
        L_0x0545:
            avoo r2 = r2.d
            if (r2 != 0) goto L_0x0550
            avoo r16 = defpackage.avoo.e
            r2 = r16
            goto L_0x0550
        L_0x054e:
            r2 = r16
        L_0x0550:
            defpackage.cyd.a((android.widget.ProgressBar) r3, (defpackage.avoo) r4, (defpackage.avoo) r2)
            android.view.View r1 = r1.c
            return r1
        L_0x0556:
            if (r1 != r13) goto L_0x05eb
            android.view.View r1 = r0.x
            cxu r5 = r0.v
            android.content.Context r5 = r5.j
            r8 = 2130968659(0x7f040053, float:1.7545978E38)
            android.graphics.drawable.Drawable r5 = defpackage.que.a((android.content.Context) r5, (int) r8)
            r1.setBackgroundDrawable(r5)
            cwx r1 = new cwx
            android.widget.LinearLayout r5 = r0.t
            cxu r8 = r0.v
            cyg r10 = r8.h
            djk r8 = r8.k
            r1.<init>(r2, r5, r10, r8)
            java.lang.Object r2 = r1.a
            aqpx r2 = (defpackage.aqpx) r2
            int r5 = r2.b
            if (r5 != r13) goto L_0x0582
            java.lang.Object r2 = r2.c
            aqrq r2 = (defpackage.aqrq) r2
            goto L_0x0584
        L_0x0582:
            aqrq r2 = defpackage.aqrq.b
        L_0x0584:
            android.view.View r5 = r1.c
            android.view.View r5 = r5.findViewById(r7)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            aucx r7 = r2.a
            int r7 = r7.size()
            if (r7 <= 0) goto L_0x05e8
            aucx r2 = r2.a
            int r7 = r2.size()
            r8 = 0
        L_0x059b:
            if (r8 >= r7) goto L_0x05e8
            java.lang.Object r10 = r2.get(r8)
            aqrr r10 = (defpackage.aqrr) r10
            android.content.Context r11 = r1.e
            android.view.LayoutInflater r11 = android.view.LayoutInflater.from(r11)
            r12 = 2131624045(0x7f0e006d, float:1.8875259E38)
            android.widget.LinearLayout r13 = r1.b
            android.view.View r11 = r11.inflate(r12, r13, r4)
            djk r12 = r1.f
            android.view.View r13 = r11.findViewById(r3)
            com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView r13 = (com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView) r13
            int r14 = r10.a
            r14 = r14 & r9
            aqrl r15 = r10.b
            if (r15 != 0) goto L_0x05c3
            aqrl r15 = defpackage.aqrl.g
        L_0x05c3:
            if (r14 != 0) goto L_0x05c7
            r14 = 0
            goto L_0x05c8
        L_0x05c7:
            r14 = 1
        L_0x05c8:
            defpackage.cyd.a((defpackage.djk) r12, (com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView) r13, (boolean) r14, (defpackage.aqrl) r15)
            r12 = 2131428731(0x7f0b057b, float:1.8479115E38)
            android.view.View r13 = r11.findViewById(r12)
            android.widget.TextView r13 = (android.widget.TextView) r13
            defpackage.cyd.a((android.widget.TextView) r13, (int) r6)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            java.lang.String r10 = r10.c
            defpackage.cyd.a((android.widget.TextView) r12, (java.lang.String) r10)
            r5.addView(r11)
            int r8 = r8 + 1
            goto L_0x059b
        L_0x05e8:
            android.view.View r1 = r1.c
            return r1
        L_0x05eb:
            return r16
        L_0x05ec:
            cwv r1 = new cwv
            android.widget.LinearLayout r5 = r0.t
            cxu r8 = r0.v
            cyg r10 = r8.h
            djk r8 = r8.k
            r1.<init>(r2, r5, r10, r8)
            java.lang.Object r5 = r1.a
            aqpx r5 = (defpackage.aqpx) r5
            int r8 = r5.b
            if (r8 != r6) goto L_0x0606
            java.lang.Object r5 = r5.c
            aqqm r5 = (defpackage.aqqm) r5
            goto L_0x0608
        L_0x0606:
            aqqm r5 = defpackage.aqqm.h
        L_0x0608:
            int r8 = r5.c
            r10 = 2
            if (r8 != r10) goto L_0x0611
            r8 = 2131624042(0x7f0e006a, float:1.8875253E38)
            goto L_0x0614
        L_0x0611:
            r8 = 2131624034(0x7f0e0062, float:1.8875236E38)
        L_0x0614:
            android.content.Context r10 = r1.e
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131165515(0x7f07014b, float:1.794525E38)
            int r10 = r10.getDimensionPixelSize(r11)
            android.content.Context r11 = r1.e
            android.content.res.Resources r11 = r11.getResources()
            r13 = 2131165400(0x7f0700d8, float:1.7945016E38)
            int r11 = r11.getDimensionPixelSize(r13)
            aucx r13 = r5.b
            int r15 = r13.size()
            r3 = 0
            r7 = 0
            r14 = 0
        L_0x0637:
            if (r14 < r15) goto L_0x0a88
            android.content.Context r13 = r1.e
            int r3 = defpackage.cyd.a((int) r3, (android.content.Context) r13)
            android.content.Context r13 = r1.e
            int r7 = defpackage.cyd.a((int) r7, (android.content.Context) r13)
            android.view.View r13 = r1.c
            r14 = 2131427723(0x7f0b018b, float:1.847707E38)
            android.view.View r13 = r13.findViewById(r14)
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            android.view.View r14 = r1.c
            r15 = 2131427724(0x7f0b018c, float:1.8477072E38)
            android.view.View r14 = r14.findViewById(r15)
            android.widget.HorizontalScrollView r14 = (android.widget.HorizontalScrollView) r14
            int r15 = android.os.Build.VERSION.SDK_INT
            defpackage.cyd.a()
            r15 = 0
        L_0x0661:
            aucx r9 = r5.b
            int r9 = r9.size()
            if (r15 < r9) goto L_0x070b
            int r3 = r5.a
            r3 = r3 & r12
            if (r3 == 0) goto L_0x06d5
            android.content.Context r3 = r1.e
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r7 = 2131624035(0x7f0e0063, float:1.8875238E38)
            android.view.View r3 = r3.inflate(r7, r13, r4)
            r7 = 2131429645(0x7f0b090d, float:1.8480969E38)
            android.view.View r7 = r3.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.String r8 = r5.g
            defpackage.cyd.a((android.widget.TextView) r7, (java.lang.String) r8)
            r8 = 2131427681(0x7f0b0161, float:1.8476985E38)
            android.view.View r8 = r3.findViewById(r8)
            aqsr r9 = r5.f
            if (r9 != 0) goto L_0x0696
            aqsr r9 = defpackage.aqsr.d
        L_0x0696:
            cyg r10 = r1.d
            defpackage.cyd.a((android.view.View) r8, (defpackage.aqsr) r9, (defpackage.cyg) r10)
            r9 = 2
            defpackage.qb.b((android.view.View) r7, (int) r9)
            java.lang.String r5 = r5.g
            r8.setContentDescription(r5)
            awgy r5 = defpackage.awgy.a
            awgz r5 = r5.a()
            boolean r5 = r5.s()
            if (r5 == 0) goto L_0x06d2
            boolean r5 = defpackage.qud.h()
            if (r5 == 0) goto L_0x06d2
            r5 = 3
            int r5 = defpackage.que.b(r5)
            android.content.Context r7 = r1.e
            r9 = 16842801(0x1010031, float:2.3693695E-38)
            r10 = 2131100242(0x7f060252, float:1.781286E38)
            int r7 = defpackage.que.b(r7, r9, r10)
            int r5 = defpackage.lk.a(r5, r7)
            android.content.res.ColorStateList r5 = defpackage.que.a((int) r5)
            r8.setBackgroundTintList(r5)
        L_0x06d2:
            r13.addView(r3)
        L_0x06d5:
            android.content.Context r3 = r1.e
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131165398(0x7f0700d6, float:1.7945012E38)
            int r3 = r3.getDimensionPixelSize(r5)
            defpackage.cyd.a((android.widget.LinearLayout) r13, (int) r3)
            cwu r3 = new cwu
            r3.<init>(r1, r14, r13)
            r14.addOnLayoutChangeListener(r3)
            android.view.View r1 = r1.c
            int r3 = r2.b
            if (r3 != r6) goto L_0x06f8
            java.lang.Object r2 = r2.c
            aqqm r2 = (defpackage.aqqm) r2
            goto L_0x06fa
        L_0x06f8:
            aqqm r2 = defpackage.aqqm.h
        L_0x06fa:
            aucx r2 = r2.b
            java.lang.Object r2 = r2.get(r4)
            aqqn r2 = (defpackage.aqqn) r2
            boolean r2 = r2.h
            if (r2 != 0) goto L_0x070a
            android.view.View r1 = r0.a((android.view.View) r1)
        L_0x070a:
            return r1
        L_0x070b:
            aucx r9 = r5.b
            java.lang.Object r9 = r9.get(r15)
            aqqn r9 = (defpackage.aqqn) r9
            android.content.Context r12 = r1.e
            android.view.LayoutInflater r12 = android.view.LayoutInflater.from(r12)
            android.view.View r12 = r12.inflate(r8, r13, r4)
            r4 = 2131427720(0x7f0b0188, float:1.8477064E38)
            android.view.View r4 = r12.findViewById(r4)
            androidx.cardview.widget.CardView r4 = (androidx.cardview.widget.CardView) r4
            boolean r6 = r9.h
            if (r6 == 0) goto L_0x0734
            r6 = 1082130432(0x40800000, float:4.0)
            r4.a(r6)
            r6 = 3
            defpackage.que.a((android.view.View) r4, (int) r6)
            goto L_0x073d
        L_0x0734:
            r6 = 3
            r6 = 0
            r4.a(r6)
            r6 = 1
            defpackage.que.a((android.view.View) r4, (int) r6)
        L_0x073d:
            java.lang.Object r6 = r1.a
            aqpx r6 = (defpackage.aqpx) r6
            int r2 = r6.b
            r24 = r5
            r5 = 6
            if (r2 != r5) goto L_0x074d
            java.lang.Object r2 = r6.c
            aqqm r2 = (defpackage.aqqm) r2
            goto L_0x074f
        L_0x074d:
            aqqm r2 = defpackage.aqqm.h
        L_0x074f:
            int r2 = r2.c
            java.lang.Object r5 = r1.a
            aqpx r5 = (defpackage.aqpx) r5
            int r6 = r5.b
            r25 = r8
            r8 = 6
            if (r6 != r8) goto L_0x0761
            java.lang.Object r5 = r5.c
            aqqm r5 = (defpackage.aqqm) r5
            goto L_0x0763
        L_0x0761:
            aqqm r5 = defpackage.aqqm.h
        L_0x0763:
            int r5 = r5.e
            android.content.Context r6 = r1.e
            int r5 = defpackage.cyd.a((int) r5, (android.content.Context) r6)
            if (r5 > 0) goto L_0x076e
            goto L_0x077e
        L_0x076e:
            r6 = 1
            if (r2 != r6) goto L_0x077d
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r6 = (android.widget.LinearLayout.LayoutParams) r6
            r6.width = r5
            r4.setLayoutParams(r6)
            goto L_0x077f
        L_0x077d:
        L_0x077e:
            r5 = r10
        L_0x077f:
            java.lang.Object r6 = r1.a
            aqpx r6 = (defpackage.aqpx) r6
            int r8 = r6.b
            r26 = r10
            r10 = 6
            if (r8 != r10) goto L_0x078f
            java.lang.Object r6 = r6.c
            aqqm r6 = (defpackage.aqqm) r6
            goto L_0x0791
        L_0x078f:
            aqqm r6 = defpackage.aqqm.h
        L_0x0791:
            int r6 = r6.d
            r8 = 2
            if (r6 != r8) goto L_0x0798
            r10 = 1
            goto L_0x0799
        L_0x0798:
            r10 = 0
        L_0x0799:
            r8 = 2131427837(0x7f0b01fd, float:1.8477302E38)
            android.view.View r23 = r12.findViewById(r8)
            r8 = r23
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r23 = r14
            r14 = 2
            if (r6 != r14) goto L_0x07ad
            r6 = 17
            goto L_0x07b0
        L_0x07ad:
            r6 = 8388611(0x800003, float:1.1754948E-38)
        L_0x07b0:
            r8.setHorizontalGravity(r6)
            aucx r6 = r9.j
            int r6 = r6.size()
            if (r6 > 0) goto L_0x0981
            boolean r6 = defpackage.cwv.a(r9)
            if (r6 == 0) goto L_0x07de
            r6 = 8
            r8.setVisibility(r6)
            r32 = r2
            r31 = r4
            r30 = r13
            r27 = r15
            r2 = -2
            r4 = -1
            r6 = 17
            r13 = 2131165506(0x7f070142, float:1.7945231E38)
            r15 = 2131429645(0x7f0b090d, float:1.8480969E38)
            r19 = 4
            r21 = 2
            goto L_0x09b8
        L_0x07de:
            java.lang.Object r6 = r1.a
            aqpx r6 = (defpackage.aqpx) r6
            int r10 = r6.b
            r14 = 6
            if (r10 != r14) goto L_0x07ec
            java.lang.Object r6 = r6.c
            aqqm r6 = (defpackage.aqqm) r6
            goto L_0x07ee
        L_0x07ec:
            aqqm r6 = defpackage.aqqm.h
        L_0x07ee:
            int r6 = r6.d
            r10 = 2
            if (r6 != r10) goto L_0x07f5
            r6 = 1
            goto L_0x07f6
        L_0x07f5:
            r6 = 0
        L_0x07f6:
            int r14 = r9.a
            r14 = r14 & r10
            if (r14 == 0) goto L_0x081e
            android.widget.TextView r10 = new android.widget.TextView
            android.content.Context r14 = r1.e
            r10.<init>(r14)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r27 = r15
            r0 = -2
            r15 = -1
            r14.<init>(r15, r0)
            r10.setLayoutParams(r14)
            r0 = 2
            defpackage.cyd.a((android.widget.TextView) r10, (int) r0)
            java.lang.String r0 = r9.c
            defpackage.cyd.a((android.widget.TextView) r10, (java.lang.String) r0)
            r8.addView(r10)
            defpackage.cwv.a(r10, r6)
            goto L_0x0820
        L_0x081e:
            r27 = r15
        L_0x0820:
            aucx r0 = r9.d
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0885
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.content.Context r10 = r1.e
            r0.<init>(r10)
            r10 = 1
            r0.setOrientation(r10)
            aucx r10 = r9.d
            int r14 = r10.size()
            r15 = 0
        L_0x083a:
            if (r15 >= r14) goto L_0x087b
            java.lang.Object r28 = r10.get(r15)
            r29 = r10
            r10 = r28
            java.lang.String r10 = (java.lang.String) r10
            r28 = r14
            android.widget.TextView r14 = new android.widget.TextView
            r30 = r13
            android.content.Context r13 = r1.e
            r14.<init>(r13)
            r13 = 2132017235(0x7f140053, float:1.9672743E38)
            defpackage.ry.a((android.widget.TextView) r14, (int) r13)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r32 = r2
            r31 = r4
            r2 = -1
            r4 = -2
            r13.<init>(r2, r4)
            r14.setLayoutParams(r13)
            defpackage.cwv.a(r14, r6)
            defpackage.cyd.a((android.widget.TextView) r14, (java.lang.String) r10)
            r0.addView(r14)
            int r15 = r15 + 1
            r14 = r28
            r10 = r29
            r13 = r30
            r4 = r31
            r2 = r32
            goto L_0x083a
        L_0x087b:
            r32 = r2
            r31 = r4
            r30 = r13
            r8.addView(r0)
            goto L_0x088b
        L_0x0885:
            r32 = r2
            r31 = r4
            r30 = r13
        L_0x088b:
            aucx r0 = r9.e
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x08ef
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.content.Context r2 = r1.e
            r0.<init>(r2)
            r2 = 1
            r0.setOrientation(r2)
            aucx r2 = r9.e
            int r4 = r2.size()
            r10 = 0
        L_0x08a5:
            if (r10 >= r4) goto L_0x08e9
            java.lang.Object r13 = r2.get(r10)
            java.lang.String r13 = (java.lang.String) r13
            android.widget.TextView r14 = new android.widget.TextView
            android.content.Context r15 = r1.e
            r14.<init>(r15)
            r15 = 2132017232(0x7f140050, float:1.9672737E38)
            defpackage.ry.a((android.widget.TextView) r14, (int) r15)
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams
            r28 = r2
            r21 = r4
            r2 = -2
            r4 = -1
            r15.<init>(r4, r2)
            r14.setLayoutParams(r15)
            defpackage.cwv.a(r14, r6)
            int r15 = r9.a
            r22 = 8
            r15 = r15 & 8
            if (r15 == 0) goto L_0x08da
            avoo r15 = r9.g
            if (r15 != 0) goto L_0x08dc
            avoo r15 = defpackage.avoo.e
            goto L_0x08dc
        L_0x08da:
            r15 = r16
        L_0x08dc:
            defpackage.cyd.a((android.widget.TextView) r14, (java.lang.String) r13, (defpackage.avoo) r15)
            r0.addView(r14)
            int r10 = r10 + 1
            r4 = r21
            r2 = r28
            goto L_0x08a5
        L_0x08e9:
            r2 = -2
            r4 = -1
            r8.addView(r0)
            goto L_0x08f1
        L_0x08ef:
            r2 = -2
            r4 = -1
        L_0x08f1:
            int r0 = r9.a
            r10 = 4
            r0 = r0 & r10
            if (r0 == 0) goto L_0x0967
            android.content.Context r0 = r1.e
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r10 = 2131624050(0x7f0e0072, float:1.8875269E38)
            r13 = 0
            android.view.View r0 = r0.inflate(r10, r8, r13)
            aqtd r10 = r9.f
            if (r10 != 0) goto L_0x090b
            aqtd r10 = defpackage.aqtd.e
        L_0x090b:
            r13 = 2131429645(0x7f0b090d, float:1.8480969E38)
            android.view.View r14 = r0.findViewById(r13)
            android.widget.TextView r14 = (android.widget.TextView) r14
            java.lang.String r13 = r10.b
            int r15 = r10.a
            r19 = 4
            r15 = r15 & 4
            if (r15 == 0) goto L_0x0926
            avoo r15 = r10.d
            if (r15 != 0) goto L_0x0928
            avoo r15 = defpackage.avoo.e
            goto L_0x0928
        L_0x0926:
            r15 = r16
        L_0x0928:
            defpackage.cyd.a((android.widget.TextView) r14, (java.lang.String) r13, (defpackage.avoo) r15)
            djk r13 = r1.f
            r14 = 2131428677(0x7f0b0545, float:1.8479005E38)
            android.view.View r15 = r0.findViewById(r14)
            com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView r15 = (com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView) r15
            int r14 = r10.a
            r21 = 2
            r14 = r14 & 2
            if (r14 == 0) goto L_0x0940
            r14 = 1
            goto L_0x0941
        L_0x0940:
            r14 = 0
        L_0x0941:
            aqrl r10 = r10.c
            if (r10 != 0) goto L_0x0947
            aqrl r10 = defpackage.aqrl.g
        L_0x0947:
            defpackage.cyd.a((defpackage.djk) r13, (com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView) r15, (boolean) r14, (defpackage.aqrl) r10)
            r10 = 2131429518(0x7f0b088e, float:1.848071E38)
            android.view.View r10 = r0.findViewById(r10)
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            if (r6 == 0) goto L_0x095b
            r6 = 17
            r10.setGravity(r6)
            goto L_0x0963
        L_0x095b:
            r6 = 17
            r13 = 8388611(0x800003, float:1.1754948E-38)
            r10.setGravity(r13)
        L_0x0963:
            r8.addView(r0)
            goto L_0x096d
        L_0x0967:
            r6 = 17
            r19 = 4
            r21 = 2
        L_0x096d:
            android.content.Context r0 = r1.e
            android.content.res.Resources r0 = r0.getResources()
            r13 = 2131165506(0x7f070142, float:1.7945231E38)
            int r0 = r0.getDimensionPixelSize(r13)
            defpackage.cyd.b(r8, r0)
            r15 = 2131429645(0x7f0b090d, float:1.8480969E38)
            goto L_0x09b8
        L_0x0981:
            r32 = r2
            r31 = r4
            r30 = r13
            r27 = r15
            r2 = -2
            r4 = -1
            r6 = 17
            r13 = 2131165506(0x7f070142, float:1.7945231E38)
            r19 = 4
            r21 = 2
            djk r0 = r1.f
            aucx r14 = r9.j
            defpackage.cyd.a((defpackage.djk) r0, (android.widget.LinearLayout) r8, (java.util.List) r14)
            r0 = 0
        L_0x099c:
            int r14 = r8.getChildCount()
            if (r0 >= r14) goto L_0x09b5
            android.view.View r14 = r8.getChildAt(r0)
            r15 = 2131429645(0x7f0b090d, float:1.8480969E38)
            android.view.View r14 = r14.findViewById(r15)
            android.widget.TextView r14 = (android.widget.TextView) r14
            defpackage.cwv.a(r14, r10)
            int r0 = r0 + 1
            goto L_0x099c
        L_0x09b5:
            r15 = 2131429645(0x7f0b090d, float:1.8480969E38)
        L_0x09b8:
            r0 = 2131428679(0x7f0b0547, float:1.847901E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            int r8 = r9.a
            r10 = 1
            r8 = r8 & r10
            if (r8 == 0) goto L_0x0a32
            android.view.ViewGroup$LayoutParams r8 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r8 = (android.widget.LinearLayout.LayoutParams) r8
            int r10 = r11 + r11
            int r5 = r5 - r10
            int r10 = java.lang.Math.min(r3, r5)
            r8.width = r10
            float r10 = (float) r7
            int r14 = r8.width
            float r14 = (float) r14
            float r2 = (float) r3
            float r14 = r14 / r2
            float r10 = r10 * r14
            int r2 = (int) r10
            r8.height = r2
            boolean r2 = defpackage.cwv.a(r9)
            if (r2 == 0) goto L_0x09ec
            r2 = 0
            r8.setMargins(r2, r2, r2, r2)
            goto L_0x09ed
        L_0x09ec:
            r2 = 0
        L_0x09ed:
            cwr r10 = new cwr
            r10.<init>(r0, r8)
            r0.post(r10)
            r0.setVisibility(r2)
            r0 = r32
            r2 = 1
            if (r0 != r2) goto L_0x0a19
            djk r0 = r1.f
            r2 = 2131428677(0x7f0b0545, float:1.8479005E38)
            android.view.View r8 = r12.findViewById(r2)
            com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView r8 = (com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView) r8
            aqrl r2 = r9.b
            if (r2 != 0) goto L_0x0a0e
            aqrl r2 = defpackage.aqrl.g
        L_0x0a0e:
            r10 = 1
            defpackage.cyd.a(r0, r8, r10, r2, r5)
            r2 = 2131428677(0x7f0b0545, float:1.8479005E38)
            r5 = 8
            goto L_0x0a3a
        L_0x0a19:
            djk r0 = r1.f
            r2 = 2131428677(0x7f0b0545, float:1.8479005E38)
            android.view.View r5 = r12.findViewById(r2)
            com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView r5 = (com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView) r5
            aqrl r8 = r9.b
            if (r8 != 0) goto L_0x0a2a
            aqrl r8 = defpackage.aqrl.g
        L_0x0a2a:
            r10 = 1
            defpackage.cyd.a((defpackage.djk) r0, (com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView) r5, (boolean) r10, (defpackage.aqrl) r8)
            r5 = 8
            goto L_0x0a3a
        L_0x0a32:
            r2 = 2131428677(0x7f0b0545, float:1.8479005E38)
            r5 = 8
            r0.setVisibility(r5)
        L_0x0a3a:
            r0 = 2131429639(0x7f0b0907, float:1.8480956E38)
            r8 = r31
            android.view.View r0 = r8.findViewById(r0)
            aqsr r10 = r9.i
            if (r10 != 0) goto L_0x0a49
            aqsr r10 = defpackage.aqsr.d
        L_0x0a49:
            cyg r14 = r1.d
            android.content.Context r2 = r1.e
            r4 = 2130968661(0x7f040055, float:1.7545982E38)
            r5 = 2131230912(0x7f0800c0, float:1.807789E38)
            int r2 = defpackage.que.a(r2, r4, r5)
            defpackage.cyd.a((android.view.View) r0, (defpackage.aqsr) r10, (defpackage.cyg) r14, (int) r2)
            int r0 = r9.a
            r0 = r0 & 32
            if (r0 != 0) goto L_0x0a6c
            r0 = 0
            r8.setClickable(r0)
            cws r0 = new cws
            r0.<init>(r1)
            r8.setOnClickListener(r0)
        L_0x0a6c:
            r0 = r30
            r0.addView(r12)
            int r2 = r27 + 1
            r13 = r0
            r15 = r2
            r14 = r23
            r5 = r24
            r8 = r25
            r10 = r26
            r4 = 0
            r6 = 6
            r9 = 1
            r12 = 8
            r0 = r33
            r2 = r34
            goto L_0x0661
        L_0x0a88:
            r24 = r5
            r25 = r8
            r26 = r10
            r6 = 17
            r8 = 2131165506(0x7f070142, float:1.7945231E38)
            r9 = 2131429645(0x7f0b090d, float:1.8480969E38)
            r10 = 6
            r19 = 4
            r21 = 2
            java.lang.Object r0 = r13.get(r14)
            aqqn r0 = (defpackage.aqqn) r0
            int r2 = r0.a
            r4 = 1
            r2 = r2 & r4
            if (r2 == 0) goto L_0x0ac2
            aqrl r2 = r0.b
            if (r2 == 0) goto L_0x0aac
            goto L_0x0aae
        L_0x0aac:
            aqrl r2 = defpackage.aqrl.g
        L_0x0aae:
            int r2 = r2.e
            int r7 = java.lang.Math.max(r7, r2)
            aqrl r0 = r0.b
            if (r0 == 0) goto L_0x0ab9
            goto L_0x0abb
        L_0x0ab9:
            aqrl r0 = defpackage.aqrl.g
        L_0x0abb:
            int r0 = r0.d
            int r3 = java.lang.Math.max(r3, r0)
            goto L_0x0ac3
        L_0x0ac2:
        L_0x0ac3:
            int r14 = r14 + 1
            r0 = r33
            r2 = r34
            r5 = r24
            r8 = r25
            r10 = r26
            r4 = 0
            r6 = 6
            r9 = 1
            r12 = 8
            goto L_0x0637
        L_0x0ad6:
            android.widget.ImageView r0 = new android.widget.ImageView
            r1 = r33
            cxu r2 = r1.v
            android.content.Context r2 = r2.j
            r0.<init>(r2)
            cxu r2 = r1.v
            android.content.Context r2 = r2.j
            r3 = 2130968668(0x7f04005c, float:1.7545996E38)
            r4 = 2131230920(0x7f0800c8, float:1.8077906E38)
            int r2 = defpackage.que.a(r2, r3, r4)
            r0.setImageResource(r2)
            int r2 = r1.y
            r3 = 0
            r0.setPadding(r2, r3, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxt.a(aqpx):android.view.View");
    }

    private final void a(View view, int i, aqti aqti) {
        int i2;
        int i3 = 0;
        if (i != aqti.c.size() - 1) {
            i2 = ((aqpx) aqti.c.get(i + 1)).b == 3 ? this.z : 0;
        } else {
            i2 = !aqti.d ? this.z : this.A;
        }
        if (i == 0) {
            i3 = !aqti.d ? this.z : this.A;
        } else if (((aqpx) aqti.c.get(i - 1)).b == 3) {
            i3 = this.z;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + i3, view.getPaddingRight(), view.getPaddingBottom() + i2);
    }

    public final void a(cze cze) {
        int i;
        int i2;
        if (cze.a() == 3) {
            if (d() == this.v.a() - 1) {
                cxu.a((View) this.w, 2);
            }
            aqqh aqqh = ((cxq) cze).a;
            this.t.removeAllViews();
            if (aqqh.a == 1) {
                aqti aqti = (aqti) aqqh.b;
                int i3 = Build.VERSION.SDK_INT;
                this.w.setClipToOutline(false);
                if (aqti.d) {
                    this.x.setBackgroundColor(que.b(this.v.j, 16842801, R.color.google_white));
                    i = 0;
                } else {
                    this.x.setBackgroundDrawable(que.a(this.v.j, (int) R.attr.asCardBorder));
                    i = 0;
                }
                while (i < aqti.c.size()) {
                    aqpx aqpx = (aqpx) aqti.c.get(i);
                    View a = a(aqpx);
                    if (a != null) {
                        if ((aqpx.a & 131072) != 0) {
                            a.setMinimumHeight(this.C);
                        }
                        a(a, i, aqti);
                        if (!((aqpx.a & 131072) == 0 || (i2 = i + 1) >= aqti.c.size() || (((aqpx) aqti.c.get(i2)).a & 131072) == 0)) {
                            aqsr aqsr = aqpx.d;
                            if (aqsr == null) {
                                aqsr = aqsr.d;
                            }
                            aqsr aqsr2 = ((aqpx) aqti.c.get(i2)).d;
                            if (aqsr2 == null) {
                                aqsr2 = aqsr.d;
                            }
                            if (aqsr.equals(aqsr2)) {
                                LinearLayout linearLayout = new LinearLayout(this.v.j);
                                linearLayout.setOrientation(1);
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                linearLayout.setClipToPadding(false);
                                linearLayout.setClipChildren(false);
                                linearLayout.setLayoutParams(layoutParams);
                                linearLayout.addView(a);
                                aqsr aqsr3 = aqpx.d;
                                if (aqsr3 == null) {
                                    aqsr3 = aqsr.d;
                                }
                                cyd.a((View) linearLayout, aqsr3, this.v.h, a(i, aqti.c));
                                while (true) {
                                    int i4 = i + 1;
                                    if (i4 >= aqti.c.size() || (((aqpx) aqti.c.get(i4)).a & 131072) == 0) {
                                        break;
                                    }
                                    aqsr aqsr4 = aqpx.d;
                                    if (aqsr4 == null) {
                                        aqsr4 = aqsr.d;
                                    }
                                    aqsr aqsr5 = ((aqpx) aqti.c.get(i4)).d;
                                    if (aqsr5 == null) {
                                        aqsr5 = aqsr.d;
                                    }
                                    if (!aqsr4.equals(aqsr5)) {
                                        break;
                                    }
                                    View a2 = a((aqpx) aqti.c.get(i4));
                                    if (a2 != null) {
                                        a(a2, i4, aqti);
                                        linearLayout.addView(a2);
                                    }
                                    i = i4;
                                }
                                this.t.addView(linearLayout);
                            }
                        }
                        aqsr aqsr6 = aqpx.d;
                        if (aqsr6 == null) {
                            aqsr6 = aqsr.d;
                        }
                        cyd.a(a, aqsr6, this.v.h, a(i, aqti.c));
                        this.t.addView(a);
                    }
                    i++;
                }
                LinearLayout linearLayout2 = this.t;
                aqsr aqsr7 = aqti.b;
                if (aqsr7 == null) {
                    aqsr7 = aqsr.d;
                }
                cxu cxu = this.v;
                cyd.a((View) linearLayout2, aqsr7, cxu.h, que.a(cxu.j, R.attr.asCardRoundedRipple, R.drawable.as_card_rounded_ripple_light));
                this.s.addOnLayoutChangeListener(new cxs(this));
            }
        }
    }
}
