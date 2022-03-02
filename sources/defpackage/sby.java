package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: sby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sby {
    public static void a(Context context, afsb afsb) {
        boolean z;
        String str;
        Location location;
        Location location2;
        context.getSharedPreferences("gms_icing_mdd_phenotype_config", 0).edit().clear().commit();
        aucd o = pbp.c.o();
        if (kf.a(context, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            z = kf.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
        } else {
            z = true;
        }
        Location location3 = null;
        if (axsv.j() && z) {
            acwa f = ren.c(context).f();
            SharedPreferences sharedPreferences = context.getSharedPreferences("gms_icing_mdd_phenotype_registrar", 0);
            try {
                acws.a(f, axsv.a.a().q(), TimeUnit.SECONDS);
                location = (Location) f.d();
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                location = null;
            }
            if (location == null) {
                afsb.b(1037);
                sharedPreferences.edit().putBoolean("registered_with_location", false).apply();
            } else {
                afsb.b(1038);
                if (!sharedPreferences.getBoolean("registered_with_location", false)) {
                    afsb.b(1039);
                }
                sharedPreferences.edit().putBoolean("registered_with_location", true).apply();
                long a = aema.a(aema.a(location.getLatitude(), location.getLongitude()), (int) axsv.h());
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                pbp pbp = (pbp) o.b;
                pbp.a = 1 | pbp.a;
                pbp.b = a;
                if (axsv.c()) {
                    SharedPreferences sharedPreferences2 = context.getSharedPreferences("gms_icing_mdd_phenotype_registrar", 0);
                    String string = sharedPreferences2.getString("cached_location_lat", (String) null);
                    String string2 = sharedPreferences2.getString("cached_location_lon", (String) null);
                    if (string == null) {
                        location2 = null;
                    } else if (string2 != null) {
                        location2 = new Location(sharedPreferences2.getString("cached_location_provider", "null"));
                        location2.setLatitude(Double.parseDouble(string));
                        location2.setLongitude(Double.parseDouble(string2));
                    } else {
                        location2 = null;
                    }
                    if (!(location2 == null || a == aema.a(aema.a(location2.getLatitude(), location2.getLongitude()), (int) axsv.h()))) {
                        afsb.b(1040);
                    }
                }
            }
            if (axsv.c()) {
                location3 = location;
            }
            a(context, location3);
        } else {
            a(context, (Location) null);
            if (axsv.j() && !z) {
                afsb.b(1066);
            }
        }
        yey a2 = yef.a(context);
        if (!context.getPackageName().equals("com.google.android.gms")) {
            String valueOf = String.valueOf(context.getPackageName());
            str = valueOf.length() == 0 ? new String("com.google.android.gms.icing.mdd#") : "com.google.android.gms.icing.mdd#".concat(valueOf);
        } else {
            str = "com.google.android.gms.icing.mdd";
        }
        a2.a(str, ((pbp) o.i()).k());
    }

    private static void a(Context context, Location location) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("gms_icing_mdd_phenotype_registrar", 0);
        if (location == null) {
            sharedPreferences.edit().remove("cached_location_lat").remove("cached_location_lon").remove("cached_location_provider").apply();
        } else {
            sharedPreferences.edit().putString("cached_location_lat", String.valueOf(location.getLatitude())).putString("cached_location_lon", String.valueOf(location.getLongitude())).putString("cached_location_provider", location.getProvider()).apply();
        }
    }
}
