package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.smart_profile.card.view.BaseCardView;
import java.net.URISyntaxException;

/* renamed from: abiz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abiz implements abir, abkd {
    public final Context a;
    public final jtf b;
    private final avih c;
    private final jsx d;
    private int e;
    private abkc f;
    private abke g;

    public abiz(Context context, BaseCardView baseCardView, avih avih, int i, jsx jsx, jtf jtf, Bundle bundle) {
        ViewGroup viewGroup;
        String str;
        BaseCardView baseCardView2 = baseCardView;
        avih avih2 = avih;
        Bundle bundle2 = bundle;
        this.a = context;
        this.c = avih2;
        this.e = i;
        this.d = jsx;
        this.b = jtf;
        Context context2 = this.a;
        abjz abjz = new abjz(context2, 3, uj.b(context2, R.drawable.entry_divider));
        int i2 = 0;
        while (i2 < this.c.b.size() && i2 < 20) {
            avii avii = (avii) this.c.b.get(i2);
            if (!azjb.a.a().e()) {
                viewGroup = (ViewGroup) LayoutInflater.from(this.a).inflate(R.layout.generic_card_entry, (ViewGroup) null);
            } else {
                viewGroup = (ViewGroup) LayoutInflater.from(this.a).inflate(R.layout.generic_entry, (ViewGroup) null);
            }
            Intent a2 = a(avii.d);
            if (!(a2 == null || a2.resolveActivity(this.a.getPackageManager()) == null)) {
                viewGroup.setOnClickListener(new abiw(this, a2));
            }
            a((ImageView) viewGroup.findViewById(R.id.icon), jth.GENERIC_CARD_PRIMARY_ICON, avii.a, avii.g, a2);
            a((ImageView) viewGroup.findViewById(R.id.alt_icon), jth.GENERIC_CARD_ALTERNATE_ICON, avii.e, avii.h, a(avii.f));
            TextView textView = (TextView) viewGroup.findViewById(R.id.header);
            if (!avii.b.isEmpty()) {
                textView.setVisibility(0);
                textView.setText(avii.b);
            }
            TextView textView2 = (TextView) viewGroup.findViewById(R.id.text);
            if (!avii.c.isEmpty()) {
                textView2.setVisibility(0);
                textView2.setText(avii.c);
            }
            if (avii.b.isEmpty() && avii.a.isEmpty() && avii.e.isEmpty()) {
                TextView textView3 = (TextView) viewGroup.findViewById(R.id.text);
                textView3.setTextSize(0, this.a.getResources().getDimension(R.dimen.card_entry_text_size));
                textView3.setTextColor(kf.b(this.a, R.color.card_entry_text_color));
            }
            abkf abkf = new abkf(viewGroup);
            if (!avii.b.isEmpty() || !avii.c.isEmpty()) {
                if (!avii.b.isEmpty()) {
                    str = avii.b;
                } else {
                    str = avii.c;
                }
                abkf.a(str);
            }
            abjz.a(abkf);
            i2++;
        }
        this.f = abjz;
        if (!avih2.a.isEmpty()) {
            baseCardView2.a(avih2.a);
            if (!avih2.c.isEmpty()) {
                baseCardView2.findViewById(R.id.title).setContentDescription(avih2.c);
            }
        }
        this.g = new abke(baseCardView, this.f, this, avih2.b.size() > 3, bundle2 != null && bundle2.getBoolean("genericCardExpanded"));
    }

    private final Intent a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Intent parseUri = Intent.parseUri(str, 0);
            if (parseUri.resolveActivity(this.a.getPackageManager()) != null) {
                return parseUri;
            }
            return null;
        } catch (URISyntaxException e2) {
            return null;
        }
    }

    public final void b() {
        this.b.a(jth.SEE_LESS_BUTTON, jth.GENERIC_CARD);
    }

    private final void a(ImageView imageView, jth jth, String str, String str2, Intent intent) {
        if (!TextUtils.isEmpty(str)) {
            jsx jsx = this.d;
            int i = this.e;
            this.e = i + 1;
            jsx.a(str, i, new abix(imageView));
        }
        if (!TextUtils.isEmpty(str2)) {
            imageView.setContentDescription(str2);
        }
        if (intent != null && intent.resolveActivity(this.a.getPackageManager()) != null) {
            imageView.setOnClickListener(new abiy(this, intent, jth));
        }
    }

    public final void a() {
        this.b.a(jth.SEE_MORE_BUTTON, jth.GENERIC_CARD);
    }

    public final void a(Bundle bundle) {
        bundle.putBoolean("genericCardExpanded", this.g.b);
    }
}
