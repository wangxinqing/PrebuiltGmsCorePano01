package com.google.android.gms.accountsettings.ui;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MyAccountNotAvailableAlertChimeraActivity extends Activity {
    DialogFragment a;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.AsAlertDialogTheme);
        setFinishOnTouchOutside(false);
        dil dil = new dil();
        this.a = dil;
        dil.show(getSupportFragmentManager(), "nosettings");
    }
}
