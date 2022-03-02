package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import com.google.android.chimera.BoundService;
import com.google.android.gms.R;
import com.google.android.location.reporting.state.update.AccountConfig;

/* renamed from: ajol  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ajol extends jmp implements AdapterView.OnItemSelectedListener {
    protected ahya a;
    protected ajlk b;
    public Account c;
    final ajok d = e();
    private jmf e;
    private Spinner f;

    private final void a(Account account) {
        this.c = account;
        if (account != null) {
            this.c = this.a.a(account.name);
        }
        if (!aztb.u()) {
            Account account2 = this.c;
            if (account2 != null) {
                jmf jmf = this.e;
                String str = account2.name;
                AdapterView.OnItemSelectedListener onItemSelectedListener = jmf.a;
                jmf.a = null;
                jmf.b();
                jmf.a = onItemSelectedListener;
                int a2 = jmf.a(str);
                if (a2 < 0) {
                    a2 = 0;
                }
                jmf.a(a2);
            } else {
                this.e.b();
                this.c = this.a.a(this.e.a());
            }
            f();
        }
    }

    private final void b(Intent intent) {
        if (!aztb.u()) {
            a((Account) intent.getParcelableExtra("account"));
        }
    }

    /* access modifiers changed from: protected */
    public abstract int a(AccountConfig accountConfig);

    public ajok e() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void f() {
        Account account;
        if (!aztb.u() && this.b != null && !isFinishing() && (account = this.c) != null) {
            try {
                AccountConfig a2 = this.b.a(account);
                c(rma.a(a(a2)));
                boolean z = false;
                if (a2.f() && a2.s != 2) {
                    z = true;
                }
                d(z);
            } catch (RemoteException e2) {
                Log.e("GCoreLocationSettings", "", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void f(boolean z);

    /* access modifiers changed from: protected */
    public abstract void h();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!aztb.u()) {
            sg aE = aE();
            jme jme = new jme(aE);
            jme.a(R.string.location_settings_location_history_activity_title);
            jme.a = this;
            this.e = jme.a();
            View a2 = aE.a();
            if (a2 != null) {
                this.f = (Spinner) a2.findViewById(R.id.action_bar_spinner);
            } else {
                this.f = new Spinner(this);
                Log.e("GCoreLocationSettings", "Yikes! ActionBar has no custom view");
            }
            this.a = ahxz.a(this);
            if (bundle == null || !bundle.containsKey("selected_account")) {
                b(getIntent());
            } else {
                a((Account) bundle.getParcelable("selected_account"));
            }
        } else if (!aztk.b()) {
            this.a = ahxz.a(this);
            Intent intent = getIntent();
            if (intent != null) {
                a((Account) intent.getParcelableExtra("account"));
            }
        }
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (!aztb.u()) {
            String b2 = this.e.getItem(i);
            Account account = this.c;
            if (account == null || !b2.equals(account.name)) {
                Account a2 = this.a.a(b2);
                if (a2 == null) {
                    String valueOf = String.valueOf(b2);
                    Log.wtf("GCoreLocationSettings", valueOf.length() == 0 ? new String("account name lookup failure: ") : "account name lookup failure: ".concat(valueOf), new Exception());
                    return;
                }
                this.c = a2;
                h();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        b(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        a(this.c);
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("selected_account", this.c);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        if (!aztb.u()) {
            ajok ajok = this.d;
            if (!jca.a().a(this, BoundService.getStartIntent(this, "com.google.android.location.reporting.service.InternalPreferenceServiceDoNotUse"), ajok, 129)) {
                StringBuilder sb = new StringBuilder(39);
                sb.append("PreferenceService.bindTo() bound: false");
                ajix.c("GCoreUlr", 34, sb.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        if (!aztb.u() && this.b != null) {
            jca.a().a((Context) this, (ServiceConnection) this.d);
            this.b = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void e(boolean z) {
        if (aztb.u()) {
            return;
        }
        if (this.b == null) {
            Log.wtf("GCoreLocationSettings", new IllegalStateException("No service, setting change ignored"));
            return;
        }
        try {
            f(z);
        } catch (RemoteException e2) {
            Log.e("GCoreLocationSettings", "", e2);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i) {
        Spinner spinner = this.f;
        if (spinner != null) {
            spinner.setVisibility(i);
        }
    }
}
