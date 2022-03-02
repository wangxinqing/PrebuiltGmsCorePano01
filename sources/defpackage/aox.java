package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: aox  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aox {
    private final Context a;
    private final String b;
    private final int c;
    private final String[] d;

    public aox(Context context, String str, int i, String[] strArr) {
        this.a = context;
        this.b = str;
        this.c = i;
        this.d = strArr;
    }

    private final SharedPreferences a() {
        return this.a.getSharedPreferences(this.b, 0);
    }

    public final int a(Uri uri, int i, int i2) {
        if (i2 == this.c) {
            return 0;
        }
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i2);
        for (String a2 : packagesForUid) {
            if (a(a2, uri.getAuthority()).a(uri.getPathSegments())) {
                return 0;
            }
        }
        String[] strArr = this.d;
        int length = strArr.length;
        int i3 = 0;
        while (i3 < length) {
            if (this.a.checkPermission(strArr[i3], i, i2) != 0) {
                i3++;
            } else {
                for (String a3 : packagesForUid) {
                    a(uri, a3);
                }
                return 0;
            }
        }
        return this.a.checkUriPermission(uri, i, i2, 2);
    }

    public final aow a(String str, String str2) {
        String str3 = str + "_" + str2;
        return new aow(a().getStringSet(str3, Collections.emptySet()), str3, a().getBoolean(str3 + "_all", false));
    }

    public final void a(Uri uri, String str) {
        aow a2 = a(str, uri.getAuthority());
        List<String> pathSegments = uri.getPathSegments();
        String[] strArr = (String[]) pathSegments.toArray(new String[pathSegments.size()]);
        int i = a2.a.b - 1;
        while (i >= 0) {
            String[] strArr2 = (String[]) a2.a.b(i);
            if (!aow.a(strArr2, strArr)) {
                if (aow.a(strArr, strArr2)) {
                    a2.a.c(i);
                }
                i--;
            } else {
                return;
            }
        }
        a2.a.add(strArr);
        a(a2);
    }

    public final synchronized void a(aow aow) {
        SharedPreferences.Editor edit = a().edit();
        String str = aow.b;
        ob obVar = new ob();
        Iterator it = aow.a.iterator();
        while (it.hasNext()) {
            String[] strArr = (String[]) it.next();
            String[] strArr2 = new String[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                strArr2[i] = Uri.encode(strArr[i]);
            }
            obVar.add(TextUtils.join("/", strArr2));
        }
        SharedPreferences.Editor putStringSet = edit.putStringSet(str, obVar);
        putStringSet.putBoolean(aow.b + "_all", aow.a(Collections.emptyList())).apply();
    }
}
