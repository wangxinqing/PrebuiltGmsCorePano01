package defpackage;

import android.app.NotificationChannelGroup;
import android.content.Context;
import com.google.android.gms.R;

/* renamed from: gqg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gqg {
    private static final iwd a = ehv.a("NotificationChannelUtil");

    private static void a(iwq iwq, Context context) {
        iwq.a(new NotificationChannelGroup("com.google.android.gms.auth.base.Notifications.AuthGroup", context.getString(R.string.auth_account_module_display_name)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(defpackage.iwq r8, android.content.Context r9, java.lang.String r10) {
        /*
            boolean r0 = a()
            if (r0 == 0) goto L_0x0092
            int r0 = r10.hashCode()
            r1 = 579461612(0x2289e1ec, float:3.737313E-18)
            r2 = 0
            r3 = 2
            r4 = 1
            java.lang.String r5 = "com.google.android.gms.auth.base.Notifications.AuthGroup.AccountRemoved"
            java.lang.String r6 = "com.google.android.gms.auth.base.Notifications.AuthGroup.AccountReauth"
            if (r0 == r1) goto L_0x0033
            r1 = 794346223(0x2f58c2ef, float:1.971434E-10)
            if (r0 == r1) goto L_0x002b
            r1 = 2139740008(0x7f89d768, float:NaN)
            if (r0 == r1) goto L_0x0021
            goto L_0x003b
        L_0x0021:
            java.lang.String r0 = "com.google.android.gms.auth.base.Notifications.AuthGroup.UncertifiedDevice"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x003b
            r0 = 2
            goto L_0x003c
        L_0x002b:
            boolean r0 = r10.equals(r5)
            if (r0 == 0) goto L_0x003b
            r0 = 0
            goto L_0x003c
        L_0x0033:
            boolean r0 = r10.equals(r6)
            if (r0 == 0) goto L_0x003b
            r0 = 1
            goto L_0x003c
        L_0x003b:
            r0 = -1
        L_0x003c:
            java.lang.String r1 = "com.google.android.gms.auth.base.Notifications.AuthGroup"
            r7 = 3
            if (r0 == 0) goto L_0x007d
            if (r0 == r4) goto L_0x0067
            if (r0 == r3) goto L_0x0063
            iwd r8 = a
            java.lang.String r9 = java.lang.String.valueOf(r10)
            java.lang.String r10 = "Attempt to initialize unknown notification channel "
            int r0 = r9.length()
            if (r0 != 0) goto L_0x0059
            java.lang.String r9 = new java.lang.String
            r9.<init>(r10)
            goto L_0x005d
        L_0x0059:
            java.lang.String r9 = r10.concat(r9)
        L_0x005d:
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r8.b(r9, r10)
            return
        L_0x0063:
            r8.b(r10)
            return
        L_0x0067:
            a(r8, r9)
            android.app.NotificationChannel r10 = new android.app.NotificationChannel
            r0 = 2131951659(0x7f13002b, float:1.9539739E38)
            java.lang.String r9 = r9.getString(r0)
            r10.<init>(r6, r9, r7)
            r10.setGroup(r1)
            r8.a((android.app.NotificationChannel) r10)
            return
        L_0x007d:
            a(r8, r9)
            android.app.NotificationChannel r10 = new android.app.NotificationChannel
            r0 = 2131951661(0x7f13002d, float:1.9539743E38)
            java.lang.String r9 = r9.getString(r0)
            r10.<init>(r5, r9, r7)
            r10.setGroup(r1)
            r8.a((android.app.NotificationChannel) r10)
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gqg.a(iwq, android.content.Context, java.lang.String):void");
    }

    public static boolean a() {
        return jkr.e() && ent.am();
    }
}
