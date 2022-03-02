package com.google.android.gms.auth.frp;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;
import com.google.android.setupdesign.GlifLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FreUnlockChimeraActivity extends gmz implements View.OnClickListener, LoaderManager.LoaderCallbacks {
    static final fzk a = fzk.a("key_frp_challenge_present");
    public static final fzk b = fzk.a("key_device_owner_component");
    public static final fzk c = fzk.a("key_device_owner_state");
    public static final fzk d = fzk.a("key_dpc_installed");
    private static final iwd e = ehv.a("AddAccount", "FreUnlockActivity");
    private ijo f;
    private View g;
    private alhe h;
    private TextView n;
    private PendingIntent o;
    private gck p;

    public static Intent a(Context context, ijn ijn, boolean z, PersistentDeviceOwnerState persistentDeviceOwnerState, boolean z2) {
        Bundle bundle;
        ComponentName componentName;
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.auth.frp.FreUnlockActivity");
        fzl fzl = new fzl();
        fzk fzk = gmz.i;
        String str = null;
        if (ijn != null) {
            bundle = ijn.a();
        } else {
            bundle = null;
        }
        fzl.b(fzk, bundle);
        fzl.b(gmz.j, Boolean.valueOf(z));
        fzl.b(a, Boolean.valueOf(z2));
        fzk fzk2 = b;
        if (persistentDeviceOwnerState != null) {
            componentName = persistentDeviceOwnerState.a;
        } else {
            componentName = null;
        }
        fzl.b(fzk2, componentName);
        fzk fzk3 = c;
        if (persistentDeviceOwnerState != null) {
            str = persistentDeviceOwnerState.b;
        }
        fzl.b(fzk3, str);
        intent.putExtras(fzl.a);
        return intent;
    }

    private final gck c() {
        if (this.p == null) {
            this.p = new gck(this);
        }
        return this.p;
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "FreUnlockActivity";
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            if (i != 2) {
                iwd iwd = e;
                StringBuilder sb = new StringBuilder(53);
                sb.append("Unknown request code in onActivityResult: ");
                sb.append(i);
                iwd.b(sb.toString(), new Object[0]);
            } else if (i2 == -1) {
                getSupportLoaderManager().initLoader(1, (Bundle) null, this);
            }
        } else if (i2 == 3) {
            a(true);
        } else if (i2 == 2) {
            a(false);
            if (!((Boolean) f().a(a)).booleanValue()) {
                this.h.d.a(0);
            }
        } else {
            this.n.setVisibility(8);
            if (i2 == -1) {
                f().b(d, true);
                a((ComponentName) f().a(b), (String) f().a(c));
            }
        }
    }

    public void onClick(View view) {
        if (view == this.g) {
            a(1);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 0;
        if (!jkr.f()) {
            a(-1);
            e.d("Forced re-enrollment not supported on Android versions below O MR1.", new Object[0]);
        } else if (f().a(b) == null) {
            a(-1);
            e.e("Device owner component is missing.", new Object[0]);
        } else {
            getSupportLoaderManager().initLoader(3, (Bundle) null, this);
            ijo a2 = ijo.a(this, R.layout.auth_fre_unlock_glif_activity);
            this.f = a2;
            ijm.a(a2.a());
            this.f.a(getText(R.string.auth_frp_start_reenroll_device_title));
            ViewGroup a3 = this.f.a();
            setContentView((View) a3);
            this.h = (alhe) ((GlifLayout) this.f.a().findViewById(R.id.setup_wizard_layout)).a(alhe.class);
            alhf alhf = new alhf(this);
            alhf.a(R.string.sud_next_button_label);
            alhf.b = new gfa(this);
            alhf.c = 5;
            alhf.d = 2132018060;
            alhg a4 = alhf.a();
            this.h.a(a4);
            alhf alhf2 = new alhf(this);
            alhf2.a(R.string.common_skip);
            alhf2.b = new gfb(this);
            alhf2.c = 7;
            alhf2.d = 2132018061;
            this.h.b(alhf2.a());
            this.h.d.a(8);
            View findViewById = a3.findViewById(R.id.auth_frp_enter_device_credentials);
            this.g = findViewById;
            findViewById.setOnClickListener(this);
            this.n = (TextView) a3.findViewById(R.id.auth_frp_dpc_install_error);
            boolean booleanValue = ((Boolean) f().a(a, false)).booleanValue();
            View view = this.g;
            if (!booleanValue) {
                i = 8;
            }
            view.setVisibility(i);
            this.g.setEnabled(booleanValue);
            a4.a(true);
        }
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        if (i == 1) {
            return new gfd(this, c());
        }
        if (i == 2) {
            return new gfc(this, c());
        }
        if (i == 3) {
            return new gez(this, new ghj(ihs.b()), ((ComponentName) f().a(b)).getPackageName(), f().a);
        }
        iwd iwd = e;
        StringBuilder sb = new StringBuilder(29);
        sb.append("Unknown loader ID ");
        sb.append(i);
        iwd.e(sb.toString(), new Object[0]);
        return null;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Bundle bundle = (Bundle) obj;
        int id = loader.getId();
        if (id == 1) {
            a(111);
        } else if (id == 2) {
            a(-1);
        } else if (id != 3) {
            iwd iwd = e;
            int id2 = loader.getId();
            StringBuilder sb = new StringBuilder(29);
            sb.append("Unknown loader ID ");
            sb.append(id2);
            iwd.e(sb.toString(), new Object[0]);
        } else {
            this.o = (PendingIntent) bundle.getParcelable("pending_intent");
        }
    }

    public final void onLoaderReset(Loader loader) {
    }

    private final void a(int i) {
        a(i, (Intent) null);
    }

    private final void a(boolean z) {
        if (!z) {
            this.n.setText(R.string.auth_frp_install_dpc_error);
        } else {
            this.n.setText(R.string.auth_frp_install_dpc_recoverable_error);
        }
        this.n.setVisibility(0);
    }

    public final void a() {
        PendingIntent pendingIntent = this.o;
        if (pendingIntent != null) {
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
            } catch (IntentSender.SendIntentException e2) {
                e.e("Failed to start DPC install activity.", e2, new Object[0]);
            }
        } else {
            e.e("DPC install launching intent is not loaded yet.", new Object[0]);
        }
    }

    public final void a(ComponentName componentName, String str) {
        Intent intent = new Intent("android.app.action.PROVISION_MANAGED_DEVICE_FROM_TRUSTED_SOURCE");
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.app.extra.PROVISIONING_DEVICE_ADMIN_COMPONENT_NAME", componentName);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("android.app.extra.PERSISTENT_DEVICE_OWNER_STATE", str);
        bundle.putParcelable("android.app.extra.PROVISIONING_ADMIN_EXTRAS_BUNDLE", persistableBundle);
        intent.putExtras(bundle);
        startActivityForResult(intent, 2);
    }
}
