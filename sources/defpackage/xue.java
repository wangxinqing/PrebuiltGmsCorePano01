package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.R;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* renamed from: xue  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xue extends xtr {
    Account a;
    public xug b;
    public AccountParticleDisc c;
    private final ax d = new xtx(this);
    private xuq e;
    private as f;
    private as h;

    public final void a(int i) {
        this.g.a(i, 3, xus.a(this.a));
    }

    public final int b() {
        return 3;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        xug xug = (xug) qck.a(getActivity(), e()).a(xug.class);
        this.b = xug;
        as a2 = xug.a();
        this.h = a2;
        a2.a(this, this.d);
        this.c.a((agbv) ((xsh) getActivity()).a(), agbl.class);
        as b2 = this.b.b();
        this.f = b2;
        b2.a(this, new xuc(this));
        if (bundle != null) {
            return;
        }
        if (ayqs.b()) {
            f();
        } else {
            a(14);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null) {
            if (i == 1) {
                String stringExtra = intent.getStringExtra("authAccount");
                if (!jlh.d(stringExtra)) {
                    a(5);
                    this.b.c(stringExtra);
                }
            }
            super.onActivityResult(i, -1, intent);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.contacts_sync_core_fragment, viewGroup, false);
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) inflate.findViewById(R.id.account_particle_disc);
        this.c = accountParticleDisc;
        accountParticleDisc.setOnClickListener(new xty(this));
        xus.a(getString(R.string.common_account_spinner_a11y_tap_action), (View) this.c);
        ((bjs) getActivity()).a((Toolbar) inflate.findViewById(R.id.toolbar));
        ((bjs) getActivity()).aE().b(true);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.help_and_feedback);
        imageView.setImageResource(R.drawable.quantum_ic_help_outline_vd_theme_24);
        imageView.setOnClickListener(new xtz(this));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(16908298);
        xuq xuq = new xuq(getContext().getResources(), anda.a((Object[]) new Integer[]{1, 2}));
        this.e = xuq;
        xuq.a(1, (View.OnClickListener) new xua(this));
        this.e.a(2, (View.OnClickListener) new xub(this));
        recyclerView.setAdapter(this.e);
        getActivity();
        recyclerView.setLayoutManager(new abk());
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.c = null;
        this.e = null;
        this.f.a((aj) this);
        this.f = null;
        this.h.a((aj) this);
        this.h = null;
    }

    public final void onResume() {
        super.onResume();
        if (ayqs.d()) {
            this.f.a((aj) this);
            as b2 = this.b.b();
            this.f = b2;
            b2.a(this, new xud(this));
        }
    }

    public final void a(acwa acwa) {
        aucd o = xms.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xms xms = (xms) o.b;
        xms.b = 3;
        xms.a |= 1;
        if (acwa.b()) {
            this.e.a = (BackupAndSyncOptInState) acwa.d();
            this.e.as();
            if (o.c) {
                o.c();
                o.c = false;
            }
            xms xms2 = (xms) o.b;
            xms2.c = 1;
            xms2.a = 2 | xms2.a;
            int a2 = xuk.a((BackupAndSyncOptInState) acwa.d());
            if (o.c) {
                o.c();
                o.c = false;
            }
            xms xms3 = (xms) o.b;
            xms3.d = a2 - 1;
            xms3.a |= 4;
        } else {
            if (o.c) {
                o.c();
                o.c = false;
            }
            xms xms4 = (xms) o.b;
            xms4.c = 2;
            xms4.a |= 2;
        }
        this.g.a(3, (xms) o.i(), xus.a(this.a));
    }
}
