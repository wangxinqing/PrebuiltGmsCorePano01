package com.google.android.gms.nearby.discovery.fastpair;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.chimera.Activity;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CompanionAppInstallChimeraActivity extends Activity {
    public static Intent a(Context context, String str) {
        return aryl.a(context, itg.b(str));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        jjg jjg = tsp.a;
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().hasExtra("intent")) {
            jjg jjg = tsp.a;
            startActivityForResult((Intent) getIntent().getParcelableExtra("intent"), ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
        }
        finish();
    }
}
