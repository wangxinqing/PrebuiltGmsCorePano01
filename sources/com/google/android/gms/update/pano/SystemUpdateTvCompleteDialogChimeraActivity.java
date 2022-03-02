package com.google.android.gms.update.pano;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SystemUpdateTvCompleteDialogChimeraActivity extends Activity {
    private static final iwd a = adnt.i("SystemUpdateTvCompleteDialogChimeraActivity");

    public final void onCreate(Bundle bundle) {
        Fragment fragment;
        super.onCreate(bundle);
        String b = amrk.b(getIntent().getStringExtra("message"));
        if (TextUtils.isEmpty(b)) {
            a.e("Starting without message. Finishing.", new Object[0]);
            finish();
            return;
        }
        setTheme(R.style.SystemUpdatePanoCompleteDialogTheme);
        setContentView((int) R.layout.system_update_fragment_container_activity);
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        if (!aypd.b()) {
            fragment = new adqd();
            Bundle bundle2 = new Bundle();
            bundle2.putString("message", b);
            fragment.setArguments(bundle2);
        } else {
            fragment = new adps();
            Bundle bundle3 = new Bundle();
            bundle3.putString("message", b);
            fragment.setArguments(bundle3);
        }
        beginTransaction.replace(R.id.content, fragment).commit();
    }
}
