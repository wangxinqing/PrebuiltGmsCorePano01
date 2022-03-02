package defpackage;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.gms.R;
import com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView;

/* renamed from: cxe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cxe extends czj {
    final /* synthetic */ cxu s;
    private final CardView t;
    private final LinearLayout u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cxe(cxu cxu, View view) {
        super(view);
        this.s = cxu;
        this.t = (CardView) view.findViewById(R.id.card_view);
        this.u = (LinearLayout) view.findViewById(R.id.dynamic_content);
    }

    public final void a(cze cze) {
        View view;
        aqqw aqqw;
        aqqt aqqt;
        boolean z;
        aqqx aqqx;
        aqrl aqrl;
        int i = 8;
        if (cze.a() == 8) {
            aqqh aqqh = ((cxf) cze).a;
            this.u.removeAllViews();
            if (aqqh.a == 3) {
                aqqs aqqs = (aqqs) aqqh.b;
                int i2 = Build.VERSION.SDK_INT;
                boolean z2 = false;
                this.t.setClipToOutline(false);
                int i3 = 0;
                while (i3 < aqqs.a.size()) {
                    aqpx aqpx = (aqpx) aqqs.a.get(i3);
                    int i4 = aqpx.b;
                    int i5 = R.id.image;
                    int i6 = R.id.title;
                    int i7 = 1;
                    if (i4 == 14) {
                        LinearLayout linearLayout = this.u;
                        cxu cxu = this.s;
                        cvy cvy = new cvy(aqpx, linearLayout, cxu.h, cxu.k);
                        aqpx aqpx2 = (aqpx) cvy.a;
                        if (aqpx2.b == 14) {
                            aqqx = (aqqx) aqpx2.c;
                        } else {
                            aqqx = aqqx.e;
                        }
                        FadeInImageView fadeInImageView = (FadeInImageView) cvy.c.findViewById(R.id.image);
                        if ((1 & aqqx.a) == 0) {
                            fadeInImageView.setVisibility(i);
                            LinearLayout linearLayout2 = (LinearLayout) cvy.c.findViewById(R.id.content);
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout2.getLayoutParams();
                            int dimensionPixelSize = cvy.c.getResources().getDimensionPixelSize(R.dimen.as_clp_block_margin_start);
                            if (cyd.a(cvy.e)) {
                                layoutParams.rightMargin = dimensionPixelSize;
                            } else {
                                layoutParams.leftMargin = dimensionPixelSize;
                            }
                            linearLayout2.setLayoutParams(layoutParams);
                        } else {
                            djk djk = cvy.f;
                            aqrl aqrl2 = aqqx.b;
                            if (aqrl2 == null) {
                                aqrl = aqrl.g;
                            } else {
                                aqrl = aqrl2;
                            }
                            cyd.a(djk, fadeInImageView, true, aqrl, -1, cvy.c.getResources().getDimension(R.dimen.as_clp_list_item_block_image_padding));
                            cxy.a(fadeInImageView, que.b(cvy.e, R.attr.colorOnSurfaceVariant, R.color.google_grey700));
                        }
                        cyd.a((TextView) cvy.c.findViewById(R.id.title), aqqx.c);
                        cyd.a((TextView) cvy.c.findViewById(R.id.description), aqqx.d);
                        if ((aqqx.a & 4) == 0) {
                            View findViewById = cvy.c.findViewById(R.id.list_item);
                            ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
                            layoutParams2.height = cvy.c.getResources().getDimensionPixelSize(R.dimen.as_clp_list_item_block_one_line_height);
                            findViewById.setLayoutParams(layoutParams2);
                        }
                        view = cvy.c;
                    } else if (i4 == 15) {
                        LinearLayout linearLayout3 = this.u;
                        cxu cxu2 = this.s;
                        cvv cvv = new cvv(aqpx, linearLayout3, cxu2.h, cxu2.k);
                        aqpx aqpx3 = (aqpx) cvv.a;
                        if (aqpx3.b == 15) {
                            aqqt = (aqqt) aqpx3.c;
                        } else {
                            aqqt = aqqt.b;
                        }
                        LinearLayout linearLayout4 = (LinearLayout) cvv.c.findViewById(R.id.carousel);
                        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) cvv.c.findViewById(R.id.carouselScrollView);
                        int i8 = Build.VERSION.SDK_INT;
                        cyd.a();
                        int i9 = 0;
                        while (i9 < aqqt.a.size()) {
                            aqqu aqqu = (aqqu) aqqt.a.get(i9);
                            View inflate = LayoutInflater.from(cvv.e).inflate(R.layout.as_card_clp_carousel_item, linearLayout4, z2);
                            FadeInImageView fadeInImageView2 = (FadeInImageView) inflate.findViewById(i5);
                            djk djk2 = cvv.f;
                            int i10 = aqqu.a & i7;
                            aqrl aqrl3 = aqqu.b;
                            if (aqrl3 == null) {
                                aqrl3 = aqrl.g;
                            }
                            if (i10 == 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                            cyd.a(djk2, fadeInImageView2, z, aqrl3);
                            ((TextView) inflate.findViewById(i6)).setText(aqqu.c);
                            inflate.setBackgroundDrawable(que.a(cvv.e, (int) R.attr.asCardBorder));
                            View findViewById2 = inflate.findViewById(R.id.tappable_view);
                            aqsr aqsr = aqqu.d;
                            if (aqsr == null) {
                                aqsr = aqsr.d;
                            }
                            cyd.a(findViewById2, aqsr, cvv.d, que.a(cvv.e, R.attr.asClpCarouselRoundedRipple, R.drawable.as_clp_carousel_rounded_ripple_light));
                            linearLayout4.addView(inflate);
                            i9++;
                            z2 = false;
                            i5 = R.id.image;
                            i6 = R.id.title;
                            i7 = 1;
                        }
                        cyd.a(linearLayout4, cvv.e.getResources().getDimensionPixelSize(R.dimen.as_carousel_children_spacing));
                        horizontalScrollView.addOnLayoutChangeListener(new cvu(cvv, horizontalScrollView, linearLayout4));
                        view = cvv.c;
                    } else if (i4 == 17) {
                        LinearLayout linearLayout5 = this.u;
                        cxu cxu3 = this.s;
                        cvx cvx = new cvx(aqpx, linearLayout5, cxu3.h, cxu3.k);
                        TextView textView = (TextView) cvx.c.findViewById(R.id.title);
                        aqpx aqpx4 = (aqpx) cvx.a;
                        if (aqpx4.b == 17) {
                            aqqw = (aqqw) aqpx4.c;
                        } else {
                            aqqw = aqqw.c;
                        }
                        cyd.a(textView, aqqw.b);
                        view = cvx.c;
                    } else if (i4 == 19) {
                        LinearLayout linearLayout6 = this.u;
                        cxu cxu4 = this.s;
                        view = new cvw(aqpx, linearLayout6, cxu4.h, cxu4.k).c;
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        this.u.addView(view);
                        aqsr aqsr2 = aqpx.d;
                        if (aqsr2 == null) {
                            aqsr2 = aqsr.d;
                        }
                        cxu cxu5 = this.s;
                        cyd.a(view, aqsr2, cxu5.h, que.a(cxu5.j, R.attr.asRipple, R.drawable.as_ripple_light));
                    }
                    i3++;
                    i = 8;
                    z2 = false;
                }
            }
        }
    }
}
