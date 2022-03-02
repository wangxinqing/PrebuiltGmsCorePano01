package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.people.identity.internal.models.PersonImpl;
import com.google.android.gms.people.identity.models.Person;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ablj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ablj extends ably {
    private String[] c;
    private abgj d;

    public ablj(Context context, Person person, abgj abgj) {
        super(context);
        if (person.o()) {
            ArrayList a = jhx.a();
            List list = ((PersonImpl) person).i;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                a.add(((Person.Emails) list.get(i)).i());
            }
            if (a.size() > 0) {
                this.c = (String[]) a.toArray(new String[a.size()]);
            }
            this.d = abgj;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0142 A[Catch:{ all -> 0x01fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x015c A[Catch:{ all -> 0x01fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x015d A[Catch:{ all -> 0x01fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0183 A[Catch:{ all -> 0x01fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0184 A[Catch:{ all -> 0x01fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01c2 A[Catch:{ all -> 0x01fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01c3 A[Catch:{ all -> 0x01fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e0 A[Catch:{ all -> 0x01fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x001b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.amzy a(android.database.Cursor r22, boolean r23) {
        /*
            r21 = this;
            r1 = r22
            java.lang.String r0 = "dtstart"
            if (r1 == 0) goto L_0x01f3
            int r2 = r22.getCount()     // Catch:{ all -> 0x01fd }
            if (r2 == 0) goto L_0x01f3
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x01fd }
            r2.<init>()     // Catch:{ all -> 0x01fd }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x01fd }
            r3.<init>()     // Catch:{ all -> 0x01fd }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x01fd }
            r4.<init>()     // Catch:{ all -> 0x01fd }
        L_0x001b:
            boolean r5 = r22.moveToNext()     // Catch:{ all -> 0x01fd }
            if (r5 == 0) goto L_0x01eb
            java.lang.String r5 = "dtend"
            int r5 = r1.getColumnIndex(r5)     // Catch:{ all -> 0x01fd }
            long r8 = r1.getLong(r5)     // Catch:{ all -> 0x01fd }
            java.lang.String r5 = "title"
            int r5 = r1.getColumnIndex(r5)     // Catch:{ all -> 0x01fd }
            java.lang.String r5 = r1.getString(r5)     // Catch:{ all -> 0x01fd }
            java.lang.String r6 = "description"
            int r6 = r1.getColumnIndex(r6)     // Catch:{ all -> 0x01fd }
            java.lang.String r6 = r1.getString(r6)     // Catch:{ all -> 0x01fd }
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x01fd }
            r15 = 0
            r7[r15] = r5     // Catch:{ all -> 0x01fd }
            r14 = 1
            r7[r14] = r6     // Catch:{ all -> 0x01fd }
            int r6 = java.util.Arrays.hashCode(r7)     // Catch:{ all -> 0x01fd }
            r10 = 0
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x001b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01fd }
            boolean r7 = r3.contains(r6)     // Catch:{ all -> 0x01fd }
            if (r7 != 0) goto L_0x001b
            r3.add(r6)     // Catch:{ all -> 0x01fd }
            avjj r6 = defpackage.avjj.j     // Catch:{ all -> 0x01fd }
            aucd r13 = r6.o()     // Catch:{ all -> 0x01fd }
            boolean r6 = r13.c     // Catch:{ all -> 0x01fd }
            if (r6 != 0) goto L_0x006a
            goto L_0x006f
        L_0x006a:
            r13.c()     // Catch:{ all -> 0x01fd }
            r13.c = r15     // Catch:{ all -> 0x01fd }
        L_0x006f:
            aucj r6 = r13.b     // Catch:{ all -> 0x01fd }
            avjj r6 = (defpackage.avjj) r6     // Catch:{ all -> 0x01fd }
            r6.b = r14     // Catch:{ all -> 0x01fd }
            int r7 = r6.a     // Catch:{ all -> 0x01fd }
            r7 = r7 | r14
            r6.a = r7     // Catch:{ all -> 0x01fd }
            int r6 = r1.getColumnIndex(r0)     // Catch:{ all -> 0x01fd }
            long r6 = r1.getLong(r6)     // Catch:{ all -> 0x01fd }
            r10 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r10
            boolean r10 = r13.c     // Catch:{ all -> 0x01fd }
            if (r10 != 0) goto L_0x008a
            goto L_0x008f
        L_0x008a:
            r13.c()     // Catch:{ all -> 0x01fd }
            r13.c = r15     // Catch:{ all -> 0x01fd }
        L_0x008f:
            aucj r10 = r13.b     // Catch:{ all -> 0x01fd }
            avjj r10 = (defpackage.avjj) r10     // Catch:{ all -> 0x01fd }
            int r11 = r10.a     // Catch:{ all -> 0x01fd }
            r11 = r11 | 512(0x200, float:7.175E-43)
            r10.a = r11     // Catch:{ all -> 0x01fd }
            r10.g = r6     // Catch:{ all -> 0x01fd }
            boolean r6 = defpackage.azim.b()     // Catch:{ all -> 0x01fd }
            java.lang.String r7 = "allDay"
            if (r6 != 0) goto L_0x00a7
            r20 = r13
            r15 = 1
            goto L_0x00ec
        L_0x00a7:
            azhx r6 = defpackage.azhx.a     // Catch:{ all -> 0x01fd }
            azhy r6 = r6.a()     // Catch:{ all -> 0x01fd }
            boolean r6 = r6.a()     // Catch:{ all -> 0x01fd }
            if (r6 == 0) goto L_0x00e9
            int r6 = r1.getColumnIndex(r0)     // Catch:{ all -> 0x01fd }
            long r10 = r1.getLong(r6)     // Catch:{ all -> 0x01fd }
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01fd }
            java.util.TimeZone r6 = java.util.TimeZone.getDefault()     // Catch:{ all -> 0x01fd }
            java.lang.String r12 = r6.getID()     // Catch:{ all -> 0x01fd }
            int r6 = r1.getColumnIndex(r7)     // Catch:{ all -> 0x01fd }
            int r6 = r1.getInt(r6)     // Catch:{ all -> 0x01fd }
            if (r6 != r14) goto L_0x00d4
            r18 = 1
            goto L_0x00d6
        L_0x00d4:
            r18 = 0
        L_0x00d6:
            android.content.Context r19 = r21.getContext()     // Catch:{ all -> 0x01fd }
            r6 = r10
            r10 = r16
            r20 = r13
            r13 = r18
            r15 = 1
            r14 = r19
            java.lang.String r6 = defpackage.jpp.a(r6, r8, r10, r12, r13, r14)     // Catch:{ all -> 0x01fd }
            goto L_0x011f
        L_0x00e9:
            r20 = r13
            r15 = 1
        L_0x00ec:
            int r6 = r1.getColumnIndex(r0)     // Catch:{ all -> 0x01fd }
            long r10 = r1.getLong(r6)     // Catch:{ all -> 0x01fd }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01fd }
            java.util.TimeZone r6 = java.util.TimeZone.getDefault()     // Catch:{ all -> 0x01fd }
            java.lang.String r14 = r6.getDisplayName()     // Catch:{ all -> 0x01fd }
            int r6 = r1.getColumnIndex(r7)     // Catch:{ all -> 0x01fd }
            int r6 = r1.getInt(r6)     // Catch:{ all -> 0x01fd }
            if (r6 != r15) goto L_0x010e
            r17 = 1
            goto L_0x0110
        L_0x010e:
            r17 = 0
        L_0x0110:
            android.content.Context r18 = r21.getContext()     // Catch:{ all -> 0x01fd }
            r6 = r10
            r10 = r12
            r12 = r14
            r13 = r17
            r14 = r18
            java.lang.String r6 = defpackage.jpp.a(r6, r8, r10, r12, r13, r14)     // Catch:{ all -> 0x01fd }
        L_0x011f:
            azho r7 = defpackage.azho.a     // Catch:{ all -> 0x01fd }
            azhp r7 = r7.a()     // Catch:{ all -> 0x01fd }
            boolean r7 = r7.a()     // Catch:{ all -> 0x01fd }
            r8 = 2131953759(0x7f13085f, float:1.9543998E38)
            if (r7 == 0) goto L_0x0140
            boolean r7 = defpackage.amrk.a((java.lang.String) r5)     // Catch:{ all -> 0x01fd }
            if (r7 == 0) goto L_0x0140
            android.content.Context r5 = r21.getContext()     // Catch:{ all -> 0x01fd }
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ all -> 0x01fd }
            java.lang.String r5 = r5.getString(r8)     // Catch:{ all -> 0x01fd }
        L_0x0140:
            if (r23 == 0) goto L_0x0156
            android.content.Context r7 = r21.getContext()     // Catch:{ all -> 0x01fd }
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ all -> 0x01fd }
            java.lang.Object[] r9 = new java.lang.Object[r15]     // Catch:{ all -> 0x01fd }
            r10 = 0
            r9[r10] = r6     // Catch:{ all -> 0x01fd }
            r6 = 2131953724(0x7f13083c, float:1.9543927E38)
            java.lang.String r6 = r7.getString(r6, r9)     // Catch:{ all -> 0x01fd }
        L_0x0156:
            r7 = r20
            boolean r9 = r7.c     // Catch:{ all -> 0x01fd }
            if (r9 != 0) goto L_0x015d
            goto L_0x0163
        L_0x015d:
            r7.c()     // Catch:{ all -> 0x01fd }
            r9 = 0
            r7.c = r9     // Catch:{ all -> 0x01fd }
        L_0x0163:
            aucj r9 = r7.b     // Catch:{ all -> 0x01fd }
            avjj r9 = (defpackage.avjj) r9     // Catch:{ all -> 0x01fd }
            r6.getClass()     // Catch:{ all -> 0x01fd }
            int r10 = r9.a     // Catch:{ all -> 0x01fd }
            r10 = r10 | 256(0x100, float:3.59E-43)
            r9.a = r10     // Catch:{ all -> 0x01fd }
            r9.f = r6     // Catch:{ all -> 0x01fd }
            r5.getClass()     // Catch:{ all -> 0x01fd }
            r6 = r10 | 32
            r9.a = r6     // Catch:{ all -> 0x01fd }
            r9.d = r5     // Catch:{ all -> 0x01fd }
            java.lang.String r5 = r9.d     // Catch:{ all -> 0x01fd }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x01fd }
            if (r5 != 0) goto L_0x0184
            goto L_0x01aa
        L_0x0184:
            android.content.Context r5 = r21.getContext()     // Catch:{ all -> 0x01fd }
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ all -> 0x01fd }
            java.lang.String r5 = r5.getString(r8)     // Catch:{ all -> 0x01fd }
            boolean r6 = r7.c     // Catch:{ all -> 0x01fd }
            if (r6 != 0) goto L_0x0195
            goto L_0x019b
        L_0x0195:
            r7.c()     // Catch:{ all -> 0x01fd }
            r6 = 0
            r7.c = r6     // Catch:{ all -> 0x01fd }
        L_0x019b:
            aucj r6 = r7.b     // Catch:{ all -> 0x01fd }
            avjj r6 = (defpackage.avjj) r6     // Catch:{ all -> 0x01fd }
            r5.getClass()     // Catch:{ all -> 0x01fd }
            int r8 = r6.a     // Catch:{ all -> 0x01fd }
            r8 = r8 | 32
            r6.a = r8     // Catch:{ all -> 0x01fd }
            r6.d = r5     // Catch:{ all -> 0x01fd }
        L_0x01aa:
            android.net.Uri r5 = android.provider.CalendarContract.Events.CONTENT_URI     // Catch:{ all -> 0x01fd }
            java.lang.String r6 = "event_id"
            int r6 = r1.getColumnIndex(r6)     // Catch:{ all -> 0x01fd }
            long r8 = r1.getLong(r6)     // Catch:{ all -> 0x01fd }
            android.net.Uri r5 = android.content.ContentUris.withAppendedId(r5, r8)     // Catch:{ all -> 0x01fd }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x01fd }
            boolean r6 = r7.c     // Catch:{ all -> 0x01fd }
            if (r6 != 0) goto L_0x01c3
            goto L_0x01c9
        L_0x01c3:
            r7.c()     // Catch:{ all -> 0x01fd }
            r6 = 0
            r7.c = r6     // Catch:{ all -> 0x01fd }
        L_0x01c9:
            aucj r6 = r7.b     // Catch:{ all -> 0x01fd }
            avjj r6 = (defpackage.avjj) r6     // Catch:{ all -> 0x01fd }
            r5.getClass()     // Catch:{ all -> 0x01fd }
            int r8 = r6.a     // Catch:{ all -> 0x01fd }
            r8 = r8 | 16
            r6.a = r8     // Catch:{ all -> 0x01fd }
            r6.c = r5     // Catch:{ all -> 0x01fd }
            java.lang.String r5 = r6.c     // Catch:{ all -> 0x01fd }
            boolean r5 = r2.add(r5)     // Catch:{ all -> 0x01fd }
            if (r5 == 0) goto L_0x001b
            aucj r5 = r7.i()     // Catch:{ all -> 0x01fd }
            avjj r5 = (defpackage.avjj) r5     // Catch:{ all -> 0x01fd }
            r4.add(r5)     // Catch:{ all -> 0x01fd }
            goto L_0x001b
        L_0x01eb:
            amzy r0 = defpackage.amzy.a((java.util.Collection) r4)     // Catch:{ all -> 0x01fd }
            r22.close()
            return r0
        L_0x01f3:
            amzy r0 = defpackage.amzy.h()     // Catch:{ all -> 0x01fd }
            if (r1 == 0) goto L_0x01fc
            r22.close()
        L_0x01fc:
            return r0
        L_0x01fd:
            r0 = move-exception
            if (r1 != 0) goto L_0x0201
            goto L_0x0204
        L_0x0201:
            r22.close()
        L_0x0204:
            goto L_0x0206
        L_0x0205:
            throw r0
        L_0x0206:
            goto L_0x0205
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ablj.a(android.database.Cursor, boolean):amzy");
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        int i = Build.VERSION.SDK_INT;
        if (this.c == null || !this.d.c) {
            return amzy.h();
        }
        amzy a = a(a(true, 1), true);
        amzy a2 = a(a(false, 12), false);
        amzt amzt = new amzt();
        amzt.b((Iterable) a);
        amzt.b((Iterable) a2);
        return amzt.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0170 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.database.Cursor a(boolean r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = 2
            java.lang.String[] r4 = new java.lang.String[r0]
            java.lang.String r2 = "_id"
            r8 = 0
            r4[r8] = r2
            java.lang.String r2 = "calendar_access_level"
            r9 = 1
            r4[r9] = r2
            android.content.Context r2 = r16.getContext()
            android.content.ContentResolver r2 = r2.getContentResolver()
            android.net.Uri r3 = android.provider.CalendarContract.Calendars.CONTENT_URI
            java.lang.String[] r6 = new java.lang.String[r9]
            java.lang.String r5 = "700"
            r6[r8] = r5
            java.lang.String r5 = "visible = 1 AND calendar_access_level = ? "
            r7 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)
            r3 = 0
            if (r2 == 0) goto L_0x0057
            int r4 = r2.getCount()     // Catch:{ all -> 0x0052 }
            if (r4 <= 0) goto L_0x0057
            r4 = -1
            r2.moveToPosition(r4)     // Catch:{ all -> 0x0052 }
            int r4 = r2.getCount()     // Catch:{ all -> 0x0052 }
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x0052 }
        L_0x0039:
            boolean r5 = r2.moveToNext()     // Catch:{ all -> 0x0052 }
            if (r5 == 0) goto L_0x004e
            int r5 = r2.getPosition()     // Catch:{ all -> 0x0052 }
            int r6 = r2.getInt(r8)     // Catch:{ all -> 0x0052 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0052 }
            r4[r5] = r6     // Catch:{ all -> 0x0052 }
            goto L_0x0039
        L_0x004e:
            r2.close()
            goto L_0x005f
        L_0x0052:
            r0 = move-exception
            r2.close()
            throw r0
        L_0x0057:
            if (r2 == 0) goto L_0x005e
            r2.close()
            r4 = r3
            goto L_0x005f
        L_0x005e:
            r4 = r3
        L_0x005f:
            if (r4 == 0) goto L_0x0170
            long r2 = java.lang.System.currentTimeMillis()
            r5 = 6
            java.lang.String[] r12 = new java.lang.String[r5]
            java.lang.String r5 = "title"
            r12[r8] = r5
            java.lang.String r5 = "event_id"
            r12[r9] = r5
            java.lang.String r5 = "dtstart"
            r12[r0] = r5
            java.lang.String r6 = "dtend"
            r7 = 3
            r12[r7] = r6
            r6 = 4
            java.lang.String r10 = "allDay"
            r12[r6] = r10
            r6 = 5
            java.lang.String r10 = "description"
            r12[r6] = r10
            java.lang.String[][] r6 = new java.lang.String[r0][]
            java.lang.String[] r10 = r1.c
            r6[r8] = r10
            r6[r9] = r4
            java.lang.Object[] r6 = defpackage.jhx.a((java.lang.Object[][]) r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            if (r17 != 0) goto L_0x0096
            java.lang.String r10 = " < "
            goto L_0x0098
        L_0x0096:
            java.lang.String r10 = " > "
        L_0x0098:
            java.lang.String[] r7 = new java.lang.String[r7]
            java.lang.String r11 = java.lang.String.valueOf(r2)
            r7[r8] = r11
            r13 = -15552000000(0xfffffffc61075000, double:NaN)
            long r13 = r13 + r2
            java.lang.String r11 = java.lang.String.valueOf(r13)
            r7[r9] = r11
            r13 = 31536000000(0x757b12c00, double:1.55808542072E-313)
            long r2 = r2 + r13
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r7[r0] = r2
            java.lang.String[][] r0 = new java.lang.String[r0][]
            r0[r8] = r6
            r0[r9] = r7
            java.lang.Object[] r0 = defpackage.jhx.a((java.lang.Object[][]) r0)
            r14 = r0
            java.lang.String[] r14 = (java.lang.String[]) r14
            if (r17 != 0) goto L_0x00ca
            java.lang.String r0 = " DESC "
            goto L_0x00cc
        L_0x00ca:
            java.lang.String r0 = " ASC "
        L_0x00cc:
            int r2 = r0.length()
            if (r2 != 0) goto L_0x00d9
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5)
            goto L_0x00dd
        L_0x00d9:
            java.lang.String r0 = r5.concat(r0)
        L_0x00dd:
            java.lang.String[] r2 = r1.c
            int r2 = r2.length
            if (r2 <= 0) goto L_0x00e4
            r8 = 1
            goto L_0x00e5
        L_0x00e4:
        L_0x00e5:
            defpackage.amrl.a((boolean) r8)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "(  REPLACE(attendeeEmail, '.', '') = REPLACE(?, '.', '') COLLATE NOCASE"
            r3.<init>(r5)
        L_0x00ef:
            if (r9 >= r2) goto L_0x00f9
            java.lang.String r5 = " OR  REPLACE(attendeeEmail, '.', '') = REPLACE(?, '.', '') COLLATE NOCASE"
            r3.append(r5)
            int r9 = r9 + 1
            goto L_0x00ef
        L_0x00f9:
            java.lang.String r2 = ")"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            int r3 = r4.length
            java.lang.String r3 = defpackage.abgk.a(r3)
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r5 = r5.length()
            int r6 = r10.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r4 = r4 + 88
            int r4 = r4 + r5
            int r4 = r4 + r6
            r7.<init>(r4)
            r7.append(r2)
            java.lang.String r2 = " AND calendar_id IN "
            r7.append(r2)
            r7.append(r3)
            java.lang.String r2 = " AND dtstart"
            r7.append(r2)
            r7.append(r10)
            java.lang.String r2 = " ?  AND dtstart > ?  AND dtstart < ?  AND lastSynced = 0"
            r7.append(r2)
            java.lang.String r13 = r7.toString()
            android.content.Context r2 = r16.getContext()
            android.content.ContentResolver r10 = r2.getContentResolver()
            android.net.Uri r11 = android.provider.CalendarContract.Attendees.CONTENT_URI
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 18
            r3.<init>(r2)
            r3.append(r0)
            java.lang.String r0 = " LIMIT "
            r3.append(r0)
            r0 = r18
            r3.append(r0)
            java.lang.String r15 = r3.toString()
            android.database.Cursor r0 = r10.query(r11, r12, r13, r14, r15)
            return r0
        L_0x0170:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ablj.a(boolean, int):android.database.Cursor");
    }
}
