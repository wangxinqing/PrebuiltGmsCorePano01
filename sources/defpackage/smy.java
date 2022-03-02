package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;

/* renamed from: smy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class smy extends IntentOperation {
    public static Intent a(Context context, boolean z, avup avup) {
        return a(context, z, avup, avup.UNKNOWN, snb.b(context), snh.a(context));
    }

    public static Intent a(Context context, boolean z, avup avup, avup avup2, boolean z2, boolean z3) {
        boolean z4;
        Context context2 = context;
        boolean z5 = z2;
        boolean z6 = z3;
        int intValue = ((Integer) smo.a.a()).intValue();
        String str = (String) smo.b.a();
        Boolean bool = (Boolean) smo.c.a();
        Boolean bool2 = (Boolean) smo.d.a();
        String a = nsi.a(context);
        int intValue2 = ((Integer) smo.j.a()).intValue();
        jbs jbs = new jbs(context2);
        Intent startIntent = IntentOperation.getStartIntent(context2, "com.google.android.gms.mdm.services.SitrepChimeraService", "com.google.android.gms.mdm.services.SITREP");
        if (intValue2 >= 200) {
            snn.a("Exceeded maximum sitrep attempts; not trying again.", new Object[0]);
            smq.a(context2, jbs);
            return null;
        } else if (jgu.d(context2, context.getPackageName()).isEmpty()) {
            snn.a("No Google accounts; deferring server state update.", new Object[0]);
            return null;
        } else {
            if (startIntent == null) {
                startIntent = IntentOperation.getStartIntent(context2, "com.google.android.gms.mdm.services.SitrepChimeraService", "com.google.android.gms.mdm.services.SITREP");
            }
            if (startIntent == null) {
                return null;
            }
            startIntent.putExtra("reason", avup.o);
            startIntent.putExtra("retry_reason", avup2.o);
            int d = jhg.d(context);
            startIntent.putExtra("gms_core_version", d);
            boolean z7 = true;
            if (!z && d == intValue) {
                z4 = z;
            } else {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Sitrep forced or new GMS core version: ");
                sb.append(d);
                sb.toString();
                int i = crc.a;
                z4 = true;
            }
            if (z || !TextUtils.equals(str, a)) {
                String valueOf = String.valueOf(a);
                if (valueOf.length() != 0) {
                    "Sitrep forced or new GCM ID ".concat(valueOf);
                } else {
                    new String("Sitrep forced or new GCM ID ");
                }
                int i2 = crc.a;
                startIntent.putExtra("gcm_registration_id", a);
                z4 = true;
            }
            if (!z && bool != null && bool.booleanValue() == z5) {
                z7 = z4;
            } else {
                StringBuilder sb2 = new StringBuilder(38);
                sb2.append("Sitrep forced or new admin state ");
                sb2.append(z5);
                sb2.toString();
                int i3 = crc.a;
                startIntent.putExtra("is_device_admin", z5);
            }
            if (z || bool2 == null || bool2.booleanValue() != z6) {
                StringBuilder sb3 = new StringBuilder(48);
                sb3.append("ADM: Sitrep forced or new lockscreen state ");
                sb3.append(z6);
                sb3.toString();
                int i4 = crc.a;
                startIntent.putExtra("lockscreen_enabled", z6);
            } else if (!z7) {
                return null;
            }
            return startIntent;
        }
    }

    public static void a() {
        smo.j.b();
        smo.a.b();
        smo.b.b();
        smo.c.b();
        smo.d.b();
    }
}
