package com.google.android.gms.common.account;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.pano.chimera.Action;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NoTouchAccountTypePickerChimeraActivity extends aked {
    private final void a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("accountType", str);
        setResult(-1, new Intent().putExtras(bundle));
        finish();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0087 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.HashMap b() {
        /*
            r12 = this;
            java.lang.String r0 = "NoTouchAccntTypePicker"
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            qub r2 = defpackage.qub.a((android.content.Context) r12)
            android.accounts.AuthenticatorDescription[] r2 = r2.a()
            int r3 = r2.length
            r4 = 0
            r5 = 0
        L_0x0012:
            if (r5 >= r3) goto L_0x0095
            r6 = r2[r5]
            r7 = 5
            r8 = 0
            java.lang.String r9 = r6.packageName     // Catch:{ NameNotFoundException -> 0x0062, NotFoundException -> 0x003d }
            android.content.Context r9 = r12.createPackageContext(r9, r4)     // Catch:{ NameNotFoundException -> 0x0062, NotFoundException -> 0x003d }
            android.content.res.Resources r10 = r9.getResources()     // Catch:{ NameNotFoundException -> 0x0062, NotFoundException -> 0x003d }
            int r11 = r6.iconId     // Catch:{ NameNotFoundException -> 0x0062, NotFoundException -> 0x003d }
            r10.getDrawable(r11)     // Catch:{ NameNotFoundException -> 0x0062, NotFoundException -> 0x003d }
            android.content.res.Resources r9 = r9.getResources()     // Catch:{ NameNotFoundException -> 0x003b, NotFoundException -> 0x0039 }
            int r10 = r6.labelId     // Catch:{ NameNotFoundException -> 0x003b, NotFoundException -> 0x0039 }
            java.lang.CharSequence r9 = r9.getText(r10)     // Catch:{ NameNotFoundException -> 0x003b, NotFoundException -> 0x0039 }
            if (r9 == 0) goto L_0x0038
            java.lang.String r8 = r9.toString()     // Catch:{ NameNotFoundException -> 0x003b, NotFoundException -> 0x0039 }
            goto L_0x0087
        L_0x0038:
            goto L_0x0087
        L_0x0039:
            r9 = move-exception
            goto L_0x003e
        L_0x003b:
            r9 = move-exception
            goto L_0x0063
        L_0x003d:
            r9 = move-exception
        L_0x003e:
            boolean r7 = android.util.Log.isLoggable(r0, r7)
            if (r7 == 0) goto L_0x0061
            java.lang.String r7 = r6.type
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r9 = "No icon resource for account type "
            int r10 = r7.length()
            if (r10 != 0) goto L_0x0059
            java.lang.String r7 = new java.lang.String
            r7.<init>(r9)
            goto L_0x005d
        L_0x0059:
            java.lang.String r7 = r9.concat(r7)
        L_0x005d:
            android.util.Log.w(r0, r7)
            goto L_0x0087
        L_0x0061:
            goto L_0x0087
        L_0x0062:
            r9 = move-exception
        L_0x0063:
            boolean r7 = android.util.Log.isLoggable(r0, r7)
            if (r7 == 0) goto L_0x0086
            java.lang.String r7 = r6.type
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r9 = "No icon name for account type "
            int r10 = r7.length()
            if (r10 != 0) goto L_0x007e
            java.lang.String r7 = new java.lang.String
            r7.<init>(r9)
            goto L_0x0082
        L_0x007e:
            java.lang.String r7 = r9.concat(r7)
        L_0x0082:
            android.util.Log.w(r0, r7)
            goto L_0x0087
        L_0x0086:
        L_0x0087:
            hzh r7 = new hzh
            r7.<init>(r6, r8)
            java.lang.String r6 = r6.type
            r1.put(r6, r7)
            int r5 = r5 + 1
            goto L_0x0012
        L_0x0095:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.account.NoTouchAccountTypePickerChimeraActivity.b():java.util.HashMap");
    }

    public final void onCreate(Bundle bundle) {
        HashSet hashSet;
        super.onCreate(bundle);
        String[] stringArrayExtra = getIntent().getStringArrayExtra("allowableAccountTypes");
        if (stringArrayExtra != null) {
            hashSet = new HashSet(r2);
            for (String add : stringArrayExtra) {
                hashSet.add(add);
            }
        } else {
            hashSet = null;
        }
        HashSet hashSet2 = new HashSet();
        for (String add2 : getResources().getStringArray(R.array.account_type_blacklist)) {
            hashSet2.add(add2);
        }
        new HashMap();
        HashMap b = b();
        ArrayList arrayList = new ArrayList(b.size());
        for (Map.Entry entry : b.entrySet()) {
            String str = (String) entry.getKey();
            hzh hzh = (hzh) entry.getValue();
            if ((hashSet == null || hashSet.contains(str)) && !hashSet2.contains(str)) {
                arrayList.add(hzh);
            }
        }
        if (arrayList.isEmpty()) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("errorMessage", "no allowable account types");
            setResult(-1, new Intent().putExtras(bundle2));
            finish();
        } else if (arrayList.size() == 1) {
            a(((hzh) arrayList.get(0)).a.type);
        } else {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                hzh hzh2 = (hzh) arrayList.get(i);
                akdk akdk = new akdk();
                akdk.a = hzh2.a.type;
                akdk.b = hzh2.b;
                akdk.c = null;
                akdk.e = hzh2.a.packageName;
                akdk.f = hzh2.a.iconId;
                akdk.h = false;
                akdk.i = false;
                arrayList2.add(akdk.a());
            }
            a(akec.a(getString(R.string.choose_account_type_title), (String) null), akds.a(arrayList2));
        }
    }

    public final void a(Action action) {
        a(action.a);
    }
}
