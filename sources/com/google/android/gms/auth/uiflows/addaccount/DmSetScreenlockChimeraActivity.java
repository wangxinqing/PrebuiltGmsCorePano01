package com.google.android.gms.auth.uiflows.addaccount;

import android.accounts.Account;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.SetupWizardLayout;
import com.google.android.setupdesign.view.NavigationBar;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DmSetScreenlockChimeraActivity extends gnx implements aljq, ijh {
    public static final iwd a = ehv.a("DmSetScreenlockChimeraActivity");
    static final fzk b = fzk.a("account");
    iji c;
    private final gaj d = gac.a(ihs.b());
    private final glp e = glp.a();

    public static Intent a(Context context, Account account, boolean z, ijn ijn) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.addaccount.DmSetScreenlockActivity");
        fzl fzl = new fzl();
        fzk fzk = b;
        iva.a((Object) account);
        fzl.b(fzk, account);
        fzl.b(gmz.j, Boolean.valueOf(z));
        fzl.b(gmz.i, ijn.a());
        return className.putExtras(fzl.a);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "DmSetScreenlockActivity";
    }

    public final void c() {
        iji iji = this.c;
        if (iji != null) {
            iji.dismissAllowingStateLoss();
        }
        this.c = iji.a(getString(R.string.auth_device_management_screenlock_skip_message), getString(R.string.auth_common_switch_accounts), getString(R.string.auth_common_go_back), false);
        getSupportFragmentManager().beginTransaction().add((Fragment) this.c, "skip dialog").commitAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            a(-1, (Intent) null);
        }
    }

    public final void onBackPressed() {
        c();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        new qvr();
        KeyguardManager keyguardManager = (KeyguardManager) getSystemService("keyguard");
        if (!jkr.b()) {
            int i = Build.VERSION.SDK_INT;
            z = keyguardManager.isKeyguardSecure();
        } else {
            z = keyguardManager.isDeviceSecure();
        }
        if (z) {
            if (ent.E()) {
                glp glp = this.e;
                synchronized (glp.b) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = glp.a;
                    if (j != -1) {
                        if (elapsedRealtime > j + 30000) {
                        }
                    }
                    glp.a = elapsedRealtime;
                    a.b("Screenlock present. Initiating CryptAuth Registration.", new Object[0]);
                    acwa a2 = this.d.a(9, Arrays.asList(new String[]{"authzen", "PublicKey"}), "ForceRegistration", (Account) getIntent().getParcelableExtra(b.a));
                    a2.a((acvv) new glu());
                    a2.a((acvm) new glt());
                    a2.a((acvs) new gls());
                }
            }
            a(2, (Intent) null);
        }
        ijo a3 = ijo.a(this, !ijm.a(g().a) ? R.layout.auth_device_management_screenlock : R.layout.auth_device_management_screenlock_glif);
        setContentView((View) a3.a());
        String string = getString(R.string.common_skip);
        String string2 = getString(R.string.common_next);
        if (a3.a() instanceof SetupWizardLayout) {
            NavigationBar c2 = ((SetupWizardLayout) a3.a()).c();
            c2.a((aljq) this);
            Button button = c2.b;
            button.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            Button button2 = c2.a;
            button.setText(string);
            button.setContentDescription(string);
            button2.setText(string2);
            button2.setContentDescription(string2);
        } else {
            alhe alhe = (alhe) ((GlifLayout) a3.a().findViewById(R.id.setup_wizard_layout)).a(alhe.class);
            alhf alhf = new alhf(this);
            alhf.a(R.string.common_next);
            alhf.b = new glq(this);
            alhf.c = 5;
            alhf.d = 2132018060;
            alhe.a(alhf.a());
            alhf alhf2 = new alhf(this);
            alhf2.a(R.string.common_skip);
            alhf2.b = new glr(this);
            alhf2.c = 7;
            alhf2.d = 2132018061;
            alhe.b(alhf2.a());
        }
        setTitle((CharSequence) ((Account) f().a(b)).name);
        a3.a(getTitle());
        ijm.a(a3.a());
        this.c = (iji) getSupportFragmentManager().findFragmentByTag("skip dialog");
    }

    public final void aL() {
        c();
    }

    public final void a() {
        String str;
        if (!jkr.c()) {
            str = "android.app.action.SET_NEW_PASSWORD";
        } else {
            str = "android.app.action.SET_NEW_PARENT_PROFILE_PASSWORD";
        }
        startActivityForResult(new Intent(str), 1);
    }

    public final void a(iji iji, int i) {
        if (i == 1 && this.c == iji) {
            a(1, (Intent) null);
        }
    }
}
