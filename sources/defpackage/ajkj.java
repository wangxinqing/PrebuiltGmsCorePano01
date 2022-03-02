package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Process;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ajkj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajkj extends ajki {
    public static ajlf j;
    public final Context i;
    private final int k;
    private final int l;
    private final int m;
    private final Boolean n;

    public ajkj(Context context, ajlf ajlf, int i2, int i3, int i4, Boolean bool) {
        this.i = context;
        j = ajlf;
        this.k = i2;
        this.l = i3;
        this.m = i4;
        this.n = bool;
    }

    private final atbr a(ajip ajip, ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = ajip.d;
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList3.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList4.addAll(((atde) arrayList3.get(i2)).a);
        }
        aucd o = atde.b.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atde atde = (atde) o.b;
        if (!atde.a.a()) {
            atde.a = aucj.a(atde.a);
        }
        auab.a((Iterable) arrayList4, (List) atde.a);
        atde atde2 = (atde) o.i();
        ArrayList arrayList5 = ajip.e;
        atch a = ajnq.a(ajob.d(this.i));
        atch a2 = ajnq.a(ajob.c(this.i));
        atch a3 = ajnq.a(ajob.b(this.i));
        aucd o2 = atbr.j.o();
        ArrayList arrayList6 = ajip.c;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atbr atbr = (atbr) o2.b;
        if (!atbr.d.a()) {
            atbr.d = aucj.a(atbr.d);
        }
        auab.a((Iterable) arrayList6, (List) atbr.d);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atbr atbr2 = (atbr) o2.b;
        if (!atbr2.f.a()) {
            atbr2.f = aucj.a(atbr2.f);
        }
        auab.a((Iterable) arrayList5, (List) atbr2.f);
        if (arrayList != null) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atbr atbr3 = (atbr) o2.b;
            if (!atbr3.c.a()) {
                atbr3.c = aucj.a(atbr3.c);
            }
            auab.a((Iterable) arrayList, (List) atbr3.c);
        }
        if (arrayList2 != null) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atbr atbr4 = (atbr) o2.b;
            if (!atbr4.b.a()) {
                atbr4.b = aucj.a(atbr4.b);
            }
            auab.a((Iterable) arrayList2, (List) atbr4.b);
        }
        if (atde2 != null) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atbr atbr5 = (atbr) o2.b;
            atde2.getClass();
            atbr5.e = atde2;
            atbr5.a |= 1;
        }
        if (a != null) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atbr atbr6 = (atbr) o2.b;
            a.getClass();
            atbr6.i = a;
            atbr6.a |= 8;
        }
        if (a2 != null) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atbr atbr7 = (atbr) o2.b;
            a2.getClass();
            atbr7.g = a2;
            atbr7.a |= 2;
        }
        if (a3 != null) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atbr atbr8 = (atbr) o2.b;
            a3.getClass();
            atbr8.h = a3;
            atbr8.a |= 4;
        }
        return (atbr) o2.i();
    }

    public static ClientContext a(Context context, Account account) {
        int myUid = Process.myUid();
        String str = account.name;
        String str2 = account.name;
        String packageName = context.getPackageName();
        ClientContext clientContext = new ClientContext(myUid, str, str2, packageName, packageName);
        clientContext.d("https://www.googleapis.com/auth/userlocation.reporting");
        return clientContext;
    }

    /* JADX WARNING: Removed duplicated region for block: B:311:0x0716  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0733  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0752  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x078c  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x07ad  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x07da  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x07f1  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0805  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x0825  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x0850  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x0879  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x0898  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x08ba  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x08d5  */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x08f1  */
    /* JADX WARNING: Removed duplicated region for block: B:477:0x08f7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ajkh a(android.accounts.Account r32, int r33, java.lang.String r34, defpackage.ajip r35, long r36) {
        /*
            r31 = this;
            r1 = r31
            r2 = r32
            r3 = r35
            boolean r0 = defpackage.azss.b()
            java.util.ArrayList r4 = r3.a
            boolean r4 = r4.isEmpty()
            r5 = 1
            r4 = r4 ^ r5
            java.lang.String r6 = "Must have at least 1 location to upload"
            defpackage.iva.b(r4, r6)
            r0 = r0 ^ r5
            r4 = r34
            aucd r0 = r1.a((java.lang.String) r4, (boolean) r0)
            android.content.Context r4 = r1.i
            android.content.res.Resources r4 = r4.getResources()
            boolean r4 = defpackage.jix.a((android.content.res.Resources) r4)
            if (r4 != 0) goto L_0x002c
            r4 = 1
            goto L_0x002d
        L_0x002c:
            r4 = 2
        L_0x002d:
            boolean r7 = r0.c
            r8 = 0
            if (r7 != 0) goto L_0x0033
            goto L_0x0038
        L_0x0033:
            r0.c()
            r0.c = r8
        L_0x0038:
            aucj r7 = r0.b
            atbz r7 = (defpackage.atbz) r7
            atbz r9 = defpackage.atbz.r
            int r4 = r4 + -1
            r7.m = r4
            int r4 = r7.a
            r4 = r4 | 16384(0x4000, float:2.2959E-41)
            r7.a = r4
            aucj r0 = r0.i()
            r4 = r0
            atbz r4 = (defpackage.atbz) r4
            long r9 = java.lang.System.currentTimeMillis()
            azsy r0 = defpackage.azsy.a
            azsz r0 = r0.a()
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0957
            java.util.ArrayList r0 = r3.b
            boolean r13 = r0.isEmpty()
            java.lang.String r11 = "GCoreUlr"
            if (r13 != 0) goto L_0x0313
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = r0.size()
            r13.<init>(r14)
            int r14 = r0.size()
            r12 = 0
        L_0x0077:
            if (r12 >= r14) goto L_0x0312
            java.lang.Object r18 = r0.get(r12)
            r7 = r18
            com.google.android.gms.location.ActivityRecognitionResult r7 = (com.google.android.gms.location.ActivityRecognitionResult) r7
            java.util.List r15 = r7.a
            android.os.Bundle r5 = r7.c()
            int r21 = r15.size()
            if (r21 <= 0) goto L_0x008e
        L_0x008d:
            goto L_0x0097
        L_0x008e:
            if (r5 == 0) goto L_0x0302
            int r21 = r5.size()
            if (r21 <= 0) goto L_0x02fd
            goto L_0x008d
        L_0x0097:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r22 = r15.size()
            if (r22 <= 0) goto L_0x013c
            java.util.Iterator r15 = r15.iterator()
        L_0x00a6:
            boolean r22 = r15.hasNext()
            if (r22 == 0) goto L_0x0137
            java.lang.Object r22 = r15.next()
            r8 = r22
            com.google.android.gms.location.DetectedActivity r8 = (com.google.android.gms.location.DetectedActivity) r8
            int r22 = r8.a()
            switch(r22) {
                case 0: goto L_0x00eb;
                case 1: goto L_0x00e8;
                case 2: goto L_0x00e5;
                case 3: goto L_0x00e2;
                case 4: goto L_0x00df;
                case 5: goto L_0x00dc;
                case 6: goto L_0x00d9;
                case 7: goto L_0x00d6;
                case 8: goto L_0x00d3;
                default: goto L_0x00bb;
            }
        L_0x00bb:
            switch(r22) {
                case 16: goto L_0x00d0;
                case 17: goto L_0x00cd;
                case 18: goto L_0x00ca;
                case 19: goto L_0x00c7;
                case 20: goto L_0x00c4;
                case 21: goto L_0x00c1;
                default: goto L_0x00be;
            }
        L_0x00be:
            r22 = 0
            goto L_0x00ed
        L_0x00c1:
            r22 = 15
            goto L_0x00ed
        L_0x00c4:
            r22 = 14
            goto L_0x00ed
        L_0x00c7:
            r22 = 13
            goto L_0x00ed
        L_0x00ca:
            r22 = 12
            goto L_0x00ed
        L_0x00cd:
            r22 = 11
            goto L_0x00ed
        L_0x00d0:
            r22 = 10
            goto L_0x00ed
        L_0x00d3:
            r22 = 9
            goto L_0x00ed
        L_0x00d6:
            r22 = 8
            goto L_0x00ed
        L_0x00d9:
            r22 = 7
            goto L_0x00ed
        L_0x00dc:
            r22 = 6
            goto L_0x00ed
        L_0x00df:
            r22 = 5
            goto L_0x00ed
        L_0x00e2:
            r22 = 4
            goto L_0x00ed
        L_0x00e5:
            r22 = 3
            goto L_0x00ed
        L_0x00e8:
            r22 = 2
            goto L_0x00ed
        L_0x00eb:
            r22 = 1
        L_0x00ed:
            if (r22 == 0) goto L_0x012f
            atbk r26 = defpackage.atbk.d
            r27 = r0
            aucd r0 = r26.o()
            int r8 = r8.e
            r26 = r14
            boolean r14 = r0.c
            if (r14 != 0) goto L_0x0100
            goto L_0x0106
        L_0x0100:
            r0.c()
            r14 = 0
            r0.c = r14
        L_0x0106:
            aucj r14 = r0.b
            atbk r14 = (defpackage.atbk) r14
            r28 = r15
            int r15 = r14.a
            r21 = 2
            r15 = r15 | 2
            r14.a = r15
            r14.c = r8
            int r8 = r22 + -1
            r14.b = r8
            r8 = 1
            r15 = r15 | r8
            r14.a = r15
            aucj r0 = r0.i()
            atbk r0 = (defpackage.atbk) r0
            r6.add(r0)
            r14 = r26
            r0 = r27
            r15 = r28
            goto L_0x00a6
        L_0x012f:
            r27 = r0
            r26 = r14
            r28 = r15
            goto L_0x00a6
        L_0x0137:
            r27 = r0
            r26 = r14
            goto L_0x0140
        L_0x013c:
            r27 = r0
            r26 = r14
        L_0x0140:
            atbn r0 = defpackage.atbn.f
            aucd r0 = r0.o()
            boolean r8 = r0.c
            if (r8 != 0) goto L_0x014b
            goto L_0x0151
        L_0x014b:
            r0.c()
            r8 = 0
            r0.c = r8
        L_0x0151:
            aucj r8 = r0.b
            atbn r8 = (defpackage.atbn) r8
            r8.a()
            aucx r8 = r8.d
            defpackage.auab.a((java.lang.Iterable) r6, (java.util.List) r8)
            if (r5 == 0) goto L_0x02bf
            int r6 = r5.size()
            if (r6 == 0) goto L_0x02bf
            java.util.ArrayList r6 = new java.util.ArrayList
            int r8 = r5.size()
            r6.<init>(r8)
            java.util.Set r8 = r5.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0176:
            boolean r14 = r8.hasNext()
            if (r14 == 0) goto L_0x02c0
            java.lang.Object r14 = r8.next()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r5.get(r14)
            if (r15 == 0) goto L_0x02b7
            atbm r22 = defpackage.atbm.f
            r28 = r5
            aucd r5 = r22.o()
            r22 = r8
            boolean r8 = r15 instanceof java.lang.Integer
            if (r8 == 0) goto L_0x01b6
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r8 = r15.intValue()
            boolean r15 = r5.c
            if (r15 == 0) goto L_0x01a6
            r5.c()
            r15 = 0
            r5.c = r15
        L_0x01a6:
            aucj r15 = r5.b
            atbm r15 = (defpackage.atbm) r15
            r2 = 3
            r15.b = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r15.c = r2
            r8 = 7
            goto L_0x0267
        L_0x01b6:
            boolean r2 = r15 instanceof java.lang.Boolean
            if (r2 == 0) goto L_0x01dc
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r2 = r15.booleanValue()
            boolean r8 = r5.c
            if (r8 != 0) goto L_0x01c5
            goto L_0x01cb
        L_0x01c5:
            r5.c()
            r8 = 0
            r5.c = r8
        L_0x01cb:
            aucj r8 = r5.b
            atbm r8 = (defpackage.atbm) r8
            r15 = 8
            r8.b = r15
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r8.c = r2
            r8 = 7
            goto L_0x0267
        L_0x01dc:
            boolean r2 = r15 instanceof java.lang.Double
            if (r2 == 0) goto L_0x0200
            java.lang.Double r15 = (java.lang.Double) r15
            double r29 = r15.doubleValue()
            boolean r2 = r5.c
            if (r2 != 0) goto L_0x01eb
            goto L_0x01f1
        L_0x01eb:
            r5.c()
            r2 = 0
            r5.c = r2
        L_0x01f1:
            aucj r2 = r5.b
            atbm r2 = (defpackage.atbm) r2
            r8 = 6
            r2.b = r8
            java.lang.Double r15 = java.lang.Double.valueOf(r29)
            r2.c = r15
            r8 = 7
            goto L_0x0267
        L_0x0200:
            r8 = 6
            boolean r2 = r15 instanceof java.lang.Float
            if (r2 == 0) goto L_0x0225
            java.lang.Float r15 = (java.lang.Float) r15
            float r2 = r15.floatValue()
            boolean r15 = r5.c
            if (r15 != 0) goto L_0x0210
            goto L_0x0216
        L_0x0210:
            r5.c()
            r15 = 0
            r5.c = r15
        L_0x0216:
            aucj r15 = r5.b
            atbm r15 = (defpackage.atbm) r15
            r8 = 5
            r15.b = r8
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r15.c = r2
            r8 = 7
            goto L_0x0267
        L_0x0225:
            r8 = 5
            boolean r2 = r15 instanceof java.lang.Long
            if (r2 == 0) goto L_0x024a
            java.lang.Long r15 = (java.lang.Long) r15
            long r29 = r15.longValue()
            boolean r2 = r5.c
            if (r2 != 0) goto L_0x0235
            goto L_0x023b
        L_0x0235:
            r5.c()
            r2 = 0
            r5.c = r2
        L_0x023b:
            aucj r2 = r5.b
            atbm r2 = (defpackage.atbm) r2
            r15 = 4
            r2.b = r15
            java.lang.Long r15 = java.lang.Long.valueOf(r29)
            r2.c = r15
            r8 = 7
            goto L_0x0267
        L_0x024a:
            boolean r2 = r15 instanceof java.lang.String
            if (r2 == 0) goto L_0x0298
            java.lang.String r15 = (java.lang.String) r15
            boolean r2 = r5.c
            if (r2 != 0) goto L_0x0255
            goto L_0x025b
        L_0x0255:
            r5.c()
            r2 = 0
            r5.c = r2
        L_0x025b:
            aucj r2 = r5.b
            atbm r2 = (defpackage.atbm) r2
            r15.getClass()
            r8 = 7
            r2.b = r8
            r2.c = r15
        L_0x0267:
            boolean r2 = r5.c
            if (r2 != 0) goto L_0x026c
            goto L_0x0272
        L_0x026c:
            r5.c()
            r2 = 0
            r5.c = r2
        L_0x0272:
            aucj r2 = r5.b
            atbm r2 = (defpackage.atbm) r2
            r15 = 1
            r2.d = r15
            int r8 = r2.a
            r8 = r8 | r15
            r2.a = r8
            r14.getClass()
            r15 = 2
            r8 = r8 | r15
            r2.a = r8
            r2.e = r14
            aucj r2 = r5.i()
            atbm r2 = (defpackage.atbm) r2
            r6.add(r2)
            r2 = r32
            r8 = r22
            r5 = r28
            goto L_0x0176
        L_0x0298:
            java.util.Locale r2 = java.util.Locale.ENGLISH
            r5 = 1
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.String r5 = r15.toString()
            r14 = 0
            r8[r14] = r5
            r5 = 27
            java.lang.String r14 = "ActivityRecognitionResult extras bundle contains object (%s) with unsupported type."
            java.lang.String r2 = java.lang.String.format(r2, r14, r8)
            defpackage.ajix.c(r11, r5, r2)
            r2 = r32
            r8 = r22
            r5 = r28
            goto L_0x0176
        L_0x02b7:
            r28 = r5
            r22 = r8
            r2 = r32
            goto L_0x0176
        L_0x02bf:
            r6 = 0
        L_0x02c0:
            if (r6 != 0) goto L_0x02c3
            goto L_0x02da
        L_0x02c3:
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x02c8
            goto L_0x02ce
        L_0x02c8:
            r0.c()
            r2 = 0
            r0.c = r2
        L_0x02ce:
            aucj r2 = r0.b
            atbn r2 = (defpackage.atbn) r2
            r2.b()
            aucx r2 = r2.e
            defpackage.auab.a((java.lang.Iterable) r6, (java.util.List) r2)
        L_0x02da:
            long r5 = r7.b
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x02e1
            goto L_0x02e7
        L_0x02e1:
            r0.c()
            r2 = 0
            r0.c = r2
        L_0x02e7:
            aucj r2 = r0.b
            atbn r2 = (defpackage.atbn) r2
            int r7 = r2.a
            r8 = 1
            r7 = r7 | r8
            r2.a = r7
            r2.b = r5
            aucj r0 = r0.i()
            atbn r0 = (defpackage.atbn) r0
            r13.add(r0)
            goto L_0x0306
        L_0x02fd:
            r27 = r0
            r26 = r14
            goto L_0x0306
        L_0x0302:
            r27 = r0
            r26 = r14
        L_0x0306:
            int r12 = r12 + 1
            r2 = r32
            r14 = r26
            r0 = r27
            r5 = 1
            r8 = 0
            goto L_0x0077
        L_0x0312:
            goto L_0x0314
        L_0x0313:
            r13 = 0
        L_0x0314:
            java.util.ArrayList r2 = r3.a
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x092e
            java.util.ArrayList r5 = new java.util.ArrayList
            int r0 = r2.size()
            r5.<init>(r0)
            int r6 = r2.size()
            r7 = 0
        L_0x032a:
            if (r7 >= r6) goto L_0x0927
            java.lang.Object r0 = r2.get(r7)
            r8 = r0
            ajjx r8 = (defpackage.ajjx) r8
            atcj r0 = defpackage.atcj.m
            aucd r0 = r0.o()
            int r12 = r8.a
            r12 = r12 & 32
            if (r12 == 0) goto L_0x035c
            double r14 = r8.g
            long r14 = java.lang.Math.round(r14)
            int r12 = (int) r14
            boolean r14 = r0.c
            if (r14 == 0) goto L_0x0350
            r0.c()
            r14 = 0
            r0.c = r14
        L_0x0350:
            aucj r14 = r0.b
            atcj r14 = (defpackage.atcj) r14
            int r15 = r14.a
            r15 = r15 | 16
            r14.a = r15
            r14.f = r12
        L_0x035c:
            int r12 = r8.a
            r12 = r12 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x037b
            boolean r12 = r8.k
            boolean r14 = r0.c
            if (r14 != 0) goto L_0x0369
            goto L_0x036f
        L_0x0369:
            r0.c()
            r14 = 0
            r0.c = r14
        L_0x036f:
            aucj r14 = r0.b
            atcj r14 = (defpackage.atcj) r14
            int r15 = r14.a
            r15 = r15 | 1024(0x400, float:1.435E-42)
            r14.a = r15
            r14.l = r12
        L_0x037b:
            int r12 = r8.a
            r12 = r12 & 16
            if (r12 == 0) goto L_0x039d
            float r12 = r8.f
            int r12 = (int) r12
            boolean r14 = r0.c
            if (r14 != 0) goto L_0x0389
            goto L_0x038f
        L_0x0389:
            r0.c()
            r14 = 0
            r0.c = r14
        L_0x038f:
            aucj r14 = r0.b
            atcj r14 = (defpackage.atcj) r14
            int r15 = r14.a
            r19 = 8
            r15 = r15 | 8
            r14.a = r15
            r14.e = r12
        L_0x039d:
            int r12 = r8.a
            r12 = r12 & 64
            if (r12 == 0) goto L_0x03bd
            float r12 = r8.h
            int r12 = (int) r12
            boolean r14 = r0.c
            if (r14 != 0) goto L_0x03ab
            goto L_0x03b1
        L_0x03ab:
            r0.c()
            r14 = 0
            r0.c = r14
        L_0x03b1:
            aucj r14 = r0.b
            atcj r14 = (defpackage.atcj) r14
            int r15 = r14.a
            r15 = r15 | 128(0x80, float:1.794E-43)
            r14.a = r15
            r14.i = r12
        L_0x03bd:
            int r12 = r8.a
            r14 = 262144(0x40000, float:3.67342E-40)
            r12 = r12 & r14
            if (r12 == 0) goto L_0x03e1
            float r12 = r8.t
            int r12 = java.lang.Math.round(r12)
            boolean r14 = r0.c
            if (r14 != 0) goto L_0x03cf
            goto L_0x03d5
        L_0x03cf:
            r0.c()
            r14 = 0
            r0.c = r14
        L_0x03d5:
            aucj r14 = r0.b
            atcj r14 = (defpackage.atcj) r14
            int r15 = r14.a
            r15 = r15 | 256(0x100, float:3.59E-43)
            r14.a = r15
            r14.j = r12
        L_0x03e1:
            int r12 = r8.a
            r12 = r12 & 4096(0x1000, float:5.74E-42)
            if (r12 == 0) goto L_0x0400
            int r12 = r8.m
            boolean r14 = r0.c
            if (r14 != 0) goto L_0x03ee
            goto L_0x03f4
        L_0x03ee:
            r0.c()
            r14 = 0
            r0.c = r14
        L_0x03f4:
            aucj r14 = r0.b
            atcj r14 = (defpackage.atcj) r14
            int r15 = r14.a
            r15 = r15 | 32
            r14.a = r15
            r14.g = r12
        L_0x0400:
            int r12 = r8.a
            r12 = r12 & 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x0422
            java.lang.String r12 = r8.l
            boolean r14 = r0.c
            if (r14 != 0) goto L_0x040d
            goto L_0x0413
        L_0x040d:
            r0.c()
            r14 = 0
            r0.c = r14
        L_0x0413:
            aucj r14 = r0.b
            atcj r14 = (defpackage.atcj) r14
            r12.getClass()
            int r15 = r14.a
            r15 = r15 | 64
            r14.a = r15
            r14.h = r12
        L_0x0422:
            int r12 = r8.a
            r14 = 1
            r12 = r12 & r14
            if (r12 != 0) goto L_0x0461
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            long r14 = r8.d
            r22 = r2
            int r2 = r8.c
            ajjw r2 = defpackage.ajjw.a(r2)
            if (r2 == 0) goto L_0x0437
            goto L_0x0439
        L_0x0437:
            ajjw r2 = defpackage.ajjw.WIFI
        L_0x0439:
            int r2 = r2.f
            r23 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r24 = r13
            r13 = 77
            r6.<init>(r13)
            java.lang.String r13 = "Location missing position; timestamp="
            r6.append(r13)
            r6.append(r14)
            java.lang.String r13 = "; source="
            r6.append(r13)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r12.<init>(r2)
            defpackage.ajix.b((java.lang.String) r11, (java.lang.Throwable) r12)
            goto L_0x048f
        L_0x0461:
            r22 = r2
            r23 = r6
            r24 = r13
            ajka r2 = r8.b
            if (r2 == 0) goto L_0x046c
            goto L_0x046e
        L_0x046c:
            ajka r2 = defpackage.ajka.d
        L_0x046e:
            int r6 = r2.b
            boolean r12 = r0.c
            if (r12 != 0) goto L_0x0475
            goto L_0x047b
        L_0x0475:
            r0.c()
            r12 = 0
            r0.c = r12
        L_0x047b:
            aucj r12 = r0.b
            atcj r12 = (defpackage.atcj) r12
            int r13 = r12.a
            r14 = 1
            r13 = r13 | r14
            r12.a = r13
            r12.b = r6
            int r2 = r2.c
            r6 = 2
            r13 = r13 | r6
            r12.a = r13
            r12.c = r2
        L_0x048f:
            int r2 = r8.a
            r6 = 8
            r2 = r2 & r6
            if (r2 == 0) goto L_0x04b0
            float r2 = r8.e
            int r2 = (int) r2
            boolean r6 = r0.c
            if (r6 != 0) goto L_0x049e
            goto L_0x04a4
        L_0x049e:
            r0.c()
            r6 = 0
            r0.c = r6
        L_0x04a4:
            aucj r6 = r0.b
            atcj r6 = (defpackage.atcj) r6
            int r12 = r6.a
            r13 = 4
            r12 = r12 | r13
            r6.a = r12
            r6.d = r2
        L_0x04b0:
            aucj r0 = r0.i()
            r2 = r0
            atcj r2 = (defpackage.atcj) r2
            atdd r0 = defpackage.atdd.g
            aucd r6 = r0.o()
            int r0 = r8.a
            r12 = 2
            r0 = r0 & r12
            if (r0 == 0) goto L_0x04f0
            int r0 = r8.c
            ajjw r0 = defpackage.ajjw.a(r0)
            if (r0 == 0) goto L_0x04cc
            goto L_0x04ce
        L_0x04cc:
            ajjw r0 = defpackage.ajjw.WIFI
        L_0x04ce:
            int r0 = r0.f
            int r0 = defpackage.atdc.a(r0)
            if (r0 != 0) goto L_0x04d7
            goto L_0x04f0
        L_0x04d7:
            boolean r12 = r6.c
            if (r12 != 0) goto L_0x04dc
            goto L_0x04e2
        L_0x04dc:
            r6.c()
            r12 = 0
            r6.c = r12
        L_0x04e2:
            aucj r12 = r6.b
            atdd r12 = (defpackage.atdd) r12
            int r0 = r0 + -1
            r12.b = r0
            int r0 = r12.a
            r13 = 1
            r0 = r0 | r13
            r12.a = r0
        L_0x04f0:
            java.util.ArrayList r0 = defpackage.ajob.a
            if (r0 == 0) goto L_0x0518
            java.util.ArrayList r12 = new java.util.ArrayList
            int r13 = r0.size()
            r12.<init>(r13)
            int r13 = r0.size()
            r14 = 0
        L_0x0502:
            if (r14 >= r13) goto L_0x0517
            java.lang.Object r15 = r0.get(r14)
            com.google.android.ulr.ApiExperiment r15 = (com.google.android.ulr.ApiExperiment) r15
            atcg r15 = defpackage.ajnq.a((com.google.android.ulr.ApiExperiment) r15)
            if (r15 != 0) goto L_0x0511
            goto L_0x0514
        L_0x0511:
            r12.add(r15)
        L_0x0514:
            int r14 = r14 + 1
            goto L_0x0502
        L_0x0517:
            goto L_0x0519
        L_0x0518:
            r12 = 0
        L_0x0519:
            aucx r0 = r8.n
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x070e
            aucx r0 = r8.n
            if (r0 == 0) goto L_0x070e
            boolean r13 = r0.isEmpty()     // Catch:{ RuntimeException -> 0x0702 }
            if (r13 != 0) goto L_0x070e
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ RuntimeException -> 0x0702 }
            int r14 = r0.size()     // Catch:{ RuntimeException -> 0x0702 }
            r13.<init>(r14)     // Catch:{ RuntimeException -> 0x0702 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RuntimeException -> 0x0702 }
        L_0x0538:
            boolean r14 = r0.hasNext()     // Catch:{ RuntimeException -> 0x0702 }
            if (r14 == 0) goto L_0x06fd
            java.lang.Object r14 = r0.next()     // Catch:{ RuntimeException -> 0x0702 }
            ajkf r14 = (defpackage.ajkf) r14     // Catch:{ RuntimeException -> 0x0702 }
            int r15 = r14.a     // Catch:{ RuntimeException -> 0x0702 }
            r25 = r15 & 1
            if (r25 == 0) goto L_0x06f5
            r15 = r15 & 2
            if (r15 == 0) goto L_0x06f5
            aten r15 = defpackage.aten.j     // Catch:{ RuntimeException -> 0x0702 }
            aucd r15 = r15.o()     // Catch:{ RuntimeException -> 0x0702 }
            r25 = r0
            int r0 = r14.a     // Catch:{ RuntimeException -> 0x0702 }
            r17 = 4
            r0 = r0 & 4
            if (r0 == 0) goto L_0x05a5
            int r0 = r14.d     // Catch:{ RuntimeException -> 0x059e }
            int r0 = defpackage.ajke.a(r0)     // Catch:{ RuntimeException -> 0x059e }
            if (r0 == 0) goto L_0x0567
            goto L_0x0568
        L_0x0567:
            r0 = 1
        L_0x0568:
            int r0 = r0 + -1
            int r0 = defpackage.atem.a(r0)     // Catch:{ RuntimeException -> 0x059e }
            if (r0 != 0) goto L_0x0599
            r26 = r0
            int r0 = r14.d     // Catch:{ RuntimeException -> 0x059e }
            int r0 = defpackage.ajke.a(r0)     // Catch:{ RuntimeException -> 0x059e }
            if (r0 == 0) goto L_0x057b
            goto L_0x057c
        L_0x057b:
            r0 = 1
        L_0x057c:
            int r0 = r0 + -1
            r27 = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x06f2 }
            r10 = 45
            r9.<init>(r10)     // Catch:{ RuntimeException -> 0x06f2 }
            java.lang.String r10 = "Unknown value for wifi auth type: "
            r9.append(r10)     // Catch:{ RuntimeException -> 0x06f2 }
            r9.append(r0)     // Catch:{ RuntimeException -> 0x06f2 }
            java.lang.String r0 = r9.toString()     // Catch:{ RuntimeException -> 0x06f2 }
            r9 = 28
            defpackage.ajix.c(r11, r9, r0)     // Catch:{ RuntimeException -> 0x06f2 }
            goto L_0x05a9
        L_0x0599:
            r26 = r0
            r27 = r9
            goto L_0x05a9
        L_0x059e:
            r0 = move-exception
            r27 = r9
        L_0x05a1:
            r26 = r4
            goto L_0x0707
        L_0x05a5:
            r27 = r9
            r26 = 1
        L_0x05a9:
            if (r26 == 0) goto L_0x05c4
            boolean r0 = r15.c     // Catch:{ RuntimeException -> 0x06f2 }
            if (r0 != 0) goto L_0x05b0
            goto L_0x05b6
        L_0x05b0:
            r15.c()     // Catch:{ RuntimeException -> 0x06f2 }
            r9 = 0
            r15.c = r9     // Catch:{ RuntimeException -> 0x06f2 }
        L_0x05b6:
            aucj r0 = r15.b     // Catch:{ RuntimeException -> 0x06f2 }
            aten r0 = (defpackage.aten) r0     // Catch:{ RuntimeException -> 0x06f2 }
            int r9 = r26 + -1
            r0.d = r9     // Catch:{ RuntimeException -> 0x06f2 }
            int r9 = r0.a     // Catch:{ RuntimeException -> 0x06f2 }
            r10 = 4
            r9 = r9 | r10
            r0.a = r9     // Catch:{ RuntimeException -> 0x06f2 }
        L_0x05c4:
            int r0 = r14.a     // Catch:{ RuntimeException -> 0x06f2 }
            r9 = 8
            r0 = r0 & r9
            if (r0 == 0) goto L_0x05e6
            boolean r0 = r14.e     // Catch:{ RuntimeException -> 0x06f2 }
            boolean r9 = r15.c     // Catch:{ RuntimeException -> 0x06f2 }
            if (r9 != 0) goto L_0x05d2
            goto L_0x05d8
        L_0x05d2:
            r15.c()     // Catch:{ RuntimeException -> 0x06f2 }
            r9 = 0
            r15.c = r9     // Catch:{ RuntimeException -> 0x06f2 }
        L_0x05d8:
            aucj r9 = r15.b     // Catch:{ RuntimeException -> 0x06f2 }
            aten r9 = (defpackage.aten) r9     // Catch:{ RuntimeException -> 0x06f2 }
            int r10 = r9.a     // Catch:{ RuntimeException -> 0x06f2 }
            r19 = 8
            r10 = r10 | 8
            r9.a = r10     // Catch:{ RuntimeException -> 0x06f2 }
            r9.e = r0     // Catch:{ RuntimeException -> 0x06f2 }
        L_0x05e6:
            int r0 = r14.g     // Catch:{ RuntimeException -> 0x06f2 }
            if (r0 == 0) goto L_0x064e
            ateo r0 = defpackage.ateo.g     // Catch:{ RuntimeException -> 0x06f2 }
            aucd r0 = r0.o()     // Catch:{ RuntimeException -> 0x06f2 }
            int r9 = r14.g     // Catch:{ RuntimeException -> 0x06f2 }
            boolean r10 = r0.c     // Catch:{ RuntimeException -> 0x06f2 }
            if (r10 != 0) goto L_0x05f7
            goto L_0x05fd
        L_0x05f7:
            r0.c()     // Catch:{ RuntimeException -> 0x06f2 }
            r10 = 0
            r0.c = r10     // Catch:{ RuntimeException -> 0x06f2 }
        L_0x05fd:
            aucj r10 = r0.b     // Catch:{ RuntimeException -> 0x06f2 }
            ateo r10 = (defpackage.ateo) r10     // Catch:{ RuntimeException -> 0x06f2 }
            r26 = r4
            int r4 = r10.a     // Catch:{ RuntimeException -> 0x06f0 }
            r20 = 1
            r4 = r4 | 1
            r10.a = r4     // Catch:{ RuntimeException -> 0x06f0 }
            r10.b = r9     // Catch:{ RuntimeException -> 0x06f0 }
            int r9 = r14.h     // Catch:{ RuntimeException -> 0x06f0 }
            r4 = r4 | 2
            r10.a = r4     // Catch:{ RuntimeException -> 0x06f0 }
            r10.c = r9     // Catch:{ RuntimeException -> 0x06f0 }
            int r9 = r14.i     // Catch:{ RuntimeException -> 0x06f0 }
            r4 = r4 | 4
            r10.a = r4     // Catch:{ RuntimeException -> 0x06f0 }
            r10.d = r9     // Catch:{ RuntimeException -> 0x06f0 }
            int r9 = r14.j     // Catch:{ RuntimeException -> 0x06f0 }
            r4 = r4 | 8
            r10.a = r4     // Catch:{ RuntimeException -> 0x06f0 }
            r10.e = r9     // Catch:{ RuntimeException -> 0x06f0 }
            int r9 = r14.k     // Catch:{ RuntimeException -> 0x06f0 }
            r4 = r4 | 16
            r10.a = r4     // Catch:{ RuntimeException -> 0x06f0 }
            r10.f = r9     // Catch:{ RuntimeException -> 0x06f0 }
            aucj r0 = r0.i()     // Catch:{ RuntimeException -> 0x06f0 }
            ateo r0 = (defpackage.ateo) r0     // Catch:{ RuntimeException -> 0x06f0 }
            boolean r4 = r15.c     // Catch:{ RuntimeException -> 0x06f0 }
            if (r4 != 0) goto L_0x0638
            goto L_0x063e
        L_0x0638:
            r15.c()     // Catch:{ RuntimeException -> 0x06f0 }
            r4 = 0
            r15.c = r4     // Catch:{ RuntimeException -> 0x06f0 }
        L_0x063e:
            aucj r4 = r15.b     // Catch:{ RuntimeException -> 0x06f0 }
            aten r4 = (defpackage.aten) r4     // Catch:{ RuntimeException -> 0x06f0 }
            r0.getClass()     // Catch:{ RuntimeException -> 0x06f0 }
            r4.g = r0     // Catch:{ RuntimeException -> 0x06f0 }
            int r0 = r4.a     // Catch:{ RuntimeException -> 0x06f0 }
            r0 = r0 | 32
            r4.a = r0     // Catch:{ RuntimeException -> 0x06f0 }
            goto L_0x0650
        L_0x064e:
            r26 = r4
        L_0x0650:
            java.lang.String r0 = r14.l     // Catch:{ RuntimeException -> 0x06f0 }
            boolean r4 = defpackage.azss.d()     // Catch:{ RuntimeException -> 0x06f0 }
            if (r4 == 0) goto L_0x0662
            int r0 = r14.a     // Catch:{ RuntimeException -> 0x06f0 }
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0661
            java.lang.String r0 = r14.l     // Catch:{ RuntimeException -> 0x06f0 }
            goto L_0x0662
        L_0x0661:
            r0 = 0
        L_0x0662:
            if (r0 == 0) goto L_0x067e
            boolean r4 = r15.c     // Catch:{ RuntimeException -> 0x06f0 }
            if (r4 != 0) goto L_0x0669
            goto L_0x066f
        L_0x0669:
            r15.c()     // Catch:{ RuntimeException -> 0x06f0 }
            r4 = 0
            r15.c = r4     // Catch:{ RuntimeException -> 0x06f0 }
        L_0x066f:
            aucj r4 = r15.b     // Catch:{ RuntimeException -> 0x06f0 }
            aten r4 = (defpackage.aten) r4     // Catch:{ RuntimeException -> 0x06f0 }
            r0.getClass()     // Catch:{ RuntimeException -> 0x06f0 }
            int r9 = r4.a     // Catch:{ RuntimeException -> 0x06f0 }
            r9 = r9 | 64
            r4.a = r9     // Catch:{ RuntimeException -> 0x06f0 }
            r4.h = r0     // Catch:{ RuntimeException -> 0x06f0 }
        L_0x067e:
            int r0 = r14.a     // Catch:{ RuntimeException -> 0x06f0 }
            r0 = r0 & 16
            if (r0 == 0) goto L_0x069d
            int r0 = r14.f     // Catch:{ RuntimeException -> 0x06f0 }
            boolean r4 = r15.c     // Catch:{ RuntimeException -> 0x06f0 }
            if (r4 != 0) goto L_0x068b
            goto L_0x0691
        L_0x068b:
            r15.c()     // Catch:{ RuntimeException -> 0x06f0 }
            r4 = 0
            r15.c = r4     // Catch:{ RuntimeException -> 0x06f0 }
        L_0x0691:
            aucj r4 = r15.b     // Catch:{ RuntimeException -> 0x06f0 }
            aten r4 = (defpackage.aten) r4     // Catch:{ RuntimeException -> 0x06f0 }
            int r9 = r4.a     // Catch:{ RuntimeException -> 0x06f0 }
            r9 = r9 | 16
            r4.a = r9     // Catch:{ RuntimeException -> 0x06f0 }
            r4.f = r0     // Catch:{ RuntimeException -> 0x06f0 }
        L_0x069d:
            int r0 = r14.a     // Catch:{ RuntimeException -> 0x06f0 }
            r4 = 1
            r0 = r0 & r4
            if (r0 == 0) goto L_0x06bf
            long r9 = r14.b     // Catch:{ RuntimeException -> 0x06f0 }
            boolean r0 = r15.c     // Catch:{ RuntimeException -> 0x06f0 }
            if (r0 != 0) goto L_0x06aa
        L_0x06a9:
            goto L_0x06b1
        L_0x06aa:
            r15.c()     // Catch:{ RuntimeException -> 0x06f0 }
            r4 = 0
            r15.c = r4     // Catch:{ RuntimeException -> 0x06f0 }
            goto L_0x06a9
        L_0x06b1:
            aucj r0 = r15.b     // Catch:{ RuntimeException -> 0x06f0 }
            aten r0 = (defpackage.aten) r0     // Catch:{ RuntimeException -> 0x06f0 }
            int r4 = r0.a     // Catch:{ RuntimeException -> 0x06f0 }
            r20 = 1
            r4 = r4 | 1
            r0.a = r4     // Catch:{ RuntimeException -> 0x06f0 }
            r0.b = r9     // Catch:{ RuntimeException -> 0x06f0 }
        L_0x06bf:
            int r0 = r14.a     // Catch:{ RuntimeException -> 0x06f0 }
            r4 = 2
            r0 = r0 & r4
            if (r0 != 0) goto L_0x06c6
            goto L_0x06df
        L_0x06c6:
            int r0 = r14.c     // Catch:{ RuntimeException -> 0x06f0 }
            boolean r4 = r15.c     // Catch:{ RuntimeException -> 0x06f0 }
            if (r4 != 0) goto L_0x06cd
            goto L_0x06d3
        L_0x06cd:
            r15.c()     // Catch:{ RuntimeException -> 0x06f0 }
            r4 = 0
            r15.c = r4     // Catch:{ RuntimeException -> 0x06f0 }
        L_0x06d3:
            aucj r4 = r15.b     // Catch:{ RuntimeException -> 0x06f0 }
            aten r4 = (defpackage.aten) r4     // Catch:{ RuntimeException -> 0x06f0 }
            int r9 = r4.a     // Catch:{ RuntimeException -> 0x06f0 }
            r10 = 2
            r9 = r9 | r10
            r4.a = r9     // Catch:{ RuntimeException -> 0x06f0 }
            r4.c = r0     // Catch:{ RuntimeException -> 0x06f0 }
        L_0x06df:
            aucj r0 = r15.i()     // Catch:{ RuntimeException -> 0x06f0 }
            aten r0 = (defpackage.aten) r0     // Catch:{ RuntimeException -> 0x06f0 }
            r13.add(r0)     // Catch:{ RuntimeException -> 0x06f0 }
            r0 = r25
            r4 = r26
            r9 = r27
            goto L_0x0538
        L_0x06f0:
            r0 = move-exception
            goto L_0x0707
        L_0x06f2:
            r0 = move-exception
            goto L_0x05a1
        L_0x06f5:
            r25 = r0
            r26 = r4
            r27 = r9
            goto L_0x0538
        L_0x06fd:
            r26 = r4
            r27 = r9
            goto L_0x0713
        L_0x0702:
            r0 = move-exception
            r26 = r4
            r27 = r9
        L_0x0707:
            java.lang.String r4 = "Best-effort Wifi scan conversion failed"
            defpackage.ajix.b((java.lang.String) r11, (java.lang.String) r4, (java.lang.Throwable) r0)
            r13 = 0
            goto L_0x0713
        L_0x070e:
            r26 = r4
            r27 = r9
            r13 = 0
        L_0x0713:
            if (r13 != 0) goto L_0x0716
            goto L_0x072d
        L_0x0716:
            boolean r0 = r6.c
            if (r0 != 0) goto L_0x071b
            goto L_0x0721
        L_0x071b:
            r6.c()
            r4 = 0
            r6.c = r4
        L_0x0721:
            aucj r0 = r6.b
            atdd r0 = (defpackage.atdd) r0
            r0.a()
            aucx r0 = r0.f
            defpackage.auab.a((java.lang.Iterable) r13, (java.util.List) r0)
        L_0x072d:
            int r0 = r8.a
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x074c
            boolean r0 = r8.j
            boolean r4 = r6.c
            if (r4 != 0) goto L_0x073a
            goto L_0x0740
        L_0x073a:
            r6.c()
            r4 = 0
            r6.c = r4
        L_0x0740:
            aucj r4 = r6.b
            atdd r4 = (defpackage.atdd) r4
            int r9 = r4.a
            r10 = 4
            r9 = r9 | r10
            r4.a = r9
            r4.d = r0
        L_0x074c:
            int r0 = r8.a
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x07f1
            ajjp r0 = r8.o
            if (r0 == 0) goto L_0x0757
            goto L_0x0759
        L_0x0757:
            ajjp r0 = defpackage.ajjp.f
        L_0x0759:
            int r4 = r0.a
            r9 = 1
            r4 = r4 & r9
            if (r4 == 0) goto L_0x0781
            int r4 = r0.b
            int r4 = defpackage.ajjo.a(r4)
            if (r4 == 0) goto L_0x0768
            goto L_0x0769
        L_0x0768:
            r4 = 1
        L_0x0769:
            int r4 = r4 + -1
            if (r4 == 0) goto L_0x077e
            r9 = 1
            if (r4 == r9) goto L_0x077b
            r9 = 2
            if (r4 == r9) goto L_0x0778
            r9 = 3
            if (r4 == r9) goto L_0x0782
            r4 = 3
            goto L_0x0783
        L_0x0778:
            r9 = 3
            r4 = 2
            goto L_0x0783
        L_0x077b:
            r9 = 3
            r4 = 4
            goto L_0x0783
        L_0x077e:
            r9 = 3
            r4 = 1
            goto L_0x0783
        L_0x0781:
            r9 = 3
        L_0x0782:
            r4 = 0
        L_0x0783:
            atbt r10 = defpackage.atbt.f
            aucd r10 = r10.o()
            if (r4 != 0) goto L_0x078c
            goto L_0x07a6
        L_0x078c:
            boolean r13 = r10.c
            if (r13 != 0) goto L_0x0791
            goto L_0x0797
        L_0x0791:
            r10.c()
            r13 = 0
            r10.c = r13
        L_0x0797:
            aucj r13 = r10.b
            atbt r13 = (defpackage.atbt) r13
            int r4 = r4 + -1
            r13.e = r4
            int r4 = r13.a
            r14 = 8
            r4 = r4 | r14
            r13.a = r4
        L_0x07a6:
            int r4 = r0.d
            boolean r13 = r10.c
            if (r13 != 0) goto L_0x07ad
            goto L_0x07b3
        L_0x07ad:
            r10.c()
            r13 = 0
            r10.c = r13
        L_0x07b3:
            aucj r13 = r10.b
            atbt r13 = (defpackage.atbt) r13
            int r14 = r13.a
            r15 = 1
            r14 = r14 | r15
            r13.a = r14
            r13.b = r4
            int r4 = r0.c
            r15 = 2
            r14 = r14 | r15
            r13.a = r14
            r13.c = r4
            int r0 = r0.e
            r4 = 4
            r14 = r14 | r4
            r13.a = r14
            r13.d = r0
            aucj r0 = r10.i()
            atbt r0 = (defpackage.atbt) r0
            boolean r4 = r6.c
            if (r4 != 0) goto L_0x07da
            goto L_0x07e0
        L_0x07da:
            r6.c()
            r4 = 0
            r6.c = r4
        L_0x07e0:
            aucj r4 = r6.b
            atdd r4 = (defpackage.atdd) r4
            r0.getClass()
            r4.e = r0
            int r0 = r4.a
            r10 = 8
            r0 = r0 | r10
            r4.a = r0
            goto L_0x07f2
        L_0x07f1:
            r9 = 3
        L_0x07f2:
            aucj r0 = r6.i()
            atdd r0 = (defpackage.atdd) r0
            atck r4 = defpackage.atck.j
            aucd r4 = r4.o()
            int r6 = r8.a
            r10 = 65536(0x10000, float:9.18355E-41)
            r6 = r6 & r10
            if (r6 == 0) goto L_0x081e
            long r13 = r8.r
            boolean r6 = r4.c
            if (r6 != 0) goto L_0x080c
            goto L_0x0812
        L_0x080c:
            r4.c()
            r6 = 0
            r4.c = r6
        L_0x0812:
            aucj r6 = r4.b
            atck r6 = (defpackage.atck) r6
            int r10 = r6.a
            r10 = r10 | 32
            r6.a = r10
            r6.h = r13
        L_0x081e:
            boolean r6 = defpackage.azsa.b()
            if (r6 == 0) goto L_0x0825
            goto L_0x084a
        L_0x0825:
            int r6 = r8.a
            r10 = 131072(0x20000, float:1.83671E-40)
            r6 = r6 & r10
            if (r6 == 0) goto L_0x0832
            boolean r6 = r8.s
            if (r6 == 0) goto L_0x0832
            r6 = 1
            goto L_0x0833
        L_0x0832:
            r6 = 0
        L_0x0833:
            boolean r10 = r4.c
            if (r10 != 0) goto L_0x0838
            goto L_0x083e
        L_0x0838:
            r4.c()
            r10 = 0
            r4.c = r10
        L_0x083e:
            aucj r10 = r4.b
            atck r10 = (defpackage.atck) r10
            int r13 = r10.a
            r13 = r13 | 64
            r10.a = r13
            r10.i = r6
        L_0x084a:
            int r6 = r8.a
            r10 = 4
            r6 = r6 & r10
            if (r6 != 0) goto L_0x0879
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            int r10 = r8.c
            ajjw r10 = defpackage.ajjw.a(r10)
            if (r10 == 0) goto L_0x085b
            goto L_0x085d
        L_0x085b:
            ajjw r10 = defpackage.ajjw.WIFI
        L_0x085d:
            int r10 = r10.f
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r14 = 46
            r13.<init>(r14)
            java.lang.String r14 = "Location missing timestamp; source="
            r13.append(r14)
            r13.append(r10)
            java.lang.String r10 = r13.toString()
            r6.<init>(r10)
            defpackage.ajix.b((java.lang.String) r11, (java.lang.Throwable) r6)
            goto L_0x0892
        L_0x0879:
            long r13 = r8.d
            boolean r6 = r4.c
            if (r6 != 0) goto L_0x0880
            goto L_0x0886
        L_0x0880:
            r4.c()
            r6 = 0
            r4.c = r6
        L_0x0886:
            aucj r6 = r4.b
            atck r6 = (defpackage.atck) r6
            int r10 = r6.a
            r15 = 1
            r10 = r10 | r15
            r6.a = r10
            r6.b = r13
        L_0x0892:
            int r6 = r8.a
            r6 = r6 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L_0x08b2
            int r6 = r8.p
            boolean r10 = r4.c
            if (r10 != 0) goto L_0x089f
            goto L_0x08a5
        L_0x089f:
            r4.c()
            r10 = 0
            r4.c = r10
        L_0x08a5:
            aucj r10 = r4.b
            atck r10 = (defpackage.atck) r10
            int r13 = r10.a
            r14 = 8
            r13 = r13 | r14
            r10.a = r13
            r10.f = r6
        L_0x08b2:
            int r6 = r8.a
            r10 = 32768(0x8000, float:4.5918E-41)
            r6 = r6 & r10
            if (r6 == 0) goto L_0x08d3
            int r6 = r8.q
            boolean r8 = r4.c
            if (r8 != 0) goto L_0x08c1
            goto L_0x08c7
        L_0x08c1:
            r4.c()
            r8 = 0
            r4.c = r8
        L_0x08c7:
            aucj r8 = r4.b
            atck r8 = (defpackage.atck) r8
            int r10 = r8.a
            r10 = r10 | 16
            r8.a = r10
            r8.g = r6
        L_0x08d3:
            if (r12 == 0) goto L_0x08ec
            boolean r6 = r4.c
            if (r6 != 0) goto L_0x08da
            goto L_0x08e0
        L_0x08da:
            r4.c()
            r6 = 0
            r4.c = r6
        L_0x08e0:
            aucj r6 = r4.b
            atck r6 = (defpackage.atck) r6
            r6.a()
            aucx r6 = r6.e
            defpackage.auab.a((java.lang.Iterable) r12, (java.util.List) r6)
        L_0x08ec:
            boolean r6 = r4.c
            if (r6 != 0) goto L_0x08f1
            goto L_0x08f7
        L_0x08f1:
            r4.c()
            r6 = 0
            r4.c = r6
        L_0x08f7:
            aucj r6 = r4.b
            atck r6 = (defpackage.atck) r6
            r2.getClass()
            r6.d = r2
            int r2 = r6.a
            r8 = 4
            r2 = r2 | r8
            r6.a = r2
            r0.getClass()
            r6.c = r0
            r8 = 2
            r0 = r2 | 2
            r6.a = r0
            aucj r0 = r4.i()
            atck r0 = (defpackage.atck) r0
            r5.add(r0)
            int r7 = r7 + 1
            r2 = r22
            r6 = r23
            r13 = r24
            r4 = r26
            r9 = r27
            goto L_0x032a
        L_0x0927:
            r26 = r4
            r27 = r9
            r24 = r13
            goto L_0x0935
        L_0x092e:
            r26 = r4
            r27 = r9
            r24 = r13
            r5 = 0
        L_0x0935:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r6 = 11
            int r2 = r2 + r6
            r4.<init>(r2)
            java.lang.String r2 = "Locations: "
            r4.append(r2)
            r4.append(r0)
            r4.toString()
            r13 = r24
            goto L_0x09aa
        L_0x0957:
            r26 = r4
            r27 = r9
            java.util.ArrayList r0 = r3.b
            java.util.ArrayList r0 = defpackage.ajob.b((java.util.List) r0)
            java.util.ArrayList r2 = r3.a
            java.util.ArrayList r2 = defpackage.ajob.a((java.util.List) r2)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            if (r0 == 0) goto L_0x0988
            int r4 = r0.size()
            r5 = 0
        L_0x0973:
            if (r5 >= r4) goto L_0x0988
            java.lang.Object r6 = r0.get(r5)
            com.google.android.ulr.ApiActivityReading r6 = (com.google.android.ulr.ApiActivityReading) r6
            atbn r6 = defpackage.ajnq.a((com.google.android.ulr.ApiActivityReading) r6)
            if (r6 != 0) goto L_0x0982
            goto L_0x0985
        L_0x0982:
            r13.add(r6)
        L_0x0985:
            int r5 = r5 + 1
            goto L_0x0973
        L_0x0988:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            if (r2 == 0) goto L_0x09a9
            int r0 = r2.size()
            r4 = 0
        L_0x0994:
            if (r4 >= r0) goto L_0x09a9
            java.lang.Object r6 = r2.get(r4)
            com.google.android.ulr.ApiLocationReading r6 = (com.google.android.ulr.ApiLocationReading) r6
            atck r6 = defpackage.ajnq.a((com.google.android.ulr.ApiLocationReading) r6)
            if (r6 != 0) goto L_0x09a3
            goto L_0x09a6
        L_0x09a3:
            r5.add(r6)
        L_0x09a6:
            int r4 = r4 + 1
            goto L_0x0994
        L_0x09a9:
        L_0x09aa:
            atbr r0 = r1.a(r3, r13, r5)
            atef r2 = defpackage.atef.g
            aucd r2 = r2.o()
            boolean r4 = r2.c
            if (r4 != 0) goto L_0x09b9
            goto L_0x09bf
        L_0x09b9:
            r2.c()
            r4 = 0
            r2.c = r4
        L_0x09bf:
            aucj r4 = r2.b
            atef r4 = (defpackage.atef) r4
            int r6 = r4.a
            r7 = 1
            r6 = r6 | r7
            r4.a = r6
            r7 = r33
            r4.b = r7
            r26.getClass()
            r7 = r26
            r4.c = r7
            r7 = 2
            r6 = r6 | r7
            r4.a = r6
            r0.getClass()
            r4.e = r0
            r7 = 8
            r0 = r6 | 8
            r4.a = r0
            r6 = 4
            r0 = r0 | r6
            r4.a = r0
            r6 = r36
            r4.d = r6
            r0 = r0 | 16
            r4.a = r0
            r6 = r27
            r4.f = r6
            aucj r0 = r2.i()
            r11 = r0
            atef r11 = (defpackage.atef) r11
            java.util.ArrayList r0 = r3.a     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8 = -9223372036854775808
        L_0x0a07:
            boolean r4 = r0.hasNext()     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            if (r4 == 0) goto L_0x0a20
            java.lang.Object r4 = r0.next()     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            ajjx r4 = (defpackage.ajjx) r4     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            long r12 = r4.d     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            long r2 = java.lang.Math.min(r2, r12)     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            long r12 = r4.d     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            long r8 = java.lang.Math.max(r8, r12)     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            goto L_0x0a07
        L_0x0a20:
            long r14 = r6 - r2
            r12 = 0
            r16 = r2
            r18 = r8
            defpackage.ajjd.a((long) r12, (long) r14, (long) r16, (long) r18)     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            ajlf r0 = j     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            android.content.Context r2 = r1.i     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            r3 = r32
            com.google.android.gms.common.internal.ClientContext r10 = a((android.content.Context) r2, (android.accounts.Account) r3)     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            baaj r2 = defpackage.ajlf.f     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            if (r2 == 0) goto L_0x0a3a
            goto L_0x0a50
        L_0x0a3a:
            baai r2 = defpackage.baai.UNARY     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            java.lang.String r4 = "userlocation.UserLocationReportingService/ReportApiBatch"
            atef r6 = defpackage.atef.g     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            baah r6 = defpackage.baoq.a(r6)     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            atee r7 = defpackage.atee.d     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            baah r7 = defpackage.baoq.a(r7)     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            baaj r2 = defpackage.baaj.a(r2, r4, r6, r7)     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            defpackage.ajlf.f = r2     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
        L_0x0a50:
            izd r8 = r0.a     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            baaj r9 = defpackage.ajlf.f     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            r12 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            java.lang.Object r0 = r8.a(r9, r10, r11, r12, r14)     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            atee r0 = (defpackage.atee) r0     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            if (r5 != 0) goto L_0x0a61
            goto L_0x0a7a
        L_0x0a61:
            int r2 = r5.size()     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            int r4 = r0.c     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            int r2 = r2 - r4
            if (r2 <= 0) goto L_0x0a71
            java.lang.String r4 = "UlrServerLocationsMissing"
            long r5 = (long) r2     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            defpackage.ajjb.b(r4, r5)     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            goto L_0x0a7a
        L_0x0a71:
            if (r2 >= 0) goto L_0x0a7a
            java.lang.String r4 = "UlrServerLocationsExtra"
            int r2 = -r2
            long r5 = (long) r2     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            defpackage.ajjb.b(r4, r5)     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
        L_0x0a7a:
            r2 = 1
            defpackage.ajjd.a((boolean) r2)     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            int r4 = r0.a     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            r2 = r2 & r4
            if (r2 == 0) goto L_0x0a90
            atdl r0 = r0.b     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            if (r0 == 0) goto L_0x0a89
            goto L_0x0a8b
        L_0x0a89:
            atdl r0 = defpackage.atdl.j     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
        L_0x0a8b:
            ajkh r11 = defpackage.ajkh.a((android.accounts.Account) r3, (defpackage.atdl) r0)     // Catch:{ babk -> 0x0a94, eif -> 0x0a92 }
            goto L_0x0a91
        L_0x0a90:
            r11 = 0
        L_0x0a91:
            return r11
        L_0x0a92:
            r0 = move-exception
            goto L_0x0a95
        L_0x0a94:
            r0 = move-exception
        L_0x0a95:
            boolean r2 = defpackage.azte.d()
            if (r2 == 0) goto L_0x0a9f
            defpackage.ajjd.d((java.lang.Throwable) r0)
            goto L_0x0aa4
        L_0x0a9f:
            r2 = 0
            defpackage.ajjd.a((boolean) r2)
        L_0x0aa4:
            goto L_0x0aa6
        L_0x0aa5:
            throw r0
        L_0x0aa6:
            goto L_0x0aa5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajkj.a(android.accounts.Account, int, java.lang.String, ajip, long):ajkh");
    }

    public final aucd a(String str, boolean z) {
        aucd o = atbz.r.o();
        aucd o2 = atba.h.o();
        String a = jlh.a(d);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atba atba = (atba) o2.b;
        a.getClass();
        atba.a |= 8;
        atba.e = a;
        String a2 = jlh.a(h);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atba atba2 = (atba) o2.b;
        a2.getClass();
        atba2.a |= 1;
        atba2.b = a2;
        String a3 = jlh.a(f);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atba atba3 = (atba) o2.b;
        a3.getClass();
        atba3.a |= 2;
        atba3.c = a3;
        String a4 = jlh.a(e);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atba atba4 = (atba) o2.b;
        a4.getClass();
        atba4.a |= 4;
        atba4.d = a4;
        String a5 = jlh.a(g);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atba atba5 = (atba) o2.b;
        a5.getClass();
        atba5.a |= 16;
        atba5.f = a5;
        boolean booleanValue = this.n.booleanValue();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atba atba6 = (atba) o2.b;
        atba6.a |= 64;
        atba6.g = booleanValue;
        if (o.c) {
            o.c();
            o.c = false;
        }
        atbz atbz = (atbz) o.b;
        atba atba7 = (atba) o2.i();
        atba7.getClass();
        atbz.p = atba7;
        atbz.a |= 131072;
        int i2 = this.k;
        if (o.c) {
            o.c();
            o.c = false;
        }
        atbz atbz2 = (atbz) o.b;
        atbz2.a |= 32768;
        atbz2.n = i2;
        if (azss.e()) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            atbz atbz3 = (atbz) o.b;
            atbz3.c = 1;
            atbz3.a |= 2;
        }
        if (z) {
            String a6 = jlh.a((String) null);
            if (o.c) {
                o.c();
                o.c = false;
            }
            atbz atbz4 = (atbz) o.b;
            a6.getClass();
            atbz4.a |= 8;
            atbz4.e = a6;
            String a7 = jlh.a(ajki.c);
            if (o.c) {
                o.c();
                o.c = false;
            }
            atbz atbz5 = (atbz) o.b;
            a7.getClass();
            int i3 = atbz5.a | 2048;
            atbz5.a = i3;
            atbz5.j = a7;
            atbz5.k = 0;
            atbz5.a = i3 | FragmentTransaction.TRANSIT_ENTER_MASK;
            String a8 = jlh.a((String) null);
            if (o.c) {
                o.c();
                o.c = false;
            }
            atbz atbz6 = (atbz) o.b;
            a8.getClass();
            atbz6.a |= 16;
            atbz6.f = a8;
            String a9 = jlh.a((String) null);
            if (o.c) {
                o.c();
                o.c = false;
            }
            atbz atbz7 = (atbz) o.b;
            a9.getClass();
            int i4 = atbz7.a | 32;
            atbz7.a = i4;
            atbz7.g = a9;
            int i5 = this.m;
            int i6 = i4 | 262144;
            atbz7.a = i6;
            atbz7.q = i5;
            atbz7.a = i6 | 4;
            atbz7.d = 2023;
            int i7 = ajki.a;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atbz atbz8 = (atbz) o.b;
            int i8 = atbz8.a | 512;
            atbz8.a = i8;
            atbz8.i = i7;
            int i9 = this.l;
            atbz8.a = i8 | 65536;
            atbz8.o = i9;
            String a10 = jlh.a(b);
            if (o.c) {
                o.c();
                o.c = false;
            }
            atbz atbz9 = (atbz) o.b;
            a10.getClass();
            atbz9.a |= 1;
            atbz9.b = a10;
            String a11 = jlh.a((String) null);
            if (o.c) {
                o.c();
                o.c = false;
            }
            atbz atbz10 = (atbz) o.b;
            a11.getClass();
            atbz10.a |= 64;
            atbz10.h = a11;
            String a12 = jlh.a(str);
            if (o.c) {
                o.c();
                o.c = false;
            }
            atbz atbz11 = (atbz) o.b;
            a12.getClass();
            atbz11.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
            atbz11.l = a12;
        }
        return o;
    }
}
