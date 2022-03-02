package com.google.android.gms.people.sync.coreui;

import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContactsSyncCoreChimeraActivity extends qcd implements xsh {
    public xug a;
    public boolean b;
    private agcf c;
    private wls d;
    private aoru e;
    private final xuk f = new xuk();

    public final agcf a() {
        return this.c;
    }

    public final boolean aF() {
        if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
            return super.aF();
        }
        onBackPressed();
        return true;
    }

    public final void e() {
        xuk xuk = this.f;
        aucd o = xms.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xms xms = (xms) o.b;
        xms.b = 3;
        int i = xms.a | 1;
        xms.a = i;
        xms.c = 2;
        xms.a = i | 2;
        xuk.a(2, (xms) o.i(), (String) null);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        if (!ayqr.f()) {
            finish();
            return;
        }
        setTheme(R.style.ContactsCoreUiTheme);
        setContentView((int) R.layout.contacts_sync_core_activity);
        this.a = (xug) qck.a(this, xut.a((qcd) this)).a(xug.class);
        if (bundle == null && getIntent().hasExtra("authAccount")) {
            this.a.c.h = getIntent().getStringExtra("authAccount");
        }
        this.a.d.a(this, new xts(this));
        wlr a2 = wls.a();
        a2.a = 80;
        wls a3 = a2.a();
        this.d = a3;
        wsu a4 = wst.a(this, a3);
        this.e = jfm.a(9);
        this.c = new agcf(this.e);
        AccountParticleDisc.a(this, this.c, this.e, new agbm(), new agbo(this, this.e, this.d), agbl.class);
        int size = getSupportFragmentManager().getFragments().size();
        if (size <= 1) {
            z = true;
        } else {
            z = false;
        }
        this.b = z;
        if (bundle == null || size <= 1) {
            String action = getIntent().getAction();
            if ("com.google.android.gms.people.sync.CONTACTS_SYNC_SETTINGS".equals(action)) {
                this.a.e();
            } else if (!ayqr.h()) {
                this.a.e();
            } else if ("com.google.android.gms.people.sync.CONTACTS_BACKUP_SYNC_SETTINGS".equals(action)) {
                acwa a5 = a4.a();
                a5.a((acvv) new xtt(this));
                a5.a((acvs) new xtu(this));
            } else {
                acwa a6 = a4.a();
                a6.a((acvv) new xtv(this));
                a6.a((acvs) new xtw(this));
            }
        }
    }

    public final void a(int i) {
        xuk xuk = this.f;
        aucd o = xms.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xms xms = (xms) o.b;
        xms.b = 3;
        int i2 = xms.a | 1;
        xms.a = i2;
        xms.c = 1;
        int i3 = i2 | 2;
        xms.a = i3;
        xms.d = i - 1;
        xms.a = i3 | 4;
        xuk.a(2, (xms) o.i(), (String) null);
    }
}
