package com.google.android.gms.chimera.container.ui;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;
import com.google.android.chimera.config.FeatureRequestExtras;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.R;
import com.google.android.setupdesign.GlifLayout;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ModuleDownloadChimeraActivity extends bjs {
    public ModuleManager.FeatureList a;
    public int b = 0;
    public Handler c;
    hgz d;
    private GlifLayout e;

    private final void b(int i) {
        int i2 = 1;
        Intent putExtra = new Intent().putExtra("_chimera_fallback_only", true);
        FeatureRequestExtras.ResultBuilder resultBuilder = new FeatureRequestExtras.ResultBuilder();
        if (i != 2) {
            if (i == 3) {
                i2 = 2;
            } else if (i == 4) {
                i2 = 3;
            } else if (i == 5) {
                i2 = 4;
            } else if (i != 6) {
                StringBuilder sb = new StringBuilder(57);
                sb.append("Unexpected result code from download activity ");
                sb.append(i);
                Log.w("ModuleDownloadActivity", sb.toString());
            } else {
                i2 = 5;
            }
        }
        resultBuilder.setDownloadResult(i2);
        resultBuilder.addToIntent(putExtra);
        setResult(-1, putExtra);
        finish();
    }

    public final void a(int i) {
        int i2;
        String str;
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if ((i == 3 || i == 4) && ((connectivityManager = (ConnectivityManager) getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected())) {
            i = 5;
        }
        this.b = i;
        int i3 = R.string.zapp_checkin_failure_subtitle;
        int i4 = R.string.zapp_checkin_title;
        int i5 = R.string.common_cancel;
        if (i == 0) {
            ModuleManager moduleManager = ModuleManager.get(this);
            ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
            String sessionId = new FeatureRequestExtras.RequestReader(getIntent()).getSessionId();
            if (awxs.g() && sessionId != null) {
                featureRequest.setSessionId(sessionId);
            }
            try {
                featureRequest.requestFeatures(this.a);
                hgz hgz = this.d;
                if (hgz != null) {
                    hgz.b();
                }
                hgz hgz2 = new hgz(this.c, this.a, moduleManager);
                this.d = hgz2;
                featureRequest.setUrgent(hgz2);
                if (!moduleManager.requestFeatures(featureRequest)) {
                    a(3);
                    i2 = 0;
                    i3 = R.string.zapp_checkin_description_text;
                    i5 = 0;
                } else {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, 4, 0), TimeUnit.SECONDS.toMillis(awxp.e()));
                    i2 = 0;
                    i3 = R.string.zapp_checkin_description_text;
                    i5 = 0;
                }
            } catch (auda e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Invalid FeatureList: ");
                sb.append(valueOf);
                Log.e("ModuleDownloadActivity", sb.toString());
                a(2);
                i2 = 0;
                i3 = R.string.zapp_checkin_description_text;
                i5 = 0;
            }
        } else if (i != 1) {
            if (i == 2) {
                i2 = 8;
                i3 = 0;
            } else if (i == 3 || i == 4) {
                i2 = 8;
            } else if (i == 5) {
                i4 = R.string.zapp_checkin_offline_title;
                i3 = R.string.zapp_checkin_offline_subtitle;
                i5 = R.string.common_retry;
                i2 = 8;
            } else {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append(i);
                sb2.append(" is not a valid state");
                throw new IllegalArgumentException(sb2.toString());
            }
            i4 = R.string.common_something_went_wrong;
        } else {
            b(1);
            return;
        }
        TextView textView = (TextView) this.e.findViewById(R.id.description_text);
        if (i3 != 0) {
            str = getString(i3);
        } else {
            str = "";
        }
        textView.setText(str);
        this.e.findViewById(R.id.circular_progress_bar).setVisibility(i2);
        this.e.c(i4);
        alhg alhg = ((alhe) this.e.a(alhe.class)).c;
        if (i5 != 0) {
            alhg.a(0);
            alhg.a(getText(i5));
            return;
        }
        alhg.a(8);
    }

    public final void onBackPressed() {
        int i = this.b;
        if (i == 0) {
            i = 6;
        }
        b(i);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = new qvr((Handler.Callback) new hgx(this));
        Intent intent = getIntent();
        byte[] byteArrayExtra = intent.getByteArrayExtra("chimera.FEATURE_LIST");
        if (byteArrayExtra == null) {
            Log.w("ModuleDownloadActivity", "No features specified. Finishing...");
            b(2);
            return;
        }
        this.a = ModuleManager.FeatureList.fromProto(byteArrayExtra);
        aljk aljk = new aljk(aljl.a());
        aljk.a = 2132018089;
        aljk.b = false;
        setTheme(aljk.a().a(intent));
        if (intent.getBooleanExtra("useImmersiveMode", false)) {
            alhs.a(getWindow());
        }
        setContentView((int) R.layout.module_loading_activity);
        GlifLayout glifLayout = (GlifLayout) findViewById(R.id.module_loading_layout);
        this.e = glifLayout;
        ((alhe) glifLayout.a(alhe.class)).c.f = new hgy(this);
        if (bundle != null) {
            this.b = bundle.getInt("state", 0);
        }
        a(this.b);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        hgz hgz = this.d;
        if (hgz != null) {
            hgz.b();
            this.d = null;
            this.c.removeCallbacksAndMessages((Object) null);
        }
        super.onDestroy();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("state", this.b);
    }
}
