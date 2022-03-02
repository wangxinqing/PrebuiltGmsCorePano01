package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: gwb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gwb {
    public static void a(Context context, ContentValues contentValues, ContentResolver contentResolver) {
        if (aekv.a() && aekv.b(context) && awrq.a.a().G()) {
            SharedPreferences a = ikz.a(context);
            SharedPreferences.Editor edit = a.edit();
            String[] a2 = iks.a();
            for (String str : a2) {
                if (contentValues.containsKey(str)) {
                    String asString = contentValues.getAsString(str);
                    if (asString != null) {
                        edit.putString(str, asString);
                    } else {
                        edit.remove(str);
                    }
                } else {
                    String a3 = aeeg.a(contentResolver, str, (String) null);
                    if (a3 != null) {
                        edit.putString(str, a3);
                    }
                }
            }
            if (awrq.a.a().H()) {
                HashSet hashSet = new HashSet(Arrays.asList(a2));
                for (String next : a.getAll().keySet()) {
                    if (!next.startsWith("gms:chimera:") && !hashSet.contains(next)) {
                        edit.remove(next);
                    }
                }
            }
            if (!edit.commit()) {
                Log.w("CheckinResponseProcess", "Failed to commit gservices values to direct boot cache");
            }
        }
    }

    public static Intent[] a(gzs gzs) {
        String str;
        int size = gzs.d.size();
        Intent[] intentArr = new Intent[size];
        for (int i = 0; i < size; i++) {
            haj haj = (haj) gzs.d.get(i);
            Intent intent = new Intent();
            intentArr[i] = intent;
            if ((haj.a & 1) != 0) {
                intent.setAction(haj.b);
            }
            if ((haj.a & 16) != 0) {
                intent.setPackage(haj.f);
            }
            if ((haj.a & 2) != 0) {
                intent.setData(Uri.parse(haj.c));
            }
            if ((haj.a & 4) != 0) {
                intent.setType(haj.d);
            }
            aucx aucx = haj.e;
            int size2 = aucx.size();
            for (int i2 = 0; i2 < size2; i2++) {
                hai hai = (hai) aucx.get(i2);
                int i3 = hai.a;
                if ((i3 & 1) != 0) {
                    if ((i3 & 2) != 0) {
                        str = hai.c;
                    } else {
                        str = "";
                    }
                    intent.putExtra(hai.b, str);
                }
            }
        }
        return intentArr;
    }
}
