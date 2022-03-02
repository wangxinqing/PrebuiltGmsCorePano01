package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: nzr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class nzr {
    private static final Map e = new nz();
    private final Context a;
    public final SharedPreferences b;
    protected final String c = this.d.b;
    protected final HelpConfig d;

    public nzr(Context context, HelpConfig helpConfig) {
        this.a = context;
        this.d = helpConfig;
        this.b = context.getSharedPreferences("com.google.android.gms.googlehelp.SHARED_PREFS_FILE", 0);
    }

    public static String a(nzh nzh) {
        oll oll = nzh.u;
        return String.format("%s|%s", new Object[]{oll.b, Integer.valueOf(oll.c)});
    }

    public final void d(String str) {
        File file = new File(this.a.getFilesDir(), a(str));
        if (file.exists() && !file.delete()) {
            Log.e("gH_Persistence", str.length() == 0 ? new String("Failed to delete ") : "Failed to delete ".concat(str));
        }
    }

    public final int a(String str, int i) {
        return this.b.getInt(a(str), i);
    }

    public final long a(String str, long j) {
        return this.b.getLong(a(str), j);
    }

    public final audx a(String str, audx audx) {
        try {
            return oaq.a(new File(this.a.getFilesDir(), a(str)), audx);
        } catch (IOException e2) {
            Log.e("gH_Persistence", "Reading proto lite from file failed!", e2);
            return null;
        }
    }

    public String a(String str) {
        synchronized (e) {
            Map map = (Map) e.get(this.c);
            if (map == null) {
                map = new nz();
                e.put(this.c, map);
            }
            String str2 = (String) map.get(str);
            if (str2 != null) {
                return str2;
            }
            String format = String.format("%s:gh_%s", new Object[]{this.c, str});
            map.put(str, format);
            return format;
        }
    }

    public final String a(String str, String str2) {
        return this.b.getString(a(str), str2);
    }

    public final nzp a() {
        return new nzp(this, this.b.edit());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[Catch:{ IOException -> 0x0031 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.audx r3, java.lang.String r4) {
        /*
            r2 = this;
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0031 }
            android.content.Context r1 = r2.a     // Catch:{ IOException -> 0x0031 }
            java.io.File r1 = r1.getFilesDir()     // Catch:{ IOException -> 0x0031 }
            java.lang.String r4 = r2.a((java.lang.String) r4)     // Catch:{ IOException -> 0x0031 }
            r0.<init>(r1, r4)     // Catch:{ IOException -> 0x0031 }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0029 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0029 }
            r1.<init>(r0)     // Catch:{ all -> 0x0029 }
            r4.<init>(r1)     // Catch:{ all -> 0x0029 }
            byte[] r3 = r3.k()     // Catch:{ all -> 0x0027 }
            r4.write(r3)     // Catch:{ all -> 0x0027 }
            r4.flush()     // Catch:{ all -> 0x0027 }
            r4.close()     // Catch:{ IOException -> 0x0031 }
            return
        L_0x0027:
            r3 = move-exception
            goto L_0x002b
        L_0x0029:
            r3 = move-exception
            r4 = 0
        L_0x002b:
            if (r4 == 0) goto L_0x0030
            r4.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0030:
            throw r3     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            r3 = move-exception
            java.lang.String r4 = "gH_Persistence"
            java.lang.String r0 = "Writing proto lite to file failed!"
            android.util.Log.e(r4, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nzr.a(audx, java.lang.String):void");
    }

    public final boolean a(String str, boolean z) {
        return this.b.getBoolean(a(str), z);
    }
}
