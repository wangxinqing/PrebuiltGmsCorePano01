package com.google.android.gms.chimera.container;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContainerInitIntentOperation extends hec {
    private final void a() {
        int d = jlo.d();
        int d2 = jhg.d((Context) this);
        if (d != d2) {
            SharedPreferences.Editor edit = jlo.f().edit();
            edit.putInt("version_code", d2);
            edit.putInt("prev_version_code", d);
            edit.apply();
        }
        String e = jlo.e();
        String c = jlo.c();
        if (!e.equals(c)) {
            SharedPreferences.Editor edit2 = jlo.f().edit();
            edit2.putString("version_code_and_timestamp", c);
            edit2.apply();
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        if (aekv.a()) {
            a();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent, boolean z) {
        a();
        if (aekv.a() && aekv.b(this)) {
            yfb.d(this, "direct_boot:gms_chimera_phenotype_flags");
            yfb.d(this, "direct_boot:gms_chimera_phenotype_flags");
        }
        Intent intent2 = new Intent("com.google.android.gms.chimera.container.CONTAINER_UPDATED");
        intent2.setPackage(getPackageName());
        startService(intent2);
    }
}
