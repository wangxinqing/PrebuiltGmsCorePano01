package com.google.android.gms.plus.circles;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentActivity;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AddToCircleConsentChimeraActivity extends FragmentActivity implements ysg {
    private icc a;
    private String b;
    private String c;

    public final void a(boolean z) {
        if (!z) {
            setResult(0);
        } else if (this.a.i()) {
            ibq ibq = wlt.a;
            icc icc = this.a;
            icc.b((idf) new xcx(icc, this.b, this.c));
            setResult(1);
        } else {
            setResult(1);
        }
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().clearFlags(2);
        String a2 = jhg.a((Activity) this);
        if (a2 == null || !hya.a((Context) this).b(a2)) {
            setResult(0);
            finish();
        }
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("com.google.android.gms.plus.circles.EXTRA_APPLICATION_ID", 0);
        String stringExtra = intent.getStringExtra("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE");
        if (stringExtra != null) {
            a2 = stringExtra;
        }
        if (intExtra == 0) {
            intExtra = 80;
        }
        ibz ibz = new ibz(this);
        ibz.b = a2;
        ibq ibq = wlt.a;
        wlr wlr = new wlr();
        wlr.a = intExtra;
        ibz.a(ibq, (ibj) wlr.a());
        this.a = ibz.b();
        this.b = intent.getStringExtra("com.google.android.gms.plus.circles.EXTRA_ACCOUNT_NAME");
        this.c = intent.getStringExtra("com.google.android.gms.plus.circles.EXTRA_PAGE_ID");
        String stringExtra2 = intent.getStringExtra("com.google.android.gms.plus.circles.EXTRA_CONSENT_HTML");
        String stringExtra3 = intent.getStringExtra("com.google.android.gms.plus.circles.EXTRA_TITLE_TEXT");
        String stringExtra4 = intent.getStringExtra("com.google.android.gms.plus.circles.EXTRA_BUTTON_TEXT");
        if (getSupportFragmentManager().findFragmentByTag("consentDialog") == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("consentHtml", stringExtra2);
            bundle2.putString("titleText", stringExtra3);
            bundle2.putString("buttonText", stringExtra4);
            ysh ysh = new ysh();
            ysh.setArguments(bundle2);
            ysh.show(getSupportFragmentManager(), "consentDialog");
        }
    }

    public final void onStart() {
        super.onStart();
        this.a.e();
    }

    public final void onStop() {
        this.a.g();
        super.onStop();
    }
}
