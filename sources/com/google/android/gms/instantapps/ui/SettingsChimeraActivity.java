package com.google.android.gms.instantapps.ui;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SettingsChimeraActivity extends bjs {
    private static final qfn a = new qfn("SettingsActivity");

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            startActivity(new Intent().setComponent(new ComponentName(axuy.g(), axuy.f())));
        } catch (ActivityNotFoundException e) {
            a.a(e);
        }
        finish();
    }
}
