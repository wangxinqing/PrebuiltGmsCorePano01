package com.google.android.gms.appinvite;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AppInviteAcceptInvitationChimeraActivity extends Activity {
    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0 && i2 != -1) {
            StringBuilder sb = new StringBuilder(46);
            sb.append("Inline install failed. Error code: ");
            sb.append(i2);
            Log.e("AcceptInvitation", sb.toString());
        }
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getData() == null) {
            finish();
            return;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        if (((eak) supportFragmentManager.findFragmentByTag("progressFragment")) == null) {
            beginTransaction.add((Fragment) eak.a(), "progressFragment");
        }
        if (supportFragmentManager.findFragmentByTag("acceptFragment") == null) {
            dvo dvo = new dvo();
            dvo.setRetainInstance(true);
            beginTransaction.add((Fragment) dvo, "acceptFragment");
        }
        if (!beginTransaction.isEmpty()) {
            beginTransaction.commit();
        }
    }
}
