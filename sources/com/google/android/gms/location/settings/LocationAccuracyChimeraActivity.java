package com.google.android.gms.location.settings;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.gms.R;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LocationAccuracyChimeraActivity extends jmp {
    private Executor a;

    /* access modifiers changed from: protected */
    public final void e(boolean z) {
        rns.a(this, z, rnu.a, 4, R.string.location_settings_location_accuracy_activity_title, R.string.location_settings_location_accuracy_activity_summary);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = jfm.b(9);
        setContentView((int) R.layout.location_accuracy_settings);
        d(true);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.a.execute(new rmt(this));
    }
}
