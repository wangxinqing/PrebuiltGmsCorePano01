package defpackage;

import android.util.Log;

/* renamed from: bnz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bnz extends bnt {
    public bnz(String str) {
        super(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: aucd} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02e2, code lost:
        r8 = new defpackage.bns(r1, r9, r4);
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02ee, code lost:
        if (r9 >= r1.l.size()) goto L_0x0452;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02f0, code lost:
        r11 = r1.l.keyAt(r9);
        r12 = defpackage.bnt.a((java.util.List) r1.l.get(r11), r5, r4);
        r13 = new java.util.ArrayList();
        r12 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x030f, code lost:
        if (r12.hasNext() == false) goto L_0x03eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0311, code lost:
        r14 = (defpackage.brm) r12.next();
        r15 = (defpackage.bom) r4.get(r14);
        defpackage.amtf.a((java.lang.Object) r15);
        r15 = super.a(r15);
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x032b, code lost:
        if (r6 >= r13.size()) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x032d, code lost:
        r10 = (defpackage.bnp) r13.get(r6);
        r17 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0337, code lost:
        if (r10.b != r15) goto L_0x0346;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0339, code lost:
        r4 = r10.c(5);
        r4.a((defpackage.aucj) r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0346, code lost:
        r6 = r6 + 1;
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x034b, code lost:
        r17 = r4;
        r4 = null;
        r6 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x034f, code lost:
        if (r4 != null) goto L_0x0381;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0351, code lost:
        r4 = defpackage.bnp.d.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0359, code lost:
        if (r4.c != false) goto L_0x035c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x035c, code lost:
        r4.c();
        r4.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0362, code lost:
        r6 = (defpackage.bnp) r4.b;
        r6.a |= 1;
        r6.b = r15;
        r13.add((defpackage.bnp) r4.i());
        r6 = r13.size() - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0381, code lost:
        r10 = (java.lang.Integer) r1.i.get(r14.b);
        defpackage.amtf.a((java.lang.Object) r10);
        r10 = r10.intValue();
        r14 = ((defpackage.bnp) r4.b).c.size();
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x039d, code lost:
        if (r15 >= r14) goto L_0x03b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x039f, code lost:
        r16 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03ab, code lost:
        if (((defpackage.bnp) r4.b).c.c(r15) != r10) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03ae, code lost:
        r15 = r15 + 1;
        r5 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03b3, code lost:
        r16 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03b7, code lost:
        if (r4.c != false) goto L_0x03ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03ba, code lost:
        r4.c();
        r4.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03c0, code lost:
        r5 = (defpackage.bnp) r4.b;
        r14 = defpackage.bnp.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03cc, code lost:
        if (r5.c.a() != false) goto L_0x03d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03ce, code lost:
        r5.c = defpackage.aucj.a(r5.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03d6, code lost:
        r5.c.d(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03db, code lost:
        r13.set(r6, (defpackage.bnp) r4.i());
        r5 = r16;
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03eb, code lost:
        r17 = r4;
        r16 = r5;
        java.util.Collections.sort(r13, r8);
        r4 = r1.g;
        r5 = (defpackage.bnm) r4.get(r11);
        r10 = (defpackage.aucd) r5.c(5);
        r10.a((defpackage.aucj) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0406, code lost:
        if (r10.c != false) goto L_0x0409;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0409, code lost:
        r10.c();
        r10.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x040f, code lost:
        r6 = defpackage.bnm.r;
        ((defpackage.bnm) r10.b).j = defpackage.aucj.s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x041d, code lost:
        if (r10.c != false) goto L_0x0420;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0420, code lost:
        r10.c();
        r10.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0426, code lost:
        r5 = (defpackage.bnm) r10.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0430, code lost:
        if (r5.j.a() == false) goto L_0x0433;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0433, code lost:
        r5.j = defpackage.aucj.a(r5.j);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x043b, code lost:
        defpackage.auab.a((java.lang.Iterable) r13, (java.util.List) r5.j);
        r4.set(r11, (defpackage.bnm) r10.i());
        r9 = r9 + 1;
        r5 = r16;
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0452, code lost:
        r4 = new java.util.ArrayList();
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x045e, code lost:
        if (r8 >= r1.e.size()) goto L_0x04a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0466, code lost:
        if (r1.f.get(r8) != false) goto L_0x049d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0468, code lost:
        r5 = (defpackage.bnm) r1.e.get(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0476, code lost:
        if (r1.l.indexOfKey(r8) < 0) goto L_0x049d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0478, code lost:
        r5 = (defpackage.brh) r1.j.get(r5);
        defpackage.amtf.a((java.lang.Object) r5);
        r5 = r5.a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x048d, code lost:
        if (r5.hasNext() == false) goto L_0x049d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x048f, code lost:
        r4.add(defpackage.blj.a((defpackage.brl) r5.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x049d, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x04a0, code lost:
        if (r7 != false) goto L_0x04ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x04a2, code lost:
        r0 = defpackage.blj.a(r0, defpackage.blj.a((java.util.List) r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04af, code lost:
        if (r4.isEmpty() != false) goto L_0x04b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04b1, code lost:
        r4.add(r0);
        r0 = defpackage.blj.a((java.util.List) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04b9, code lost:
        r1.b = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
        r1.m = true;
        r0 = defpackage.bpw.a(r1.g, r2.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
        defpackage.bom.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04c9, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04ca, code lost:
        r17 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:?, code lost:
        r6 = (java.util.Map.Entry) r5.next();
        r9 = (defpackage.brm) r6.getKey();
        r10 = r1.h;
        r11 = (defpackage.aucd) r9.c(5);
        r11.a((defpackage.aucj) r9);
        r6 = ((defpackage.bom) r6.getValue()).f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04ef, code lost:
        if (r11.c != false) goto L_0x04f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04f3, code lost:
        r11.c();
        r11.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04f9, code lost:
        r13 = (defpackage.brm) r11.b;
        r14 = defpackage.brm.f;
        r13.a |= 4;
        r13.e = r6;
        r10.add((defpackage.brm) r11.i());
        r1.i.put(r9.b, java.lang.Integer.valueOf(r8));
        r8 = r8 + 1;
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0522, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0532, code lost:
        if (super.b((defpackage.bom) r5.next()) != false) goto L_0x0537;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0534, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0542, code lost:
        throw new com.google.android.chimera.config.InvalidConfigException("No built-in module");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x054c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0554, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x055a, code lost:
        r27.clear();
        r2 = r1.d.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x056b, code lost:
        if (r2.hasNext() != false) goto L_0x056d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x056d, code lost:
        r5 = (java.util.Map.Entry) r2.next();
        r6 = (defpackage.bnm) r5.getKey();
        r8 = r6.c;
        r18 = defpackage.bnj.a(r6.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0581, code lost:
        if (r18 != 0) goto L_0x0583;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0583, code lost:
        r9 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0586, code lost:
        r9 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0587, code lost:
        r10 = r6.m;
        r18 = defpackage.bpc.a(r6.i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x058f, code lost:
        if (r18 != 0) goto L_0x0591;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0591, code lost:
        r11 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0594, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0595, code lost:
        r12 = r6.l;
        r13 = r6.n;
        r7 = r6.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x059d, code lost:
        if ((r7 & com.google.android.chimera.FragmentTransaction.TRANSIT_ENTER_MASK) != 0) goto L_0x059f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x059f, code lost:
        r14 = r6.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x05a2, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05a5, code lost:
        if ((r7 & com.google.android.chimera.FragmentTransaction.TRANSIT_EXIT_MASK) != 0) goto L_0x05a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05a7, code lost:
        r15 = r6.p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05ab, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x05ac, code lost:
        r7 = defpackage.bms.a(r20, r8, r9, r10, r11, r12, r13, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x05b2, code lost:
        if (r7 == null) goto L_0x05b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05b4, code lost:
        r5 = java.lang.String.valueOf(r6.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x05c0, code lost:
        if (r5.length() == 0) goto L_0x05c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x05c2, code lost:
        r5 = new java.lang.String("failed to create ModuleApk from descriptor: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x05c8, code lost:
        r5 = "failed to create ModuleApk from descriptor: ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x05cc, code lost:
        a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x05d0, code lost:
        r3.put(r7, (defpackage.bke) r5.getValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0219, code lost:
        if (r12 != false) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x021c, code lost:
        if (r13 == false) goto L_0x053a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x021e, code lost:
        r5 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0226, code lost:
        if (r5.hasNext() != false) goto L_0x0522;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0228, code lost:
        java.util.Collections.sort(r1.c, defpackage.bnt.n);
        r5 = defpackage.anax.a((java.util.Collection) r4.keySet());
        r8 = r9.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x023f, code lost:
        if (r8.hasNext() == false) goto L_0x028f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0241, code lost:
        r9 = (defpackage.bom) r8.next();
        r10 = defpackage.qug.a();
        r11 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0253, code lost:
        if (r11.hasNext() == false) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0255, code lost:
        r12 = (defpackage.brm) r11.next();
        r10.put(r12.b, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0261, code lost:
        r11 = r9.e.g.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x026d, code lost:
        if (r11.hasNext() == false) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x026f, code lost:
        r12 = (defpackage.brp) r11.next();
        r13 = (defpackage.brm) r10.get(r12.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x027d, code lost:
        if (r13 == null) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x027f, code lost:
        r13 = r13.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0283, code lost:
        if (r13 < r12.c) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0287, code lost:
        if (r13 > r12.d) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0289, code lost:
        r9.g.add(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x028f, code lost:
        r5 = r4.entrySet().iterator();
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x029c, code lost:
        if (r5.hasNext() != false) goto L_0x04ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x029e, code lost:
        r5 = new java.util.ArrayList(r4.keySet());
        r8 = new java.util.BitSet();
        r9 = new android.util.SparseArray();
        r11 = r4.values().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02bd, code lost:
        if (r11.hasNext() == false) goto L_0x02e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02bf, code lost:
        r12 = super.a((defpackage.bom) r11.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02cd, code lost:
        if (r8.get(r12) != false) goto L_0x02b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02cf, code lost:
        r8.set(r12);
        r9.append(r12, defpackage.bnt.a((java.util.List) r1.l.get(r12), r5, r4));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x055a  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x00ba A[EDGE_INSN: B:242:0x00ba->B:237:0x00ba ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0217 A[Catch:{ all -> 0x054e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.bpw a(android.content.Context r20, java.util.List r21, java.util.List r22, java.util.List r23, defpackage.bpw r24, defpackage.bpw r25, defpackage.bpw r26, java.util.Map r27) {
        /*
            r19 = this;
            r1 = r19
            r0 = r24
            r2 = r25
            r3 = r27
            java.util.Map r4 = defpackage.qug.a()
            java.util.Iterator r5 = r21.iterator()
        L_0x0010:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0034
            java.lang.Object r6 = r5.next()
            bms r6 = (defpackage.bms) r6
            bnm r7 = r6.e()
            int r7 = r2.a((java.lang.Object) r7)
            java.lang.Object r7 = r2.get(r7)
            bnm r7 = (defpackage.bnm) r7
            brh r6 = r6.k()
            if (r6 == 0) goto L_0x0010
            r4.put(r7, r6)
            goto L_0x0010
        L_0x0034:
            java.util.Iterator r5 = r22.iterator()
        L_0x0038:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x005c
            java.lang.Object r6 = r5.next()
            bms r6 = (defpackage.bms) r6
            bnm r7 = r6.e()
            int r7 = r2.a((java.lang.Object) r7)
            java.lang.Object r7 = r2.get(r7)
            bnm r7 = (defpackage.bnm) r7
            brh r6 = r6.k()
            if (r6 == 0) goto L_0x0038
            r4.put(r7, r6)
            goto L_0x0038
        L_0x005c:
            java.util.Iterator r5 = r23.iterator()
        L_0x0060:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0084
            java.lang.Object r6 = r5.next()
            bms r6 = (defpackage.bms) r6
            bnm r7 = r6.e()
            int r7 = r2.a((java.lang.Object) r7)
            java.lang.Object r7 = r2.get(r7)
            bnm r7 = (defpackage.bnm) r7
            brh r6 = r6.k()
            if (r6 == 0) goto L_0x0060
            r4.put(r7, r6)
            goto L_0x0060
        L_0x0084:
            defpackage.bkn.b()
            r6 = 1
            boolean r7 = defpackage.hei.e()     // Catch:{ InvalidConfigException -> 0x0556 }
            java.util.BitSet r8 = new java.util.BitSet     // Catch:{ InvalidConfigException -> 0x0556 }
            int r9 = r25.size()     // Catch:{ InvalidConfigException -> 0x0556 }
            r8.<init>(r9)     // Catch:{ InvalidConfigException -> 0x0556 }
            r1.f = r8     // Catch:{ InvalidConfigException -> 0x0556 }
            r1.e = r2     // Catch:{ InvalidConfigException -> 0x0556 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ InvalidConfigException -> 0x0556 }
            r8.<init>(r2)     // Catch:{ InvalidConfigException -> 0x0556 }
            r1.g = r8     // Catch:{ InvalidConfigException -> 0x0556 }
            java.util.Map r8 = r1.j     // Catch:{ InvalidConfigException -> 0x0556 }
            r8.clear()     // Catch:{ InvalidConfigException -> 0x0556 }
            java.util.Map r8 = r1.j     // Catch:{ InvalidConfigException -> 0x0556 }
            r8.putAll(r4)     // Catch:{ InvalidConfigException -> 0x0556 }
            r4 = r26
            r1.k = r4     // Catch:{ InvalidConfigException -> 0x0556 }
            java.util.Map r4 = r1.d     // Catch:{ InvalidConfigException -> 0x0556 }
            r4.clear()     // Catch:{ InvalidConfigException -> 0x0556 }
            java.util.TreeMap r4 = new java.util.TreeMap     // Catch:{ all -> 0x054e }
            java.util.Comparator r8 = defpackage.bnt.o     // Catch:{ all -> 0x054e }
            r4.<init>(r8)     // Catch:{ all -> 0x054e }
        L_0x00ba:
            r8 = 0
            r1.m = r8     // Catch:{ all -> 0x054e }
            java.util.List r9 = r1.c     // Catch:{ all -> 0x054e }
            r9.clear()     // Catch:{ all -> 0x054e }
            java.util.List r9 = r1.h     // Catch:{ all -> 0x054e }
            r9.clear()     // Catch:{ all -> 0x054e }
            java.util.Map r9 = r1.i     // Catch:{ all -> 0x054e }
            r9.clear()     // Catch:{ all -> 0x054e }
            brl r9 = defpackage.brl.v     // Catch:{ all -> 0x054e }
            aucd r9 = r9.o()     // Catch:{ all -> 0x054e }
            java.lang.String r10 = r1.a     // Catch:{ all -> 0x054e }
            boolean r11 = r9.c     // Catch:{ all -> 0x054e }
            if (r11 != 0) goto L_0x00d9
            goto L_0x00de
        L_0x00d9:
            r9.c()     // Catch:{ all -> 0x054e }
            r9.c = r8     // Catch:{ all -> 0x054e }
        L_0x00de:
            aucj r11 = r9.b     // Catch:{ all -> 0x054e }
            brl r11 = (defpackage.brl) r11     // Catch:{ all -> 0x054e }
            r10.getClass()     // Catch:{ all -> 0x054e }
            int r12 = r11.a     // Catch:{ all -> 0x054e }
            r12 = r12 | 8
            r11.a = r12     // Catch:{ all -> 0x054e }
            r11.o = r10     // Catch:{ all -> 0x054e }
            r1.p = r9     // Catch:{ all -> 0x054e }
            bpw r9 = r1.e     // Catch:{ all -> 0x054e }
            java.util.ArrayList r9 = super.a((java.util.List) r9, (boolean) r6)     // Catch:{ all -> 0x054e }
            java.util.ArrayList r9 = r1.a((java.util.ArrayList) r9, (java.util.SortedMap) r4)     // Catch:{ all -> 0x054e }
            int r10 = r9.size()     // Catch:{ all -> 0x054e }
            if (r10 == 0) goto L_0x0543
            java.util.Map r10 = r1.d     // Catch:{ all -> 0x054e }
            boolean r10 = r10.isEmpty()     // Catch:{ all -> 0x054e }
            if (r10 != 0) goto L_0x01b5
            java.lang.String r10 = "Config resolution failed. Try without optional APKs"
            r1.b((java.lang.String) r10)     // Catch:{ all -> 0x054e }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x054e }
            bpw r11 = r1.e     // Catch:{ all -> 0x054e }
            int r11 = r11.size()     // Catch:{ all -> 0x054e }
            r10.<init>(r11)     // Catch:{ all -> 0x054e }
            r11 = 0
        L_0x0118:
            bpw r12 = r1.e     // Catch:{ all -> 0x054e }
            int r12 = r12.size()     // Catch:{ all -> 0x054e }
            if (r11 < r12) goto L_0x0197
            java.util.ArrayList r10 = super.a((java.util.List) r10, (boolean) r8)     // Catch:{ all -> 0x054e }
            java.util.Map r11 = r1.d     // Catch:{ all -> 0x054e }
            r11.clear()     // Catch:{ all -> 0x054e }
            java.util.TreeMap r11 = new java.util.TreeMap     // Catch:{ all -> 0x054e }
            java.util.Comparator r12 = defpackage.bnt.o     // Catch:{ all -> 0x054e }
            r11.<init>(r12)     // Catch:{ all -> 0x054e }
            r1.a((java.util.ArrayList) r10, (java.util.SortedMap) r11)     // Catch:{ all -> 0x054e }
            java.util.Map r10 = r1.d     // Catch:{ all -> 0x054e }
            boolean r10 = r10.isEmpty()     // Catch:{ all -> 0x054e }
            if (r10 == 0) goto L_0x013d
            goto L_0x01b5
        L_0x013d:
            java.util.Map r0 = r1.d     // Catch:{ all -> 0x054e }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x054e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x054e }
        L_0x0147:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x054e }
            if (r2 == 0) goto L_0x018f
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x054e }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x054e }
            java.lang.Object r4 = r2.getKey()     // Catch:{ all -> 0x054e }
            bnm r4 = (defpackage.bnm) r4     // Catch:{ all -> 0x054e }
            java.lang.String r4 = r4.c     // Catch:{ all -> 0x054e }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x054e }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x054e }
            java.lang.String r7 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x054e }
            int r7 = r7.length()     // Catch:{ all -> 0x054e }
            java.lang.String r8 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x054e }
            int r8 = r8.length()     // Catch:{ all -> 0x054e }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x054e }
            int r7 = r7 + 24
            int r7 = r7 + r8
            r9.<init>(r7)     // Catch:{ all -> 0x054e }
            java.lang.String r7 = "Rejected required APK "
            r9.append(r7)     // Catch:{ all -> 0x054e }
            r9.append(r4)     // Catch:{ all -> 0x054e }
            java.lang.String r4 = ": "
            r9.append(r4)     // Catch:{ all -> 0x054e }
            r9.append(r2)     // Catch:{ all -> 0x054e }
            r9.toString()     // Catch:{ all -> 0x054e }
            goto L_0x0147
        L_0x018f:
            com.google.android.chimera.config.InvalidConfigException r0 = new com.google.android.chimera.config.InvalidConfigException     // Catch:{ all -> 0x054e }
            java.lang.String r2 = "Modules from required APKs are discarded"
            r0.<init>((java.lang.String) r2)     // Catch:{ all -> 0x054e }
            throw r0     // Catch:{ all -> 0x054e }
        L_0x0197:
            java.util.BitSet r12 = r1.f     // Catch:{ all -> 0x054e }
            boolean r12 = r12.get(r11)     // Catch:{ all -> 0x054e }
            if (r12 != 0) goto L_0x01b1
            bpw r12 = r1.e     // Catch:{ all -> 0x054e }
            java.lang.Object r12 = r12.get(r11)     // Catch:{ all -> 0x054e }
            bnm r12 = (defpackage.bnm) r12     // Catch:{ all -> 0x054e }
            boolean r13 = defpackage.bnt.a((defpackage.bnm) r12)     // Catch:{ all -> 0x054e }
            if (r13 == 0) goto L_0x01ae
            goto L_0x01b1
        L_0x01ae:
            r10.add(r12)     // Catch:{ all -> 0x054e }
        L_0x01b1:
            int r11 = r11 + 1
            goto L_0x0118
        L_0x01b5:
            android.util.SparseArray r10 = r1.l     // Catch:{ all -> 0x054e }
            r10.clear()     // Catch:{ all -> 0x054e }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x054e }
            r10.<init>()     // Catch:{ all -> 0x054e }
            java.util.Iterator r11 = r9.iterator()     // Catch:{ all -> 0x054e }
            r12 = 0
            r13 = 0
        L_0x01c5:
            boolean r14 = r11.hasNext()     // Catch:{ all -> 0x054e }
            if (r14 == 0) goto L_0x0219
            java.lang.Object r14 = r11.next()     // Catch:{ all -> 0x054e }
            bom r14 = (defpackage.bom) r14     // Catch:{ all -> 0x054e }
            int r15 = super.a((defpackage.bom) r14)     // Catch:{ all -> 0x054e }
            android.util.SparseArray r5 = r1.l     // Catch:{ all -> 0x054e }
            java.lang.Object r5 = r5.get(r15)     // Catch:{ all -> 0x054e }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x054e }
            if (r5 != 0) goto L_0x01ea
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x054e }
            r5.<init>()     // Catch:{ all -> 0x054e }
            android.util.SparseArray r8 = r1.l     // Catch:{ all -> 0x054e }
            r8.append(r15, r5)     // Catch:{ all -> 0x054e }
            goto L_0x01eb
        L_0x01ea:
        L_0x01eb:
            r5.add(r14)     // Catch:{ all -> 0x054e }
            bnm r5 = r14.d     // Catch:{ all -> 0x054e }
            int r5 = r5.k     // Catch:{ all -> 0x054e }
            int r5 = defpackage.bnl.a(r5)     // Catch:{ all -> 0x054e }
            if (r5 != 0) goto L_0x01f9
            goto L_0x0209
        L_0x01f9:
            if (r5 == r6) goto L_0x0209
            bnm r5 = r14.d     // Catch:{ all -> 0x054e }
            boolean r5 = defpackage.bnt.a((defpackage.bnm) r5)     // Catch:{ all -> 0x054e }
            if (r5 == 0) goto L_0x0208
            r10.add(r14)     // Catch:{ all -> 0x054e }
            r8 = 0
            goto L_0x01c5
        L_0x0208:
            goto L_0x0211
        L_0x0209:
            java.lang.String r5 = r14.a     // Catch:{ all -> 0x054e }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x054e }
            r13 = r13 | r5
            r12 = 1
        L_0x0211:
            boolean r5 = super.b((defpackage.bom) r14)     // Catch:{ all -> 0x054e }
            if (r5 == 0) goto L_0x00ba
            r8 = 0
            goto L_0x01c5
        L_0x0219:
            if (r12 != 0) goto L_0x021c
            goto L_0x021e
        L_0x021c:
            if (r13 == 0) goto L_0x053a
        L_0x021e:
            java.util.Iterator r5 = r10.iterator()     // Catch:{ all -> 0x054e }
        L_0x0222:
            boolean r8 = r5.hasNext()     // Catch:{ all -> 0x054e }
            if (r8 != 0) goto L_0x0522
            java.util.List r5 = r1.c     // Catch:{ all -> 0x054e }
            java.util.Comparator r8 = defpackage.bnt.n     // Catch:{ all -> 0x054e }
            java.util.Collections.sort(r5, r8)     // Catch:{ all -> 0x054e }
            java.util.Set r5 = r4.keySet()     // Catch:{ all -> 0x054e }
            anax r5 = defpackage.anax.a((java.util.Collection) r5)     // Catch:{ all -> 0x054e }
            java.util.Iterator r8 = r9.iterator()     // Catch:{ all -> 0x054e }
        L_0x023b:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x054e }
            if (r9 == 0) goto L_0x028f
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x054e }
            bom r9 = (defpackage.bom) r9     // Catch:{ all -> 0x054e }
            java.util.Map r10 = defpackage.qug.a()     // Catch:{ all -> 0x054e }
            java.util.Iterator r11 = r5.iterator()     // Catch:{ all -> 0x054e }
        L_0x024f:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x054e }
            if (r12 == 0) goto L_0x0261
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x054e }
            brm r12 = (defpackage.brm) r12     // Catch:{ all -> 0x054e }
            java.lang.String r13 = r12.b     // Catch:{ all -> 0x054e }
            r10.put(r13, r12)     // Catch:{ all -> 0x054e }
            goto L_0x024f
        L_0x0261:
            brl r11 = r9.e     // Catch:{ all -> 0x054e }
            aucx r11 = r11.g     // Catch:{ all -> 0x054e }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x054e }
        L_0x0269:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x054e }
            if (r12 == 0) goto L_0x023b
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x054e }
            brp r12 = (defpackage.brp) r12     // Catch:{ all -> 0x054e }
            java.lang.String r13 = r12.b     // Catch:{ all -> 0x054e }
            java.lang.Object r13 = r10.get(r13)     // Catch:{ all -> 0x054e }
            brm r13 = (defpackage.brm) r13     // Catch:{ all -> 0x054e }
            if (r13 == 0) goto L_0x0269
            int r13 = r13.c     // Catch:{ all -> 0x054e }
            int r14 = r12.c     // Catch:{ all -> 0x054e }
            if (r13 < r14) goto L_0x0269
            int r14 = r12.d     // Catch:{ all -> 0x054e }
            if (r13 > r14) goto L_0x0269
            java.util.Set r13 = r9.g     // Catch:{ all -> 0x054e }
            r13.add(r12)     // Catch:{ all -> 0x054e }
            goto L_0x0269
        L_0x028f:
            java.util.Set r5 = r4.entrySet()     // Catch:{ all -> 0x054e }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x054e }
            r8 = 0
        L_0x0298:
            boolean r9 = r5.hasNext()     // Catch:{ all -> 0x054e }
            if (r9 != 0) goto L_0x04ca
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x054e }
            java.util.Set r8 = r4.keySet()     // Catch:{ all -> 0x054e }
            r5.<init>(r8)     // Catch:{ all -> 0x054e }
            java.util.BitSet r8 = new java.util.BitSet     // Catch:{ all -> 0x054e }
            r8.<init>()     // Catch:{ all -> 0x054e }
            android.util.SparseArray r9 = new android.util.SparseArray     // Catch:{ all -> 0x054e }
            r9.<init>()     // Catch:{ all -> 0x054e }
            java.util.Collection r11 = r4.values()     // Catch:{ all -> 0x054e }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x054e }
        L_0x02b9:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x054e }
            if (r12 == 0) goto L_0x02e2
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x054e }
            bom r12 = (defpackage.bom) r12     // Catch:{ all -> 0x054e }
            int r12 = super.a((defpackage.bom) r12)     // Catch:{ all -> 0x054e }
            boolean r13 = r8.get(r12)     // Catch:{ all -> 0x054e }
            if (r13 != 0) goto L_0x02b9
            r8.set(r12)     // Catch:{ all -> 0x054e }
            android.util.SparseArray r13 = r1.l     // Catch:{ all -> 0x054e }
            java.lang.Object r13 = r13.get(r12)     // Catch:{ all -> 0x054e }
            java.util.List r13 = (java.util.List) r13     // Catch:{ all -> 0x054e }
            java.util.List r13 = defpackage.bnt.a(r13, r5, r4)     // Catch:{ all -> 0x054e }
            r9.append(r12, r13)     // Catch:{ all -> 0x054e }
            goto L_0x02b9
        L_0x02e2:
            bns r8 = new bns     // Catch:{ all -> 0x054e }
            r8.<init>(r1, r9, r4)     // Catch:{ all -> 0x054e }
            r9 = 0
        L_0x02e8:
            android.util.SparseArray r11 = r1.l     // Catch:{ all -> 0x054e }
            int r11 = r11.size()     // Catch:{ all -> 0x054e }
            if (r9 >= r11) goto L_0x0452
            android.util.SparseArray r11 = r1.l     // Catch:{ all -> 0x054e }
            int r11 = r11.keyAt(r9)     // Catch:{ all -> 0x054e }
            android.util.SparseArray r12 = r1.l     // Catch:{ all -> 0x054e }
            java.lang.Object r12 = r12.get(r11)     // Catch:{ all -> 0x054e }
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x054e }
            java.util.List r12 = defpackage.bnt.a(r12, r5, r4)     // Catch:{ all -> 0x054e }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x054e }
            r13.<init>()     // Catch:{ all -> 0x054e }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x054e }
        L_0x030b:
            boolean r14 = r12.hasNext()     // Catch:{ all -> 0x054e }
            if (r14 == 0) goto L_0x03eb
            java.lang.Object r14 = r12.next()     // Catch:{ all -> 0x054e }
            brm r14 = (defpackage.brm) r14     // Catch:{ all -> 0x054e }
            java.lang.Object r15 = r4.get(r14)     // Catch:{ all -> 0x054e }
            bom r15 = (defpackage.bom) r15     // Catch:{ all -> 0x054e }
            defpackage.amtf.a((java.lang.Object) r15)     // Catch:{ all -> 0x054e }
            int r15 = super.a((defpackage.bom) r15)     // Catch:{ all -> 0x054e }
            r6 = 0
        L_0x0325:
            int r10 = r13.size()     // Catch:{ all -> 0x054e }
            r16 = -1
            if (r6 >= r10) goto L_0x034b
            java.lang.Object r10 = r13.get(r6)     // Catch:{ all -> 0x054e }
            bnp r10 = (defpackage.bnp) r10     // Catch:{ all -> 0x054e }
            r17 = r4
            int r4 = r10.b     // Catch:{ all -> 0x054e }
            if (r4 != r15) goto L_0x0346
            r4 = 5
            java.lang.Object r18 = r10.c(r4)     // Catch:{ all -> 0x054e }
            r4 = r18
            aucd r4 = (defpackage.aucd) r4     // Catch:{ all -> 0x054e }
            r4.a((defpackage.aucj) r10)     // Catch:{ all -> 0x054e }
            goto L_0x034f
        L_0x0346:
            int r6 = r6 + 1
            r4 = r17
            goto L_0x0325
        L_0x034b:
            r17 = r4
            r4 = 0
            r6 = -1
        L_0x034f:
            if (r4 != 0) goto L_0x0380
            bnp r4 = defpackage.bnp.d     // Catch:{ all -> 0x054e }
            aucd r4 = r4.o()     // Catch:{ all -> 0x054e }
            boolean r6 = r4.c     // Catch:{ all -> 0x054e }
            if (r6 != 0) goto L_0x035c
            goto L_0x0362
        L_0x035c:
            r4.c()     // Catch:{ all -> 0x054e }
            r6 = 0
            r4.c = r6     // Catch:{ all -> 0x054e }
        L_0x0362:
            aucj r6 = r4.b     // Catch:{ all -> 0x054e }
            bnp r6 = (defpackage.bnp) r6     // Catch:{ all -> 0x054e }
            int r10 = r6.a     // Catch:{ all -> 0x054e }
            r18 = 1
            r10 = r10 | 1
            r6.a = r10     // Catch:{ all -> 0x054e }
            r6.b = r15     // Catch:{ all -> 0x054e }
            aucj r6 = r4.i()     // Catch:{ all -> 0x054e }
            bnp r6 = (defpackage.bnp) r6     // Catch:{ all -> 0x054e }
            r13.add(r6)     // Catch:{ all -> 0x054e }
            int r6 = r13.size()     // Catch:{ all -> 0x054e }
            int r6 = r6 + -1
            goto L_0x0381
        L_0x0380:
        L_0x0381:
            java.util.Map r10 = r1.i     // Catch:{ all -> 0x054e }
            java.lang.String r14 = r14.b     // Catch:{ all -> 0x054e }
            java.lang.Object r10 = r10.get(r14)     // Catch:{ all -> 0x054e }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x054e }
            defpackage.amtf.a((java.lang.Object) r10)     // Catch:{ all -> 0x054e }
            int r10 = r10.intValue()     // Catch:{ all -> 0x054e }
            aucj r14 = r4.b     // Catch:{ all -> 0x054e }
            bnp r14 = (defpackage.bnp) r14     // Catch:{ all -> 0x054e }
            aucs r14 = r14.c     // Catch:{ all -> 0x054e }
            int r14 = r14.size()     // Catch:{ all -> 0x054e }
            r15 = 0
        L_0x039d:
            if (r15 >= r14) goto L_0x03b3
            r16 = r5
            aucj r5 = r4.b     // Catch:{ all -> 0x054e }
            bnp r5 = (defpackage.bnp) r5     // Catch:{ all -> 0x054e }
            aucs r5 = r5.c     // Catch:{ all -> 0x054e }
            int r5 = r5.c(r15)     // Catch:{ all -> 0x054e }
            if (r5 != r10) goto L_0x03ae
            goto L_0x03db
        L_0x03ae:
            int r15 = r15 + 1
            r5 = r16
            goto L_0x039d
        L_0x03b3:
            r16 = r5
            boolean r5 = r4.c     // Catch:{ all -> 0x054e }
            if (r5 != 0) goto L_0x03ba
            goto L_0x03c0
        L_0x03ba:
            r4.c()     // Catch:{ all -> 0x054e }
            r5 = 0
            r4.c = r5     // Catch:{ all -> 0x054e }
        L_0x03c0:
            aucj r5 = r4.b     // Catch:{ all -> 0x054e }
            bnp r5 = (defpackage.bnp) r5     // Catch:{ all -> 0x054e }
            bnp r14 = defpackage.bnp.d     // Catch:{ all -> 0x054e }
            aucs r14 = r5.c     // Catch:{ all -> 0x054e }
            boolean r14 = r14.a()     // Catch:{ all -> 0x054e }
            if (r14 != 0) goto L_0x03d6
            aucs r14 = r5.c     // Catch:{ all -> 0x054e }
            aucs r14 = defpackage.aucj.a((defpackage.aucs) r14)     // Catch:{ all -> 0x054e }
            r5.c = r14     // Catch:{ all -> 0x054e }
        L_0x03d6:
            aucs r5 = r5.c     // Catch:{ all -> 0x054e }
            r5.d(r10)     // Catch:{ all -> 0x054e }
        L_0x03db:
            aucj r4 = r4.i()     // Catch:{ all -> 0x054e }
            bnp r4 = (defpackage.bnp) r4     // Catch:{ all -> 0x054e }
            r13.set(r6, r4)     // Catch:{ all -> 0x054e }
            r5 = r16
            r4 = r17
            r6 = 1
            goto L_0x030b
        L_0x03eb:
            r17 = r4
            r16 = r5
            java.util.Collections.sort(r13, r8)     // Catch:{ all -> 0x054e }
            java.util.ArrayList r4 = r1.g     // Catch:{ all -> 0x054e }
            java.lang.Object r5 = r4.get(r11)     // Catch:{ all -> 0x054e }
            bnm r5 = (defpackage.bnm) r5     // Catch:{ all -> 0x054e }
            r6 = 5
            java.lang.Object r10 = r5.c(r6)     // Catch:{ all -> 0x054e }
            aucd r10 = (defpackage.aucd) r10     // Catch:{ all -> 0x054e }
            r10.a((defpackage.aucj) r5)     // Catch:{ all -> 0x054e }
            boolean r5 = r10.c     // Catch:{ all -> 0x054e }
            if (r5 != 0) goto L_0x0409
            goto L_0x040f
        L_0x0409:
            r10.c()     // Catch:{ all -> 0x054e }
            r5 = 0
            r10.c = r5     // Catch:{ all -> 0x054e }
        L_0x040f:
            aucj r5 = r10.b     // Catch:{ all -> 0x054e }
            bnm r5 = (defpackage.bnm) r5     // Catch:{ all -> 0x054e }
            bnm r6 = defpackage.bnm.r     // Catch:{ all -> 0x054e }
            aucx r6 = defpackage.aucj.s()     // Catch:{ all -> 0x054e }
            r5.j = r6     // Catch:{ all -> 0x054e }
            boolean r5 = r10.c     // Catch:{ all -> 0x054e }
            if (r5 != 0) goto L_0x0420
            goto L_0x0426
        L_0x0420:
            r10.c()     // Catch:{ all -> 0x054e }
            r5 = 0
            r10.c = r5     // Catch:{ all -> 0x054e }
        L_0x0426:
            aucj r5 = r10.b     // Catch:{ all -> 0x054e }
            bnm r5 = (defpackage.bnm) r5     // Catch:{ all -> 0x054e }
            aucx r6 = r5.j     // Catch:{ all -> 0x054e }
            boolean r6 = r6.a()     // Catch:{ all -> 0x054e }
            if (r6 == 0) goto L_0x0433
            goto L_0x043b
        L_0x0433:
            aucx r6 = r5.j     // Catch:{ all -> 0x054e }
            aucx r6 = defpackage.aucj.a((defpackage.aucx) r6)     // Catch:{ all -> 0x054e }
            r5.j = r6     // Catch:{ all -> 0x054e }
        L_0x043b:
            aucx r5 = r5.j     // Catch:{ all -> 0x054e }
            defpackage.auab.a((java.lang.Iterable) r13, (java.util.List) r5)     // Catch:{ all -> 0x054e }
            aucj r5 = r10.i()     // Catch:{ all -> 0x054e }
            bnm r5 = (defpackage.bnm) r5     // Catch:{ all -> 0x054e }
            r4.set(r11, r5)     // Catch:{ all -> 0x054e }
            int r9 = r9 + 1
            r5 = r16
            r4 = r17
            r6 = 1
            goto L_0x02e8
        L_0x0452:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x054e }
            r4.<init>()     // Catch:{ all -> 0x054e }
            r8 = 0
        L_0x0458:
            bpw r5 = r1.e     // Catch:{ all -> 0x054e }
            int r5 = r5.size()     // Catch:{ all -> 0x054e }
            if (r8 >= r5) goto L_0x04a0
            java.util.BitSet r5 = r1.f     // Catch:{ all -> 0x054e }
            boolean r5 = r5.get(r8)     // Catch:{ all -> 0x054e }
            if (r5 != 0) goto L_0x049d
            bpw r5 = r1.e     // Catch:{ all -> 0x054e }
            java.lang.Object r5 = r5.get(r8)     // Catch:{ all -> 0x054e }
            bnm r5 = (defpackage.bnm) r5     // Catch:{ all -> 0x054e }
            android.util.SparseArray r6 = r1.l     // Catch:{ all -> 0x054e }
            int r6 = r6.indexOfKey(r8)     // Catch:{ all -> 0x054e }
            if (r6 < 0) goto L_0x049d
            java.util.Map r6 = r1.j     // Catch:{ all -> 0x054e }
            java.lang.Object r5 = r6.get(r5)     // Catch:{ all -> 0x054e }
            brh r5 = (defpackage.brh) r5     // Catch:{ all -> 0x054e }
            defpackage.amtf.a((java.lang.Object) r5)     // Catch:{ all -> 0x054e }
            aucx r5 = r5.a     // Catch:{ all -> 0x054e }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x054e }
        L_0x0489:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x054e }
            if (r6 == 0) goto L_0x049d
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x054e }
            brl r6 = (defpackage.brl) r6     // Catch:{ all -> 0x054e }
            java.util.List r6 = defpackage.blj.a((defpackage.brl) r6)     // Catch:{ all -> 0x054e }
            r4.add(r6)     // Catch:{ all -> 0x054e }
            goto L_0x0489
        L_0x049d:
            int r8 = r8 + 1
            goto L_0x0458
        L_0x04a0:
            if (r7 != 0) goto L_0x04ab
            bpw r4 = defpackage.blj.a((java.util.List) r4)     // Catch:{ all -> 0x054e }
            bpw r0 = defpackage.blj.a(r0, r4)     // Catch:{ all -> 0x054e }
            goto L_0x04b9
        L_0x04ab:
            boolean r5 = r4.isEmpty()     // Catch:{ all -> 0x054e }
            if (r5 != 0) goto L_0x04b8
            r4.add(r0)     // Catch:{ all -> 0x054e }
            bpw r0 = defpackage.blj.a((java.util.List) r4)     // Catch:{ all -> 0x054e }
        L_0x04b8:
        L_0x04b9:
            r1.b = r0     // Catch:{ all -> 0x054e }
            r4 = 1
            r1.m = r4     // Catch:{ all -> 0x054c }
            java.util.ArrayList r0 = r1.g     // Catch:{ all -> 0x054c }
            java.util.Comparator r2 = r2.a     // Catch:{ all -> 0x054c }
            bpw r0 = defpackage.bpw.a(r0, r2)     // Catch:{ all -> 0x054c }
            defpackage.bom.a()     // Catch:{ InvalidConfigException -> 0x0554 }
            return r0
        L_0x04ca:
            r17 = r4
            r4 = 1
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x054c }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ all -> 0x054c }
            java.lang.Object r9 = r6.getKey()     // Catch:{ all -> 0x054c }
            brm r9 = (defpackage.brm) r9     // Catch:{ all -> 0x054c }
            java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x054c }
            bom r6 = (defpackage.bom) r6     // Catch:{ all -> 0x054c }
            java.util.List r10 = r1.h     // Catch:{ all -> 0x054c }
            r11 = 5
            java.lang.Object r11 = r9.c(r11)     // Catch:{ all -> 0x054c }
            aucd r11 = (defpackage.aucd) r11     // Catch:{ all -> 0x054c }
            r11.a((defpackage.aucj) r9)     // Catch:{ all -> 0x054c }
            int r6 = r6.f     // Catch:{ all -> 0x054c }
            boolean r12 = r11.c     // Catch:{ all -> 0x054c }
            if (r12 != 0) goto L_0x04f3
            r12 = 0
            goto L_0x04f9
        L_0x04f3:
            r11.c()     // Catch:{ all -> 0x054c }
            r12 = 0
            r11.c = r12     // Catch:{ all -> 0x054c }
        L_0x04f9:
            aucj r13 = r11.b     // Catch:{ all -> 0x054c }
            brm r13 = (defpackage.brm) r13     // Catch:{ all -> 0x054c }
            brm r14 = defpackage.brm.f     // Catch:{ all -> 0x054c }
            int r14 = r13.a     // Catch:{ all -> 0x054c }
            r14 = r14 | 4
            r13.a = r14     // Catch:{ all -> 0x054c }
            r13.e = r6     // Catch:{ all -> 0x054c }
            aucj r6 = r11.i()     // Catch:{ all -> 0x054c }
            brm r6 = (defpackage.brm) r6     // Catch:{ all -> 0x054c }
            r10.add(r6)     // Catch:{ all -> 0x054c }
            java.util.Map r6 = r1.i     // Catch:{ all -> 0x054c }
            java.lang.String r9 = r9.b     // Catch:{ all -> 0x054c }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x054c }
            r6.put(r9, r10)     // Catch:{ all -> 0x054c }
            int r8 = r8 + 1
            r4 = r17
            r6 = 1
            goto L_0x0298
        L_0x0522:
            r17 = r4
            r4 = 1
            r12 = 0
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x054c }
            bom r6 = (defpackage.bom) r6     // Catch:{ all -> 0x054c }
            boolean r6 = super.b((defpackage.bom) r6)     // Catch:{ all -> 0x054c }
            r4 = r17
            if (r6 != 0) goto L_0x0537
            r6 = 1
            goto L_0x00ba
        L_0x0537:
            r6 = 1
            goto L_0x0222
        L_0x053a:
            r4 = 1
            com.google.android.chimera.config.InvalidConfigException r0 = new com.google.android.chimera.config.InvalidConfigException     // Catch:{ all -> 0x054c }
            java.lang.String r2 = "No built-in module"
            r0.<init>((java.lang.String) r2)     // Catch:{ all -> 0x054c }
            throw r0     // Catch:{ all -> 0x054c }
        L_0x0543:
            r4 = 1
            com.google.android.chimera.config.InvalidConfigException r0 = new com.google.android.chimera.config.InvalidConfigException     // Catch:{ all -> 0x054c }
            java.lang.String r2 = "No usable modules"
            r0.<init>((java.lang.String) r2)     // Catch:{ all -> 0x054c }
            throw r0     // Catch:{ all -> 0x054c }
        L_0x054c:
            r0 = move-exception
            goto L_0x0550
        L_0x054e:
            r0 = move-exception
            r4 = 1
        L_0x0550:
            defpackage.bom.a()     // Catch:{ InvalidConfigException -> 0x0554 }
            throw r0     // Catch:{ InvalidConfigException -> 0x0554 }
        L_0x0554:
            r0 = move-exception
            goto L_0x0558
        L_0x0556:
            r0 = move-exception
            r4 = 1
        L_0x0558:
            if (r3 == 0) goto L_0x05da
            r27.clear()
            java.util.Map r2 = r1.d
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0567:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x05da
            java.lang.Object r5 = r2.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            bnm r6 = (defpackage.bnm) r6
            java.lang.String r8 = r6.c
            int r7 = r6.b
            int r18 = defpackage.bnj.a(r7)
            if (r18 == 0) goto L_0x0586
            r9 = r18
            goto L_0x0587
        L_0x0586:
            r9 = 1
        L_0x0587:
            int r10 = r6.m
            int r7 = r6.i
            int r18 = defpackage.bpc.a(r7)
            if (r18 == 0) goto L_0x0594
            r11 = r18
            goto L_0x0595
        L_0x0594:
            r11 = 1
        L_0x0595:
            int r12 = r6.l
            java.lang.String r13 = r6.n
            int r7 = r6.a
            r14 = r7 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x05a2
            java.lang.String r14 = r6.o
            goto L_0x05a3
        L_0x05a2:
            r14 = 0
        L_0x05a3:
            r7 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r7 == 0) goto L_0x05ab
            java.lang.String r7 = r6.p
            r15 = r7
            goto L_0x05ac
        L_0x05ab:
            r15 = 0
        L_0x05ac:
            r7 = r20
            bms r7 = defpackage.bms.a(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r7 != 0) goto L_0x05d0
            java.lang.String r5 = r6.c
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "failed to create ModuleApk from descriptor: "
            int r7 = r5.length()
            if (r7 != 0) goto L_0x05c8
            java.lang.String r5 = new java.lang.String
            r5.<init>(r6)
            goto L_0x05cc
        L_0x05c8:
            java.lang.String r5 = r6.concat(r5)
        L_0x05cc:
            r1.a((java.lang.String) r5)
            goto L_0x0567
        L_0x05d0:
            java.lang.Object r5 = r5.getValue()
            bke r5 = (defpackage.bke) r5
            r3.put(r7, r5)
            goto L_0x0567
        L_0x05da:
            goto L_0x05dc
        L_0x05db:
            throw r0
        L_0x05dc:
            goto L_0x05db
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnz.a(android.content.Context, java.util.List, java.util.List, java.util.List, bpw, bpw, bpw, java.util.Map):bpw");
    }

    /* access modifiers changed from: protected */
    public final void a() {
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        Log.w("ChimeraCfgRslvr", str);
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        Log.e("ChimeraCfgRslvr", str);
    }
}
