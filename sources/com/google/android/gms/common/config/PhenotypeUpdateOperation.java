package com.google.android.gms.common.config;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import java.util.Collection;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PhenotypeUpdateOperation extends IntentOperation {
    private ilb a;

    private final void a(String str) {
        Intent intent = new Intent("com.google.android.gms.phenotype.COMMITTED");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", str);
        sendBroadcast(intent);
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            new String("Committed new configuration for ");
        } else {
            "Committed new configuration for ".concat(valueOf);
        }
    }

    public final void onCreate() {
        this.a = new ilb(this, yef.a((Context) this));
    }

    public final void onHandleIntent(Intent intent) {
        if (intent == null || (!"com.google.android.gms.phenotype.UPDATE".equals(intent.getAction()) && !"com.google.android.gms.phenotype.DAILY_CHECKIN".equals(intent.getAction()))) {
            Log.e("PhenotypeUpdateOp", "Invalid intent");
        } else if (axao.a.a().d()) {
            anax a2 = anax.a((Collection) axao.a.a().b().a);
            if ("com.google.android.gms.phenotype.DAILY_CHECKIN".equals(intent.getAction())) {
                for (nil nil : this.a.a()) {
                    int a3 = nik.a(nil.i);
                    if (a3 == 0 || a3 != 3) {
                        a(nil, a2);
                    }
                }
                return;
            }
            String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
            if (stringExtra == null) {
                Log.e("PhenotypeUpdateOp", "Invalid Intent: missing EXTRA_PACKAGE_NAME.");
            } else if (this.a.a(stringExtra)) {
                nil b = this.a.b(stringExtra);
                if (b == null) {
                    Log.e("PhenotypeUpdateOp", String.format("No RegistrationInfo found for package '%s'", new Object[]{stringExtra}));
                    return;
                }
                a(b, a2);
            }
        } else if ("com.google.android.gms.phenotype.DAILY_CHECKIN".equals(intent.getAction())) {
            for (nil nil2 : this.a.a()) {
                a(nil2.b);
            }
        } else {
            String stringExtra2 = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
            if (stringExtra2 == null) {
                Log.e("PhenotypeUpdateOp", "Invalid Intent: missing package_name extra.");
                return;
            }
            if (stringExtra2.length() == 0) {
                new String("Receive new configuration for ");
            } else {
                "Receive new configuration for ".concat(stringExtra2);
            }
            if (this.a.a(stringExtra2)) {
                a(stringExtra2);
            }
        }
    }

    private final void a(nil nil, Set set) {
        int a2 = nik.a(nil.i);
        if (a2 == 0 || a2 != 3) {
            int a3 = nik.a(nil.i);
            if (a3 == 0 || a3 == 1 || set.contains(nil.b)) {
                a(nil.b);
                return;
            }
            Intent intent = new Intent(jkq.a(nil.b));
            intent.setComponent(new ComponentName(this, "com.google.android.gms.chimera.GmsIntentOperationService$PersistentInternalReceiver"));
            intent.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", nil.b);
            sendBroadcast(intent);
        }
    }
}
