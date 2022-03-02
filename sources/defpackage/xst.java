package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.SwitchCompat;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import com.google.android.gms.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* renamed from: xst  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xst extends xtr implements xui {
    Account a;
    public xug b;
    public AccountParticleDisc c;
    public SwitchCompat d;
    private final CompoundButton.OnCheckedChangeListener e = new xsl(this);
    private iwq f;
    private ViewGroup h;
    private final ax i = new xsm(this);
    private boolean j;

    private final void b(boolean z) {
        this.d.setEnabled(z);
        this.h.setEnabled(z);
    }

    public final void a() {
        ContentResolver.setMasterSyncAutomatically(true);
        ContentResolver.setSyncAutomatically(this.a, "com.android.contacts", true);
        a(false);
        a(17);
    }

    public final int b() {
        return 4;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        xug xug = (xug) qck.a(getActivity(), e()).a(xug.class);
        this.b = xug;
        xug.a().a(this, this.i);
        this.c.a((agbv) ((xsh) getActivity()).a(), agbl.class);
        if (bundle != null) {
            return;
        }
        if (ayqs.b()) {
            f();
        } else {
            a(14);
        }
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i3 == -1 && intent != null) {
            if (i2 == 1) {
                String stringExtra = intent.getStringExtra("authAccount");
                if (!jlh.d(stringExtra)) {
                    a(5);
                    this.b.c(stringExtra);
                }
            }
            super.onActivityResult(i2, -1, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f = iwq.a((Context) getActivity());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        iwq iwq;
        this.j = ayqv.a.a().a();
        View inflate = layoutInflater.inflate(R.layout.account_sync_fragment, viewGroup, false);
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) inflate.findViewById(R.id.account_particle_disc);
        this.c = accountParticleDisc;
        accountParticleDisc.setOnClickListener(new xsn(this));
        xus.a(getString(R.string.common_account_spinner_a11y_tap_action), (View) this.c);
        ((bjs) getActivity()).a((Toolbar) inflate.findViewById(R.id.toolbar));
        ((bjs) getActivity()).aE().b(true);
        this.d = (SwitchCompat) inflate.findViewById(R.id.auto_sync_toggle);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.auto_sync_toggle_container);
        this.h = viewGroup2;
        if (!this.j) {
            viewGroup2.setOnClickListener(new xso(this));
            b(false);
        }
        if (!(Build.VERSION.SDK_INT < 26 || (iwq = this.f) == null || iwq.a(xxc.a()) == null)) {
            ViewGroup viewGroup3 = (ViewGroup) inflate.findViewById(R.id.manage_notification_row);
            viewGroup3.setVisibility(0);
            viewGroup3.setOnClickListener(new xsp(this));
        }
        ImageView imageView = (ImageView) inflate.findViewById(R.id.help_and_feedback);
        imageView.setImageResource(R.drawable.quantum_ic_help_outline_vd_theme_24);
        imageView.setOnClickListener(new xsq(this));
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.c = null;
        this.d = null;
        this.h = null;
    }

    public final void onResume() {
        super.onResume();
        if (this.a != null) {
            a(false);
        }
    }

    public final void a(int i2) {
        this.g.a(i2, 4, xus.a(this.a));
    }

    public final void a(int i2, boolean z) {
        this.g.a(i2, 4, xus.a(this.a), z);
    }

    public final void a(boolean z) {
        if (this.j) {
            boolean masterSyncAutomatically = ContentResolver.getMasterSyncAutomatically();
            int isSyncable = ContentResolver.getIsSyncable(this.a, "com.android.contacts");
            if (!masterSyncAutomatically || isSyncable <= 0) {
                if (!masterSyncAutomatically) {
                    b(true);
                    getView().findViewById(R.id.auto_sync_description).setVisibility(8);
                    this.h.setOnClickListener(new xsr(this));
                } else {
                    b(false);
                }
                this.d.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                this.d.setChecked(false);
                if (!z) {
                    return;
                }
                if (ayrb.a.a().a()) {
                    xuk xuk = this.g;
                    String a2 = xus.a(this.a);
                    wml wml = xuk.a;
                    aucd o = xmt.h.o();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    xmt xmt = (xmt) o.b;
                    xmt.b = 15;
                    int i2 = xmt.a | 1;
                    xmt.a = i2;
                    int i3 = 3;
                    xmt.d = 3;
                    xmt.a = i2 | 4;
                    aucd o2 = xmr.d.o();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    xmr xmr = (xmr) o2.b;
                    int i4 = 1 | xmr.a;
                    xmr.a = i4;
                    xmr.b = masterSyncAutomatically;
                    if (isSyncable < 0) {
                        i3 = 2;
                    } else if (isSyncable != 0) {
                        i3 = 4;
                    }
                    xmr.c = i3 - 1;
                    xmr.a = 2 | i4;
                    xmr xmr2 = (xmr) o2.i();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    xmt xmt2 = (xmt) o.b;
                    xmr2.getClass();
                    xmt2.g = xmr2;
                    xmt2.a |= 32;
                    wml.a((xmt) o.i(), a2);
                    return;
                }
                a(16);
                return;
            }
        } else {
            if (!ContentResolver.getMasterSyncAutomatically()) {
                ((AppCompatTextView) getView().findViewById(R.id.auto_sync_description)).setText(R.string.people_contacts_sync_global_automatic_sync_off);
            }
            if (!ContentResolver.getMasterSyncAutomatically() || ContentResolver.getIsSyncable(this.a, "com.android.contacts") <= 0) {
                this.d.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                this.d.setChecked(false);
                b(false);
                if (z) {
                    a(16);
                    return;
                }
                return;
            }
        }
        b(true);
        if (this.j) {
            getView().findViewById(R.id.auto_sync_description).setVisibility(0);
            this.h.setOnClickListener(new xss(this));
        }
        ((AppCompatTextView) getView().findViewById(R.id.auto_sync_description)).setText(R.string.people_contacts_sync_automatic_sync_description);
        this.d.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        boolean syncAutomatically = ContentResolver.getSyncAutomatically(this.a, "com.android.contacts");
        this.d.setChecked(syncAutomatically);
        if (z) {
            a(7, syncAutomatically);
        }
        this.d.setOnCheckedChangeListener(this.e);
    }
}
