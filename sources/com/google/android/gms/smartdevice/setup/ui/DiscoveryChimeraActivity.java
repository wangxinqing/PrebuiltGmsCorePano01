package com.google.android.gms.smartdevice.setup.ui;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.metrics.SourceLogManager;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DiscoveryChimeraActivity extends bjs implements acod, aclw, accj {
    private static final iwd b = acqa.a("DiscoveryChimeraActivity");
    SourceLogManager a;
    private boolean c;
    private boolean d;
    private aclz e;
    private WifiManager f;
    private boolean g;

    public static Intent a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.smartdevice.setup.ui.DiscoveryActivity");
    }

    private final Fragment h() {
        String string = getString(R.string.smartdevice_choose_device);
        acly acly = new acly();
        Bundle bundle = new Bundle();
        bundle.putString("smartdevice.title", string);
        acly.setArguments(bundle);
        return acly;
    }

    public final void b(int i, Bundle bundle) {
        if (i != 1) {
            finish();
        } else if (this.e.a()) {
            aclz aclz = this.e;
            ConnectionRequest connectionRequest = aclz.a;
            if (connectionRequest != null) {
                startActivityForResult(D2DSetupChimeraActivity.a(connectionRequest, aclz.b, this.a, aclz.c), 6);
            }
        } else {
            onBackPressed();
        }
    }

    public final void e() {
        this.a.a(-1, (byte) 0, false, 1);
    }

    public final void f() {
        this.a.c();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        aclz aclz;
        SourceLogManager sourceLogManager;
        super.onActivityResult(i, i2, intent);
        int i3 = 0;
        this.g = false;
        b.a("onActivityResult requestCode: %d resultCode: %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (!(intent == null || (sourceLogManager = (SourceLogManager) intent.getParcelableExtra("smartdevice.sourceLogManager")) == null)) {
            this.a = sourceLogManager;
            sourceLogManager.f = this;
        }
        if (i != 6) {
            iwd iwd = b;
            StringBuilder sb = new StringBuilder(54);
            sb.append("Unhandled activity result for request code ");
            sb.append(i);
            iwd.d(sb.toString(), new Object[0]);
        } else if (i2 != 3) {
            if (i2 == 6 && (aclz = this.e) != null && aclz.b == 7) {
                acdf acdf = new acdf();
                acdf.a = R.drawable.quantum_ic_warning_googred_36;
                acdf.a(getString(R.string.smartdevice_alert_quit_button), 2);
                acdf.b = getString(R.string.smartdevice_connection_error_title);
                acdf.c = getString(R.string.smartdevice_web_deeplink_failed_description);
                a(acdf.a(), true);
                return;
            }
            finish();
        } else if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                i3 = extras.getInt("restart_code", 0);
            }
            if (i3 != 0) {
                acdf acdf2 = new acdf();
                acdf2.a = R.drawable.quantum_ic_warning_googred_36;
                acdf2.b = getString(R.string.smartdevice_problem_copying_title);
                acdf2.c = getString(R.string.smartdevice_problem_copying);
                acdf2.a(getString(R.string.common_try_again), 1);
                acdf2.b(getString(R.string.smartdevice_alert_quit_button), 2);
                if (i3 == 1) {
                    acdf2.b = getString(R.string.smartdevice_connection_error_title);
                    acdf2.c = getString(R.string.smartdevice_connection_error);
                } else if (i3 == 2) {
                    acdf2.b = getString(R.string.smartdevice_alert_disconnected_title);
                    acdf2.c = getString(R.string.smartdevice_connection_error);
                }
                a(acdf2.a(), true);
            }
        }
    }

    public final void onBackPressed() {
        super.onBackPressed();
        if (this.e.a()) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        boolean z;
        acoe acoe;
        super.onCreate(bundle);
        aceg.a((Activity) this);
        setContentView((int) R.layout.smartdevice_fragment_container);
        Intent intent = getIntent();
        this.e = aclz.a(intent);
        this.f = (WifiManager) getApplicationContext().getSystemService("wifi");
        int i = this.e.b;
        boolean z2 = true;
        if (bundle == null) {
            SourceLogManager sourceLogManager = new SourceLogManager((Context) this);
            this.a = sourceLogManager;
            sourceLogManager.a(i, acdt.a(this));
            if (intent == null || !azlf.a.a().g() || !intent.getBooleanExtra("skipStartScreen", false)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            this.g = bundle.getBoolean("isWaitingForResult");
            this.c = bundle.getBoolean("smartdevice.discoveryActivity.consentConfirmed");
            this.d = bundle.getBoolean("smartdevice.discoveryActivity.enabledWifi");
            SourceLogManager sourceLogManager2 = (SourceLogManager) bundle.getParcelable("smartdevice.sourceLogManager");
            amrl.a((Object) sourceLogManager2);
            this.a = sourceLogManager2;
            sourceLogManager2.f = this;
            z = false;
        }
        acqg a2 = acqg.a();
        if (a2 == null || !a2.b() || !azma.b() || !azlf.a.a().P()) {
            z2 = z;
        }
        aclz aclz = this.e;
        ConnectionRequest connectionRequest = aclz.a;
        if (connectionRequest != null) {
            this.a.a(0, aclz.c.h, false, 3);
            this.a.c();
            startActivityForResult(D2DSetupChimeraActivity.a(connectionRequest, i, this.a, this.e.c), 6);
        } else if (z2) {
            a(h(), false);
        } else if (!this.c) {
            if (azkn.a.a().a() && intent != null && abov.a(intent.getStringExtra("device_type")) == abov.AUTO) {
                acoe = acoe.a(0, getString(R.string.smartdevice_intro_title_auto), getString(R.string.smartdevice_intro_text_auto), getString(R.string.common_connect), Integer.valueOf(R.drawable.quantum_gm_ic_directions_car_gm_blue_36), false, true);
            } else {
                acoe = acoe.a(getString(R.string.smartdevice_setup_intro_title), azma.b() ? getString(R.string.smartdevice_intro_text_bt_only) : getString(R.string.smartdevice_setup_intro_text), getString(R.string.common_next));
            }
            a(acoe, false);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        if (isFinishing()) {
            if (this.f != null && this.d) {
                b.a("Resetting wifi to disabled state", new Object[0]);
                this.f.setWifiEnabled(false);
                this.d = false;
            }
            if (!this.g) {
                this.a.d();
            }
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        b.b("onNewIntent().", new Object[0]);
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            stringExtra.equals("fastpair");
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("smartdevice.discoveryActivity.consentConfirmed", this.c);
        bundle.putBoolean("smartdevice.discoveryActivity.enabledWifi", this.d);
        bundle.putParcelable("smartdevice.sourceLogManager", this.a);
        bundle.putBoolean("isWaitingForResult", this.g);
    }

    private final void a(Fragment fragment, boolean z) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        if (supportFragmentManager.findFragmentById(R.id.fragment_container) != null) {
            beginTransaction.setCustomAnimations(R.anim.slide_next_in, R.anim.slide_next_out, R.anim.slide_back_in, R.anim.slide_back_out);
        }
        if (z) {
            beginTransaction.addToBackStack((String) null);
        }
        beginTransaction.replace(R.id.fragment_container, fragment).commitAllowingStateLoss();
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            acpc.a(getContainerActivity(), arguments.getString("smartdevice.title"));
        }
    }

    public final void a(int i) {
        WifiManager wifiManager;
        if (i == 0) {
            this.c = true;
            this.a.a();
            if (!azma.b() && (wifiManager = this.f) != null && !wifiManager.isWifiEnabled()) {
                b.b("Enabling wifi", new Object[0]);
                this.f.setWifiEnabled(true);
                this.d = true;
            }
            a(h(), true);
            return;
        }
        iwd iwd = b;
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown text fragment id: ");
        sb.append(i);
        iwd.e(sb.toString(), new Object[0]);
    }

    public final void a(D2DDevice d2DDevice, int i, boolean z) {
        this.a.a(i, d2DDevice.e, z, anwo.a(d2DDevice.b));
        this.g = true;
        startActivityForResult(D2DSetupChimeraActivity.a((Context) this, d2DDevice, this.e.b, (String) null, this.a), 6);
    }
}
