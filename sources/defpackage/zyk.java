package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Patterns;
import com.google.android.gms.R;
import java.util.Calendar;

/* renamed from: zyk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zyk {
    public static String a(Context context, long j) {
        String c = c(context, j);
        return context.getResources().getString(R.string.romanesco_last_backup_date, new Object[]{c});
    }

    public static SharedPreferences b(Context context) {
        return context.getApplicationContext().getSharedPreferences("people_ui_contacts_backup_and_restore_settings", 0);
    }

    public static String c(Context context, long j) {
        Calendar instance = Calendar.getInstance();
        int i = instance.get(1);
        instance.setTimeInMillis(j);
        if (instance.get(1) == i) {
            return DateUtils.formatDateTime(context, j, 65560);
        }
        return DateUtils.formatDateTime(context, j, 65556);
    }

    public static String a(zyi zyi) {
        return zyi.a() ? Long.toString(zyi.b.longValue()) : zyi.a;
    }

    public static String b(Context context, long j) {
        String c = c(context, j);
        return context.getResources().getString(R.string.romanesco_last_restore_date, new Object[]{c});
    }

    public static boolean a(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() != null;
    }

    public static boolean a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            return zrr.b(context).contains(str);
        }
        return false;
    }

    public static boolean a(String str) {
        return !TextUtils.isEmpty(str) && Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }
}
