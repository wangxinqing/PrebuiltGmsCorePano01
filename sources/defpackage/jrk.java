package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.contactsheet.card.common.CardButton;
import com.google.android.gms.contactsheet.card.common.ExpandableLinearLayout;
import java.util.Iterator;

/* renamed from: jrk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jrk implements ax {
    public final jtf a;
    public final View b;
    public final ExpandableLinearLayout c;
    public final int d;
    public final int e;
    public int f = this.d;
    public final abfg g;
    private final jsx h;
    private final TextView i;
    private final View j;
    private final TextView k;
    private final TextView l;
    private final CardButton m;
    private final int n;
    private int o;
    private int p;
    private boolean q;
    private final LinearLayout.LayoutParams r;

    public jrk(View view, jtf jtf, jsx jsx, abfg abfg) {
        this.b = view;
        this.a = jtf;
        this.h = jsx;
        this.g = abfg;
        this.d = view.getResources().getInteger(R.integer.reporting_chain_report_rows_when_collapsed);
        this.e = view.getResources().getInteger(R.integer.reporting_chain_max_num_rows_to_expand_at_once);
        this.n = view.getResources().getInteger(R.integer.reporting_chain_entries_per_row);
        this.i = (TextView) view.findViewById(R.id.manager_title);
        this.j = view.findViewById(R.id.manager_entry);
        this.k = (TextView) view.findViewById(R.id.reports_title);
        this.c = (ExpandableLinearLayout) view.findViewById(R.id.report_list);
        this.m = (CardButton) view.findViewById(R.id.card_button);
        this.l = (TextView) view.findViewById(R.id.warning_message);
        if (azhl.c()) {
            ry.a(this.l, uj.b(view.getContext(), R.drawable.quantum_ic_error_vd_theme_24), (Drawable) null);
        }
        this.r = new LinearLayout.LayoutParams(0, -2, 1.0f);
        view.setVisibility(8);
    }

    private final jru a(avju avju) {
        jru a2 = jru.a();
        a2.b();
        a2.i = new jri(this, avju);
        int i2 = avju.a;
        if ((i2 & 1) != 0) {
            a2.a = avju.b;
        }
        if ((i2 & 8) != 0) {
            a2.b = avju.e;
        }
        return a2;
    }

    private final void a(String str, View view) {
        String str2;
        jsx jsx = this.h;
        if (!TextUtils.isEmpty(str)) {
            str2 = jpr.b(str);
        } else {
            str2 = azid.b();
        }
        String a2 = iqv.a(str2, this.b.getResources().getDimensionPixelSize(R.dimen.gm_card_avatar_diameter));
        int i2 = this.o;
        this.o = i2 + 1;
        jsx.a(a2, i2, new jrj(this, view));
    }

    public final void a() {
        this.c.a(this.f);
        if (azim.b() && azhl.a.a().g()) {
            this.l.setVisibility(8);
        }
        if (this.c.getChildCount() <= this.d) {
            this.m.setVisibility(8);
        } else if (this.c.getChildCount() == this.f) {
            this.m.b();
            this.m.setOnClickListener(new jrf(this));
            if (this.q) {
                this.l.setVisibility(0);
            }
        } else if (this.c.getChildCount() - this.f <= this.e) {
            this.m.a();
            this.m.a(this.b.getContext().getString(R.string.reporting_chain_all_reports, new Object[]{Integer.valueOf(this.p)}));
            this.m.setOnClickListener(new jrg(this));
        } else {
            this.m.a();
            this.m.a(this.b.getContext().getString(R.string.reporting_chain_more_reports, new Object[]{Integer.valueOf(this.e * this.n)}));
            this.m.setOnClickListener(new jrh(this));
        }
    }

    public final void a(amri amri) {
        boolean z;
        if (!amri.a() || ((((avjv) amri.b()).a & 1) == 0 && ((avjv) amri.b()).c.size() <= 0)) {
            this.b.setVisibility(8);
            return;
        }
        this.o = 400;
        this.b.setVisibility(0);
        avjv avjv = (avjv) amri.b();
        if ((avjv.a & 1) != 0) {
            this.i.setVisibility(0);
            this.j.setVisibility(0);
            avju avju = avjv.b;
            if (avju == null) {
                avju = avju.f;
            }
            a(avju).a(this.j);
            avju avju2 = avjv.b;
            if (avju2 == null) {
                avju2 = avju.f;
            }
            a(avju2.d, this.j);
        } else {
            this.j.setOnClickListener((View.OnClickListener) null);
            this.j.setVisibility(8);
            this.i.setVisibility(8);
        }
        this.c.removeAllViews();
        this.l.setVisibility(8);
        if (avjv.d > avjv.c.size()) {
            z = true;
        } else {
            z = false;
        }
        this.q = z;
        if (avjv.c.size() > 0) {
            this.p = avjv.c.size();
            this.k.setText(this.b.getContext().getString(R.string.reporting_chain_reports, new Object[]{Integer.valueOf(avjv.d)}));
            this.k.setVisibility(0);
            this.c.setVisibility(0);
            Iterator it = avjv.c.iterator();
            while (it.hasNext()) {
                LinearLayout linearLayout = new LinearLayout(this.b.getContext());
                linearLayout.setOrientation(0);
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                this.c.addView(linearLayout);
                for (int i2 = 0; i2 < this.n; i2++) {
                    if (it.hasNext()) {
                        avju avju3 = (avju) it.next();
                        View a2 = a(avju3).a(linearLayout.getContext(), linearLayout);
                        a(avju3.d, a2);
                        a2.setLayoutParams(this.r);
                        linearLayout.addView(a2);
                    } else {
                        View view = new View(this.b.getContext());
                        view.setVisibility(4);
                        view.setLayoutParams(this.r);
                        linearLayout.addView(view);
                    }
                }
            }
        } else {
            this.k.setVisibility(8);
            this.c.setVisibility(8);
        }
        a();
    }
}
