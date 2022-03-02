package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.gms.smart_profile.card.view.BaseCardView;

/* renamed from: abjd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abjd {
    public abjd(Context context, BaseCardView baseCardView, avjs avjs, String str, String str2, String str3, jsx jsx, jtf jtf) {
        Context context2 = context;
        BaseCardView baseCardView2 = baseCardView;
        avjs avjs2 = avjs;
        if (avjs2.a.size() != 0) {
            baseCardView2.a((int) R.string.profile_photos_title);
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.nested_photos_entry, (ViewGroup) null);
            int childCount = viewGroup.getChildCount();
            int i = 340;
            int i2 = 0;
            while (i2 < avjs2.a.size() && i2 < childCount) {
                avjr avjr = (avjr) avjs2.a.get(i2);
                if (!avjr.a.isEmpty()) {
                    ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(i2);
                    viewGroup2.setVisibility(0);
                    jsx.a(avjr.a, i, new abjb(viewGroup2));
                    viewGroup2.findViewById(R.id.text).setVisibility(8);
                    viewGroup2.findViewById(R.id.subtext).setVisibility(8);
                    i++;
                } else {
                    jsx jsx2 = jsx;
                }
                i2++;
            }
            baseCardView2.a((View) viewGroup);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format(azje.a.a().d(), new Object[]{str3})));
            abfz.a(context, intent, str, str2);
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                baseCardView2.a((int) R.string.photos_see_all, (int) R.drawable.quantum_ic_google_vd_theme_24, (View.OnClickListener) new abjc(intent, context, jtf));
                return;
            }
            return;
        }
        baseCardView2.setVisibility(8);
    }
}
