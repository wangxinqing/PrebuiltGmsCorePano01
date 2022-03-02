package defpackage;

import android.content.ContentResolver;

/* renamed from: qsf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qsf {
    private final qog a;

    public qsf(ContentResolver contentResolver, qof qof) {
        this.a = new qog(contentResolver, qof);
    }

    /* JADX WARNING: type inference failed for: r15v4, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.Cursor a(defpackage.qse r15) {
        /*
            r14 = this;
            int r0 = r15.g
            r1 = 0
            if (r0 == 0) goto L_0x012b
            android.net.Uri r0 = r15.c
            if (r0 == 0) goto L_0x012b
            java.lang.String[] r0 = r15.d
            if (r0 == 0) goto L_0x012b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r2 = r15.g
            int r3 = r2 + -1
            if (r2 == 0) goto L_0x0129
            java.lang.String r2 = "date_modified DESC"
            java.lang.String r4 = "_id DESC"
            r5 = 0
            r7 = 1
            if (r3 == 0) goto L_0x00a3
            if (r3 == r7) goto L_0x0088
            r5 = 2
            if (r3 == r5) goto L_0x0059
            r4 = 3
            if (r3 == r4) goto L_0x002a
            return r1
        L_0x002a:
            java.lang.Long r3 = r15.a
            if (r3 == 0) goto L_0x0055
            java.lang.Long r4 = r15.b
            if (r4 == 0) goto L_0x0055
            long r3 = r3.longValue()
            java.lang.Long r5 = r15.b
            long r5 = r5.longValue()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 > 0) goto L_0x0055
            java.lang.Long r3 = r15.a
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.add(r3)
            java.lang.Long r3 = r15.b
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.add(r3)
            java.lang.String r3 = "date_modified>? AND date_modified<=?"
            goto L_0x0056
        L_0x0055:
            r3 = r1
        L_0x0056:
            r13 = r2
            goto L_0x00be
        L_0x0059:
            java.lang.Long r2 = r15.a
            if (r2 == 0) goto L_0x0085
            java.lang.Long r3 = r15.b
            if (r3 == 0) goto L_0x0085
            long r2 = r2.longValue()
            java.lang.Long r5 = r15.b
            long r5 = r5.longValue()
            int r8 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r8 > 0) goto L_0x0085
            java.lang.Long r2 = r15.a
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.add(r2)
            java.lang.Long r2 = r15.b
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.add(r2)
            java.lang.String r2 = "_id>? AND _id<=?"
            r3 = r2
            goto L_0x0086
        L_0x0085:
            r3 = r1
        L_0x0086:
            r13 = r4
            goto L_0x00be
        L_0x0088:
            java.lang.Long r3 = r15.a
            if (r3 == 0) goto L_0x00a0
            long r3 = r3.longValue()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x00a0
            java.lang.Long r3 = r15.a
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.add(r3)
            java.lang.String r3 = "date_modified>?"
            goto L_0x00a1
        L_0x00a0:
            r3 = r1
        L_0x00a1:
            r13 = r2
            goto L_0x00be
        L_0x00a3:
            java.lang.Long r2 = r15.a
            if (r2 == 0) goto L_0x00bc
            long r2 = r2.longValue()
            int r8 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x00bc
            java.lang.Long r2 = r15.a
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.add(r2)
            java.lang.String r2 = "_id>?"
            r3 = r2
            goto L_0x00bd
        L_0x00bc:
            r3 = r1
        L_0x00bd:
            r13 = r4
        L_0x00be:
            java.lang.Integer r2 = r15.e
            java.lang.String r2 = r15.f
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x00ca
            r11 = r3
            goto L_0x00fe
        L_0x00ca:
            if (r3 == 0) goto L_0x00fb
            java.lang.String r2 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r15.f
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + 5
            int r4 = r4 + r5
            r6.<init>(r4)
            r6.append(r2)
            java.lang.String r2 = " AND "
            r6.append(r2)
            r6.append(r3)
            java.lang.String r2 = r6.toString()
            r11 = r2
            goto L_0x00fe
        L_0x00fb:
            java.lang.String r2 = r15.f
            r11 = r2
        L_0x00fe:
            android.net.Uri r9 = r15.c
            java.lang.String[] r10 = r15.d
            if (r11 == 0) goto L_0x0113
            int r15 = r0.size()
            java.lang.String[] r15 = new java.lang.String[r15]
            java.lang.Object[] r15 = r0.toArray(r15)
            r1 = r15
            java.lang.String[] r1 = (java.lang.String[]) r1
            r12 = r1
            goto L_0x0114
        L_0x0113:
            r12 = r1
        L_0x0114:
            qog r8 = r14.a
            android.database.Cursor r15 = r8.a(r9, r10, r11, r12, r13)
            if (r15 != 0) goto L_0x0128
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r1 = 0
            java.lang.String r2 = "MediaStore query returned null cursor"
            r0[r1] = r2
            java.lang.String r1 = "MediastoreClient"
            defpackage.qoi.a(r1, r0)
        L_0x0128:
            return r15
        L_0x0129:
            throw r1
        L_0x012b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qsf.a(qse):android.database.Cursor");
    }
}
