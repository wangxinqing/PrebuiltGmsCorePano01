package defpackage;

import android.content.Context;
import com.google.android.chimera.AsyncTaskLoader;
import java.util.ArrayList;

/* renamed from: drc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class drc extends AsyncTaskLoader {
    private ArrayList a;
    private final long b;
    private final long c;
    private final int d;

    public drc(Context context, long j, long j2, int i) {
        super(context);
        this.b = j;
        this.c = j2;
        this.d = i;
    }

    /* renamed from: a */
    public final void deliverResult(ArrayList arrayList) {
        if (!isReset()) {
            this.a = arrayList;
            if (isStarted()) {
                super.deliverResult(arrayList);
            }
            super.deliverResult(arrayList);
        }
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            deliverResult(arrayList);
        }
        if (takeContentChanged() || this.a == null) {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        cancelLoad();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01c7, code lost:
        if (r2 != null) goto L_0x01bf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object loadInBackground() {
        /*
            r19 = this;
            r1 = r19
            boolean r0 = defpackage.jkr.c()
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 3
            if (r0 == 0) goto L_0x010f
            agvx r0 = defpackage.jcd.g
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x001c
            goto L_0x010f
        L_0x001c:
            java.util.ArrayList r0 = new java.util.ArrayList
            android.content.Context r6 = r19.getContext()
            android.content.ContentResolver r7 = r6.getContentResolver()
            long r8 = r1.b
            long r10 = r1.c
            int r6 = r1.d
            boolean r12 = defpackage.jkr.c()
            if (r12 == 0) goto L_0x0105
            agvx r12 = defpackage.jcd.g
            java.lang.Object r12 = r12.c()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x0042
            goto L_0x0105
        L_0x0042:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r5[r2] = r8
            java.lang.String r2 = java.lang.String.valueOf(r10)
            r5[r4] = r2
            java.lang.String r2 = java.lang.String.valueOf(r6)
            r5[r3] = r2
            android.net.Uri r8 = com.google.android.gms.common.stats.net.contentprovider.NetworkUsageChimeraContentProvider.g
            r9 = 0
            r10 = 0
            r12 = 0
            r11 = r5
            android.database.Cursor r2 = r7.query(r8, r9, r10, r11, r12)
            if (r2 != 0) goto L_0x006e
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x00fd }
            r13.<init>()     // Catch:{ all -> 0x00fd }
            goto L_0x010a
        L_0x006e:
            java.lang.String r3 = "from_datetime_updated_androidN"
            int r3 = r2.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x00fd }
            java.lang.String r4 = "to_datetime_updated_androidN"
            int r4 = r2.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x00fd }
            java.lang.String r5 = "tag_androidN"
            int r5 = r2.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x00fd }
            java.lang.String r6 = "uid_androidN"
            int r6 = r2.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x00fd }
            java.lang.String r7 = "device_state_androidN"
            int r7 = r2.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x00fd }
            java.lang.String r8 = "transport_type_androidN"
            int r8 = r2.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x00fd }
            java.lang.String r9 = "rxbytes_androidN"
            int r9 = r2.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x00fd }
            java.lang.String r10 = "rxpackets_androidN"
            int r10 = r2.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x00fd }
            java.lang.String r11 = "txbytes_androidN"
            int r11 = r2.getColumnIndexOrThrow(r11)     // Catch:{ all -> 0x00fd }
            java.lang.String r12 = "txpackets_androidN"
            int r12 = r2.getColumnIndexOrThrow(r12)     // Catch:{ all -> 0x00fd }
        L_0x00aa:
            boolean r14 = r2.moveToNext()     // Catch:{ all -> 0x00fd }
            if (r14 == 0) goto L_0x00f9
            jee r14 = new jee     // Catch:{ all -> 0x00fd }
            int r15 = r2.getInt(r5)     // Catch:{ all -> 0x00fd }
            r16 = r5
            int r5 = r2.getInt(r6)     // Catch:{ all -> 0x00fd }
            r17 = r6
            int r6 = r2.getInt(r7)     // Catch:{ all -> 0x00fd }
            r18 = r7
            int r7 = r2.getInt(r8)     // Catch:{ all -> 0x00fd }
            r14.<init>(r15, r5, r6, r7)     // Catch:{ all -> 0x00fd }
            long r5 = r2.getLong(r9)     // Catch:{ all -> 0x00fd }
            r14.r = r5     // Catch:{ all -> 0x00fd }
            long r5 = r2.getLong(r10)     // Catch:{ all -> 0x00fd }
            r14.s = r5     // Catch:{ all -> 0x00fd }
            long r5 = r2.getLong(r11)     // Catch:{ all -> 0x00fd }
            r14.t = r5     // Catch:{ all -> 0x00fd }
            long r5 = r2.getLong(r12)     // Catch:{ all -> 0x00fd }
            r14.u = r5     // Catch:{ all -> 0x00fd }
            long r5 = r2.getLong(r3)     // Catch:{ all -> 0x00fd }
            r14.p = r5     // Catch:{ all -> 0x00fd }
            long r5 = r2.getLong(r4)     // Catch:{ all -> 0x00fd }
            r14.q = r5     // Catch:{ all -> 0x00fd }
            r13.add(r14)     // Catch:{ all -> 0x00fd }
            r5 = r16
            r6 = r17
            r7 = r18
            goto L_0x00aa
        L_0x00f9:
            r2.close()
            goto L_0x010a
        L_0x00fd:
            r0 = move-exception
            if (r2 != 0) goto L_0x0101
            goto L_0x0104
        L_0x0101:
            r2.close()
        L_0x0104:
            throw r0
        L_0x0105:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x010a:
            r0.<init>(r13)
            goto L_0x01ce
        L_0x010f:
            java.util.ArrayList r0 = new java.util.ArrayList
            android.content.Context r6 = r19.getContext()
            android.content.ContentResolver r7 = r6.getContentResolver()
            long r8 = r1.b
            long r10 = r1.c
            int r6 = r1.d
            java.lang.String[] r12 = new java.lang.String[r5]
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r12[r2] = r8
            java.lang.String r2 = java.lang.String.valueOf(r10)
            r12[r4] = r2
            java.lang.String r2 = java.lang.String.valueOf(r6)
            r12[r3] = r2
            android.net.Uri r8 = com.google.android.gms.common.stats.net.contentprovider.NetworkUsageChimeraContentProvider.f
            r9 = 0
            r10 = 0
            r2 = 0
            r11 = r12
            r12 = r2
            android.database.Cursor r2 = r7.query(r8, r9, r10, r11, r12)
            if (r2 == 0) goto L_0x01c3
            int r6 = r2.getCount()     // Catch:{ all -> 0x01cf }
            if (r6 <= 0) goto L_0x01c3
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x01cf }
            int r7 = r2.getCount()     // Catch:{ all -> 0x01cf }
            r6.<init>(r7)     // Catch:{ all -> 0x01cf }
        L_0x014f:
            boolean r7 = r2.moveToNext()     // Catch:{ all -> 0x01cf }
            if (r7 == 0) goto L_0x01bf
            jdy r7 = new jdy     // Catch:{ all -> 0x01cf }
            java.lang.String r9 = "Na"
            int r10 = r2.getInt(r3)     // Catch:{ all -> 0x01cf }
            int r11 = r2.getInt(r5)     // Catch:{ all -> 0x01cf }
            r8 = 4
            int r12 = r2.getInt(r8)     // Catch:{ all -> 0x01cf }
            int r13 = r2.getInt(r4)     // Catch:{ all -> 0x01cf }
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x01cf }
            r8 = 5
            long r8 = r2.getLong(r8)     // Catch:{ all -> 0x01cf }
            r7.p = r8     // Catch:{ all -> 0x01cf }
            r8 = 6
            long r8 = r2.getLong(r8)     // Catch:{ all -> 0x01cf }
            r7.q = r8     // Catch:{ all -> 0x01cf }
            r8 = 7
            long r8 = r2.getLong(r8)     // Catch:{ all -> 0x01cf }
            r7.c = r8     // Catch:{ all -> 0x01cf }
            r8 = 8
            long r8 = r2.getLong(r8)     // Catch:{ all -> 0x01cf }
            r7.d = r8     // Catch:{ all -> 0x01cf }
            r8 = 9
            long r8 = r2.getLong(r8)     // Catch:{ all -> 0x01cf }
            r7.e = r8     // Catch:{ all -> 0x01cf }
            r8 = 10
            long r8 = r2.getLong(r8)     // Catch:{ all -> 0x01cf }
            r7.f = r8     // Catch:{ all -> 0x01cf }
            r8 = 11
            long r8 = r2.getLong(r8)     // Catch:{ all -> 0x01cf }
            r7.g = r8     // Catch:{ all -> 0x01cf }
            r8 = 12
            long r8 = r2.getLong(r8)     // Catch:{ all -> 0x01cf }
            r7.h = r8     // Catch:{ all -> 0x01cf }
            r8 = 13
            long r8 = r2.getLong(r8)     // Catch:{ all -> 0x01cf }
            r7.i = r8     // Catch:{ all -> 0x01cf }
            r8 = 14
            long r8 = r2.getLong(r8)     // Catch:{ all -> 0x01cf }
            r7.j = r8     // Catch:{ all -> 0x01cf }
            r6.add(r7)     // Catch:{ all -> 0x01cf }
            goto L_0x014f
        L_0x01bf:
            r2.close()
            goto L_0x01cb
        L_0x01c3:
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x01cf }
            if (r2 == 0) goto L_0x01ca
            goto L_0x01bf
        L_0x01ca:
        L_0x01cb:
            r0.<init>(r6)
        L_0x01ce:
            return r0
        L_0x01cf:
            r0 = move-exception
            if (r2 == 0) goto L_0x01d5
            r2.close()
        L_0x01d5:
            goto L_0x01d7
        L_0x01d6:
            throw r0
        L_0x01d7:
            goto L_0x01d6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drc.loadInBackground():java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        cancelLoad();
        this.a = null;
    }
}
