package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.people.phenotype.RegisterPhenotypeOperation;

/* renamed from: xfr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class xfr extends IntentOperation {
    /* access modifiers changed from: protected */
    public abstract SharedPreferences a();

    /* access modifiers changed from: protected */
    public abstract String b();

    /* access modifiers changed from: protected */
    public boolean c() {
        return false;
    }

    public final void onDestroy() {
    }

    public final void onHandleIntent(Intent intent) {
        Intent startIntent;
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (b().equals(stringExtra)) {
            new xfq(yef.a((Context) this), a(), b()).a("");
            Intent intent2 = new Intent("com.google.android.gms.phenotype.COMMITTED");
            intent2.setPackage("com.google.android.gms");
            intent2.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", stringExtra);
            sendBroadcast(intent2);
            if (c()) {
                xip.a();
                int intValue = Integer.valueOf((int) aywy.a.a().Y()).intValue();
                if (intValue != xiq.a(this) && (startIntent = IntentOperation.getStartIntent((Context) this, RegisterPhenotypeOperation.class, "com.google.android.gms.people.phenotype.PHENOTYPE_REGISTER_ACTION")) != null) {
                    startIntent.putExtra("mendel_package_name", "com.google.android.gms.people").putExtra("first_sdk_extra", intValue);
                    startService(startIntent);
                }
            }
        }
    }
}
