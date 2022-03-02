package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.smart_profile.card.view.BaseCardView;

/* renamed from: abjy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abjy {
    public final jtf a;

    public abjy(Context context, BaseCardView baseCardView, avjx avjx, jsx jsx, jtf jtf) {
        int a2;
        Context context2 = context;
        BaseCardView baseCardView2 = baseCardView;
        avjx avjx2 = avjx;
        this.a = jtf;
        if ((avjx2.a & 2) != 0) {
            baseCardView2.findViewById(R.id.card_content).setPadding(0, 0, 0, 0);
            Intent intent = null;
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.shared_current_location_entry, (ViewGroup) null);
            avid avid = avjx2.b;
            avid = avid == null ? avid.h : avid;
            if ((avid.a & 1) != 0 && (a2 = avic.a(avid.b)) != 0 && a2 == 2) {
                int i = avid.a;
                if (!((i & 2) == 0 || (i & 4) == 0 || (i & 32) == 0)) {
                    double d = avid.c;
                    double d2 = avid.d;
                    String str = avid.f;
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    String encode = Uri.encode(str);
                    StringBuilder sb = new StringBuilder(String.valueOf(encode).length() + 107);
                    sb.append("geo:");
                    sb.append(d);
                    sb.append(",");
                    sb.append(d2);
                    sb.append("?q=");
                    sb.append(d);
                    sb.append(",");
                    sb.append(d2);
                    sb.append("(");
                    sb.append(encode);
                    sb.append(")");
                    intent2.setData(Uri.parse(sb.toString()));
                    intent = intent2;
                }
            } else if ((avid.a & 32) != 0) {
                intent = abfz.b(avid.f);
            }
            if (!avid.g.isEmpty()) {
                jsx.a(jpr.b(avid.g), 12, new abjt(this, (ImageView) viewGroup.findViewById(R.id.location_map_image), context2, intent));
            }
            ((TextView) viewGroup.findViewById(R.id.title)).setText(R.string.real_time_location_title);
            View findViewById = viewGroup.findViewById(R.id.location_info);
            findViewById.setOnClickListener(new abju(intent, context2));
            if (!avid.f.isEmpty()) {
                TextView textView = (TextView) viewGroup.findViewById(R.id.text);
                textView.setText(avid.f);
                textView.findViewById(R.id.text).setContentDescription(context2.getString(R.string.view_in_maps_content_description, new Object[]{avid.f}));
                findViewById.setOnLongClickListener(new abjv(context2, avid));
                if ((avid.a & 8) != 0) {
                    ((TextView) viewGroup.findViewById(R.id.subtext)).setText(context2.getString(R.string.shared_current_location_timestamp, new Object[]{DateUtils.getRelativeTimeSpanString(avid.e, System.currentTimeMillis(), 0, 262144).toString()}));
                }
                ((ImageView) viewGroup.findViewById(R.id.icon)).setImageDrawable(jpr.a(uj.b(context2, R.drawable.quantum_ic_person_pin_vd_theme_24), kf.b(context2, R.color.card_entry_text_color)));
            }
            ((ViewGroup) baseCardView2.findViewById(R.id.card_content)).addView(viewGroup);
            int i2 = avid.a;
            if ((i2 & 2) != 0 && (i2 & 4) != 0) {
                double d3 = avid.c;
                double d4 = avid.d;
                StringBuilder sb2 = new StringBuilder(49);
                sb2.append(d3);
                sb2.append(",");
                sb2.append(d4);
                String sb3 = sb2.toString();
                Intent intent3 = new Intent("android.intent.action.VIEW");
                intent3.setData(Uri.parse(String.format("https://maps.google.com/maps?daddr=%s", new Object[]{Uri.encode(sb3)})));
                if (intent3.resolveActivity(context.getPackageManager()) != null) {
                    baseCardView2.a((int) R.string.directions, (int) R.drawable.quantum_ic_directions_vd_theme_24, (View.OnClickListener) new abjw(this, intent3, context2));
                    return;
                }
                return;
            }
            return;
        }
        baseCardView2.setVisibility(8);
    }
}
