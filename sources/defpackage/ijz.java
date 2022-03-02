package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: ijz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ijz {
    public Map a;

    public ijz(Context context) {
        InputStream open;
        try {
            open = context.getAssets().open("Receivers.pb");
            HashMap hashMap = new HashMap();
            for (iye iye : ((iya) aucj.a((aucj) iya.b, open)).a) {
                for (iyd iyd : iye.c) {
                    ijx ijx = new ijx(iyd, iye.d);
                    ijy ijy = (ijy) hashMap.get(ijx);
                    if (ijy == null) {
                        ijy = new ijy(a(iyd), iye.d);
                        hashMap.put(ijx, ijy);
                    }
                    ijy.c.add(iye);
                }
            }
            this.a = anaf.a((Map) hashMap);
            if (open != null) {
                open.close();
                return;
            }
            return;
        } catch (IOException e) {
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    private static IntentFilter a(iyd iyd) {
        IntentFilter intentFilter = new IntentFilter();
        aucx aucx = iyd.a;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            intentFilter.addAction((String) aucx.get(i));
        }
        aucx aucx2 = iyd.b;
        int size2 = aucx2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            intentFilter.addCategory((String) aucx2.get(i2));
        }
        aucx aucx3 = iyd.c;
        int size3 = aucx3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ixz ixz = (ixz) aucx3.get(i3);
            if (!TextUtils.isEmpty(ixz.a)) {
                intentFilter.addDataScheme(ixz.a);
            }
            if (!TextUtils.isEmpty(ixz.b)) {
                String str = ixz.c;
                String str2 = ixz.b;
                if (TextUtils.isEmpty(str)) {
                    str = null;
                }
                intentFilter.addDataAuthority(str2, str);
            }
            if (!TextUtils.isEmpty(ixz.d)) {
                intentFilter.addDataPath(ixz.d, 0);
            }
            if (!TextUtils.isEmpty(ixz.e)) {
                intentFilter.addDataPath(ixz.d, 1);
            }
            if (!TextUtils.isEmpty(ixz.f)) {
                intentFilter.addDataPath(ixz.d, 2);
            }
            if (!TextUtils.isEmpty(ixz.g)) {
                try {
                    intentFilter.addDataType(ixz.g);
                } catch (IntentFilter.MalformedMimeTypeException e) {
                    Log.w("ReceiverRegistry", String.format(Locale.getDefault(), "Invalid mimetype %s on <receiver>", new Object[]{ixz.g}), e);
                }
            }
        }
        return intentFilter;
    }

    public static void a(SparseArray sparseArray, int i, List list) {
        if (!list.isEmpty()) {
            sparseArray.put(i, list);
        }
    }
}
