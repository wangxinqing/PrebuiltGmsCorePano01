package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class t {
    private final Map a;

    public t(Context context) {
        HashMap hashMap;
        try {
            aowl.a();
            hashMap = new HashMap();
        } catch (GeneralSecurityException e) {
            f.a(context, "HybridConfig.register", (Throwable) e);
            hashMap = null;
        }
        this.a = hashMap;
    }

    public static final boolean b(String str) {
        return "doubleclick.net".equals(str) || Collections.unmodifiableMap(awhh.d().a).containsKey(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: aoub} */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e6, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00e9, code lost:
        return r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006d A[Catch:{ auda -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078 A[Catch:{ auda -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0079 A[Catch:{ auda -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0080 A[Catch:{ auda -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0081 A[Catch:{ auda -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096 A[Catch:{ auda -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0097 A[Catch:{ auda -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a2 A[Catch:{ auda -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a3 A[Catch:{ auda -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b3 A[Catch:{ auda -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b4 A[Catch:{ auda -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0049 A[LOOP:0: B:16:0x0049->B:75:0x0049, LOOP_END, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x008e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.aoub a(java.lang.String r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = b(r7)     // Catch:{ all -> 0x00ea }
            r1 = 0
            if (r0 == 0) goto L_0x00e5
            aotr r0 = defpackage.awhh.d()     // Catch:{ all -> 0x00ea }
            audr r0 = r0.a     // Catch:{ all -> 0x00ea }
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ all -> 0x00ea }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ all -> 0x00ea }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x00ea }
            java.util.Map r0 = r6.a     // Catch:{ all -> 0x00ea }
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x00ea }
            aoub r0 = (defpackage.aoub) r0     // Catch:{ all -> 0x00ea }
            goto L_0x0024
        L_0x0023:
            r0 = r1
        L_0x0024:
            if (r0 != 0) goto L_0x00e7
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00ea }
            if (r0 != 0) goto L_0x00db
            int r0 = r7.length()     // Catch:{ all -> 0x00ea }
            r2 = 2
            int r0 = r0 % r2
            if (r0 != 0) goto L_0x00db
            byte[] r0 = defpackage.jjp.a((java.lang.String) r7)     // Catch:{ all -> 0x00ea }
            com.google.android.gms.ads.identifier.settings.g r1 = new com.google.android.gms.ads.identifier.settings.g     // Catch:{ all -> 0x00ea }
            aoyw r3 = defpackage.aowr.a     // Catch:{ all -> 0x00ea }
            r1.<init>(r0, r3)     // Catch:{ all -> 0x00ea }
            aoza r0 = r1.a()     // Catch:{ auda -> 0x00d2 }
            aucx r1 = r0.b     // Catch:{ auda -> 0x00d2 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ auda -> 0x00d2 }
        L_0x0049:
            boolean r3 = r1.hasNext()     // Catch:{ auda -> 0x00d2 }
            if (r3 == 0) goto L_0x00c4
            java.lang.Object r3 = r1.next()     // Catch:{ auda -> 0x00d2 }
            aoyz r3 = (defpackage.aoyz) r3     // Catch:{ auda -> 0x00d2 }
            aoyu r4 = r3.a     // Catch:{ auda -> 0x00d2 }
            if (r4 == 0) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            aoyu r4 = defpackage.aoyu.d     // Catch:{ auda -> 0x00d2 }
        L_0x005c:
            int r4 = r4.c     // Catch:{ auda -> 0x00d2 }
            int r4 = defpackage.aoyt.b(r4)     // Catch:{ auda -> 0x00d2 }
            if (r4 != 0) goto L_0x0065
            goto L_0x0068
        L_0x0065:
            if (r4 != r2) goto L_0x0068
        L_0x0067:
            goto L_0x008e
        L_0x0068:
            aoyu r4 = r3.a     // Catch:{ auda -> 0x00d2 }
            if (r4 == 0) goto L_0x006d
        L_0x006c:
            goto L_0x0070
        L_0x006d:
            aoyu r4 = defpackage.aoyu.d     // Catch:{ auda -> 0x00d2 }
            goto L_0x006c
        L_0x0070:
            int r4 = r4.c     // Catch:{ auda -> 0x00d2 }
            int r4 = defpackage.aoyt.b(r4)     // Catch:{ auda -> 0x00d2 }
            if (r4 != 0) goto L_0x0079
            goto L_0x007c
        L_0x0079:
            r5 = 3
            if (r4 == r5) goto L_0x0067
        L_0x007c:
            aoyu r4 = r3.a     // Catch:{ auda -> 0x00d2 }
            if (r4 == 0) goto L_0x0081
            goto L_0x0083
        L_0x0081:
            aoyu r4 = defpackage.aoyu.d     // Catch:{ auda -> 0x00d2 }
        L_0x0083:
            int r4 = r4.c     // Catch:{ auda -> 0x00d2 }
            int r4 = defpackage.aoyt.b(r4)     // Catch:{ auda -> 0x00d2 }
            if (r4 == 0) goto L_0x0049
            r5 = 4
            if (r4 != r5) goto L_0x0049
        L_0x008e:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch:{ auda -> 0x00d2 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ auda -> 0x00d2 }
            aoyu r1 = r3.a     // Catch:{ auda -> 0x00d2 }
            if (r1 == 0) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            aoyu r1 = defpackage.aoyu.d     // Catch:{ auda -> 0x00d2 }
        L_0x0099:
            int r1 = r1.c     // Catch:{ auda -> 0x00d2 }
            int r1 = defpackage.aoyt.b(r1)     // Catch:{ auda -> 0x00d2 }
            r2 = 1
            if (r1 == 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r1 = 1
        L_0x00a4:
            int r1 = defpackage.aoyt.a(r1)     // Catch:{ auda -> 0x00d2 }
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch:{ auda -> 0x00d2 }
            r4 = 0
            r0[r4] = r1     // Catch:{ auda -> 0x00d2 }
            aoyu r1 = r3.a     // Catch:{ auda -> 0x00d2 }
            if (r1 == 0) goto L_0x00b4
            goto L_0x00b6
        L_0x00b4:
            aoyu r1 = defpackage.aoyu.d     // Catch:{ auda -> 0x00d2 }
        L_0x00b6:
            java.lang.String r1 = r1.a     // Catch:{ auda -> 0x00d2 }
            r0[r2] = r1     // Catch:{ auda -> 0x00d2 }
            java.lang.String r1 = "keyset contains key material of type %s for type url %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ auda -> 0x00d2 }
            r7.<init>(r0)     // Catch:{ auda -> 0x00d2 }
            throw r7     // Catch:{ auda -> 0x00d2 }
        L_0x00c4:
            aouj r0 = defpackage.aouj.a((defpackage.aoza) r0)     // Catch:{ auda -> 0x00d2 }
            java.lang.Class<aoub> r1 = defpackage.aoub.class
            java.lang.Object r0 = r0.a((java.lang.Class) r1)     // Catch:{ all -> 0x00ea }
            r1 = r0
            aoub r1 = (defpackage.aoub) r1     // Catch:{ all -> 0x00ea }
            goto L_0x00dc
        L_0x00d2:
            r7 = move-exception
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x00ea }
            java.lang.String r0 = "invalid keyset"
            r7.<init>(r0)     // Catch:{ all -> 0x00ea }
            throw r7     // Catch:{ all -> 0x00ea }
        L_0x00db:
        L_0x00dc:
            if (r1 != 0) goto L_0x00e0
            r0 = r1
            goto L_0x00e8
        L_0x00e0:
            java.util.Map r0 = r6.a     // Catch:{ all -> 0x00ea }
            r0.put(r7, r1)     // Catch:{ all -> 0x00ea }
        L_0x00e5:
            monitor-exit(r6)
            return r1
        L_0x00e7:
        L_0x00e8:
            monitor-exit(r6)
            return r0
        L_0x00ea:
            r7 = move-exception
            monitor-exit(r6)
            goto L_0x00ee
        L_0x00ed:
            throw r7
        L_0x00ee:
            goto L_0x00ed
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.settings.t.a(java.lang.String):aoub");
    }
}
