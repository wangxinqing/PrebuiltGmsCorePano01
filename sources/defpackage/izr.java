package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity;

/* renamed from: izr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class izr {
    public static void a(Context context, izq izq) {
        Intent e = izq.e();
        if (!context.getPackageManager().queryIntentServices(e, 0).isEmpty()) {
            context.startService(e);
        } else if (Log.isLoggable("PlusAnalytics", 5)) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Unable to log plus action: ");
            sb.append(valueOf);
            Log.w("PlusAnalytics", sb.toString());
        }
    }

    public static void a(Context context, String str, FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2, FavaDiagnosticsEntity favaDiagnosticsEntity3, String str2) {
        if (context.getPackageName() == null) {
            Log.e("PlusAnalytics", "Package name for the given context is null. Unable to log given action.");
            return;
        }
        izq izq = new izq(context);
        izq.a(str);
        izq.a(favaDiagnosticsEntity);
        izq.c(favaDiagnosticsEntity2);
        izq.c((String) null);
        izq.b(str2);
        a(context, izq);
        izq izq2 = new izq(context);
        izq2.a(str);
        izq2.c(favaDiagnosticsEntity2);
        izq2.b(favaDiagnosticsEntity3);
        izq2.b(str2);
        a(context, izq2);
    }

    public static void a(Context context, String str, FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2, String str2) {
        if (context == null || context.getPackageName() == null) {
            Log.e("PlusAnalytics", "Package name for the given context is null. Unable to log given action.");
            return;
        }
        izq izq = new izq(context);
        izq.a(str);
        izq.c(favaDiagnosticsEntity);
        izq.b(favaDiagnosticsEntity2);
        izq.b(str2);
        a(context, izq);
    }

    public static void a(Context context, String str, String str2, FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2, String str3) {
        a(context, str, str2, favaDiagnosticsEntity, favaDiagnosticsEntity2, str3, (ClientActionDataEntity) null);
    }

    public static void a(Context context, String str, String str2, FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2, String str3, ClientActionDataEntity clientActionDataEntity) {
        if (context == null || context.getPackageName() == null) {
            Log.e("PlusAnalytics", "Package name for the given context is null. Unable to log given action.");
            return;
        }
        izq izq = new izq(context);
        izq.a(str);
        izq.a(favaDiagnosticsEntity);
        izq.c(favaDiagnosticsEntity2);
        izq.c(str2);
        izq.b(str3);
        if (clientActionDataEntity != null) {
            izq.a(clientActionDataEntity);
        }
        a(context, izq);
    }
}
