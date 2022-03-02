package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.SwitchCompat;
import android.support.v7.widget.Toolbar;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.common.Feature;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.contactssync.model.BackupAndSyncSuggestion;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import java.util.ArrayList;

/* renamed from: xtl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xtl extends xtr {
    Account a;
    public xug b;
    public SwitchCompat c;
    public AppCompatTextView d;
    public as e;
    public int f;
    private AccountParticleDisc h;
    private ViewGroup i;
    private ViewGroup j;
    private AppCompatTextView k;
    private AppCompatTextView l;
    private ViewGroup m;
    private ArrayList n;
    private as o;
    private final View.OnClickListener p = new xsy(this);

    private final void a(boolean z) {
        this.m.setVisibility(!z ? 8 : 0);
    }

    private final void g() {
        this.c.setEnabled(false);
        this.i.setEnabled(false);
    }

    public final int b() {
        return 5;
    }

    public final void c() {
        Toast.makeText(getContext(), R.string.common_something_went_wrong, 1).show();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        xug xug = (xug) qck.a(getActivity(), e()).a(xug.class);
        this.b = xug;
        as b2 = xug.b();
        this.o = b2;
        b2.a(this, new xtc(this));
        this.e = this.b.c();
        this.h.a((agbv) ((xsh) getActivity()).a(), agbl.class);
        if (bundle == null) {
            if (ayqs.b()) {
                f();
            } else {
                b(14);
            }
        }
        TypedArray obtainStyledAttributes = getActivity().getTheme().obtainStyledAttributes(getActivity().getThemeResId(), new int[]{16842907});
        this.f = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i3 == -1 && intent != null) {
            if (i2 == 2 || i2 == 1) {
                String stringExtra = intent.getStringExtra("authAccount");
                if (!TextUtils.isEmpty(stringExtra)) {
                    if (ayqr.c()) {
                        new xsx(getActivity()).a(stringExtra, true, this.d.getVisibility());
                    }
                    xtq xtq = this.b.f;
                    qci qci = new qci();
                    wsu wsu = xtq.a;
                    iha b2 = ihb.b();
                    b2.a = new wtc(stringExtra);
                    b2.b = new Feature[]{wku.b};
                    acwa b3 = ((iby) wsu).b(b2.a());
                    qci.getClass();
                    b3.a((acvp) new xto(qci));
                    qci.a(this, new xtg(this, stringExtra, i2));
                    super.onActivityResult(i2, -1, intent);
                }
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.backup_sync_fragment, viewGroup, false);
        this.j = (ViewGroup) inflate.findViewById(R.id.content);
        this.h = (AccountParticleDisc) inflate.findViewById(R.id.account_particle_disc);
        this.b = (xug) qck.a(getActivity(), e()).a(xug.class);
        ((bjs) getActivity()).a((Toolbar) inflate.findViewById(R.id.toolbar));
        ((bjs) getActivity()).aE().b(true);
        ((ViewGroup) inflate.findViewById(R.id.account_header_container)).setOnClickListener(new xta(this));
        this.m = (ViewGroup) inflate.findViewById(R.id.backup_account_container);
        this.c = (SwitchCompat) inflate.findViewById(R.id.backup_sync_toggle);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.backup_sync_toggle_container);
        this.i = viewGroup2;
        viewGroup2.setOnClickListener(this.p);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.help_and_feedback);
        imageView.setImageResource(R.drawable.quantum_ic_help_outline_vd_theme_24);
        imageView.setOnClickListener(new xtb(this));
        AppCompatTextView appCompatTextView = (AppCompatTextView) inflate.findViewById(R.id.contacts_not_backed_up);
        this.d = appCompatTextView;
        appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((int) R.drawable.quantum_gm_ic_info_vd_theme_24, 0, 0, 0);
        this.d.addOnLayoutChangeListener(new xtj(this));
        this.l = (AppCompatTextView) inflate.findViewById(R.id.display_name);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) inflate.findViewById(R.id.account_name);
        this.k = appCompatTextView2;
        appCompatTextView2.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, (int) R.drawable.quantum_ic_expand_more_vd_theme_24, 0);
        ((ImageView) inflate.findViewById(R.id.super_g)).setImageResource(R.drawable.googleg_standard_color_28_vd);
        TextView textView = (TextView) inflate.findViewById(R.id.information_banner);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.people_backup_sync_information_banner));
        spannableStringBuilder.append(" ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(getString(R.string.common_learn_more));
        spannableStringBuilder.setSpan(new xtk(this), length, spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.j = null;
        this.h = null;
        this.c = null;
        this.m = null;
        this.i = null;
        this.k = null;
        this.l = null;
        this.d = null;
    }

    public final void onResume() {
        super.onResume();
        if (ayqs.d()) {
            xug xug = this.b;
            if (!xug.e) {
                this.o.a((aj) this);
                this.o = this.b.b();
                this.e.a((aj) this);
                this.e = this.b.c();
                this.o.a(this, new xtd(this));
                return;
            }
            xug.e = false;
        }
    }

    public final void a() {
        this.c.setChecked(false);
        a(false);
    }

    public final void b(int i2) {
        this.g.a(i2, 5, xus.a(this.a));
    }

    public final void a(int i2) {
        if (ayqs.d()) {
            this.b.e = true;
        }
        Intent a2 = xus.a(this.a, getActivity().getResources().getString(R.string.people_select_account_for_backup), this.n);
        b(4);
        startActivityForResult(a2, i2);
    }

    public final void b(acwa acwa) {
        this.j.setVisibility(0);
        if (!acwa.b()) {
            a(5, acwa);
            this.d.setVisibility(8);
            return;
        }
        int i2 = ((BackupAndSyncSuggestion) acwa.d()).a;
        xuk xuk = this.g;
        aucd o2 = xms.f.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        xms xms = (xms) o2.b;
        xms.b = 4;
        int i3 = xms.a | 1;
        xms.a = i3;
        xms.c = 1;
        int i4 = i3 | 2;
        xms.a = i4;
        xms.a = i4 | 8;
        xms.e = i2;
        xuk.a(5, (xms) o2.i(), xus.a(this.a));
        if (i2 > 0) {
            this.d.setVisibility(0);
            this.d.setText(getContext().getResources().getQuantityString(R.plurals.people_backup_sync_contacts_not_backed_up, i2, new Object[]{Integer.valueOf(i2)}));
            return;
        }
        this.d.setVisibility(8);
    }

    public final void a(int i2, acwa acwa) {
        int i3;
        xuk xuk = this.g;
        aucd o2 = xms.f.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        xms xms = (xms) o2.b;
        xms.b = i2 - 1;
        xms.a |= 1;
        if (!acwa.b()) {
            i3 = 3;
        } else {
            i3 = 2;
        }
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        xms xms2 = (xms) o2.b;
        xms2.c = i3 - 1;
        xms2.a |= 2;
        xuk.a(5, (xms) o2.i(), xus.a(this.a));
    }

    public final void a(int i2, boolean z) {
        this.g.a(i2, 5, xus.a(this.a), z);
    }

    public final void a(acwa acwa) {
        if (!acwa.b()) {
            Log.e("BackupAndSyncFragment", "Error loading backup state", acwa.e());
            a(4, acwa);
            if (ayqs.e()) {
                c();
            }
            g();
            a();
            this.j.setVisibility(0);
            return;
        }
        int a2 = xuk.a((BackupAndSyncOptInState) acwa.d());
        xuk xuk = this.g;
        aucd o2 = xms.f.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        xms xms = (xms) o2.b;
        xms.b = 3;
        int i2 = xms.a | 1;
        xms.a = i2;
        xms.c = 1;
        int i3 = i2 | 2;
        xms.a = i3;
        xms.d = a2 - 1;
        xms.a = i3 | 4;
        xuk.a(5, (xms) o2.i(), xus.a(this.a));
        BackupAndSyncOptInState backupAndSyncOptInState = (BackupAndSyncOptInState) acwa.d();
        if (xus.b(backupAndSyncOptInState)) {
            g();
            a();
            this.j.setVisibility(0);
            return;
        }
        this.n = new ArrayList();
        for (String a3 : backupAndSyncOptInState.d) {
            this.n.add(xus.a(a3));
        }
        boolean a4 = xus.a(backupAndSyncOptInState);
        this.c.setChecked(a4);
        a(9, a4);
        if (a4) {
            this.b.a(backupAndSyncOptInState.a).a(this, new xte(this));
            if (ayqs.d() && !this.d.getText().toString().equals(getResources().getString(R.string.people_backup_sync_will_sync_button))) {
                this.d.setVisibility(8);
                return;
            }
            return;
        }
        this.e.a(this, new xtf(this));
        a();
    }

    public final void a(agbl agbl) {
        Account a2 = xus.a(agbl.b());
        this.a = a2;
        if (a2 != null) {
            a(true);
            this.c.setChecked(true);
            this.h.a((Object) agbl);
            this.k.setText(agbl.b());
            if (TextUtils.isEmpty(agbl.a())) {
                this.l.setVisibility(8);
            } else {
                this.l.setVisibility(0);
                this.l.setText(agbl.a());
            }
        }
        this.j.setVisibility(0);
    }
}
