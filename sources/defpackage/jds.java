package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.util.Arrays;
import java.util.List;

/* renamed from: jds  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jds {
    public static final jds a = new jds();
    private static Boolean b;

    public static final void a(Context context, String str, int i, String str2, String str3, int i2, List list) {
        a(context, str, i, str2, str3, (String) null, i2, list, 0);
    }

    public static final void a(Context context, String str, int i, String str2, String str3, String str4, int i2, List list, long j) {
        int i3 = i;
        if (!a()) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            String valueOf = String.valueOf(str);
            Log.e("WakeLockTracker", valueOf.length() == 0 ? new String("missing wakeLock key. ") : "missing wakeLock key. ".concat(valueOf));
        } else if (i3 == 7 || i3 == 8 || i3 == 10 || i3 == 11) {
            a(new WakeLockEvent(System.currentTimeMillis(), i, str2, i2, jdl.a(list), str, SystemClock.elapsedRealtime(), jiy.a(context), str3, jdl.a(context.getPackageName()), jiy.e(context), j, str4, false));
        }
    }

    public static void a(WakeLockEvent wakeLockEvent) {
        jdc.a.a(wakeLockEvent);
    }

    public static boolean a() {
        if (b == null) {
            jdb jdb = jdc.a;
            boolean z = true;
            if (jdb != null) {
                int a2 = jdb.a(1);
                ComponentName componentName = jcl.a;
                if (a2 == 0) {
                    z = false;
                }
            } else {
                z = false;
            }
            b = Boolean.valueOf(z);
        }
        return b.booleanValue();
    }

    public final void a(Context context, Intent intent) {
        a(context, intent.getStringExtra("WAKE_LOCK_KEY"), 8, (String) null, (String) null, 0, (List) null);
    }

    public final void a(Context context, Intent intent, String str, String str2, String str3) {
        Context context2 = context;
        a(context2, intent.getStringExtra("WAKE_LOCK_KEY"), 7, str, str2, 1, Arrays.asList(new String[]{str3}));
    }
}
