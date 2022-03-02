package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.contactsheet.card.common.CardButton;
import com.google.android.gms.contactsheet.card.common.ExpandableLinearLayout;
import java.net.URISyntaxException;

/* renamed from: jqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jqm implements ax {
    public boolean a;
    public final CardButton b;
    public final jtf c;
    public final ExpandableLinearLayout d;
    public final View e;
    private final int f;
    private int g;
    private final jsx h;
    private final TextView i;

    public jqm(View view, int i2, jsx jsx, jtf jtf) {
        this.e = view;
        this.f = i2;
        this.h = jsx;
        this.c = jtf;
        this.d = (ExpandableLinearLayout) view.findViewById(R.id.entries);
        this.i = (TextView) view.findViewById(R.id.title);
        CardButton cardButton = (CardButton) view.findViewById(R.id.card_button);
        this.b = cardButton;
        cardButton.setOnClickListener(new jqg(this));
        view.setVisibility(8);
    }

    private final amri a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Intent parseUri = Intent.parseUri(str, 0);
                if (parseUri.resolveActivity(this.e.getContext().getPackageManager()) != null) {
                    return amri.b(parseUri);
                }
            } catch (URISyntaxException e2) {
            }
        }
        return ampu.a;
    }

    public final void a() {
        this.a = false;
        this.b.a();
        this.d.a(3);
    }

    public final void a(amri amri) {
        int i2;
        RelativeLayout relativeLayout;
        this.g = this.f;
        this.e.setVisibility(8);
        this.d.removeAllViews();
        if (amri.a() && ((avih) amri.b()).b.size() != 0) {
            avih avih = (avih) amri.b();
            if (!avih.a.isEmpty()) {
                if (!avih.c.isEmpty()) {
                    this.i.setContentDescription(avih.c);
                }
                this.i.setText(avih.a);
                this.i.setVisibility(0);
                i2 = 0;
            } else {
                this.i.setVisibility(8);
                i2 = 0;
            }
            while (i2 < avih.b.size() && i2 < 20) {
                avii avii = (avii) avih.b.get(i2);
                if (!avii.b.isEmpty() || !avii.c.isEmpty()) {
                    ExpandableLinearLayout expandableLinearLayout = this.d;
                    if (!azhr.c()) {
                        relativeLayout = LayoutInflater.from(this.e.getContext()).inflate(R.layout.gm_card_entry, this.d, false);
                    } else if (azhu.b()) {
                        RelativeLayout relativeLayout2 = (RelativeLayout) LayoutInflater.from(this.e.getContext()).inflate(R.layout.gm_card_entry_bugfix, this.d, false);
                        int dimensionPixelSize = relativeLayout2.getResources().getDimensionPixelSize(R.dimen.gm_card_entry_padding);
                        relativeLayout2.getChildAt(1).setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
                        relativeLayout = relativeLayout2;
                    } else {
                        relativeLayout = LayoutInflater.from(this.e.getContext()).inflate(R.layout.gm_card_entry_bugfix, this.d, false);
                    }
                    jru a2 = jru.a();
                    if (!avii.b.isEmpty()) {
                        a2.a = avii.b;
                    }
                    if (!avii.c.isEmpty()) {
                        a2.b = avii.c;
                    }
                    amri a3 = a(avii.d);
                    if (a3.a() && ((Intent) a3.b()).resolveActivity(this.e.getContext().getPackageManager()) != null) {
                        a2.i = new jqh(this, a3);
                        a2.j = new jqi(this, a3);
                    }
                    amri a4 = a(avii.f);
                    if (a4.a() && ((Intent) a4.b()).resolveActivity(this.e.getContext().getPackageManager()) != null) {
                        a2.k = new jqj(this, a4);
                    }
                    if (!avii.g.isEmpty()) {
                        String str = avii.g;
                        a2.g = str;
                        a2.f = str;
                    }
                    if (!avii.h.isEmpty()) {
                        a2.h = avii.h;
                    }
                    int dimensionPixelSize2 = relativeLayout.getContext().getResources().getDimensionPixelSize(R.dimen.gm_card_entry_icon_size);
                    if (!avii.a.isEmpty()) {
                        jsx jsx = this.h;
                        String str2 = avii.a;
                        int i3 = this.g;
                        this.g = i3 + 1;
                        jsx.a(str2, i3, new jqk(relativeLayout, dimensionPixelSize2));
                    }
                    if (!avii.e.isEmpty()) {
                        jsx jsx2 = this.h;
                        String str3 = avii.e;
                        int i4 = this.g;
                        this.g = i4 + 1;
                        jsx2.a(str3, i4, new jql(relativeLayout, dimensionPixelSize2));
                    }
                    if (avii.b.isEmpty() && avii.a.isEmpty() && avii.e.isEmpty()) {
                        TextView textView = (TextView) relativeLayout.findViewById(R.id.subtext);
                        Context context = this.e.getContext();
                        TypedValue typedValue = new TypedValue();
                        if (context.getTheme().resolveAttribute(R.attr.textAppearanceBody2, typedValue, true) && typedValue.resourceId != 0) {
                            ry.a(textView, 2132018264);
                        }
                        textView.setTextColor(jsa.a(relativeLayout.getContext(), 16842806));
                    }
                    a2.a(relativeLayout);
                    expandableLinearLayout.addView(relativeLayout);
                }
                i2++;
            }
            if (this.d.getChildCount() > 3) {
                this.b.setVisibility(0);
                a();
            } else {
                this.b.setVisibility(8);
            }
            if (this.d.getChildCount() != 0) {
                this.e.setVisibility(0);
            }
        }
    }
}
