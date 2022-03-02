package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.identity.accounts.api.AccountData;
import com.google.android.gms.smart_profile.card.view.BaseCardView;
import java.text.DateFormat;
import java.util.Date;

/* renamed from: abjh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abjh {
    public final jtf a;

    public abjh(Context context, BaseCardView baseCardView, avio avio, String str, String str2, String str3, jsx jsx, jtf jtf) {
        int i;
        Intent intent;
        Context context2 = context;
        BaseCardView baseCardView2 = baseCardView;
        avio avio2 = avio;
        String str4 = str;
        this.a = jtf;
        if (avio2.a.size() != 0) {
            if (!azim.b() || !azhl.a.a().a()) {
                baseCardView2.a((int) R.string.profile_posts_title);
            } else {
                baseCardView2.a((int) R.string.gm_profile_posts_title);
            }
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.nested_posts_entry, (ViewGroup) null);
            int childCount = viewGroup.getChildCount();
            int i2 = 320;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i4 < avio2.a.size()) {
                    if (i4 >= childCount) {
                        String str5 = str2;
                        break;
                    }
                    avim avim = (avim) avio2.a.get(i4);
                    ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(i4);
                    viewGroup2.setVisibility(i3);
                    if ((avim.a & 2) == 0) {
                        jsx jsx2 = jsx;
                    } else {
                        avin avin = avim.c;
                        if (!(avin == null ? avin.b : avin).a.isEmpty()) {
                            avin avin2 = avim.c;
                            jsx.a((avin2 == null ? avin.b : avin2).a, i2, new abje(viewGroup2));
                            i2++;
                        } else {
                            jsx jsx3 = jsx;
                        }
                    }
                    if ((avim.a & 32) != 0) {
                        i = i2;
                        ((TextView) viewGroup2.findViewById(R.id.text)).setText(DateFormat.getDateInstance(1).format(new Date(avim.e)));
                    } else {
                        i = i2;
                    }
                    if (!avim.b.isEmpty()) {
                        SpannableString spannableString = new SpannableString(jpr.a(avim.b).toString());
                        jpr.a((Spannable) spannableString, kf.b(context2, R.color.card_entry_light_text_color));
                        ((TextView) viewGroup2.findViewById(R.id.subtext)).setText(spannableString.toString());
                    }
                    if (avim.d.isEmpty()) {
                        String str6 = str2;
                    } else {
                        String str7 = avim.d;
                        if (!TextUtils.isEmpty(str7)) {
                            intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                            abfz.a(context2, intent, str4, str2);
                        } else {
                            String str8 = str2;
                            intent = null;
                        }
                        viewGroup2.setOnClickListener(new abjf(this, intent, context2));
                    }
                    i4++;
                    avio2 = avio;
                    i2 = i;
                    i3 = 0;
                } else {
                    String str9 = str2;
                    break;
                }
            }
            baseCardView2.a((View) viewGroup);
            String e = azje.a.a().e();
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(String.format(e, new Object[]{str3})));
            Intent intent3 = (Intent) intent2.clone();
            intent3.setPackage("com.google.android.apps.plus");
            if (context.getPackageManager().resolveActivity(intent3, 0) != null) {
                if (str4 != null) {
                    pxz.a(context2, intent3, TextUtils.isEmpty(str2) ? AccountData.a(str) : AccountData.a(str, str2));
                }
                intent2 = intent3;
            }
            if (intent2 != null && intent2.resolveActivity(context.getPackageManager()) != null) {
                baseCardView2.a((int) R.string.posts_see_all, (int) R.drawable.quantum_ic_google_plus_vd_theme_24, (View.OnClickListener) new abjg(this, intent2, context2));
                baseCardView2.findViewById(R.id.bottom_button).setContentDescription(context2.getString(R.string.posts_see_all_content_description));
                return;
            }
            return;
        }
        baseCardView2.setVisibility(8);
    }
}
