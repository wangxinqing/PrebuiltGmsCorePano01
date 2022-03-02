package defpackage;

import android.accounts.Account;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.provider.Settings;
import java.util.List;

/* renamed from: ijk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ijk {
    static final Intent a;
    private static final iwd b = ehv.a("CommonAuth", "ManagedAccountUtil");

    static {
        Intent intent = new Intent("com.google.android.gms.auth.account.HANDLE_MANAGED");
        a = intent;
        intent.setPackage("com.google.android.gms");
    }

    public static Intent a(Context context, Account account) {
        iva.a((Object) context, (Object) "Context cannot be null");
        iva.a((Object) account, (Object) "Account cannot be null");
        Intent a2 = a(context, "com.google.android.gms.auth.removeaccount.DM_PRE_REMOVE_ACCOUNT");
        if (a2 != null) {
            a2.putExtra("account", account);
        }
        return a2;
    }

    @Deprecated
    public static boolean b(Context context, Account account) {
        return jgu.e(context, account.name);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent a(android.content.Context r14, android.accounts.Account r15, boolean r16, boolean r17, android.os.Bundle r18, boolean r19, java.lang.String r20, boolean r21, java.lang.String r22, boolean r23, int r24, android.os.Bundle r25) {
        /*
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r23
            r6 = r25
            java.lang.String r0 = "Context cannot be null"
            r7 = r14
            defpackage.iva.a((java.lang.Object) r14, (java.lang.Object) r0)
            java.lang.String r0 = "Account cannot be null"
            defpackage.iva.a((java.lang.Object) r15, (java.lang.Object) r0)
            java.lang.String r0 = "UiParameters cannot be null"
            defpackage.iva.a((java.lang.Object) r4, (java.lang.Object) r0)
            java.lang.String r0 = "Options cannot be null"
            defpackage.iva.a((java.lang.Object) r6, (java.lang.Object) r0)
            android.content.pm.PackageManager r0 = r14.getPackageManager()
            android.content.Intent r8 = a
            r9 = 128(0x80, float:1.794E-43)
            java.util.List r8 = r0.queryIntentActivities(r8, r9)
            if (r5 == 0) goto L_0x00a9
            awjm r0 = defpackage.awjm.a
            awjn r0 = r0.a()
            boolean r0 = r0.h()
            r9 = 0
            if (r0 != 0) goto L_0x0045
            iwd r0 = b
            java.lang.Object[] r7 = new java.lang.Object[r9]
            java.lang.String r9 = "Kids MDM flow:true"
            r0.c(r9, r7)
            goto L_0x00aa
        L_0x0045:
            android.content.pm.PackageManager r0 = r14.getPackageManager()     // Catch:{ NameNotFoundException -> 0x009e }
            java.lang.String r7 = "com.android.vending"
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r7, r9)     // Catch:{ NameNotFoundException -> 0x009e }
            long r10 = defpackage.kt.a(r0)
            awjm r0 = defpackage.awjm.a
            awjn r0 = r0.a()
            long r12 = r0.i()
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0079
            iwd r0 = b
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r7[r9] = r10
            r9 = 1
            java.lang.Long r10 = java.lang.Long.valueOf(r12)
            r7[r9] = r10
            java.lang.String r9 = "Kids MDM flow:PlayStore:%s < %s"
            r0.c(r9, r7)
            goto L_0x00aa
        L_0x0079:
            if (r2 != 0) goto L_0x007c
            goto L_0x0092
        L_0x007c:
            awjm r0 = defpackage.awjm.a
            awjn r0 = r0.a()
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x0092
            iwd r0 = b
            java.lang.Object[] r7 = new java.lang.Object[r9]
            java.lang.String r9 = "Kids MDM flow:during SUW"
            r0.c(r9, r7)
            goto L_0x00aa
        L_0x0092:
            iwd r0 = b
            java.lang.Object[] r7 = new java.lang.Object[r9]
            java.lang.String r9 = "Kids MDM flow:false"
            r0.c(r9, r7)
            java.lang.String r0 = "kids"
            goto L_0x00ac
        L_0x009e:
            r0 = move-exception
            iwd r0 = b
            java.lang.Object[] r7 = new java.lang.Object[r9]
            java.lang.String r9 = "Kids MDM flow:missing PlayStore"
            r0.c(r9, r7)
            goto L_0x00aa
        L_0x00a9:
        L_0x00aa:
            java.lang.String r0 = "all"
        L_0x00ac:
            java.util.Iterator r7 = r8.iterator()
        L_0x00b0:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0168
            java.lang.Object r8 = r7.next()
            android.content.pm.ResolveInfo r8 = (android.content.pm.ResolveInfo) r8
            android.content.pm.ActivityInfo r9 = r8.activityInfo
            if (r9 == 0) goto L_0x015c
            android.content.pm.ActivityInfo r9 = r8.activityInfo
            android.os.Bundle r9 = r9.metaData
            if (r9 == 0) goto L_0x0150
            android.content.pm.ActivityInfo r9 = r8.activityInfo
            android.os.Bundle r9 = r9.metaData
            java.lang.String r10 = "handle.managed.account.category"
            java.lang.String r9 = r9.getString(r10)
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L_0x0144
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.ComponentName r7 = new android.content.ComponentName
            android.content.pm.ActivityInfo r8 = r8.activityInfo
            java.lang.String r8 = r8.name
            java.lang.String r9 = "com.google.android.gms"
            r7.<init>(r9, r8)
            r0.setComponent(r7)
            java.lang.String r7 = "account"
            android.content.Intent r1 = r0.putExtra(r7, r15)
            java.lang.String r7 = "is_setup_wizard"
            android.content.Intent r1 = r1.putExtra(r7, r2)
            java.lang.String r2 = "use_immersive_mode"
            android.content.Intent r1 = r1.putExtra(r2, r3)
            java.lang.String r2 = "ui_parameters"
            android.content.Intent r1 = r1.putExtra(r2, r4)
            java.lang.String r2 = "suppress_account_provisioning"
            r8 = r19
            android.content.Intent r1 = r1.putExtra(r2, r8)
            java.lang.String r2 = "calling_package"
            r9 = r20
            android.content.Intent r1 = r1.putExtra(r2, r9)
            java.lang.String r2 = "is_user_owner"
            r10 = r21
            android.content.Intent r1 = r1.putExtra(r2, r10)
            java.lang.String r2 = "dm_status"
            r11 = r22
            android.content.Intent r1 = r1.putExtra(r2, r11)
            java.lang.String r2 = "is_unicorn_account"
            android.content.Intent r1 = r1.putExtra(r2, r5)
            java.lang.String r2 = "flow"
            r12 = r24
            android.content.Intent r1 = r1.putExtra(r2, r12)
            java.lang.String r2 = "options"
            r1.putExtra(r2, r6)
            java.lang.String r1 = "theme"
            java.lang.String r2 = r4.getString(r1)
            android.content.Intent r1 = r0.putExtra(r1, r2)
            java.lang.String r2 = "useImmersiveMode"
            r1.putExtra(r2, r3)
            return r0
        L_0x0144:
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r24
            goto L_0x00b0
        L_0x0150:
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r24
            goto L_0x00b0
        L_0x015c:
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r24
            goto L_0x00b0
        L_0x0168:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ijk.a(android.content.Context, android.accounts.Account, boolean, boolean, android.os.Bundle, boolean, java.lang.String, boolean, java.lang.String, boolean, int, android.os.Bundle):android.content.Intent");
    }

    private static Intent a(Context context, String str) {
        if (!jkr.a()) {
            b.c("Pre LMR1. No pre hook support.", new Object[0]);
            return null;
        }
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
        ComponentName profileOwner = devicePolicyManager.getProfileOwner() != null ? devicePolicyManager.getProfileOwner() : null;
        if (profileOwner == null && jkr.e()) {
            profileOwner = devicePolicyManager.getDeviceOwnerComponentOnAnyUser();
        }
        if (profileOwner != null) {
            Intent intent = new Intent(str);
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
            if (queryIntentActivities.isEmpty()) {
                b.c("No activities matched action %s", str);
                return null;
            }
            for (ResolveInfo next : queryIntentActivities) {
                if (!(next.activityInfo == null || next.activityInfo.metaData == null)) {
                    if (profileOwner.flattenToString().equals(next.activityInfo.metaData.getString("dm_component"))) {
                        intent.setComponent(new ComponentName("com.google.android.gms", next.activityInfo.name));
                        return intent;
                    }
                }
            }
            b.d("No activities matched metadata %s for DO/PO %s", "dm_component", profileOwner.flattenToString());
            return null;
        }
        b.c("No DO or PO.", new Object[0]);
        return null;
    }

    public static Intent a(Context context, boolean z, boolean z2, Bundle bundle, Bundle bundle2) {
        iva.a((Object) context, (Object) "Context cannot be null");
        iva.a((Object) bundle, (Object) "UiParameters cannot be null");
        Intent a2 = a(context, "com.google.android.gms.auth.addaccount.DM_PRE_ADD_ACCOUNT");
        if (a2 != null) {
            a2.putExtra("is_setup_wizard", z2).putExtra("use_immersive_mode", z).putExtra("ui_parameters", bundle).putExtra("options", bundle2);
        }
        return a2;
    }

    public static boolean a(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "device_provisioned", 0) != 0;
    }

    public static boolean a(Intent intent) {
        return intent != null && intent.getBooleanExtra("is_unicorn_account", false);
    }

    public static boolean a(String str) {
        return str != null && !gei.DM_SCREENLOCK_REQUIRED.b(str);
    }
}
