package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.smart_profile.card.view.BaseCardView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: abfl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abfl implements abgg, abhe, abia, abga {
    public jra A;
    public jre B;
    public jrq C;
    public jqo D;
    public jrk E;
    private final abhf F;
    private boolean G;
    private boolean H;
    private String I;
    private abiv J;
    private jqf K;
    public final Context a;
    public final ClientContext b;
    public final ViewGroup c;
    public final List d = new ArrayList();
    public final List e = new ArrayList();
    public final List f = new ArrayList();
    public final Set g = new HashSet();
    public final jsx h;
    public final String i;
    public final String j;
    public final String k;
    public final Activity l;
    public final jtf m;
    public ArrayList n = new ArrayList();
    public Bundle o;
    public boolean p;
    public boolean q;
    public abib r;
    public abfo s;
    public abfo t;
    public abfo u;
    public abfo v;
    public abfo w;
    public jpz x;
    public jqr y;
    public jqw z;

    public abfl(Activity activity, Context context, ClientContext clientContext, abhf abhf, ViewGroup viewGroup, jsx jsx, String str, String str2, String str3, jtf jtf, Bundle bundle) {
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        View view7;
        View view8;
        View view9;
        View view10;
        View view11;
        Bundle extras;
        int[] intArray;
        Activity activity2 = activity;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        jsx jsx2 = jsx;
        String str4 = str;
        String str5 = str3;
        jtf jtf2 = jtf;
        Bundle bundle2 = bundle;
        this.l = activity2;
        this.a = context2;
        this.b = clientContext;
        this.F = abhf;
        this.c = viewGroup2;
        this.h = jsx2;
        this.i = str4;
        this.j = str2;
        this.k = str5;
        this.m = jtf2;
        if (!(!azjb.b() || activity.getIntent() == null || (extras = activity.getIntent().getExtras()) == null || !extras.containsKey("com.google.android.gms.people.smart_profile.HIDE_THESE_CARDS") || (intArray = extras.getIntArray("com.google.android.gms.people.smart_profile.HIDE_THESE_CARDS")) == null)) {
            for (int valueOf : intArray) {
                this.g.add(Integer.valueOf(valueOf));
            }
        }
        if (bundle2 != null) {
            this.o = bundle2.getBundle("cardsController");
            this.n = bundle2.getParcelableArrayList("genericCardsController");
        }
        if (this.o == null) {
            this.o = new Bundle();
        }
        if (this.n == null) {
            this.n = new ArrayList();
        }
        this.s = new abfo(context2, viewGroup2, jtf2);
        this.t = new abfo(context2, viewGroup2, jtf2);
        this.u = new abfo(context2, viewGroup2, jtf2);
        this.v = new abfo(context2, viewGroup2, jtf2);
        this.w = new abfo(context2, viewGroup2, jtf2);
        if (azim.b()) {
            this.t.a(context2.getString(R.string.gm_contact_info_section_label));
        } else {
            this.t.a(context2.getString(R.string.contact_info_section_label));
        }
        this.w.a(context2.getString(R.string.merge_duplicates_section_label));
        viewGroup2.addView(this.s.a, viewGroup.getChildCount() - 1);
        viewGroup2.addView(this.t.a, viewGroup.getChildCount() - 1);
        viewGroup2.addView(this.u.a, viewGroup.getChildCount() - 1);
        viewGroup2.addView(this.v.a, viewGroup.getChildCount() - 1);
        viewGroup2.addView(this.w.a, viewGroup.getChildCount() - 1);
        if (azim.b()) {
            viewGroup2.setBackgroundColor(jsa.a(context));
            View inflate = LayoutInflater.from(context).inflate(R.layout.gm_about_card_view, viewGroup2, false);
            View inflate2 = LayoutInflater.from(context).inflate(R.layout.gm_contact_info_card_view, viewGroup2, false);
            View view12 = null;
            if (!aziv.b()) {
                view = LayoutInflater.from(context).inflate(R.layout.gm_photos_card_view, viewGroup2, false);
            } else {
                view = null;
            }
            View inflate3 = LayoutInflater.from(context).inflate(R.layout.gm_posts_card_view, viewGroup2, false);
            View inflate4 = LayoutInflater.from(context).inflate(R.layout.gm_recent_interactions_card_view, viewGroup2, false);
            view12 = !azis.b() ? LayoutInflater.from(context).inflate(R.layout.gm_related_people_card_view, viewGroup2, false) : view12;
            View inflate5 = LayoutInflater.from(context).inflate(R.layout.gm_shared_current_location_card_view, viewGroup2, false);
            View inflate6 = LayoutInflater.from(context).inflate(R.layout.gm_organizations_card_view, viewGroup2, false);
            if (azhl.c()) {
                view2 = inflate6;
                view3 = LayoutInflater.from(context).inflate(R.layout.gm_reporting_chain_card_bugfix, viewGroup2, false);
            } else {
                view2 = inflate6;
                view3 = LayoutInflater.from(context).inflate(R.layout.gm_reporting_chain_card, viewGroup2, false);
            }
            this.x = new jpz(inflate, jsx2, jtf2);
            this.K = new jqf(inflate2, str4, jtf2);
            if (!aziv.b()) {
                this.y = new jqr(view, jsx2, jtf2);
            }
            this.z = new jqw(inflate3, jsx2, jtf2);
            this.A = new jra(inflate4, str4, str5, jtf2);
            if (!azis.b()) {
                view5 = view;
                view10 = inflate5;
                view7 = inflate4;
                view9 = view2;
                view6 = inflate3;
                jre jre = r1;
                view8 = view12;
                view4 = inflate;
                view11 = view3;
                jre jre2 = new jre(view12, activity, str3, jsx, jtf);
                this.B = jre;
            } else {
                view8 = view12;
                view4 = inflate;
                view5 = view;
                view10 = inflate5;
                view11 = view3;
                view7 = inflate4;
                view9 = view2;
                view6 = inflate3;
            }
            this.C = new jrq(view10, jsx2, jtf2);
            this.D = new jqo(view9, jtf2);
            this.E = new jrk(view11, jtf2, jsx2, new abfg(activity2, str5));
            this.t.a(inflate2, jtg.a(jth.SMART_PROFILE_CONTACT_DETAILS_CARD));
            this.u.a(view11, jtg.a(jth.REPORTING_CHAIN_CARD));
            this.u.a(view4, jtg.a(jth.SMART_PROFILE_ABOUT_CARD));
            this.u.a(view9, jtg.a(jth.SMART_PROFILE_ORGANIZATIONS_CARD));
            this.u.a(view6, jtg.a(jth.SMART_PROFILE_GOOGLE_PLUS_POSTS_CARD));
            this.v.a(view7, jtg.a(jth.SMART_PROFILE_RECENT_INTERACTIONS_CARD));
            this.v.a(view10, jtg.a(jth.SMART_PROFILE_CURRENT_LOCATION_CARD));
            if (!aziv.b()) {
                this.v.a(view5, jtg.a(jth.SMART_PROFILE_PHOTOS_CARD));
            }
            if (!azis.b()) {
                this.v.a(view8, jtg.a(jth.SMART_PROFILE_PEOPLE_IN_COMMON_CARD));
            }
        }
    }

    private final void g() {
        if (this.I != null) {
            abfo[] abfoArr = {this.t, this.u, this.v, this.w};
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 4; i2++) {
                abfo abfo = abfoArr[i2];
                if (abfo.e()) {
                    arrayList.add(abfo);
                }
            }
            int i3 = 0;
            while (i3 < arrayList.size()) {
                abfo abfo2 = (abfo) arrayList.get(i3);
                i3++;
                int size = arrayList.size();
                TextView textView = (TextView) abfo2.a.findViewById(R.id.title);
                textView.setContentDescription(abfo2.a.getContext().getString(R.string.section_label_content_description, new Object[]{Integer.valueOf(i3), Integer.valueOf(size), textView.getText().toString()}));
            }
        }
    }

    public final void a() {
        this.p = false;
        this.q = false;
        if (!azim.b()) {
            this.u.a();
            this.v.a();
        }
        this.u.d();
        this.v.d();
        this.w.a();
        this.w.d();
    }

    public final void b() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(azje.a.a().a()));
        this.c.findViewById(R.id.blocked_message_container).setVisibility(0);
        if (intent.resolveActivity(this.l.getPackageManager()) != null) {
            this.c.findViewById(R.id.learn_more).setOnClickListener(new abfh(this, intent));
        } else {
            this.c.findViewById(R.id.learn_more).setVisibility(8);
        }
    }

    public final void c() {
        if (this.t.e()) {
            this.t.c();
        }
        if (this.p && this.q && this.G) {
            if (this.u.e()) {
                this.u.c();
            }
            if (this.H) {
                this.v.d();
            } else if (this.v.e()) {
                this.v.c();
            }
            if (this.w.e()) {
                this.w.c();
            }
            List list = this.d;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((abfk) list.get(i2)).a();
            }
        }
        g();
    }

    public final void d() {
        abhf abhf = this.F;
        abhf.a.clear();
        abhf.b.clear();
        abhf.a();
        this.w.c();
    }

    public final void e() {
        this.w.d();
    }

    public final void f() {
        this.w.c();
    }

    public final void a(abgh abgh) {
        if (abgh.b()) {
            this.I = abgh.b;
        } else {
            this.I = abgh.a() ? abgh.a : abgh.c;
        }
        this.u.a(this.a.getString(R.string.about_section_label, new Object[]{this.I}));
        this.v.a(this.a.getString(R.string.shared_data_section_label, new Object[]{this.I}));
        g();
    }

    public final void a(ArrayList arrayList, ArrayList arrayList2) {
        abhf abhf = this.F;
        abhf.a.clear();
        abhf.a.addAll(arrayList2);
        abhf.b.clear();
        abhf.b.addAll(arrayList);
        abhf.a();
        this.w.d();
    }

    public final void a(List list, List list2, List list3) {
        boolean z2;
        amri amri;
        boolean z3 = !list.isEmpty() || !list2.isEmpty() || !list3.isEmpty();
        if (azjb.b()) {
            z2 = !this.g.contains(0);
        } else {
            z2 = true;
        }
        if (azim.b()) {
            jqf jqf = this.K;
            if (z2) {
                jsi jsi = new jsi((byte[]) null);
                jsi.a = amri.b(amzy.a((Collection) list));
                jsi.b = amri.b(amzy.a((Collection) list2));
                jsi.c = amri.b(amzy.a((Collection) list3));
                amri = amri.b(new jsd(jsi.a, jsi.b, jsi.c));
            } else {
                amri = ampu.a;
            }
            jqf.a(amri);
        } else if (z3 && z2) {
            if (this.J == null) {
                BaseCardView baseCardView = (BaseCardView) LayoutInflater.from(this.a).inflate(R.layout.card, this.c, false);
                abiv abiv = new abiv(this.a, baseCardView, this.i, this.m, this.o);
                this.J = abiv;
                this.e.add(abiv);
                this.t.a(baseCardView, jtg.a(jth.SMART_PROFILE_CONTACT_DETAILS_CARD));
            }
            this.J.a(list, list2, list3);
        }
        this.G = true;
        c();
    }

    public final void a(boolean z2) {
        if (z2) {
            this.H = true;
            this.u.a(this.a.getString(R.string.about_section_label, new Object[]{""}));
            this.v.d();
            g();
        }
    }
}
