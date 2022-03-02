package com.google.android.gms.usagereporting.ui;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.FragmentActivity;
import com.google.android.chimera.FragmentManager;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UsageReportingDialogChimeraActivity extends FragmentActivity {
    protected boolean a = false;
    private int b = -1;
    private String c;

    public final void a(String str) {
        startService(new Intent(str).putExtras(getIntent().getExtras()).setPackage("com.google.android.gms"));
        jhg.a(this, this.b, this.c, 0);
        finish();
        this.a = true;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.b = intent.getIntExtra("pid", -1);
        this.c = intent.getStringExtra("stack_trace");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentByTag("UsageReportingDialog") == null) {
            adtt adtt = new adtt();
            adtt.setCancelable(false);
            adtt.setRetainInstance(true);
            adtt.show(supportFragmentManager, "UsageReportingDialog");
        }
    }

    public final void onStop() {
        super.onStop();
        if (!this.a) {
            a("com.google.android.gms.usagereporting.OPTOUT_UR");
        }
    }
}
