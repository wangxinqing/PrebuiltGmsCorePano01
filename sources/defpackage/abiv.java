package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.smart_profile.card.view.BaseCardView;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: abiv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abiv implements abir, abhe, abkd {
    public final Context a;
    public final BaseCardView b;
    public final jtf c;
    private final Bundle d;
    private final String e;
    private abjz f;
    private abke g;

    public abiv(Context context, BaseCardView baseCardView, String str, jtf jtf, Bundle bundle) {
        this.a = context;
        this.b = baseCardView;
        this.e = str;
        this.c = jtf;
        this.d = bundle;
        baseCardView.findViewById(R.id.card_container).setPadding(0, 0, 0, 0);
        this.b.findViewById(R.id.card_content).setPadding(0, 0, 0, 0);
    }

    private final abkf a(int i, Drawable drawable, String str, String str2, String str3, Intent intent, jth jth) {
        View inflate = LayoutInflater.from(this.a).inflate(i, (ViewGroup) null);
        inflate.setContentDescription(str3);
        if (drawable != null) {
            jpr.a(drawable, kf.b(this.a, R.color.card_entry_text_color));
            ry.a((TextView) inflate.findViewById(R.id.text), drawable, (Drawable) null);
        } else {
            View findViewById = inflate.findViewById(R.id.text);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
            if (nx.a(Locale.getDefault()) == 1) {
                layoutParams.setMargins(0, 0, inflate.getResources().getDimensionPixelSize(R.dimen.contact_info_entry_offset_start), 0);
            } else {
                layoutParams.setMargins(inflate.getResources().getDimensionPixelSize(R.dimen.contact_info_entry_offset_start), 0, 0, 0);
            }
            findViewById.setLayoutParams(layoutParams);
        }
        inflate.setOnClickListener(new abiu(this, intent, jth));
        ViewGroup viewGroup = (ViewGroup) inflate;
        jpr.a(this.a, (TextView) viewGroup.findViewById(R.id.text), str, str2);
        abkf abkf = new abkf(viewGroup);
        abkf.a(str);
        return abkf;
    }

    public final void b() {
        this.c.a(jth.SEE_LESS_BUTTON, jth.SMART_PROFILE_CONTACT_DETAILS_CARD);
    }

    public final void a() {
        this.c.a(jth.SEE_MORE_BUTTON, jth.SMART_PROFILE_CONTACT_DETAILS_CARD);
    }

    public final void a(Bundle bundle) {
        bundle.putBoolean("contactInfoCardController", this.g.b);
    }

    public final void a(List list, List list2, List list3) {
        boolean z;
        boolean z2;
        Drawable drawable;
        Drawable drawable2;
        String str;
        Drawable drawable3;
        List list4 = list2;
        char c2 = 0;
        this.f = new abjz(this.a, 0);
        int i = 2;
        if (!list.isEmpty()) {
            abjz abjz = this.f;
            abjz abjz2 = new abjz(this.a, 2);
            int i2 = 0;
            while (i2 < list.size()) {
                if (i2 == 0) {
                    drawable3 = uj.b(this.a, R.drawable.quantum_ic_email_vd_theme_24);
                } else {
                    drawable3 = null;
                }
                avhx avhx = (avhx) list.get(i2);
                int i3 = i2 + 1;
                abjz abjz3 = abjz2;
                abjz3.a(a(R.layout.contact_info_entry, drawable3, avhx.b, avhx.c, this.a.getString(R.string.contact_info_email_content_description, new Object[]{Integer.valueOf(i3), Integer.valueOf(list.size()), avhx.c, avhx.b}), abfz.a(avhx.b, this.e), jth.SMART_PROFILE_CONTACT_DETAILS_CARD_EMAIL_LINK));
                abjz2 = abjz3;
                abjz = abjz;
                i2 = i3;
            }
            abjz.a(abjz2);
        }
        int i4 = 32;
        if (!list2.isEmpty()) {
            abjz abjz4 = this.f;
            HashMap hashMap = new HashMap();
            int size = list2.size();
            for (int i5 = 0; i5 < size; i5++) {
                avhy avhy = (avhy) list4.get(i5);
                if (!avhy.c.isEmpty()) {
                    if (hashMap.containsKey(avhy.c)) {
                        String str2 = avhy.c;
                        hashMap.put(str2, Integer.valueOf(((Integer) hashMap.get(str2)).intValue() + 1));
                    } else {
                        hashMap.put(avhy.c, 1);
                    }
                }
            }
            abjz abjz5 = new abjz(this.a, 2);
            int i6 = 0;
            while (i6 < list2.size()) {
                if (i6 == 0) {
                    drawable2 = uj.b(this.a, R.drawable.quantum_ic_call_vd_theme_24);
                } else {
                    drawable2 = null;
                }
                avhy avhy2 = (avhy) list4.get(i6);
                String str3 = avhy2.b;
                String str4 = avhy2.c;
                String str5 = "";
                if (!hashMap.containsKey(str4) || ((Integer) hashMap.get(avhy2.c)).intValue() <= 1) {
                    str = str5;
                } else {
                    if ((avhy2.a & i4) != 0) {
                        int a2 = avhw.a(avhy2.d);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        int i7 = a2 - 1;
                        if (i7 != 1) {
                            str = i7 != i ? i7 != 3 ? str5 : this.a.getString(R.string.contact_info_source_context_organization_profile) : this.a.getString(R.string.contact_info_source_context_contacts);
                        } else {
                            str5 = this.a.getString(R.string.contact_info_source_context_google_profile);
                        }
                    }
                    str = str5;
                }
                int i8 = i6 + 1;
                String string = this.a.getString(R.string.contact_info_phone_content_description, new Object[]{Integer.valueOf(i8), Integer.valueOf(list2.size()), avhy2.c, avhy2.b});
                Intent a3 = abfz.a(str3);
                String str6 = str3;
                String str7 = str3;
                String str8 = string;
                abjz abjz6 = abjz5;
                Intent intent = a3;
                HashMap hashMap2 = hashMap;
                abkf a4 = a(R.layout.contact_info_phone_entry, drawable2, str6, str4, str8, intent, jth.CONTACT_DETAILS_CARD_CALL_PHONE_LINK);
                Intent intent2 = new Intent("android.intent.action.SENDTO");
                String valueOf = String.valueOf(str7);
                intent2.setData(Uri.parse(valueOf.length() == 0 ? new String("smsto:") : "smsto:".concat(valueOf)));
                if (intent2.resolveActivity(this.a.getPackageManager()) != null) {
                    View findViewById = a4.c.findViewById(R.id.textsms_icon);
                    findViewById.setVisibility(0);
                    findViewById.setOnClickListener(new abis(this, intent2));
                }
                if (!TextUtils.isEmpty(str)) {
                    View findViewById2 = a4.c.findViewById(R.id.info_icon);
                    findViewById2.setVisibility(0);
                    findViewById2.setContentDescription(str);
                    findViewById2.setFocusable(true);
                    findViewById2.setOnClickListener(new abit(this, str, findViewById2));
                }
                abjz6.a(a4);
                abjz5 = abjz6;
                i6 = i8;
                hashMap = hashMap2;
                i4 = 32;
                i = 2;
            }
            abjz4.a(abjz5);
        }
        if (!list3.isEmpty()) {
            abjz abjz7 = this.f;
            abjz abjz8 = new abjz(this.a, 2);
            int i9 = 0;
            while (i9 < list3.size()) {
                if (i9 == 0) {
                    drawable = uj.b(this.a, R.drawable.quantum_ic_location_on_vd_theme_24);
                } else {
                    drawable = null;
                }
                avhu avhu = (avhu) list3.get(i9);
                String str9 = avhu.b;
                String str10 = avhu.c;
                Context context = this.a;
                Object[] objArr = new Object[4];
                int i10 = i9 + 1;
                objArr[c2] = Integer.valueOf(i10);
                objArr[1] = Integer.valueOf(list3.size());
                objArr[2] = avhu.c;
                objArr[3] = avhu.b.replace('-', ' ');
                abjz8.a(a(R.layout.contact_info_entry, drawable, str9, str10, context.getString(R.string.contact_info_address_content_description, objArr), abfz.b(avhu.b), jth.CONTACT_DETAILS_CARD_ADDRESS_LINK));
                i9 = i10;
                c2 = 0;
            }
            abjz7.a(abjz8);
            List list5 = list3;
        } else {
            List list6 = list3;
        }
        Bundle bundle = this.d;
        if (bundle == null || !bundle.getBoolean("contactInfoCardController")) {
            z = false;
        } else {
            z = true;
        }
        if (list.size() > 2 || list2.size() > 2 || list3.size() > 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        abke abke = this.g;
        if (abke != null) {
            boolean z3 = abke.b;
            abjz abjz9 = this.f;
            abke.c = abjz9;
            ViewGroup viewGroup = (ViewGroup) abke.a.findViewById(R.id.card_content);
            viewGroup.removeAllViews();
            viewGroup.addView(abjz9.c);
            abke.a(z2, z3);
            return;
        }
        this.g = new abke(this.b, this.f, this, z2, z);
    }
}
