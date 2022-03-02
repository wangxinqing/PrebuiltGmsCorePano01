package com.google.android.gms.smartdevice.setup.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountChallengeChimeraActivity extends bjs implements ackg {
    private static final iwd b = acqa.a("Setup", "UI", "AccountChallengeChimeraActivity");
    etl a;
    private ackh c;

    public final void a(ArrayList arrayList) {
        int i;
        iwd iwd = b;
        Object[] objArr = new Object[1];
        if (arrayList != null) {
            i = arrayList.size();
        } else {
            i = 0;
        }
        objArr[0] = Integer.valueOf(i);
        iwd.a("onAccountChallengesCompleted(accounts.size()=%s)", objArr);
        Intent intent = new Intent();
        intent.putExtra("accounts", arrayList);
        this.a.a("com.google", 1).a(getContainerActivity(), (acvp) new ackc(this, intent));
    }

    public final void onBackPressed() {
        boolean z = false;
        b.a("onBackPressed", new Object[0]);
        ackh ackh = this.c;
        if (ackh.c == null) {
            String str = ackh.b;
            if (str != null && str.equals(ackh.d.j)) {
                z = true;
            }
            acke acke = new acke(ackh);
            Activity activity = ackh.getActivity();
            if (activity != null) {
                sr a2 = aceg.a((Context) activity);
                a2.a(true);
                a2.a((int) R.string.smartdevice_d2d_target_skip_primary_account_alert_title);
                a2.b((int) R.string.common_skip, (DialogInterface.OnClickListener) acke);
                a2.a((int) R.string.common_cancel, (DialogInterface.OnClickListener) acke);
                a2.a((DialogInterface.OnDismissListener) new ackf(ackh));
                if (z) {
                    a2.b((int) R.string.smartdevice_d2d_target_skip_primary_account_alert_message);
                }
                ackh.c = a2.b();
                ackh.c.show();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        aceg.a((Activity) this);
        setContentView((int) R.layout.smartdevice_fragment_container);
        this.a = esu.a(this);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("accounts");
        boolean z = false;
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            z = true;
        }
        iva.b(z);
        if (bundle == null) {
            this.c = ackh.a(parcelableArrayListExtra, (String) null);
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, this.c, "challengeFragment").commit();
            return;
        }
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("challengeFragment");
        iva.a((Object) findFragmentByTag);
        this.c = (ackh) findFragmentByTag;
    }
}
