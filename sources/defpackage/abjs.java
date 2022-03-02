package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.smart_profile.card.view.BaseCardView;

/* renamed from: abjs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abjs implements abir {
    public final Activity a;
    public final Context b;
    public final String c;
    public final jtf d;
    private final avjv e;
    private final abkg f;
    private final jsx g;
    private int h = 400;

    public abjs(Activity activity, Context context, BaseCardView baseCardView, avjv avjv, jsx jsx, String str, jtf jtf, Bundle bundle) {
        int i;
        abjz abjz;
        abka abka;
        boolean z;
        boolean z2;
        String str2;
        int i2;
        Context context2 = context;
        avjv avjv2 = avjv;
        Bundle bundle2 = bundle;
        this.a = activity;
        this.b = context2;
        this.e = avjv2;
        this.g = jsx;
        this.c = str;
        int integer = context.getResources().getInteger(R.integer.reporting_chain_max_num_reports_when_collapsed);
        this.d = jtf;
        if ((avjv2.a & 1) != 0) {
            BaseCardView baseCardView2 = baseCardView;
        } else if (avjv2.c.size() != 0) {
            BaseCardView baseCardView3 = baseCardView;
        } else {
            this.f = null;
            baseCardView.setVisibility(8);
            return;
        }
        if (bundle2 != null) {
            i = bundle2.getInt("reportingChainCardController");
        } else {
            i = integer;
        }
        if ((avjv2.a & 1) != 0) {
            abjz = new abjz(context2, R.string.reporting_chain_manager, 1, (Drawable) null);
            View inflate = LayoutInflater.from(context).inflate(R.layout.reporting_chain_entry, (ViewGroup) null);
            avju avju = avjv2.b;
            a(inflate, avju == null ? avju.f : avju);
            abjz.a(new abkf((ViewGroup) inflate));
        } else {
            abjz = null;
        }
        if (avjv2.c.size() != 0) {
            Context context3 = this.b;
            avjv avjv3 = this.e;
            if ((avjv3.a & 4) != 0 && (i2 = avjv3.d) > 0) {
                str2 = context3.getString(R.string.reporting_chain_reports, new Object[]{Integer.valueOf(i2)});
            } else {
                str2 = "";
            }
            abka = new abka(context3, str2);
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.b).inflate(R.layout.reporting_chain_row, (ViewGroup) null);
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < this.e.c.size(); i3++) {
                if (i3 != 0 && i3 % childCount == 0) {
                    abka.a(new abkf(viewGroup));
                    viewGroup = (ViewGroup) LayoutInflater.from(this.b).inflate(R.layout.reporting_chain_row, (ViewGroup) null);
                }
                a(viewGroup.getChildAt(i3 % childCount), (avju) this.e.c.get(i3));
            }
            abka.a(new abkf(viewGroup));
        } else {
            abka = null;
        }
        if (avjv2.c.size() > 3) {
            z = true;
        } else {
            z = false;
        }
        if (avjv2.c.size() == 0 || (avjv2.a & 4) == 0 || avjv2.d <= avjv2.c.size()) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f = new abkg(baseCardView, abjz, abka, z, z2, i, avjv2.c.size(), jtf);
    }

    private final void a(View view, avju avju) {
        String str;
        if (!avju.b.isEmpty()) {
            ((TextView) view.findViewById(R.id.display_name)).setText(avju.b);
        }
        if (!avju.e.isEmpty()) {
            ((TextView) view.findViewById(R.id.subtitle)).setText(avju.e);
        }
        jsx jsx = this.g;
        String str2 = avju.d;
        if (!TextUtils.isEmpty(str2)) {
            str = jpr.b(str2);
        } else {
            str = azid.b();
        }
        String a2 = iqv.a(str, this.b.getResources().getDimensionPixelSize(R.dimen.profile_card_people_avatar_diameter));
        int i = this.h;
        this.h = i + 1;
        jsx.a(a2, i, new abjq(this, view));
        view.setOnClickListener(new abjr(this, avju));
    }

    public final void a(Bundle bundle) {
        int i;
        abkg abkg = this.f;
        if (abkg != null) {
            abka abka = abkg.b;
            if (abka == null) {
                i = 0;
            } else if (!abkg.a) {
                i = abka.b;
            } else if (abka.d()) {
                int i2 = abkg.b.b;
                i = i2 + i2;
            } else {
                i = abkg.c;
            }
            bundle.putInt("reportingChainCardController", i);
        }
    }
}
