package com.google.android.location.network;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NetworkConsentChimeraActivity extends Activity implements DialogInterface.OnClickListener {
    private AlertDialog a;
    private int b;
    private int c;
    private Boolean d = null;

    private final void a(boolean z) {
        int intExtra;
        if (this.d == null) {
            this.d = Boolean.valueOf(z);
            if (Log.isLoggable("NLPConsentDialog", 4)) {
                StringBuilder sb = new StringBuilder(31);
                sb.append("consent dialog choice was ");
                sb.append(z);
                Log.i("NLPConsentDialog", sb.toString());
            }
            if (!isFinishing()) {
                finish();
            }
            if (z) {
                rns.a(this, true, rnu.a, 3, this.b, R.string.common_agree, R.string.common_disagree, this.c);
                if (!jkr.h() && (intExtra = getIntent().getIntExtra("newMode", 0)) != 0) {
                    if (Log.isLoggable("NLPConsentDialog", 4)) {
                        StringBuilder sb2 = new StringBuilder(36);
                        sb2.append("setting location mode to ");
                        sb2.append(intExtra);
                        Log.i("NLPConsentDialog", sb2.toString());
                    }
                    rns.a((Context) this, intExtra, rnu.a);
                }
                if (getIntent().getBooleanExtra("confirmLgaayl", false)) {
                    Intent intent = new Intent("com.google.android.gsf.GOOGLE_LOCATION_SETTINGS");
                    intent.setFlags(268435456);
                    startActivity(intent);
                }
            } else if (Build.VERSION.SDK_INT >= 28) {
                if (Log.isLoggable("NLPConsentDialog", 4)) {
                    Log.i("NLPConsentDialog", "setting location off");
                }
                rns.a((Context) this, false, rnu.a);
            }
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        a(i == -1);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        super.onCreate(bundle);
        if (Log.isLoggable("NLPConsentDialog", 4)) {
            Log.i("NLPConsentDialog", "displaying consent dialog");
        }
        sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        Window window = getWindow();
        window.addFlags(2);
        window.setDimAmount(0.6f);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if (!jkr.g()) {
            i = R.string.location_warning_title;
        } else {
            i = R.string.location_warning_title_v28;
        }
        this.b = i;
        if (!jkr.g()) {
            i2 = R.string.location_warning_message;
        } else {
            i2 = R.string.location_warning_message_v28;
        }
        this.c = i2;
        builder.setTitle(this.b);
        builder.setMessage(this.c);
        builder.setPositiveButton(getString(R.string.common_agree), this);
        builder.setNegativeButton(getString(R.string.common_disagree), this);
        builder.setOnCancelListener(new aist(this));
        AlertDialog create = builder.create();
        this.a = create;
        create.getWindow().addFlags(4194304);
        this.a.show();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        a(false);
        super.onPause();
    }
}
