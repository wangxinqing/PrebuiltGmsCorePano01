package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

/* renamed from: luj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class luj {
    static final ComponentName a(Context context, String str) {
        for (ResolveInfo next : context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.MAIN").addCategory("com.google.android.gms.car.drivingMode.category.DEFAULT"), 0)) {
            if (next.activityInfo != null) {
                ActivityInfo activityInfo = next.activityInfo;
                if (str.equals(activityInfo.packageName)) {
                    return new ComponentName(str, activityInfo.name);
                }
            }
        }
        return null;
    }

    static final Intent b(String str) {
        return new Intent("android.intent.action.APPLICATION_PREFERENCES").setPackage(str);
    }

    public static luj e(Context context) {
        luj lta = new lta();
        if (!lta.d(context)) {
            lta = new ltr();
            if (!lta.d(context)) {
                return !awqj.b() ? new lwv() : new lxe();
            }
        }
        return lta;
    }

    public abstract CharSequence a(Context context);

    public abstract String a();

    public abstract ComponentName b(Context context);

    public abstract Intent b();

    public abstract int c();

    public abstract boolean c(Context context);

    public abstract boolean d(Context context);

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.luj a(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -1740589862: goto L_0x0029;
                case -959566904: goto L_0x001f;
                case 771689716: goto L_0x0015;
                case 1255183367: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0033
        L_0x000b:
            java.lang.String r0 = "com.google.android.projection.gearhead"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 2
            goto L_0x0034
        L_0x0015:
            java.lang.String r0 = "car_pref_key_driving_mode_behavior_morris_preference"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 3
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "car_pref_key_driving_mode_behavior_none_preference"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0029:
            java.lang.String r0 = "car_pref_key_driving_mode_behavior_dnd_preference"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 0
            goto L_0x0034
        L_0x0033:
            r0 = -1
        L_0x0034:
            if (r0 == 0) goto L_0x0054
            if (r0 == r3) goto L_0x004e
            if (r0 == r2) goto L_0x0048
            if (r0 == r1) goto L_0x0042
            ltt r0 = new ltt
            r0.<init>(r4)
            return r0
        L_0x0042:
            lxe r4 = new lxe
            r4.<init>()
            return r4
        L_0x0048:
            lta r4 = new lta
            r4.<init>()
            return r4
        L_0x004e:
            lwv r4 = new lwv
            r4.<init>()
            return r4
        L_0x0054:
            ltr r4 = new ltr
            r4.<init>()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.luj.a(java.lang.String):luj");
    }
}
