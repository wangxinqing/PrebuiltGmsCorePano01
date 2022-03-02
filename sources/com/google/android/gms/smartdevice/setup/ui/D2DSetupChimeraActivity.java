package com.google.android.gms.smartdevice.setup.ui;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.CompanionApp;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.PostTransferAction;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;
import com.google.android.gms.smartdevice.d2d.metrics.SourceLogManager;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class D2DSetupChimeraActivity extends bjs implements acod, accj, ackl, acmc, acko, acns, acnh, aclb, acmi, acmm, acnx, ackg, acol {
    public static final /* synthetic */ int e = 0;
    private static final iwd f = acqa.a("Setup", "UI", "D2DSetupChimeraActivity");
    private static final ExecutorService y = jfm.b(9);
    private boolean A;
    private ConnectionRequest B;
    SourceLogManager a;
    int b;
    public String c;
    public aclm d;
    private D2DDevice g;
    private abov h = abov.UNKNOWN;
    private int i;
    private boolean j;
    private Integer k = -99999;
    private ArrayList l;
    private ArrayList m = new ArrayList();
    private boolean n;
    private boolean o = false;
    private final boolean p = azll.a.a().b();
    private qub q;
    private int r;
    private String s;
    private String t;
    private acki u;
    private String v;
    private aclp w;
    private acpx x;
    private boolean z;

    private final void A() {
        startActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"));
    }

    private final void B() {
        if (acmn.a(this)) {
            a(n(), false);
        } else if (jkr.b() && abnb.b() && acmj.a((Context) this)) {
            a((Fragment) acmj.a(getString(R.string.smartdevice_d2d_fingerprint_title), getString(R.string.smartdevice_d2d_fingerprint_verification_text, new Object[]{n().g}), false));
        } else if (this.h != abov.AUTO || !azjh.c()) {
            a(t());
        } else {
            acml acml = new acml();
            Bundle bundle = new Bundle();
            bundle.putString("lockScreenText", (String) null);
            acml.setArguments(bundle);
            if (!isFinishing()) {
                getSupportFragmentManager().beginTransaction().add((Fragment) acml, "smartdevice.headlessfragment").commit();
            }
            f.a("Added headless Lock Screen fragment", new Object[0]);
        }
    }

    private final int C() {
        boolean z2;
        BootstrapOptions bootstrapOptions = this.d.g;
        boolean z3 = true;
        if (bootstrapOptions == null || !acpf.a(bootstrapOptions)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (bootstrapOptions == null || acgp.a((Context) this, bootstrapOptions.u) == anvn.NONE) {
            z3 = false;
        }
        return !z2 ? z3 ? R.string.copy_confirmation_description : R.string.smartdevice_d2d_copy_account_text : z3 ? R.string.copy_confirmation_description_3p : R.string.smartdevice_d2d_copy_3p_account_text;
    }

    private final int D() {
        return this.q.a("com.google").length;
    }

    public static Intent a(Context context, D2DDevice d2DDevice, int i2, String str, SourceLogManager sourceLogManager) {
        iva.a((Object) context);
        iva.a((Object) d2DDevice);
        Bundle bundle = new Bundle();
        bundle.putString("smartdevice.d2dDevice", ivy.b(d2DDevice));
        bundle.putInt("smartdevice.trigger", i2);
        bundle.putString("smartdevice.pin", str);
        bundle.putParcelable("smartdevice.sourceLogManager", sourceLogManager);
        return new Intent().setClassName(context, "com.google.android.gms.smartdevice.setup.ui.D2DSetupActivity").putExtras(bundle);
    }

    private final DialogFragment c(String str) {
        String str2;
        if (TextUtils.isEmpty((CharSequence) null)) {
            str2 = getString(R.string.common_something_went_wrong);
        } else {
            str2 = null;
        }
        return acmd.a(4, str2, str, getString(R.string.common_ok), (String) null, false);
    }

    private final void d(int i2) {
        SourceLogManager sourceLogManager = this.a;
        aucd o2 = anxb.l.o();
        aucd o3 = anwm.c.o();
        if (i2 != 0) {
            if (i2 == 1) {
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                anwm anwm = (anwm) o3.b;
                anwm.b = 3;
                anwm.a |= 1;
            } else if (i2 == 2) {
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                anwm anwm2 = (anwm) o3.b;
                anwm2.b = 2;
                anwm2.a |= 1;
            } else if (i2 != 3) {
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                anwm anwm3 = (anwm) o3.b;
                anwm3.b = 5;
                anwm3.a |= 1;
            } else {
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                anwm anwm4 = (anwm) o3.b;
                anwm4.b = 4;
                anwm4.a |= 1;
            }
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anxb anxb = (anxb) o2.b;
            anxb.c = 8;
            anxb.a |= 2;
            anwm anwm5 = (anwm) o3.i();
            anwm5.getClass();
            anxb.i = anwm5;
            anxb.a |= 1024;
            sourceLogManager.a(o2);
        }
        acdf acdf = new acdf();
        acdf.a = R.drawable.quantum_gm_ic_compare_arrows_gm_blue_36;
        acdf.a((int) R.drawable.smartdevice_setup_success, false);
        acdf.b = getString(R.string.smartdevice_d2d_source_setup_success);
        if (i2 == 1) {
            acdf.a(getString(R.string.smartdevice_action_open_app), 3);
        } else if (i2 != 2) {
            if (!azjh.d() || this.h != abov.AUTO) {
                acdf.c = getString(R.string.smartdevice_d2d_source_setup_continue_on_target, new Object[]{n().g});
            } else {
                acdf.b = getString(R.string.smartdevice_d2d_source_setup_success_auto);
                acdf.a = R.drawable.quantum_gm_ic_directions_car_gm_blue_36;
                acdf.c = getString(R.string.smartdevice_d2d_source_setup_success_description_auto);
            }
            acdf.a(getString(R.string.close_button_label), 2);
        } else {
            acdf.a(getString(R.string.smartdevice_action_open_app), 3);
            acdf.c = getString(R.string.smartdevice_companion_app_ready, new Object[]{n().h.b});
        }
        a((Fragment) acdf.a());
    }

    private final void q() {
        this.d.c.a();
    }

    private final void r() {
        if (this.B != null) {
            a(5, Bundle.EMPTY);
        } else {
            a(3, Bundle.EMPTY);
        }
    }

    private final void s() {
        if (n().d) {
            a(acnt.b(getString(R.string.smartdevice_connect_to_wifi)), getSupportFragmentManager().findFragmentById(R.id.fragment_container) != null, true);
        } else {
            B();
        }
    }

    private final Fragment t() {
        if (this.p) {
            return acmo.a(getString(R.string.smartdevice_d2d_copy_account_title), getString(C()), (String) null, getString(R.string.smartdevice_action_copy), R.drawable.quantum_gm_ic_compare_arrows_gm_blue_36, false);
        }
        return acmo.b();
    }

    private final Fragment u() {
        acdf acdf = new acdf();
        acdf.b = getString(R.string.smartdevice_d2d_copy_account_title);
        acdf.c = getString(C());
        acdf.a = R.drawable.quantum_gm_ic_compare_arrows_gm_blue_36;
        acdf.a(getString(R.string.smartdevice_action_copy), 1);
        return acdf.a();
    }

    private final BootstrapConfigurations v() {
        long j2;
        long j3;
        abpi abpi = new abpi();
        abpi.a(2, this.z);
        abny abny = new abny();
        abny.g = abpi;
        abny.d = this.n;
        if (!TextUtils.isEmpty(this.s)) {
            abny.a = this.s;
            if (!TextUtils.isEmpty(this.t)) {
                abny.c = "PSK";
                abny.b = this.t;
            } else {
                abny.c = "Open";
            }
        }
        Account[] a2 = this.q.a("com.google");
        if (n().c() && a2.length == 0) {
            f.f("BootstrapOptions require account but no accounts found on device.", new Object[0]);
            y();
            return null;
        } else if (!n().d() || this.m.size() == 1) {
            if (this.m.isEmpty()) {
                abny.a(a2);
            } else {
                ArrayList arrayList = this.m;
                abny.a((Account[]) arrayList.toArray(new Account[arrayList.size()]));
            }
            abpi abpi2 = abny.g;
            if (abpi2 != null) {
                j3 = abpi2.a;
                j2 = abpi2.b;
            } else {
                j3 = 0;
                j2 = 0;
            }
            return new BootstrapConfigurations(abny.a, abny.b, abny.c, abny.d, abny.e, abny.f, j3, j2);
        } else {
            if (this.m.isEmpty()) {
                f.e("BootstrapOptions require a single account but for some reason no  was selected.", new Object[0]);
            } else if (this.m.size() > 1) {
                f.e("BootstrapOptions require a single account but multiple accounts selected.", new Object[0]);
            }
            y();
            return null;
        }
    }

    private final void x() {
        BootstrapConfigurations v2 = v();
        if (v2 != null) {
            aclm aclm = this.d;
            abqf abqf = aclm.c;
            D2DDevice d2DDevice = aclm.d;
            abpu abpu = aclm.i;
            iha b2 = ihb.b();
            b2.a = new abyt(abqf, d2DDevice, v2, abpu);
            abqf.b(b2.a());
            this.b = 2;
        }
    }

    private final void y() {
        this.i = R.string.common_something_went_wrong;
        a(2, Bundle.EMPTY);
        finish();
    }

    private final void z() {
        CompanionApp companionApp = n().h;
        if (companionApp == null) {
            d(0);
            return;
        }
        String str = companionApp.e;
        String str2 = companionApp.c;
        if (TextUtils.isEmpty(str2)) {
            f.e("Cannot install companion app; package name is null or empty", new Object[0]);
            d(0);
        } else if (new acpn(this).a(str2)) {
            f.c("No need to install companion app, it's already installed", new Object[0]);
            d(2);
        } else {
            if (TextUtils.isEmpty(str)) {
                str = getResources().getString(R.string.smartdevice_install_app_reason, new Object[]{companionApp.b, this.g.c});
            }
            String string = getString(R.string.smartdevice_install_app);
            iva.a((Object) str);
            ackm ackm = new ackm();
            Bundle bundle = new Bundle();
            bundle.putString("smartdevice.message", str);
            bundle.putString("smartdevice.title", string);
            ackm.setArguments(bundle);
            a((Fragment) ackm);
        }
    }

    public final void a(int i2) {
    }

    public final void b() {
        d(4);
    }

    public final void e() {
        this.o = true;
        this.n = true;
        SourceLogManager sourceLogManager = this.a;
        aucd o2 = anxb.l.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anxb anxb = (anxb) o2.b;
        anxb.c = 14;
        anxb.a |= 2;
        sourceLogManager.a(o2);
        a(n(), false);
    }

    public final void f() {
        if (this.p) {
            this.o = true;
        }
        this.n = true;
        a(n(), true);
        overridePendingTransition(R.anim.slide_next_in, R.anim.slide_next_out);
    }

    public final void g() {
        this.b = 3;
        a(-1, Bundle.EMPTY);
        BootstrapOptions n2 = n();
        if (n2 != null) {
            PostTransferAction postTransferAction = n2.u;
            if (postTransferAction == null || !azlf.a.a().S()) {
                z();
            } else {
                Intent intent = (Intent) acgp.a(getPackageManager(), postTransferAction).b;
                if (intent != null) {
                    startActivity(intent.addFlags(268435456));
                    finish();
                } else {
                    d(0);
                }
            }
            int D = D();
            if ((n2.d() || n2.e()) && D > 0 && acea.a()) {
                acea.a(this, D, n2.g);
            }
        }
    }

    public final void h() {
        a(n(), false);
    }

    public final void i() {
        onBackPressed();
    }

    public final void j() {
        f.b("suppressing setup incomplete toast", new Object[0]);
        this.j = true;
    }

    public final void k() {
        a(t());
    }

    public final void l() {
    }

    public final void m() {
        c(3);
    }

    /* access modifiers changed from: package-private */
    public final BootstrapOptions n() {
        aclm aclm = this.d;
        if (aclm != null) {
            return aclm.g;
        }
        throw new IllegalStateException("No bootstrap options available yet");
    }

    public final void o() {
        if (azjh.c() && this.b == 1) {
            s();
            return;
        }
        abqf abqf = this.d.c;
        iha b2 = ihb.b();
        b2.a = new abyv();
        abqf.b(b2.a());
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 3) {
            this.u.a(i2, i3);
        } else if (i2 == 4) {
            Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.fragment_container);
            if (findFragmentById != null && (findFragmentById instanceof acnt)) {
                findFragmentById.onActivityResult(i2, i3, intent);
            }
        } else if (i2 != 7) {
            iwd iwd = f;
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unknown request code: ");
            sb.append(i2);
            iwd.e(sb.toString(), new Object[0]);
        } else if (i3 != -1) {
            f.c("User denied companion app permissions, or clicked back", new Object[0]);
            z();
        } else {
            f.c("User approved companion app permissions, installing app.", new Object[0]);
        }
    }

    public final void onBackPressed() {
        int i2 = this.b;
        if (i2 == 0) {
            r();
            q();
            finish();
        } else if (i2 == 3) {
            finish();
        } else if (i2 == 2 || this.l.size() == 0) {
            a(acmd.a(9, "", getString(R.string.smartdevice_alert_exit_setup_message), getString(R.string.smartdevice_alert_quit_button), getString(R.string.common_cancel), true));
        } else {
            ArrayList arrayList = this.l;
            this.k = (Integer) arrayList.remove(arrayList.size() - 1);
            getSupportFragmentManager().popBackStack(this.k.intValue(), 0);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        acmk acmk;
        Status status;
        abov abov;
        super.onCreate(bundle);
        aceg.a((Activity) this);
        setContentView((int) R.layout.smartdevice_fragment_container);
        this.q = acpd.a(this);
        Intent intent = getIntent();
        this.r = intent.getIntExtra("smartdevice.trigger", 0);
        if (intent.hasExtra("connectionRequest")) {
            this.B = (ConnectionRequest) ivy.a(intent.getStringExtra("connectionRequest"), ConnectionRequest.CREATOR);
            this.h = abov.a(intent.getStringExtra("device_type"));
        } else {
            D2DDevice d2DDevice = (D2DDevice) ivy.a(intent.getStringExtra("smartdevice.d2dDevice"), D2DDevice.CREATOR);
            iva.a((Object) d2DDevice, (Object) "D2D device cannot be null");
            this.g = d2DDevice;
            byte b2 = d2DDevice.e;
            abov[] values = abov.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    abov = abov.UNKNOWN;
                    break;
                }
                abov = values[i2];
                if (abov.h == b2) {
                    break;
                }
                i2++;
            }
            this.h = abov;
            this.v = intent.getStringExtra("smartdevice.pin");
        }
        aclp aclp = new aclp(this);
        this.w = aclp;
        aclp.execute(new Void[0]);
        this.x = new acpx(getApplicationContext());
        this.z = acec.c(this).a();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        aclm aclm = (aclm) supportFragmentManager.findFragmentByTag("connectionless_connection_fragment");
        this.d = aclm;
        if (aclm == null) {
            this.d = new aclm();
            supportFragmentManager.beginTransaction().add((Fragment) this.d, "connectionless_connection_fragment").commit();
            if (this.B != null) {
                aclm aclm2 = this.d;
                Context applicationContext = getApplicationContext();
                ConnectionRequest connectionRequest = this.B;
                aclm2.c = abmr.b(applicationContext);
                aclm2.b.a((aclb) this);
                if (azjn.a.a().a()) {
                    aclm2.c.a().a((acvp) new ackq(aclm2, connectionRequest));
                } else {
                    aclm2.c.a(connectionRequest, aclm2.h).a((acvs) new ackr(aclm2));
                }
            } else if (!azlf.a.a().u()) {
                f.e("Source mode is disabled using gservices.", new Object[0]);
                a(c(getString(R.string.smartdevice_d2d_source_disabled_text)));
            } else {
                if (acec.a() == null) {
                    f.d("Bluetooth not available", new Object[0]);
                    status = new Status(10570);
                } else if (acqb.a((Context) this)) {
                    f.d("Cannot copy restricted profile", new Object[0]);
                    status = new Status(10569);
                } else {
                    status = Status.a;
                }
                if (status.c()) {
                    aclm aclm3 = this.d;
                    Context applicationContext2 = getApplicationContext();
                    D2DDevice d2DDevice2 = this.g;
                    int i3 = this.r;
                    String str = this.v;
                    aclm3.c = abmr.b(applicationContext2);
                    aclm3.d = d2DDevice2;
                    aclm3.e = i3;
                    aclm3.f = str;
                    aclm3.b.a((aclb) this);
                    if (aclm3.e == 1) {
                        aclm3.c.a(aclm3.j);
                    } else {
                        aclm3.a();
                    }
                } else {
                    int i4 = status.i;
                    if (i4 == 10569) {
                        a(c(getString(R.string.smartdevice_d2d_source_restricted_user_text)));
                    } else if (i4 != 10570) {
                        iwd iwd = f;
                        String valueOf = String.valueOf(abpp.g(status.i));
                        iwd.e(valueOf.length() == 0 ? new String("Source mode is unsupported. Reason: ") : "Source mode is unsupported. Reason: ".concat(valueOf), new Object[0]);
                    } else {
                        a(c(getString(R.string.smartdevice_d2d_source_bluetooth_unavailable_text)));
                    }
                }
            }
        }
        this.u = new acki(this, new aclo(this), bundle);
        if (bundle == null) {
            bundle2 = Bundle.EMPTY;
        } else {
            bundle2 = bundle;
        }
        this.n = bundle2.getBoolean("smartdevice.d2dSetupActivity.lockscreenUnlocked", false);
        this.s = bundle2.getString("smartdevice.d2dSetupActivity.wifiSsid", "");
        String str2 = null;
        this.t = bundle2.getString("smartdevice.d2dSetupActivity.wifiPassword", (String) null);
        this.b = bundle2.getInt("smartdevice.d2dSetupActivity.bootstrapState", 0);
        this.k = Integer.valueOf(bundle2.getInt("smartdevice.d2dSetupActivity.backStackFragmentId", -99999));
        ArrayList<Integer> integerArrayList = bundle2.getIntegerArrayList("smartdevice.d2dSetupActivity.backStackIds");
        if (integerArrayList == null) {
            integerArrayList = new ArrayList<>(0);
        }
        this.l = integerArrayList;
        ArrayList parcelableArrayList = bundle2.getParcelableArrayList("smartdevice.d2dSetupActivity.selectedAccounts");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList(0);
        }
        this.m = parcelableArrayList;
        if (bundle != null) {
            this.a = (SourceLogManager) bundle2.getParcelable("smartdevice.sourceLogManager");
        } else {
            if (!azjh.d()) {
                acmk = acmk.a(getString(R.string.common_connecting_to_your_device));
            } else {
                if (this.h == abov.AUTO) {
                    str2 = getString(R.string.smartdevice_setup_bluetooth_connecting_text_auto);
                }
                acmk = acmk.a(getString(R.string.common_connecting), str2);
            }
            a((Fragment) acmk);
            this.a = (SourceLogManager) intent.getParcelableExtra("smartdevice.sourceLogManager");
        }
        SourceLogManager sourceLogManager = this.a;
        if (sourceLogManager == null) {
            SourceLogManager sourceLogManager2 = new SourceLogManager((Context) this);
            this.a = sourceLogManager2;
            sourceLogManager2.a(this.r, acdt.a(this));
        } else {
            sourceLogManager.f = this;
        }
        acqb.a(getContainerActivity());
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        f.b("onDestroy", new Object[0]);
        this.w.cancel(true);
        if (!this.A) {
            this.a.a(4);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        f.b("onPause", new Object[0]);
        this.u.b();
        this.x.a();
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        super.onPostResume();
        f.b("onPostResume", new Object[0]);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        f.b("onResume", new Object[0]);
        this.j = false;
        acpx acpx = this.x;
        acqf.a();
        if (!acpx.d) {
            acpx.d = true;
            acpx.c = Settings.System.getInt(acpx.b, "screen_off_timeout", acpx.a);
            acpx.a(acpx.a);
            acpx.e = new acpj(acpx, Thread.getDefaultUncaughtExceptionHandler());
            Thread.setDefaultUncaughtExceptionHandler(acpx.e);
        }
        this.u.a();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        f.b("onSaveInstanceState", new Object[0]);
        super.onSaveInstanceState(bundle);
        this.u.a(bundle);
        bundle.putBoolean("smartdevice.d2dSetupActivity.lockscreenUnlocked", this.n);
        bundle.putString("smartdevice.d2dSetupActivity.wifiSsid", this.s);
        bundle.putString("smartdevice.d2dSetupActivity.wifiPassword", this.t);
        bundle.putInt("smartdevice.d2dSetupActivity.bootstrapState", this.b);
        bundle.putInt("smartdevice.d2dSetupActivity.backStackFragmentId", this.k.intValue());
        bundle.putIntegerArrayList("smartdevice.d2dSetupActivity.backStackIds", this.l);
        bundle.putParcelable("smartdevice.sourceLogManager", this.a);
        bundle.putParcelableArrayList("smartdevice.d2dSetupActivity.selectedAccounts", this.m);
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        f.b("onStop", new Object[0]);
        if (!isChangingConfigurations() && this.b != 3 && !this.j) {
            if (this.i > 0) {
                f.b("Displaying error toast", new Object[0]);
                Toast.makeText(this, this.i, 1).show();
            } else {
                f.b("Displaying setup incomplete toast", new Object[0]);
                Toast.makeText(this, R.string.smartdevice_alert_setup_incomplete, 1).show();
            }
        }
        super.onStop();
    }

    public final void p() {
        this.j = true;
        q();
        if (this.h == abov.AUTO) {
            a(0, Bundle.EMPTY);
        } else {
            a(3, Bundle.EMPTY);
        }
        finish();
    }

    private final void w() {
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = true;
        if (((UserManager) getSystemService("user")).getUserProfiles().size() > 1) {
            boolean z3 = !this.m.isEmpty();
            if (!n().b().a(5) || !azkf.c()) {
                z2 = false;
            }
            if (!z3 && !z2) {
                f.b("Warning Android At Work profiles will not copy over", new Object[0]);
                a(acmd.a(10, getString(R.string.smartdevice_alert_work_profile_title), getString(R.string.smartdevice_alert_work_profile_message), getString(R.string.common_ok), (String) null, false));
                return;
            }
            x();
            return;
        }
        x();
    }

    public final void b(int i2) {
        if (i2 != 1) {
            f.c("User chose not to install companion app, going to done state.", new Object[0]);
            d(3);
        } else if (n() == null) {
            f.e("Cannot install companion app; bootstrap options are null", new Object[0]);
            d(0);
        } else {
            CompanionApp companionApp = n().h;
            if (companionApp == null) {
                f.e("Cannot install companion app; companion app is null", new Object[0]);
                d(0);
                return;
            }
            String str = companionApp.c;
            if (TextUtils.isEmpty(str)) {
                f.e("Cannot install companion app; package name is null or empty", new Object[0]);
                d(0);
                return;
            }
            f.c("Displaying companion app confirmation.", new Object[0]);
            amrl.a((Object) this);
            amrl.a(true ^ TextUtils.isEmpty(str));
            Bundle b2 = acmk.b(getResources().getString(R.string.smartdevice_setup_info_installing_app), (String) null);
            b2.putString("smartdevice.appPackage", str);
            ackp ackp = new ackp();
            ackp.setArguments(b2);
            a((Fragment) ackp);
            startActivityForResult(itg.a((Context) this, str), 7);
        }
    }

    public static Intent a(ConnectionRequest connectionRequest, int i2, SourceLogManager sourceLogManager, abov abov) {
        iva.a((Object) connectionRequest);
        iva.a((Object) abov);
        Bundle bundle = new Bundle();
        bundle.putString("connectionRequest", ivy.b(connectionRequest));
        bundle.putInt("smartdevice.trigger", i2);
        bundle.putParcelable("smartdevice.sourceLogManager", sourceLogManager);
        bundle.putString("device_type", abov.name());
        return new Intent().setClassName("com.google.android.gms", "com.google.android.gms.smartdevice.setup.ui.D2DSetupActivity").putExtras(bundle);
    }

    public final void c() {
        this.b = 1;
        BootstrapOptions n2 = n();
        if (!azjn.d() || !n2.c() || this.q.a("com.google").length != 0) {
            long j2 = n2.l;
            if (j2 == -1 || j2 == 0) {
                j2 = acpy.a();
            }
            SourceLogManager sourceLogManager = this.a;
            aucd o2 = anxb.l.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anxb anxb = (anxb) o2.b;
            anxb.c = 17;
            int i2 = anxb.a | 2;
            anxb.a = i2;
            anxb.a = i2 | FragmentTransaction.TRANSIT_ENTER_MASK;
            anxb.k = j2;
            sourceLogManager.a(o2);
            SourceLogManager sourceLogManager2 = this.a;
            synchronized (sourceLogManager2.d) {
                if (sourceLogManager2.c) {
                    SourceLogManager.a.d("Attempted to set sessionId twice", new Object[0]);
                } else if (j2 != -1) {
                    iwd iwd = SourceLogManager.a;
                    StringBuilder sb = new StringBuilder(40);
                    sb.append("Set session ID to : ");
                    sb.append(j2);
                    iwd.a(sb.toString(), new Object[0]);
                    sourceLogManager2.b = j2;
                    sourceLogManager2.c = true;
                    sourceLogManager2.d();
                } else {
                    SourceLogManager.a.e("Attempted to set invalid sessionId", new Object[0]);
                }
            }
            abpi b2 = n2.b();
            if ((!n2.d() || D() == 1 || !azkf.a.a().a()) && this.z && !b2.a(1)) {
                a(acpk.a(this, 12));
            } else {
                s();
            }
        } else {
            c(7);
        }
    }

    private final void a(int i2, Bundle bundle) {
        Intent putExtras = new Intent().putExtras(bundle);
        this.a.a(i2);
        SourceLogManager sourceLogManager = this.a;
        long a2 = azlu.a.a().a();
        if (a2 > 0) {
            y.execute(new acln(sourceLogManager, a2));
        }
        putExtras.putExtra("smartdevice.sourceLogManager", this.a);
        setResult(i2, putExtras);
        this.A = true;
    }

    private final void a(DialogFragment dialogFragment) {
        if (!isFinishing()) {
            dialogFragment.show(getSupportFragmentManager(), "smartdevice.dialogfragment");
        }
    }

    public final void b(int i2, Bundle bundle) {
        if (i2 == 1) {
            SourceLogManager sourceLogManager = this.a;
            aucd o2 = anxb.l.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anxb anxb = (anxb) o2.b;
            anxb.c = 6;
            anxb.a = 2 | anxb.a;
            sourceLogManager.a(o2);
            w();
        } else if (i2 == 2) {
            A();
            finish();
        } else if (i2 == 3) {
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(n().h.c);
            if (launchIntentForPackage != null) {
                startActivity(launchIntentForPackage);
            } else {
                f.e("Can't launch app, package manager says it's not installed", new Object[0]);
                A();
            }
            finish();
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown action ");
            sb.append(i2);
            throw new IllegalStateException(sb.toString());
        }
    }

    private final void a(Fragment fragment) {
        a(fragment, getSupportFragmentManager().findFragmentById(R.id.fragment_container) != null, false);
    }

    private final void a(Fragment fragment, boolean z2, boolean z3) {
        if (!(fragment instanceof DialogFragment)) {
            acpc.a(getContainerActivity(), fragment.getArguments().getString("smartdevice.title"));
            if (!isFinishing()) {
                FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                if (z2) {
                    beginTransaction.setCustomAnimations(R.anim.slide_next_in, R.anim.slide_next_out, R.anim.slide_back_in, R.anim.slide_back_out);
                }
                if (this.k.intValue() != -99999) {
                    this.l.add(this.k);
                }
                int commit = beginTransaction.replace(R.id.fragment_container, fragment).addToBackStack((String) null).commit();
                if (z3) {
                    this.k = Integer.valueOf(commit);
                } else {
                    this.k = -99999;
                }
            }
        } else {
            throw new IllegalArgumentException("DialogFragments cannot be added using this method. Did you mean to call 'addOnly(DialogFragment)'?");
        }
    }

    public final void c(int i2) {
        String str;
        String str2;
        Bundle bundle = new Bundle();
        SourceLogManager sourceLogManager = this.a;
        aucd o2 = anwt.c.o();
        int i3 = -1;
        int i4 = i2 - 1;
        int i5 = 6;
        if (i4 == 1) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anwt anwt = (anwt) o2.b;
            anwt.b = 8;
            anwt.a |= 1;
        } else if (i4 == 2) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anwt anwt2 = (anwt) o2.b;
            anwt2.b = 3;
            anwt2.a |= 1;
        } else if (i4 == 3) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anwt anwt3 = (anwt) o2.b;
            anwt3.b = 6;
            anwt3.a |= 1;
        } else if (i4 == 5) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anwt anwt4 = (anwt) o2.b;
            anwt4.b = 2;
            anwt4.a |= 1;
        } else if (i4 != 6) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anwt anwt5 = (anwt) o2.b;
            anwt5.b = 0;
            anwt5.a |= 1;
        } else {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anwt anwt6 = (anwt) o2.b;
            anwt6.b = 7;
            anwt6.a |= 1;
        }
        aucd o3 = anxb.l.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        anxb anxb = (anxb) o3.b;
        anwt anwt7 = (anwt) o2.i();
        anwt7.getClass();
        anxb.j = anwt7;
        anxb.a |= 2048;
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        anxb anxb2 = (anxb) o3.b;
        anxb2.c = 12;
        anxb2.a |= 2;
        sourceLogManager.a(o3);
        if (i4 == 1) {
            i3 = 3;
            i5 = 3;
        } else if (i4 == 2) {
            i3 = 1;
            i5 = 3;
        } else if (i4 != 3) {
            if (i4 == 6) {
                if (n() != null) {
                    str = n().g;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    str2 = getString(R.string.smartdevice_alert_no_accounts_generic_text);
                } else {
                    str2 = String.format(getString(R.string.smartdevice_alert_no_accounts_text), new Object[]{str.trim()});
                }
                a(acmd.a(8, getString(R.string.smartdevice_alert_no_accounts_title), str2, getString(R.string.common_ok), (String) null, false));
                return;
            } else if (i4 != 7) {
                y();
                return;
            }
        } else if (this.B == null) {
            i3 = 2;
            i5 = 3;
        } else {
            y();
            return;
        }
        this.j = true;
        bundle.putInt("restart_code", i3);
        a(i5, bundle);
        finish();
    }

    private final void a(BootstrapOptions bootstrapOptions, boolean z2) {
        iva.a((Object) bootstrapOptions, (Object) "bootstrapOptions cannot be null.");
        if (!bootstrapOptions.c() && D() == 0) {
            f.b("No accounts required and no accounts on device.", new Object[0]);
            w();
        } else if (bootstrapOptions.d()) {
            this.m.clear();
            a(acnj.a(getString(R.string.common_choose_account_label), false, false, this.h), !z2, true);
        } else if (!bootstrapOptions.e()) {
            f.e("Unsupported account requirements set in BootstrapOptions.", new Object[0]);
            y();
        } else if (!this.o) {
            a(u(), !z2, false);
        } else {
            w();
        }
    }

    public final void b(acni acni) {
        if (azjh.b()) {
            this.a.a(acni);
        }
    }

    public final void b(String str) {
        a((Fragment) acmk.a(str));
    }

    public final void d() {
        if (this.b != 3) {
            this.b = 0;
            c(4);
        }
    }

    public final void a() {
        d(1);
    }

    public final void a(int i2, int i3) {
        if (i2 != 4) {
            if (i2 != 12) {
                switch (i2) {
                    case 8:
                        break;
                    case 9:
                        if (i3 == 1) {
                            r();
                            if (azjt.c()) {
                                q();
                            }
                            finish();
                            return;
                        }
                        return;
                    case 10:
                        x();
                        return;
                    default:
                        return;
                }
            } else {
                a(2, Bundle.EMPTY);
                finish();
                return;
            }
        }
        if (i3 == 3) {
            a(2, Bundle.EMPTY);
            finish();
        }
    }

    public final void a(acni acni) {
        Account account = acni.a;
        if (account != null) {
            f.b("Selected account: %s", account);
            if (n().d()) {
                this.m.clear();
            }
            this.m.add(account);
            this.a.a(acni);
            if (this.o) {
                w();
            } else {
                a(u());
            }
        } else {
            throw new IllegalStateException("onAccountSelected was called but account was null!");
        }
    }

    public final void a(BootstrapProgressResult bootstrapProgressResult) {
        int i2 = bootstrapProgressResult.a;
        if (i2 == 1) {
            Bundle bundle = bootstrapProgressResult.b;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("accounts");
            if (parcelableArrayList != null) {
                a((Fragment) ackh.a(parcelableArrayList, this.c));
                return;
            }
            f.a("Has pending intent to delegate", new Object[0]);
            this.u.a((Fragment) null, (PendingIntent) bundle.getParcelable("pendingIntent"));
        } else if (i2 == 6) {
            f.a("WIFI_AUTHENTICATION_FAILED", new Object[0]);
            f.e("Wifi Password was incorrect", new Object[0]);
            acom.a(this.s, true).show(getSupportFragmentManager(), "dialog");
        }
    }

    public final void a(VerificationInfo verificationInfo) {
        String str = verificationInfo.a;
        this.a.b();
        a((Fragment) acny.a(anxm.a(verificationInfo.b), str, true, true, this.h));
    }

    public final void a(String str) {
        if (str != null) {
            this.a.b();
            a((Fragment) acny.a(anxm.a(this.g.h), str, true, true, this.h));
            return;
        }
        f.e("PIN verification is no longer supported.", new Object[0]);
        y();
    }

    public final void a(String str, String str2) {
        this.s = str;
        this.t = str2;
        v();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r8, java.lang.String r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            r7.s = r8
            r7.t = r9
            com.google.android.gms.smartdevice.d2d.metrics.SourceLogManager r8 = r7.a
            anxb r9 = defpackage.anxb.l
            aucd r9 = r9.o()
            anwy r0 = defpackage.anwy.e
            aucd r0 = r0.o()
            boolean r1 = r0.c
            r2 = 0
            if (r1 == 0) goto L_0x001c
            r0.c()
            r0.c = r2
        L_0x001c:
            aucj r1 = r0.b
            anwy r1 = (defpackage.anwy) r1
            int r10 = r10 + -1
            r1.d = r10
            int r10 = r1.a
            r3 = 4
            r10 = r10 | r3
            r1.a = r10
            r4 = 10
            r5 = 1
            r6 = 2
            if (r11 == r4) goto L_0x003d
            r4 = 11
            if (r11 == r4) goto L_0x003a
            r1.c = r5
            r10 = r10 | r6
            r1.a = r10
            goto L_0x0043
        L_0x003a:
            r1.c = r6
            goto L_0x0040
        L_0x003d:
            r11 = 3
            r1.c = r11
        L_0x0040:
            r10 = r10 | r6
            r1.a = r10
        L_0x0043:
            r10 = r10 | r5
            r1.a = r10
            r1.b = r12
            boolean r10 = r9.c
            if (r10 != 0) goto L_0x004d
            goto L_0x0052
        L_0x004d:
            r9.c()
            r9.c = r2
        L_0x0052:
            aucj r10 = r9.b
            anxb r10 = (defpackage.anxb) r10
            r10.c = r3
            int r11 = r10.a
            r11 = r11 | r6
            r10.a = r11
            aucj r11 = r0.i()
            anwy r11 = (defpackage.anwy) r11
            r11.getClass()
            r10.g = r11
            int r11 = r10.a
            r11 = r11 | 128(0x80, float:1.794E-43)
            r10.a = r11
            r8.a((defpackage.aucd) r9)
            r7.B()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity.a(java.lang.String, java.lang.String, int, int, int):void");
    }

    public final void a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Bundle bundle = (Bundle) arrayList.get(i2);
            if (!TextUtils.isEmpty(bundle.getString("sessionCheckpoint"))) {
                arrayList2.add(bundle);
            }
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelableArrayList("accounts", arrayList2);
        this.d.a(bundle2);
    }
}
