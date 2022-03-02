package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.CalendarContract;
import java.util.NoSuchElementException;

/* renamed from: ppe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ppe implements pws {
    private static final ppa[] a = new ppa[0];
    private final long b;
    private final long c;
    private final long d;
    private final ppc e;
    private ppd f;
    private Cursor g;
    private Cursor h;

    public ppe(ContentResolver contentResolver, long j) {
        this.b = j;
        this.c = j - ((Long) ozx.ba.c()).longValue();
        this.d = j + ((Long) ozx.bb.c()).longValue();
        Cursor query = contentResolver.query(CalendarContract.Instances.CONTENT_URI.buildUpon().appendPath(Long.toString(this.c)).appendPath(Long.toString(this.d)).build(), ppf.a, "COALESCE(eventStatus,0)<>2", (String[]) null, "event_id,begin,end");
        this.g = query;
        if (query == null) {
            this.e = null;
            pnz.e("Calendar Instances query failed");
            return;
        }
        query.moveToFirst();
        int min = Math.min(((Integer) ozx.bc.c()).intValue(), 100);
        if (min > 0) {
            this.e = new ppc(min);
            Cursor query2 = contentResolver.query(CalendarContract.Attendees.CONTENT_URI, ppf.b, "COALESCE(attendeeType,0)<>3", (String[]) null, "event_id");
            this.h = query2;
            if (query2 == null) {
                pnz.e("Calendar Attendees query failed");
            } else if (!query2.moveToFirst()) {
                this.h.close();
            }
            a();
        }
        this.e = null;
        this.h = null;
        a();
    }

    /* JADX WARNING: type inference failed for: r2v12, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a() {
        /*
            r19 = this;
            r0 = r19
        L_0x0002:
            android.database.Cursor r1 = r0.g
            boolean r1 = r1.isAfterLast()
            r2 = 2
            r3 = 1
            if (r1 != 0) goto L_0x002a
            android.database.Cursor r1 = r0.g
            java.lang.String[] r4 = defpackage.ppf.a
            java.lang.String r4 = r1.getString(r3)
            boolean r4 = defpackage.amrk.a((java.lang.String) r4)
            if (r4 == 0) goto L_0x002a
            java.lang.String r1 = r1.getString(r2)
            boolean r1 = defpackage.amrk.a((java.lang.String) r1)
            if (r1 == 0) goto L_0x002a
            android.database.Cursor r1 = r0.g
            r1.moveToNext()
            goto L_0x0002
        L_0x002a:
            android.database.Cursor r1 = r0.g
            boolean r1 = r1.isAfterLast()
            if (r1 != 0) goto L_0x01fb
            ppd r1 = new ppd
            r1.<init>()
            android.database.Cursor r4 = r0.g
            r5 = 0
            long r6 = r4.getLong(r5)
            r1.a = r6
            android.database.Cursor r4 = r0.g
            java.lang.String r4 = r4.getString(r3)
            java.lang.String r4 = defpackage.amrk.c(r4)
            r1.b = r4
            android.database.Cursor r4 = r0.g
            java.lang.String r4 = r4.getString(r2)
            java.lang.String r4 = defpackage.amrk.c(r4)
            r1.c = r4
            android.database.Cursor r4 = r0.g
            r6 = 3
            java.lang.String r4 = r4.getString(r6)
            java.lang.String r4 = defpackage.amrk.c(r4)
            r1.d = r4
            java.lang.String r4 = r1.b
            r7 = 0
            if (r4 == 0) goto L_0x006b
            goto L_0x0071
        L_0x006b:
            java.lang.String r4 = r1.c
            r1.b = r4
            r1.c = r7
        L_0x0071:
            android.database.Cursor r4 = r0.g
            r8 = 6
            long r8 = r4.getLong(r8)
            r10 = 0
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x0080
            r4 = 1
            goto L_0x0081
        L_0x0080:
            r4 = 0
        L_0x0081:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.e = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x008c:
            ppl r8 = new ppl
            r8.<init>()
            android.database.Cursor r9 = r0.g
            r12 = 4
            long r13 = r9.getLong(r12)
            r8.a = r13
            android.database.Cursor r9 = r0.g
            r13 = 5
            long r13 = r9.getLong(r13)
            r8.b = r13
            long r6 = r8.a
            int r15 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x00aa
            goto L_0x00b9
        L_0x00aa:
            long r2 = r0.d
            int r16 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r16 > 0) goto L_0x00b9
            long r2 = r0.c
            int r6 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r6 < 0) goto L_0x00b9
            r4.add(r8)
        L_0x00b9:
            android.database.Cursor r2 = r0.g
            r2.moveToNext()
            android.database.Cursor r2 = r0.g
            boolean r2 = r2.isAfterLast()
            if (r2 != 0) goto L_0x00d8
            android.database.Cursor r2 = r0.g
            long r2 = r2.getLong(r5)
            long r6 = r1.a
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x00d3
            goto L_0x00d8
        L_0x00d3:
            r2 = 2
            r3 = 1
            r6 = 3
            r7 = 0
            goto L_0x008c
        L_0x00d8:
            long r2 = r0.b
            ppl[] r6 = new defpackage.ppl[r5]
            java.lang.Object[] r4 = r4.toArray(r6)
            ppl[] r4 = (defpackage.ppl[]) r4
            java.lang.String[] r6 = defpackage.ppf.a
            int r6 = r4.length
            r7 = 100
            if (r6 <= r7) goto L_0x011f
            r8 = 0
        L_0x00ea:
            int r13 = r6 - r8
            if (r13 <= r7) goto L_0x0115
            int r13 = r6 + -1
            r14 = r4[r8]
            r17 = r6
            long r5 = r14.b
            long r5 = r2 - r5
            long r5 = java.lang.Math.max(r10, r5)
            r14 = r4[r13]
            r18 = r13
            long r12 = r14.a
            long r12 = r12 - r2
            long r12 = java.lang.Math.max(r10, r12)
            int r14 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x0110
            int r8 = r8 + 1
            r6 = r17
            goto L_0x0112
        L_0x0110:
            r6 = r18
        L_0x0112:
            r5 = 0
            r12 = 4
            goto L_0x00ea
        L_0x0115:
            r17 = r6
            java.lang.Object[] r2 = java.util.Arrays.copyOfRange(r4, r8, r6)
            r4 = r2
            ppl[] r4 = (defpackage.ppl[]) r4
            goto L_0x0120
        L_0x011f:
        L_0x0120:
            r1.f = r4
            long r2 = r1.a
            ppc r4 = r0.e
            if (r4 != 0) goto L_0x012a
        L_0x0128:
            goto L_0x01f4
        L_0x012a:
            android.database.Cursor r5 = r0.h
            if (r5 == 0) goto L_0x0128
            java.util.PriorityQueue r4 = r4.a
            boolean r4 = r4.isEmpty()
            defpackage.iva.a((boolean) r4)
            android.database.Cursor r4 = r0.h
            boolean r4 = r4.isAfterLast()
            r5 = 1
            r4 = r4 ^ r5
            defpackage.iva.a((boolean) r4)
        L_0x0142:
            android.database.Cursor r4 = r0.h
            r5 = 0
            long r6 = r4.getLong(r5)
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x014f
            goto L_0x01c1
        L_0x014f:
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x01ad
            ppc r4 = r0.e
            android.database.Cursor r6 = r0.h
            r7 = 1
            java.lang.String r6 = r6.getString(r7)
            android.database.Cursor r8 = r0.h
            r10 = 2
            java.lang.String r8 = r8.getString(r10)
            android.database.Cursor r11 = r0.h
            r12 = 4
            boolean r11 = r11.isNull(r12)
            if (r11 != 0) goto L_0x0173
            android.database.Cursor r11 = r0.h
            int r11 = r11.getInt(r12)
            goto L_0x0174
        L_0x0173:
            r11 = 0
        L_0x0174:
            android.database.Cursor r13 = r0.h
            r9 = 3
            boolean r13 = r13.isNull(r9)
            if (r13 != 0) goto L_0x0184
            android.database.Cursor r13 = r0.h
            int r13 = r13.getInt(r9)
            goto L_0x0185
        L_0x0184:
            r13 = 0
        L_0x0185:
            java.lang.String r6 = defpackage.amrk.c(r6)
            java.lang.String r8 = defpackage.amrk.c(r8)
            if (r6 == 0) goto L_0x0190
            goto L_0x0193
        L_0x0190:
            if (r8 == 0) goto L_0x01b1
            r6 = r8
        L_0x0193:
            java.util.PriorityQueue r14 = r4.a
            ppb r5 = new ppb
            r5.<init>(r6, r8, r11, r13)
            r14.add(r5)
            java.util.PriorityQueue r5 = r4.a
            int r5 = r5.size()
            int r6 = r4.b
            if (r5 <= r6) goto L_0x01b1
            java.util.PriorityQueue r4 = r4.a
            r4.poll()
            goto L_0x01b1
        L_0x01ad:
            r7 = 1
            r9 = 3
            r10 = 2
            r12 = 4
        L_0x01b1:
            android.database.Cursor r4 = r0.h
            boolean r4 = r4.moveToNext()
            if (r4 != 0) goto L_0x01f1
            android.database.Cursor r2 = r0.h
            r2.close()
            r4 = 0
            r0.h = r4
        L_0x01c1:
            ppc r2 = r0.e
            java.util.PriorityQueue r3 = r2.a
            int r3 = r3.size()
            ppa[] r3 = new defpackage.ppa[r3]
            java.util.PriorityQueue r2 = r2.a
            java.util.Iterator r2 = r2.iterator()
            r5 = 0
        L_0x01d2:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x01e6
            int r4 = r5 + 1
            java.lang.Object r6 = r2.next()
            ppb r6 = (defpackage.ppb) r6
            ppa r6 = r6.a
            r3[r5] = r6
            r5 = r4
            goto L_0x01d2
        L_0x01e6:
            java.util.Arrays.sort(r3)
            ppc r2 = r0.e
            java.util.PriorityQueue r2 = r2.a
            r2.clear()
            goto L_0x01f6
        L_0x01f1:
            r4 = 0
            goto L_0x0142
        L_0x01f4:
            ppa[] r3 = a
        L_0x01f6:
            r1.g = r3
            r0.f = r1
            return
        L_0x01fb:
            r19.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ppe.a():void");
    }

    public final void close() {
        Cursor cursor = this.h;
        if (cursor != null) {
            cursor.close();
            this.h = null;
        }
        Cursor cursor2 = this.g;
        if (cursor2 != null) {
            cursor2.close();
            this.g = null;
            this.f = null;
        }
    }

    public final boolean hasNext() {
        return this.f != null;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        ppd ppd = this.f;
        if (ppd != null) {
            a();
            return ppd;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
