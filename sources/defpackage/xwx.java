package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: xwx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xwx {
    private static final wsn a = wsn.a;
    private static final anaf b;
    private static final Map c;
    private static final anaf d;
    private static final Map e;
    private static final anaf f;
    private static final Map g;
    private static final anaf h;
    private static final Map i;

    static {
        anaf a2 = anaf.a("male", 1, "female", 2);
        b = a2;
        c = wsn.a((Map) a2);
        anaf a3 = anaf.a(1, 1, 2, 2, 3, 3, -1, 4);
        d = a3;
        e = wsn.a((Map) a3);
        anaf a4 = anaf.a(1, 1, 2, 2, 3, 3, (byte) 4, 4, -1, 5);
        f = a4;
        g = wsn.a((Map) a4);
        anaf a5 = anaf.a("user", 4, "keyword", 3, "home", 2, "work", 1, "other", 5);
        h = a5;
        i = wsn.a((Map) a5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0424  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x042e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x043a  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0499  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x04c4 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.amgi a(defpackage.xvs r41) {
        /*
            r0 = r41
            java.lang.String r1 = r0.a
            java.lang.String r2 = defpackage.yaw.a((java.lang.String) r1)
            java.lang.String r3 = r0.b
            amgi r3 = defpackage.amgi.D
            aucd r3 = r3.o()
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x002c
            boolean r6 = r3.c
            if (r6 != 0) goto L_0x0019
            goto L_0x001e
        L_0x0019:
            r3.c()
            r3.c = r5
        L_0x001e:
            aucj r6 = r3.b
            amgi r6 = (defpackage.amgi) r6
            r2.getClass()
            int r7 = r6.a
            r7 = r7 | r4
            r6.a = r7
            r6.b = r2
        L_0x002c:
            amgu r2 = defpackage.amgu.g
            aucd r2 = r2.o()
            boolean r6 = r2.c
            if (r6 != 0) goto L_0x0037
            goto L_0x003c
        L_0x0037:
            r2.c()
            r2.c = r5
        L_0x003c:
            aucj r6 = r2.b
            amgu r6 = (defpackage.amgu) r6
            r7 = 2
            r6.b = r7
            int r8 = r6.a
            r8 = r8 | r7
            r6.a = r8
            java.lang.String r9 = r0.b
            if (r9 != 0) goto L_0x004d
            goto L_0x0056
        L_0x004d:
            r9.getClass()
            r8 = r8 | 64
            r6.a = r8
            r6.f = r9
        L_0x0056:
            java.lang.String r9 = r0.a
            r10 = 4
            if (r9 != 0) goto L_0x005c
            goto L_0x0064
        L_0x005c:
            r9.getClass()
            r8 = r8 | r10
            r6.a = r8
            r6.c = r9
        L_0x0064:
            java.lang.Long r6 = r0.e
            r8 = 16
            if (r6 == 0) goto L_0x0083
            long r11 = r6.longValue()
            boolean r6 = r2.c
            if (r6 != 0) goto L_0x0073
            goto L_0x0078
        L_0x0073:
            r2.c()
            r2.c = r5
        L_0x0078:
            aucj r6 = r2.b
            amgu r6 = (defpackage.amgu) r6
            int r9 = r6.a
            r9 = r9 | r8
            r6.a = r9
            r6.e = r11
        L_0x0083:
            aucj r2 = r2.i()
            amgu r2 = (defpackage.amgu) r2
            amgn r6 = defpackage.amgn.f
            aucd r6 = r6.o()
            amfu r9 = defpackage.amfu.b
            aucd r9 = r9.o()
            boolean r11 = r9.c
            if (r11 != 0) goto L_0x009a
            goto L_0x009f
        L_0x009a:
            r9.c()
            r9.c = r5
        L_0x009f:
            aucj r11 = r9.b
            amfu r11 = (defpackage.amfu) r11
            r2.getClass()
            aucx r12 = r11.a
            boolean r12 = r12.a()
            if (r12 != 0) goto L_0x00b6
            aucx r12 = r11.a
            aucx r12 = defpackage.aucj.a((defpackage.aucx) r12)
            r11.a = r12
        L_0x00b6:
            aucx r11 = r11.a
            r11.add(r2)
            boolean r2 = r6.c
            if (r2 != 0) goto L_0x00c0
            goto L_0x00c5
        L_0x00c0:
            r6.c()
            r6.c = r5
        L_0x00c5:
            aucj r2 = r6.b
            amgn r2 = (defpackage.amgn) r2
            aucj r9 = r9.i()
            amfu r9 = (defpackage.amfu) r9
            r9.getClass()
            r2.d = r9
            int r9 = r2.a
            r9 = r9 | 128(0x80, float:1.794E-43)
            r2.a = r9
            boolean r2 = r6.c
            if (r2 == 0) goto L_0x00e3
            r6.c()
            r6.c = r5
        L_0x00e3:
            aucj r2 = r6.b
            amgn r2 = (defpackage.amgn) r2
            r2.b = r7
            int r9 = r2.a
            r9 = r9 | r4
            r2.a = r9
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x011b
            long r8 = java.lang.Long.parseLong(r1, r8)
            boolean r2 = r6.c
            if (r2 != 0) goto L_0x00fd
            goto L_0x0102
        L_0x00fd:
            r6.c()
            r6.c = r5
        L_0x0102:
            aucj r2 = r6.b
            amgn r2 = (defpackage.amgn) r2
            aucv r11 = r2.c
            boolean r11 = r11.a()
            if (r11 != 0) goto L_0x0116
            aucv r11 = r2.c
            aucv r11 = defpackage.aucj.a((defpackage.aucv) r11)
            r2.c = r11
        L_0x0116:
            aucv r2 = r2.c
            r2.a((long) r8)
        L_0x011b:
            boolean r2 = r3.c
            if (r2 != 0) goto L_0x0120
            goto L_0x0125
        L_0x0120:
            r3.c()
            r3.c = r5
        L_0x0125:
            aucj r2 = r3.b
            amgi r2 = (defpackage.amgi) r2
            aucj r6 = r6.i()
            amgn r6 = (defpackage.amgn) r6
            r6.getClass()
            r2.c = r6
            int r6 = r2.a
            r6 = r6 | r7
            r2.a = r6
            java.util.List r2 = r0.I
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0148
            aucj r0 = r3.i()
            amgi r0 = (defpackage.amgi) r0
            return r0
        L_0x0148:
            java.util.List r2 = r0.A
            java.util.List r2 = b(r2, r1)
            java.util.List r6 = r0.E
            java.util.List r6 = a(r6, r1)
            wsn r8 = a
            java.util.List r9 = r0.k
            java.lang.Class<amfa> r11 = defpackage.amfa.class
            wru r8 = r8.a((java.lang.Class) r11)
            java.util.List r9 = defpackage.ycm.a((java.util.List) r9)
            java.util.List r8 = defpackage.wsn.a((java.util.List) r9, (java.lang.String) r1, (defpackage.wru) r8)
            java.util.List r9 = r0.l
            java.util.List r9 = a(r9, r1)
            java.util.List r11 = r0.p
            boolean r12 = defpackage.ycm.a((java.util.Collection) r11)
            java.lang.String r13 = "data2"
            java.lang.String r14 = "data1"
            if (r12 == 0) goto L_0x017f
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            goto L_0x022a
        L_0x017f:
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            int r15 = r11.size()
            r4 = 0
        L_0x0189:
            if (r4 >= r15) goto L_0x01a3
            java.lang.Object r17 = r11.get(r4)
            r10 = r17
            android.content.ContentValues r10 = (android.content.ContentValues) r10
            java.lang.String r7 = r10.getAsString(r14)
            java.lang.String r10 = r10.getAsString(r13)
            r12.put(r7, r10)
            int r4 = r4 + 1
            r7 = 2
            r10 = 4
            goto L_0x0189
        L_0x01a3:
            java.lang.String r4 = r12.toString()
            boolean r7 = android.text.TextUtils.isEmpty(r4)
            if (r7 == 0) goto L_0x01c9
            org.json.JSONException r0 = new org.json.JSONException
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r2 = "Failed to convert JSON object: "
            int r3 = r1.length()
            if (r3 != 0) goto L_0x01c1
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x01c5
        L_0x01c1:
            java.lang.String r1 = r2.concat(r1)
        L_0x01c5:
            r0.<init>(r1)
            throw r0
        L_0x01c9:
            amfc r7 = defpackage.amfc.f
            aucd r7 = r7.o()
            boolean r10 = r7.c
            if (r10 != 0) goto L_0x01d4
            goto L_0x01d9
        L_0x01d4:
            r7.c()
            r7.c = r5
        L_0x01d9:
            aucj r10 = r7.b
            amfc r10 = (defpackage.amfc) r10
            java.lang.String r11 = "gdataExtendedProperty"
            r11.getClass()
            int r12 = r10.a
            r12 = r12 | 8
            r10.a = r12
            r10.e = r11
            java.lang.String r11 = "android"
            r11.getClass()
            r15 = 2
            r12 = r12 | r15
            r10.a = r12
            r10.c = r11
            r4.getClass()
            r11 = 4
            r12 = r12 | r11
            r10.a = r12
            r10.d = r4
            amgl r4 = defpackage.wsn.f(r1)
            boolean r10 = r7.c
            if (r10 != 0) goto L_0x0207
            goto L_0x020c
        L_0x0207:
            r7.c()
            r7.c = r5
        L_0x020c:
            aucj r10 = r7.b
            amfc r10 = (defpackage.amfc) r10
            r4.getClass()
            r10.b = r4
            int r4 = r10.a
            r11 = 1
            r4 = r4 | r11
            r10.a = r4
            aucj r4 = r7.i()
            amfc r4 = (defpackage.amfc) r4
            java.util.ArrayList r11 = new java.util.ArrayList
            amzy r4 = defpackage.amzy.a((java.lang.Object) r4)
            r11.<init>(r4)
        L_0x022a:
            java.util.List r4 = r0.n
            java.util.List r4 = a(r4, r1)
            wsn r7 = a
            java.util.List r10 = r0.o
            java.lang.Class<amfn> r12 = defpackage.amfn.class
            wru r7 = r7.a((java.lang.Class) r12)
            java.util.List r7 = defpackage.wsn.a((java.util.List) r10, (java.lang.String) r1, (defpackage.wru) r7)
            java.util.List r10 = r0.q
            java.util.List r10 = a(r10, r1)
            java.util.List r12 = r0.r
            java.util.List r12 = b(r12, r1)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.List r5 = r0.u
            java.util.List r5 = a(r5, r1)
            r19 = r5
            java.util.List r5 = r0.t
            java.util.List r5 = a(r5, r1)
            r20 = r5
            java.util.List r5 = r0.w
            java.util.List r5 = a(r5, r1)
            r21 = r5
            wsn r5 = a
            r22 = r12
            java.util.List r12 = r0.s
            boolean r23 = defpackage.ycm.a((java.util.Collection) r12)
            if (r23 != 0) goto L_0x0280
            r23 = r10
            java.lang.Class<amfd> r10 = defpackage.amfd.class
            wru r5 = r5.a((java.lang.Class) r10)
            java.util.List r5 = defpackage.wsn.a((java.util.List) r12, (java.lang.String) r1, (defpackage.wru) r5)
            goto L_0x0287
        L_0x0280:
            r23 = r10
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x0287:
            java.util.List r10 = r0.y
            java.util.List r10 = b(r10, r1)
            java.util.List r12 = r0.z
            java.util.List r12 = a(r12, r1)
            r24 = r10
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r25 = r5
            java.util.List r5 = r0.B
            java.util.List r5 = a(r5, r1)
            r26 = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r27 = r7
            java.util.List r7 = r0.C
            java.util.List r7 = a(r7, r1)
            r28 = r7
            java.util.List r7 = r0.D
            java.util.List r7 = a(r7, r1)
            r29 = r7
            java.util.List r7 = r0.F
            java.util.List r7 = a(r7, r1)
            r30 = r7
            java.util.List r7 = r0.G
            java.util.List r7 = a(r7, r1)
            r31 = r7
            java.util.List r7 = r0.m
            java.util.List r7 = a(r7, r1)
            r32 = r7
            java.util.List r7 = r0.H
            java.util.List r7 = a(r7, r1)
            r33 = r7
            java.util.List r7 = r0.v
            java.util.List r0 = r0.x
            amgl r1 = defpackage.wsn.f(r1)
            boolean r34 = defpackage.ycm.a((java.util.Collection) r7)
            if (r34 != 0) goto L_0x032d
            r34 = r4
            int r4 = r7.size()
            r35 = r11
            r11 = 0
        L_0x02f2:
            if (r11 >= r4) goto L_0x032a
            java.lang.Object r36 = r7.get(r11)
            r41 = r4
            r4 = r36
            android.content.ContentValues r4 = (android.content.ContentValues) r4
            r36 = r7
            java.lang.Integer r7 = r4.getAsInteger(r13)
            if (r7 == 0) goto L_0x0311
            r37 = r9
            java.util.Map r9 = i
            java.lang.Object r7 = r9.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0314
        L_0x0311:
            r37 = r9
            r7 = 0
        L_0x0314:
            if (r7 == 0) goto L_0x0317
            goto L_0x0319
        L_0x0317:
            java.lang.String r7 = "other"
        L_0x0319:
            java.lang.String r4 = r4.getAsString(r14)
            a((java.lang.String) r7, (java.lang.String) r4, (defpackage.amgl) r1, (java.util.List) r5)
            int r11 = r11 + 1
            r4 = r41
            r7 = r36
            r9 = r37
            goto L_0x02f2
        L_0x032a:
            r37 = r9
            goto L_0x0333
        L_0x032d:
            r34 = r4
            r37 = r9
            r35 = r11
        L_0x0333:
            boolean r4 = defpackage.ycm.a((java.util.Collection) r0)
            if (r4 != 0) goto L_0x04d0
            int r4 = r0.size()
            r7 = 0
            r11 = 0
        L_0x033f:
            if (r7 >= r4) goto L_0x04d0
            java.lang.Object r9 = r0.get(r7)
            android.content.ContentValues r9 = (android.content.ContentValues) r9
            r36 = r0
            java.lang.String r0 = "data3"
            java.lang.Integer r0 = r9.getAsInteger(r0)
            if (r0 == 0) goto L_0x03a1
            boolean r38 = r15.isEmpty()
            if (r38 == 0) goto L_0x039a
            amft r38 = defpackage.amft.d
            r41 = r4
            aucd r4 = r38.o()
            r38 = r8
            java.util.Map r8 = c
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r8 = r4.c
            if (r8 != 0) goto L_0x036e
            goto L_0x0374
        L_0x036e:
            r4.c()
            r8 = 0
            r4.c = r8
        L_0x0374:
            aucj r8 = r4.b
            amft r8 = (defpackage.amft) r8
            r0.getClass()
            r39 = r6
            int r6 = r8.a
            r17 = 2
            r6 = r6 | 2
            r8.a = r6
            r8.c = r0
            r1.getClass()
            r8.b = r1
            r0 = 1
            r6 = r6 | r0
            r8.a = r6
            aucj r0 = r4.i()
            amft r0 = (defpackage.amft) r0
            r15.add(r0)
            goto L_0x03a7
        L_0x039a:
            r41 = r4
            r39 = r6
            r38 = r8
            goto L_0x03a7
        L_0x03a1:
            r41 = r4
            r39 = r6
            r38 = r8
        L_0x03a7:
            java.lang.String r0 = "data4"
            java.lang.String r0 = r9.getAsString(r0)
            java.lang.String r4 = "data5"
            java.lang.String r4 = r9.getAsString(r4)
            java.lang.String r6 = "data10"
            java.lang.String r6 = r9.getAsString(r6)
            if (r11 != 0) goto L_0x03e2
            r8 = 3
            r40 = r11
            java.lang.String[] r11 = new java.lang.String[r8]
            r18 = 0
            r11[r18] = r0
            r16 = 1
            r11[r16] = r4
            r17 = 2
            r11[r17] = r6
            boolean r11 = defpackage.ycm.b((java.lang.String[]) r11)
            if (r11 != 0) goto L_0x03e0
            r11 = 5
            a((int) r11, (java.lang.String) r0, (defpackage.amgl) r1, (java.util.List) r12)
            a((int) r8, (java.lang.String) r4, (defpackage.amgl) r1, (java.util.List) r12)
            r0 = 4
            a((int) r0, (java.lang.String) r6, (defpackage.amgl) r1, (java.util.List) r12)
            r11 = 1
            goto L_0x03e7
        L_0x03e0:
            r0 = 4
            goto L_0x03e5
        L_0x03e2:
            r40 = r11
            r0 = 4
        L_0x03e5:
            r11 = r40
        L_0x03e7:
            java.lang.String r4 = "data7"
            java.lang.String r4 = r9.getAsString(r4)
            if (r4 == 0) goto L_0x0424
            amgd r6 = defpackage.amgd.d
            aucd r6 = r6.o()
            boolean r8 = r6.c
            if (r8 != 0) goto L_0x03fa
            goto L_0x0400
        L_0x03fa:
            r6.c()
            r8 = 0
            r6.c = r8
        L_0x0400:
            aucj r8 = r6.b
            amgd r8 = (defpackage.amgd) r8
            r4.getClass()
            int r0 = r8.a
            r17 = 2
            r0 = r0 | 2
            r8.a = r0
            r8.c = r4
            r1.getClass()
            r8.b = r1
            r4 = 1
            r0 = r0 | r4
            r8.a = r0
            aucj r0 = r6.i()
            amgd r0 = (defpackage.amgd) r0
            r10.add(r0)
            goto L_0x0427
        L_0x0424:
            r4 = 1
            r17 = 2
        L_0x0427:
            java.lang.String r0 = r9.getAsString(r14)
            if (r0 == 0) goto L_0x0433
            java.lang.String r6 = "billinginformation"
            a((java.lang.String) r6, (java.lang.String) r0, (defpackage.amgl) r1, (java.util.List) r5)
        L_0x0433:
            java.lang.String r0 = r9.getAsString(r13)
            if (r0 == 0) goto L_0x043f
            java.lang.String r6 = "directoryserver"
            a((java.lang.String) r6, (java.lang.String) r0, (defpackage.amgl) r1, (java.util.List) r5)
        L_0x043f:
            java.lang.String r0 = "data6"
            java.lang.String r0 = r9.getAsString(r0)
            if (r0 == 0) goto L_0x044d
            java.lang.String r6 = "mileage"
            a((java.lang.String) r6, (java.lang.String) r0, (defpackage.amgl) r1, (java.util.List) r5)
        L_0x044d:
            java.lang.String r0 = "data11"
            java.lang.String r0 = r9.getAsString(r0)
            if (r0 == 0) goto L_0x045b
            java.lang.String r6 = "subject"
            a((java.lang.String) r6, (java.lang.String) r0, (defpackage.amgl) r1, (java.util.List) r5)
        L_0x045b:
            java.lang.String r0 = "data8"
            java.lang.Integer r0 = r9.getAsInteger(r0)
            r6 = -1
            if (r0 == 0) goto L_0x0490
            java.util.Map r8 = e
            java.lang.Object r0 = r8.get(r0)
            java.lang.Byte r0 = (java.lang.Byte) r0
            if (r0 != 0) goto L_0x0473
            java.lang.Byte r0 = java.lang.Byte.valueOf(r6)
        L_0x0473:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r8 = java.lang.String.valueOf(r0)
            int r8 = r8.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r8)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r4 = "priority"
            a((java.lang.String) r4, (java.lang.String) r0, (defpackage.amgl) r1, (java.util.List) r5)
        L_0x0490:
            java.lang.String r0 = "data9"
            java.lang.Integer r0 = r9.getAsInteger(r0)
            if (r0 == 0) goto L_0x04c4
            java.util.Map r4 = g
            java.lang.Object r0 = r4.get(r0)
            java.lang.Byte r0 = (java.lang.Byte) r0
            if (r0 != 0) goto L_0x04a7
            java.lang.Byte r0 = java.lang.Byte.valueOf(r6)
        L_0x04a7:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = java.lang.String.valueOf(r0)
            int r4 = r4.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.String r4 = "sensitivity"
            a((java.lang.String) r4, (java.lang.String) r0, (defpackage.amgl) r1, (java.util.List) r5)
        L_0x04c4:
            int r7 = r7 + 1
            r4 = r41
            r0 = r36
            r8 = r38
            r6 = r39
            goto L_0x033f
        L_0x04d0:
            r39 = r6
            r38 = r8
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x04d9
            goto L_0x04df
        L_0x04d9:
            r3.c()
            r0 = 0
            r3.c = r0
        L_0x04df:
            aucj r0 = r3.b
            amgi r0 = (defpackage.amgi) r0
            aucx r1 = r0.i
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x04f3
            aucx r1 = r0.i
            aucx r1 = defpackage.aucj.a((defpackage.aucx) r1)
            r0.i = r1
        L_0x04f3:
            aucx r0 = r0.i
            defpackage.auab.a((java.lang.Iterable) r2, (java.util.List) r0)
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x04fd
            goto L_0x0503
        L_0x04fd:
            r3.c()
            r0 = 0
            r3.c = r0
        L_0x0503:
            aucj r0 = r3.b
            amgi r0 = (defpackage.amgi) r0
            r0.d()
            aucx r0 = r0.o
            r1 = r39
            defpackage.auab.a((java.lang.Iterable) r1, (java.util.List) r0)
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x0516
            goto L_0x051c
        L_0x0516:
            r3.c()
            r0 = 0
            r3.c = r0
        L_0x051c:
            aucj r0 = r3.b
            amgi r0 = (defpackage.amgi) r0
            aucx r1 = r0.k
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x0530
            aucx r1 = r0.k
            aucx r1 = defpackage.aucj.a((defpackage.aucx) r1)
            r0.k = r1
        L_0x0530:
            aucx r0 = r0.k
            r1 = r38
            defpackage.auab.a((java.lang.Iterable) r1, (java.util.List) r0)
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x053c
            goto L_0x0542
        L_0x053c:
            r3.c()
            r0 = 0
            r3.c = r0
        L_0x0542:
            aucj r0 = r3.b
            amgi r0 = (defpackage.amgi) r0
            aucx r1 = r0.x
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x0556
            aucx r1 = r0.x
            aucx r1 = defpackage.aucj.a((defpackage.aucx) r1)
            r0.x = r1
        L_0x0556:
            aucx r0 = r0.x
            r1 = r37
            defpackage.auab.a((java.lang.Iterable) r1, (java.util.List) r0)
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x0562
            goto L_0x0568
        L_0x0562:
            r3.c()
            r0 = 0
            r3.c = r0
        L_0x0568:
            aucj r0 = r3.b
            amgi r0 = (defpackage.amgi) r0
            aucx r1 = r0.A
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x057c
            aucx r1 = r0.A
            aucx r1 = defpackage.aucj.a((defpackage.aucx) r1)
            r0.A = r1
        L_0x057c:
            aucx r0 = r0.A
            r11 = r35
            defpackage.auab.a((java.lang.Iterable) r11, (java.util.List) r0)
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x0588
            goto L_0x058e
        L_0x0588:
            r3.c()
            r0 = 0
            r3.c = r0
        L_0x058e:
            aucj r0 = r3.b
            amgi r0 = (defpackage.amgi) r0
            r0.b()
            aucx r0 = r0.g
            r1 = r34
            defpackage.auab.a((java.lang.Iterable) r1, (java.util.List) r0)
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x05a1
            goto L_0x05a7
        L_0x05a1:
            r3.c()
            r0 = 0
            r3.c = r0
        L_0x05a7:
            aucj r0 = r3.b
            amgi r0 = (defpackage.amgi) r0
            aucx r1 = r0.r
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x05bb
            aucx r1 = r0.r
            aucx r1 = defpackage.aucj.a((defpackage.aucx) r1)
            r0.r = r1
        L_0x05bb:
            aucx r0 = r0.r
            r1 = r27
            defpackage.auab.a((java.lang.Iterable) r1, (java.util.List) r0)
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x05c7
            goto L_0x05cd
        L_0x05c7:
            r3.c()
            r0 = 0
            r3.c = r0
        L_0x05cd:
            aucj r0 = r3.b
            amgi r0 = (defpackage.amgi) r0
            aucx r1 = r0.z
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x05e1
            aucx r1 = r0.z
            aucx r1 = defpackage.aucj.a((defpackage.aucx) r1)
            r0.z = r1
        L_0x05e1:
            aucx r0 = r0.z
            r1 = r23
            defpackage.auab.a((java.lang.Iterable) r1, (java.util.List) r0)
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x05ed
            goto L_0x05f3
        L_0x05ed:
            r3.c()
            r0 = 0
            r3.c = r0
        L_0x05f3:
            aucj r0 = r3.b
            amgi r0 = (defpackage.amgi) r0
            aucx r1 = r0.t
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x0607
            aucx r1 = r0.t
            aucx r1 = defpackage.aucj.a((defpackage.aucx) r1)
            r0.t = r1
        L_0x0607:
            aucx r0 = r0.t
            r1 = r22
            defpackage.auab.a((java.lang.Iterable) r1, (java.util.List) r0)
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x0613
            goto L_0x0619
        L_0x0613:
            r3.c()
            r0 = 0
            r3.c = r0
        L_0x0619:
            aucj r0 = r3.b
            amgi r0 = (defpackage.amgi) r0
            aucx r1 = r0.f
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x062d
            aucx r1 = r0.f
            aucx r1 = defpackage.aucj.a((defpackage.aucx) r1)
            r0.f = r1
        L_0x062d:
            aucx r0 = r0.f
            defpackage.auab.a((java.lang.Iterable) r15, (java.util.List) r0)
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x0637
            goto L_0x063d
        L_0x0637:
            r3.c()
            r0 = 0
            r3.c = r0
        L_0x063d:
            aucj r0 = r3.b
            amgi r0 = (defpackage.amgi) r0
            aucx r1 = r0.q
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x0651
            aucx r1 = r0.q
            aucx r1 = defpackage.aucj.a((defpackage.aucx) r1)
            r0.q = r1
        L_0x0651:
            aucx r0 = r0.q
            r1 = r19
            defpackage.auab.a((java.lang.Iterable) r1, (java.util.List) r0)
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x065d
            goto L_0x0663
        L_0x065d:
            r3.c()
            r0 = 0
            r3.c = r0
        L_0x0663:
            aucj r0 = r3.b
            amgi r0 = (defpackage.amgi) r0
            aucx r1 = r0.v
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x0677
            aucx r1 = r0.v
            aucx r1 = defpackage.aucj.a((defpackage.aucx) r1)
            r0.v = r1
        L_0x0677:
            aucx r0 = r0.v
            r1 = r20
            defpackage.auab.a((java.lang.Iterable) r1, (java.util.List) r0)
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x0683
            goto L_0x0689
        L_0x0683:
            r3.c()
            r0 = 0
            r3.c = r0
        L_0x0689:
            aucj r0 = r3.b
            amgi r0 = (defpackage.amgi) r0
            aucx r1 = r0.y
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x069d
            aucx r1 = r0.y
            aucx r1 = defpackage.aucj.a((defpackage.aucx) r1)
            r0.y = r1
        L_0x069d:
            aucx r0 = r0.y
            r1 = r21
            defpackage.auab.a((java.lang.Iterable) r1, (java.util.List) r0)
            r0 = r25
            r3.ai(r0)
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x06ae
            goto L_0x06b4
        L_0x06ae:
            r3.c()
            r0 = 0
            r3.c = r0
        L_0x06b4:
            aucj r0 = r3.b
            amgi r0 = (defpackage.amgi) r0
            r0.a()
            aucx r0 = r0.d
            r1 = r24
            defpackage.auab.a((java.lang.Iterable) r1, (java.util.List) r0)
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x06c7
            goto L_0x06cd
        L_0x06c7:
            r3.c()
            r0 = 0
            r3.c = r0
        L_0x06cd:
            aucj r0 = r3.b
            amgi r0 = (defpackage.amgi) r0
            aucx r1 = r0.l
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x06e1
            aucx r1 = r0.l
            aucx r1 = defpackage.aucj.a((defpackage.aucx) r1)
            r0.l = r1
        L_0x06e1:
            aucx r0 = r0.l
            defpackage.auab.a((java.lang.Iterable) r12, (java.util.List) r0)
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x06eb
            goto L_0x06f1
        L_0x06eb:
            r3.c()
            r0 = 0
            r3.c = r0
        L_0x06f1:
            aucj r0 = r3.b
            amgi r0 = (defpackage.amgi) r0
            aucx r1 = r0.n
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x0705
            aucx r1 = r0.n
            aucx r1 = defpackage.aucj.a((defpackage.aucx) r1)
            r0.n = r1
        L_0x0705:
            aucx r0 = r0.n
            defpackage.auab.a((java.lang.Iterable) r10, (java.util.List) r0)
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x070f
            goto L_0x0715
        L_0x070f:
            r3.c()
            r0 = 0
            r3.c = r0
        L_0x0715:
            aucj r0 = r3.b
            amgi r0 = (defpackage.amgi) r0
            aucx r1 = r0.m
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x0729
            aucx r1 = r0.m
            aucx r1 = defpackage.aucj.a((defpackage.aucx) r1)
            r0.m = r1
        L_0x0729:
            aucx r0 = r0.m
            r1 = r26
            defpackage.auab.a((java.lang.Iterable) r1, (java.util.List) r0)
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x0735
            goto L_0x073b
        L_0x0735:
            r3.c()
            r0 = 0
            r3.c = r0
        L_0x073b:
            aucj r0 = r3.b
            amgi r0 = (defpackage.amgi) r0
            aucx r1 = r0.w
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x074f
            aucx r1 = r0.w
            aucx r1 = defpackage.aucj.a((defpackage.aucx) r1)
            r0.w = r1
        L_0x074f:
            aucx r0 = r0.w
            defpackage.auab.a((java.lang.Iterable) r5, (java.util.List) r0)
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x0759
            goto L_0x075f
        L_0x0759:
            r3.c()
            r0 = 0
            r3.c = r0
        L_0x075f:
            aucj r0 = r3.b
            amgi r0 = (defpackage.amgi) r0
            r0.c()
            aucx r0 = r0.h
            r1 = r28
            defpackage.auab.a((java.lang.Iterable) r1, (java.util.List) r0)
            defpackage.xip.a()
            ayrj r0 = defpackage.ayrj.a
            aytn r0 = r0.a()
            boolean r0 = r0.B()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x078a
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            goto L_0x078c
        L_0x078a:
            r7 = r29
        L_0x078c:
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x0791
            goto L_0x0797
        L_0x0791:
            r3.c()
            r0 = 0
            r3.c = r0
        L_0x0797:
            aucj r0 = r3.b
            amgi r0 = (defpackage.amgi) r0
            aucx r1 = r0.e
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x07ab
            aucx r1 = r0.e
            aucx r1 = defpackage.aucj.a((defpackage.aucx) r1)
            r0.e = r1
        L_0x07ab:
            aucx r0 = r0.e
            defpackage.auab.a((java.lang.Iterable) r7, (java.util.List) r0)
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x07b5
            goto L_0x07bb
        L_0x07b5:
            r3.c()
            r0 = 0
            r3.c = r0
        L_0x07bb:
            aucj r0 = r3.b
            amgi r0 = (defpackage.amgi) r0
            aucx r1 = r0.p
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x07cf
            aucx r1 = r0.p
            aucx r1 = defpackage.aucj.a((defpackage.aucx) r1)
            r0.p = r1
        L_0x07cf:
            aucx r0 = r0.p
            r1 = r30
            defpackage.auab.a((java.lang.Iterable) r1, (java.util.List) r0)
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x07db
            goto L_0x07e1
        L_0x07db:
            r3.c()
            r0 = 0
            r3.c = r0
        L_0x07e1:
            aucj r0 = r3.b
            amgi r0 = (defpackage.amgi) r0
            aucx r1 = r0.u
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x07f5
            aucx r1 = r0.u
            aucx r1 = defpackage.aucj.a((defpackage.aucx) r1)
            r0.u = r1
        L_0x07f5:
            aucx r0 = r0.u
            r1 = r31
            defpackage.auab.a((java.lang.Iterable) r1, (java.util.List) r0)
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x0801
            goto L_0x0807
        L_0x0801:
            r3.c()
            r0 = 0
            r3.c = r0
        L_0x0807:
            aucj r0 = r3.b
            amgi r0 = (defpackage.amgi) r0
            aucx r1 = r0.s
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x081b
            aucx r1 = r0.s
            aucx r1 = defpackage.aucj.a((defpackage.aucx) r1)
            r0.s = r1
        L_0x081b:
            aucx r0 = r0.s
            r1 = r32
            defpackage.auab.a((java.lang.Iterable) r1, (java.util.List) r0)
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x0827
            goto L_0x082d
        L_0x0827:
            r3.c()
            r0 = 0
            r3.c = r0
        L_0x082d:
            aucj r0 = r3.b
            amgi r0 = (defpackage.amgi) r0
            aucx r1 = r0.j
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x0841
            aucx r1 = r0.j
            aucx r1 = defpackage.aucj.a((defpackage.aucx) r1)
            r0.j = r1
        L_0x0841:
            aucx r0 = r0.j
            r1 = r33
            defpackage.auab.a((java.lang.Iterable) r1, (java.util.List) r0)
            aucj r0 = r3.i()
            amgi r0 = (defpackage.amgi) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xwx.a(xvs):amgi");
    }

    public static amgi b(xvs xvs) {
        amgi a2 = a(xvs);
        if (a2 == null) {
            return null;
        }
        aucx aucx = a2.C;
        ArrayList arrayList = new ArrayList(aucx.size());
        int size = aucx.size();
        for (int i2 = 0; i2 < size; i2++) {
            amfd amfd = (amfd) aucx.get(i2);
            if (yan.c(amfd.c)) {
                arrayList.add(amfd);
            }
        }
        if (aucx.size() == arrayList.size()) {
            return a2;
        }
        aucd aucd = (aucd) a2.c(5);
        aucd.a((aucj) a2);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ((amgi) aucd.b).C = aucj.s();
        aucd.ai(arrayList);
        return (amgi) aucd.i();
    }

    private static List b(List list, String str) {
        return a.c(ycm.a(list), str);
    }

    private static List a(List list, String str) {
        return a.c(list, str);
    }

    private static void a(int i2, String str, amgl amgl, List list) {
        if (!TextUtils.isEmpty(str)) {
            aucd o = amgc.e.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            amgc amgc = (amgc) o.b;
            amgc.d = i2 - 1;
            int i3 = amgc.a | 4;
            amgc.a = i3;
            str.getClass();
            int i4 = i3 | 2;
            amgc.a = i4;
            amgc.c = str;
            amgl.getClass();
            amgc.b = amgl;
            amgc.a = i4 | 1;
            list.add((amgc) o.i());
        }
    }

    private static void a(String str, String str2, amgl amgl, List list) {
        aucd o = amgh.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        amgh amgh = (amgh) o.b;
        str.getClass();
        int i2 = amgh.a | 4;
        amgh.a = i2;
        amgh.d = str;
        str2.getClass();
        int i3 = i2 | 2;
        amgh.a = i3;
        amgh.c = str2;
        amgl.getClass();
        amgh.b = amgl;
        amgh.a = i3 | 1;
        list.add((amgh) o.i());
    }

    public static avkz[] a(List list) {
        avkw avkw;
        int size = list.size();
        avkz[] avkzArr = new avkz[size];
        for (int i2 = 0; i2 < size; i2++) {
            xvu xvu = (xvu) list.get(i2);
            if (xvu != null) {
                aucd o = avkw.g.o();
                if (!TextUtils.isEmpty(xvu.j())) {
                    aucd o2 = avkx.c.o();
                    String j = xvu.j();
                    if (j != null) {
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        avkx avkx = (avkx) o2.b;
                        j.getClass();
                        avkx.a |= 1;
                        avkx.b = j;
                    }
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    avkw avkw2 = (avkw) o.b;
                    avkx avkx2 = (avkx) o2.i();
                    avkx2.getClass();
                    avkw2.b = avkx2;
                    avkw2.a |= 1;
                }
                if (!TextUtils.isEmpty(xvu.l())) {
                    aucd o3 = avky.d.o();
                    String l = xvu.l();
                    if (l != null) {
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        avky avky = (avky) o3.b;
                        l.getClass();
                        avky.a |= 1;
                        avky.b = l;
                    }
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    avkw avkw3 = (avkw) o.b;
                    avky avky2 = (avky) o3.i();
                    avky2.getClass();
                    avkw3.c = avky2;
                    avkw3.a |= 2;
                }
                aucd o4 = avlf.c.o();
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                avlf avlf = (avlf) o4.b;
                avlf.b = 0;
                avlf.a |= 1;
                if (xvu.k() != null) {
                    if (o4.c) {
                        o4.c();
                        o4.c = false;
                    }
                    avlf avlf2 = (avlf) o4.b;
                    avlf2.b = 2;
                    avlf2.a |= 1;
                } else if (!TextUtils.isEmpty(xvu.l())) {
                    if (o4.c) {
                        o4.c();
                        o4.c = false;
                    }
                    avlf avlf3 = (avlf) o4.b;
                    avlf3.b = 1;
                    avlf3.a |= 1;
                }
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avkw avkw4 = (avkw) o.b;
                avlf avlf4 = (avlf) o4.i();
                avlf4.getClass();
                avkw4.f = avlf4;
                avkw4.a |= 8;
                avkw = (avkw) o.i();
            } else {
                avkw = null;
            }
            aucd o5 = avkz.e.o();
            if (avkw != null) {
                if (o5.c) {
                    o5.c();
                    o5.c = false;
                }
                avkz avkz = (avkz) o5.b;
                avkw.getClass();
                avkz.c = avkw;
                avkz.a = 2 | avkz.a;
                if ((avkw.a & 1) != 0) {
                    avkx avkx3 = avkw.b;
                    if (avkx3 == null) {
                        avkx3 = avkx.c;
                    }
                    if (o5.c) {
                        o5.c();
                        o5.c = false;
                    }
                    avkz avkz2 = (avkz) o5.b;
                    avkx3.getClass();
                    avkz2.b = avkx3;
                    avkz2.a |= 1;
                }
                String m = xvu.m();
                if (m != null) {
                    if (o5.c) {
                        o5.c();
                        o5.c = false;
                    }
                    avkz avkz3 = (avkz) o5.b;
                    m.getClass();
                    avkz3.a |= 4;
                    avkz3.d = m;
                }
                avkzArr[i2] = (avkz) o5.i();
            }
        }
        return avkzArr;
    }
}
