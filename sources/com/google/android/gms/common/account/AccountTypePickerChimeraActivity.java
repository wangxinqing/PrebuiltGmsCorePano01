package com.google.android.gms.common.account;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountTypePickerChimeraActivity extends Activity {
    public ArrayList a;
    private final HashMap b = new HashMap();

    public static Intent a(Context context, iae iae) {
        String[] strArr;
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.common.account.AccountTypePickerActivity");
        intent.setFlags(524288);
        amzy amzy = iae.a;
        if (amzy != null) {
            strArr = (String[]) amzy.toArray(new String[amzy.size()]);
        } else {
            strArr = null;
        }
        intent.putExtra("allowableAccountTypes", strArr);
        return intent;
    }

    public final void onCreate(Bundle bundle) {
        HashSet hashSet;
        super.onCreate(bundle);
        String[] stringArrayExtra = getIntent().getStringArrayExtra("allowableAccountTypes");
        if (stringArrayExtra != null) {
            hashSet = new HashSet(r1);
            for (String add : stringArrayExtra) {
                hashSet.add(add);
            }
        } else {
            hashSet = null;
        }
        a();
        this.a = new ArrayList(this.b.size());
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            hyy hyy = (hyy) entry.getValue();
            if (hashSet == null || hashSet.contains(str)) {
                this.a.add(hyy);
            }
        }
        if (this.a.isEmpty()) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("errorMessage", "no allowable account types");
            setResult(-1, new Intent().putExtras(bundle2));
            finish();
        } else if (this.a.size() == 1) {
            a(((hyy) this.a.get(0)).a.type);
        } else {
            setContentView((int) R.layout.common_account_type_picker);
            ListView listView = (ListView) findViewById(16908298);
            listView.setAdapter(new hyx(this, this.a));
            listView.setChoiceMode(0);
            listView.setTextFilterEnabled(false);
            listView.setOnItemClickListener(new hyw(this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a() {
        /*
            r11 = this;
            java.lang.String r0 = "AccountChooser"
            qub r1 = defpackage.qub.a((android.content.Context) r11)
            android.accounts.AuthenticatorDescription[] r1 = r1.a()
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L_0x000d:
            if (r4 >= r2) goto L_0x009b
            r5 = r1[r4]
            r6 = 5
            r7 = 0
            java.lang.String r8 = r5.packageName     // Catch:{ NameNotFoundException -> 0x0064, NotFoundException -> 0x003e }
            android.content.Context r8 = r11.createPackageContext(r8, r3)     // Catch:{ NameNotFoundException -> 0x0064, NotFoundException -> 0x003e }
            android.content.res.Resources r9 = r8.getResources()     // Catch:{ NameNotFoundException -> 0x0064, NotFoundException -> 0x003e }
            int r10 = r5.iconId     // Catch:{ NameNotFoundException -> 0x0064, NotFoundException -> 0x003e }
            android.graphics.drawable.Drawable r9 = r9.getDrawable(r10)     // Catch:{ NameNotFoundException -> 0x0064, NotFoundException -> 0x003e }
            android.content.res.Resources r8 = r8.getResources()     // Catch:{ NameNotFoundException -> 0x003c, NotFoundException -> 0x003a }
            int r10 = r5.labelId     // Catch:{ NameNotFoundException -> 0x003c, NotFoundException -> 0x003a }
            java.lang.CharSequence r8 = r8.getText(r10)     // Catch:{ NameNotFoundException -> 0x003c, NotFoundException -> 0x003a }
            if (r8 == 0) goto L_0x0034
            java.lang.String r7 = r8.toString()     // Catch:{ NameNotFoundException -> 0x003c, NotFoundException -> 0x003a }
            goto L_0x0035
        L_0x0034:
        L_0x0035:
            java.lang.String r6 = r8.toString()     // Catch:{ NameNotFoundException -> 0x003c, NotFoundException -> 0x003a }
            goto L_0x008b
        L_0x003a:
            r8 = move-exception
            goto L_0x0040
        L_0x003c:
            r8 = move-exception
            goto L_0x0066
        L_0x003e:
            r8 = move-exception
            r9 = r7
        L_0x0040:
            boolean r6 = android.util.Log.isLoggable(r0, r6)
            if (r6 == 0) goto L_0x0063
            java.lang.String r6 = r5.type
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r8 = "No icon resource for account type "
            int r10 = r6.length()
            if (r10 != 0) goto L_0x005b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
            goto L_0x005f
        L_0x005b:
            java.lang.String r6 = r8.concat(r6)
        L_0x005f:
            android.util.Log.w(r0, r6)
            goto L_0x008a
        L_0x0063:
            goto L_0x008a
        L_0x0064:
            r8 = move-exception
            r9 = r7
        L_0x0066:
            boolean r6 = android.util.Log.isLoggable(r0, r6)
            if (r6 == 0) goto L_0x0089
            java.lang.String r6 = r5.type
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r8 = "No icon name for account type "
            int r10 = r6.length()
            if (r10 != 0) goto L_0x0081
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
            goto L_0x0085
        L_0x0081:
            java.lang.String r6 = r8.concat(r6)
        L_0x0085:
            android.util.Log.w(r0, r6)
            goto L_0x008a
        L_0x0089:
        L_0x008a:
            r6 = r7
        L_0x008b:
            hyy r7 = new hyy
            r7.<init>(r5, r6, r9)
            java.util.HashMap r6 = r11.b
            java.lang.String r5 = r5.type
            r6.put(r5, r7)
            int r4 = r4 + 1
            goto L_0x000d
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.account.AccountTypePickerChimeraActivity.a():void");
    }

    public final void a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("accountType", str);
        setResult(-1, new Intent().putExtras(bundle));
        finish();
    }
}
