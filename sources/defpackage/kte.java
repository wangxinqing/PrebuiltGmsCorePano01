package defpackage;

import android.database.Cursor;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.Query;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: kte  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kte extends kta {
    private final String c;
    private Set d;
    private boolean e = false;
    private final Query f;
    private final lfr g;
    private final kea h;

    public kte(kwj kwj, Query query, String str, kea kea, Set set, lfr lfr) {
        super(3, kwj);
        iva.a((Object) str);
        this.c = str;
        iva.a((Object) query);
        this.f = query;
        this.h = kea;
        this.d = set;
        this.g = lfr;
    }

    public static Set a(lrw lrw) {
        HashSet hashSet = new HashSet();
        if (lrw != null) {
            Iterator it = new jzt(lrw.a).iterator();
            while (it.hasNext()) {
                hashSet.add(((jzr) it.next()).a());
            }
        }
        return hashSet;
    }

    public static kta a(kwj kwj) {
        return new kta(3, kwj);
    }

    public final void a(String str, boolean z) {
        if (this.c.equals(str)) {
            a(!z, true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: lrw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: lrw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: lrw} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r11, boolean r12) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            if (r11 == 0) goto L_0x002a
            kea r11 = r10.h     // Catch:{ all -> 0x0024 }
            kec r3 = r11.e     // Catch:{ all -> 0x0024 }
            keq r3 = r3.r     // Catch:{ all -> 0x0024 }
            java.lang.String r4 = r11.a     // Catch:{ all -> 0x0024 }
            java.util.List r3 = r3.a(r4)     // Catch:{ all -> 0x0024 }
            kec r4 = r11.e     // Catch:{ all -> 0x0024 }
            com.google.android.gms.drive.query.Query r5 = r11.b     // Catch:{ all -> 0x0024 }
            java.lang.String r6 = r11.c     // Catch:{ all -> 0x0024 }
            java.util.Set r11 = r11.d     // Catch:{ all -> 0x0024 }
            lrw r11 = r4.a((com.google.android.gms.drive.query.Query) r5, (java.lang.String) r6, (java.util.Set) r11, (java.util.List) r3)     // Catch:{ all -> 0x0024 }
            java.util.Set r3 = a((defpackage.lrw) r11)     // Catch:{ all -> 0x0091 }
            r10.d = r3     // Catch:{ all -> 0x0091 }
            goto L_0x002b
        L_0x0024:
            r11 = move-exception
            r12 = r11
            r3 = r2
            r0 = 0
            goto L_0x0095
        L_0x002a:
            r11 = r2
        L_0x002b:
            boolean r3 = r10.e     // Catch:{ all -> 0x0091 }
            if (r3 == 0) goto L_0x0031
            r4 = 0
            goto L_0x0036
        L_0x0031:
            if (r12 == 0) goto L_0x0035
            r4 = 1
            goto L_0x0036
        L_0x0035:
            r4 = 0
        L_0x0036:
            r12 = r12 | r3
            r10.e = r12     // Catch:{ all -> 0x0091 }
            com.google.android.gms.drive.events.QueryResultEventParcelable r3 = new com.google.android.gms.drive.events.QueryResultEventParcelable     // Catch:{ all -> 0x0091 }
            if (r11 == 0) goto L_0x0040
            com.google.android.gms.common.data.DataHolder r5 = r11.a     // Catch:{ all -> 0x0091 }
            goto L_0x0041
        L_0x0040:
            r5 = r2
        L_0x0041:
            r3.<init>(r5, r4, r12)     // Catch:{ all -> 0x0091 }
            kwj r5 = r10.b     // Catch:{ all -> 0x008d }
            com.google.android.gms.drive.internal.OnEventResponse r6 = new com.google.android.gms.drive.internal.OnEventResponse     // Catch:{ all -> 0x008d }
            r6.<init>(r3)     // Catch:{ all -> 0x008d }
            r5.a(r6)     // Catch:{ all -> 0x008d }
            if (r11 == 0) goto L_0x005c
            com.google.android.gms.common.data.DataHolder r2 = r11.a     // Catch:{ all -> 0x005a }
            int r2 = r2.h     // Catch:{ all -> 0x005a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x005a }
            r7 = r2
            goto L_0x005d
        L_0x005a:
            r12 = move-exception
            goto L_0x0094
        L_0x005c:
            r7 = r2
        L_0x005d:
            lfr r2 = r10.g     // Catch:{ all -> 0x005a }
            lfv r2 = (defpackage.lfv) r2     // Catch:{ all -> 0x005a }
            lgc r2 = r2.d()     // Catch:{ all -> 0x005a }
            r5 = 2
            r6 = 35
            r2.c(r5, r6)     // Catch:{ all -> 0x005a }
            com.google.android.gms.drive.query.Query r5 = r10.f     // Catch:{ all -> 0x005a }
            r6 = 1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x005a }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x005a }
            r4 = r2
            r4.a(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x005a }
            r2.c(r1)     // Catch:{ all -> 0x005a }
            r2.j()     // Catch:{ all -> 0x005a }
            r2.a()     // Catch:{ all -> 0x005a }
            if (r11 == 0) goto L_0x008c
            boolean r12 = r3.a
            if (r12 == 0) goto L_0x008c
            r11.a()
        L_0x008c:
            return
        L_0x008d:
            r12 = move-exception
            r2 = r11
            r0 = 0
            goto L_0x0095
        L_0x0091:
            r12 = move-exception
            r3 = r2
            r0 = 0
        L_0x0094:
            r2 = r11
        L_0x0095:
            if (r2 == 0) goto L_0x00a2
            if (r0 == 0) goto L_0x009f
            if (r3 == 0) goto L_0x00a2
            boolean r11 = r3.a
            if (r11 == 0) goto L_0x00a2
        L_0x009f:
            r2.a()
        L_0x00a2:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kte.a(boolean, boolean):void");
    }

    public final boolean a(Set set) {
        if (!Collections.disjoint(this.d, set)) {
            a(true, false);
            return true;
        }
        kea kea = this.h;
        kqy a = new lil(kea.e.d, kea.e.r.a(kea.a)).a(kea.b);
        kec kec = kea.e;
        kkf kkf = kec.e;
        khq khq = kec.d;
        if (!set.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((DriveId) it.next()).b));
            }
            kqy a2 = kqz.a(a, lrr.a(khq), lrr.a(kmk.a.a.a(), (Iterable) arrayList), kne.SUBSCRIBED.aB.f());
            String d2 = kjr.d(khq);
            String str = a2.a;
            StringBuilder sb = new StringBuilder(d2.length() + 29 + String.valueOf(str).length());
            sb.append("SELECT 1 FROM ");
            sb.append(d2);
            sb.append(" WHERE ");
            sb.append(str);
            sb.append(" LIMIT 1");
            Cursor a3 = ((kjp) kkf).a.a(sb.toString(), a2.a());
            try {
                if (a3.moveToFirst()) {
                    a(true, false);
                    return true;
                }
            } finally {
                a3.close();
            }
        }
        return false;
    }
}
