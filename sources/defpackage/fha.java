package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: fha  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fha {
    public static final qcc a = qcb.a(fgz.a);
    private final SharedPreferences b;

    public fha(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.auth.api.credentials.save_confirmation_dialog_manager", 0);
    }

    public final synchronized void a(String str) {
        this.b.edit().putLong(str, System.currentTimeMillis()).commit();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean b(java.lang.String r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            android.content.SharedPreferences r0 = r6.b     // Catch:{ all -> 0x0039 }
            boolean r0 = r0.contains(r7)     // Catch:{ all -> 0x0039 }
            r1 = 1
            if (r0 == 0) goto L_0x0034
            android.content.SharedPreferences r0 = r6.b     // Catch:{ all -> 0x0039 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0039 }
            long r2 = r0.getLong(r7, r2)     // Catch:{ all -> 0x0039 }
            awoh r0 = defpackage.awoh.a     // Catch:{ all -> 0x0039 }
            awoi r0 = r0.a()     // Catch:{ all -> 0x0039 }
            long r4 = r0.b()     // Catch:{ all -> 0x0039 }
            long r2 = r2 + r4
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0039 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0036
            android.content.SharedPreferences r0 = r6.b     // Catch:{ all -> 0x0039 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0039 }
            android.content.SharedPreferences$Editor r7 = r0.remove(r7)     // Catch:{ all -> 0x0039 }
            r7.commit()     // Catch:{ all -> 0x0039 }
        L_0x0034:
            monitor-exit(r6)
            return r1
        L_0x0036:
            r7 = 0
            monitor-exit(r6)
            return r7
        L_0x0039:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fha.b(java.lang.String):boolean");
    }
}
