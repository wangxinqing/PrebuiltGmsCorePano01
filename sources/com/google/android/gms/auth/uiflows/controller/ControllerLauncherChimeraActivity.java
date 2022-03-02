package com.google.android.gms.auth.uiflows.controller;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentActivity;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ControllerLauncherChimeraActivity extends FragmentActivity {
    private static final iwd a = ehv.a("Addaccount", "ControllerLauncherActivity");

    public static Intent a(Context context, Controller controller) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("controller", controller);
        return new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.controller.ControllerLauncherActivity").putExtra("wrapper_bundle", bundle);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("wrapper_bundle");
        if (bundleExtra == null) {
            a.f("WrapperBundle is null.", new Object[0]);
            finish();
            return;
        }
        Controller controller = (Controller) bundleExtra.getParcelable("controller");
        if (controller == null) {
            a.f("Controller is null.", new Object[0]);
            finish();
            return;
        }
        gnx.a((Activity) this, controller, controller.a((gny) null));
    }
}
