package defpackage;

import android.animation.LayoutTransition;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: cxl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cxl extends czj {
    public final HorizontalScrollView s;
    public final LinearLayout t;
    public final Resources u;
    final /* synthetic */ cxu v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cxl(cxu cxu, View view) {
        super(view);
        this.v = cxu;
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) view.findViewById(R.id.prompt_scroll_view);
        this.s = horizontalScrollView;
        this.t = (LinearLayout) horizontalScrollView.findViewById(R.id.prompt_carousel);
        this.u = cxu.j.getResources();
        cxu.a((View) this.s, 1);
    }

    public static final void a(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = -2;
        view.setLayoutParams(layoutParams);
    }

    public final void a(cze cze) {
        avoo avoo;
        boolean z;
        if (cze.a() == 4) {
            if (d() == this.v.a() - 1) {
                cxu.a((View) this.s, 2);
            }
            aqqh aqqh = ((cxg) cze).a;
            if (aqqh.a == 2) {
                ArrayList arrayList = new ArrayList(((aqsj) aqqh.b).a);
                HashSet hashSet = new HashSet();
                this.t.removeAllViews();
                a(this.t, -2);
                cyd.a();
                for (int i = 0; i < arrayList.size(); i++) {
                    aqsl aqsl = (aqsl) arrayList.get(i);
                    cxh cxh = new cxh(this, hashSet, aqsl);
                    LinearLayout linearLayout = this.t;
                    cxu cxu = this.v;
                    cwe cwe = new cwe(aqsl, linearLayout, cxu.h, cxh, cxu.k);
                    que.a(cwe.c, 3);
                    LinearLayout linearLayout2 = (LinearLayout) cwe.c.findViewById(R.id.prompt_item_summary);
                    MaterialButton materialButton = (MaterialButton) cwe.c.findViewById(R.id.prompt_item_button);
                    ImageView imageView = (ImageView) cwe.c.findViewById(R.id.prompt_remove_image);
                    Space space = (Space) cwe.c.findViewById(R.id.prompt_item_space);
                    cyd.a((TextView) cwe.c.findViewById(R.id.prompt_item_title), ((aqsl) cwe.a).c);
                    aqsi aqsi = ((aqsl) cwe.a).d;
                    if (aqsi == null) {
                        aqsi = aqsi.c;
                    }
                    linearLayout2.removeAllViews();
                    int i2 = aqsi.a;
                    View view = null;
                    if (i2 == 1) {
                        cwa cwa = new cwa((aqsk) aqsi.b, linearLayout2, cwe.f);
                        FadeInImageView fadeInImageView = (FadeInImageView) cwa.c.findViewById(R.id.prompt_summary_image);
                        int i3 = fadeInImageView.getLayoutParams().width;
                        djk djk = cwa.f;
                        aqsk aqsk = (aqsk) cwa.a;
                        int i4 = aqsk.a & 1;
                        aqrl aqrl = aqsk.b;
                        if (aqrl == null) {
                            aqrl = aqrl.g;
                        }
                        if (i4 == 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        cyd.a(djk, fadeInImageView, z, aqrl, i3);
                        cyd.a((TextView) cwa.c.findViewById(R.id.prompt_summary_caption), ((aqsk) cwa.a).c);
                        cyd.a((TextView) cwa.c.findViewById(R.id.prompt_summary_description), ((aqsk) cwa.a).d);
                        view = cwa.c;
                    } else if (i2 == 2) {
                        cwb cwb = new cwb((aqsm) aqsi.b, linearLayout2, cwe.f);
                        cyd.a((TextView) cwb.c.findViewById(R.id.prompt_info_lower), ((aqsm) cwb.a).d);
                        cyd.a((TextView) cwb.c.findViewById(R.id.prompt_info_higher), ((aqsm) cwb.a).e);
                        ProgressBar progressBar = (ProgressBar) cwb.c.findViewById(R.id.prompt_progress);
                        progressBar.setProgress((int) (((aqsm) cwb.a).b * 100.0f));
                        aqsm aqsm = (aqsm) cwb.a;
                        if ((aqsm.a & 2) != 0) {
                            avoo = aqsm.c;
                            if (avoo == null) {
                                avoo = avoo.e;
                            }
                        } else {
                            avoo = null;
                        }
                        cyd.a(progressBar, avoo, (avoo) null);
                        view = cwb.c;
                    }
                    if (view != null) {
                        linearLayout2.addView(view);
                    }
                    if ((((aqsl) cwe.a).a & 8) == 0 || cwe.d == null) {
                        space.setVisibility(8);
                        materialButton.setVisibility(8);
                    } else {
                        space.setVisibility(0);
                        materialButton.setVisibility(0);
                        materialButton.setText(((aqsl) cwe.a).e);
                        aqsr aqsr = ((aqsl) cwe.a).f;
                        if (aqsr == null) {
                            aqsr = aqsr.d;
                        }
                        cyd.a((View) materialButton, aqsr, cwe.d);
                    }
                    aqsp aqsp = (aqsp) aqsr.d.o();
                    if (aqsp.c) {
                        aqsp.c();
                        aqsp.c = false;
                    }
                    aqsr aqsr2 = (aqsr) aqsp.b;
                    aqsr2.a |= 1;
                    aqsr2.b = 90000;
                    cyd.a((View) imageView, (aqsr) aqsp.i(), (cyg) new cwc(cwe), que.a(cwe.e, R.attr.asCarouselRoundedRipple, R.drawable.as_card_rounded_ripple_light));
                    View findViewById = cwe.c.findViewById(R.id.prompt_item_content);
                    aqsr aqsr3 = ((aqsl) cwe.a).f;
                    if (aqsr3 == null) {
                        aqsr3 = aqsr.d;
                    }
                    cyd.a(findViewById, aqsr3, cwe.d, que.a(cwe.e, R.attr.asCarouselRoundedRipple, R.drawable.as_card_rounded_ripple_light));
                    View view2 = cwe.c;
                    this.t.addView(view2);
                    hashSet.add(view2);
                }
                this.s.addOnLayoutChangeListener(new cxk(this, this.v.j.getResources().getDimensionPixelOffset(R.dimen.as_card_deck_outer_padding), this.v.j.getResources().getDimensionPixelSize(R.dimen.as_card_max_width), hashSet));
                this.t.setLayoutTransition(new LayoutTransition());
                cyd.a(this.t, this.u.getDimensionPixelSize(R.dimen.as_carousel_children_spacing));
            }
        }
    }
}
