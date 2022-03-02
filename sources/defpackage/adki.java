package defpackage;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: adki  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adki {
    public static final Long a = 3L;
    public static final Long b = 4L;
    public static final Long c = 6L;
    public static final Long d = 2L;
    public static final adjz e = f.a("urgency", (Long) 2L, ayoz.aa);
    private static final adjy f = new adjy("config.flag.");

    private static boolean a(Context context) {
        if (((Long) e.a()).longValue() != a.longValue() || TextUtils.isEmpty((CharSequence) adke.g.a())) {
            return false;
        }
        adjw.h(context);
        adjw.j(context);
        adjw.i(context);
        return false;
    }

    private static boolean a(SystemUpdateStatus systemUpdateStatus) {
        return systemUpdateStatus.o == 0;
    }

    public static boolean b(Context context, SystemUpdateStatus systemUpdateStatus) {
        if (adjw.a()) {
            if (!jkr.g()) {
                return true;
            }
            if (Settings.Global.getInt(context.getContentResolver(), "ota_disable_automatic_update", 0) != 0) {
                return false;
            }
            if (!ayox.a.a().y() || ((Long) e.a()).longValue() == b.longValue() || systemUpdateStatus.h.c) {
                return true;
            }
            return false;
        } else if (!jkr.c()) {
            return false;
        } else {
            adjw.j(context);
            return ayox.a.a().z();
        }
    }

    public static boolean a(Context context, SystemUpdateStatus systemUpdateStatus) {
        if (adkf.a(context, systemUpdateStatus.n).a == 0) {
            if (((Long) e.a()).longValue() == a.longValue()) {
                int i = Build.VERSION.SDK_INT;
                if (jkr.g() || Settings.Global.getInt(context.getContentResolver(), "ota_disable_automatic_update", 0) == 0) {
                    return false;
                }
                return true;
            } else if (((Long) e.a()).longValue() == d.longValue()) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Context context, SystemUpdateStatus systemUpdateStatus, boolean z) {
        if (adkf.a(context, systemUpdateStatus.n).a == 0 && b(context, systemUpdateStatus)) {
            if (a(systemUpdateStatus)) {
                a(context);
            }
            if (adjw.a()) {
                if (((Long) e.a()).longValue() == d.longValue() || ((Long) e.a()).longValue() == a.longValue() || aypj.a.a().a()) {
                    return true;
                }
                return false;
            } else if (!z || !ayox.a.a().a() || ((Long) e.a()).longValue() != a.longValue()) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean b(Context context, SystemUpdateStatus systemUpdateStatus, boolean z) {
        if (adkf.a(context, systemUpdateStatus.n).a == 0) {
            if (a(systemUpdateStatus)) {
                a(context);
            }
            if (!a(context, systemUpdateStatus, z)) {
                if (((Long) e.a()).longValue() == d.longValue() || ((Long) e.a()).longValue() == a.longValue()) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
