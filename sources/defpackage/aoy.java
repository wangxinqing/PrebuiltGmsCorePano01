package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.slice.SliceSpec;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: aoy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoy {
    private final Context a;
    private final String b;

    public aoy(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    private final void a(Uri uri, Set set) {
        SharedPreferences.Editor edit = a().edit();
        edit.putStringSet("pinned_" + uri.toString(), set).apply();
    }

    public final synchronized ob b(Uri uri) {
        ob obVar = new ob();
        SharedPreferences a2 = a();
        String string = a2.getString("spec_names_" + uri.toString(), (String) null);
        String string2 = a2.getString("spec_revs_" + uri.toString(), (String) null);
        if (!TextUtils.isEmpty(string)) {
            if (!TextUtils.isEmpty(string2)) {
                String[] split = string.split(",", -1);
                String[] split2 = string2.split(",", -1);
                if (split.length == split2.length) {
                    for (int i = 0; i < split.length; i++) {
                        obVar.add(new SliceSpec(split[i], Integer.parseInt(split2[i])));
                    }
                    return obVar;
                }
                return new ob();
            }
        }
        return new ob();
    }

    private final void a(Uri uri, ob obVar) {
        int i = obVar.b;
        String[] strArr = new String[i];
        String[] strArr2 = new String[i];
        for (int i2 = 0; i2 < obVar.b; i2++) {
            strArr[i2] = ((SliceSpec) obVar.b(i2)).a;
            strArr2[i2] = String.valueOf(((SliceSpec) obVar.b(i2)).b);
        }
        SharedPreferences.Editor edit = a().edit();
        SharedPreferences.Editor putString = edit.putString("spec_names_" + uri.toString(), TextUtils.join(",", strArr));
        putString.putString("spec_revs_" + uri.toString(), TextUtils.join(",", strArr2)).apply();
    }

    public final SharedPreferences a() {
        SharedPreferences sharedPreferences = this.a.getSharedPreferences(this.b, 0);
        long j = sharedPreferences.getLong("last_boot", 0);
        long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        if (Math.abs(j - currentTimeMillis) > 2000) {
            sharedPreferences.edit().clear().putLong("last_boot", currentTimeMillis).apply();
        }
        return sharedPreferences;
    }

    public final Set a(Uri uri) {
        SharedPreferences a2 = a();
        return a2.getStringSet("pinned_" + uri.toString(), new ob());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(android.net.Uri r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Set r0 = r3.a(r4)     // Catch:{ all -> 0x002d }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x002d }
            r2 = 0
            if (r1 != 0) goto L_0x002b
            boolean r1 = r0.contains(r5)     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x002b
            r0.remove(r5)     // Catch:{ all -> 0x002d }
            r3.a((android.net.Uri) r4, (java.util.Set) r0)     // Catch:{ all -> 0x002d }
            ob r5 = new ob     // Catch:{ all -> 0x002d }
            r5.<init>()     // Catch:{ all -> 0x002d }
            r3.a((android.net.Uri) r4, (defpackage.ob) r5)     // Catch:{ all -> 0x002d }
            int r4 = r0.size()     // Catch:{ all -> 0x002d }
            if (r4 != 0) goto L_0x0029
            r4 = 1
            monitor-exit(r3)
            return r4
        L_0x0029:
            monitor-exit(r3)
            return r2
        L_0x002b:
            monitor-exit(r3)
            return r2
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoy.a(android.net.Uri, java.lang.String):boolean");
    }

    public final synchronized boolean a(Uri uri, String str, Set set) {
        boolean isEmpty;
        SliceSpec sliceSpec;
        Set a2 = a(uri);
        isEmpty = a2.isEmpty();
        a2.add(str);
        a(uri, a2);
        if (isEmpty) {
            a(uri, new ob((Collection) set));
        } else {
            ob b2 = b(uri);
            int i = 0;
            while (i < b2.b) {
                SliceSpec sliceSpec2 = (SliceSpec) b2.b(i);
                String str2 = sliceSpec2.a;
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        sliceSpec = null;
                        break;
                    }
                    sliceSpec = (SliceSpec) it.next();
                    if (op.a(sliceSpec.a, str2)) {
                        break;
                    }
                }
                if (sliceSpec == null) {
                    b2.c(i);
                    i--;
                } else if (sliceSpec.b < sliceSpec2.b) {
                    b2.c(i);
                    b2.add(sliceSpec);
                    i--;
                }
                i++;
            }
            a(uri, b2);
        }
        return isEmpty;
    }
}
