package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.contactsheet.card.common.FlowLayout;
import com.google.android.gms.smart_profile.card.view.BaseCardView;
import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* renamed from: abiq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abiq implements abir, abkd {
    public final Context a;
    public final jtf b;
    private final avhl c;
    private final abjz d;
    private final jsx e;
    private final abke f;
    private int g = 200;
    private boolean h;
    private boolean i;

    public abiq(Context context, BaseCardView baseCardView, avhl avhl, jsx jsx, jtf jtf, Bundle bundle) {
        String str;
        this.c = avhl;
        this.a = context;
        this.e = jsx;
        this.b = jtf;
        this.d = new abjz(context, uj.b(context, R.drawable.group_divider));
        if (this.c.d.size() != 0) {
            String str2 = ((avhf) this.c.d.get(0)).a;
            if (!TextUtils.isEmpty(str2)) {
                this.h = true;
                abip abip = new abip(this.a, R.string.profile_about_introduction, true);
                abip.a(new abio(this, str2));
                this.d.a(abip);
            }
        }
        if (this.c.e.size() != 0) {
            this.h = true;
            abip abip2 = new abip(this.a, R.string.profile_about_birthday, true);
            abip2.a(a(a(((avhb) this.c.e.get(0)).a)));
            this.d.a(abip2);
        }
        if (this.c.f.size() != 0) {
            this.i = true;
            abip abip3 = new abip(this.a, R.string.profile_about_gender, false);
            if (((avhd) this.c.f.get(0)).b.isEmpty()) {
                abip3.a(a(((avhd) this.c.f.get(0)).a));
            } else {
                abip3.a(a(((avhd) this.c.f.get(0)).b));
            }
            this.d.a(abip3);
        }
        if (this.c.a.size() != 0) {
            this.i = true;
            abip abip4 = new abip(this.a, R.string.profile_about_event, false);
            aucx aucx = this.c.a;
            int size = aucx.size();
            for (int i2 = 0; i2 < size; i2++) {
                avhc avhc = (avhc) aucx.get(i2);
                abip4.a(a(a(avhc.b), avhc.d));
            }
            this.d.a(abip4);
        }
        if (this.c.h.size() != 0) {
            this.h = true;
            abip abip5 = new abip(this.a, R.string.profile_links_card_title, true);
            Context context2 = this.a;
            FlowLayout flowLayout = new FlowLayout(context2, context2.getResources().getDimensionPixelSize(R.dimen.flow_layout_line_spacing), this.a.getResources().getDimensionPixelSize(R.dimen.flow_layout_item_spacing));
            flowLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            int dimensionPixelOffset = this.a.getResources().getDimensionPixelOffset(R.dimen.card_entry_padding_start);
            flowLayout.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
            for (int i3 = 0; i3 < this.c.h.size(); i3++) {
                avhg avhg = (avhg) this.c.h.get(i3);
                if (!avhg.b.isEmpty()) {
                    int i4 = i3 + 1;
                    if (avhg.a.isEmpty()) {
                        str = avhg.b;
                        if (URLUtil.isValidUrl(str)) {
                            str = Uri.parse(avhg.b).getSchemeSpecificPart().substring(2);
                        }
                    } else {
                        str = avhg.a;
                    }
                    str = str.length() > 18 ? String.valueOf(str.substring(0, 18)).concat("...") : str;
                    TextView textView = (TextView) LayoutInflater.from(this.a).inflate(R.layout.single_link, (ViewGroup) null);
                    textView.setText(str);
                    textView.setContentDescription(this.a.getString(R.string.link_content_description, new Object[]{Integer.valueOf(i4), Integer.valueOf(this.c.h.size()), str}));
                    int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.entry_icon_size);
                    jsx jsx2 = this.e;
                    String valueOf = String.valueOf(avhg.b);
                    String str3 = valueOf.length() == 0 ? new String("https://s2.googleusercontent.com/s2/favicons?sz=32&domain_url=") : "https://s2.googleusercontent.com/s2/favicons?sz=32&domain_url=".concat(valueOf);
                    int i5 = this.g;
                    this.g = i5 + 1;
                    jsx2.a(str3, i5, new abil(this, dimensionPixelSize, textView));
                    textView.setOnClickListener(new abim(this, new Intent("android.intent.action.VIEW", Uri.parse(jpr.b(avhg.b)))));
                    textView.setOnLongClickListener(new abin(this, avhg));
                    flowLayout.addView(textView);
                }
            }
            abip5.a(new abkf(flowLayout));
            this.d.a(abip5);
        }
        if (this.c.b.size() != 0) {
            this.i = true;
            abip abip6 = new abip(this.a, R.string.profile_about_relations, false);
            aucx aucx2 = this.c.b;
            int size2 = aucx2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                avhi avhi = (avhi) aucx2.get(i6);
                abip6.a(a(avhi.b, avhi.a));
            }
            this.d.a(abip6);
        }
        if (this.c.c.size() != 0) {
            this.i = true;
            abip abip7 = new abip(this.a, R.string.profile_about_instant_messaging, false);
            aucx aucx3 = this.c.c;
            int size3 = aucx3.size();
            for (int i7 = 0; i7 < size3; i7++) {
                avhe avhe = (avhe) aucx3.get(i7);
                abip7.a(a(avhe.b, avhe.a));
            }
            this.d.a(abip7);
        }
        if (this.c.j.size() != 0) {
            this.i = true;
            abip abip8 = new abip(this.a, R.string.profile_about_internet_call, false);
            aucx aucx4 = this.c.j;
            int size4 = aucx4.size();
            for (int i8 = 0; i8 < size4; i8++) {
                avhj avhj = (avhj) aucx4.get(i8);
                abip8.a(a(avhj.a, avhj.b));
            }
            this.d.a(abip8);
        }
        if (this.c.i.size() != 0) {
            this.i = true;
            abip abip9 = new abip(this.a, R.string.profile_about_custom, false);
            aucx aucx5 = this.c.i;
            int size5 = aucx5.size();
            for (int i9 = 0; i9 < size5; i9++) {
                avhk avhk = (avhk) aucx5.get(i9);
                abip9.a(a(avhk.b, avhk.a));
            }
            this.d.a(abip9);
        }
        if (this.c.g.size() != 0) {
            String str4 = ((avhh) this.c.g.get(0)).a;
            if (!TextUtils.isEmpty(str4)) {
                this.h = true;
                abip abip10 = new abip(this.a, R.string.profile_notes_card_title, true);
                abip10.a(new abio(this, str4));
                this.d.a(abip10);
            }
        }
        if (this.d.d()) {
            this.f = null;
            baseCardView.setVisibility(8);
            return;
        }
        this.f = new abke(baseCardView, this.d, this, this.h && this.i, bundle != null && bundle.getBoolean("aboutCardController"));
    }

    private final abkf a(String str) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.a).inflate(R.layout.card_entry_text_only, (ViewGroup) null);
        ((TextView) viewGroup.findViewById(R.id.text)).setText(str);
        abkf abkf = new abkf(viewGroup);
        abkf.a(str);
        return abkf;
    }

    public final void b() {
        this.b.a(jth.SEE_LESS_BUTTON, jth.SMART_PROFILE_ABOUT_CARD);
    }

    private final abkf a(String str, String str2) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.a).inflate(R.layout.text_with_side_label, (ViewGroup) null);
        int dimensionPixelOffset = this.a.getResources().getDimensionPixelOffset(R.dimen.card_entry_padding_start);
        viewGroup.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
        ((TextView) viewGroup.findViewById(R.id.text)).setText(str);
        if (!TextUtils.isEmpty(str2)) {
            TextView textView = (TextView) viewGroup.findViewById(R.id.spaced_bullet);
            textView.setVisibility(0);
            textView.setText("•");
            TextView textView2 = (TextView) viewGroup.findViewById(R.id.subtext);
            textView2.setVisibility(0);
            textView2.setText(str2);
        }
        abkf abkf = new abkf(viewGroup);
        abkf.a(str);
        return abkf;
    }

    private final String a(long j) {
        DateFormat dateFormat;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setTimeInMillis(j);
        if (gregorianCalendar.get(0) == 0 && gregorianCalendar.get(1) == 1) {
            dateFormat = jpp.a(this.a);
        } else {
            dateFormat = android.text.format.DateFormat.getLongDateFormat(this.a);
        }
        dateFormat.setCalendar(gregorianCalendar);
        return dateFormat.format(gregorianCalendar.getTime());
    }

    public final void a() {
        this.b.a(jth.SEE_MORE_BUTTON, jth.SMART_PROFILE_ABOUT_CARD);
    }

    public final void a(Bundle bundle) {
        abke abke = this.f;
        if (abke != null) {
            bundle.putBoolean("aboutCardController", abke.b);
        }
    }
}
