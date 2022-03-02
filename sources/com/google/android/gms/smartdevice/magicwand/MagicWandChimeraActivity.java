package com.google.android.gms.smartdevice.magicwand;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MagicWandChimeraActivity extends bjs implements acmm, acmi, acnh, acod, acfz {
    private static final iwd a = acqa.a("magicwand", "MagicWandChimeraActivity");
    private Account b;
    private boolean c;
    private String d;
    private boolean e;
    private boolean f;

    private final void a(Fragment fragment) {
        if (fragment.getClass() == acga.class) {
            getSupportFragmentManager().beginTransaction().add(fragment, "assertion_fragment").commit();
        } else {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
        }
    }

    private final Fragment m() {
        return acmo.a(getString(R.string.smartdevice_magicwand_confirm_signin), getString(R.string.smartdevice_magicwand_lockscreen_verification_text), getString(R.string.smartdevice_magicwand_lockscreen_description), (String) null, R.drawable.googlelogo_standard_color_92x36, true);
    }

    private final Fragment n() {
        return acnj.a(getString(R.string.common_choose_account_label), true, false, abov.WEAR);
    }

    private final Fragment o() {
        return acnj.a(getString(R.string.smartdevice_magicwand_consent_title), true, true, abov.WEAR);
    }

    public final void b() {
        a.b("onAsssertionFailure", new Object[0]);
        a((Fragment) acoe.a(1, getString(R.string.common_login_error_title), getString(R.string.smartdevice_magicwand_error_detail), getString(R.string.common_cancel), true));
    }

    public final void e() {
        a.b("onFingerprintAuthSuccess", new Object[0]);
        this.c = true;
        a(this.b == null ? n() : o());
    }

    public final void f() {
        a.b("onScreenUnlocked", new Object[0]);
        this.c = true;
        this.e = false;
        a(this.b == null ? n() : o());
    }

    public final void h() {
        a.b("onScreenLockFailed", new Object[0]);
        this.e = false;
    }

    public final void i() {
        a.b("onScreenLockSkipped", new Object[0]);
        this.e = false;
        onBackPressed();
    }

    public final void j() {
        a.b("onPrepareScreenLock", new Object[0]);
        this.e = true;
    }

    public final void k() {
        a.b("onFingerprintAuthFail", new Object[0]);
        a(m());
    }

    public final void l() {
        a.b("onFingerprintCancel", new Object[0]);
        onBackPressed();
    }

    public final void onCreate(Bundle bundle) {
        Fragment fragment;
        super.onCreate(bundle);
        a.b("onCreate", new Object[0]);
        if (!azkv.a.a().a()) {
            a.e("Magic Wand is currently not enabled.", new Object[0]);
            finish();
        }
        setRequestedOrientation(1);
        Uri data = getIntent().getData();
        if (data == null) {
            a.b("Missing Intent data.", new Object[0]);
            finish();
        } else {
            String scheme = data.getScheme();
            String authority = data.getAuthority();
            String path = data.getPath();
            a.b(String.format("%s\n\t%s: %s\n\t%s: %s\n\t%s: %s", new Object[]{"Recieved deeplink of form", "scheme", scheme, "authority", authority, "path", path}), new Object[0]);
            if (path != null) {
                if ("g.co".equals(authority) && path.startsWith("/auth/1/")) {
                    this.d = path.substring(8);
                } else if ("google.magicwand".equals(scheme) && "1".equals(authority)) {
                    this.d = path.substring(1);
                }
            }
            a.b(String.format("Received malformed deeplink: %s", new Object[]{data.toString()}), new Object[0]);
            finish();
        }
        setContentView((int) R.layout.smartdevice_fragment_container);
        if (bundle == null) {
            if (getSupportFragmentManager().findFragmentByTag("assertion_fragment") == null) {
                a((Fragment) new acga());
            }
            List a2 = acpe.a(this);
            if (a2.size() == 1) {
                Account account = (Account) a2.get(0);
                this.b = account;
                iwd iwd = a;
                String valueOf = String.valueOf(account.name);
                iwd.c(valueOf.length() == 0 ? new String("Auto selecting only account: ") : "Auto selecting only account: ".concat(valueOf), new Object[0]);
            }
            if (jkr.b() && abnb.b() && acmj.a((Context) this)) {
                fragment = acmj.a(getString(R.string.smartdevice_magicwand_confirm_signin), getString(R.string.smartdevice_magicwand_fingerprint_detail), true);
            } else if (!acmn.a(this)) {
                fragment = m();
            } else {
                fragment = this.b == null ? n() : o();
            }
            getSupportFragmentManager().beginTransaction().add((int) R.id.fragment_container, fragment).commit();
        }
    }

    public final void onPause() {
        super.onPause();
        a.b("onPause", new Object[0]);
        if (!isChangingConfigurations() && !this.e) {
            finish();
        }
    }

    public final void a() {
        a.b("onAssertionSuccess", new Object[0]);
        a((Fragment) acoe.a(0, getString(R.string.common_login_activity_task_title), getString(R.string.smartdevice_magicwand_success_detail), getString(R.string.common_ok), false));
        new qvr().postDelayed(new acgb(this), 2000);
    }

    public final void b(acni acni) {
        a.b("onNoAccountSelected", new Object[0]);
    }

    public final void a(int i) {
        a.b("onNextButtonClicked", new Object[0]);
        if (i == 1) {
            finish();
        }
    }

    public final void a(acni acni) {
        a.b("onAccountSelected", new Object[0]);
        Account account = acni.a;
        if (account == null) {
            a.b("No account selected", new Object[0]);
            finish();
        } else if (!this.f) {
            acga acga = (acga) getSupportFragmentManager().findFragmentByTag("assertion_fragment");
            iva.a((Object) acga);
            acga.d = acga.b.b(new acfx(acga, this.d, account, this.c));
            aorl.a(acga.d, new acfy(acga), new jls(Looper.getMainLooper()));
            this.f = true;
        }
    }
}
