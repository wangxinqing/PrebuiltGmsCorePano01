package defpackage;

import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.R;
import com.google.android.gms.accountsettings.utils.ButtonConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: dij  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class dij extends bjs implements djw {
    private static final iwd g = dit.a("BaseEntryPointChimeraActivity");
    public dis a;
    public dje b;
    String c;
    @Deprecated
    public int d;
    aqsr e;
    boolean f;
    private final AtomicBoolean h = new AtomicBoolean(false);

    /* access modifiers changed from: protected */
    public final void a(Fragment fragment) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.as_error_content, fragment, "ERROR");
        beginTransaction.commitAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    public final void b(Intent intent) {
        try {
            startActivity(intent);
            if (!isFinishing() && !isChangingConfigurations()) {
                p();
            }
        } catch (ActivityNotFoundException e2) {
            a(getString(R.string.accountsettings_no_activity), (String) null, diw.a(10, "COMMON"));
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public abstract void e();

    /* access modifiers changed from: protected */
    public abstract boolean f();

    /* access modifiers changed from: protected */
    public abstract boolean h();

    public boolean i() {
        return false;
    }

    public aqsr j() {
        Intent intent = getIntent();
        aqsp aqsp = (aqsp) aqsr.d.o();
        if (intent.hasExtra("extra.screenId")) {
            int intExtra = intent.getIntExtra("extra.screenId", 0);
            if (aqsp.c) {
                aqsp.c();
                aqsp.c = false;
            }
            aqsr aqsr = (aqsr) aqsp.b;
            aqsr.a |= 1;
            aqsr.b = intExtra;
        }
        aqsp.a(dix.a(intent));
        return (aqsr) aqsp.i();
    }

    /* access modifiers changed from: protected */
    public Intent k() {
        String str;
        Intent intent = getIntent();
        Intent action = new Intent().setClassName("com.google.android.gms", "com.google.android.gms.accountsettings.mg.ui.main.MainActivity").setAction(intent.getAction());
        if (awgy.e() && intent.hasExtra("extra.themeChoice")) {
            action.putExtra("extra.themeChoice", intent.getIntExtra("extra.themeChoice", 0));
        }
        action.putExtras(l());
        if (dix.b(intent) && i()) {
            action.putExtra("extra.ignoreAccount", true);
        } else if (!jlh.d(this.c)) {
            action.putExtra("extra.accountName", this.c);
        }
        action.putExtra("extra.screenId", this.e.b);
        for (Map.Entry entry : Collections.unmodifiableMap(this.e.c).entrySet()) {
            String valueOf = String.valueOf((String) entry.getKey());
            action.putExtra(valueOf.length() == 0 ? new String("extra.screen.") : "extra.screen.".concat(valueOf), (String) entry.getValue());
        }
        if (awgy.i()) {
            str = q();
        } else {
            str = jhg.a((Activity) this);
        }
        if (!jlh.d(str)) {
            action.putExtra("extra.callingPackageName", str);
        } else {
            action.removeExtra("extra.callingPackageName");
        }
        int u = u();
        if (u != 1) {
            int i = u - 1;
            if (u != 0) {
                action.putExtra("extra.launchApi", i);
            } else {
                throw null;
            }
        }
        if (!awgy.h() || f()) {
            action.addFlags(33554432);
        }
        return action;
    }

    /* access modifiers changed from: protected */
    public Bundle l() {
        Intent intent = getIntent();
        String[] strArr = {"extra.utmCampaign", "extra.utmMedium", "extra.utmSource"};
        Bundle bundle = new Bundle();
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            if (intent.hasExtra(str)) {
                bundle.putString(str, intent.getStringExtra(str));
            }
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    public final void m() {
        if (!isFinishing() && !isChangingConfigurations()) {
            this.a = new dis(this, this.c, this.b);
            if (this.f) {
                e();
            }
            this.f = false;
            b(k());
        }
    }

    /* access modifiers changed from: package-private */
    public final void n() {
        a((Fragment) djx.a(getString(R.string.accountsettings_missing_account_title), getString(R.string.accountsettings_missing_account), new ButtonConfig(getString(17039360), R.id.as_button_action_cancel), new ButtonConfig(getString(R.string.common_add_account), R.id.as_button_action_add_account)));
    }

    /* access modifiers changed from: protected */
    public final void o() {
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 10) {
            this.h.set(false);
            if (i2 == -1 && intent != null) {
                this.c = intent.getStringExtra("authAccount");
                m();
            } else {
                o();
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        boolean z;
        String str;
        String str2;
        super.onCreate(bundle);
        if (awgy.e()) {
            new qud(this, R.style.AsDialogThemeLight, R.style.AsDialogThemeDark, 1);
        } else {
            setTheme(R.style.AsDialogThemeLight);
        }
        setContentView((int) R.layout.as_error_content);
        if (bundle != null) {
            this.h.set(bundle.getBoolean("apLaunched", false));
        }
        if (h()) {
            if (bundle == null) {
                z = true;
            } else {
                z = false;
            }
            this.f = z;
            setTitle((CharSequence) "");
            this.b = new dje(ModuleManager.get(this));
            if (!isFinishing() && !isChangingConfigurations()) {
                this.d = 1;
                this.c = null;
                if (getIntent() != null) {
                    aqsr j = j();
                    if ((j.a & 1) == 0) {
                        aucd aucd = (aucd) j.c(5);
                        aucd.a((aucj) j);
                        aqsp aqsp = (aqsp) aucd;
                        if (aqsp.c) {
                            aqsp.c();
                            aqsp.c = false;
                        }
                        aqsr aqsr = (aqsr) aqsp.b;
                        aqsr aqsr2 = aqsr.d;
                        aqsr.a |= 1;
                        aqsr.b = 1;
                        j = (aqsr) aqsp.i();
                    }
                    this.e = j;
                    this.d = j.b;
                    str2 = getIntent().getStringExtra("extra.accountName");
                    str = getIntent().getStringExtra("extra.fallbackUrl");
                } else {
                    str2 = null;
                    str = null;
                }
                if (!dix.b(getIntent()) || !i()) {
                    List<Account> d2 = jgu.d(this, getPackageName());
                    if (jlh.d(str2)) {
                        if (!i()) {
                            if (d2.size() == 1) {
                                this.c = ((Account) d2.get(0)).name;
                            } else if (!d2.isEmpty()) {
                                a((String) null);
                                return;
                            } else if (s() == 1) {
                                n();
                                return;
                            } else {
                                return;
                            }
                        }
                    } else if (str == null && d2.isEmpty()) {
                        n();
                        return;
                    } else {
                        for (Account account : d2) {
                            if (str2.equals(account.name)) {
                                this.c = str2;
                            }
                        }
                        if (t() != 2) {
                            a(getString(R.string.accountsettings_different_account, new Object[]{str2}));
                            return;
                        }
                        return;
                    }
                }
                m();
            }
        } else if (r() == 1) {
            g.e("Starting activity is not allowed and no fallback url is provided.", new Object[0]);
            o();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("apLaunched", this.h.get());
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void p() {
        setResult(-1);
        finish();
    }

    public abstract String q();

    public int r() {
        return 1;
    }

    public int s() {
        return 1;
    }

    public int t() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public abstract int u();

    public final void a(djx djx, int i) {
        ButtonConfig buttonConfig;
        if (i == 1) {
            buttonConfig = djx.a(djx.getArguments(), "neutralBtn");
        } else if (i != 2) {
            buttonConfig = djx.a(djx.getArguments(), "positiveBtn");
        } else {
            buttonConfig = djx.a(djx.getArguments(), "negativeBtn");
        }
        if (buttonConfig == null) {
            g.a("Can't handle the click, no button config", new Object[0]);
            return;
        }
        int i2 = buttonConfig.b;
        if (i2 == R.id.as_button_action_add_account) {
            Intent flags = new Intent("android.settings.ADD_ACCOUNT_SETTINGS").setFlags(268435456);
            int i3 = Build.VERSION.SDK_INT;
            flags.putExtra("account_types", new String[]{"com.google"});
            b(flags);
        } else if (i2 == R.id.as_button_action_cancel || i2 == R.id.as_button_action_ok) {
            o();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        if (!this.h.getAndSet(true)) {
            Intent a2 = hwy.a((Account) null, (ArrayList) null, new String[]{"com.google"}, true, str, false, 1, 2, (String) null, true);
            if (!a2.hasExtra("realClientPackage")) {
                a2.putExtra("realClientPackage", "com.google.android.gms");
            }
            pyt a3 = pyu.a();
            a3.a(amri.b(1001));
            a3.b(amri.b(getResources().getString(R.string.common_choose_account)));
            a2.putExtra("first_party_options_bundle", a3.a().a);
            startActivityForResult(a2, 10);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str, String str2, String str3) {
        ButtonConfig buttonConfig = new ButtonConfig(getString(17039370), R.id.as_button_action_ok);
        dis dis = this.a;
        if (dis != null) {
            aucf aucf = (aucf) aqmz.l.o();
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            aqmz aqmz = (aqmz) aucf.b;
            aqmz.b = 5;
            int i = aqmz.a | 1;
            aqmz.a = i;
            aqmz.c = 2008;
            int i2 = i | 2;
            aqmz.a = i2;
            aqmz.a = i2 | 16;
            aqmz.f = true;
            aqlq a2 = dis.a();
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            aqmz aqmz2 = (aqmz) aucf.b;
            a2.getClass();
            aqmz2.h = a2;
            int i3 = aqmz2.a | 64;
            aqmz2.a = i3;
            if (str3 != null) {
                str3.getClass();
                aqmz2.a = i3 | 4;
                aqmz2.d = str3;
            }
            aucd o = aqna.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqna aqna = (aqna) o.b;
            aqmz aqmz3 = (aqmz) aucf.i();
            aqmz3.getClass();
            aqna.b = aqmz3;
            aqna.a |= 1;
            dis.a((aqna) o.i());
        }
        a((Fragment) djx.a(str2, str, (ButtonConfig) null, buttonConfig));
    }
}
