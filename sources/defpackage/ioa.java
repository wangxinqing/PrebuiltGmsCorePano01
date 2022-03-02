package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: ioa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ioa extends imt {
    public ioa() {
        super("DisableModulesFix", TimeUnit.MINUTES.toSeconds(5));
    }

    public final boolean a(inb inb) {
        return awyw.a.a().e();
    }

    public final inb b(inb inb) {
        Log.i("DisableModulesFix", "Updating Blacklisted Modules List");
        ilv a = ilv.a();
        try {
            if (a.c().isEmpty()) {
                Log.i("DisableModulesFix", "No listeners are registered.");
                ina d = inb.d();
                d.a(this, 3);
                return d.a();
            }
            long hashCode = (long) ilv.b().hashCode();
            Context context = inb.b;
            if (yfb.d) {
                SharedPreferences.Editor edit = yfb.b(context, "direct_boot:gms_chimera_phenotype_flags").edit();
                edit.putLong("__dd_sp_version_key", hashCode);
                edit.commit();
                SharedPreferences c = yfb.c(context, "direct_boot:gms_chimera_phenotype_flags");
                if (c != null) {
                    SharedPreferences.Editor edit2 = c.edit();
                    edit2.putLong("__dd_sp_version_key", hashCode);
                    edit2.commit();
                }
            } else {
                SharedPreferences.Editor edit3 = yfb.a(context, "direct_boot:gms_chimera_phenotype_flags").edit();
                edit3.putLong("__dd_sp_version_key", hashCode);
                edit3.commit();
            }
            Context context2 = inb.b;
            Intent intent = new Intent("com.google.android.gms.common.config.devicedoctor.UPDATED");
            intent.setPackage("com.google.android.gms");
            intent.putExtra("dd_shared_prefs_id_extra", hashCode);
            context2.sendBroadcast(intent);
            for (hew hew : a.c()) {
                hey.a().a(true, false, (Set) null, (Set) null, ilv.b());
            }
            a.close();
            ina d2 = inb.d();
            d2.a(this, 3);
            return d2.a();
        } finally {
            a.close();
        }
    }
}
