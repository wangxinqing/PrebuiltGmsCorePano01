package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.config.ModuleManager;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: ajld  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajld {
    public final ajmm a;
    public final ajkr b;
    public final ajkj c;
    private final Context d;
    private final ajmj e;

    private ajld(Context context, ajmm ajmm, ajkr ajkr, ajkj ajkj, ajmj ajmj) {
        this.d = context;
        this.a = ajmm;
        this.b = ajkr;
        this.c = ajkj;
        this.e = ajmj;
    }

    public static ajld a(Context context) {
        Integer num;
        Integer num2;
        Integer num3;
        Boolean bool;
        ajlf ajlf;
        ajnw.a(context);
        ajob.a(context);
        ajmm a2 = ajmm.a(context);
        int i = ajkr.o;
        ajnw.a(context);
        int a3 = jhh.a(context);
        Integer num4 = 0;
        try {
            ModuleManager.ModuleInfo currentModule = ModuleManager.get(context).getCurrentModule();
            num = Integer.valueOf(currentModule.moduleVersion);
            try {
                num2 = Integer.valueOf(currentModule.moduleApk.apkVersionCode);
            } catch (IllegalStateException e2) {
                num2 = num4;
            }
        } catch (IllegalStateException e3) {
            num2 = num4;
            num = num2;
        }
        ajkr ajkr = new ajkr(context, a3, num2.intValue(), num.intValue(), ajnw.b(context), aztb.K() ? Boolean.valueOf(ajnw.c(context)) : null);
        ajnw.a(context);
        int a4 = jhh.a(context);
        try {
            ModuleManager.ModuleInfo currentModule2 = ModuleManager.get(context).getCurrentModule();
            Integer valueOf = Integer.valueOf(currentModule2.moduleVersion);
            try {
                num3 = Integer.valueOf(currentModule2.moduleApk.apkVersionCode);
                num4 = valueOf;
            } catch (IllegalStateException e4) {
                num3 = num4;
                num4 = valueOf;
            }
        } catch (IllegalStateException e5) {
            num3 = num4;
        }
        if (aztb.K()) {
            bool = Boolean.valueOf(ajnw.c(context));
        } else {
            bool = null;
        }
        ajnw.b(context);
        if (ajkj.j == null) {
            izd izd = new izd(context, azsy.a.a().j(), (int) azsy.a.a().k(), context.getApplicationInfo().uid, 8704);
            if (azsy.a.a().c()) {
                String valueOf2 = String.valueOf(azsy.f());
                ajix.a("GCoreUlr", valueOf2.length() == 0 ? new String("Grpc compression enabled: ") : "Grpc compression enabled: ".concat(valueOf2));
                izd.d = azsy.f();
            }
            ajlf = new ajlf(izd);
        } else {
            ajlf = ajkj.j;
        }
        Context context2 = context;
        return new ajld(context2, a2, ajkr, new ajkj(context, ajlf, a4, num3.intValue(), num4.intValue(), bool), new ajmj(context2));
    }

    public static final boolean b(ajkh ajkh) {
        if (ajkh == null) {
            return false;
        }
        int i = ajkh.g;
        return i == 0 || (i == 3 && ajkh.h != 2);
    }

    public static final boolean a(ajkh ajkh, long j) {
        if (ajkh != null) {
            boolean z = ajkh.g == 2 && ajkh.f == 0;
            int i = ajkh.j;
            boolean z2 = i == 1 ? true : i == 2;
            Long l = ajkh.a;
            return z && z2 && (l != null && (l.longValue() > j ? 1 : (l.longValue() == j ? 0 : -1)) <= 0);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: ajld} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v21, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v32, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v33, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v103, resolved type: ajkj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v104, resolved type: ajld} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v99, resolved type: ajkh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v106, resolved type: ajkj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v100, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v40, resolved type: android.accounts.Account} */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v30 */
    /* JADX WARNING: type inference failed for: r4v107 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x03af A[Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d, all -> 0x03d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x03b4 A[Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d, all -> 0x03d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x03c7 A[Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d, all -> 0x03d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x03cc A[Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d, all -> 0x03d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0672 A[Catch:{ eif -> 0x03da }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0674 A[Catch:{ eif -> 0x03da }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0679 A[Catch:{ eif -> 0x03da }] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x067a A[Catch:{ eif -> 0x03da }] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0692 A[Catch:{ eif -> 0x03da }] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0697 A[Catch:{ eif -> 0x03da }] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x069c A[Catch:{ eif -> 0x03da }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x069d A[Catch:{ eif -> 0x03da }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x06b9 A[Catch:{ eif -> 0x03da }] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x06bb A[Catch:{ eif -> 0x03da }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x06c0 A[Catch:{ eif -> 0x03da }] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x06c1 A[Catch:{ eif -> 0x03da }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x06d5 A[Catch:{ eif -> 0x03da }] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0861 A[Catch:{ eif -> 0x0866 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0286 A[Catch:{ eif -> 0x039b, VolleyError -> 0x0399 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x02af A[Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d, all -> 0x03d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x02ba A[Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d, all -> 0x03d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x02c5 A[Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d, all -> 0x03d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x02d0 A[Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d, all -> 0x03d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x02db A[Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d, all -> 0x03d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x02dc A[Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d, all -> 0x03d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x02f9 A[Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d, all -> 0x03d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0304 A[Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d, all -> 0x03d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x030f A[Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d, all -> 0x03d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x031a A[Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d, all -> 0x03d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x031b A[Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d, all -> 0x03d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x034a A[Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d, all -> 0x03d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0355 A[Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d, all -> 0x03d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0360 A[Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d, all -> 0x03d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x036b A[Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d, all -> 0x03d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x036c A[Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d, all -> 0x03d0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ajkh a(android.accounts.Account r37, defpackage.ajkh r38, java.lang.String r39, java.lang.String r40) {
        /*
            r36 = this;
            r1 = r36
            r2 = r37
            r3 = r38
            ajmm r4 = r1.a
            int r4 = r4.b((android.accounts.Account) r2)
            java.lang.String r5 = r36.a((android.accounts.Account) r37)
            boolean r6 = defpackage.aztb.L()
            if (r6 == 0) goto L_0x008b
            java.lang.Boolean r6 = r3.d
            if (r6 == 0) goto L_0x001f
            java.lang.String r7 = r3.e
            if (r7 != 0) goto L_0x001f
            goto L_0x0027
        L_0x001f:
            java.lang.Boolean r7 = r3.b
            if (r7 == 0) goto L_0x008b
            java.lang.String r7 = r3.c
            if (r7 != 0) goto L_0x008b
        L_0x0027:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r8 = r3.e
            java.lang.Boolean r9 = r3.b
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r10 = r3.c
            java.lang.String r11 = java.lang.String.valueOf(r6)
            int r11 = r11.length()
            java.lang.String r12 = java.lang.String.valueOf(r8)
            int r12 = r12.length()
            java.lang.String r13 = java.lang.String.valueOf(r9)
            int r13 = r13.length()
            java.lang.String r14 = java.lang.String.valueOf(r10)
            int r14 = r14.length()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            int r11 = r11 + 78
            int r11 = r11 + r12
            int r11 = r11 + r13
            int r11 = r11 + r14
            r15.<init>(r11)
            java.lang.String r11 = "null source:  historyEnabled="
            r15.append(r11)
            r15.append(r6)
            java.lang.String r6 = " historySource="
            r15.append(r6)
            r15.append(r8)
            java.lang.String r6 = " reportingEnabled"
            r15.append(r6)
            r15.append(r9)
            java.lang.String r6 = " reportingSource="
            r15.append(r6)
            r15.append(r10)
            java.lang.String r6 = r15.toString()
            r7.<init>(r6)
            defpackage.ajjf.a(r7)
        L_0x008b:
            boolean r7 = defpackage.azsy.d()     // Catch:{ eif -> 0x0870 }
            java.lang.String r8 = " isLocationWifiScanEnabled:"
            java.lang.String r9 = " locationMode:"
            java.lang.String r10 = " isLocationBleScanEnabled:"
            java.lang.String r11 = " isUlrSupportedFormFactor:"
            java.lang.String r12 = " isRestrictedUserProfile:"
            java.lang.String r13 = " isAllowedToUseLocation:"
            java.lang.String r14 = " isLocationEnabled:"
            java.lang.String r15 = " isGeoSupported:"
            java.lang.String r6 = " batterySaverModeThreshold:"
            r16 = r5
            java.lang.String r5 = "android.hardware.bluetooth_le"
            r17 = r4
            java.lang.String r4 = "android.hardware.wifi"
            r19 = 0
            if (r7 != 0) goto L_0x03e1
            ajkr r7 = r1.b     // Catch:{ eif -> 0x03da }
            android.content.Context r2 = r7.i     // Catch:{ eif -> 0x03da }
            java.lang.String[] r20 = defpackage.ajnx.a     // Catch:{ eif -> 0x03da }
            android.content.pm.PackageManager r1 = r2.getPackageManager()     // Catch:{ eif -> 0x03da }
            r20 = r7
            java.lang.Boolean r7 = r3.d     // Catch:{ eif -> 0x03da }
            if (r7 == 0) goto L_0x020c
            boolean r7 = r7.booleanValue()     // Catch:{ eif -> 0x03da }
            if (r7 == 0) goto L_0x0209
            java.lang.Boolean r7 = r3.b     // Catch:{ eif -> 0x03da }
            if (r7 == 0) goto L_0x0209
            boolean r7 = r7.booleanValue()     // Catch:{ eif -> 0x03da }
            if (r7 == 0) goto L_0x0206
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ eif -> 0x03da }
            if (r1 == 0) goto L_0x00de
            boolean r4 = r1.hasSystemFeature(r4)     // Catch:{ eif -> 0x03da }
            if (r4 == 0) goto L_0x00de
            java.lang.Boolean r4 = defpackage.ajnx.a((android.content.Context) r2)     // Catch:{ eif -> 0x03da }
            r31 = r4
            goto L_0x00e0
        L_0x00de:
            r31 = r19
        L_0x00e0:
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ eif -> 0x03da }
            r7 = 23
            if (r4 >= r7) goto L_0x00e9
            r29 = r19
            goto L_0x00fa
        L_0x00e9:
            if (r1 == 0) goto L_0x00f8
            boolean r1 = r1.hasSystemFeature(r5)     // Catch:{ eif -> 0x03da }
            if (r1 == 0) goto L_0x00f8
            java.lang.Boolean r1 = defpackage.ajnx.a()     // Catch:{ eif -> 0x03da }
            r29 = r1
            goto L_0x00fa
        L_0x00f8:
            r29 = r19
        L_0x00fa:
            int r1 = defpackage.rns.c(r2)     // Catch:{ eif -> 0x03da }
            if (r1 < 0) goto L_0x010a
            java.lang.String[] r4 = defpackage.ajnx.a     // Catch:{ eif -> 0x03da }
            int r4 = r4.length     // Catch:{ eif -> 0x03da }
            if (r1 >= r4) goto L_0x010a
            java.lang.String[] r4 = defpackage.ajnx.a     // Catch:{ eif -> 0x03da }
            r1 = r4[r1]     // Catch:{ eif -> 0x03da }
            goto L_0x010c
        L_0x010a:
            r1 = r19
        L_0x010c:
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ eif -> 0x03da }
            android.content.ContentResolver r4 = r2.getContentResolver()     // Catch:{ eif -> 0x03da }
            java.lang.Boolean r22 = defpackage.ajnx.a((android.content.ContentResolver) r4)     // Catch:{ eif -> 0x03da }
            int r4 = defpackage.ajnx.b(r4)     // Catch:{ eif -> 0x03da }
            java.lang.Integer r23 = java.lang.Integer.valueOf(r4)     // Catch:{ eif -> 0x03da }
            java.lang.String r4 = java.lang.String.valueOf(r22)     // Catch:{ eif -> 0x03da }
            java.lang.String r5 = java.lang.String.valueOf(r23)     // Catch:{ eif -> 0x03da }
            boolean r7 = defpackage.azru.b()     // Catch:{ eif -> 0x03da }
            boolean r3 = defpackage.rns.b(r2)     // Catch:{ eif -> 0x03da }
            r21 = r8
            boolean r8 = defpackage.jjm.a(r2)     // Catch:{ eif -> 0x03da }
            r24 = r9
            boolean r9 = defpackage.jgu.e(r2)     // Catch:{ eif -> 0x03da }
            r25 = r10
            boolean r10 = defpackage.jjy.a(r2)     // Catch:{ eif -> 0x03da }
            r18 = r2
            java.lang.String r2 = java.lang.String.valueOf(r29)     // Catch:{ eif -> 0x03da }
            r26 = r10
            java.lang.String r10 = java.lang.String.valueOf(r31)     // Catch:{ eif -> 0x03da }
            java.lang.String r27 = java.lang.String.valueOf(r4)     // Catch:{ eif -> 0x03da }
            r28 = r11
            int r11 = r27.length()     // Catch:{ eif -> 0x03da }
            java.lang.String r27 = java.lang.String.valueOf(r5)     // Catch:{ eif -> 0x03da }
            int r27 = r27.length()     // Catch:{ eif -> 0x03da }
            java.lang.String r30 = java.lang.String.valueOf(r2)     // Catch:{ eif -> 0x03da }
            int r30 = r30.length()     // Catch:{ eif -> 0x03da }
            java.lang.String r32 = java.lang.String.valueOf(r1)     // Catch:{ eif -> 0x03da }
            int r32 = r32.length()     // Catch:{ eif -> 0x03da }
            java.lang.String r33 = java.lang.String.valueOf(r10)     // Catch:{ eif -> 0x03da }
            int r33 = r33.length()     // Catch:{ eif -> 0x03da }
            r34 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ eif -> 0x03da }
            int r11 = r11 + 267
            int r11 = r11 + r27
            int r11 = r11 + r30
            int r11 = r11 + r32
            int r11 = r11 + r33
            r10.<init>(r11)     // Catch:{ eif -> 0x03da }
            java.lang.String r11 = "sendSettings with batterySaverEnabled:"
            r10.append(r11)     // Catch:{ eif -> 0x03da }
            r10.append(r4)     // Catch:{ eif -> 0x03da }
            r10.append(r6)     // Catch:{ eif -> 0x03da }
            r10.append(r5)     // Catch:{ eif -> 0x03da }
            r10.append(r15)     // Catch:{ eif -> 0x03da }
            r10.append(r7)     // Catch:{ eif -> 0x03da }
            r10.append(r14)     // Catch:{ eif -> 0x03da }
            r10.append(r3)     // Catch:{ eif -> 0x03da }
            r10.append(r13)     // Catch:{ eif -> 0x03da }
            r10.append(r8)     // Catch:{ eif -> 0x03da }
            r10.append(r12)     // Catch:{ eif -> 0x03da }
            r10.append(r9)     // Catch:{ eif -> 0x03da }
            r3 = r28
            r10.append(r3)     // Catch:{ eif -> 0x03da }
            r3 = r26
            r10.append(r3)     // Catch:{ eif -> 0x03da }
            r7 = r25
            r10.append(r7)     // Catch:{ eif -> 0x03da }
            r10.append(r2)     // Catch:{ eif -> 0x03da }
            r2 = r24
            r10.append(r2)     // Catch:{ eif -> 0x03da }
            r10.append(r1)     // Catch:{ eif -> 0x03da }
            r8 = r21
            r10.append(r8)     // Catch:{ eif -> 0x03da }
            r2 = r34
            r10.append(r2)     // Catch:{ eif -> 0x03da }
            r10.toString()     // Catch:{ eif -> 0x03da }
            com.google.android.ulr.ApiDeviceSetting r2 = new com.google.android.ulr.ApiDeviceSetting     // Catch:{ eif -> 0x03da }
            boolean r3 = defpackage.azru.b()     // Catch:{ eif -> 0x03da }
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r3)     // Catch:{ eif -> 0x03da }
            boolean r3 = defpackage.rns.b(r18)     // Catch:{ eif -> 0x03da }
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r3)     // Catch:{ eif -> 0x03da }
            boolean r3 = defpackage.jjm.a(r18)     // Catch:{ eif -> 0x03da }
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r3)     // Catch:{ eif -> 0x03da }
            boolean r3 = defpackage.jgu.e(r18)     // Catch:{ eif -> 0x03da }
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r3)     // Catch:{ eif -> 0x03da }
            boolean r3 = defpackage.jjy.a(r18)     // Catch:{ eif -> 0x03da }
            java.lang.Boolean r28 = java.lang.Boolean.valueOf(r3)     // Catch:{ eif -> 0x03da }
            r21 = r2
            r30 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ eif -> 0x03da }
            goto L_0x0225
        L_0x0206:
            r18 = r2
            goto L_0x020e
        L_0x0209:
            r18 = r2
            goto L_0x020e
        L_0x020c:
            r18 = r2
        L_0x020e:
            com.google.android.ulr.ApiDeviceSetting r2 = new com.google.android.ulr.ApiDeviceSetting     // Catch:{ eif -> 0x03da }
            r4 = 0
            r5 = 0
            r6 = 0
            boolean r1 = defpackage.rns.b(r18)     // Catch:{ eif -> 0x03da }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)     // Catch:{ eif -> 0x03da }
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ eif -> 0x03da }
        L_0x0225:
            com.google.android.ulr.ApiSettings r7 = new com.google.android.ulr.ApiSettings     // Catch:{ eif -> 0x03da }
            r1 = r38
            java.lang.Boolean r3 = r1.d     // Catch:{ eif -> 0x03da }
            java.lang.Long r4 = r1.a     // Catch:{ eif -> 0x03da }
            java.lang.Boolean r5 = r1.b     // Catch:{ eif -> 0x03da }
            r7.<init>(r3, r4, r5, r2)     // Catch:{ eif -> 0x03da }
            r2 = r20
            android.content.Context r3 = r2.i     // Catch:{ eif -> 0x03da }
            ajkx r3 = defpackage.ajkq.a(r3)     // Catch:{ eif -> 0x03da }
            alky r4 = new alky     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            r4.<init>(r3)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            android.content.Context r5 = r2.i     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            r9 = r37
            r10 = 1
            com.google.android.gms.common.internal.ClientContext r5 = defpackage.ajkr.a(r5, r9)     // Catch:{ eif -> 0x039b, VolleyError -> 0x0399 }
            ajkw r6 = defpackage.ajkl.a     // Catch:{ eif -> 0x039b, VolleyError -> 0x0399 }
            r3.m = r6     // Catch:{ eif -> 0x039b, VolleyError -> 0x0399 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r17)     // Catch:{ eif -> 0x039b, VolleyError -> 0x0399 }
            java.lang.String r6 = defpackage.ajkr.f     // Catch:{ eif -> 0x039b, VolleyError -> 0x0399 }
            java.lang.String r8 = defpackage.ajkr.d     // Catch:{ eif -> 0x039b, VolleyError -> 0x0399 }
            java.lang.String r11 = defpackage.ajkr.c     // Catch:{ eif -> 0x039b, VolleyError -> 0x0399 }
            java.lang.String r12 = "noRestriction"
            int r13 = r2.j     // Catch:{ eif -> 0x039b, VolleyError -> 0x0399 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ eif -> 0x039b, VolleyError -> 0x0399 }
            java.lang.String r14 = r1.e     // Catch:{ eif -> 0x039b, VolleyError -> 0x0399 }
            java.lang.Boolean r15 = r2.n     // Catch:{ eif -> 0x039b, VolleyError -> 0x0399 }
            java.lang.String r17 = defpackage.ajkr.h     // Catch:{ eif -> 0x039b, VolleyError -> 0x0399 }
            java.lang.String r18 = defpackage.ajkr.g     // Catch:{ eif -> 0x039b, VolleyError -> 0x0399 }
            int r10 = r2.l     // Catch:{ eif -> 0x039b, VolleyError -> 0x0399 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ eif -> 0x039b, VolleyError -> 0x0399 }
            r20 = 2023(0x7e7, float:2.835E-42)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r20)     // Catch:{ eif -> 0x039b, VolleyError -> 0x0399 }
            int r21 = defpackage.ajkr.a     // Catch:{ eif -> 0x039b, VolleyError -> 0x0399 }
            java.lang.Integer r21 = java.lang.Integer.valueOf(r21)     // Catch:{ eif -> 0x039b, VolleyError -> 0x0399 }
            int r2 = r2.k     // Catch:{ eif -> 0x039b, VolleyError -> 0x0399 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ eif -> 0x039b, VolleyError -> 0x0399 }
            java.lang.String r22 = defpackage.ajkr.b     // Catch:{ eif -> 0x039b, VolleyError -> 0x0399 }
            boolean r23 = defpackage.azss.e()     // Catch:{ eif -> 0x039b, VolleyError -> 0x0399 }
            if (r23 == 0) goto L_0x0289
            java.lang.String r19 = "android"
            goto L_0x028a
        L_0x0289:
        L_0x028a:
            java.lang.String r23 = defpackage.ajkr.e     // Catch:{ eif -> 0x039b, VolleyError -> 0x0399 }
            java.lang.String r9 = r1.c     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            r1.<init>()     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            r24 = r7
            java.util.Formatter r7 = new java.util.Formatter     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            r7.<init>(r1)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            r26 = r4
            r25 = r5
            r5 = 1
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            r5 = 0
            r4[r5] = r3     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            java.lang.String r3 = "settings/%1$s"
            r7.format(r3, r4)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            if (r16 == 0) goto L_0x02b8
            java.lang.String r3 = "androidGcmRegistrationId"
            java.lang.String r4 = defpackage.iyv.a(r16)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
        L_0x02b8:
            if (r40 == 0) goto L_0x02c3
            java.lang.String r3 = "auditToken"
            java.lang.String r4 = defpackage.iyv.a(r40)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
        L_0x02c3:
            if (r6 == 0) goto L_0x02ce
            java.lang.String r3 = "brand"
            java.lang.String r4 = defpackage.iyv.a(r6)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
        L_0x02ce:
            if (r8 == 0) goto L_0x02d9
            java.lang.String r3 = "device"
            java.lang.String r4 = defpackage.iyv.a(r8)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
        L_0x02d9:
            if (r11 != 0) goto L_0x02dc
            goto L_0x02e5
        L_0x02dc:
            java.lang.String r3 = "devicePrettyName"
            java.lang.String r4 = defpackage.iyv.a(r11)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
        L_0x02e5:
            java.lang.String r3 = "deviceRestriction"
            java.lang.String r4 = defpackage.iyv.a(r12)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            java.lang.String r3 = "gmsVersion"
            java.lang.String r4 = java.lang.String.valueOf(r13)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            if (r14 == 0) goto L_0x0302
            java.lang.String r3 = "historySource"
            java.lang.String r4 = defpackage.iyv.a(r14)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
        L_0x0302:
            if (r15 == 0) goto L_0x030d
            java.lang.String r3 = "isLowRam"
            java.lang.String r4 = java.lang.String.valueOf(r15)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
        L_0x030d:
            if (r17 == 0) goto L_0x0318
            java.lang.String r3 = "manufacturer"
            java.lang.String r4 = defpackage.iyv.a(r17)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
        L_0x0318:
            if (r18 != 0) goto L_0x031b
            goto L_0x0324
        L_0x031b:
            java.lang.String r3 = "model"
            java.lang.String r4 = defpackage.iyv.a(r18)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
        L_0x0324:
            java.lang.String r3 = "moduleVersion"
            java.lang.String r4 = java.lang.String.valueOf(r10)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            java.lang.String r3 = "nlpVersion"
            java.lang.String r4 = java.lang.String.valueOf(r20)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            java.lang.String r3 = "osLevel"
            java.lang.String r4 = java.lang.String.valueOf(r21)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            java.lang.String r3 = "packageVersion"
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r3, (java.lang.String) r2)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            if (r22 == 0) goto L_0x0353
            java.lang.String r2 = "platform"
            java.lang.String r3 = defpackage.iyv.a(r22)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r2, (java.lang.String) r3)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
        L_0x0353:
            if (r19 == 0) goto L_0x035e
            java.lang.String r2 = "platformType"
            java.lang.String r3 = defpackage.iyv.a(r19)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r2, (java.lang.String) r3)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
        L_0x035e:
            if (r23 == 0) goto L_0x0369
            java.lang.String r2 = "product"
            java.lang.String r3 = defpackage.iyv.a(r23)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r2, (java.lang.String) r3)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
        L_0x0369:
            if (r9 != 0) goto L_0x036c
            goto L_0x0375
        L_0x036c:
            java.lang.String r2 = "reportingSource"
            java.lang.String r3 = defpackage.iyv.a(r9)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r2, (java.lang.String) r3)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
        L_0x0375:
            java.lang.String r6 = r1.toString()     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            r1 = r26
            izb r3 = r1.a     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            r5 = 2
            java.lang.Class<com.google.android.ulr.ApiSettings> r8 = com.google.android.ulr.ApiSettings.class
            r4 = r25
            r7 = r24
            jag r1 = r3.a((com.google.android.gms.common.internal.ClientContext) r4, (int) r5, (java.lang.String) r6, (java.lang.Object) r7, (java.lang.Class) r8)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            com.google.android.ulr.ApiSettings r1 = (com.google.android.ulr.ApiSettings) r1     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            r2 = 1
            defpackage.ajjd.d((boolean) r2)     // Catch:{ eif -> 0x03bd, VolleyError -> 0x03a2, all -> 0x039d }
            r9 = r37
            ajkh r1 = defpackage.ajkh.a((android.accounts.Account) r9, (com.google.android.ulr.ApiSettings) r1)     // Catch:{ eif -> 0x039b, VolleyError -> 0x0399 }
            r3 = r9
            r2 = r16
            goto L_0x07e3
        L_0x0399:
            r0 = move-exception
            goto L_0x03a5
        L_0x039b:
            r0 = move-exception
            goto L_0x03c0
        L_0x039d:
            r0 = move-exception
            r9 = r37
        L_0x03a0:
            r1 = r0
            goto L_0x03d2
        L_0x03a2:
            r0 = move-exception
            r9 = r37
        L_0x03a5:
            r1 = r0
            defpackage.ajkr.a(r1)     // Catch:{ all -> 0x03d0 }
            boolean r2 = defpackage.azte.d()     // Catch:{ all -> 0x03d0 }
            if (r2 != 0) goto L_0x03b4
            r2 = 0
            defpackage.ajjd.d((boolean) r2)     // Catch:{ all -> 0x03d0 }
            goto L_0x03b7
        L_0x03b4:
            defpackage.ajjd.f((java.lang.Throwable) r1)     // Catch:{ all -> 0x03d0 }
        L_0x03b7:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x03d0 }
            r2.<init>(r1)     // Catch:{ all -> 0x03d0 }
            throw r2     // Catch:{ all -> 0x03d0 }
        L_0x03bd:
            r0 = move-exception
            r9 = r37
        L_0x03c0:
            r1 = r0
            boolean r2 = defpackage.azte.d()     // Catch:{ all -> 0x03d0 }
            if (r2 != 0) goto L_0x03cc
            r2 = 0
            defpackage.ajjd.d((boolean) r2)     // Catch:{ all -> 0x03d0 }
            goto L_0x03cf
        L_0x03cc:
            defpackage.ajjd.f((java.lang.Throwable) r1)     // Catch:{ all -> 0x03d0 }
        L_0x03cf:
            throw r1     // Catch:{ all -> 0x03d0 }
        L_0x03d0:
            r0 = move-exception
            goto L_0x03a0
        L_0x03d2:
            throw r1     // Catch:{ eif -> 0x03d3 }
        L_0x03d3:
            r0 = move-exception
            r4 = r36
            r1 = r0
            r3 = r9
            goto L_0x0874
        L_0x03da:
            r0 = move-exception
            r4 = r36
            r3 = r37
            goto L_0x0873
        L_0x03e1:
            r2 = r9
            r7 = r10
            r3 = r11
            r9 = r37
            r1 = r36
            ajkj r10 = r1.c     // Catch:{ eif -> 0x086c }
            android.content.Context r11 = r10.i     // Catch:{ eif -> 0x086c }
            java.lang.String[] r20 = defpackage.ajnx.a     // Catch:{ eif -> 0x086c }
            android.content.pm.PackageManager r1 = r11.getPackageManager()     // Catch:{ eif -> 0x0868 }
            r9 = r38
            r20 = r10
            java.lang.Boolean r10 = r9.d     // Catch:{ eif -> 0x03da }
            if (r10 != 0) goto L_0x03fe
            r26 = r11
            goto L_0x0639
        L_0x03fe:
            boolean r10 = r10.booleanValue()     // Catch:{ eif -> 0x03da }
            if (r10 == 0) goto L_0x0637
            java.lang.Boolean r10 = r9.b     // Catch:{ eif -> 0x03da }
            if (r10 == 0) goto L_0x0637
            boolean r10 = r10.booleanValue()     // Catch:{ eif -> 0x03da }
            if (r10 == 0) goto L_0x0634
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ eif -> 0x03da }
            if (r1 == 0) goto L_0x041d
            boolean r4 = r1.hasSystemFeature(r4)     // Catch:{ eif -> 0x03da }
            if (r4 == 0) goto L_0x041d
            java.lang.Boolean r4 = defpackage.ajnx.a((android.content.Context) r11)     // Catch:{ eif -> 0x03da }
            goto L_0x041f
        L_0x041d:
            r4 = r19
        L_0x041f:
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ eif -> 0x03da }
            r9 = 23
            if (r10 >= r9) goto L_0x0428
            r1 = r19
            goto L_0x0437
        L_0x0428:
            if (r1 == 0) goto L_0x0435
            boolean r1 = r1.hasSystemFeature(r5)     // Catch:{ eif -> 0x03da }
            if (r1 == 0) goto L_0x0435
            java.lang.Boolean r1 = defpackage.ajnx.a()     // Catch:{ eif -> 0x03da }
            goto L_0x0437
        L_0x0435:
            r1 = r19
        L_0x0437:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ eif -> 0x03da }
            android.content.ContentResolver r5 = r11.getContentResolver()     // Catch:{ eif -> 0x03da }
            java.lang.Boolean r9 = defpackage.ajnx.a((android.content.ContentResolver) r5)     // Catch:{ eif -> 0x03da }
            int r5 = defpackage.ajnx.b(r5)     // Catch:{ eif -> 0x03da }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ eif -> 0x03da }
            int r10 = defpackage.rns.c(r11)     // Catch:{ eif -> 0x03da }
            int r10 = defpackage.atcd.a(r10)     // Catch:{ eif -> 0x03da }
            r21 = r8
            java.lang.String r8 = java.lang.String.valueOf(r9)     // Catch:{ eif -> 0x03da }
            r18 = r9
            java.lang.String r9 = java.lang.String.valueOf(r5)     // Catch:{ eif -> 0x03da }
            r22 = r5
            boolean r5 = defpackage.azru.b()     // Catch:{ eif -> 0x03da }
            r24 = r2
            boolean r2 = defpackage.rns.b(r11)     // Catch:{ eif -> 0x03da }
            r25 = r7
            boolean r7 = defpackage.jjm.a(r11)     // Catch:{ eif -> 0x03da }
            r28 = r3
            boolean r3 = defpackage.jgu.e(r11)     // Catch:{ eif -> 0x03da }
            r23 = r3
            boolean r3 = defpackage.jjy.a(r11)     // Catch:{ eif -> 0x03da }
            r26 = r11
            java.lang.String r11 = java.lang.String.valueOf(r1)     // Catch:{ eif -> 0x03da }
            if (r10 != 0) goto L_0x0486
            java.lang.String r27 = "null"
            goto L_0x048c
        L_0x0486:
            int r27 = r10 + -1
            java.lang.String r27 = java.lang.Integer.toString(r27)     // Catch:{ eif -> 0x03da }
        L_0x048c:
            r29 = r10
            java.lang.String r10 = java.lang.String.valueOf(r27)     // Catch:{ eif -> 0x03da }
            r27 = r1
            java.lang.String r1 = java.lang.String.valueOf(r4)     // Catch:{ eif -> 0x03da }
            java.lang.String r30 = java.lang.String.valueOf(r8)     // Catch:{ eif -> 0x03da }
            r31 = r4
            int r4 = r30.length()     // Catch:{ eif -> 0x03da }
            java.lang.String r30 = java.lang.String.valueOf(r9)     // Catch:{ eif -> 0x03da }
            int r30 = r30.length()     // Catch:{ eif -> 0x03da }
            java.lang.String r32 = java.lang.String.valueOf(r11)     // Catch:{ eif -> 0x03da }
            int r32 = r32.length()     // Catch:{ eif -> 0x03da }
            java.lang.String r33 = java.lang.String.valueOf(r10)     // Catch:{ eif -> 0x03da }
            int r33 = r33.length()     // Catch:{ eif -> 0x03da }
            java.lang.String r34 = java.lang.String.valueOf(r1)     // Catch:{ eif -> 0x03da }
            int r34 = r34.length()     // Catch:{ eif -> 0x03da }
            r35 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ eif -> 0x03da }
            int r4 = r4 + 273
            int r4 = r4 + r30
            int r4 = r4 + r32
            int r4 = r4 + r33
            int r4 = r4 + r34
            r1.<init>(r4)     // Catch:{ eif -> 0x03da }
            java.lang.String r4 = "sendSettings(gRPC) with batterySaverEnabled:"
            r1.append(r4)     // Catch:{ eif -> 0x03da }
            r1.append(r8)     // Catch:{ eif -> 0x03da }
            r1.append(r6)     // Catch:{ eif -> 0x03da }
            r1.append(r9)     // Catch:{ eif -> 0x03da }
            r1.append(r15)     // Catch:{ eif -> 0x03da }
            r1.append(r5)     // Catch:{ eif -> 0x03da }
            r1.append(r14)     // Catch:{ eif -> 0x03da }
            r1.append(r2)     // Catch:{ eif -> 0x03da }
            r1.append(r13)     // Catch:{ eif -> 0x03da }
            r1.append(r7)     // Catch:{ eif -> 0x03da }
            r1.append(r12)     // Catch:{ eif -> 0x03da }
            r2 = r23
            r1.append(r2)     // Catch:{ eif -> 0x03da }
            r2 = r28
            r1.append(r2)     // Catch:{ eif -> 0x03da }
            r1.append(r3)     // Catch:{ eif -> 0x03da }
            r2 = r25
            r1.append(r2)     // Catch:{ eif -> 0x03da }
            r1.append(r11)     // Catch:{ eif -> 0x03da }
            r2 = r24
            r1.append(r2)     // Catch:{ eif -> 0x03da }
            r1.append(r10)     // Catch:{ eif -> 0x03da }
            r2 = r21
            r1.append(r2)     // Catch:{ eif -> 0x03da }
            r2 = r35
            r1.append(r2)     // Catch:{ eif -> 0x03da }
            r1.toString()     // Catch:{ eif -> 0x03da }
            atce r1 = defpackage.atce.l     // Catch:{ eif -> 0x03da }
            aucd r1 = r1.o()     // Catch:{ eif -> 0x03da }
            boolean r2 = defpackage.rns.b(r26)     // Catch:{ eif -> 0x03da }
            boolean r3 = r1.c     // Catch:{ eif -> 0x03da }
            if (r3 != 0) goto L_0x052f
            goto L_0x0535
        L_0x052f:
            r1.c()     // Catch:{ eif -> 0x03da }
            r3 = 0
            r1.c = r3     // Catch:{ eif -> 0x03da }
        L_0x0535:
            aucj r3 = r1.b     // Catch:{ eif -> 0x03da }
            atce r3 = (defpackage.atce) r3     // Catch:{ eif -> 0x03da }
            int r4 = r3.a     // Catch:{ eif -> 0x03da }
            r4 = r4 | 4
            r3.a = r4     // Catch:{ eif -> 0x03da }
            r3.d = r2     // Catch:{ eif -> 0x03da }
            boolean r2 = defpackage.jjm.a(r26)     // Catch:{ eif -> 0x03da }
            boolean r3 = r1.c     // Catch:{ eif -> 0x03da }
            if (r3 != 0) goto L_0x054a
            goto L_0x0550
        L_0x054a:
            r1.c()     // Catch:{ eif -> 0x03da }
            r3 = 0
            r1.c = r3     // Catch:{ eif -> 0x03da }
        L_0x0550:
            aucj r3 = r1.b     // Catch:{ eif -> 0x03da }
            atce r3 = (defpackage.atce) r3     // Catch:{ eif -> 0x03da }
            int r4 = r3.a     // Catch:{ eif -> 0x03da }
            r4 = r4 | 2
            r3.a = r4     // Catch:{ eif -> 0x03da }
            r3.c = r2     // Catch:{ eif -> 0x03da }
            boolean r2 = defpackage.jgu.e(r26)     // Catch:{ eif -> 0x03da }
            boolean r3 = r1.c     // Catch:{ eif -> 0x03da }
            if (r3 != 0) goto L_0x0565
            goto L_0x056b
        L_0x0565:
            r1.c()     // Catch:{ eif -> 0x03da }
            r3 = 0
            r1.c = r3     // Catch:{ eif -> 0x03da }
        L_0x056b:
            aucj r3 = r1.b     // Catch:{ eif -> 0x03da }
            atce r3 = (defpackage.atce) r3     // Catch:{ eif -> 0x03da }
            int r4 = r3.a     // Catch:{ eif -> 0x03da }
            r4 = r4 | 8
            r3.a = r4     // Catch:{ eif -> 0x03da }
            r3.e = r2     // Catch:{ eif -> 0x03da }
            boolean r2 = defpackage.jjy.a(r26)     // Catch:{ eif -> 0x03da }
            boolean r3 = r1.c     // Catch:{ eif -> 0x03da }
            if (r3 != 0) goto L_0x0580
            goto L_0x0586
        L_0x0580:
            r1.c()     // Catch:{ eif -> 0x03da }
            r3 = 0
            r1.c = r3     // Catch:{ eif -> 0x03da }
        L_0x0586:
            aucj r3 = r1.b     // Catch:{ eif -> 0x03da }
            atce r3 = (defpackage.atce) r3     // Catch:{ eif -> 0x03da }
            int r4 = r3.a     // Catch:{ eif -> 0x03da }
            r4 = r4 | 16
            r3.a = r4     // Catch:{ eif -> 0x03da }
            r3.f = r2     // Catch:{ eif -> 0x03da }
            boolean r2 = defpackage.azru.b()     // Catch:{ eif -> 0x03da }
            boolean r3 = r1.c     // Catch:{ eif -> 0x03da }
            if (r3 != 0) goto L_0x059b
            goto L_0x05a1
        L_0x059b:
            r1.c()     // Catch:{ eif -> 0x03da }
            r3 = 0
            r1.c = r3     // Catch:{ eif -> 0x03da }
        L_0x05a1:
            aucj r3 = r1.b     // Catch:{ eif -> 0x03da }
            atce r3 = (defpackage.atce) r3     // Catch:{ eif -> 0x03da }
            int r4 = r3.a     // Catch:{ eif -> 0x03da }
            r5 = 1
            r4 = r4 | r5
            r3.a = r4     // Catch:{ eif -> 0x03da }
            r3.b = r2     // Catch:{ eif -> 0x03da }
            boolean r2 = r18.booleanValue()     // Catch:{ eif -> 0x03da }
            boolean r3 = r1.c     // Catch:{ eif -> 0x03da }
            if (r3 != 0) goto L_0x05b6
            goto L_0x05bc
        L_0x05b6:
            r1.c()     // Catch:{ eif -> 0x03da }
            r3 = 0
            r1.c = r3     // Catch:{ eif -> 0x03da }
        L_0x05bc:
            aucj r3 = r1.b     // Catch:{ eif -> 0x03da }
            atce r3 = (defpackage.atce) r3     // Catch:{ eif -> 0x03da }
            int r4 = r3.a     // Catch:{ eif -> 0x03da }
            r4 = r4 | 256(0x100, float:3.59E-43)
            r3.a = r4     // Catch:{ eif -> 0x03da }
            r3.j = r2     // Catch:{ eif -> 0x03da }
            int r2 = r22.intValue()     // Catch:{ eif -> 0x03da }
            boolean r3 = r1.c     // Catch:{ eif -> 0x03da }
            if (r3 != 0) goto L_0x05d1
            goto L_0x05d7
        L_0x05d1:
            r1.c()     // Catch:{ eif -> 0x03da }
            r3 = 0
            r1.c = r3     // Catch:{ eif -> 0x03da }
        L_0x05d7:
            aucj r3 = r1.b     // Catch:{ eif -> 0x03da }
            atce r3 = (defpackage.atce) r3     // Catch:{ eif -> 0x03da }
            int r4 = r3.a     // Catch:{ eif -> 0x03da }
            r4 = r4 | 512(0x200, float:7.175E-43)
            r3.a = r4     // Catch:{ eif -> 0x03da }
            r3.k = r2     // Catch:{ eif -> 0x03da }
            if (r27 == 0) goto L_0x0600
            boolean r2 = r27.booleanValue()     // Catch:{ eif -> 0x03da }
            boolean r3 = r1.c     // Catch:{ eif -> 0x03da }
            if (r3 != 0) goto L_0x05ee
            goto L_0x05f4
        L_0x05ee:
            r1.c()     // Catch:{ eif -> 0x03da }
            r3 = 0
            r1.c = r3     // Catch:{ eif -> 0x03da }
        L_0x05f4:
            aucj r3 = r1.b     // Catch:{ eif -> 0x03da }
            atce r3 = (defpackage.atce) r3     // Catch:{ eif -> 0x03da }
            int r4 = r3.a     // Catch:{ eif -> 0x03da }
            r4 = r4 | 128(0x80, float:1.794E-43)
            r3.a = r4     // Catch:{ eif -> 0x03da }
            r3.i = r2     // Catch:{ eif -> 0x03da }
        L_0x0600:
            if (r31 == 0) goto L_0x061d
            boolean r2 = r31.booleanValue()     // Catch:{ eif -> 0x03da }
            boolean r3 = r1.c     // Catch:{ eif -> 0x03da }
            if (r3 != 0) goto L_0x060b
            goto L_0x0611
        L_0x060b:
            r1.c()     // Catch:{ eif -> 0x03da }
            r3 = 0
            r1.c = r3     // Catch:{ eif -> 0x03da }
        L_0x0611:
            aucj r3 = r1.b     // Catch:{ eif -> 0x03da }
            atce r3 = (defpackage.atce) r3     // Catch:{ eif -> 0x03da }
            int r4 = r3.a     // Catch:{ eif -> 0x03da }
            r4 = r4 | 64
            r3.a = r4     // Catch:{ eif -> 0x03da }
            r3.h = r2     // Catch:{ eif -> 0x03da }
        L_0x061d:
            if (r29 == 0) goto L_0x062d
            aucj r2 = r1.b     // Catch:{ eif -> 0x03da }
            atce r2 = (defpackage.atce) r2     // Catch:{ eif -> 0x03da }
            int r10 = r29 + -1
            r2.g = r10     // Catch:{ eif -> 0x03da }
            int r3 = r2.a     // Catch:{ eif -> 0x03da }
            r3 = r3 | 32
            r2.a = r3     // Catch:{ eif -> 0x03da }
        L_0x062d:
            aucj r1 = r1.i()     // Catch:{ eif -> 0x03da }
            atce r1 = (defpackage.atce) r1     // Catch:{ eif -> 0x03da }
            goto L_0x0660
        L_0x0634:
            r26 = r11
            goto L_0x0639
        L_0x0637:
            r26 = r11
        L_0x0639:
            atce r1 = defpackage.atce.l     // Catch:{ eif -> 0x03da }
            aucd r1 = r1.o()     // Catch:{ eif -> 0x03da }
            boolean r2 = defpackage.rns.b(r26)     // Catch:{ eif -> 0x03da }
            boolean r3 = r1.c     // Catch:{ eif -> 0x03da }
            if (r3 != 0) goto L_0x0648
            goto L_0x064e
        L_0x0648:
            r1.c()     // Catch:{ eif -> 0x03da }
            r3 = 0
            r1.c = r3     // Catch:{ eif -> 0x03da }
        L_0x064e:
            aucj r3 = r1.b     // Catch:{ eif -> 0x03da }
            atce r3 = (defpackage.atce) r3     // Catch:{ eif -> 0x03da }
            int r4 = r3.a     // Catch:{ eif -> 0x03da }
            r4 = r4 | 4
            r3.a = r4     // Catch:{ eif -> 0x03da }
            r3.d = r2     // Catch:{ eif -> 0x03da }
            aucj r1 = r1.i()     // Catch:{ eif -> 0x03da }
            atce r1 = (defpackage.atce) r1     // Catch:{ eif -> 0x03da }
        L_0x0660:
            atdl r2 = defpackage.atdl.j     // Catch:{ eif -> 0x03da }
            aucd r2 = r2.o()     // Catch:{ eif -> 0x03da }
            r3 = r38
            java.lang.Boolean r4 = r3.d     // Catch:{ eif -> 0x03da }
            if (r4 == 0) goto L_0x0674
            boolean r4 = r4.booleanValue()     // Catch:{ eif -> 0x03da }
            if (r4 == 0) goto L_0x0674
            r4 = 1
            goto L_0x0675
        L_0x0674:
            r4 = 0
        L_0x0675:
            boolean r5 = r2.c     // Catch:{ eif -> 0x03da }
            if (r5 != 0) goto L_0x067a
            goto L_0x0680
        L_0x067a:
            r2.c()     // Catch:{ eif -> 0x03da }
            r5 = 0
            r2.c = r5     // Catch:{ eif -> 0x03da }
        L_0x0680:
            aucj r5 = r2.b     // Catch:{ eif -> 0x03da }
            atdl r5 = (defpackage.atdl) r5     // Catch:{ eif -> 0x03da }
            int r6 = r5.a     // Catch:{ eif -> 0x03da }
            r6 = r6 | 2
            r5.a = r6     // Catch:{ eif -> 0x03da }
            r5.c = r4     // Catch:{ eif -> 0x03da }
            java.lang.Long r4 = r3.a     // Catch:{ eif -> 0x03da }
            r5 = 0
            if (r4 == 0) goto L_0x0697
            long r7 = r4.longValue()     // Catch:{ eif -> 0x03da }
            goto L_0x0698
        L_0x0697:
            r7 = r5
        L_0x0698:
            boolean r4 = r2.c     // Catch:{ eif -> 0x03da }
            if (r4 != 0) goto L_0x069d
            goto L_0x06a3
        L_0x069d:
            r2.c()     // Catch:{ eif -> 0x03da }
            r4 = 0
            r2.c = r4     // Catch:{ eif -> 0x03da }
        L_0x06a3:
            aucj r4 = r2.b     // Catch:{ eif -> 0x03da }
            atdl r4 = (defpackage.atdl) r4     // Catch:{ eif -> 0x03da }
            int r9 = r4.a     // Catch:{ eif -> 0x03da }
            r10 = 1
            r9 = r9 | r10
            r4.a = r9     // Catch:{ eif -> 0x03da }
            r4.b = r7     // Catch:{ eif -> 0x03da }
            java.lang.Boolean r4 = r3.b     // Catch:{ eif -> 0x03da }
            if (r4 == 0) goto L_0x06bb
            boolean r4 = r4.booleanValue()     // Catch:{ eif -> 0x03da }
            if (r4 == 0) goto L_0x06bb
            r4 = 1
            goto L_0x06bc
        L_0x06bb:
            r4 = 0
        L_0x06bc:
            boolean r7 = r2.c     // Catch:{ eif -> 0x03da }
            if (r7 != 0) goto L_0x06c1
            goto L_0x06c7
        L_0x06c1:
            r2.c()     // Catch:{ eif -> 0x03da }
            r7 = 0
            r2.c = r7     // Catch:{ eif -> 0x03da }
        L_0x06c7:
            aucj r7 = r2.b     // Catch:{ eif -> 0x03da }
            atdl r7 = (defpackage.atdl) r7     // Catch:{ eif -> 0x03da }
            int r8 = r7.a     // Catch:{ eif -> 0x03da }
            r8 = r8 | 4
            r7.a = r8     // Catch:{ eif -> 0x03da }
            r7.d = r4     // Catch:{ eif -> 0x03da }
            if (r1 == 0) goto L_0x0861
            r1.getClass()     // Catch:{ eif -> 0x03da }
            r7.i = r1     // Catch:{ eif -> 0x03da }
            r1 = r8 | 256(0x100, float:3.59E-43)
            r7.a = r1     // Catch:{ eif -> 0x03da }
            aucj r1 = r2.i()     // Catch:{ eif -> 0x03da }
            atdl r1 = (defpackage.atdl) r1     // Catch:{ eif -> 0x03da }
            r2 = r16
            r4 = r20
            r7 = 1
            aucd r8 = r4.a((java.lang.String) r2, (boolean) r7)     // Catch:{ eif -> 0x03da }
            aucj r7 = r8.i()     // Catch:{ eif -> 0x03da }
            atbz r7 = (defpackage.atbz) r7     // Catch:{ eif -> 0x03da }
            atdm r8 = defpackage.atdm.e     // Catch:{ eif -> 0x03da }
            aucd r8 = r8.o()     // Catch:{ eif -> 0x03da }
            java.lang.String r9 = r3.e     // Catch:{ eif -> 0x03da }
            java.lang.String r9 = defpackage.jlh.a(r9)     // Catch:{ eif -> 0x03da }
            boolean r10 = r8.c     // Catch:{ eif -> 0x03da }
            if (r10 != 0) goto L_0x0704
            goto L_0x070a
        L_0x0704:
            r8.c()     // Catch:{ eif -> 0x03da }
            r10 = 0
            r8.c = r10     // Catch:{ eif -> 0x03da }
        L_0x070a:
            aucj r10 = r8.b     // Catch:{ eif -> 0x03da }
            atdm r10 = (defpackage.atdm) r10     // Catch:{ eif -> 0x03da }
            r9.getClass()     // Catch:{ eif -> 0x03da }
            int r11 = r10.a     // Catch:{ eif -> 0x03da }
            r12 = 1
            r11 = r11 | r12
            r10.a = r11     // Catch:{ eif -> 0x03da }
            r10.b = r9     // Catch:{ eif -> 0x03da }
            java.lang.String r9 = r3.c     // Catch:{ eif -> 0x03da }
            java.lang.String r9 = defpackage.jlh.a(r9)     // Catch:{ eif -> 0x03da }
            boolean r10 = r8.c     // Catch:{ eif -> 0x03da }
            if (r10 != 0) goto L_0x0724
            goto L_0x072a
        L_0x0724:
            r8.c()     // Catch:{ eif -> 0x03da }
            r10 = 0
            r8.c = r10     // Catch:{ eif -> 0x03da }
        L_0x072a:
            aucj r10 = r8.b     // Catch:{ eif -> 0x03da }
            atdm r10 = (defpackage.atdm) r10     // Catch:{ eif -> 0x03da }
            r9.getClass()     // Catch:{ eif -> 0x03da }
            int r11 = r10.a     // Catch:{ eif -> 0x03da }
            r11 = r11 | 2
            r10.a = r11     // Catch:{ eif -> 0x03da }
            r10.c = r9     // Catch:{ eif -> 0x03da }
            java.lang.String r9 = defpackage.jlh.a(r40)     // Catch:{ eif -> 0x03da }
            boolean r10 = r8.c     // Catch:{ eif -> 0x03da }
            if (r10 != 0) goto L_0x0742
            goto L_0x0748
        L_0x0742:
            r8.c()     // Catch:{ eif -> 0x03da }
            r10 = 0
            r8.c = r10     // Catch:{ eif -> 0x03da }
        L_0x0748:
            aucj r10 = r8.b     // Catch:{ eif -> 0x03da }
            atdm r10 = (defpackage.atdm) r10     // Catch:{ eif -> 0x03da }
            r9.getClass()     // Catch:{ eif -> 0x03da }
            int r11 = r10.a     // Catch:{ eif -> 0x03da }
            r11 = r11 | 4
            r10.a = r11     // Catch:{ eif -> 0x03da }
            r10.d = r9     // Catch:{ eif -> 0x03da }
            aucj r8 = r8.i()     // Catch:{ eif -> 0x03da }
            atdm r8 = (defpackage.atdm) r8     // Catch:{ eif -> 0x03da }
            atej r9 = defpackage.atej.f     // Catch:{ babk -> 0x0856, eif -> 0x0854 }
            aucd r9 = r9.o()     // Catch:{ babk -> 0x0856, eif -> 0x0854 }
            boolean r10 = r9.c     // Catch:{ babk -> 0x0856, eif -> 0x0854 }
            if (r10 != 0) goto L_0x0768
            goto L_0x076e
        L_0x0768:
            r9.c()     // Catch:{ babk -> 0x0856, eif -> 0x0854 }
            r10 = 0
            r9.c = r10     // Catch:{ babk -> 0x0856, eif -> 0x0854 }
        L_0x076e:
            aucj r10 = r9.b     // Catch:{ babk -> 0x0856, eif -> 0x0854 }
            atej r10 = (defpackage.atej) r10     // Catch:{ babk -> 0x0856, eif -> 0x0854 }
            int r11 = r10.a     // Catch:{ babk -> 0x0856, eif -> 0x0854 }
            r12 = 1
            r11 = r11 | r12
            r10.a = r11     // Catch:{ babk -> 0x0856, eif -> 0x0854 }
            r12 = r17
            r10.b = r12     // Catch:{ babk -> 0x0856, eif -> 0x0854 }
            r7.getClass()     // Catch:{ babk -> 0x0856, eif -> 0x0854 }
            r10.c = r7     // Catch:{ babk -> 0x0856, eif -> 0x0854 }
            r7 = r11 | 2
            r10.a = r7     // Catch:{ babk -> 0x0856, eif -> 0x0854 }
            r1.getClass()     // Catch:{ babk -> 0x0856, eif -> 0x0854 }
            r10.d = r1     // Catch:{ babk -> 0x0856, eif -> 0x0854 }
            r1 = r7 | 4
            r10.a = r1     // Catch:{ babk -> 0x0856, eif -> 0x0854 }
            r8.getClass()     // Catch:{ babk -> 0x0856, eif -> 0x0854 }
            r10.e = r8     // Catch:{ babk -> 0x0856, eif -> 0x0854 }
            r1 = r1 | 8
            r10.a = r1     // Catch:{ babk -> 0x0856, eif -> 0x0854 }
            aucj r1 = r9.i()     // Catch:{ babk -> 0x0856, eif -> 0x0854 }
            r10 = r1
            atej r10 = (defpackage.atej) r10     // Catch:{ babk -> 0x0856, eif -> 0x0854 }
            defpackage.ajjd.c((long) r5)     // Catch:{ babk -> 0x0856, eif -> 0x0854 }
            ajlf r1 = defpackage.ajkj.j     // Catch:{ babk -> 0x0856, eif -> 0x0854 }
            android.content.Context r4 = r4.i     // Catch:{ babk -> 0x0856, eif -> 0x0854 }
            r3 = r37
            com.google.android.gms.common.internal.ClientContext r9 = defpackage.ajkj.a((android.content.Context) r4, (android.accounts.Account) r3)     // Catch:{ babk -> 0x0850, eif -> 0x084e }
            baaj r4 = defpackage.ajlf.d     // Catch:{ babk -> 0x0850, eif -> 0x084e }
            if (r4 == 0) goto L_0x07b0
            goto L_0x07c6
        L_0x07b0:
            baai r4 = defpackage.baai.UNARY     // Catch:{ babk -> 0x0850, eif -> 0x084e }
            java.lang.String r5 = "userlocation.UserLocationReportingService/SetApiSettings"
            atej r6 = defpackage.atej.f     // Catch:{ babk -> 0x0850, eif -> 0x084e }
            baah r6 = defpackage.baoq.a(r6)     // Catch:{ babk -> 0x0850, eif -> 0x084e }
            atei r7 = defpackage.atei.b     // Catch:{ babk -> 0x0850, eif -> 0x084e }
            baah r7 = defpackage.baoq.a(r7)     // Catch:{ babk -> 0x0850, eif -> 0x084e }
            baaj r4 = defpackage.baaj.a(r4, r5, r6, r7)     // Catch:{ babk -> 0x0850, eif -> 0x084e }
            defpackage.ajlf.d = r4     // Catch:{ babk -> 0x0850, eif -> 0x084e }
        L_0x07c6:
            izd r7 = r1.a     // Catch:{ babk -> 0x0850, eif -> 0x084e }
            baaj r8 = defpackage.ajlf.d     // Catch:{ babk -> 0x0850, eif -> 0x084e }
            r11 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ babk -> 0x0850, eif -> 0x084e }
            java.lang.Object r1 = r7.a(r8, r9, r10, r11, r13)     // Catch:{ babk -> 0x0850, eif -> 0x084e }
            atei r1 = (defpackage.atei) r1     // Catch:{ babk -> 0x0850, eif -> 0x084e }
            r4 = 1
            defpackage.ajjd.d((boolean) r4)     // Catch:{ babk -> 0x0850, eif -> 0x084e }
            atdl r1 = r1.a     // Catch:{ babk -> 0x0850, eif -> 0x084e }
            if (r1 == 0) goto L_0x07dd
            goto L_0x07df
        L_0x07dd:
            atdl r1 = defpackage.atdl.j     // Catch:{ babk -> 0x0850, eif -> 0x084e }
        L_0x07df:
            ajkh r1 = defpackage.ajkh.a((android.accounts.Account) r3, (defpackage.atdl) r1)     // Catch:{ babk -> 0x0850, eif -> 0x084e }
        L_0x07e3:
            boolean r4 = b(r1)     // Catch:{ eif -> 0x084a }
            java.lang.String r5 = "GCoreUlrLong"
            java.lang.String r6 = java.lang.String.valueOf(r38)     // Catch:{ eif -> 0x084a }
            java.lang.String r7 = java.lang.String.valueOf(r1)     // Catch:{ eif -> 0x084a }
            int r8 = r39.length()     // Catch:{ eif -> 0x084a }
            int r8 = r8 + 48
            java.lang.String r9 = java.lang.String.valueOf(r6)     // Catch:{ eif -> 0x084a }
            int r9 = r9.length()     // Catch:{ eif -> 0x084a }
            int r8 = r8 + r9
            java.lang.String r9 = java.lang.String.valueOf(r7)     // Catch:{ eif -> 0x084a }
            int r9 = r9.length()     // Catch:{ eif -> 0x084a }
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ eif -> 0x084a }
            r9.<init>(r8)     // Catch:{ eif -> 0x084a }
            java.lang.String r8 = "sendSettings("
            r9.append(r8)     // Catch:{ eif -> 0x084a }
            r8 = r39
            r9.append(r8)     // Catch:{ eif -> 0x084a }
            java.lang.String r8 = "): sent "
            r9.append(r8)     // Catch:{ eif -> 0x084a }
            r9.append(r6)     // Catch:{ eif -> 0x084a }
            java.lang.String r6 = ", got back "
            r9.append(r6)     // Catch:{ eif -> 0x084a }
            r9.append(r7)     // Catch:{ eif -> 0x084a }
            java.lang.String r6 = "; success: "
            r9.append(r6)     // Catch:{ eif -> 0x084a }
            r9.append(r4)     // Catch:{ eif -> 0x084a }
            java.lang.String r6 = r9.toString()     // Catch:{ eif -> 0x084a }
            defpackage.ajix.a((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ eif -> 0x084a }
            if (r4 == 0) goto L_0x0842
            r4 = r36
            r4.a((android.accounts.Account) r3, (java.lang.String) r2)     // Catch:{ eif -> 0x0866 }
            r4.a((defpackage.ajkh) r1)     // Catch:{ eif -> 0x0866 }
            goto L_0x0844
        L_0x0842:
            r4 = r36
        L_0x0844:
            r2 = 1
            r4.a((android.accounts.Account) r3, (boolean) r2)     // Catch:{ eif -> 0x0866 }
            return r1
        L_0x084a:
            r0 = move-exception
            r4 = r36
            goto L_0x0873
        L_0x084e:
            r0 = move-exception
            goto L_0x0851
        L_0x0850:
            r0 = move-exception
        L_0x0851:
            r4 = r36
            goto L_0x085b
        L_0x0854:
            r0 = move-exception
            goto L_0x0857
        L_0x0856:
            r0 = move-exception
        L_0x0857:
            r4 = r36
            r3 = r37
        L_0x085b:
            r1 = r0
            r2 = 0
            defpackage.ajjd.d((boolean) r2)     // Catch:{ eif -> 0x0866 }
            throw r1     // Catch:{ eif -> 0x0866 }
        L_0x0861:
            r4 = r36
            r3 = r37
            throw r19     // Catch:{ eif -> 0x0866 }
        L_0x0866:
            r0 = move-exception
            goto L_0x0873
        L_0x0868:
            r0 = move-exception
            r4 = r36
            goto L_0x086e
        L_0x086c:
            r0 = move-exception
            r4 = r1
        L_0x086e:
            r3 = r9
            goto L_0x0873
        L_0x0870:
            r0 = move-exception
            r4 = r1
            r3 = r2
        L_0x0873:
            r1 = r0
        L_0x0874:
            r2 = 0
            r4.a((android.accounts.Account) r3, (boolean) r2)
            goto L_0x087a
        L_0x0879:
            throw r1
        L_0x087a:
            goto L_0x0879
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajld.a(android.accounts.Account, ajkh, java.lang.String, java.lang.String):ajkh");
    }

    public final String a(Account account) {
        String str;
        Context context = this.d;
        if (aztb.Q()) {
            str = nsi.a(context);
            if (str == null) {
                ajix.a("GCoreUlr", "No GCM registration ID");
            }
        } else {
            str = null;
        }
        if (str == null) {
            return null;
        }
        Long l = this.a.a(account).p;
        if (l != null && System.currentTimeMillis() - l.longValue() <= TimeUnit.DAYS.toMillis(7)) {
            return null;
        }
        String valueOf = String.valueOf(rmp.a(account));
        if (valueOf.length() == 0) {
            new String("Uploading GCM registration ID for ");
        } else {
            "Uploading GCM registration ID for ".concat(valueOf);
        }
        return str;
    }

    public final void a(ajkh ajkh) {
        if (!ajkh.b().isEmpty()) {
            ArrayList arrayList = new ArrayList(ajkh.b());
            ajmj ajmj = this.e;
            Intent a2 = jhg.a(new Intent("com.google.android.gms.location.reporting.DELETE_OPERATION"));
            a2.putParcelableArrayListExtra("deletions", arrayList);
            ajmj.a.sendBroadcast(a2);
            Context context = this.d;
            Intent a3 = ajme.a(context, "com.google.android.gms.location.reporting.DELETE_OPERATION");
            a3.putExtra("deletions", arrayList);
            ajnw.a(context, a3);
        }
    }

    public final void a(Account account, String str) {
        ajmm ajmm = this.a;
        ajmm.d(account);
        synchronized (ajmm.f) {
            SharedPreferences.Editor edit = ajmm.b.a.edit();
            if (str != null) {
                String valueOf = String.valueOf(rmp.a(account));
                if (valueOf.length() == 0) {
                    new String("GCM ID uploaded for ");
                } else {
                    "GCM ID uploaded for ".concat(valueOf);
                }
                edit.putLong(ajmp.e(account), System.currentTimeMillis());
            }
            edit.apply();
        }
    }

    public final void a(Account account, boolean z) {
        ajmm ajmm = this.a;
        ajmm.d(account);
        synchronized (ajmm.f) {
            ajmp ajmp = ajmm.b;
            if (account != null) {
                Long valueOf = Long.valueOf(ajmp.a.getLong(ajmp.h(account), -1));
                SharedPreferences.Editor edit = ajmp.a.edit();
                edit.putBoolean(ajmp.g(account), z);
                if (!z) {
                    Long valueOf2 = Long.valueOf(System.currentTimeMillis());
                    if (valueOf.longValue() == -1) {
                        edit.putLong(ajmp.h(account), valueOf2.longValue());
                        valueOf = valueOf2;
                    }
                    ajjb.b("UlrAccountAuthenticationFailureDuration", TimeUnit.MILLISECONDS.toMinutes(valueOf2.longValue() - valueOf.longValue()));
                    String valueOf3 = String.valueOf(account);
                    long minutes = TimeUnit.MILLISECONDS.toMinutes(valueOf2.longValue() - valueOf.longValue());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 73);
                    sb.append("The ");
                    sb.append(valueOf3);
                    sb.append(" has been under authentication error for ");
                    sb.append(minutes);
                    sb.append(" minutes");
                    ajix.c("GCoreUlr", sb.toString());
                } else {
                    edit.putLong(ajmp.h(account), -1);
                }
                edit.apply();
            }
        }
    }
}
