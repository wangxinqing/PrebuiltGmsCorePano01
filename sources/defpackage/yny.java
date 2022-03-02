package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.common.audience.widgets.AudienceView;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.audience.AclSelectionChimeraActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yny  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yny extends ypj implements CompoundButton.OnCheckedChangeListener, View.OnClickListener, yqc, iip {
    public int a;
    public AudienceView b;
    public boolean c;
    public boolean d;
    private LinearLayout o;
    private TextView p;
    private CompoundButton q;
    private View r;
    private String s;
    private int t;

    public static yny a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Integer num, String str3, String str4, String str5, int i, boolean z5, int i2, int i3, int i4, List list) {
        Bundle a2 = ypj.a(str, str2, z, z2, z3, z4, num, false, str3, str4, str5, true, z5, i2, i3, i4, list);
        a2.putInt("domainRestricted", i);
        yny yny = new yny();
        yny.setArguments(a2);
        return yny;
    }

    private final void i() {
        if (this.p.getVisibility() != 8) {
            ArrayList arrayList = new ArrayList();
            for (AudienceMember audienceMember : g().a.b) {
                arrayList.add(audienceMember.f);
            }
            TextView textView = this.p;
            String str = this.f;
            String join = TextUtils.join(", ", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(join).length());
            sb.append(str);
            sb.append(" ");
            sb.append(join);
            textView.setContentDescription(sb.toString());
        }
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        FavaDiagnosticsEntity favaDiagnosticsEntity;
        if (compoundButton == this.q) {
            int i = 2;
            this.a = !z ? 2 : 1;
            if (z) {
                favaDiagnosticsEntity = iax.A;
            } else {
                favaDiagnosticsEntity = iax.B;
            }
            izr.a((Context) getActivity(), this.j, this.k, favaDiagnosticsEntity, iay.a, this.m);
            iww iww = new iww(g().a);
            if (z) {
                i = 1;
            }
            iww.a(i);
            g().a(iww.a(), this);
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.search_icon) {
            ((AclSelectionChimeraActivity) b()).onSearchRequested();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = bundle.getInt("domainRestricted");
            this.s = bundle.getString("domain");
            this.t = bundle.getInt("domainRestrictedVisibility", 4);
            this.d = bundle.getBoolean("hideSearchIcon");
            this.c = bundle.getBoolean("underage");
        } else {
            this.a = getArguments().getInt("domainRestricted");
            this.s = "";
            this.t = 4;
        }
        if (bundle == null && this.a != 0) {
            izr.a((Context) getActivity(), this.j, this.k, iax.z, iay.a, this.m);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("domainRestricted", this.a);
        bundle.putString("domain", this.s);
        View view = this.r;
        if (view != null) {
            bundle.putInt("domainRestrictedVisibility", view.getVisibility());
        }
        bundle.putBoolean("hideSearchIcon", this.d);
        bundle.putBoolean("underage", this.c);
    }

    public final void onStart() {
        super.onStart();
        g().a(this);
    }

    public final void onStop() {
        g().b(this);
        super.onStop();
    }

    private final void a(String str, int i) {
        ((TextView) this.r.findViewById(R.id.plus_domain_title)).setText(getResources().getString(R.string.plus_domain_restricted_choice_title, new Object[]{str}));
        ((TextView) this.r.findViewById(R.id.plus_domain_body)).setText(getResources().getString(R.string.plus_domain_restricted_choice_body, new Object[]{str}));
        this.r.setVisibility(i);
    }

    public final View a() {
        LayoutInflater from = LayoutInflater.from(getActivity());
        AudienceView audienceView = new AudienceView(getActivity());
        this.b = audienceView;
        iva.a((Object) this);
        audienceView.a(2, (iin) null, this);
        boolean z = false;
        this.b.b(false);
        this.b.a(g().a);
        this.b.a(this.c);
        LinearLayout linearLayout = (LinearLayout) from.inflate(R.layout.plus_audience_selection_pacl_header, (ViewGroup) null);
        this.o = linearLayout;
        linearLayout.addView(this.b);
        this.o.findViewById(R.id.search_icon).setOnClickListener(this);
        this.p = (TextView) this.o.findViewById(R.id.description);
        if (TextUtils.isEmpty(this.f)) {
            this.p.setVisibility(8);
        } else {
            this.p.setText(this.f);
            i();
        }
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                z = true;
            }
            View inflate = from.inflate(R.layout.plus_audience_selection_acl_domain_restricted_header, (ViewGroup) null);
            this.r = inflate;
            this.q = (CompoundButton) inflate.findViewById(R.id.plus_switch);
            a(this.s, this.t);
            this.q.setOnCheckedChangeListener(this);
            this.q.setChecked(z);
            this.o.addView(this.r);
        }
        if (this.d) {
            this.o.findViewById(R.id.search_icon).setVisibility(8);
        }
        return this.o;
    }

    public final void a(Object obj) {
        this.b.a(g().a);
        i();
    }

    public final void a(xaa xaa) {
        String d2 = xaa.d("dasher_domain");
        this.s = d2;
        if (TextUtils.isEmpty(d2)) {
            this.s = getResources().getString(R.string.plus_domain_default);
        }
        if (this.a != 0) {
            a(this.s, 0);
        }
    }
}
