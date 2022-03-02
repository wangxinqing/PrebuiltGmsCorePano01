package com.google.android.gms.auth.uiflows.addaccount;

import android.os.Bundle;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CantAddWorkAccountChimeraActivity extends FragmentActivity implements ijh {
    public final void a(iji iji, int i) {
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        iji.a(getString(R.string.auth_cant_add_work_account_message), getString(17039370), (CharSequence) null, true).show(getSupportFragmentManager(), "error_dialog");
    }
}
