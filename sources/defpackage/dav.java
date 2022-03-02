package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView;

/* renamed from: dav  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dav extends cvz {
    private final boolean g;

    public dav(aqqd aqqd, LinearLayout linearLayout, boolean z, cyg cyg, djk djk) {
        super(aqqd, linearLayout, cyg, djk);
        this.g = z;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return R.layout.as_bottom_nav_menu_item_block;
    }

    public final View b() {
        boolean z;
        FadeInImageView fadeInImageView = (FadeInImageView) this.c.findViewById(R.id.menu_drawer_item_icon);
        TextView textView = (TextView) this.c.findViewById(R.id.menu_drawer_item_label);
        djk djk = this.f;
        aqqd aqqd = (aqqd) this.a;
        if ((aqqd.a & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        aqrl aqrl = aqqd.d;
        if (aqrl == null) {
            aqrl = aqrl.g;
        }
        cyd.a(djk, fadeInImageView, z, aqrl);
        cyd.a(textView, ((aqqd) this.a).c);
        qb.a(textView, fadeInImageView.getVisibility() == 8 ? this.b.getResources().getDimensionPixelSize(R.dimen.as_bottom_drawer_icon_space) : 0, 0, 0, 0);
        this.c.setSelected(this.g);
        if (this.g) {
            this.c.sendAccessibilityEvent(4);
            qb.a(this.c, que.a(this.e, (int) R.attr.asBottomNavMenuDrawerItemHighlight));
            cxy.a(fadeInImageView, que.b(this.e, R.attr.colorPrimaryGoogle, R.color.google_blue600));
            ry.a(textView, (int) R.style.AsBottomMenuDrawerItemSelectedAppearance);
        } else {
            qb.a(this.c, que.a(this.e, (int) R.attr.asRipple));
            cxy.a(fadeInImageView, que.b(this.e, R.attr.colorOnSurfaceVariant, R.color.google_grey700));
            ry.a(textView, (int) R.style.AsBottomMenuDrawerItemAppearance);
        }
        View view = this.c;
        aqsr aqsr = ((aqqd) this.a).b;
        if (aqsr == null) {
            aqsr = aqsr.d;
        }
        cyd.a(view, aqsr, this.d);
        return this.c;
    }
}
