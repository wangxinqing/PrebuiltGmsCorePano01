package defpackage;

import android.content.res.Resources;
import com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: pbj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pbj {
    private final String a;
    private final String b;
    private final int[] c;
    private final Map d;
    private final Resources e;
    private boolean f;
    private List g;

    public pbj(String str, RegisterCorpusInfo registerCorpusInfo, Resources resources) {
        this.a = str;
        this.b = registerCorpusInfo.a;
        GlobalSearchCorpusConfig globalSearchCorpusConfig = registerCorpusInfo.e;
        if (globalSearchCorpusConfig != null) {
            this.c = globalSearchCorpusConfig.a;
        } else {
            this.c = null;
        }
        HashMap hashMap = new HashMap(registerCorpusInfo.d.length);
        int i = 0;
        while (true) {
            RegisterSectionInfo[] registerSectionInfoArr = registerCorpusInfo.d;
            if (i < registerSectionInfoArr.length) {
                hashMap.put(registerSectionInfoArr[i].a, Integer.valueOf(i));
                i++;
            } else {
                this.d = hashMap;
                this.e = resources;
                return;
            }
        }
    }

    public static ouz a(int i) {
        aucd o = ouz.f.o();
        aucd o2 = oux.f.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        oux oux = (oux) o2.b;
        oux.a |= 1;
        oux.b = i;
        oux oux2 = (oux) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ouz ouz = (ouz) o.b;
        oux2.getClass();
        ouz.c = oux2;
        ouz.a |= 2;
        return (ouz) o.i();
    }

    public final List b() {
        if (this.g == null && !this.f) {
            try {
                a();
            } catch (pav e2) {
                return null;
            }
        }
        return this.g;
    }

    public pbj(osz osz, Resources resources) {
        this.a = osz.e;
        this.b = osz.c;
        this.c = new int[dtb.a()];
        aucx aucx = osz.k;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            ovb ovb = (ovb) aucx.get(i);
            this.c[ovb.b] = ovb.d;
        }
        int size2 = osz.j.size();
        HashMap hashMap = new HashMap(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            hashMap.put(((oqy) osz.j.get(i2)).b, Integer.valueOf(i2));
        }
        this.d = hashMap;
        this.e = resources;
    }

    public static ouz a(String str) {
        aucd o = ouz.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ouz ouz = (ouz) o.b;
        str.getClass();
        ouz.a |= 1;
        ouz.b = str;
        return (ouz) o.i();
    }

    private static ouz a(Map map, String str) {
        return a(((Integer) map.get(str)).intValue());
    }

    private static ovb a(int i, int i2, ouz[] ouzArr) {
        aucd o = ovb.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ovb ovb = (ovb) o.b;
        int i3 = ovb.a | 4;
        ovb.a = i3;
        ovb.d = i;
        ovb.a = i3 | 1;
        ovb.b = i2;
        aucd o2 = ova.b.o();
        List asList = Arrays.asList(ouzArr);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ova ova = (ova) o2.b;
        if (!ova.a.a()) {
            ova.a = aucj.a(ova.a);
        }
        auab.a((Iterable) asList, (List) ova.a);
        ova ova2 = (ova) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ovb ovb2 = (ovb) o.b;
        ova2.getClass();
        ovb2.c = ova2;
        ovb2.a |= 2;
        return (ovb) o.i();
    }

    public static ovb a(int i, ouz[] ouzArr) {
        return a(0, i, ouzArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x029c A[SYNTHETIC, Splitter:B:126:0x029c] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x051c A[Catch:{ pbk -> 0x0677 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r25 = this;
            r1 = r25
            int[] r2 = r1.c
            r3 = 1
            if (r2 == 0) goto L_0x06c1
            java.lang.String r2 = r1.b
            boolean r2 = defpackage.oxe.a(r2)
            r4 = 2
            r5 = 4
            r6 = 0
            if (r2 == 0) goto L_0x0099
            ovb[] r2 = new defpackage.ovb[r5]
            java.lang.String r5 = "text1"
            int r5 = defpackage.dtb.a((java.lang.String) r5)
            ouz[] r7 = new defpackage.ouz[r3]
            java.util.Map r8 = r1.d
            java.lang.String r9 = "name"
            ouz r8 = a((java.util.Map) r8, (java.lang.String) r9)
            r7[r6] = r8
            ovb r5 = a((int) r5, (defpackage.ouz[]) r7)
            r2[r6] = r5
            java.lang.String r5 = "intent_action"
            int r5 = defpackage.dtb.a((java.lang.String) r5)
            ouz[] r7 = new defpackage.ouz[r3]
            java.lang.String r8 = "android.intent.action.VIEW"
            ouz r8 = a((java.lang.String) r8)
            r7[r6] = r8
            ovb r5 = a((int) r5, (defpackage.ouz[]) r7)
            r2[r3] = r5
            java.lang.String r5 = "intent_data"
            int r5 = defpackage.dtb.a((java.lang.String) r5)
            ouz[] r7 = new defpackage.ouz[r3]
            ouz r8 = defpackage.ouz.f
            aucd r8 = r8.o()
            ouy r9 = defpackage.ouy.a
            boolean r10 = r8.c
            if (r10 != 0) goto L_0x0057
            goto L_0x005c
        L_0x0057:
            r8.c()
            r8.c = r6
        L_0x005c:
            aucj r10 = r8.b
            ouz r10 = (defpackage.ouz) r10
            r9.getClass()
            r10.e = r9
            int r9 = r10.a
            r9 = r9 | 8
            r10.a = r9
            aucj r8 = r8.i()
            ouz r8 = (defpackage.ouz) r8
            r7[r6] = r8
            ovb r5 = a((int) r5, (defpackage.ouz[]) r7)
            r2[r4] = r5
            java.lang.String r4 = "thing_proto"
            int r5 = defpackage.dtb.a((java.lang.String) r4)
            ouz[] r7 = new defpackage.ouz[r3]
            java.util.Map r8 = r1.d
            ouz r4 = a((java.util.Map) r8, (java.lang.String) r4)
            r7[r6] = r4
            r4 = 3
            ovb r5 = a((int) r5, (defpackage.ouz[]) r7)
            r2[r4] = r5
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.g = r2
            r1.f = r3
            return
        L_0x0099:
            android.content.res.Resources r2 = r1.e
            if (r2 != 0) goto L_0x00bb
            pax r2 = new pax
            java.lang.String r3 = r1.a
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Failed to get resources for "
            int r5 = r3.length()
            if (r5 != 0) goto L_0x00b3
            java.lang.String r3 = new java.lang.String
            r3.<init>(r4)
            goto L_0x00b7
        L_0x00b3:
            java.lang.String r3 = r4.concat(r3)
        L_0x00b7:
            r2.<init>(r3)
            throw r2
        L_0x00bb:
            int[] r2 = r1.c
            int r2 = r2.length
            pbi[] r7 = new defpackage.pbi[r2]
            r8 = 0
        L_0x00c1:
            int[] r9 = r1.c
            int r10 = r9.length
            if (r8 >= r10) goto L_0x011b
            r9 = r9[r8]
            if (r9 != 0) goto L_0x00cb
            goto L_0x00d8
        L_0x00cb:
            pbi r10 = new pbi     // Catch:{ NotFoundException -> 0x00db }
            android.content.res.Resources r11 = r1.e     // Catch:{ NotFoundException -> 0x00db }
            java.lang.String r11 = r11.getString(r9)     // Catch:{ NotFoundException -> 0x00db }
            r10.<init>(r9, r11)     // Catch:{ NotFoundException -> 0x00db }
            r7[r8] = r10     // Catch:{ NotFoundException -> 0x00db }
        L_0x00d8:
            int r8 = r8 + 1
            goto L_0x00c1
        L_0x00db:
            r0 = move-exception
            r2 = r0
            pau r3 = new pau
            java.lang.String r4 = defpackage.dtb.a((int) r8)
            int[] r5 = r1.c
            r5 = r5[r8]
            java.lang.String r5 = java.lang.Integer.toHexString(r5)
            java.lang.String r6 = java.lang.String.valueOf(r4)
            int r6 = r6.length()
            java.lang.String r7 = java.lang.String.valueOf(r5)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r6 = r6 + 28
            int r6 = r6 + r7
            r8.<init>(r6)
            java.lang.String r6 = "Invalid resource ID for "
            r8.append(r6)
            r8.append(r4)
            java.lang.String r4 = ": 0x"
            r8.append(r4)
            r8.append(r5)
            java.lang.String r4 = r8.toString()
            r3.<init>(r4, r2)
            throw r3
        L_0x011b:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r2)
            r9 = 0
        L_0x0121:
            if (r9 < r2) goto L_0x0128
            r1.g = r8     // Catch:{ all -> 0x0679 }
            r1.f = r3
            return
        L_0x0128:
            r10 = 36
            r11 = r7[r9]     // Catch:{ pbk -> 0x067c }
            r12 = 0
            if (r11 == 0) goto L_0x065a
            pbo r13 = new pbo     // Catch:{ pbk -> 0x067c }
            java.lang.String r14 = r11.b     // Catch:{ pbk -> 0x067c }
            java.util.Map r15 = r1.d     // Catch:{ pbk -> 0x067c }
            r13.<init>(r14, r15)     // Catch:{ pbk -> 0x067c }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ pbk -> 0x067c }
            r14.<init>()     // Catch:{ pbk -> 0x067c }
        L_0x013d:
            boolean r15 = r13.a()     // Catch:{ pbk -> 0x067c }
            if (r15 == 0) goto L_0x0162
            int r11 = r11.a     // Catch:{ pbk -> 0x015c }
            ouz[] r12 = new defpackage.ouz[r6]     // Catch:{ pbk -> 0x015c }
            java.lang.Object[] r12 = r14.toArray(r12)     // Catch:{ pbk -> 0x015c }
            ouz[] r12 = (defpackage.ouz[]) r12     // Catch:{ pbk -> 0x015c }
            ovb r12 = a(r11, r9, r12)     // Catch:{ pbk -> 0x015c }
            r19 = r2
            r20 = r7
            r24 = r9
            r2 = 0
            r17 = 4
            goto L_0x0664
        L_0x015c:
            r0 = move-exception
            r1 = r0
            r24 = r9
            goto L_0x0680
        L_0x0162:
            r13.b()     // Catch:{ pbk -> 0x067c }
            char r15 = r13.e()     // Catch:{ pbk -> 0x067c }
            r4 = 37
            if (r15 == r4) goto L_0x0199
        L_0x016d:
            boolean r15 = r13.a()     // Catch:{ pbk -> 0x015c }
            if (r15 == 0) goto L_0x0174
        L_0x0173:
            goto L_0x017e
        L_0x0174:
            char r15 = r13.e()     // Catch:{ pbk -> 0x015c }
            if (r15 == r4) goto L_0x0173
            r13.d()     // Catch:{ pbk -> 0x015c }
            goto L_0x016d
        L_0x017e:
            pbl r4 = r13.c()     // Catch:{ pbk -> 0x015c }
            java.lang.Object r4 = r4.b     // Catch:{ pbk -> 0x015c }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ pbk -> 0x015c }
            ouz r4 = defpackage.pbo.b((java.lang.String) r4)     // Catch:{ pbk -> 0x015c }
            r19 = r2
            r1 = r4
            r20 = r7
            r24 = r9
            r21 = r11
            r2 = 0
            r4 = 2
            r17 = 4
            goto L_0x0645
        L_0x0199:
            r13.d()     // Catch:{ pbk -> 0x067c }
            boolean r15 = r13.a()     // Catch:{ pbk -> 0x067c }
            if (r15 == 0) goto L_0x01a7
            java.lang.String r15 = "Expected % or a section name"
            r13.a((java.lang.String) r15)     // Catch:{ pbk -> 0x015c }
        L_0x01a7:
            char r15 = r13.e()     // Catch:{ pbk -> 0x067c }
            if (r15 != r4) goto L_0x01c5
            r13.d()     // Catch:{ pbk -> 0x015c }
            java.lang.String r4 = "%"
            ouz r4 = defpackage.pbo.b((java.lang.String) r4)     // Catch:{ pbk -> 0x015c }
            r19 = r2
            r1 = r4
            r20 = r7
            r24 = r9
            r21 = r11
            r2 = 0
            r4 = 2
            r17 = 4
            goto L_0x0645
        L_0x01c5:
            char r4 = r13.e()     // Catch:{ pbk -> 0x067c }
            if (r4 != r10) goto L_0x01cc
            goto L_0x01d7
        L_0x01cc:
            boolean r4 = defpackage.pbo.b((char) r4)     // Catch:{ pbk -> 0x067c }
            if (r4 != 0) goto L_0x01d7
            java.lang.String r4 = "Expected a section name or special section name"
            r13.a((java.lang.String) r4)     // Catch:{ pbk -> 0x015c }
        L_0x01d7:
            pbl r4 = r13.g()     // Catch:{ pbk -> 0x067c }
            boolean r15 = r13.a()     // Catch:{ pbk -> 0x067c }
            if (r15 != 0) goto L_0x0289
            char r15 = r13.e()     // Catch:{ pbk -> 0x015c }
            r3 = 40
            if (r15 != r3) goto L_0x0289
            r13.d()     // Catch:{ pbk -> 0x015c }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ pbk -> 0x015c }
            r3.<init>()     // Catch:{ pbk -> 0x015c }
        L_0x01f1:
            boolean r15 = r13.a()     // Catch:{ pbk -> 0x015c }
            if (r15 != 0) goto L_0x027a
            char r15 = r13.e()     // Catch:{ pbk -> 0x015c }
            r5 = 41
            if (r15 == r5) goto L_0x027a
            char r15 = r13.e()     // Catch:{ pbk -> 0x015c }
            boolean r18 = java.lang.Character.isWhitespace(r15)     // Catch:{ pbk -> 0x015c }
            if (r18 == 0) goto L_0x020e
            r13.d()     // Catch:{ pbk -> 0x015c }
            r5 = 4
            goto L_0x01f1
        L_0x020e:
            if (r15 != r10) goto L_0x0211
            goto L_0x021e
        L_0x0211:
            boolean r15 = defpackage.pbo.b((char) r15)     // Catch:{ pbk -> 0x015c }
            if (r15 != 0) goto L_0x021e
            java.lang.String r5 = "Expected a name"
            r13.a((java.lang.String) r5)     // Catch:{ pbk -> 0x015c }
            r5 = 4
            goto L_0x01f1
        L_0x021e:
            pbl r15 = r13.g()     // Catch:{ pbk -> 0x015c }
            r13.f()     // Catch:{ pbk -> 0x015c }
            boolean r18 = r13.a()     // Catch:{ pbk -> 0x015c }
            if (r18 == 0) goto L_0x0230
            java.lang.String r10 = "Expected a ) or :"
            r13.a((java.lang.String) r10)     // Catch:{ pbk -> 0x015c }
        L_0x0230:
            char r10 = r13.e()     // Catch:{ pbk -> 0x015c }
            r6 = 58
            if (r10 != r6) goto L_0x0247
            r13.d()     // Catch:{ pbk -> 0x015c }
            pbl r6 = r13.h()     // Catch:{ pbk -> 0x015c }
            android.util.Pair r6 = android.util.Pair.create(r15, r6)     // Catch:{ pbk -> 0x015c }
            r3.add(r6)     // Catch:{ pbk -> 0x015c }
            goto L_0x024f
        L_0x0247:
            android.util.Pair r6 = android.util.Pair.create(r15, r12)     // Catch:{ pbk -> 0x015c }
            r3.add(r6)     // Catch:{ pbk -> 0x015c }
        L_0x024f:
            r13.f()     // Catch:{ pbk -> 0x015c }
            boolean r6 = r13.a()     // Catch:{ pbk -> 0x015c }
            java.lang.String r10 = "Expected a , or )"
            if (r6 == 0) goto L_0x025d
            r13.a((java.lang.String) r10)     // Catch:{ pbk -> 0x015c }
        L_0x025d:
            char r6 = r13.e()     // Catch:{ pbk -> 0x015c }
            r15 = 44
            if (r6 != r15) goto L_0x0269
            r13.d()     // Catch:{ pbk -> 0x015c }
            goto L_0x0274
        L_0x0269:
            if (r6 == r5) goto L_0x0274
            r13.a((java.lang.String) r10)     // Catch:{ pbk -> 0x015c }
            r5 = 4
            r6 = 0
            r10 = 36
            goto L_0x01f1
        L_0x0274:
            r5 = 4
            r6 = 0
            r10 = 36
            goto L_0x01f1
        L_0x027a:
            boolean r5 = r13.a()     // Catch:{ pbk -> 0x015c }
            if (r5 == 0) goto L_0x0285
            java.lang.String r5 = "Expected a )"
            r13.a((java.lang.String) r5)     // Catch:{ pbk -> 0x015c }
        L_0x0285:
            r13.d()     // Catch:{ pbk -> 0x015c }
            goto L_0x028d
        L_0x0289:
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ pbk -> 0x067c }
        L_0x028d:
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ pbk -> 0x067c }
            r5.<init>()     // Catch:{ pbk -> 0x067c }
            java.util.Iterator r6 = r3.iterator()     // Catch:{ pbk -> 0x067c }
        L_0x0296:
            boolean r10 = r6.hasNext()     // Catch:{ pbk -> 0x067c }
            if (r10 == 0) goto L_0x02d2
            java.lang.Object r10 = r6.next()     // Catch:{ pbk -> 0x015c }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ pbk -> 0x015c }
            java.lang.Object r10 = r10.first     // Catch:{ pbk -> 0x015c }
            pbl r10 = (defpackage.pbl) r10     // Catch:{ pbk -> 0x015c }
            java.lang.Object r15 = r10.b     // Catch:{ pbk -> 0x015c }
            pbn r15 = (defpackage.pbn) r15     // Catch:{ pbk -> 0x015c }
            java.lang.String r15 = r15.a     // Catch:{ pbk -> 0x015c }
            boolean r15 = r5.contains(r15)     // Catch:{ pbk -> 0x015c }
            if (r15 == 0) goto L_0x02c7
            java.lang.Object r15 = r10.b     // Catch:{ pbk -> 0x015c }
            pbn r15 = (defpackage.pbn) r15     // Catch:{ pbk -> 0x015c }
            java.lang.String r15 = r15.a     // Catch:{ pbk -> 0x015c }
            java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ pbk -> 0x015c }
            java.lang.String r12 = " has already been specified"
            java.lang.String r12 = r15.concat(r12)     // Catch:{ pbk -> 0x015c }
            int r15 = r10.a     // Catch:{ pbk -> 0x015c }
            r13.a(r12, r15)     // Catch:{ pbk -> 0x015c }
        L_0x02c7:
            java.lang.Object r10 = r10.b     // Catch:{ pbk -> 0x015c }
            pbn r10 = (defpackage.pbn) r10     // Catch:{ pbk -> 0x015c }
            java.lang.String r10 = r10.a     // Catch:{ pbk -> 0x015c }
            r5.add(r10)     // Catch:{ pbk -> 0x015c }
            r12 = 0
            goto L_0x0296
        L_0x02d2:
            ouz r5 = defpackage.ouz.f     // Catch:{ pbk -> 0x067c }
            aucd r5 = r5.o()     // Catch:{ pbk -> 0x067c }
            java.lang.Object r6 = r4.b     // Catch:{ pbk -> 0x067c }
            pbn r6 = (defpackage.pbn) r6     // Catch:{ pbk -> 0x067c }
            java.lang.String r6 = r6.a     // Catch:{ pbk -> 0x067c }
            r10 = 0
            char r6 = r6.charAt(r10)     // Catch:{ pbk -> 0x067c }
            java.lang.String r10 = "Expected string literal"
            java.lang.String r12 = "default must specify a value"
            java.lang.String r15 = "default"
            r19 = r2
            java.lang.String r2 = "snippeted"
            r20 = r7
            java.lang.String r7 = "length"
            r21 = r11
            java.lang.String r11 = "Unknown key"
            r1 = 36
            if (r6 != r1) goto L_0x051c
            java.lang.String r1 = "$uri"
            java.lang.Object r6 = r4.b     // Catch:{ pbk -> 0x067c }
            pbn r6 = (defpackage.pbn) r6     // Catch:{ pbk -> 0x067c }
            java.lang.String r6 = r6.a     // Catch:{ pbk -> 0x067c }
            boolean r1 = r1.equals(r6)     // Catch:{ pbk -> 0x067c }
            if (r1 != 0) goto L_0x04e2
            java.lang.String r1 = "$bestmatch"
            java.lang.Object r6 = r4.b     // Catch:{ pbk -> 0x067c }
            pbn r6 = (defpackage.pbn) r6     // Catch:{ pbk -> 0x067c }
            java.lang.String r6 = r6.a     // Catch:{ pbk -> 0x067c }
            boolean r1 = r1.equals(r6)     // Catch:{ pbk -> 0x067c }
            if (r1 != 0) goto L_0x0324
            java.lang.String r1 = "Not a valid special section name"
            int r2 = r4.a     // Catch:{ pbk -> 0x015c }
            r13.a(r1, r2)     // Catch:{ pbk -> 0x015c }
            r24 = r9
            r2 = 0
            r4 = 2
            r17 = 4
            goto L_0x063f
        L_0x0324:
            ouw r1 = defpackage.ouw.f     // Catch:{ pbk -> 0x067c }
            aucd r1 = r1.o()     // Catch:{ pbk -> 0x067c }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ pbk -> 0x067c }
        L_0x032e:
            boolean r4 = r3.hasNext()     // Catch:{ pbk -> 0x067c }
            if (r4 == 0) goto L_0x04ba
            java.lang.Object r4 = r3.next()     // Catch:{ pbk -> 0x067c }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ pbk -> 0x067c }
            java.lang.Object r6 = r4.first     // Catch:{ pbk -> 0x067c }
            pbl r6 = (defpackage.pbl) r6     // Catch:{ pbk -> 0x067c }
            java.lang.Object r6 = r6.b     // Catch:{ pbk -> 0x067c }
            pbn r6 = (defpackage.pbn) r6     // Catch:{ pbk -> 0x067c }
            java.lang.String r6 = r6.a     // Catch:{ pbk -> 0x067c }
            boolean r22 = r7.equals(r6)     // Catch:{ pbk -> 0x067c }
            if (r22 != 0) goto L_0x0495
            boolean r22 = r2.equals(r6)     // Catch:{ pbk -> 0x067c }
            if (r22 == 0) goto L_0x0376
            java.lang.Object r4 = r4.second     // Catch:{ pbk -> 0x015c }
            pbl r4 = (defpackage.pbl) r4     // Catch:{ pbk -> 0x015c }
            boolean r4 = r13.b((defpackage.pbl) r4)     // Catch:{ pbk -> 0x015c }
            boolean r6 = r1.c     // Catch:{ pbk -> 0x015c }
            if (r6 != 0) goto L_0x035d
            goto L_0x0363
        L_0x035d:
            r1.c()     // Catch:{ pbk -> 0x015c }
            r6 = 0
            r1.c = r6     // Catch:{ pbk -> 0x015c }
        L_0x0363:
            aucj r6 = r1.b     // Catch:{ pbk -> 0x015c }
            ouw r6 = (defpackage.ouw) r6     // Catch:{ pbk -> 0x015c }
            r22 = r3
            int r3 = r6.a     // Catch:{ pbk -> 0x015c }
            r17 = 4
            r3 = r3 | 4
            r6.a = r3     // Catch:{ pbk -> 0x015c }
            r6.d = r4     // Catch:{ pbk -> 0x015c }
            r3 = r22
            goto L_0x032e
        L_0x0376:
            r22 = r3
            boolean r3 = r15.equals(r6)     // Catch:{ pbk -> 0x067c }
            if (r3 != 0) goto L_0x044b
            java.lang.String r3 = "except"
            boolean r3 = r3.equals(r6)     // Catch:{ pbk -> 0x067c }
            if (r3 != 0) goto L_0x0392
            java.lang.Object r3 = r4.first     // Catch:{ pbk -> 0x015c }
            pbl r3 = (defpackage.pbl) r3     // Catch:{ pbk -> 0x015c }
            int r3 = r3.a     // Catch:{ pbk -> 0x015c }
            r13.a(r11, r3)     // Catch:{ pbk -> 0x015c }
            r3 = r22
            goto L_0x032e
        L_0x0392:
            java.lang.Object r3 = r4.second     // Catch:{ pbk -> 0x067c }
            if (r3 != 0) goto L_0x03a1
            java.lang.String r3 = "except must specify a value"
            java.lang.Object r6 = r4.first     // Catch:{ pbk -> 0x015c }
            pbl r6 = (defpackage.pbl) r6     // Catch:{ pbk -> 0x015c }
            int r6 = r6.a     // Catch:{ pbk -> 0x015c }
            r13.a(r3, r6)     // Catch:{ pbk -> 0x015c }
        L_0x03a1:
            java.lang.Object r3 = r4.second     // Catch:{ pbk -> 0x067c }
            pbl r3 = (defpackage.pbl) r3     // Catch:{ pbk -> 0x067c }
            java.lang.Object r3 = r3.b     // Catch:{ pbk -> 0x067c }
            boolean r3 = r3 instanceof defpackage.pbn     // Catch:{ pbk -> 0x067c }
            if (r3 != 0) goto L_0x0421
            java.lang.Object r3 = r4.second     // Catch:{ pbk -> 0x067c }
            pbl r3 = (defpackage.pbl) r3     // Catch:{ pbk -> 0x067c }
            java.lang.Object r3 = r3.b     // Catch:{ pbk -> 0x067c }
            boolean r3 = r3 instanceof java.util.List     // Catch:{ pbk -> 0x067c }
            if (r3 == 0) goto L_0x040e
            java.lang.Object r3 = r4.second     // Catch:{ pbk -> 0x067c }
            pbl r3 = (defpackage.pbl) r3     // Catch:{ pbk -> 0x067c }
            java.lang.Object r3 = r3.b     // Catch:{ pbk -> 0x067c }
            java.util.List r3 = (java.util.List) r3     // Catch:{ pbk -> 0x067c }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ pbk -> 0x067c }
            r4 = 0
        L_0x03c2:
            boolean r6 = r3.hasNext()     // Catch:{ pbk -> 0x067c }
            if (r6 == 0) goto L_0x03ef
            java.lang.Object r6 = r3.next()     // Catch:{ pbk -> 0x067c }
            pbl r6 = (defpackage.pbl) r6     // Catch:{ pbk -> 0x067c }
            r23 = r3
            java.lang.Object r3 = r6.b     // Catch:{ pbk -> 0x067c }
            boolean r3 = r3 instanceof defpackage.pbn     // Catch:{ pbk -> 0x067c }
            if (r3 != 0) goto L_0x03e0
            java.lang.String r3 = "Expected section name"
            r24 = r9
            int r9 = r6.a     // Catch:{ pbk -> 0x0677 }
            r13.a(r3, r9)     // Catch:{ pbk -> 0x0677 }
            goto L_0x03e2
        L_0x03e0:
            r24 = r9
        L_0x03e2:
            int r3 = r13.a((defpackage.pbl) r6)     // Catch:{ pbk -> 0x0677 }
            r6 = 1
            int r3 = r6 << r3
            r4 = r4 | r3
            r3 = r23
            r9 = r24
            goto L_0x03c2
        L_0x03ef:
            r24 = r9
            boolean r3 = r1.c     // Catch:{ pbk -> 0x0677 }
            if (r3 != 0) goto L_0x03f6
            goto L_0x03fc
        L_0x03f6:
            r1.c()     // Catch:{ pbk -> 0x0677 }
            r3 = 0
            r1.c = r3     // Catch:{ pbk -> 0x0677 }
        L_0x03fc:
            aucj r3 = r1.b     // Catch:{ pbk -> 0x0677 }
            ouw r3 = (defpackage.ouw) r3     // Catch:{ pbk -> 0x0677 }
            int r6 = r3.a     // Catch:{ pbk -> 0x0677 }
            r6 = r6 | 8
            r3.a = r6     // Catch:{ pbk -> 0x0677 }
            r3.e = r4     // Catch:{ pbk -> 0x0677 }
            r3 = r22
            r9 = r24
            goto L_0x032e
        L_0x040e:
            r24 = r9
            java.lang.String r3 = "Expected name or list of values"
            java.lang.Object r4 = r4.second     // Catch:{ pbk -> 0x0677 }
            pbl r4 = (defpackage.pbl) r4     // Catch:{ pbk -> 0x0677 }
            int r4 = r4.a     // Catch:{ pbk -> 0x0677 }
            r13.a(r3, r4)     // Catch:{ pbk -> 0x0677 }
            r3 = r22
            r9 = r24
            goto L_0x032e
        L_0x0421:
            r24 = r9
            java.lang.Object r3 = r4.second     // Catch:{ pbk -> 0x0677 }
            pbl r3 = (defpackage.pbl) r3     // Catch:{ pbk -> 0x0677 }
            int r3 = r13.a((defpackage.pbl) r3)     // Catch:{ pbk -> 0x0677 }
            r4 = 1
            int r3 = r4 << r3
            boolean r4 = r1.c     // Catch:{ pbk -> 0x0677 }
            if (r4 != 0) goto L_0x0433
            goto L_0x0439
        L_0x0433:
            r1.c()     // Catch:{ pbk -> 0x0677 }
            r4 = 0
            r1.c = r4     // Catch:{ pbk -> 0x0677 }
        L_0x0439:
            aucj r4 = r1.b     // Catch:{ pbk -> 0x0677 }
            ouw r4 = (defpackage.ouw) r4     // Catch:{ pbk -> 0x0677 }
            int r6 = r4.a     // Catch:{ pbk -> 0x0677 }
            r6 = r6 | 8
            r4.a = r6     // Catch:{ pbk -> 0x0677 }
            r4.e = r3     // Catch:{ pbk -> 0x0677 }
            r3 = r22
            r9 = r24
            goto L_0x032e
        L_0x044b:
            r24 = r9
            java.lang.Object r3 = r4.second     // Catch:{ pbk -> 0x0677 }
            if (r3 != 0) goto L_0x045a
            java.lang.Object r3 = r4.first     // Catch:{ pbk -> 0x0677 }
            pbl r3 = (defpackage.pbl) r3     // Catch:{ pbk -> 0x0677 }
            int r3 = r3.a     // Catch:{ pbk -> 0x0677 }
            r13.a(r12, r3)     // Catch:{ pbk -> 0x0677 }
        L_0x045a:
            java.lang.Object r3 = r4.second     // Catch:{ pbk -> 0x0677 }
            pbl r3 = (defpackage.pbl) r3     // Catch:{ pbk -> 0x0677 }
            java.lang.Object r3 = r3.b     // Catch:{ pbk -> 0x0677 }
            boolean r3 = r3 instanceof java.lang.String     // Catch:{ pbk -> 0x0677 }
            if (r3 != 0) goto L_0x046d
            java.lang.Object r3 = r4.second     // Catch:{ pbk -> 0x0677 }
            pbl r3 = (defpackage.pbl) r3     // Catch:{ pbk -> 0x0677 }
            int r3 = r3.a     // Catch:{ pbk -> 0x0677 }
            r13.a(r10, r3)     // Catch:{ pbk -> 0x0677 }
        L_0x046d:
            java.lang.Object r3 = r4.second     // Catch:{ pbk -> 0x0677 }
            pbl r3 = (defpackage.pbl) r3     // Catch:{ pbk -> 0x0677 }
            java.lang.Object r3 = r3.b     // Catch:{ pbk -> 0x0677 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ pbk -> 0x0677 }
            boolean r4 = r1.c     // Catch:{ pbk -> 0x0677 }
            if (r4 != 0) goto L_0x047a
            goto L_0x0480
        L_0x047a:
            r1.c()     // Catch:{ pbk -> 0x0677 }
            r4 = 0
            r1.c = r4     // Catch:{ pbk -> 0x0677 }
        L_0x0480:
            aucj r4 = r1.b     // Catch:{ pbk -> 0x0677 }
            ouw r4 = (defpackage.ouw) r4     // Catch:{ pbk -> 0x0677 }
            r3.getClass()     // Catch:{ pbk -> 0x0677 }
            int r6 = r4.a     // Catch:{ pbk -> 0x0677 }
            r9 = 1
            r6 = r6 | r9
            r4.a = r6     // Catch:{ pbk -> 0x0677 }
            r4.b = r3     // Catch:{ pbk -> 0x0677 }
            r3 = r22
            r9 = r24
            goto L_0x032e
        L_0x0495:
            r22 = r3
            r24 = r9
            int r3 = r13.a((android.util.Pair) r4)     // Catch:{ pbk -> 0x0677 }
            boolean r4 = r1.c     // Catch:{ pbk -> 0x0677 }
            if (r4 != 0) goto L_0x04a2
            goto L_0x04a8
        L_0x04a2:
            r1.c()     // Catch:{ pbk -> 0x0677 }
            r4 = 0
            r1.c = r4     // Catch:{ pbk -> 0x0677 }
        L_0x04a8:
            aucj r4 = r1.b     // Catch:{ pbk -> 0x0677 }
            ouw r4 = (defpackage.ouw) r4     // Catch:{ pbk -> 0x0677 }
            int r6 = r4.a     // Catch:{ pbk -> 0x0677 }
            r9 = 2
            r6 = r6 | r9
            r4.a = r6     // Catch:{ pbk -> 0x0677 }
            r4.c = r3     // Catch:{ pbk -> 0x0677 }
            r3 = r22
            r9 = r24
            goto L_0x032e
        L_0x04ba:
            r24 = r9
            aucj r1 = r1.i()     // Catch:{ pbk -> 0x0677 }
            ouw r1 = (defpackage.ouw) r1     // Catch:{ pbk -> 0x0677 }
            boolean r2 = r5.c     // Catch:{ pbk -> 0x0677 }
            if (r2 != 0) goto L_0x04c7
            goto L_0x04cd
        L_0x04c7:
            r5.c()     // Catch:{ pbk -> 0x0677 }
            r2 = 0
            r5.c = r2     // Catch:{ pbk -> 0x0677 }
        L_0x04cd:
            aucj r2 = r5.b     // Catch:{ pbk -> 0x0677 }
            ouz r2 = (defpackage.ouz) r2     // Catch:{ pbk -> 0x0677 }
            r1.getClass()     // Catch:{ pbk -> 0x0677 }
            r2.d = r1     // Catch:{ pbk -> 0x0677 }
            int r1 = r2.a     // Catch:{ pbk -> 0x0677 }
            r3 = 4
            r1 = r1 | r3
            r2.a = r1     // Catch:{ pbk -> 0x0677 }
            r2 = 0
            r4 = 2
            r17 = 4
            goto L_0x063f
        L_0x04e2:
            r24 = r9
            boolean r1 = r3.isEmpty()     // Catch:{ pbk -> 0x0677 }
            if (r1 != 0) goto L_0x04fa
            r1 = 0
            java.lang.Object r2 = r3.get(r1)     // Catch:{ pbk -> 0x0677 }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ pbk -> 0x0677 }
            java.lang.Object r1 = r2.first     // Catch:{ pbk -> 0x0677 }
            pbl r1 = (defpackage.pbl) r1     // Catch:{ pbk -> 0x0677 }
            int r1 = r1.a     // Catch:{ pbk -> 0x0677 }
            r13.a(r11, r1)     // Catch:{ pbk -> 0x0677 }
        L_0x04fa:
            ouy r1 = defpackage.ouy.a     // Catch:{ pbk -> 0x0677 }
            boolean r2 = r5.c     // Catch:{ pbk -> 0x0677 }
            if (r2 != 0) goto L_0x0501
            goto L_0x0507
        L_0x0501:
            r5.c()     // Catch:{ pbk -> 0x0677 }
            r2 = 0
            r5.c = r2     // Catch:{ pbk -> 0x0677 }
        L_0x0507:
            aucj r2 = r5.b     // Catch:{ pbk -> 0x0677 }
            ouz r2 = (defpackage.ouz) r2     // Catch:{ pbk -> 0x0677 }
            r1.getClass()     // Catch:{ pbk -> 0x0677 }
            r2.e = r1     // Catch:{ pbk -> 0x0677 }
            int r1 = r2.a     // Catch:{ pbk -> 0x0677 }
            r1 = r1 | 8
            r2.a = r1     // Catch:{ pbk -> 0x0677 }
            r2 = 0
            r4 = 2
            r17 = 4
            goto L_0x063f
        L_0x051c:
            r24 = r9
            int r1 = r13.a((defpackage.pbl) r4)     // Catch:{ pbk -> 0x0677 }
            oux r4 = defpackage.oux.f     // Catch:{ pbk -> 0x0677 }
            aucd r4 = r4.o()     // Catch:{ pbk -> 0x0677 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ pbk -> 0x0677 }
        L_0x052c:
            boolean r6 = r3.hasNext()     // Catch:{ pbk -> 0x0677 }
            if (r6 == 0) goto L_0x05f5
            java.lang.Object r6 = r3.next()     // Catch:{ pbk -> 0x0677 }
            android.util.Pair r6 = (android.util.Pair) r6     // Catch:{ pbk -> 0x0677 }
            java.lang.Object r9 = r6.first     // Catch:{ pbk -> 0x0677 }
            pbl r9 = (defpackage.pbl) r9     // Catch:{ pbk -> 0x0677 }
            java.lang.Object r9 = r9.b     // Catch:{ pbk -> 0x0677 }
            pbn r9 = (defpackage.pbn) r9     // Catch:{ pbk -> 0x0677 }
            java.lang.String r9 = r9.a     // Catch:{ pbk -> 0x0677 }
            boolean r22 = r7.equals(r9)     // Catch:{ pbk -> 0x0677 }
            if (r22 != 0) goto L_0x05d0
            boolean r22 = r2.equals(r9)     // Catch:{ pbk -> 0x0677 }
            if (r22 == 0) goto L_0x0574
            java.lang.Object r6 = r6.second     // Catch:{ pbk -> 0x0677 }
            pbl r6 = (defpackage.pbl) r6     // Catch:{ pbk -> 0x0677 }
            boolean r6 = r13.b((defpackage.pbl) r6)     // Catch:{ pbk -> 0x0677 }
            boolean r9 = r4.c     // Catch:{ pbk -> 0x0677 }
            if (r9 != 0) goto L_0x055b
            goto L_0x0561
        L_0x055b:
            r4.c()     // Catch:{ pbk -> 0x0677 }
            r9 = 0
            r4.c = r9     // Catch:{ pbk -> 0x0677 }
        L_0x0561:
            aucj r9 = r4.b     // Catch:{ pbk -> 0x0677 }
            oux r9 = (defpackage.oux) r9     // Catch:{ pbk -> 0x0677 }
            r22 = r2
            int r2 = r9.a     // Catch:{ pbk -> 0x0677 }
            r17 = 4
            r2 = r2 | 4
            r9.a = r2     // Catch:{ pbk -> 0x0677 }
            r9.d = r6     // Catch:{ pbk -> 0x0677 }
            r2 = r22
            goto L_0x052c
        L_0x0574:
            r22 = r2
            r17 = 4
            boolean r2 = r15.equals(r9)     // Catch:{ pbk -> 0x0677 }
            if (r2 != 0) goto L_0x058a
            java.lang.Object r2 = r6.first     // Catch:{ pbk -> 0x0677 }
            pbl r2 = (defpackage.pbl) r2     // Catch:{ pbk -> 0x0677 }
            int r2 = r2.a     // Catch:{ pbk -> 0x0677 }
            r13.a(r11, r2)     // Catch:{ pbk -> 0x0677 }
            r2 = r22
            goto L_0x052c
        L_0x058a:
            java.lang.Object r2 = r6.second     // Catch:{ pbk -> 0x0677 }
            if (r2 != 0) goto L_0x0597
            java.lang.Object r2 = r6.first     // Catch:{ pbk -> 0x0677 }
            pbl r2 = (defpackage.pbl) r2     // Catch:{ pbk -> 0x0677 }
            int r2 = r2.a     // Catch:{ pbk -> 0x0677 }
            r13.a(r12, r2)     // Catch:{ pbk -> 0x0677 }
        L_0x0597:
            java.lang.Object r2 = r6.second     // Catch:{ pbk -> 0x0677 }
            pbl r2 = (defpackage.pbl) r2     // Catch:{ pbk -> 0x0677 }
            java.lang.Object r2 = r2.b     // Catch:{ pbk -> 0x0677 }
            boolean r2 = r2 instanceof java.lang.String     // Catch:{ pbk -> 0x0677 }
            if (r2 != 0) goto L_0x05aa
            java.lang.Object r2 = r6.second     // Catch:{ pbk -> 0x0677 }
            pbl r2 = (defpackage.pbl) r2     // Catch:{ pbk -> 0x0677 }
            int r2 = r2.a     // Catch:{ pbk -> 0x0677 }
            r13.a(r10, r2)     // Catch:{ pbk -> 0x0677 }
        L_0x05aa:
            java.lang.Object r2 = r6.second     // Catch:{ pbk -> 0x0677 }
            pbl r2 = (defpackage.pbl) r2     // Catch:{ pbk -> 0x0677 }
            java.lang.Object r2 = r2.b     // Catch:{ pbk -> 0x0677 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ pbk -> 0x0677 }
            boolean r6 = r4.c     // Catch:{ pbk -> 0x0677 }
            if (r6 != 0) goto L_0x05b7
            goto L_0x05bd
        L_0x05b7:
            r4.c()     // Catch:{ pbk -> 0x0677 }
            r6 = 0
            r4.c = r6     // Catch:{ pbk -> 0x0677 }
        L_0x05bd:
            aucj r6 = r4.b     // Catch:{ pbk -> 0x0677 }
            oux r6 = (defpackage.oux) r6     // Catch:{ pbk -> 0x0677 }
            r2.getClass()     // Catch:{ pbk -> 0x0677 }
            int r9 = r6.a     // Catch:{ pbk -> 0x0677 }
            r9 = r9 | 8
            r6.a = r9     // Catch:{ pbk -> 0x0677 }
            r6.e = r2     // Catch:{ pbk -> 0x0677 }
            r2 = r22
            goto L_0x052c
        L_0x05d0:
            r22 = r2
            r17 = 4
            int r2 = r13.a((android.util.Pair) r6)     // Catch:{ pbk -> 0x0677 }
            boolean r6 = r4.c     // Catch:{ pbk -> 0x0677 }
            if (r6 != 0) goto L_0x05dd
            goto L_0x05e3
        L_0x05dd:
            r4.c()     // Catch:{ pbk -> 0x0677 }
            r6 = 0
            r4.c = r6     // Catch:{ pbk -> 0x0677 }
        L_0x05e3:
            aucj r6 = r4.b     // Catch:{ pbk -> 0x0677 }
            oux r6 = (defpackage.oux) r6     // Catch:{ pbk -> 0x0677 }
            int r9 = r6.a     // Catch:{ pbk -> 0x0677 }
            r16 = 2
            r9 = r9 | 2
            r6.a = r9     // Catch:{ pbk -> 0x0677 }
            r6.c = r2     // Catch:{ pbk -> 0x0677 }
            r2 = r22
            goto L_0x052c
        L_0x05f5:
            r17 = 4
            aucj r2 = r4.i()     // Catch:{ pbk -> 0x0677 }
            oux r2 = (defpackage.oux) r2     // Catch:{ pbk -> 0x0677 }
            r3 = 5
            java.lang.Object r3 = r2.c(r3)     // Catch:{ pbk -> 0x0677 }
            aucd r3 = (defpackage.aucd) r3     // Catch:{ pbk -> 0x0677 }
            r3.a((defpackage.aucj) r2)     // Catch:{ pbk -> 0x0677 }
            boolean r2 = r3.c     // Catch:{ pbk -> 0x0677 }
            if (r2 != 0) goto L_0x060c
            goto L_0x0612
        L_0x060c:
            r3.c()     // Catch:{ pbk -> 0x0677 }
            r2 = 0
            r3.c = r2     // Catch:{ pbk -> 0x0677 }
        L_0x0612:
            aucj r2 = r3.b     // Catch:{ pbk -> 0x0677 }
            oux r2 = (defpackage.oux) r2     // Catch:{ pbk -> 0x0677 }
            int r4 = r2.a     // Catch:{ pbk -> 0x0677 }
            r6 = 1
            r4 = r4 | r6
            r2.a = r4     // Catch:{ pbk -> 0x0677 }
            r2.b = r1     // Catch:{ pbk -> 0x0677 }
            aucj r1 = r3.i()     // Catch:{ pbk -> 0x0677 }
            oux r1 = (defpackage.oux) r1     // Catch:{ pbk -> 0x0677 }
            boolean r2 = r5.c     // Catch:{ pbk -> 0x0677 }
            if (r2 != 0) goto L_0x062a
            r2 = 0
            goto L_0x0630
        L_0x062a:
            r5.c()     // Catch:{ pbk -> 0x0677 }
            r2 = 0
            r5.c = r2     // Catch:{ pbk -> 0x0677 }
        L_0x0630:
            aucj r3 = r5.b     // Catch:{ pbk -> 0x0677 }
            ouz r3 = (defpackage.ouz) r3     // Catch:{ pbk -> 0x0677 }
            r1.getClass()     // Catch:{ pbk -> 0x0677 }
            r3.c = r1     // Catch:{ pbk -> 0x0677 }
            int r1 = r3.a     // Catch:{ pbk -> 0x0677 }
            r4 = 2
            r1 = r1 | r4
            r3.a = r1     // Catch:{ pbk -> 0x0677 }
        L_0x063f:
            aucj r1 = r5.i()     // Catch:{ pbk -> 0x0677 }
            ouz r1 = (defpackage.ouz) r1     // Catch:{ pbk -> 0x0677 }
        L_0x0645:
            r14.add(r1)     // Catch:{ pbk -> 0x0677 }
            r2 = r19
            r7 = r20
            r11 = r21
            r9 = r24
            r3 = 1
            r5 = 4
            r6 = 0
            r10 = 36
            r12 = 0
            r1 = r25
            goto L_0x013d
        L_0x065a:
            r19 = r2
            r20 = r7
            r24 = r9
            r2 = 0
            r17 = 4
            r12 = 0
        L_0x0664:
            if (r12 != 0) goto L_0x0667
            goto L_0x066a
        L_0x0667:
            r8.add(r12)     // Catch:{ pbk -> 0x0677 }
        L_0x066a:
            int r9 = r24 + 1
            r2 = r19
            r7 = r20
            r3 = 1
            r5 = 4
            r6 = 0
            r1 = r25
            goto L_0x0121
        L_0x0677:
            r0 = move-exception
            goto L_0x067f
        L_0x0679:
            r0 = move-exception
            r1 = r0
            goto L_0x06bb
        L_0x067c:
            r0 = move-exception
            r24 = r9
        L_0x067f:
            r1 = r0
        L_0x0680:
            pau r2 = new pau     // Catch:{ all -> 0x0679 }
            java.lang.String r3 = defpackage.dtb.a((int) r24)     // Catch:{ all -> 0x0679 }
            java.lang.String r1 = r1.a()     // Catch:{ all -> 0x0679 }
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0679 }
            int r4 = r4.length()     // Catch:{ all -> 0x0679 }
            java.lang.String r5 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0679 }
            int r5 = r5.length()     // Catch:{ all -> 0x0679 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0679 }
            r7 = 36
            int r4 = r4 + r7
            int r4 = r4 + r5
            r6.<init>(r4)     // Catch:{ all -> 0x0679 }
            java.lang.String r4 = "In global search section spec for "
            r6.append(r4)     // Catch:{ all -> 0x0679 }
            r6.append(r3)     // Catch:{ all -> 0x0679 }
            java.lang.String r3 = ":\n"
            r6.append(r3)     // Catch:{ all -> 0x0679 }
            r6.append(r1)     // Catch:{ all -> 0x0679 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0679 }
            r2.<init>(r1)     // Catch:{ all -> 0x0679 }
            throw r2     // Catch:{ all -> 0x0679 }
        L_0x06bb:
            r3 = 1
            r2 = r25
            r2.f = r3
            throw r1
        L_0x06c1:
            r2 = r1
            r2.f = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pbj.a():void");
    }
}
