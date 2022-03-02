package com.google.android.gms.app.service;

import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CoreGoogleSettingsIntentOperation extends hea {
    private boolean a;

    private static final void a(amzt amzt, GoogleSettingsItem googleSettingsItem) {
        if (googleSettingsItem != null) {
            amzt.c(googleSettingsItem);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List a() {
        /*
            r9 = this;
            java.lang.String r0 = "com.google.android.play.games"
            amzt r1 = defpackage.amzy.j()
            defpackage.quj.a()
            boolean r2 = defpackage.quj.b(r9)
            r9.a = r2
            boolean r2 = defpackage.jgu.e(r9)
            r3 = 1
            r4 = 4
            r5 = 0
            if (r2 != 0) goto L_0x003d
            boolean r2 = r9.a
            if (r2 == 0) goto L_0x003d
            defpackage.jix.g(r9)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r6 = "com.google.android.gms.plus.action.MANAGE_APPS"
            r2.<init>(r6)
            java.lang.String r6 = r9.getPackageName()
            r2.setPackage(r6)
            java.lang.String r6 = "com.google.android.gms.extras.ALL_APPS"
            r2.putExtra(r6, r3)
            com.google.android.gms.chimera.GoogleSettingsItem r6 = new com.google.android.gms.chimera.GoogleSettingsItem
            r7 = 2131952152(0x7f130218, float:1.9540739E38)
            r8 = 14
            r6.<init>((android.content.Intent) r2, (int) r4, (int) r7, (int) r8)
            goto L_0x003e
        L_0x003d:
            r6 = r5
        L_0x003e:
            a(r1, r6)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r6 = "com.google.android.apps.plus.PRIVACY_SETTINGS"
            r2.<init>(r6)
            android.accounts.Account r6 = new android.accounts.Account
            java.lang.String r7 = "fake"
            java.lang.String r8 = "com.google"
            r6.<init>(r7, r8)
            java.lang.String r7 = "account"
            r2.putExtra(r7, r6)
            com.google.android.gms.chimera.GoogleSettingsItem r6 = new com.google.android.gms.chimera.GoogleSettingsItem
            r7 = 2131952295(0x7f1302a7, float:1.9541029E38)
            r8 = 49
            r6.<init>((android.content.Intent) r2, (int) r3, (int) r7, (int) r8)
            a(r1, r6)
            boolean r2 = r9.a
            r3 = 0
            if (r2 == 0) goto L_0x0092
            android.content.pm.PackageManager r2 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0091 }
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r0, r3)     // Catch:{ NameNotFoundException -> 0x0091 }
            int r2 = r2.versionCode     // Catch:{ NameNotFoundException -> 0x0091 }
            r6 = 30000000(0x1c9c380, float:7.411627E-38)
            if (r2 < r6) goto L_0x0092
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r6 = "com.google.android.gms.games.SHOW_GOOGLE_SETTINGS"
            r2.<init>(r6)
            java.lang.String r6 = "android.intent.category.DEFAULT"
            r2.addCategory(r6)
            r2.setPackage(r0)
            com.google.android.gms.chimera.GoogleSettingsItem r0 = new com.google.android.gms.chimera.GoogleSettingsItem
            r6 = 2131952181(0x7f130235, float:1.9540797E38)
            r7 = 27
            r0.<init>((android.content.Intent) r2, (int) r4, (int) r6, (int) r7)
            goto L_0x0093
        L_0x0091:
            r0 = move-exception
        L_0x0092:
            r0 = r5
        L_0x0093:
            a(r1, r0)
            boolean r0 = r9.a
            if (r0 == 0) goto L_0x00ab
            com.google.android.gms.chimera.GoogleSettingsItem r0 = new com.google.android.gms.chimera.GoogleSettingsItem
            java.lang.String r2 = "com.google.android.gms.fitness.settings.GOOGLE_FITNESS_SETTINGS"
            android.content.Intent r2 = r9.a(r2)
            r6 = 2131952178(0x7f130232, float:1.9540791E38)
            r7 = 26
            r0.<init>((android.content.Intent) r2, (int) r4, (int) r6, (int) r7)
            goto L_0x00ac
        L_0x00ab:
            r0 = r5
        L_0x00ac:
            a(r1, r0)
            com.google.android.gms.chimera.GoogleSettingsItem r0 = new com.google.android.gms.chimera.GoogleSettingsItem
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r6 = "com.google.android.apps.maps.LOCATION_SETTINGS"
            r2.<init>(r6)
            r6 = 2131952243(0x7f130273, float:1.9540923E38)
            r7 = 36
            r0.<init>((android.content.Intent) r2, (int) r3, (int) r6, (int) r7)
            a(r1, r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "com.google.android.googlequicksearchbox.action.PRIVACY_SETTINGS"
            r0.<init>(r2)
            defpackage.jix.g(r9)
            com.google.android.gms.chimera.GoogleSettingsItem r2 = new com.google.android.gms.chimera.GoogleSettingsItem
            r6 = 2131952306(0x7f1302b2, float:1.9541051E38)
            r7 = 52
            r2.<init>((android.content.Intent) r0, (int) r4, (int) r6, (int) r7)
            a(r1, r2)
            com.google.android.gms.chimera.GoogleSettingsItem r0 = new com.google.android.gms.chimera.GoogleSettingsItem
            java.lang.String r2 = "com.google.android.gms.settings.ADS_PRIVACY"
            android.content.Intent r2 = r9.a(r2)
            r4 = 2131952116(0x7f1301f4, float:1.9540666E38)
            r6 = 3
            r0.<init>((android.content.Intent) r2, (int) r3, (int) r4, (int) r6)
            a(r1, r0)
            ikz r0 = defpackage.iks.s
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0118
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "com.google.android.apps.gcs.action.NETWORKING_SETTINGS"
            r0.<init>(r2)
            ikz r2 = defpackage.iks.t
            java.lang.Object r2 = r2.c()
            java.lang.String r2 = (java.lang.String) r2
            r0.setPackage(r2)
            com.google.android.gms.chimera.GoogleSettingsItem r2 = new com.google.android.gms.chimera.GoogleSettingsItem
            r3 = 5
            r4 = 2131952262(0x7f130286, float:1.9540962E38)
            r6 = 44
            r2.<init>((android.content.Intent) r0, (int) r3, (int) r4, (int) r6)
            goto L_0x0119
        L_0x0118:
            r2 = r5
        L_0x0119:
            a(r1, r2)
            defpackage.awzr.b()
            a(r1, r5)
            amzy r0 = r1.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.app.service.CoreGoogleSettingsIntentOperation.a():java.util.List");
    }
}
