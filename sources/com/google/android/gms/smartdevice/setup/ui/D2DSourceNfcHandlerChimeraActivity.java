package com.google.android.gms.smartdevice.setup.ui;

import android.content.Context;
import android.nfc.NdefMessage;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.metrics.SourceLogManager;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class D2DSourceNfcHandlerChimeraActivity extends bjs implements acod, acmc {
    private static final iwd b = acqa.a("D2DSourceNfcHandlerActivity");
    SourceLogManager a;
    private acch c;
    private boolean d;

    private final void a(acch acch) {
        D2DDevice d2DDevice = new D2DDevice();
        d2DDevice.e("unknown target device");
        d2DDevice.a(1);
        d2DDevice.f(acch.a);
        d2DDevice.a((byte) 0);
        this.d = true;
        startActivity(D2DSetupChimeraActivity.a((Context) this, d2DDevice, 1, this.c.c, this.a));
    }

    private final void e() {
        acmd.a(1, getString(R.string.common_something_went_wrong), (String) null, getString(R.string.common_ok), (String) null, false).show(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        acch acch;
        super.onCreate(bundle);
        aceg.a((Activity) this);
        setContentView((int) R.layout.smartdevice_fragment_container);
        NdefMessage ndefMessage = (NdefMessage) getIntent().getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES")[0];
        if (ndefMessage == null || ndefMessage.getRecords().length == 0) {
            e();
            return;
        }
        byte[] payload = ndefMessage.getRecords()[0].getPayload();
        try {
            acch = (acch) aucj.a((aucj) acch.d, payload, aubs.c());
        } catch (auda e) {
            b.e("Invalid BootstrapInfo proto.", e, new Object[0]);
            acch = null;
        }
        this.c = acch;
        if (acch == null) {
            e();
        } else if (acch.b == 0) {
            b.e("Google Play services on target device is too old.", new Object[0]);
            e();
        } else {
            acqg a2 = acqg.a();
            if (a2 == null || !a2.b()) {
                if (bundle == null) {
                    SourceLogManager sourceLogManager = new SourceLogManager((Context) this);
                    this.a = sourceLogManager;
                    sourceLogManager.a(1, acdt.a(this));
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, acoe.a(getString(R.string.smartdevice_setup_intro_title), getString(R.string.smartdevice_intro_text_bt_only), getString(R.string.common_next))).commit();
                } else {
                    SourceLogManager sourceLogManager2 = (SourceLogManager) bundle.getParcelable("smartdevice.sourceLogManager");
                    amrl.a((Object) sourceLogManager2);
                    this.a = sourceLogManager2;
                    sourceLogManager2.f = this;
                }
                acqb.a(getContainerActivity());
                return;
            }
            b.b("Bluetooth already enabled. Skipping consent screen.", new Object[0]);
            a(this.c);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        if (!this.d && isFinishing()) {
            this.a.d();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("smartdevice.sourceLogManager", this.a);
    }

    public final void a(int i) {
        if (i != 0) {
            iwd iwd = b;
            StringBuilder sb = new StringBuilder(37);
            sb.append("Unknown text fragment id: ");
            sb.append(i);
            iwd.e(sb.toString(), new Object[0]);
        } else {
            this.a.a();
            a(this.c);
        }
        finish();
    }

    public final void a(int i, int i2) {
        finish();
    }
}
