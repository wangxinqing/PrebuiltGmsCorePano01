package defpackage;

/* renamed from: acxq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acxq extends acxw {
    private final acxm a = new acxm();

    public final int a() {
        return 27531;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f A[Catch:{ ClassCastException -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009d A[Catch:{ ClassCastException -> 0x00b9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.acxa r10, long r11, java.lang.Object[] r13) {
        /*
            r9 = this;
            java.lang.String r0 = "disable_old_visibility_logs"
            boolean r1 = r10.b(r0)
            if (r1 != 0) goto L_0x000b
            r10.d(r0)
        L_0x000b:
            boolean r0 = defpackage.azqq.c()
            int r1 = r13.length
            java.lang.String r2 = "NotificationVisParser"
            r3 = 1
            if (r1 <= r3) goto L_0x00c2
            r4 = 0
            r5 = r13[r4]     // Catch:{ ClassCastException -> 0x00b9 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ ClassCastException -> 0x00b9 }
            r6 = r13[r3]     // Catch:{ ClassCastException -> 0x00b9 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ ClassCastException -> 0x00b9 }
            int r6 = r6.intValue()     // Catch:{ ClassCastException -> 0x00b9 }
            r7 = 2
            r9.a(r13, r7)     // Catch:{ ClassCastException -> 0x00b9 }
            r8 = 5
            if (r1 <= r8) goto L_0x0036
            r13 = r13[r8]     // Catch:{ ClassCastException -> 0x00b9 }
            boolean r1 = r13 instanceof java.lang.Integer     // Catch:{ ClassCastException -> 0x00b9 }
            if (r1 == 0) goto L_0x0036
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ ClassCastException -> 0x00b9 }
            int r13 = r13.intValue()     // Catch:{ ClassCastException -> 0x00b9 }
            goto L_0x0037
        L_0x0036:
            r13 = 0
        L_0x0037:
            acxm r1 = r9.a     // Catch:{ ClassCastException -> 0x00b9 }
            boolean r1 = r1.a(r5)     // Catch:{ ClassCastException -> 0x00b9 }
            if (r1 == 0) goto L_0x009d
            aucd r1 = r10.b()     // Catch:{ ClassCastException -> 0x00b9 }
            bbl r5 = defpackage.bbl.NOTIFICATION_ITEM     // Catch:{ ClassCastException -> 0x00b9 }
            boolean r8 = r1.c     // Catch:{ ClassCastException -> 0x00b9 }
            if (r8 != 0) goto L_0x004a
            goto L_0x004f
        L_0x004a:
            r1.c()     // Catch:{ ClassCastException -> 0x00b9 }
            r1.c = r4     // Catch:{ ClassCastException -> 0x00b9 }
        L_0x004f:
            aucj r4 = r1.b     // Catch:{ ClassCastException -> 0x00b9 }
            avqd r4 = (defpackage.avqd) r4     // Catch:{ ClassCastException -> 0x00b9 }
            avqd r8 = defpackage.avqd.al     // Catch:{ ClassCastException -> 0x00b9 }
            int r5 = r5.CA     // Catch:{ ClassCastException -> 0x00b9 }
            r4.d = r5     // Catch:{ ClassCastException -> 0x00b9 }
            int r5 = r4.a     // Catch:{ ClassCastException -> 0x00b9 }
            r5 = r5 | r7
            r4.a = r5     // Catch:{ ClassCastException -> 0x00b9 }
            if (r6 == r3) goto L_0x0062
            r7 = 3
            goto L_0x0063
        L_0x0062:
        L_0x0063:
            int r7 = r7 + -1
            r4.c = r7     // Catch:{ ClassCastException -> 0x00b9 }
            r3 = r3 | r5
            r4.a = r3     // Catch:{ ClassCastException -> 0x00b9 }
            acxm r5 = r9.a     // Catch:{ ClassCastException -> 0x00b9 }
            java.lang.String r6 = r5.a     // Catch:{ ClassCastException -> 0x00b9 }
            r6.getClass()     // Catch:{ ClassCastException -> 0x00b9 }
            r3 = r3 | 16
            r4.a = r3     // Catch:{ ClassCastException -> 0x00b9 }
            r4.f = r6     // Catch:{ ClassCastException -> 0x00b9 }
            int r6 = r5.b     // Catch:{ ClassCastException -> 0x00b9 }
            r3 = r3 | 512(0x200, float:7.175E-43)
            r4.a = r3     // Catch:{ ClassCastException -> 0x00b9 }
            r4.k = r6     // Catch:{ ClassCastException -> 0x00b9 }
            java.lang.String r5 = r5.c     // Catch:{ ClassCastException -> 0x00b9 }
            r5.getClass()     // Catch:{ ClassCastException -> 0x00b9 }
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r4.a = r3     // Catch:{ ClassCastException -> 0x00b9 }
            r4.l = r5     // Catch:{ ClassCastException -> 0x00b9 }
            r3 = r3 | 8192(0x2000, float:1.14794E-41)
            r4.a = r3     // Catch:{ ClassCastException -> 0x00b9 }
            r4.o = r13     // Catch:{ ClassCastException -> 0x00b9 }
            r13 = r3 | 4
            r4.a = r13     // Catch:{ ClassCastException -> 0x00b9 }
            r4.e = r11     // Catch:{ ClassCastException -> 0x00b9 }
            r9.a(r1)     // Catch:{ ClassCastException -> 0x00b9 }
            r10.a((defpackage.aucd) r1)     // Catch:{ ClassCastException -> 0x00b9 }
            return
        L_0x009d:
            if (r0 == 0) goto L_0x00db
            java.lang.String r10 = "unable to parse key: "
            java.lang.String r11 = java.lang.String.valueOf(r5)     // Catch:{ ClassCastException -> 0x00b9 }
            int r12 = r11.length()     // Catch:{ ClassCastException -> 0x00b9 }
            if (r12 != 0) goto L_0x00b1
            java.lang.String r11 = new java.lang.String     // Catch:{ ClassCastException -> 0x00b9 }
            r11.<init>(r10)     // Catch:{ ClassCastException -> 0x00b9 }
            goto L_0x00b5
        L_0x00b1:
            java.lang.String r11 = r10.concat(r11)     // Catch:{ ClassCastException -> 0x00b9 }
        L_0x00b5:
            android.util.Log.e(r2, r11)     // Catch:{ ClassCastException -> 0x00b9 }
            return
        L_0x00b9:
            r10 = move-exception
            if (r0 == 0) goto L_0x00c1
            java.lang.String r11 = "unexpected operand type: "
            android.util.Log.e(r2, r11, r10)
        L_0x00c1:
            return
        L_0x00c2:
            if (r0 == 0) goto L_0x00db
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r11 = 37
            r10.<init>(r11)
            java.lang.String r11 = "wrong number of operands: "
            r10.append(r11)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            android.util.Log.w(r2, r10)
            return
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acxq.a(acxa, long, java.lang.Object[]):void");
    }
}
