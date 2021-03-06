package com.google.android.gms.app.settings;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RecoverPermissionChimeraActivity extends Activity {
    private Set a;

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 0 || !ixm.b.a(this.a).isEmpty()) {
            setResult(0);
        } else {
            setResult(-1);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("requiredGroups");
        if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            setResult(-1);
            finish();
            return;
        }
        this.a = new HashSet(stringArrayListExtra);
        Set a2 = ixm.b.a(this.a);
        if (!a2.isEmpty()) {
            dry dry = new dry();
            Bundle bundle2 = new Bundle();
            bundle2.putStringArrayList("missingGroups", new ArrayList(a2));
            dry.setArguments(bundle2);
            dry.show(getFragmentManager(), "PermissionsDialog");
            return;
        }
        setResult(-1);
        finish();
    }
}
