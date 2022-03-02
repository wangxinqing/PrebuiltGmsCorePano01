package com.google.android.location.settings;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.ScrollView;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationSettingsConfiguration;
import com.google.android.gms.location.LocationSettingsStates;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LocationSettingsCheckerChimeraActivity extends Activity implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener, aioj {
    public long a;
    public boolean b = false;
    public boolean c = false;
    public final ArrayList d = new ArrayList();
    private String e;
    private aion f;
    private aiom g;
    private LocationSettingsStates h;
    private String i;
    private boolean j = false;
    private LocationSettingsConfiguration k = null;

    private final void a(int i2) {
        Intent intent = new Intent();
        LocationSettingsStates locationSettingsStates = this.h;
        if (locationSettingsStates != null) {
            ivy.a((SafeParcelable) locationSettingsStates, intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES");
        }
        setResult(i2, intent);
        finish();
    }

    private final void b() {
        a(-1);
    }

    private final void c() {
        a(0);
    }

    public final void onBackPressed() {
        c();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        b("dialog_dismissed");
        c("dialog_canceled");
        c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r19, int r20) {
        /*
            r18 = this;
            r1 = r18
            r0 = r20
            java.lang.String r2 = "allowed_geolocation_origins"
            r3 = -2
            if (r0 == r3) goto L_0x019f
            r3 = -1
            if (r0 == r3) goto L_0x000e
            goto L_0x019e
        L_0x000e:
            java.lang.String r0 = "dialog_ok"
            r1.b(r0)
            java.lang.String r0 = "dialog_ok:"
            r1.c(r0)
            aiom r3 = r1.g
            if (r3 == 0) goto L_0x019e
            java.util.ArrayList r0 = r1.d
            int[] r4 = defpackage.aoog.a((java.util.Collection) r0)
            r5 = 0
            r3.f = r5
            boolean[] r0 = r3.e
            r6 = 5
            boolean r0 = r0[r6]
            r8 = 1
            if (r0 == 0) goto L_0x0039
            aiok r0 = new aiok
            r0.<init>(r3, r1)
            int r9 = r3.f
            int r9 = r9 + r8
            r3.f = r9
            r9 = r0
            goto L_0x003a
        L_0x0039:
            r9 = 0
        L_0x003a:
            aioi r0 = r3.d
            android.content.Context r0 = r0.a
            int r0 = defpackage.rns.c(r0)
            boolean[] r10 = r3.e
            boolean r11 = r10[r8]
            r13 = 2
            if (r11 != 0) goto L_0x004a
            goto L_0x0051
        L_0x004a:
            if (r0 != r8) goto L_0x004e
            r0 = 3
            goto L_0x0051
        L_0x004e:
            if (r0 != 0) goto L_0x0051
            r0 = 2
        L_0x0051:
            boolean r10 = r10[r5]
            if (r10 != 0) goto L_0x0057
            goto L_0x005f
        L_0x0057:
            if (r0 != r13) goto L_0x005b
            r10 = 3
            goto L_0x0060
        L_0x005b:
            if (r0 != 0) goto L_0x005f
            r10 = 1
            goto L_0x0060
        L_0x005f:
            r10 = r0
        L_0x0060:
            aiol r11 = new aiol
            r11.<init>(r3, r1)
            int r0 = r3.f
            int r0 = r0 + r8
            r3.f = r0
            boolean[] r0 = r3.e
            r14 = 4
            boolean r0 = r0[r14]
            if (r0 == 0) goto L_0x0107
            aioi r0 = r3.d
            android.content.Context r14 = r0.a
            java.lang.String[] r0 = defpackage.aeen.a
            android.content.ContentResolver r0 = r14.getContentResolver()     // Catch:{ RuntimeException -> 0x00dd }
            java.lang.String r15 = android.provider.Settings.Secure.getString(r0, r2)     // Catch:{ RuntimeException -> 0x00dd }
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ RuntimeException -> 0x00dd }
            r7.<init>()     // Catch:{ RuntimeException -> 0x00dd }
            boolean r16 = android.text.TextUtils.isEmpty(r15)     // Catch:{ RuntimeException -> 0x00dd }
            if (r16 != 0) goto L_0x00a3
            java.lang.String r5 = "\\s+"
            java.lang.String[] r5 = r15.split(r5)     // Catch:{ RuntimeException -> 0x00dd }
            int r15 = r5.length     // Catch:{ RuntimeException -> 0x00dd }
            r6 = 0
        L_0x0092:
            if (r6 >= r15) goto L_0x00a3
            r12 = r5[r6]     // Catch:{ RuntimeException -> 0x00dd }
            boolean r17 = android.text.TextUtils.isEmpty(r12)     // Catch:{ RuntimeException -> 0x00dd }
            if (r17 == 0) goto L_0x009d
            goto L_0x00a0
        L_0x009d:
            r7.add(r12)     // Catch:{ RuntimeException -> 0x00dd }
        L_0x00a0:
            int r6 = r6 + 1
            goto L_0x0092
        L_0x00a3:
            java.lang.String[] r5 = defpackage.aeen.a     // Catch:{ RuntimeException -> 0x00dd }
            int r6 = r5.length     // Catch:{ RuntimeException -> 0x00dd }
            r12 = 0
        L_0x00a7:
            if (r12 < r6) goto L_0x00d5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x00dd }
            r5.<init>()     // Catch:{ RuntimeException -> 0x00dd }
            java.util.Iterator r6 = r7.iterator()     // Catch:{ RuntimeException -> 0x00dd }
        L_0x00b2:
            boolean r7 = r6.hasNext()     // Catch:{ RuntimeException -> 0x00dd }
            if (r7 == 0) goto L_0x00cd
            java.lang.Object r7 = r6.next()     // Catch:{ RuntimeException -> 0x00dd }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ RuntimeException -> 0x00dd }
            int r12 = r5.length()     // Catch:{ RuntimeException -> 0x00dd }
            if (r12 <= 0) goto L_0x00c9
            r12 = 32
            r5.append(r12)     // Catch:{ RuntimeException -> 0x00dd }
        L_0x00c9:
            r5.append(r7)     // Catch:{ RuntimeException -> 0x00dd }
            goto L_0x00b2
        L_0x00cd:
            java.lang.String r5 = r5.toString()     // Catch:{ RuntimeException -> 0x00dd }
            android.provider.Settings.Secure.putString(r0, r2, r5)     // Catch:{ RuntimeException -> 0x00dd }
            goto L_0x00f4
        L_0x00d5:
            r15 = r5[r12]     // Catch:{ RuntimeException -> 0x00dd }
            r7.add(r15)     // Catch:{ RuntimeException -> 0x00dd }
            int r12 = r12 + 1
            goto L_0x00a7
        L_0x00dd:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Failed to set browser geolocation permissions: "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "UseLocationForServices"
            android.util.Log.e(r2, r0)
        L_0x00f4:
            android.content.ContentResolver r0 = r14.getContentResolver()
            java.lang.String r2 = "use_location_for_services"
            defpackage.aeed.b(r0, r2, r8)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "com.google.android.gsf.settings.GoogleLocationSettings.UPDATE_LOCATION_SETTINGS"
            r0.<init>(r2)
            r14.sendBroadcast(r0)
        L_0x0107:
            boolean[] r0 = r3.e
            boolean r0 = r0[r13]
            if (r0 == 0) goto L_0x0114
            aioi r0 = r3.d
            android.net.wifi.WifiManager r0 = r0.b
            r0.setWifiEnabled(r8)
        L_0x0114:
            boolean[] r0 = r3.e
            r2 = 3
            boolean r0 = r0[r2]
            if (r0 == 0) goto L_0x0124
            aioi r0 = r3.d
            android.content.ContentResolver r0 = r0.d
            java.lang.String r2 = "wifi_scan_always_enabled"
            android.provider.Settings.Global.putInt(r0, r2, r8)
        L_0x0124:
            boolean[] r0 = r3.e
            r2 = 7
            boolean r0 = r0[r2]
            if (r0 == 0) goto L_0x0134
            aioi r0 = r3.d
            android.content.ContentResolver r0 = r0.d
            java.lang.String r2 = "ble_scan_always_enabled"
            android.provider.Settings.Global.putInt(r0, r2, r8)
        L_0x0134:
            int r0 = r3.f
            if (r0 == 0) goto L_0x0139
            goto L_0x013c
        L_0x0139:
            r18.a()
        L_0x013c:
            boolean[] r0 = r3.e
            r2 = 5
            boolean r0 = r0[r2]
            if (r0 == 0) goto L_0x0173
            aioi r0 = r3.d
            android.bluetooth.BluetoothAdapter r2 = r0.f
            if (r2 != 0) goto L_0x014a
            goto L_0x0173
        L_0x014a:
            if (r9 == 0) goto L_0x0160
            com.google.android.location.internal.LocationSettings$2 r7 = new com.google.android.location.internal.LocationSettings$2
            java.lang.String r2 = "location"
            r7.<init>(r0, r2, r9)
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r5 = "android.bluetooth.adapter.action.STATE_CHANGED"
            r2.<init>(r5)
            android.content.Context r5 = r0.a
            r5.registerReceiver(r7, r2)
            goto L_0x0161
        L_0x0160:
            r7 = 0
        L_0x0161:
            android.bluetooth.BluetoothAdapter r2 = r0.f
            boolean r2 = r2.enable()
            if (r2 != 0) goto L_0x0173
            if (r7 == 0) goto L_0x0173
            android.content.Context r0 = r0.a
            r0.unregisterReceiver(r7)
            r9.a()
        L_0x0173:
            boolean[] r0 = r3.e
            r2 = 8
            boolean r0 = r0[r2]
            if (r0 == 0) goto L_0x0197
            aioi r0 = r3.d
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r2 > r5) goto L_0x018d
            java.lang.String r2 = android.os.Build.VERSION.CODENAME
            java.lang.String r5 = "N"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0197
        L_0x018d:
            android.os.UserManager r0 = r0.e
            if (r0 == 0) goto L_0x0197
            java.lang.String r2 = "no_share_location"
            r5 = 0
            r0.setUserRestriction(r2, r5)
        L_0x0197:
            aioi r0 = r3.d
            r2 = 5
            r0.a(r10, r11, r2, r4)
            return
        L_0x019e:
            return
        L_0x019f:
            java.lang.String r0 = "dialog_canceled"
            r1.b(r0)
            java.lang.String r0 = "dialog_canceled:"
            r1.c(r0)
            r18.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.location.settings.LocationSettingsCheckerChimeraActivity.onClick(android.content.DialogInterface, int):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            super.onCreate(r9)
            android.content.Context r0 = r8.getApplicationContext()
            defpackage.ahpx.a(r0)
            if (r9 == 0) goto L_0x0014
            java.lang.String r0 = "isDialogExpanded"
            boolean r9 = r9.getBoolean(r0)
            r8.c = r9
        L_0x0014:
            java.lang.String r9 = defpackage.jhg.a((com.google.android.chimera.Activity) r8)
            r8.e = r9
            if (r9 != 0) goto L_0x0027
            java.lang.String r9 = "LocationSettingsChecker"
            java.lang.String r0 = "Cannot find caller. Did you pass a negative request code?"
            android.util.Log.e(r9, r0)
            r8.c()
            return
        L_0x0027:
            android.content.Intent r9 = r8.getIntent()
            java.lang.String r0 = "locationSettingsRequests"
            boolean r1 = r9.hasExtra(r0)
            if (r1 == 0) goto L_0x0066
            android.os.Parcelable$Creator r1 = com.google.android.gms.location.LocationSettingsRequest.CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r0 = defpackage.ivy.a((android.content.Intent) r9, (java.lang.String) r0, (android.os.Parcelable.Creator) r1)
            com.google.android.gms.location.LocationSettingsRequest r0 = (com.google.android.gms.location.LocationSettingsRequest) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List r2 = r0.a()
            r1.<init>(r2)
            boolean r2 = r0.a
            r8.b = r2
            boolean r2 = r0.b
            r8.j = r2
            com.google.android.gms.location.LocationSettingsConfiguration r0 = r0.c
            r8.k = r0
            java.lang.String r0 = "originalPackageName"
            java.lang.String r0 = r9.getStringExtra(r0)
            if (r0 == 0) goto L_0x0065
            java.lang.String r2 = r8.e
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0065
            r8.e = r0
            goto L_0x006e
        L_0x0065:
            goto L_0x006e
        L_0x0066:
            android.os.Parcelable$Creator r0 = com.google.android.gms.location.LocationRequest.CREATOR
            java.lang.String r1 = "locationRequests"
            java.util.ArrayList r1 = defpackage.ivy.b(r9, r1, r0)
        L_0x006e:
            java.lang.String r0 = "locationSettingsStates"
            boolean r2 = r9.hasExtra(r0)
            if (r2 == 0) goto L_0x0081
            android.os.Parcelable$Creator r2 = com.google.android.gms.location.LocationSettingsStates.CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r9 = defpackage.ivy.a((android.content.Intent) r9, (java.lang.String) r0, (android.os.Parcelable.Creator) r2)
            com.google.android.gms.location.LocationSettingsStates r9 = (com.google.android.gms.location.LocationSettingsStates) r9
            r8.h = r9
        L_0x0081:
            if (r1 == 0) goto L_0x01dd
            java.lang.String r9 = "request_dialog"
            r8.a((java.lang.String) r9)
            aion r9 = new aion
            java.lang.String r0 = r8.e
            aioi r2 = new aioi
            r2.<init>(r8)
            r9.<init>(r8, r2, r0)
            r9.a((java.util.List) r1)
            boolean r0 = r8.j
            r9.a = r0
            r8.f = r9
            aiom r9 = r9.a()
            r8.g = r9
            int r0 = r9.a
            if (r0 == 0) goto L_0x01d3
            r1 = 8505(0x2139, float:1.1918E-41)
            if (r0 == r1) goto L_0x01c9
            r1 = 8500(0x2134, float:1.1911E-41)
            if (r0 == r1) goto L_0x01bf
            r1 = 8501(0x2135, float:1.1912E-41)
            if (r0 == r1) goto L_0x01b5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean[] r1 = r9.e
            r2 = 5
            boolean r3 = r1[r2]
            r4 = 7
            if (r3 == 0) goto L_0x00c8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0.add(r1)
            goto L_0x00d6
        L_0x00c8:
            boolean r1 = r1[r4]
            if (r1 == 0) goto L_0x00d6
            r1 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
        L_0x00d6:
            boolean[] r1 = r9.e
            r3 = 0
            boolean r4 = r1[r3]
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x00f4
            boolean r1 = r1[r6]
            if (r1 == 0) goto L_0x00eb
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0.add(r1)
            goto L_0x0100
        L_0x00eb:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.add(r1)
            goto L_0x0100
        L_0x00f4:
            boolean r1 = r1[r6]
            if (r1 == 0) goto L_0x0105
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r0.add(r1)
        L_0x0100:
            android.content.Context r1 = r9.c
            defpackage.jix.g(r1)
        L_0x0105:
            boolean[] r1 = r9.e
            r4 = 8
            boolean r1 = r1[r4]
            if (r1 != 0) goto L_0x010e
            goto L_0x0117
        L_0x010e:
            r1 = 10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
        L_0x0117:
            boolean[] r1 = r9.e
            boolean r4 = r1[r5]
            r5 = 4
            r7 = 3
            if (r4 == 0) goto L_0x0127
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0.add(r1)
            goto L_0x0133
        L_0x0127:
            boolean r1 = r1[r7]
            if (r1 == 0) goto L_0x0133
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0.add(r1)
        L_0x0133:
            boolean[] r1 = r9.e
            boolean r1 = r1[r6]
            if (r1 == 0) goto L_0x0140
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.add(r1)
        L_0x0140:
            boolean[] r9 = r9.e
            boolean r9 = r9[r5]
            if (r9 == 0) goto L_0x014e
            r9 = 6
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0.add(r9)
        L_0x014e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r1 = r0.size()
        L_0x0157:
            if (r3 >= r1) goto L_0x0197
            java.lang.Object r2 = r0.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            switch(r2) {
                case 0: goto L_0x018a;
                case 1: goto L_0x0187;
                case 2: goto L_0x0184;
                case 3: goto L_0x0181;
                case 4: goto L_0x017e;
                case 5: goto L_0x017b;
                case 6: goto L_0x0178;
                case 7: goto L_0x0175;
                case 8: goto L_0x0166;
                case 9: goto L_0x0172;
                case 10: goto L_0x016f;
                case 11: goto L_0x016c;
                default: goto L_0x0166;
            }
        L_0x0166:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>()
            throw r9
        L_0x016c:
            java.lang.String r2 = "automotiveofflinemaps"
            goto L_0x018c
        L_0x016f:
            java.lang.String r2 = "managedprofile"
            goto L_0x018c
        L_0x0172:
            java.lang.String r2 = "blescanning"
            goto L_0x018c
        L_0x0175:
            java.lang.String r2 = "bluetooth"
            goto L_0x018c
        L_0x0178:
            java.lang.String r2 = "lgaayl"
            goto L_0x018c
        L_0x017b:
            java.lang.String r2 = "glsconsent"
            goto L_0x018c
        L_0x017e:
            java.lang.String r2 = "wifiscanning"
            goto L_0x018c
        L_0x0181:
            java.lang.String r2 = "wifi"
            goto L_0x018c
        L_0x0184:
            java.lang.String r2 = "gpsnlp"
            goto L_0x018c
        L_0x0187:
            java.lang.String r2 = "nlp"
            goto L_0x018c
        L_0x018a:
            java.lang.String r2 = "gps"
        L_0x018c:
            r9.append(r2)
            r2 = 44
            r9.append(r2)
            int r3 = r3 + 1
            goto L_0x0157
        L_0x0197:
            int r1 = r9.length()
            int r1 = r1 + -1
            r9.setLength(r1)
            java.lang.String r9 = r9.toString()
            r8.i = r9
            aiom r9 = r8.g
            com.google.android.gms.location.LocationSettingsStates r9 = r9.b
            r8.h = r9
            ajow r9 = new ajow
            r9.<init>(r8, r0)
            r8.runOnUiThread(r9)
            return
        L_0x01b5:
            java.lang.String r9 = "user_suppressed"
            r8.a((java.lang.String) r9)
            r8.c()
            return
        L_0x01bf:
            java.lang.String r9 = "user_restricted"
            r8.a((java.lang.String) r9)
            r8.c()
            return
        L_0x01c9:
            java.lang.String r9 = "in_airplane_mode"
            r8.a((java.lang.String) r9)
            r8.c()
            return
        L_0x01d3:
            java.lang.String r9 = "all_satisfied"
            r8.a((java.lang.String) r9)
            r8.b()
            return
        L_0x01dd:
            r8.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.location.settings.LocationSettingsCheckerChimeraActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle != null) {
            this.c = bundle.getBoolean("isDialogExpanded");
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("isDialogExpanded", this.c);
    }

    private final void b(String str) {
        String str2 = this.i;
        StringBuilder sb = new StringBuilder(str.length() + 9 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("_actions:");
        sb.append(str2);
        String sb2 = sb.toString();
        LocationSettingsConfiguration locationSettingsConfiguration = this.k;
        if (locationSettingsConfiguration != null && !locationSettingsConfiguration.b.isEmpty()) {
            String str3 = this.k.b;
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 1 + String.valueOf(str3).length());
            sb3.append(sb2);
            sb3.append(":");
            sb3.append(str3);
            sb2 = sb3.toString();
        }
        ahpx.a("lsd_v2", str, this.e, 1);
        ahpx.a("lsd_v2", sb2, this.e, 1);
    }

    private final void c(String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.a;
        String valueOf = String.valueOf(this.i);
        String str2 = valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
        String str3 = this.e;
        dlc a2 = ahpx.a();
        if (a2 == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 42 + String.valueOf(str3).length());
            sb.append("location analytics disabled, can't send ");
            sb.append(str2);
            sb.append(", ");
            sb.append(str3);
            sb.toString();
            return;
        }
        String p = axwx.p();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 65 + String.valueOf(str3).length() + String.valueOf(p).length());
        sb2.append("Timing lsd_v2.");
        sb2.append(str2);
        sb2.append("=");
        sb2.append(str3);
        sb2.append(": ");
        sb2.append(elapsedRealtime);
        sb2.append(". AnalyticsUtil userDomain: ");
        sb2.append(p);
        sb2.toString();
        dkk dkk = new dkk();
        dkk.a("&utt", Long.toString(elapsedRealtime));
        dkk.a("utm_source=location");
        dkk.a("&utc", "lsd_v2");
        dkk.a("&utl", str3);
        dkk.a("&utv", str2);
        dkk.a(1, p);
        a2.a(dkk.a());
    }

    public static final void a(View view) {
        if (view != null && (view instanceof ScrollView)) {
            ScrollView scrollView = (ScrollView) view;
            scrollView.post(new ajox(scrollView));
        }
    }

    public final void a() {
        aiom a2 = this.f.a();
        this.g = a2;
        this.h = a2.b;
        if (ayap.a.a().bugfixLsdAlwaysOk() || this.g.a() == 0) {
            b();
        } else {
            c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009c, code lost:
        r5 = com.google.android.gms.R.drawable.quantum_ic_network_wifi_white_24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a7, code lost:
        r5 = com.google.android.gms.R.drawable.quantum_ic_my_location_white_24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b1, code lost:
        r8.d.add(java.lang.Integer.valueOf(r1));
        r3.setImageDrawable(getResources().getDrawable(r5));
        defpackage.ma.a(r3.getDrawable(), r9);
        r4.setText(r1);
        r12.addView(r2, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.text.SpannableString r9, android.text.style.ImageSpan r10, android.widget.TextView r11, android.widget.LinearLayout r12, java.util.List r13) {
        /*
            r8 = this;
            java.util.ArrayList r0 = r8.d
            r1 = 2131953162(0x7f13060a, float:1.9542787E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            r9.removeSpan(r10)
            r11.setText(r9)
            r9 = 2131100334(0x7f0602ae, float:1.7813047E38)
            int r9 = defpackage.kf.b(r8, r9)
            r10 = 0
            r0 = 0
        L_0x001b:
            int r1 = r13.size()
            if (r0 >= r1) goto L_0x00d4
            java.lang.Object r1 = r13.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r0 = r0 + 1
            android.view.LayoutInflater r2 = r8.getLayoutInflater()
            r3 = 2131624574(0x7f0e027e, float:1.8876332E38)
            android.view.View r2 = r2.inflate(r3, r12, r10)
            r3 = 2131428677(0x7f0b0545, float:1.8479005E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r4 = 2131429645(0x7f0b090d, float:1.8480969E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5 = 2131231870(0x7f08047e, float:1.8079833E38)
            r6 = 2131231985(0x7f0804f1, float:1.8080066E38)
            r7 = 2131231982(0x7f0804ee, float:1.808006E38)
            switch(r1) {
                case 0: goto L_0x00ab;
                case 1: goto L_0x00a4;
                case 2: goto L_0x00a0;
                case 3: goto L_0x0099;
                case 4: goto L_0x0095;
                case 5: goto L_0x008e;
                case 6: goto L_0x0087;
                case 7: goto L_0x0083;
                case 8: goto L_0x0056;
                case 9: goto L_0x007f;
                case 10: goto L_0x0078;
                case 11: goto L_0x0074;
                default: goto L_0x0056;
            }
        L_0x0056:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 28
            r2.<init>(r3)
            java.lang.String r3 = "Invalid message: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>()
            java.lang.String r3 = "LocationSettingsChecker"
            android.util.Log.wtf(r3, r1, r2)
            goto L_0x001b
        L_0x0074:
            r1 = 2131951980(0x7f13016c, float:1.954039E38)
            goto L_0x00a7
        L_0x0078:
            r1 = 2131953168(0x7f130610, float:1.95428E38)
            r5 = 2131232057(0x7f080539, float:1.8080213E38)
            goto L_0x00b1
        L_0x007f:
            r1 = 2131953157(0x7f130605, float:1.9542777E38)
            goto L_0x00b1
        L_0x0083:
            r1 = 2131952336(0x7f1302d0, float:1.9541112E38)
            goto L_0x00b1
        L_0x0087:
            r1 = 2131953164(0x7f13060c, float:1.9542791E38)
            r5 = 2131231847(0x7f080467, float:1.8079787E38)
            goto L_0x00b1
        L_0x008e:
            r1 = 2131953163(0x7f13060b, float:1.954279E38)
            r5 = 2131231950(0x7f0804ce, float:1.8079995E38)
            goto L_0x00b1
        L_0x0095:
            r1 = 2131953172(0x7f130614, float:1.9542807E38)
            goto L_0x009c
        L_0x0099:
            r1 = 2131953171(0x7f130613, float:1.9542805E38)
        L_0x009c:
            r5 = 2131231985(0x7f0804f1, float:1.8080066E38)
            goto L_0x00b1
        L_0x00a0:
            r1 = 2131953166(0x7f13060e, float:1.9542795E38)
            goto L_0x00a7
        L_0x00a4:
            r1 = 2131953167(0x7f13060f, float:1.9542797E38)
        L_0x00a7:
            r5 = 2131231982(0x7f0804ee, float:1.808006E38)
            goto L_0x00b1
        L_0x00ab:
            r1 = 2131953165(0x7f13060d, float:1.9542793E38)
            r5 = 2131231982(0x7f0804ee, float:1.808006E38)
        L_0x00b1:
            java.util.ArrayList r6 = r8.d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r6.add(r7)
            android.content.res.Resources r6 = r8.getResources()
            android.graphics.drawable.Drawable r5 = r6.getDrawable(r5)
            r3.setImageDrawable(r5)
            android.graphics.drawable.Drawable r3 = r3.getDrawable()
            defpackage.ma.a((android.graphics.drawable.Drawable) r3, (int) r9)
            r4.setText(r1)
            r12.addView(r2, r0)
            goto L_0x001b
        L_0x00d4:
            boolean r9 = defpackage.jkr.e()
            if (r9 != 0) goto L_0x00de
            r9 = 2131953159(0x7f130607, float:1.9542781E38)
            goto L_0x00e1
        L_0x00de:
            r9 = 2131953160(0x7f130608, float:1.9542783E38)
        L_0x00e1:
            java.util.ArrayList r13 = r8.d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r13.add(r0)
            boolean r13 = defpackage.jkr.g()
            if (r13 != 0) goto L_0x00f4
            r13 = 2131953158(0x7f130606, float:1.954278E38)
            goto L_0x00f7
        L_0x00f4:
            r13 = 2131953161(0x7f130609, float:1.9542785E38)
        L_0x00f7:
            java.util.ArrayList r0 = r8.d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r0.add(r1)
            r0 = 2131427951(0x7f0b026f, float:1.8477533E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r9 = r8.getString(r9)
            r2[r10] = r9
            java.lang.String r9 = r8.getString(r13, r2)
            r0.setText(r9)
            r12.setVisibility(r10)
            r11.setClickable(r10)
            r8.c = r1
            java.lang.String r9 = "dialog_expanded"
            r8.a((java.lang.String) r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.location.settings.LocationSettingsCheckerChimeraActivity.a(android.text.SpannableString, android.text.style.ImageSpan, android.widget.TextView, android.widget.LinearLayout, java.util.List):void");
    }

    public final void a(String str) {
        String str2;
        LocationSettingsConfiguration locationSettingsConfiguration = this.k;
        if (locationSettingsConfiguration == null || locationSettingsConfiguration.b.isEmpty()) {
            str2 = str;
        } else {
            String str3 = this.k.b;
            StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str3).length());
            sb.append(str);
            sb.append(":");
            sb.append(str3);
            str2 = sb.toString();
        }
        ahpx.a("lsd_v2", str, this.e, 1);
        ahpx.a("lsd_v2", str2, this.e, 1);
    }
}
