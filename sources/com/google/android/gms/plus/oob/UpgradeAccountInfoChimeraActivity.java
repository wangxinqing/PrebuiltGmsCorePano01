package com.google.android.gms.plus.oob;

import android.os.Bundle;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UpgradeAccountInfoChimeraActivity extends yyw implements yza {
    private Fragment d;

    public final /* bridge */ /* synthetic */ void a() {
    }

    public final void f() {
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.plus_oob_upgrade_account_activity);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("content_fragment");
        this.d = findFragmentByTag;
        if (findFragmentByTag == null) {
            Bundle extras = getIntent().getExtras();
            this.d = yzb.a(c(), extras.getString("title"), extras.getString("text"), extras.getString("button_text"));
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            beginTransaction.add(R.id.content_layout, this.d, "content_fragment");
            beginTransaction.commit();
        }
    }
}
