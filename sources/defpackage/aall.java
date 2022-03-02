package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.queries.GlobalQueryCall$Request;
import com.google.android.gms.search.queries.GlobalQueryCall$Response;

/* renamed from: aall  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aall extends aafb {
    public final osf a;
    private final pxp b;
    private final boolean c;
    private final boolean d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aall(osf osf, GlobalQueryCall$Request globalQueryCall$Request, ozc ozc) {
        super(aonk.GLOBAL_QUERY, 1, 1, osf.b, globalQueryCall$Request, ozc);
        int i;
        boolean z = true;
        this.a = osf;
        aolo aolo = aolo.QUERY_UNIVERSAL;
        GlobalSearchQuerySpecification globalSearchQuerySpecification = globalQueryCall$Request.d;
        if (globalSearchQuerySpecification != null) {
            i = globalSearchQuerySpecification.e;
        } else {
            i = 1;
        }
        pxp pxp = new pxp(aolo, plc.b(i));
        this.b = pxp;
        pxp.a();
        this.c = osf.r.b();
        this.d = globalQueryCall$Request.e == null ? false : z;
    }

    private static final GlobalQueryCall$Response a(int i, String str) {
        GlobalQueryCall$Response globalQueryCall$Response = new GlobalQueryCall$Response();
        globalQueryCall$Response.a = new Status(i, str, (PendingIntent) null);
        globalQueryCall$Response.b = dtu.b(str);
        return globalQueryCall$Response;
    }

    /* access modifiers changed from: protected */
    public final String f() {
        return String.format("%s, query[%s]", new Object[]{super.f(), ((GlobalQueryCall$Request) this.n).a});
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        r4.d = defpackage.aucj.a(r4.d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        defpackage.auab.a((java.lang.Iterable) r3, (java.util.List) r4.d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02ec, code lost:
        if (r13 != null) goto L_0x02f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02ee, code lost:
        r32 = r2;
        r31 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02f4, code lost:
        r7 = r11.a;
        r3 = r13.a(r7.e, r7.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02fe, code lost:
        if (r3 != null) goto L_0x0303;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0300, code lost:
        r31 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0305, code lost:
        if (r13.h == false) goto L_0x0323;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        r4 = r3.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x030b, code lost:
        if (r10.c != false) goto L_0x030e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x030e, code lost:
        r10.c();
        r10.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0314, code lost:
        r7 = (defpackage.ouc) r10.b;
        r31 = r5;
        r7.a |= 4;
        r7.f = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0323, code lost:
        r31 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0325, code lost:
        r4 = (double) r14;
        java.lang.Double.isNaN(r4);
        r4 = 1.0d / r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x032f, code lost:
        if (r10.c != false) goto L_0x0332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0332, code lost:
        r10.c();
        r10.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0338, code lost:
        r14 = (defpackage.ouc) r10.b;
        r7 = r14.a | 2;
        r14.a = r7;
        r14.e = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0346, code lost:
        if (r3 != null) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0348, code lost:
        r32 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x034d, code lost:
        r32 = r2;
        r1 = (double) r3.b;
        java.lang.Double.isNaN(r1);
        r4 = r4 * r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        r14.a = r7 | 2;
        r14.e = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0367, code lost:
        if (((java.lang.Boolean) defpackage.ozx.P.c()).booleanValue() == false) goto L_0x03d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0369, code lost:
        r1 = r13.m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x036b, code lost:
        if (r1 == null) goto L_0x03d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x036e, code lost:
        if (r1.length <= 0) goto L_0x03d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0370, code lost:
        r1 = new java.util.ArrayList();
        r2 = defpackage.ozq.b(r11.a).entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0387, code lost:
        if (r2.hasNext() == false) goto L_0x03d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0389, code lost:
        r3 = (defpackage.ozm) ((java.util.Map.Entry) r2.next()).getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03a6, code lost:
        if (new defpackage.aucu(r3.b.h, defpackage.oqy.i).contains(defpackage.oqx.c) == false) goto L_0x0383;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03a8, code lost:
        r4 = defpackage.ouj.e.o();
        r3 = r3.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03b2, code lost:
        if (r4.c != false) goto L_0x03b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03b5, code lost:
        r4.c();
        r4.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03bb, code lost:
        r7 = (defpackage.ouj) r4.b;
        r7.a |= 1;
        r7.b = r3;
        r1.add((defpackage.ouj) r4.i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03d1, code lost:
        r10.Q(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03d4, code lost:
        r1 = r11.a.e;
        r2 = r9.a.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03dc, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03e1, code lost:
        if (defpackage.axsj.e() == false) goto L_0x03fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03eb, code lost:
        if (r9.a.e.isEmpty() == false) goto L_0x03fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03f5, code lost:
        if (defpackage.prp.b(r9.a.a, r1) != false) goto L_0x03fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03f7, code lost:
        r3 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03fa, code lost:
        r3 = 1.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03fc, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03fe, code lost:
        r1 = (defpackage.pqq) r9.a.e.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0408, code lost:
        if (r1 == null) goto L_0x040d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x040a, code lost:
        r3 = r1.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x040d, code lost:
        r3 = 1.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x040f, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0414, code lost:
        if (r3 > 0.0d) goto L_0x0417;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x041b, code lost:
        if (r3 >= 1.0d) goto L_0x0449;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:?, code lost:
        r1 = ((defpackage.ouc) r10.b).e * r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0427, code lost:
        if (r10.c != false) goto L_0x042a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x042a, code lost:
        r10.c();
        r10.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0430, code lost:
        r5 = (defpackage.ouc) r10.b;
        r5.a |= 2;
        r5.e = r1;
        defpackage.oso.d("Demoted %s by %s", r11.a.e, java.lang.Double.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0449, code lost:
        r6.a((defpackage.ouc) r10.i());
        r1 = defpackage.pxr.a(r11.a.j);
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0463, code lost:
        if (r2 >= r11.a.j.size()) goto L_0x047d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0465, code lost:
        r3 = r11.a;
        r3 = defpackage.pxr.a(r3, r2, (defpackage.oqy) r3.j.get(r2), r1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0474, code lost:
        if (r3 != null) goto L_0x0477;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0477, code lost:
        r8.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x047a, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x047d, code lost:
        r15 = r15 + 1;
        r1 = r40;
        r9 = r24;
        r7 = r25;
        r10 = r26;
        r3 = r27;
        r4 = r28;
        r5 = r31;
        r2 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0494, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0498, code lost:
        r32 = r2;
        r27 = r3;
        r28 = r4;
        r31 = r5;
        r25 = r7;
        r6.N(r8);
        r1 = (defpackage.oul) r6.i();
        r3 = (defpackage.aucd) r1.c(5);
        r3.a((defpackage.aucj) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04bb, code lost:
        if (((defpackage.oul) r3.b).g <= 0) goto L_0x04e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x04bd, code lost:
        r1 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04c5, code lost:
        if (r1.hasNext() == false) goto L_0x04e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04c7, code lost:
        r5 = (defpackage.osz) r1.next();
        defpackage.oso.d("Corpus: %s:%s id %d", r5.e, r5.c, java.lang.Integer.valueOf(r5.b));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x04e9, code lost:
        if (r32 == null) goto L_0x0529;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x04eb, code lost:
        r1 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x04ef, code lost:
        if (r1.m == null) goto L_0x052b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x04fd, code lost:
        if (((java.lang.Boolean) defpackage.ozx.P.c()).booleanValue() == false) goto L_0x052b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x04ff, code lost:
        defpackage.oso.d("Wanted annotation types [%s]", (java.lang.Object) java.util.Arrays.toString(r1.m));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x050c, code lost:
        if (r3.c != false) goto L_0x050f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x050f, code lost:
        r3.c();
        r3.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0515, code lost:
        ((defpackage.oul) r3.b).r = defpackage.aucj.q();
        r3.O(defpackage.aoog.b(r1.m));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0529, code lost:
        r1 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x052b, code lost:
        if (r1 == null) goto L_0x0674;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x052f, code lost:
        if (r1.l == false) goto L_0x0674;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x053d, code lost:
        if (((java.lang.Boolean) defpackage.ozx.bo.c()).booleanValue() == false) goto L_0x0674;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x053f, code lost:
        r6 = new java.util.ArrayList();
        r7 = new java.util.HashMap();
        r8 = new java.util.HashMap();
        r9 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0556, code lost:
        if (r9.hasNext() == false) goto L_0x05b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0558, code lost:
        r10 = defpackage.ozq.b((defpackage.osz) r9.next()).entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x056e, code lost:
        if (r10.hasNext() == false) goto L_0x0552;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0570, code lost:
        r11 = (java.util.Map.Entry) r10.next();
        r11 = (java.lang.String) r11.getKey();
        r13 = ((defpackage.ozm) r11.getValue()).a;
        r14 = (java.util.HashSet) r7.get(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x058a, code lost:
        if (r14 == null) goto L_0x058d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x058d, code lost:
        r14 = new java.util.HashSet();
        r7.put(r11, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0595, code lost:
        r13 = java.lang.Integer.valueOf(r13);
        r14.add(r13);
        r14 = (java.util.HashSet) r8.get(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x05a2, code lost:
        if (r14 != null) goto L_0x05ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x05a4, code lost:
        r14 = new java.util.HashSet();
        r8.put(r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x05ac, code lost:
        r14.add(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x05b0, code lost:
        r7 = r7.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x05bc, code lost:
        if (r7.hasNext() == false) goto L_0x0640;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x05be, code lost:
        r9 = (java.util.Map.Entry) r7.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x05cf, code lost:
        if (((java.util.HashSet) r9.getValue()).size() != 1) goto L_0x05b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x05d1, code lost:
        r10 = (java.lang.Integer) ((java.util.HashSet) r9.getValue()).iterator().next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x05e5, code lost:
        if (r8.containsKey(r10) == false) goto L_0x05b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x05f2, code lost:
        if (((java.util.HashSet) r8.get(r10)).size() != 1) goto L_0x05b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x05f4, code lost:
        r11 = defpackage.oui.d.o();
        r9 = (java.lang.String) r9.getKey();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0602, code lost:
        if (r11.c != false) goto L_0x0605;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0605, code lost:
        r11.c();
        r11.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x060b, code lost:
        r13 = (defpackage.oui) r11.b;
        r9.getClass();
        r13.a |= 1;
        r13.b = r9;
        r9 = r10.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0620, code lost:
        if (r11.c != false) goto L_0x0623;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0623, code lost:
        r11.c();
        r11.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0629, code lost:
        r10 = (defpackage.oui) r11.b;
        r10.a |= 2;
        r10.c = r9;
        r6.add((defpackage.oui) r11.i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0644, code lost:
        if (r6.isEmpty() != false) goto L_0x0647;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0647, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0648, code lost:
        if (r6 != null) goto L_0x065c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x064a, code lost:
        defpackage.oso.a("Tried to use section restricts in global query, but sections did not match");
        r2 = a(20000, "Could not merge specified corpora's section for query - corpora are incompatible.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0657, code lost:
        monitor-exit(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0658, code lost:
        r1 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x065e, code lost:
        if (r3.c != false) goto L_0x0661;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0661, code lost:
        r3.c();
        r3.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0667, code lost:
        ((defpackage.oul) r3.b).c = defpackage.aucj.s();
        r3.M(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0674, code lost:
        if (r1 != null) goto L_0x0679;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0676, code lost:
        r6 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0679, code lost:
        r6 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x067f, code lost:
        if (r6.o.b == false) goto L_0x0682;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0686, code lost:
        if (defpackage.axsd.e() == false) goto L_0x06a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:?, code lost:
        r7 = r1.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x068c, code lost:
        if (r3.c != false) goto L_0x068f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x068f, code lost:
        r3.c();
        r3.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0695, code lost:
        r8 = (defpackage.oul) r3.b;
        r8.a |= 32;
        r8.i = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x06a2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x06a3, code lost:
        r2 = r0;
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:?, code lost:
        r7 = r6.o.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x06af, code lost:
        if (r3.c != false) goto L_0x06b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x06b2, code lost:
        r3.c();
        r3.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x06b8, code lost:
        r8 = (defpackage.oul) r3.b;
        r8.a |= com.google.android.gms.org.conscrypt.PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        r8.l = r7;
        r7 = defpackage.plc.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x06ca, code lost:
        if (r3.c != false) goto L_0x06cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x06cd, code lost:
        r3.c();
        r3.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x06d3, code lost:
        r8 = (defpackage.oul) r3.b;
        r7.getClass();
        r8.o = r7;
        r8.a |= 2048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x06e6, code lost:
        if (defpackage.pba.d() != false) goto L_0x0703;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x06ea, code lost:
        if (r3.c != false) goto L_0x06ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x06ed, code lost:
        r3.c();
        r3.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x06f3, code lost:
        r7 = (defpackage.oul) r3.b;
        r7.a |= 65536;
        r7.u = Integer.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0703, code lost:
        if (r1 == null) goto L_0x074b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0707, code lost:
        if (r1.e != 5) goto L_0x074b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0709, code lost:
        r7 = r1.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x070b, code lost:
        if (r7 == null) goto L_0x074b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x070d, code lost:
        r7 = r7.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x070f, code lost:
        if (r7 == null) goto L_0x074b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0711, code lost:
        r8 = defpackage.ovh.b.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0719, code lost:
        if (r8.c != false) goto L_0x071c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x071c, code lost:
        r8.c();
        r8.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0722, code lost:
        r7.getClass();
        ((defpackage.ovh) r8.b).a = r7;
        r7 = (defpackage.ovh) r8.i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0733, code lost:
        if (r3.c != false) goto L_0x0736;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0736, code lost:
        r3.c();
        r3.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x073c, code lost:
        r8 = (defpackage.oul) r3.b;
        r7.getClass();
        r8.s = r7;
        r8.a |= 16384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x074f, code lost:
        if (defpackage.pba.j() != false) goto L_0x0753;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0753, code lost:
        if (r1 == null) goto L_0x075d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0758, code lost:
        if (r1.e != 1) goto L_0x075b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:?, code lost:
        r7 = defpackage.plc.a(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0763, code lost:
        if (r3.c != false) goto L_0x0766;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0766, code lost:
        r3.c();
        r3.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x076c, code lost:
        r8 = (defpackage.oul) r3.b;
        r8.j = r7 - 1;
        r8.a |= 64;
        r7 = defpackage.ovh.b.o();
        r8 = (java.lang.String) defpackage.ozx.cj.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x078a, code lost:
        if (r7.c != false) goto L_0x078d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x078d, code lost:
        r7.c();
        r7.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0793, code lost:
        r8.getClass();
        ((defpackage.ovh) r7.b).a = r8;
        r7 = (defpackage.ovh) r7.i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x07a4, code lost:
        if (r3.c != false) goto L_0x07a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x07a7, code lost:
        r3.c();
        r3.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x07ad, code lost:
        r8 = (defpackage.oul) r3.b;
        r7.getClass();
        r8.s = r7;
        r8.a |= 16384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x07c8, code lost:
        if (((java.lang.Boolean) defpackage.ozx.bG.c()).booleanValue() != false) goto L_0x07cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x07ca, code lost:
        r9 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x07cd, code lost:
        r7 = (defpackage.oqc) defpackage.ozx.bF.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x07d5, code lost:
        if (r7 == null) goto L_0x088e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:?, code lost:
        r8 = defpackage.oqb.b;
        r10 = new java.util.ArrayList();
        r11 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x07e6, code lost:
        if (r11.hasNext() == false) goto L_0x086e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x07e8, code lost:
        r12 = (defpackage.osz) r11.next();
        r13 = r12.c;
        r13.getClass();
        r14 = r7.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x07f9, code lost:
        if (r14.containsKey(r13) == false) goto L_0x0802;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x07fb, code lost:
        r13 = (defpackage.oqb) r14.get(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0802, code lost:
        r13 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0803, code lost:
        r14 = new java.util.HashSet(r13.a);
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0811, code lost:
        if (r13 >= r12.j.size()) goto L_0x0866;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0821, code lost:
        if (r14.contains(((defpackage.oqy) r12.j.get(r13)).b) != false) goto L_0x0827;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0823, code lost:
        r9 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0827, code lost:
        r15 = defpackage.ouk.e.o();
        r4 = r12.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0831, code lost:
        if (r15.c != false) goto L_0x0834;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0834, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x083a, code lost:
        r5 = (defpackage.ouk) r15.b;
        r9 = r5.a | 1;
        r5.a = r9;
        r5.b = r4;
        r4 = r9 | 2;
        r5.a = r4;
        r5.c = r13;
        r5.a = r4 | 4;
        r9 = r3;
        r5.d = 0.0d;
        r10.add((defpackage.ouk) r15.i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0860, code lost:
        r13 = r13 + 1;
        r3 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0866, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x086e, code lost:
        r9 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0873, code lost:
        if (r10.isEmpty() != false) goto L_0x088f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0877, code lost:
        if (r9.c != false) goto L_0x087a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x087a, code lost:
        r9.c();
        r9.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0880, code lost:
        ((defpackage.oul) r9.b).d = defpackage.aucj.s();
        r9.N(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x088e, code lost:
        r9 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:?, code lost:
        r2 = (defpackage.oul) r9.i();
        r6.b.e();
        r8 = r31;
        r3 = r6.a.n.a(r27, r2, r28, r8);
        r4 = (defpackage.aucd) r3.c(5);
        r4.a((defpackage.aucj) r3);
        r6.b.f();
        r3 = r6.b;
        r5 = ((defpackage.oup) r4.b).l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x08bf, code lost:
        if (r5 == null) goto L_0x08c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x08c2, code lost:
        r5 = defpackage.otv.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x08c4, code lost:
        r3.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x08cf, code lost:
        if ((((defpackage.oup) r4.b).a & 64) == 0) goto L_0x08d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x08d4, code lost:
        if (r4.c != false) goto L_0x08d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x08d7, code lost:
        r4.c();
        r4.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x08dd, code lost:
        r3 = (defpackage.oup) r4.b;
        r5 = defpackage.oup.q;
        r3.m = defpackage.aonf.a(2);
        r3.a |= 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x08f0, code lost:
        r3 = (defpackage.oup) r4.i();
        r4 = defpackage.aonf.b(r3.m);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x08fc, code lost:
        if (r4 != 0) goto L_0x08ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0900, code lost:
        if (r4 == 2) goto L_0x0933;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:?, code lost:
        r4 = defpackage.aonf.b(r3.m);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0908, code lost:
        if (r4 != 0) goto L_0x090b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x090c, code lost:
        if (r4 == 3) goto L_0x0933;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x090e, code lost:
        r1 = defpackage.aonf.b(r3.m);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0914, code lost:
        if (r1 == 0) goto L_0x0917;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0917, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0918, code lost:
        r1 = defpackage.aonf.a(r1);
        r2 = defpackage.aonf.b(r3.m);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0922, code lost:
        if (r2 == 0) goto L_0x0926;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0924, code lost:
        r13 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0926, code lost:
        r13 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0927, code lost:
        r2 = a(r1, defpackage.dtu.a(r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x092f, code lost:
        monitor-exit(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0930, code lost:
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0933, code lost:
        r4 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:?, code lost:
        r5 = r4.a.length;
        r7 = new java.lang.String[r5];
        r9 = new android.os.Bundle[r5];
        r10 = new android.os.Bundle[r5];
        r11 = new android.os.Bundle[r5];
        r12 = new android.util.SparseIntArray(r5);
        r13 = 0;
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0947, code lost:
        r14 = r4.a;
        r25 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x094c, code lost:
        if (r13 >= r14.length) goto L_0x0aca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:?, code lost:
        r4 = r14[r13];
        r14 = r4.a;
        r38 = r1;
        r1 = r14.e;
        r14 = r14.c;
        r39 = r8;
        r8 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 1) + java.lang.String.valueOf(r14).length());
        r8.append(r1);
        r8.append("-");
        r8.append(r14);
        r7[r13] = r8.toString();
        r1 = (defpackage.ouo) r3.d.get(r13);
        r6 = new android.os.Bundle();
        r8 = new android.os.Bundle();
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0999, code lost:
        r23 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x09a3, code lost:
        if (r14 >= r4.a.k.size()) goto L_0x09f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x09a5, code lost:
        r7 = defpackage.dtb.a(((defpackage.ovb) r4.a.k.get(r14)).b);
        r21 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x09c5, code lost:
        if (((defpackage.oum) r1.a.get(r14)).a.size() == 0) goto L_0x09d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x09c7, code lost:
        r6.putIntArray(r7, defpackage.aoog.a((java.util.Collection) ((defpackage.oum) r1.a.get(r14)).a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x09d8, code lost:
        r8.putByteArray(r7, ((defpackage.oum) r1.a.get(r14)).b.k());
        r14 = r14 + 1;
        r5 = r21;
        r7 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x09f0, code lost:
        r21 = r5;
        r1 = android.util.Pair.create(r6, r8);
        r9[r13] = (android.os.Bundle) r1.first;
        r10[r13] = (android.os.Bundle) r1.second;
        r12.put(r4.a.b, r13);
        r1 = (defpackage.ouc) r2.b.get(r13);
        r5 = (defpackage.ouo) r3.d.get(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0a1f, code lost:
        if (r1.c.isEmpty() != false) goto L_0x0aa9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0a21, code lost:
        r6 = r1.d.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0a34, code lost:
        if (r5.a.size() >= (r1.c.size() + r6)) goto L_0x0a63;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0a36, code lost:
        defpackage.oso.c("Wanted %d annotation-only sections plus %d universal sections, but only got %d sections", java.lang.Integer.valueOf(r1.c.size()), java.lang.Integer.valueOf(r6), java.lang.Integer.valueOf(r5.a.size()));
        r24 = r2;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0a63, code lost:
        r8 = new android.os.Bundle();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0a70, code lost:
        if (r7 >= r1.c.size()) goto L_0x0aa6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0a72, code lost:
        r14 = ((defpackage.ouj) r1.c.get(r7)).b;
        r22 = r1;
        r24 = r2;
        r1 = defpackage.dtu.a((defpackage.oum) r5.a.get(r7 + r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0a8e, code lost:
        if (r1 == null) goto L_0x0a9f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0a90, code lost:
        r8.putByteArray(((defpackage.oqy) r4.a.j.get(r14)).b, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0a9f, code lost:
        r7 = r7 + 1;
        r1 = r22;
        r2 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x0aa6, code lost:
        r24 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x0aa9, code lost:
        r24 = r2;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0aac, code lost:
        if (r8 != null) goto L_0x0aaf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0ab3, code lost:
        if (r8.isEmpty() != false) goto L_0x0ab8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x0ab5, code lost:
        r11[r13] = r8;
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0ab8, code lost:
        r13 = r13 + 1;
        r6 = r40;
        r5 = r21;
        r7 = r23;
        r2 = r24;
        r4 = r25;
        r1 = r38;
        r8 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0aca, code lost:
        r38 = r1;
        r21 = r5;
        r23 = r7;
        r39 = r8;
        r1 = new int[r3.c.size()];
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0add, code lost:
        if (r14 >= r3.b) goto L_0x0aee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x0adf, code lost:
        r1[r14] = r12.get(r3.c.c(r14));
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0af2, code lost:
        if ((r3.a & 16) == 0) goto L_0x0b02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0af4, code lost:
        r2 = r3.h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0af6, code lost:
        if (r2 == null) goto L_0x0af9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0af9, code lost:
        r2 = defpackage.ouq.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0afb, code lost:
        r29 = r2.k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0b02, code lost:
        r29 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0b06, code lost:
        if (r3.b <= 0) goto L_0x0b14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0b0e, code lost:
        if (r3.i.size() == 0) goto L_0x0b11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0b11, code lost:
        r30 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0b14, code lost:
        r30 = defpackage.aooc.a((java.util.Collection) r3.i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0b1c, code lost:
        r2 = r3.b;
        r4 = new long[r2];
        r2 = new long[r2];
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x0b23, code lost:
        r5 = r3.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x0b25, code lost:
        if (r14 >= r5) goto L_0x0b48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0b27, code lost:
        r4[r14] = java.util.concurrent.TimeUnit.SECONDS.toMillis((long) r3.j.c(r14));
        r2[r14] = java.util.concurrent.TimeUnit.SECONDS.toMillis((long) r3.k.c(r14));
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0b48, code lost:
        if (r15 != false) goto L_0x0b4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x0b4a, code lost:
        r35 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0b4d, code lost:
        r35 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x0b4f, code lost:
        r24 = defpackage.aoog.a((java.util.Collection) r3.f);
        r25 = r3.g.k();
        r6 = r3.e;
        r36 = defpackage.aoog.a((java.util.Collection) r3.o);
        r37 = r3.p.k();
        r7 = android.os.Build.VERSION.SDK_INT;
        r7 = new android.os.Bundle();
        r8 = r21;
        r11 = new android.os.UserHandle[r8];
        java.util.Arrays.fill(r11, 0, r8, defpackage.dtu.a());
        r7.putParcelableArray("USER_HANDLE_ARRAYS_KEY", r11);
        r20 = new com.google.android.gms.appdatasearch.SearchResults(r5, r1, r23, r24, r25, (android.os.Bundle[]) null, r9, r10, r29, r30, r7, r6, r4, r2, r35, r36, r37);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0b9a, code lost:
        r1 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:?, code lost:
        r1.b.a(r20.i);
        r2 = r1.b;
        r2.b = r39;
        r2.c = r3.b;
        r2.d = r3.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0bb1, code lost:
        if (r38 == null) goto L_0x0bb8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0bb3, code lost:
        r13 = r38.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0bb8, code lost:
        r13 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0bb9, code lost:
        r2.e = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0bbb, code lost:
        if (r38 == null) goto L_0x0bc2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0bbd, code lost:
        r4 = r38;
        r5 = r4.j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0bc2, code lost:
        r4 = r38;
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0bc5, code lost:
        r2.f = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0bc7, code lost:
        if (r4 == null) goto L_0x0bcc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0bc9, code lost:
        r5 = r4.k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0bcc, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0bcd, code lost:
        r2.g = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0bcf, code lost:
        if (r4 == null) goto L_0x0bd4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0bd1, code lost:
        r5 = r4.p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0bd4, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0bd5, code lost:
        r2.h = r5;
        r11 = defpackage.aonf.b(r3.m);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0bdd, code lost:
        if (r11 == 0) goto L_0x0be0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0be0, code lost:
        r11 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0be1, code lost:
        r2.i = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0be5, code lost:
        if (r1.d == false) goto L_0x0bfe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0be9, code lost:
        if (r1.c == false) goto L_0x0bfe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0beb, code lost:
        r2 = r1.b;
        r3 = (com.google.android.gms.search.queries.GlobalQueryCall$Request) r1.n;
        r4 = r3.a;
        r5 = r1.o;
        r2.a(r4, r5.f, r5.g, r3.e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0c06, code lost:
        if (r1.a.y.a() != false) goto L_0x0c0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0c0a, code lost:
        r2 = r1.a.y;
        r4 = defpackage.oty.d.o();
        r3 = defpackage.auay.a(defpackage.pxo.a((com.google.android.gms.common.internal.safeparcel.SafeParcelable) (com.google.android.gms.search.queries.GlobalQueryCall$Request) r1.n));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0c22, code lost:
        if (r4.c != false) goto L_0x0c25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0c25, code lost:
        r4.c();
        r4.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0c2b, code lost:
        r5 = (defpackage.oty) r4.b;
        r3.getClass();
        r5.a |= 1;
        r5.b = r3;
        r3 = defpackage.auay.a(defpackage.pxo.a((com.google.android.gms.common.internal.safeparcel.SafeParcelable) r20));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0c44, code lost:
        if (r4.c != false) goto L_0x0c47;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0c47, code lost:
        r4.c();
        r4.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0c4d, code lost:
        r5 = (defpackage.oty) r4.b;
        r3.getClass();
        r5.a |= 2;
        r5.c = r3;
        r3 = defpackage.oub.c.o();
        r4 = (defpackage.oty) r4.i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0c6a, code lost:
        if (r3.c != false) goto L_0x0c6d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0c6d, code lost:
        r3.c();
        r3.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0c73, code lost:
        r5 = (defpackage.oub) r3.b;
        r4.getClass();
        r5.b = r4;
        r5.a = 1;
        r2.a((defpackage.oub) r3.i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0c88, code lost:
        r2 = new com.google.android.gms.search.queries.GlobalQueryCall$Response();
        r2.a = new com.google.android.gms.common.api.Status(0);
        r2.b = r20;
        r2.c = ((com.google.android.gms.search.queries.GlobalQueryCall$Request) r1.n).e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0c9f, code lost:
        monitor-exit(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0ca1, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0ca2, code lost:
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0ca4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0ca5, code lost:
        r1 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0ca8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0137, code lost:
        if (r6 != false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0cba, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r6 = r1.a.g;
        r7 = r6.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0140, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r6.b.edit().putLong("app-params-last-update-sched", java.lang.System.currentTimeMillis()).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0154, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r6 = r1.a;
        r7 = r6.c;
        r9 = r6.b;
        r10 = r6.g;
        r22 = r6.a();
        r6 = r1.a;
        r7.d(new defpackage.aamd(r9, r10, r22, r6.m, r6.t, r6.e));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x017d, code lost:
        r7 = new defpackage.pbh(r12, r2, r1.a.g.d());
        r6 = defpackage.oul.v.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0192, code lost:
        if (r6.c != false) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0195, code lost:
        r6.c();
        r6.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x019b, code lost:
        r8 = (defpackage.oul) r6.b;
        r9 = r8.a | 8;
        r8.a = r9;
        r8.h = true;
        r9 = r9 | 2;
        r8.a = r9;
        r8.f = true;
        r10 = r7.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01b4, code lost:
        if (r10 == null) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01b6, code lost:
        r15 = r10.j;
        r9 = r9 | com.google.android.chimera.FragmentTransaction.TRANSIT_ENTER_MASK;
        r8.a = r9;
        r8.p = r15;
        r15 = r10.k;
        r9 = r9 | com.google.android.chimera.FragmentTransaction.TRANSIT_EXIT_MASK;
        r8.a = r9;
        r8.q = r15;
        r15 = r10.b;
        r9 = r9 | 4;
        r8.a = r9;
        r8.g = r15;
        r15 = r10.h;
        r8.a = r9 | 1024;
        r8.n = r15;
        r8 = defpackage.plc.a(r10.e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01de, code lost:
        if (r6.c != false) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01e1, code lost:
        r6.c();
        r6.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01e7, code lost:
        r9 = (defpackage.oul) r6.b;
        r9.j = r8 - 1;
        r9.a |= 64;
        r8 = r7.b;
        r8 = defpackage.plc.a(r8.f, r8.e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0200, code lost:
        if (r6.c != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0203, code lost:
        r6.c();
        r6.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0209, code lost:
        r9 = (defpackage.oul) r6.b;
        r9.m = r8 - 1;
        r8 = r9.a | 512;
        r9.a = r8;
        r10 = r7.b.q;
        r9.a = r8 | 65536;
        r9.u = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0220, code lost:
        r9 = r9 | com.google.android.chimera.FragmentTransaction.TRANSIT_ENTER_MASK;
        r8.a = r9;
        r8.p = true;
        r9 = r9 | com.google.android.chimera.FragmentTransaction.TRANSIT_EXIT_MASK;
        r8.a = r9;
        r8.q = true;
        r9 = r9 | 4;
        r8.a = r9;
        r8.g = 0;
        r8.a = r9 | 1024;
        r8.n = false;
        r9 = defpackage.plc.a(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0241, code lost:
        if (r6.c != false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0244, code lost:
        r6.c();
        r6.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x024a, code lost:
        r8 = (defpackage.oul) r6.b;
        r8.j = r9 - 1;
        r8.a |= 64;
        r10 = defpackage.plc.a(0, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x025f, code lost:
        if (r6.c != false) goto L_0x0262;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0262, code lost:
        r6.c();
        r6.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0268, code lost:
        r8 = (defpackage.oul) r6.b;
        r8.m = r10 - 1;
        r9 = r8.a | 512;
        r8.a = r9;
        r8.a = r9 | 65536;
        r8.u = Integer.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x027d, code lost:
        r8 = (defpackage.oul) r6.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0283, code lost:
        if (r8.p == false) goto L_0x0286;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0288, code lost:
        if (r8.q == false) goto L_0x028f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x028a, code lost:
        defpackage.oso.d("prefixMatchAllTokens has no effect when prefixMatch is false.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x028f, code lost:
        r8 = new java.util.ArrayList();
        r9 = r7.a;
        r10 = r9.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0297, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0298, code lost:
        if (r15 >= r10) goto L_0x0498;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r11 = r9[r15];
        r13 = r7.b;
        r14 = r7.d;
        r24 = r9;
        r9 = r7.c;
        r26 = r10;
        r10 = defpackage.ouc.g.o();
        r25 = r7;
        r7 = r11.a.b;
        r27 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02b6, code lost:
        if (r10.c != false) goto L_0x02b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02b9, code lost:
        r10.c();
        r10.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02bf, code lost:
        r3 = (defpackage.ouc) r10.b;
        r28 = r4;
        r3.a |= 1;
        r3.b = r7;
        r3 = r11.a.k;
        r4 = (defpackage.ouc) r10.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02dd, code lost:
        if (r4.d.a() != false) goto L_0x02e7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        /*
            r40 = this;
            r1 = r40
            java.lang.Object r2 = r1.n
            com.google.android.gms.search.queries.GlobalQueryCall$Request r2 = (com.google.android.gms.search.queries.GlobalQueryCall$Request) r2
            com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification r2 = r2.d
            boolean r3 = defpackage.axrm.b()
            if (r3 != 0) goto L_0x000f
            goto L_0x001a
        L_0x000f:
            psc r3 = r1.k
            if (r3 == 0) goto L_0x001a
            if (r2 == 0) goto L_0x001a
            byte[] r2 = r2.n
            r3.a(r2)
        L_0x001a:
            java.lang.Object r2 = r1.n
            com.google.android.gms.search.queries.GlobalQueryCall$Request r2 = (com.google.android.gms.search.queries.GlobalQueryCall$Request) r2
            java.lang.String r3 = r2.a
            int r4 = r2.b
            int r5 = r2.c
            com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification r2 = r2.d
            java.lang.String r6 = defpackage.osn.a(r3, r4, r5, r2)
            r7 = 8
            if (r6 == 0) goto L_0x0034
            com.google.android.gms.search.queries.GlobalQueryCall$Response r2 = a(r7, r6)
            goto L_0x0ca0
        L_0x0034:
            pxp r6 = r1.b
            r6.b()
            if (r2 == 0) goto L_0x0040
            java.lang.String r6 = "GlobalSearchQuerySpec: %s"
            defpackage.oso.a((java.lang.String) r6, (java.lang.Object) r2)
        L_0x0040:
            r6 = 3
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r10 = 0
            r8[r10] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r11 = 1
            r8[r11] = r9
            if (r2 == 0) goto L_0x0056
            int r12 = r2.q
            goto L_0x0059
        L_0x0056:
            r12 = 2147483647(0x7fffffff, float:NaN)
        L_0x0059:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13 = 2
            r8[r13] = r12
            java.lang.String r12 = "Query global start %d num %d maxNumSlices %d"
            defpackage.oso.d((java.lang.String) r12, (java.lang.Object[]) r8)
            java.lang.String r8 = "Query global: [%s]"
            defpackage.oso.a((java.lang.String) r8, (java.lang.Object) r3)
            osf r8 = r1.a
            com.google.android.gms.icing.nativeindex.NativeIndex r8 = r8.n
            int r8 = r8.e()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            osf r12 = r1.a
            com.google.android.gms.icing.nativeindex.NativeIndex r12 = r12.n
            int r12 = r12.f()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r14 = "Index docs: %d pls: %d"
            defpackage.oso.a((java.lang.String) r14, (java.lang.Object) r8, (java.lang.Object) r12)
            pxp r8 = r1.b
            r8.c()
            osf r8 = r1.a
            ozs r8 = r8.a()
            java.lang.Object r8 = r8.a()
            monitor-enter(r8)
            pxp r12 = r1.b     // Catch:{ all -> 0x0cb4 }
            r12.d()     // Catch:{ all -> 0x0cb4 }
            osf r12 = r1.a     // Catch:{ all -> 0x0cb4 }
            ozc r14 = r1.o     // Catch:{ all -> 0x0cb4 }
            java.util.List r12 = r12.a((defpackage.ozc) r14, (com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification) r2, (boolean) r10)     // Catch:{ all -> 0x0cb4 }
            java.lang.String r14 = "com.google.android.googlequicksearchbox"
            ozc r15 = r1.o     // Catch:{ all -> 0x0cb4 }
            java.lang.String r15 = r15.f     // Catch:{ all -> 0x0cb4 }
            boolean r14 = r14.equals(r15)     // Catch:{ all -> 0x0cb4 }
            if (r14 != 0) goto L_0x00b1
            goto L_0x0104
        L_0x00b1:
            osf r14 = r1.a     // Catch:{ all -> 0x0cb4 }
            ozb r14 = r14.m     // Catch:{ all -> 0x0cb4 }
            int r14 = r14.c()     // Catch:{ all -> 0x0cb4 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x0cb4 }
            r15.<init>()     // Catch:{ all -> 0x0cb4 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x0cb4 }
        L_0x00c2:
            boolean r16 = r12.hasNext()     // Catch:{ all -> 0x0cb4 }
            if (r16 == 0) goto L_0x0103
            java.lang.Object r16 = r12.next()     // Catch:{ all -> 0x00fd }
            r6 = r16
            osz r6 = (defpackage.osz) r6     // Catch:{ all -> 0x00fd }
            agvx r16 = defpackage.ozx.ae     // Catch:{ all -> 0x00fd }
            java.lang.Object r16 = r16.c()     // Catch:{ all -> 0x00fd }
            java.lang.Integer r16 = (java.lang.Integer) r16     // Catch:{ all -> 0x00fd }
            int r9 = r16.intValue()     // Catch:{ all -> 0x00fd }
            if (r14 < r9) goto L_0x00df
            goto L_0x00f7
        L_0x00df:
            boolean r9 = defpackage.ozq.e((defpackage.osz) r6)     // Catch:{ all -> 0x00fd }
            if (r9 == 0) goto L_0x00f7
            java.lang.String r6 = "removeCorporaIfAgsa gsaVersion:%d minVersion:%d"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x00fd }
            agvx r16 = defpackage.ozx.ae     // Catch:{ all -> 0x00fd }
            java.lang.Object r13 = r16.c()     // Catch:{ all -> 0x00fd }
            defpackage.oso.a((java.lang.String) r6, (java.lang.Object) r9, (java.lang.Object) r13)     // Catch:{ all -> 0x00fd }
            r6 = 3
            r13 = 2
            goto L_0x00c2
        L_0x00f7:
            r15.add(r6)     // Catch:{ all -> 0x00fd }
            r6 = 3
            r13 = 2
            goto L_0x00c2
        L_0x00fd:
            r0 = move-exception
            r2 = r0
            r16 = r8
            goto L_0x0cb8
        L_0x0103:
            r12 = r15
        L_0x0104:
            osf r6 = r1.a     // Catch:{ all -> 0x0cb4 }
            prp r6 = r6.g     // Catch:{ all -> 0x0cb4 }
            java.lang.Object r9 = r6.g     // Catch:{ all -> 0x0cb4 }
            monitor-enter(r9)     // Catch:{ all -> 0x0cb4 }
            android.content.SharedPreferences r13 = r6.b     // Catch:{ all -> 0x0cae }
            java.lang.String r14 = "app-params-last-update"
            r16 = r8
            r7 = 0
            long r7 = r13.getLong(r14, r7)     // Catch:{ all -> 0x0cac }
            android.content.SharedPreferences r13 = r6.b     // Catch:{ all -> 0x0cac }
            java.lang.String r14 = "app-params-last-update-sched"
            boolean r13 = r13.contains(r14)     // Catch:{ all -> 0x0cac }
            if (r13 != 0) goto L_0x0135
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0cac }
            int r6 = r6.f     // Catch:{ all -> 0x0cac }
            long r10 = (long) r6     // Catch:{ all -> 0x0cac }
            long r10 = r13.toMillis(r10)     // Catch:{ all -> 0x0cac }
            long r7 = r7 + r10
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cac }
            int r6 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r6 >= 0) goto L_0x0135
            r6 = 1
            goto L_0x0136
        L_0x0135:
            r6 = 0
        L_0x0136:
            monitor-exit(r9)     // Catch:{ all -> 0x0cac }
            if (r6 != 0) goto L_0x013a
            goto L_0x017d
        L_0x013a:
            osf r6 = r1.a     // Catch:{ all -> 0x0cba }
            prp r6 = r6.g     // Catch:{ all -> 0x0cba }
            java.lang.Object r7 = r6.g     // Catch:{ all -> 0x0cba }
            monitor-enter(r7)     // Catch:{ all -> 0x0cba }
            android.content.SharedPreferences r6 = r6.b     // Catch:{ all -> 0x0ca8 }
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch:{ all -> 0x0ca8 }
            java.lang.String r8 = "app-params-last-update-sched"
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0ca8 }
            android.content.SharedPreferences$Editor r6 = r6.putLong(r8, r9)     // Catch:{ all -> 0x0ca8 }
            r6.apply()     // Catch:{ all -> 0x0ca8 }
            monitor-exit(r7)     // Catch:{ all -> 0x0ca8 }
            osf r6 = r1.a     // Catch:{ all -> 0x0cba }
            ppp r7 = r6.c     // Catch:{ all -> 0x0cba }
            aamd r8 = new aamd     // Catch:{ all -> 0x0cba }
            android.content.Context r9 = r6.b     // Catch:{ all -> 0x0cba }
            prp r10 = r6.g     // Catch:{ all -> 0x0cba }
            ozs r22 = r6.a()     // Catch:{ all -> 0x0cba }
            osf r6 = r1.a     // Catch:{ all -> 0x0cba }
            ozb r11 = r6.m     // Catch:{ all -> 0x0cba }
            pas r13 = r6.t     // Catch:{ all -> 0x0cba }
            pqf r6 = r6.e     // Catch:{ all -> 0x0cba }
            r19 = r8
            r20 = r9
            r21 = r10
            r23 = r11
            r24 = r13
            r25 = r6
            r19.<init>(r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0cba }
            r7.d(r8)     // Catch:{ all -> 0x0cba }
        L_0x017d:
            osf r6 = r1.a     // Catch:{ all -> 0x0cba }
            prp r6 = r6.g     // Catch:{ all -> 0x0cba }
            pro r6 = r6.d()     // Catch:{ all -> 0x0cba }
            pbh r7 = new pbh     // Catch:{ all -> 0x0cba }
            r7.<init>(r12, r2, r6)     // Catch:{ all -> 0x0cba }
            oul r6 = defpackage.oul.v     // Catch:{ all -> 0x0cba }
            aucd r6 = r6.o()     // Catch:{ all -> 0x0cba }
            boolean r8 = r6.c     // Catch:{ all -> 0x0cba }
            if (r8 != 0) goto L_0x0195
            goto L_0x019b
        L_0x0195:
            r6.c()     // Catch:{ all -> 0x0cba }
            r8 = 0
            r6.c = r8     // Catch:{ all -> 0x0cba }
        L_0x019b:
            aucj r8 = r6.b     // Catch:{ all -> 0x0cba }
            oul r8 = (defpackage.oul) r8     // Catch:{ all -> 0x0cba }
            int r9 = r8.a     // Catch:{ all -> 0x0cba }
            r10 = 8
            r9 = r9 | r10
            r8.a = r9     // Catch:{ all -> 0x0cba }
            r10 = 1
            r8.h = r10     // Catch:{ all -> 0x0cba }
            r11 = 2
            r9 = r9 | r11
            r8.a = r9     // Catch:{ all -> 0x0cba }
            r8.f = r10     // Catch:{ all -> 0x0cba }
            com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification r10 = r7.b     // Catch:{ all -> 0x0cba }
            r11 = 65536(0x10000, float:9.18355E-41)
            r13 = -1
            if (r10 == 0) goto L_0x0220
            boolean r15 = r10.j     // Catch:{ all -> 0x0cba }
            r9 = r9 | 4096(0x1000, float:5.74E-42)
            r8.a = r9     // Catch:{ all -> 0x0cba }
            r8.p = r15     // Catch:{ all -> 0x0cba }
            boolean r15 = r10.k     // Catch:{ all -> 0x0cba }
            r9 = r9 | 8192(0x2000, float:1.14794E-41)
            r8.a = r9     // Catch:{ all -> 0x0cba }
            r8.q = r15     // Catch:{ all -> 0x0cba }
            int r15 = r10.b     // Catch:{ all -> 0x0cba }
            r9 = r9 | 4
            r8.a = r9     // Catch:{ all -> 0x0cba }
            r8.g = r15     // Catch:{ all -> 0x0cba }
            boolean r15 = r10.h     // Catch:{ all -> 0x0cba }
            r9 = r9 | 1024(0x400, float:1.435E-42)
            r8.a = r9     // Catch:{ all -> 0x0cba }
            r8.n = r15     // Catch:{ all -> 0x0cba }
            int r8 = r10.e     // Catch:{ all -> 0x0cba }
            int r8 = defpackage.plc.a((int) r8)     // Catch:{ all -> 0x0cba }
            boolean r9 = r6.c     // Catch:{ all -> 0x0cba }
            if (r9 != 0) goto L_0x01e1
            goto L_0x01e7
        L_0x01e1:
            r6.c()     // Catch:{ all -> 0x0cba }
            r9 = 0
            r6.c = r9     // Catch:{ all -> 0x0cba }
        L_0x01e7:
            aucj r9 = r6.b     // Catch:{ all -> 0x0cba }
            oul r9 = (defpackage.oul) r9     // Catch:{ all -> 0x0cba }
            int r8 = r8 + r13
            r9.j = r8     // Catch:{ all -> 0x0cba }
            int r8 = r9.a     // Catch:{ all -> 0x0cba }
            r8 = r8 | 64
            r9.a = r8     // Catch:{ all -> 0x0cba }
            com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification r8 = r7.b     // Catch:{ all -> 0x0cba }
            int r9 = r8.f     // Catch:{ all -> 0x0cba }
            int r8 = r8.e     // Catch:{ all -> 0x0cba }
            int r8 = defpackage.plc.a((int) r9, (int) r8)     // Catch:{ all -> 0x0cba }
            boolean r9 = r6.c     // Catch:{ all -> 0x0cba }
            if (r9 != 0) goto L_0x0203
            goto L_0x0209
        L_0x0203:
            r6.c()     // Catch:{ all -> 0x0cba }
            r9 = 0
            r6.c = r9     // Catch:{ all -> 0x0cba }
        L_0x0209:
            aucj r9 = r6.b     // Catch:{ all -> 0x0cba }
            oul r9 = (defpackage.oul) r9     // Catch:{ all -> 0x0cba }
            int r8 = r8 + r13
            r9.m = r8     // Catch:{ all -> 0x0cba }
            int r8 = r9.a     // Catch:{ all -> 0x0cba }
            r8 = r8 | 512(0x200, float:7.175E-43)
            r9.a = r8     // Catch:{ all -> 0x0cba }
            com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification r10 = r7.b     // Catch:{ all -> 0x0cba }
            int r10 = r10.q     // Catch:{ all -> 0x0cba }
            r8 = r8 | r11
            r9.a = r8     // Catch:{ all -> 0x0cba }
            r9.u = r10     // Catch:{ all -> 0x0cba }
            goto L_0x027d
        L_0x0220:
            r9 = r9 | 4096(0x1000, float:5.74E-42)
            r8.a = r9     // Catch:{ all -> 0x0cba }
            r10 = 1
            r8.p = r10     // Catch:{ all -> 0x0cba }
            r9 = r9 | 8192(0x2000, float:1.14794E-41)
            r8.a = r9     // Catch:{ all -> 0x0cba }
            r8.q = r10     // Catch:{ all -> 0x0cba }
            r9 = r9 | 4
            r8.a = r9     // Catch:{ all -> 0x0cba }
            r10 = 0
            r8.g = r10     // Catch:{ all -> 0x0cba }
            r9 = r9 | 1024(0x400, float:1.435E-42)
            r8.a = r9     // Catch:{ all -> 0x0cba }
            r8.n = r10     // Catch:{ all -> 0x0cba }
            r8 = 1
            int r9 = defpackage.plc.a((int) r8)     // Catch:{ all -> 0x0cba }
            boolean r8 = r6.c     // Catch:{ all -> 0x0cba }
            if (r8 != 0) goto L_0x0244
            goto L_0x024a
        L_0x0244:
            r6.c()     // Catch:{ all -> 0x0cba }
            r8 = 0
            r6.c = r8     // Catch:{ all -> 0x0cba }
        L_0x024a:
            aucj r8 = r6.b     // Catch:{ all -> 0x0cba }
            oul r8 = (defpackage.oul) r8     // Catch:{ all -> 0x0cba }
            int r9 = r9 + r13
            r8.j = r9     // Catch:{ all -> 0x0cba }
            int r9 = r8.a     // Catch:{ all -> 0x0cba }
            r9 = r9 | 64
            r8.a = r9     // Catch:{ all -> 0x0cba }
            r8 = 1
            r9 = 0
            int r10 = defpackage.plc.a((int) r9, (int) r8)     // Catch:{ all -> 0x0cba }
            boolean r8 = r6.c     // Catch:{ all -> 0x0cba }
            if (r8 != 0) goto L_0x0262
            goto L_0x0268
        L_0x0262:
            r6.c()     // Catch:{ all -> 0x0cba }
            r8 = 0
            r6.c = r8     // Catch:{ all -> 0x0cba }
        L_0x0268:
            aucj r8 = r6.b     // Catch:{ all -> 0x0cba }
            oul r8 = (defpackage.oul) r8     // Catch:{ all -> 0x0cba }
            int r10 = r10 + r13
            r8.m = r10     // Catch:{ all -> 0x0cba }
            int r9 = r8.a     // Catch:{ all -> 0x0cba }
            r9 = r9 | 512(0x200, float:7.175E-43)
            r8.a = r9     // Catch:{ all -> 0x0cba }
            r9 = r9 | r11
            r8.a = r9     // Catch:{ all -> 0x0cba }
            r9 = 2147483647(0x7fffffff, float:NaN)
            r8.u = r9     // Catch:{ all -> 0x0cba }
        L_0x027d:
            aucj r8 = r6.b     // Catch:{ all -> 0x0cba }
            oul r8 = (defpackage.oul) r8     // Catch:{ all -> 0x0cba }
            boolean r9 = r8.p     // Catch:{ all -> 0x0cba }
            if (r9 == 0) goto L_0x0286
            goto L_0x028f
        L_0x0286:
            boolean r8 = r8.q     // Catch:{ all -> 0x0cba }
            if (r8 == 0) goto L_0x028f
            java.lang.String r8 = "prefixMatchAllTokens has no effect when prefixMatch is false."
            defpackage.oso.d(r8)     // Catch:{ all -> 0x0cba }
        L_0x028f:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0cba }
            r8.<init>()     // Catch:{ all -> 0x0cba }
            pbg[] r9 = r7.a     // Catch:{ all -> 0x0cba }
            int r10 = r9.length     // Catch:{ all -> 0x0cba }
            r15 = 0
        L_0x0298:
            if (r15 >= r10) goto L_0x0498
            r11 = r9[r15]     // Catch:{ all -> 0x0ca4 }
            com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification r13 = r7.b     // Catch:{ all -> 0x0ca4 }
            int r14 = r7.d     // Catch:{ all -> 0x0ca4 }
            r24 = r9
            pro r9 = r7.c     // Catch:{ all -> 0x0ca4 }
            ouc r25 = defpackage.ouc.g     // Catch:{ all -> 0x0ca4 }
            r26 = r10
            aucd r10 = r25.o()     // Catch:{ all -> 0x0ca4 }
            r25 = r7
            osz r7 = r11.a     // Catch:{ all -> 0x0ca4 }
            int r7 = r7.b     // Catch:{ all -> 0x0ca4 }
            r27 = r3
            boolean r3 = r10.c     // Catch:{ all -> 0x0ca4 }
            if (r3 != 0) goto L_0x02b9
            goto L_0x02bf
        L_0x02b9:
            r10.c()     // Catch:{ all -> 0x0ca4 }
            r3 = 0
            r10.c = r3     // Catch:{ all -> 0x0ca4 }
        L_0x02bf:
            aucj r3 = r10.b     // Catch:{ all -> 0x0ca4 }
            ouc r3 = (defpackage.ouc) r3     // Catch:{ all -> 0x0ca4 }
            r28 = r4
            int r4 = r3.a     // Catch:{ all -> 0x0ca4 }
            r18 = 1
            r4 = r4 | 1
            r3.a = r4     // Catch:{ all -> 0x0ca4 }
            r3.b = r7     // Catch:{ all -> 0x0ca4 }
            osz r3 = r11.a     // Catch:{ all -> 0x0ca4 }
            aucx r3 = r3.k     // Catch:{ all -> 0x0ca4 }
            aucj r4 = r10.b     // Catch:{ all -> 0x0ca4 }
            ouc r4 = (defpackage.ouc) r4     // Catch:{ all -> 0x0ca4 }
            aucx r7 = r4.d     // Catch:{ all -> 0x0ca4 }
            boolean r7 = r7.a()     // Catch:{ all -> 0x0ca4 }
            if (r7 != 0) goto L_0x02e7
            aucx r7 = r4.d     // Catch:{ all -> 0x0cba }
            aucx r7 = defpackage.aucj.a((defpackage.aucx) r7)     // Catch:{ all -> 0x0cba }
            r4.d = r7     // Catch:{ all -> 0x0cba }
        L_0x02e7:
            aucx r4 = r4.d     // Catch:{ all -> 0x0ca4 }
            defpackage.auab.a((java.lang.Iterable) r3, (java.util.List) r4)     // Catch:{ all -> 0x0ca4 }
            if (r13 != 0) goto L_0x02f4
            r32 = r2
            r31 = r5
            goto L_0x03d4
        L_0x02f4:
            osz r7 = r11.a     // Catch:{ all -> 0x0ca4 }
            java.lang.String r3 = r7.e     // Catch:{ all -> 0x0ca4 }
            java.lang.String r4 = r7.c     // Catch:{ all -> 0x0ca4 }
            com.google.android.gms.appdatasearch.CorpusScoringInfo r3 = r13.a(r3, r4)     // Catch:{ all -> 0x0ca4 }
            if (r3 != 0) goto L_0x0303
            r31 = r5
            goto L_0x0325
        L_0x0303:
            boolean r4 = r13.h     // Catch:{ all -> 0x0ca4 }
            if (r4 == 0) goto L_0x0323
            int r4 = r3.c     // Catch:{ all -> 0x0cba }
            boolean r7 = r10.c     // Catch:{ all -> 0x0cba }
            if (r7 != 0) goto L_0x030e
            goto L_0x0314
        L_0x030e:
            r10.c()     // Catch:{ all -> 0x0cba }
            r7 = 0
            r10.c = r7     // Catch:{ all -> 0x0cba }
        L_0x0314:
            aucj r7 = r10.b     // Catch:{ all -> 0x0cba }
            ouc r7 = (defpackage.ouc) r7     // Catch:{ all -> 0x0cba }
            r31 = r5
            int r5 = r7.a     // Catch:{ all -> 0x0cba }
            r5 = r5 | 4
            r7.a = r5     // Catch:{ all -> 0x0cba }
            r7.f = r4     // Catch:{ all -> 0x0cba }
            goto L_0x0325
        L_0x0323:
            r31 = r5
        L_0x0325:
            double r4 = (double) r14
            java.lang.Double.isNaN(r4)
            r29 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r29 / r4
            boolean r7 = r10.c     // Catch:{ all -> 0x0ca4 }
            if (r7 != 0) goto L_0x0332
            goto L_0x0338
        L_0x0332:
            r10.c()     // Catch:{ all -> 0x0ca4 }
            r7 = 0
            r10.c = r7     // Catch:{ all -> 0x0ca4 }
        L_0x0338:
            aucj r14 = r10.b     // Catch:{ all -> 0x0ca4 }
            ouc r14 = (defpackage.ouc) r14     // Catch:{ all -> 0x0ca4 }
            int r7 = r14.a     // Catch:{ all -> 0x0ca4 }
            r17 = 2
            r7 = r7 | 2
            r14.a = r7     // Catch:{ all -> 0x0ca4 }
            r14.e = r4     // Catch:{ all -> 0x0ca4 }
            if (r3 != 0) goto L_0x034b
            r32 = r2
            goto L_0x035b
        L_0x034b:
            int r3 = r3.b     // Catch:{ all -> 0x0ca4 }
            r32 = r2
            double r1 = (double) r3
            java.lang.Double.isNaN(r1)
            double r4 = r4 * r1
            r1 = r7 | 2
            r14.a = r1     // Catch:{ all -> 0x0ca4 }
            r14.e = r4     // Catch:{ all -> 0x0ca4 }
        L_0x035b:
            agvx r1 = defpackage.ozx.P     // Catch:{ all -> 0x0ca4 }
            java.lang.Object r1 = r1.c()     // Catch:{ all -> 0x0ca4 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0ca4 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0ca4 }
            if (r1 == 0) goto L_0x03d4
            int[] r1 = r13.m     // Catch:{ all -> 0x0ca4 }
            if (r1 == 0) goto L_0x03d4
            int r1 = r1.length     // Catch:{ all -> 0x0ca4 }
            if (r1 <= 0) goto L_0x03d4
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0ca4 }
            r1.<init>()     // Catch:{ all -> 0x0ca4 }
            osz r2 = r11.a     // Catch:{ all -> 0x0ca4 }
            java.util.Map r2 = defpackage.ozq.b((defpackage.osz) r2)     // Catch:{ all -> 0x0ca4 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x0ca4 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0ca4 }
        L_0x0383:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0ca4 }
            if (r3 == 0) goto L_0x03d1
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0ca4 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0ca4 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0ca4 }
            ozm r3 = (defpackage.ozm) r3     // Catch:{ all -> 0x0ca4 }
            oqy r4 = r3.b     // Catch:{ all -> 0x0ca4 }
            aucu r5 = new aucu     // Catch:{ all -> 0x0ca4 }
            aucs r4 = r4.h     // Catch:{ all -> 0x0ca4 }
            auct r7 = defpackage.oqy.i     // Catch:{ all -> 0x0ca4 }
            r5.<init>(r4, r7)     // Catch:{ all -> 0x0ca4 }
            oqx r4 = defpackage.oqx.VARIANT_ANNOTATION     // Catch:{ all -> 0x0ca4 }
            boolean r4 = r5.contains(r4)     // Catch:{ all -> 0x0ca4 }
            if (r4 == 0) goto L_0x0383
            ouj r4 = defpackage.ouj.e     // Catch:{ all -> 0x0ca4 }
            aucd r4 = r4.o()     // Catch:{ all -> 0x0ca4 }
            int r3 = r3.a     // Catch:{ all -> 0x0ca4 }
            boolean r5 = r4.c     // Catch:{ all -> 0x0ca4 }
            if (r5 != 0) goto L_0x03b5
            goto L_0x03bb
        L_0x03b5:
            r4.c()     // Catch:{ all -> 0x0ca4 }
            r5 = 0
            r4.c = r5     // Catch:{ all -> 0x0ca4 }
        L_0x03bb:
            aucj r7 = r4.b     // Catch:{ all -> 0x0ca4 }
            ouj r7 = (defpackage.ouj) r7     // Catch:{ all -> 0x0ca4 }
            int r13 = r7.a     // Catch:{ all -> 0x0ca4 }
            r14 = 1
            r13 = r13 | r14
            r7.a = r13     // Catch:{ all -> 0x0ca4 }
            r7.b = r3     // Catch:{ all -> 0x0ca4 }
            aucj r3 = r4.i()     // Catch:{ all -> 0x0ca4 }
            ouj r3 = (defpackage.ouj) r3     // Catch:{ all -> 0x0ca4 }
            r1.add(r3)     // Catch:{ all -> 0x0ca4 }
            goto L_0x0383
        L_0x03d1:
            r10.Q(r1)     // Catch:{ all -> 0x0ca4 }
        L_0x03d4:
            osz r1 = r11.a     // Catch:{ all -> 0x0ca4 }
            java.lang.String r1 = r1.e     // Catch:{ all -> 0x0ca4 }
            prp r2 = r9.a     // Catch:{ all -> 0x0ca4 }
            java.lang.Object r2 = r2.g     // Catch:{ all -> 0x0ca4 }
            monitor-enter(r2)     // Catch:{ all -> 0x0ca4 }
            boolean r3 = defpackage.axsj.e()     // Catch:{ all -> 0x0494 }
            if (r3 == 0) goto L_0x03fe
            prp r3 = r9.a     // Catch:{ all -> 0x0494 }
            java.util.Map r3 = r3.e     // Catch:{ all -> 0x0494 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0494 }
            if (r3 == 0) goto L_0x03fe
            prp r3 = r9.a     // Catch:{ all -> 0x0494 }
            android.content.Context r3 = r3.a     // Catch:{ all -> 0x0494 }
            boolean r1 = defpackage.prp.b(r3, r1)     // Catch:{ all -> 0x0494 }
            if (r1 != 0) goto L_0x03fa
            r3 = 0
            goto L_0x03fc
        L_0x03fa:
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x03fc:
            monitor-exit(r2)     // Catch:{ all -> 0x0494 }
            goto L_0x0410
        L_0x03fe:
            prp r3 = r9.a     // Catch:{ all -> 0x0494 }
            java.util.Map r3 = r3.e     // Catch:{ all -> 0x0494 }
            java.lang.Object r1 = r3.get(r1)     // Catch:{ all -> 0x0494 }
            pqq r1 = (defpackage.pqq) r1     // Catch:{ all -> 0x0494 }
            if (r1 == 0) goto L_0x040d
            double r3 = r1.e     // Catch:{ all -> 0x0494 }
            goto L_0x040f
        L_0x040d:
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x040f:
            monitor-exit(r2)     // Catch:{ all -> 0x0494 }
        L_0x0410:
            r1 = 0
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 > 0) goto L_0x0417
            goto L_0x0449
        L_0x0417:
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 >= 0) goto L_0x0449
            aucj r1 = r10.b     // Catch:{ all -> 0x0ca4 }
            ouc r1 = (defpackage.ouc) r1     // Catch:{ all -> 0x0ca4 }
            double r1 = r1.e     // Catch:{ all -> 0x0ca4 }
            double r1 = r1 * r3
            boolean r7 = r10.c     // Catch:{ all -> 0x0ca4 }
            if (r7 != 0) goto L_0x042a
            goto L_0x0430
        L_0x042a:
            r10.c()     // Catch:{ all -> 0x0ca4 }
            r5 = 0
            r10.c = r5     // Catch:{ all -> 0x0ca4 }
        L_0x0430:
            aucj r5 = r10.b     // Catch:{ all -> 0x0ca4 }
            ouc r5 = (defpackage.ouc) r5     // Catch:{ all -> 0x0ca4 }
            int r7 = r5.a     // Catch:{ all -> 0x0ca4 }
            r9 = 2
            r7 = r7 | r9
            r5.a = r7     // Catch:{ all -> 0x0ca4 }
            r5.e = r1     // Catch:{ all -> 0x0ca4 }
            java.lang.String r1 = "Demoted %s by %s"
            osz r2 = r11.a     // Catch:{ all -> 0x0ca4 }
            java.lang.String r2 = r2.e     // Catch:{ all -> 0x0ca4 }
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch:{ all -> 0x0ca4 }
            defpackage.oso.d(r1, r2, r3)     // Catch:{ all -> 0x0ca4 }
        L_0x0449:
            aucj r1 = r10.i()     // Catch:{ all -> 0x0ca4 }
            ouc r1 = (defpackage.ouc) r1     // Catch:{ all -> 0x0ca4 }
            r6.a((defpackage.ouc) r1)     // Catch:{ all -> 0x0ca4 }
            osz r1 = r11.a     // Catch:{ all -> 0x0ca4 }
            aucx r1 = r1.j     // Catch:{ all -> 0x0ca4 }
            int r1 = defpackage.pxr.a(r1)     // Catch:{ all -> 0x0ca4 }
            r2 = 0
        L_0x045b:
            osz r3 = r11.a     // Catch:{ all -> 0x0ca4 }
            aucx r3 = r3.j     // Catch:{ all -> 0x0ca4 }
            int r3 = r3.size()     // Catch:{ all -> 0x0ca4 }
            if (r2 >= r3) goto L_0x047d
            osz r3 = r11.a     // Catch:{ all -> 0x0ca4 }
            aucx r4 = r3.j     // Catch:{ all -> 0x0ca4 }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ all -> 0x0ca4 }
            oqy r4 = (defpackage.oqy) r4     // Catch:{ all -> 0x0ca4 }
            r5 = 0
            ouk r3 = defpackage.pxr.a(r3, r2, r4, r1, r5)     // Catch:{ all -> 0x0ca4 }
            if (r3 != 0) goto L_0x0477
            goto L_0x047a
        L_0x0477:
            r8.add(r3)     // Catch:{ all -> 0x0ca4 }
        L_0x047a:
            int r2 = r2 + 1
            goto L_0x045b
        L_0x047d:
            int r15 = r15 + 1
            r11 = 65536(0x10000, float:9.18355E-41)
            r13 = -1
            r1 = r40
            r9 = r24
            r7 = r25
            r10 = r26
            r3 = r27
            r4 = r28
            r5 = r31
            r2 = r32
            goto L_0x0298
        L_0x0494:
            r0 = move-exception
            r1 = r0
            monitor-exit(r2)     // Catch:{ all -> 0x0494 }
            throw r1     // Catch:{ all -> 0x0ca4 }
        L_0x0498:
            r32 = r2
            r27 = r3
            r28 = r4
            r31 = r5
            r25 = r7
            r6.N(r8)     // Catch:{ all -> 0x0ca4 }
            aucj r1 = r6.i()     // Catch:{ all -> 0x0ca4 }
            oul r1 = (defpackage.oul) r1     // Catch:{ all -> 0x0ca4 }
            r2 = 5
            java.lang.Object r3 = r1.c(r2)     // Catch:{ all -> 0x0ca4 }
            aucd r3 = (defpackage.aucd) r3     // Catch:{ all -> 0x0ca4 }
            r3.a((defpackage.aucj) r1)     // Catch:{ all -> 0x0ca4 }
            aucj r1 = r3.b     // Catch:{ all -> 0x0ca4 }
            oul r1 = (defpackage.oul) r1     // Catch:{ all -> 0x0ca4 }
            int r1 = r1.g     // Catch:{ all -> 0x0ca4 }
            if (r1 <= 0) goto L_0x04e9
            java.util.Iterator r1 = r12.iterator()     // Catch:{ all -> 0x0ca4 }
        L_0x04c1:
            boolean r5 = r1.hasNext()     // Catch:{ all -> 0x0ca4 }
            if (r5 == 0) goto L_0x04e9
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x0ca4 }
            osz r5 = (defpackage.osz) r5     // Catch:{ all -> 0x0ca4 }
            r6 = 3
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0ca4 }
            java.lang.String r6 = r5.e     // Catch:{ all -> 0x0ca4 }
            r4 = 0
            r7[r4] = r6     // Catch:{ all -> 0x0ca4 }
            java.lang.String r6 = r5.c     // Catch:{ all -> 0x0ca4 }
            r8 = 1
            r7[r8] = r6     // Catch:{ all -> 0x0ca4 }
            int r5 = r5.b     // Catch:{ all -> 0x0ca4 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0ca4 }
            r6 = 2
            r7[r6] = r5     // Catch:{ all -> 0x0ca4 }
            java.lang.String r5 = "Corpus: %s:%s id %d"
            defpackage.oso.d((java.lang.String) r5, (java.lang.Object[]) r7)     // Catch:{ all -> 0x0ca4 }
            goto L_0x04c1
        L_0x04e9:
            if (r32 == 0) goto L_0x0529
            r1 = r32
            int[] r5 = r1.m     // Catch:{ all -> 0x0ca4 }
            if (r5 == 0) goto L_0x052b
            agvx r5 = defpackage.ozx.P     // Catch:{ all -> 0x0ca4 }
            java.lang.Object r5 = r5.c()     // Catch:{ all -> 0x0ca4 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0ca4 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0ca4 }
            if (r5 == 0) goto L_0x052b
            java.lang.String r5 = "Wanted annotation types [%s]"
            int[] r6 = r1.m     // Catch:{ all -> 0x0ca4 }
            java.lang.String r6 = java.util.Arrays.toString(r6)     // Catch:{ all -> 0x0ca4 }
            defpackage.oso.d((java.lang.String) r5, (java.lang.Object) r6)     // Catch:{ all -> 0x0ca4 }
            boolean r5 = r3.c     // Catch:{ all -> 0x0ca4 }
            if (r5 != 0) goto L_0x050f
            goto L_0x0515
        L_0x050f:
            r3.c()     // Catch:{ all -> 0x0ca4 }
            r4 = 0
            r3.c = r4     // Catch:{ all -> 0x0ca4 }
        L_0x0515:
            aucj r5 = r3.b     // Catch:{ all -> 0x0ca4 }
            oul r5 = (defpackage.oul) r5     // Catch:{ all -> 0x0ca4 }
            aucs r6 = defpackage.aucj.q()     // Catch:{ all -> 0x0ca4 }
            r5.r = r6     // Catch:{ all -> 0x0ca4 }
            int[] r5 = r1.m     // Catch:{ all -> 0x0ca4 }
            java.util.List r5 = defpackage.aoog.b((int[]) r5)     // Catch:{ all -> 0x0ca4 }
            r3.O(r5)     // Catch:{ all -> 0x0ca4 }
            goto L_0x052b
        L_0x0529:
            r1 = r32
        L_0x052b:
            if (r1 == 0) goto L_0x0674
            boolean r6 = r1.l     // Catch:{ all -> 0x0ca4 }
            if (r6 == 0) goto L_0x0674
            agvx r6 = defpackage.ozx.bo     // Catch:{ all -> 0x0ca4 }
            java.lang.Object r6 = r6.c()     // Catch:{ all -> 0x0ca4 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0ca4 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0ca4 }
            if (r6 == 0) goto L_0x0674
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0ca4 }
            r6.<init>()     // Catch:{ all -> 0x0ca4 }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0ca4 }
            r7.<init>()     // Catch:{ all -> 0x0ca4 }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x0ca4 }
            r8.<init>()     // Catch:{ all -> 0x0ca4 }
            java.util.Iterator r9 = r12.iterator()     // Catch:{ all -> 0x0ca4 }
        L_0x0552:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0ca4 }
            if (r10 == 0) goto L_0x05b0
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0ca4 }
            osz r10 = (defpackage.osz) r10     // Catch:{ all -> 0x0ca4 }
            java.util.Map r10 = defpackage.ozq.b((defpackage.osz) r10)     // Catch:{ all -> 0x0ca4 }
            java.util.Set r10 = r10.entrySet()     // Catch:{ all -> 0x0ca4 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0ca4 }
        L_0x056a:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x0ca4 }
            if (r11 == 0) goto L_0x0552
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x0ca4 }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ all -> 0x0ca4 }
            java.lang.Object r13 = r11.getValue()     // Catch:{ all -> 0x0ca4 }
            ozm r13 = (defpackage.ozm) r13     // Catch:{ all -> 0x0ca4 }
            java.lang.Object r11 = r11.getKey()     // Catch:{ all -> 0x0ca4 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0ca4 }
            int r13 = r13.a     // Catch:{ all -> 0x0ca4 }
            java.lang.Object r14 = r7.get(r11)     // Catch:{ all -> 0x0ca4 }
            java.util.HashSet r14 = (java.util.HashSet) r14     // Catch:{ all -> 0x0ca4 }
            if (r14 == 0) goto L_0x058d
            goto L_0x0595
        L_0x058d:
            java.util.HashSet r14 = new java.util.HashSet     // Catch:{ all -> 0x0ca4 }
            r14.<init>()     // Catch:{ all -> 0x0ca4 }
            r7.put(r11, r14)     // Catch:{ all -> 0x0ca4 }
        L_0x0595:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0ca4 }
            r14.add(r13)     // Catch:{ all -> 0x0ca4 }
            java.lang.Object r14 = r8.get(r13)     // Catch:{ all -> 0x0ca4 }
            java.util.HashSet r14 = (java.util.HashSet) r14     // Catch:{ all -> 0x0ca4 }
            if (r14 != 0) goto L_0x05ac
            java.util.HashSet r14 = new java.util.HashSet     // Catch:{ all -> 0x0ca4 }
            r14.<init>()     // Catch:{ all -> 0x0ca4 }
            r8.put(r13, r14)     // Catch:{ all -> 0x0ca4 }
        L_0x05ac:
            r14.add(r11)     // Catch:{ all -> 0x0ca4 }
            goto L_0x056a
        L_0x05b0:
            java.util.Set r7 = r7.entrySet()     // Catch:{ all -> 0x0ca4 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0ca4 }
        L_0x05b8:
            boolean r9 = r7.hasNext()     // Catch:{ all -> 0x0ca4 }
            if (r9 == 0) goto L_0x0640
            java.lang.Object r9 = r7.next()     // Catch:{ all -> 0x0ca4 }
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ all -> 0x0ca4 }
            java.lang.Object r10 = r9.getValue()     // Catch:{ all -> 0x0ca4 }
            java.util.HashSet r10 = (java.util.HashSet) r10     // Catch:{ all -> 0x0ca4 }
            int r10 = r10.size()     // Catch:{ all -> 0x0ca4 }
            r11 = 1
            if (r10 != r11) goto L_0x05b8
            java.lang.Object r10 = r9.getValue()     // Catch:{ all -> 0x0ca4 }
            java.util.HashSet r10 = (java.util.HashSet) r10     // Catch:{ all -> 0x0ca4 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0ca4 }
            java.lang.Object r10 = r10.next()     // Catch:{ all -> 0x0ca4 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x0ca4 }
            boolean r11 = r8.containsKey(r10)     // Catch:{ all -> 0x0ca4 }
            if (r11 == 0) goto L_0x05b8
            java.lang.Object r11 = r8.get(r10)     // Catch:{ all -> 0x0ca4 }
            java.util.HashSet r11 = (java.util.HashSet) r11     // Catch:{ all -> 0x0ca4 }
            int r11 = r11.size()     // Catch:{ all -> 0x0ca4 }
            r13 = 1
            if (r11 != r13) goto L_0x05b8
            oui r11 = defpackage.oui.d     // Catch:{ all -> 0x0ca4 }
            aucd r11 = r11.o()     // Catch:{ all -> 0x0ca4 }
            java.lang.Object r9 = r9.getKey()     // Catch:{ all -> 0x0ca4 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0ca4 }
            boolean r13 = r11.c     // Catch:{ all -> 0x0ca4 }
            if (r13 != 0) goto L_0x0605
            goto L_0x060b
        L_0x0605:
            r11.c()     // Catch:{ all -> 0x0ca4 }
            r4 = 0
            r11.c = r4     // Catch:{ all -> 0x0ca4 }
        L_0x060b:
            aucj r13 = r11.b     // Catch:{ all -> 0x0ca4 }
            oui r13 = (defpackage.oui) r13     // Catch:{ all -> 0x0ca4 }
            r9.getClass()     // Catch:{ all -> 0x0ca4 }
            int r14 = r13.a     // Catch:{ all -> 0x0ca4 }
            r15 = 1
            r14 = r14 | r15
            r13.a = r14     // Catch:{ all -> 0x0ca4 }
            r13.b = r9     // Catch:{ all -> 0x0ca4 }
            int r9 = r10.intValue()     // Catch:{ all -> 0x0ca4 }
            boolean r10 = r11.c     // Catch:{ all -> 0x0ca4 }
            if (r10 != 0) goto L_0x0623
            goto L_0x0629
        L_0x0623:
            r11.c()     // Catch:{ all -> 0x0ca4 }
            r4 = 0
            r11.c = r4     // Catch:{ all -> 0x0ca4 }
        L_0x0629:
            aucj r10 = r11.b     // Catch:{ all -> 0x0ca4 }
            oui r10 = (defpackage.oui) r10     // Catch:{ all -> 0x0ca4 }
            int r13 = r10.a     // Catch:{ all -> 0x0ca4 }
            r14 = 2
            r13 = r13 | r14
            r10.a = r13     // Catch:{ all -> 0x0ca4 }
            r10.c = r9     // Catch:{ all -> 0x0ca4 }
            aucj r9 = r11.i()     // Catch:{ all -> 0x0ca4 }
            oui r9 = (defpackage.oui) r9     // Catch:{ all -> 0x0ca4 }
            r6.add(r9)     // Catch:{ all -> 0x0ca4 }
            goto L_0x05b8
        L_0x0640:
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x0ca4 }
            if (r7 != 0) goto L_0x0647
            goto L_0x0648
        L_0x0647:
            r6 = 0
        L_0x0648:
            if (r6 != 0) goto L_0x065c
            java.lang.String r1 = "Tried to use section restricts in global query, but sections did not match"
            defpackage.oso.a(r1)     // Catch:{ all -> 0x0ca4 }
            r1 = 20000(0x4e20, float:2.8026E-41)
            java.lang.String r2 = "Could not merge specified corpora's section for query - corpora are incompatible."
            com.google.android.gms.search.queries.GlobalQueryCall$Response r2 = a(r1, r2)     // Catch:{ all -> 0x0ca4 }
            monitor-exit(r16)     // Catch:{ all -> 0x0ca4 }
            r1 = r40
            goto L_0x0ca0
        L_0x065c:
            boolean r7 = r3.c     // Catch:{ all -> 0x0ca4 }
            if (r7 != 0) goto L_0x0661
            goto L_0x0667
        L_0x0661:
            r3.c()     // Catch:{ all -> 0x0ca4 }
            r4 = 0
            r3.c = r4     // Catch:{ all -> 0x0ca4 }
        L_0x0667:
            aucj r7 = r3.b     // Catch:{ all -> 0x0ca4 }
            oul r7 = (defpackage.oul) r7     // Catch:{ all -> 0x0ca4 }
            aucx r8 = defpackage.aucj.s()     // Catch:{ all -> 0x0ca4 }
            r7.c = r8     // Catch:{ all -> 0x0ca4 }
            r3.M(r6)     // Catch:{ all -> 0x0ca4 }
        L_0x0674:
            if (r1 != 0) goto L_0x0679
            r6 = r40
            goto L_0x06a7
        L_0x0679:
            r6 = r40
            ozc r7 = r6.o     // Catch:{ all -> 0x0ca1 }
            boolean r7 = r7.b     // Catch:{ all -> 0x0ca1 }
            if (r7 == 0) goto L_0x0682
            goto L_0x0688
        L_0x0682:
            boolean r7 = defpackage.axsd.e()     // Catch:{ all -> 0x0ca1 }
            if (r7 == 0) goto L_0x06a7
        L_0x0688:
            int r7 = r1.d     // Catch:{ all -> 0x06a2 }
            boolean r8 = r3.c     // Catch:{ all -> 0x06a2 }
            if (r8 != 0) goto L_0x068f
            goto L_0x0695
        L_0x068f:
            r3.c()     // Catch:{ all -> 0x06a2 }
            r4 = 0
            r3.c = r4     // Catch:{ all -> 0x06a2 }
        L_0x0695:
            aucj r8 = r3.b     // Catch:{ all -> 0x06a2 }
            oul r8 = (defpackage.oul) r8     // Catch:{ all -> 0x06a2 }
            int r9 = r8.a     // Catch:{ all -> 0x06a2 }
            r9 = r9 | 32
            r8.a = r9     // Catch:{ all -> 0x06a2 }
            r8.i = r7     // Catch:{ all -> 0x06a2 }
            goto L_0x06a7
        L_0x06a2:
            r0 = move-exception
            r2 = r0
            r1 = r6
            goto L_0x0cb8
        L_0x06a7:
            ozc r7 = r6.o     // Catch:{ all -> 0x0ca1 }
            boolean r7 = r7.a()     // Catch:{ all -> 0x0ca1 }
            boolean r8 = r3.c     // Catch:{ all -> 0x0ca1 }
            if (r8 != 0) goto L_0x06b2
            goto L_0x06b8
        L_0x06b2:
            r3.c()     // Catch:{ all -> 0x0ca1 }
            r4 = 0
            r3.c = r4     // Catch:{ all -> 0x0ca1 }
        L_0x06b8:
            aucj r8 = r3.b     // Catch:{ all -> 0x0ca1 }
            oul r8 = (defpackage.oul) r8     // Catch:{ all -> 0x0ca1 }
            int r9 = r8.a     // Catch:{ all -> 0x0ca1 }
            r9 = r9 | 256(0x100, float:3.59E-43)
            r8.a = r9     // Catch:{ all -> 0x0ca1 }
            r8.l = r7     // Catch:{ all -> 0x0ca1 }
            oud r7 = defpackage.plc.a()     // Catch:{ all -> 0x0ca1 }
            boolean r8 = r3.c     // Catch:{ all -> 0x0ca1 }
            if (r8 != 0) goto L_0x06cd
            goto L_0x06d3
        L_0x06cd:
            r3.c()     // Catch:{ all -> 0x0ca1 }
            r4 = 0
            r3.c = r4     // Catch:{ all -> 0x0ca1 }
        L_0x06d3:
            aucj r8 = r3.b     // Catch:{ all -> 0x0ca1 }
            oul r8 = (defpackage.oul) r8     // Catch:{ all -> 0x0ca1 }
            r7.getClass()     // Catch:{ all -> 0x0ca1 }
            r8.o = r7     // Catch:{ all -> 0x0ca1 }
            int r7 = r8.a     // Catch:{ all -> 0x0ca1 }
            r7 = r7 | 2048(0x800, float:2.87E-42)
            r8.a = r7     // Catch:{ all -> 0x0ca1 }
            boolean r7 = defpackage.pba.d()     // Catch:{ all -> 0x0ca1 }
            if (r7 != 0) goto L_0x0703
            boolean r7 = r3.c     // Catch:{ all -> 0x06a2 }
            if (r7 != 0) goto L_0x06ed
            goto L_0x06f3
        L_0x06ed:
            r3.c()     // Catch:{ all -> 0x06a2 }
            r4 = 0
            r3.c = r4     // Catch:{ all -> 0x06a2 }
        L_0x06f3:
            aucj r7 = r3.b     // Catch:{ all -> 0x06a2 }
            oul r7 = (defpackage.oul) r7     // Catch:{ all -> 0x06a2 }
            int r8 = r7.a     // Catch:{ all -> 0x06a2 }
            r9 = 65536(0x10000, float:9.18355E-41)
            r8 = r8 | r9
            r7.a = r8     // Catch:{ all -> 0x06a2 }
            r8 = 2147483647(0x7fffffff, float:NaN)
            r7.u = r8     // Catch:{ all -> 0x06a2 }
        L_0x0703:
            if (r1 == 0) goto L_0x074b
            int r7 = r1.e     // Catch:{ all -> 0x06a2 }
            if (r7 != r2) goto L_0x074b
            com.google.android.gms.appdatasearch.STSortSpec r7 = r1.o     // Catch:{ all -> 0x06a2 }
            if (r7 == 0) goto L_0x074b
            java.lang.String r7 = r7.a     // Catch:{ all -> 0x06a2 }
            if (r7 == 0) goto L_0x074b
            ovh r8 = defpackage.ovh.b     // Catch:{ all -> 0x06a2 }
            aucd r8 = r8.o()     // Catch:{ all -> 0x06a2 }
            boolean r9 = r8.c     // Catch:{ all -> 0x06a2 }
            if (r9 != 0) goto L_0x071c
            goto L_0x0722
        L_0x071c:
            r8.c()     // Catch:{ all -> 0x06a2 }
            r4 = 0
            r8.c = r4     // Catch:{ all -> 0x06a2 }
        L_0x0722:
            aucj r9 = r8.b     // Catch:{ all -> 0x06a2 }
            ovh r9 = (defpackage.ovh) r9     // Catch:{ all -> 0x06a2 }
            r7.getClass()     // Catch:{ all -> 0x06a2 }
            r9.a = r7     // Catch:{ all -> 0x06a2 }
            aucj r7 = r8.i()     // Catch:{ all -> 0x06a2 }
            ovh r7 = (defpackage.ovh) r7     // Catch:{ all -> 0x06a2 }
            boolean r8 = r3.c     // Catch:{ all -> 0x06a2 }
            if (r8 != 0) goto L_0x0736
            goto L_0x073c
        L_0x0736:
            r3.c()     // Catch:{ all -> 0x06a2 }
            r4 = 0
            r3.c = r4     // Catch:{ all -> 0x06a2 }
        L_0x073c:
            aucj r8 = r3.b     // Catch:{ all -> 0x06a2 }
            oul r8 = (defpackage.oul) r8     // Catch:{ all -> 0x06a2 }
            r7.getClass()     // Catch:{ all -> 0x06a2 }
            r8.s = r7     // Catch:{ all -> 0x06a2 }
            int r7 = r8.a     // Catch:{ all -> 0x06a2 }
            r7 = r7 | 16384(0x4000, float:2.2959E-41)
            r8.a = r7     // Catch:{ all -> 0x06a2 }
        L_0x074b:
            boolean r7 = defpackage.pba.j()     // Catch:{ all -> 0x0ca1 }
            if (r7 != 0) goto L_0x0753
            r9 = -1
            goto L_0x07bc
        L_0x0753:
            if (r1 == 0) goto L_0x075d
            int r7 = r1.e     // Catch:{ all -> 0x06a2 }
            r8 = 1
            if (r7 != r8) goto L_0x075b
            goto L_0x075d
        L_0x075b:
            r9 = -1
            goto L_0x07bc
        L_0x075d:
            int r7 = defpackage.plc.a((int) r2)     // Catch:{ all -> 0x0ca1 }
            boolean r8 = r3.c     // Catch:{ all -> 0x0ca1 }
            if (r8 != 0) goto L_0x0766
            goto L_0x076c
        L_0x0766:
            r3.c()     // Catch:{ all -> 0x0ca1 }
            r4 = 0
            r3.c = r4     // Catch:{ all -> 0x0ca1 }
        L_0x076c:
            aucj r8 = r3.b     // Catch:{ all -> 0x0ca1 }
            oul r8 = (defpackage.oul) r8     // Catch:{ all -> 0x0ca1 }
            r9 = -1
            int r7 = r7 + r9
            r8.j = r7     // Catch:{ all -> 0x0ca1 }
            int r7 = r8.a     // Catch:{ all -> 0x0ca1 }
            r7 = r7 | 64
            r8.a = r7     // Catch:{ all -> 0x0ca1 }
            ovh r7 = defpackage.ovh.b     // Catch:{ all -> 0x0ca1 }
            aucd r7 = r7.o()     // Catch:{ all -> 0x0ca1 }
            agvx r8 = defpackage.ozx.cj     // Catch:{ all -> 0x0ca1 }
            java.lang.Object r8 = r8.c()     // Catch:{ all -> 0x0ca1 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0ca1 }
            boolean r10 = r7.c     // Catch:{ all -> 0x0ca1 }
            if (r10 != 0) goto L_0x078d
            goto L_0x0793
        L_0x078d:
            r7.c()     // Catch:{ all -> 0x0ca1 }
            r4 = 0
            r7.c = r4     // Catch:{ all -> 0x0ca1 }
        L_0x0793:
            aucj r10 = r7.b     // Catch:{ all -> 0x0ca1 }
            ovh r10 = (defpackage.ovh) r10     // Catch:{ all -> 0x0ca1 }
            r8.getClass()     // Catch:{ all -> 0x0ca1 }
            r10.a = r8     // Catch:{ all -> 0x0ca1 }
            aucj r7 = r7.i()     // Catch:{ all -> 0x0ca1 }
            ovh r7 = (defpackage.ovh) r7     // Catch:{ all -> 0x0ca1 }
            boolean r8 = r3.c     // Catch:{ all -> 0x0ca1 }
            if (r8 != 0) goto L_0x07a7
            goto L_0x07ad
        L_0x07a7:
            r3.c()     // Catch:{ all -> 0x0ca1 }
            r4 = 0
            r3.c = r4     // Catch:{ all -> 0x0ca1 }
        L_0x07ad:
            aucj r8 = r3.b     // Catch:{ all -> 0x0ca1 }
            oul r8 = (defpackage.oul) r8     // Catch:{ all -> 0x0ca1 }
            r7.getClass()     // Catch:{ all -> 0x0ca1 }
            r8.s = r7     // Catch:{ all -> 0x0ca1 }
            int r7 = r8.a     // Catch:{ all -> 0x0ca1 }
            r7 = r7 | 16384(0x4000, float:2.2959E-41)
            r8.a = r7     // Catch:{ all -> 0x0ca1 }
        L_0x07bc:
            agvx r7 = defpackage.ozx.bG     // Catch:{ all -> 0x0ca1 }
            java.lang.Object r7 = r7.c()     // Catch:{ all -> 0x0ca1 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0ca1 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0ca1 }
            if (r7 != 0) goto L_0x07cd
            r9 = r3
            goto L_0x088f
        L_0x07cd:
            agvx r7 = defpackage.ozx.bF     // Catch:{ all -> 0x0ca1 }
            java.lang.Object r7 = r7.c()     // Catch:{ all -> 0x0ca1 }
            oqc r7 = (defpackage.oqc) r7     // Catch:{ all -> 0x0ca1 }
            if (r7 == 0) goto L_0x088e
            oqb r8 = defpackage.oqb.b     // Catch:{ all -> 0x06a2 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x06a2 }
            r10.<init>()     // Catch:{ all -> 0x06a2 }
            java.util.Iterator r11 = r12.iterator()     // Catch:{ all -> 0x06a2 }
        L_0x07e2:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x06a2 }
            if (r12 == 0) goto L_0x086e
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x06a2 }
            osz r12 = (defpackage.osz) r12     // Catch:{ all -> 0x06a2 }
            java.lang.String r13 = r12.c     // Catch:{ all -> 0x06a2 }
            r13.getClass()     // Catch:{ all -> 0x06a2 }
            audr r14 = r7.a     // Catch:{ all -> 0x06a2 }
            boolean r15 = r14.containsKey(r13)     // Catch:{ all -> 0x06a2 }
            if (r15 == 0) goto L_0x0802
            java.lang.Object r13 = r14.get(r13)     // Catch:{ all -> 0x06a2 }
            oqb r13 = (defpackage.oqb) r13     // Catch:{ all -> 0x06a2 }
            goto L_0x0803
        L_0x0802:
            r13 = r8
        L_0x0803:
            java.util.HashSet r14 = new java.util.HashSet     // Catch:{ all -> 0x06a2 }
            aucx r13 = r13.a     // Catch:{ all -> 0x06a2 }
            r14.<init>(r13)     // Catch:{ all -> 0x06a2 }
            r13 = 0
        L_0x080b:
            aucx r15 = r12.j     // Catch:{ all -> 0x06a2 }
            int r15 = r15.size()     // Catch:{ all -> 0x06a2 }
            if (r13 >= r15) goto L_0x0866
            aucx r15 = r12.j     // Catch:{ all -> 0x06a2 }
            java.lang.Object r15 = r15.get(r13)     // Catch:{ all -> 0x06a2 }
            oqy r15 = (defpackage.oqy) r15     // Catch:{ all -> 0x06a2 }
            java.lang.String r15 = r15.b     // Catch:{ all -> 0x06a2 }
            boolean r15 = r14.contains(r15)     // Catch:{ all -> 0x06a2 }
            if (r15 != 0) goto L_0x0827
            r9 = r3
            r2 = 0
            goto L_0x0860
        L_0x0827:
            ouk r15 = defpackage.ouk.e     // Catch:{ all -> 0x06a2 }
            aucd r15 = r15.o()     // Catch:{ all -> 0x06a2 }
            int r4 = r12.b     // Catch:{ all -> 0x06a2 }
            boolean r5 = r15.c     // Catch:{ all -> 0x06a2 }
            if (r5 != 0) goto L_0x0834
            goto L_0x083a
        L_0x0834:
            r15.c()     // Catch:{ all -> 0x06a2 }
            r5 = 0
            r15.c = r5     // Catch:{ all -> 0x06a2 }
        L_0x083a:
            aucj r5 = r15.b     // Catch:{ all -> 0x06a2 }
            ouk r5 = (defpackage.ouk) r5     // Catch:{ all -> 0x06a2 }
            int r9 = r5.a     // Catch:{ all -> 0x06a2 }
            r18 = 1
            r9 = r9 | 1
            r5.a = r9     // Catch:{ all -> 0x06a2 }
            r5.b = r4     // Catch:{ all -> 0x06a2 }
            r4 = r9 | 2
            r5.a = r4     // Catch:{ all -> 0x06a2 }
            r5.c = r13     // Catch:{ all -> 0x06a2 }
            r4 = r4 | 4
            r5.a = r4     // Catch:{ all -> 0x06a2 }
            r9 = r3
            r2 = 0
            r5.d = r2     // Catch:{ all -> 0x06a2 }
            aucj r5 = r15.i()     // Catch:{ all -> 0x06a2 }
            ouk r5 = (defpackage.ouk) r5     // Catch:{ all -> 0x06a2 }
            r10.add(r5)     // Catch:{ all -> 0x06a2 }
        L_0x0860:
            int r13 = r13 + 1
            r3 = r9
            r2 = 5
            r9 = -1
            goto L_0x080b
        L_0x0866:
            r9 = r3
            r2 = 0
            r3 = r9
            r2 = 5
            r9 = -1
            goto L_0x07e2
        L_0x086e:
            r9 = r3
            boolean r2 = r10.isEmpty()     // Catch:{ all -> 0x06a2 }
            if (r2 != 0) goto L_0x088f
            boolean r2 = r9.c     // Catch:{ all -> 0x06a2 }
            if (r2 != 0) goto L_0x087a
            goto L_0x0880
        L_0x087a:
            r9.c()     // Catch:{ all -> 0x06a2 }
            r2 = 0
            r9.c = r2     // Catch:{ all -> 0x06a2 }
        L_0x0880:
            aucj r2 = r9.b     // Catch:{ all -> 0x06a2 }
            oul r2 = (defpackage.oul) r2     // Catch:{ all -> 0x06a2 }
            aucx r3 = defpackage.aucj.s()     // Catch:{ all -> 0x06a2 }
            r2.d = r3     // Catch:{ all -> 0x06a2 }
            r9.N(r10)     // Catch:{ all -> 0x06a2 }
            goto L_0x088f
        L_0x088e:
            r9 = r3
        L_0x088f:
            aucj r2 = r9.i()     // Catch:{ all -> 0x0ca1 }
            oul r2 = (defpackage.oul) r2     // Catch:{ all -> 0x0ca1 }
            pxp r3 = r6.b     // Catch:{ all -> 0x0ca1 }
            r3.e()     // Catch:{ all -> 0x0ca1 }
            osf r3 = r6.a     // Catch:{ all -> 0x0ca1 }
            com.google.android.gms.icing.nativeindex.NativeIndex r3 = r3.n     // Catch:{ all -> 0x0ca1 }
            r5 = r27
            r7 = r28
            r8 = r31
            oup r3 = r3.a(r5, r2, r7, r8)     // Catch:{ all -> 0x0ca1 }
            r4 = 5
            java.lang.Object r4 = r3.c(r4)     // Catch:{ all -> 0x0ca1 }
            aucd r4 = (defpackage.aucd) r4     // Catch:{ all -> 0x0ca1 }
            r4.a((defpackage.aucj) r3)     // Catch:{ all -> 0x0ca1 }
            pxp r3 = r6.b     // Catch:{ all -> 0x0ca1 }
            r3.f()     // Catch:{ all -> 0x0ca1 }
            pxp r3 = r6.b     // Catch:{ all -> 0x0ca1 }
            aucj r5 = r4.b     // Catch:{ all -> 0x0ca1 }
            oup r5 = (defpackage.oup) r5     // Catch:{ all -> 0x0ca1 }
            otv r5 = r5.l     // Catch:{ all -> 0x0ca1 }
            if (r5 == 0) goto L_0x08c2
            goto L_0x08c4
        L_0x08c2:
            otv r5 = defpackage.otv.c     // Catch:{ all -> 0x0ca1 }
        L_0x08c4:
            r3.a((defpackage.otv) r5)     // Catch:{ all -> 0x0ca1 }
            aucj r3 = r4.b     // Catch:{ all -> 0x0ca1 }
            oup r3 = (defpackage.oup) r3     // Catch:{ all -> 0x0ca1 }
            int r3 = r3.a     // Catch:{ all -> 0x0ca1 }
            r3 = r3 & 64
            if (r3 == 0) goto L_0x08d2
            goto L_0x08f0
        L_0x08d2:
            boolean r3 = r4.c     // Catch:{ all -> 0x0ca1 }
            if (r3 != 0) goto L_0x08d7
            goto L_0x08dd
        L_0x08d7:
            r4.c()     // Catch:{ all -> 0x0ca1 }
            r3 = 0
            r4.c = r3     // Catch:{ all -> 0x0ca1 }
        L_0x08dd:
            aucj r3 = r4.b     // Catch:{ all -> 0x0ca1 }
            oup r3 = (defpackage.oup) r3     // Catch:{ all -> 0x0ca1 }
            oup r5 = defpackage.oup.q     // Catch:{ all -> 0x0ca1 }
            r5 = 2
            int r7 = defpackage.aonf.a(r5)     // Catch:{ all -> 0x0ca1 }
            r3.m = r7     // Catch:{ all -> 0x0ca1 }
            int r5 = r3.a     // Catch:{ all -> 0x0ca1 }
            r5 = r5 | 64
            r3.a = r5     // Catch:{ all -> 0x0ca1 }
        L_0x08f0:
            aucj r3 = r4.i()     // Catch:{ all -> 0x0ca1 }
            oup r3 = (defpackage.oup) r3     // Catch:{ all -> 0x0ca1 }
            int r4 = r3.m     // Catch:{ all -> 0x0ca1 }
            int r4 = defpackage.aonf.b(r4)     // Catch:{ all -> 0x0ca1 }
            if (r4 != 0) goto L_0x08ff
            goto L_0x0933
        L_0x08ff:
            r5 = 2
            if (r4 == r5) goto L_0x0933
            int r4 = r3.m     // Catch:{ all -> 0x06a2 }
            int r4 = defpackage.aonf.b(r4)     // Catch:{ all -> 0x06a2 }
            if (r4 != 0) goto L_0x090b
            goto L_0x090e
        L_0x090b:
            r5 = 3
            if (r4 == r5) goto L_0x0933
        L_0x090e:
            int r1 = r3.m     // Catch:{ all -> 0x06a2 }
            int r1 = defpackage.aonf.b(r1)     // Catch:{ all -> 0x06a2 }
            if (r1 == 0) goto L_0x0917
            goto L_0x0918
        L_0x0917:
            r1 = 2
        L_0x0918:
            int r1 = defpackage.aonf.a(r1)     // Catch:{ all -> 0x06a2 }
            int r2 = r3.m     // Catch:{ all -> 0x06a2 }
            int r2 = defpackage.aonf.b(r2)     // Catch:{ all -> 0x06a2 }
            if (r2 == 0) goto L_0x0926
            r13 = r2
            goto L_0x0927
        L_0x0926:
            r13 = 2
        L_0x0927:
            java.lang.String r2 = defpackage.dtu.a((int) r13)     // Catch:{ all -> 0x06a2 }
            com.google.android.gms.search.queries.GlobalQueryCall$Response r2 = a(r1, r2)     // Catch:{ all -> 0x06a2 }
            monitor-exit(r16)     // Catch:{ all -> 0x06a2 }
            r1 = r6
            goto L_0x0ca0
        L_0x0933:
            r4 = r25
            pbg[] r5 = r4.a     // Catch:{ all -> 0x0ca1 }
            int r5 = r5.length     // Catch:{ all -> 0x0ca1 }
            java.lang.String[] r7 = new java.lang.String[r5]     // Catch:{ all -> 0x0ca1 }
            android.os.Bundle[] r9 = new android.os.Bundle[r5]     // Catch:{ all -> 0x0ca1 }
            android.os.Bundle[] r10 = new android.os.Bundle[r5]     // Catch:{ all -> 0x0ca1 }
            android.os.Bundle[] r11 = new android.os.Bundle[r5]     // Catch:{ all -> 0x0ca1 }
            android.util.SparseIntArray r12 = new android.util.SparseIntArray     // Catch:{ all -> 0x0ca1 }
            r12.<init>(r5)     // Catch:{ all -> 0x0ca1 }
            r13 = 0
            r15 = 0
        L_0x0947:
            pbg[] r14 = r4.a     // Catch:{ all -> 0x0ca1 }
            r25 = r4
            int r4 = r14.length     // Catch:{ all -> 0x0ca1 }
            if (r13 >= r4) goto L_0x0aca
            r4 = r14[r13]     // Catch:{ all -> 0x0ca4 }
            osz r14 = r4.a     // Catch:{ all -> 0x0ca4 }
            r38 = r1
            java.lang.String r1 = r14.e     // Catch:{ all -> 0x0ca4 }
            java.lang.String r14 = r14.c     // Catch:{ all -> 0x0ca4 }
            java.lang.String r21 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0ca4 }
            int r21 = r21.length()     // Catch:{ all -> 0x0ca4 }
            java.lang.String r22 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0ca4 }
            int r22 = r22.length()     // Catch:{ all -> 0x0ca4 }
            r39 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ca4 }
            r18 = 1
            int r21 = r21 + 1
            int r6 = r21 + r22
            r8.<init>(r6)     // Catch:{ all -> 0x0ca4 }
            r8.append(r1)     // Catch:{ all -> 0x0ca4 }
            java.lang.String r1 = "-"
            r8.append(r1)     // Catch:{ all -> 0x0ca4 }
            r8.append(r14)     // Catch:{ all -> 0x0ca4 }
            java.lang.String r1 = r8.toString()     // Catch:{ all -> 0x0ca4 }
            r7[r13] = r1     // Catch:{ all -> 0x0ca4 }
            aucx r1 = r3.d     // Catch:{ all -> 0x0ca4 }
            java.lang.Object r1 = r1.get(r13)     // Catch:{ all -> 0x0ca4 }
            ouo r1 = (defpackage.ouo) r1     // Catch:{ all -> 0x0ca4 }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x0ca4 }
            r6.<init>()     // Catch:{ all -> 0x0ca4 }
            android.os.Bundle r8 = new android.os.Bundle     // Catch:{ all -> 0x0ca4 }
            r8.<init>()     // Catch:{ all -> 0x0ca4 }
            r14 = 0
        L_0x0999:
            r23 = r7
            osz r7 = r4.a     // Catch:{ all -> 0x0ca4 }
            aucx r7 = r7.k     // Catch:{ all -> 0x0ca4 }
            int r7 = r7.size()     // Catch:{ all -> 0x0ca4 }
            if (r14 >= r7) goto L_0x09f0
            osz r7 = r4.a     // Catch:{ all -> 0x0ca4 }
            aucx r7 = r7.k     // Catch:{ all -> 0x0ca4 }
            java.lang.Object r7 = r7.get(r14)     // Catch:{ all -> 0x0ca4 }
            ovb r7 = (defpackage.ovb) r7     // Catch:{ all -> 0x0ca4 }
            int r7 = r7.b     // Catch:{ all -> 0x0ca4 }
            java.lang.String r7 = defpackage.dtb.a((int) r7)     // Catch:{ all -> 0x0ca4 }
            r21 = r5
            aucx r5 = r1.a     // Catch:{ all -> 0x0ca4 }
            java.lang.Object r5 = r5.get(r14)     // Catch:{ all -> 0x0ca4 }
            oum r5 = (defpackage.oum) r5     // Catch:{ all -> 0x0ca4 }
            aucs r5 = r5.a     // Catch:{ all -> 0x0ca4 }
            int r5 = r5.size()     // Catch:{ all -> 0x0ca4 }
            if (r5 == 0) goto L_0x09d8
            aucx r5 = r1.a     // Catch:{ all -> 0x0ca4 }
            java.lang.Object r5 = r5.get(r14)     // Catch:{ all -> 0x0ca4 }
            oum r5 = (defpackage.oum) r5     // Catch:{ all -> 0x0ca4 }
            aucs r5 = r5.a     // Catch:{ all -> 0x0ca4 }
            int[] r5 = defpackage.aoog.a((java.util.Collection) r5)     // Catch:{ all -> 0x0ca4 }
            r6.putIntArray(r7, r5)     // Catch:{ all -> 0x0ca4 }
        L_0x09d8:
            aucx r5 = r1.a     // Catch:{ all -> 0x0ca4 }
            java.lang.Object r5 = r5.get(r14)     // Catch:{ all -> 0x0ca4 }
            oum r5 = (defpackage.oum) r5     // Catch:{ all -> 0x0ca4 }
            auay r5 = r5.b     // Catch:{ all -> 0x0ca4 }
            byte[] r5 = r5.k()     // Catch:{ all -> 0x0ca4 }
            r8.putByteArray(r7, r5)     // Catch:{ all -> 0x0ca4 }
            int r14 = r14 + 1
            r5 = r21
            r7 = r23
            goto L_0x0999
        L_0x09f0:
            r21 = r5
            android.util.Pair r1 = android.util.Pair.create(r6, r8)     // Catch:{ all -> 0x0ca4 }
            java.lang.Object r5 = r1.first     // Catch:{ all -> 0x0ca4 }
            android.os.Bundle r5 = (android.os.Bundle) r5     // Catch:{ all -> 0x0ca4 }
            r9[r13] = r5     // Catch:{ all -> 0x0ca4 }
            java.lang.Object r1 = r1.second     // Catch:{ all -> 0x0ca4 }
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch:{ all -> 0x0ca4 }
            r10[r13] = r1     // Catch:{ all -> 0x0ca4 }
            osz r1 = r4.a     // Catch:{ all -> 0x0ca4 }
            int r1 = r1.b     // Catch:{ all -> 0x0ca4 }
            r12.put(r1, r13)     // Catch:{ all -> 0x0ca4 }
            aucx r1 = r2.b     // Catch:{ all -> 0x0ca4 }
            java.lang.Object r1 = r1.get(r13)     // Catch:{ all -> 0x0ca4 }
            ouc r1 = (defpackage.ouc) r1     // Catch:{ all -> 0x0ca4 }
            aucx r5 = r3.d     // Catch:{ all -> 0x0ca4 }
            java.lang.Object r5 = r5.get(r13)     // Catch:{ all -> 0x0ca4 }
            ouo r5 = (defpackage.ouo) r5     // Catch:{ all -> 0x0ca4 }
            aucx r6 = r1.c     // Catch:{ all -> 0x0ca4 }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x0ca4 }
            if (r6 != 0) goto L_0x0aa9
            aucx r6 = r1.d     // Catch:{ all -> 0x0ca4 }
            int r6 = r6.size()     // Catch:{ all -> 0x0ca4 }
            aucx r7 = r5.a     // Catch:{ all -> 0x0ca4 }
            int r7 = r7.size()     // Catch:{ all -> 0x0ca4 }
            aucx r8 = r1.c     // Catch:{ all -> 0x0ca4 }
            int r8 = r8.size()     // Catch:{ all -> 0x0ca4 }
            int r8 = r8 + r6
            if (r7 >= r8) goto L_0x0a63
            r7 = 3
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ all -> 0x0ca4 }
            aucx r1 = r1.c     // Catch:{ all -> 0x0ca4 }
            int r1 = r1.size()     // Catch:{ all -> 0x0ca4 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0ca4 }
            r8 = 0
            r4[r8] = r1     // Catch:{ all -> 0x0ca4 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0ca4 }
            r6 = 1
            r4[r6] = r1     // Catch:{ all -> 0x0ca4 }
            aucx r1 = r5.a     // Catch:{ all -> 0x0ca4 }
            int r1 = r1.size()     // Catch:{ all -> 0x0ca4 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0ca4 }
            r5 = 2
            r4[r5] = r1     // Catch:{ all -> 0x0ca4 }
            java.lang.String r1 = "Wanted %d annotation-only sections plus %d universal sections, but only got %d sections"
            defpackage.oso.c((java.lang.String) r1, (java.lang.Object[]) r4)     // Catch:{ all -> 0x0ca4 }
            r24 = r2
            r8 = 0
            goto L_0x0aac
        L_0x0a63:
            r7 = 3
            android.os.Bundle r8 = new android.os.Bundle     // Catch:{ all -> 0x0ca4 }
            r8.<init>()     // Catch:{ all -> 0x0ca4 }
            r7 = 0
        L_0x0a6a:
            aucx r14 = r1.c     // Catch:{ all -> 0x0ca4 }
            int r14 = r14.size()     // Catch:{ all -> 0x0ca4 }
            if (r7 >= r14) goto L_0x0aa6
            aucx r14 = r1.c     // Catch:{ all -> 0x0ca4 }
            java.lang.Object r14 = r14.get(r7)     // Catch:{ all -> 0x0ca4 }
            ouj r14 = (defpackage.ouj) r14     // Catch:{ all -> 0x0ca4 }
            int r14 = r14.b     // Catch:{ all -> 0x0ca4 }
            r22 = r1
            aucx r1 = r5.a     // Catch:{ all -> 0x0ca4 }
            r24 = r2
            int r2 = r7 + r6
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0ca4 }
            oum r1 = (defpackage.oum) r1     // Catch:{ all -> 0x0ca4 }
            byte[] r1 = defpackage.dtu.a((defpackage.oum) r1)     // Catch:{ all -> 0x0ca4 }
            if (r1 == 0) goto L_0x0a9f
            osz r2 = r4.a     // Catch:{ all -> 0x0ca4 }
            aucx r2 = r2.j     // Catch:{ all -> 0x0ca4 }
            java.lang.Object r2 = r2.get(r14)     // Catch:{ all -> 0x0ca4 }
            oqy r2 = (defpackage.oqy) r2     // Catch:{ all -> 0x0ca4 }
            java.lang.String r2 = r2.b     // Catch:{ all -> 0x0ca4 }
            r8.putByteArray(r2, r1)     // Catch:{ all -> 0x0ca4 }
        L_0x0a9f:
            int r7 = r7 + 1
            r1 = r22
            r2 = r24
            goto L_0x0a6a
        L_0x0aa6:
            r24 = r2
            goto L_0x0aac
        L_0x0aa9:
            r24 = r2
            r8 = 0
        L_0x0aac:
            if (r8 != 0) goto L_0x0aaf
            goto L_0x0ab8
        L_0x0aaf:
            boolean r1 = r8.isEmpty()     // Catch:{ all -> 0x0ca4 }
            if (r1 != 0) goto L_0x0ab8
            r11[r13] = r8     // Catch:{ all -> 0x0ca4 }
            r15 = 1
        L_0x0ab8:
            int r13 = r13 + 1
            r6 = r40
            r5 = r21
            r7 = r23
            r2 = r24
            r4 = r25
            r1 = r38
            r8 = r39
            goto L_0x0947
        L_0x0aca:
            r38 = r1
            r21 = r5
            r23 = r7
            r39 = r8
            aucs r1 = r3.c     // Catch:{ all -> 0x0ca4 }
            int r1 = r1.size()     // Catch:{ all -> 0x0ca4 }
            int[] r1 = new int[r1]     // Catch:{ all -> 0x0ca4 }
            r14 = 0
        L_0x0adb:
            int r2 = r3.b     // Catch:{ all -> 0x0ca4 }
            if (r14 >= r2) goto L_0x0aee
            aucs r2 = r3.c     // Catch:{ all -> 0x0ca4 }
            int r2 = r2.c(r14)     // Catch:{ all -> 0x0ca4 }
            int r2 = r12.get(r2)     // Catch:{ all -> 0x0ca4 }
            r1[r14] = r2     // Catch:{ all -> 0x0ca4 }
            int r14 = r14 + 1
            goto L_0x0adb
        L_0x0aee:
            int r2 = r3.a     // Catch:{ all -> 0x0ca4 }
            r2 = r2 & 16
            if (r2 == 0) goto L_0x0b02
            ouq r2 = r3.h     // Catch:{ all -> 0x0ca4 }
            if (r2 == 0) goto L_0x0af9
            goto L_0x0afb
        L_0x0af9:
            ouq r2 = defpackage.ouq.a     // Catch:{ all -> 0x0ca4 }
        L_0x0afb:
            byte[] r2 = r2.k()     // Catch:{ all -> 0x0ca4 }
            r29 = r2
            goto L_0x0b04
        L_0x0b02:
            r29 = 0
        L_0x0b04:
            int r2 = r3.b     // Catch:{ all -> 0x0ca4 }
            if (r2 <= 0) goto L_0x0b14
            aucn r2 = r3.i     // Catch:{ all -> 0x0ca4 }
            int r2 = r2.size()     // Catch:{ all -> 0x0ca4 }
            if (r2 == 0) goto L_0x0b11
            goto L_0x0b14
        L_0x0b11:
            r30 = 0
            goto L_0x0b1c
        L_0x0b14:
            aucn r2 = r3.i     // Catch:{ all -> 0x0ca4 }
            double[] r2 = defpackage.aooc.a((java.util.Collection) r2)     // Catch:{ all -> 0x0ca4 }
            r30 = r2
        L_0x0b1c:
            int r2 = r3.b     // Catch:{ all -> 0x0ca4 }
            long[] r4 = new long[r2]     // Catch:{ all -> 0x0ca4 }
            long[] r2 = new long[r2]     // Catch:{ all -> 0x0ca4 }
            r14 = 0
        L_0x0b23:
            int r5 = r3.b     // Catch:{ all -> 0x0ca4 }
            if (r14 >= r5) goto L_0x0b48
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0ca4 }
            aucs r6 = r3.j     // Catch:{ all -> 0x0ca4 }
            int r6 = r6.c(r14)     // Catch:{ all -> 0x0ca4 }
            long r6 = (long) r6     // Catch:{ all -> 0x0ca4 }
            long r5 = r5.toMillis(r6)     // Catch:{ all -> 0x0ca4 }
            r4[r14] = r5     // Catch:{ all -> 0x0ca4 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0ca4 }
            aucs r6 = r3.k     // Catch:{ all -> 0x0ca4 }
            int r6 = r6.c(r14)     // Catch:{ all -> 0x0ca4 }
            long r6 = (long) r6     // Catch:{ all -> 0x0ca4 }
            long r5 = r5.toMillis(r6)     // Catch:{ all -> 0x0ca4 }
            r2[r14] = r5     // Catch:{ all -> 0x0ca4 }
            int r14 = r14 + 1
            goto L_0x0b23
        L_0x0b48:
            if (r15 != 0) goto L_0x0b4d
            r35 = 0
            goto L_0x0b4f
        L_0x0b4d:
            r35 = r11
        L_0x0b4f:
            aucs r6 = r3.f     // Catch:{ all -> 0x0ca4 }
            int[] r24 = defpackage.aoog.a((java.util.Collection) r6)     // Catch:{ all -> 0x0ca4 }
            auay r6 = r3.g     // Catch:{ all -> 0x0ca4 }
            byte[] r25 = r6.k()     // Catch:{ all -> 0x0ca4 }
            int r6 = r3.e     // Catch:{ all -> 0x0ca4 }
            aucs r7 = r3.o     // Catch:{ all -> 0x0ca4 }
            int[] r36 = defpackage.aoog.a((java.util.Collection) r7)     // Catch:{ all -> 0x0ca4 }
            auay r7 = r3.p     // Catch:{ all -> 0x0ca4 }
            byte[] r37 = r7.k()     // Catch:{ all -> 0x0ca4 }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0ca4 }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x0ca4 }
            r7.<init>()     // Catch:{ all -> 0x0ca4 }
            r8 = r21
            android.os.UserHandle[] r11 = new android.os.UserHandle[r8]     // Catch:{ all -> 0x0ca4 }
            android.os.UserHandle r12 = defpackage.dtu.a()     // Catch:{ all -> 0x0ca4 }
            r13 = 0
            java.util.Arrays.fill(r11, r13, r8, r12)     // Catch:{ all -> 0x0ca4 }
            java.lang.String r8 = "USER_HANDLE_ARRAYS_KEY"
            r7.putParcelableArray(r8, r11)     // Catch:{ all -> 0x0ca4 }
            com.google.android.gms.appdatasearch.SearchResults r8 = new com.google.android.gms.appdatasearch.SearchResults     // Catch:{ all -> 0x0ca4 }
            r26 = 0
            r20 = r8
            r21 = r5
            r22 = r1
            r27 = r9
            r28 = r10
            r31 = r7
            r32 = r6
            r33 = r4
            r34 = r2
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x0ca4 }
            r1 = r40
            pxp r2 = r1.b     // Catch:{ all -> 0x0cba }
            java.lang.String[] r4 = r8.i     // Catch:{ all -> 0x0cba }
            r2.a((java.lang.String[]) r4)     // Catch:{ all -> 0x0cba }
            pxp r2 = r1.b     // Catch:{ all -> 0x0cba }
            r4 = r39
            r2.b = r4     // Catch:{ all -> 0x0cba }
            int r4 = r3.b     // Catch:{ all -> 0x0cba }
            r2.c = r4     // Catch:{ all -> 0x0cba }
            int r4 = r3.e     // Catch:{ all -> 0x0cba }
            r2.d = r4     // Catch:{ all -> 0x0cba }
            if (r38 == 0) goto L_0x0bb8
            int r13 = r38.a()     // Catch:{ all -> 0x0cba }
            goto L_0x0bb9
        L_0x0bb8:
            r13 = -1
        L_0x0bb9:
            r2.e = r13     // Catch:{ all -> 0x0cba }
            if (r38 == 0) goto L_0x0bc2
            r4 = r38
            boolean r5 = r4.j     // Catch:{ all -> 0x0cba }
            goto L_0x0bc5
        L_0x0bc2:
            r4 = r38
            r5 = 1
        L_0x0bc5:
            r2.f = r5     // Catch:{ all -> 0x0cba }
            if (r4 == 0) goto L_0x0bcc
            boolean r5 = r4.k     // Catch:{ all -> 0x0cba }
            goto L_0x0bcd
        L_0x0bcc:
            r5 = 1
        L_0x0bcd:
            r2.g = r5     // Catch:{ all -> 0x0cba }
            if (r4 == 0) goto L_0x0bd4
            java.lang.String r5 = r4.p     // Catch:{ all -> 0x0cba }
            goto L_0x0bd5
        L_0x0bd4:
            r5 = 0
        L_0x0bd5:
            r2.h = r5     // Catch:{ all -> 0x0cba }
            int r3 = r3.m     // Catch:{ all -> 0x0cba }
            int r11 = defpackage.aonf.b(r3)     // Catch:{ all -> 0x0cba }
            if (r11 == 0) goto L_0x0be0
            goto L_0x0be1
        L_0x0be0:
            r11 = 2
        L_0x0be1:
            r2.i = r11     // Catch:{ all -> 0x0cba }
            boolean r2 = r1.d     // Catch:{ all -> 0x0cba }
            if (r2 == 0) goto L_0x0bfe
            boolean r2 = r1.c     // Catch:{ all -> 0x0cba }
            if (r2 == 0) goto L_0x0bfe
            pxp r2 = r1.b     // Catch:{ all -> 0x0cba }
            java.lang.Object r3 = r1.n     // Catch:{ all -> 0x0cba }
            com.google.android.gms.search.queries.GlobalQueryCall$Request r3 = (com.google.android.gms.search.queries.GlobalQueryCall$Request) r3     // Catch:{ all -> 0x0cba }
            java.lang.String r4 = r3.a     // Catch:{ all -> 0x0cba }
            ozc r5 = r1.o     // Catch:{ all -> 0x0cba }
            java.lang.String r6 = r5.f     // Catch:{ all -> 0x0cba }
            java.lang.String r5 = r5.g     // Catch:{ all -> 0x0cba }
            android.os.Bundle r3 = r3.e     // Catch:{ all -> 0x0cba }
            r2.a(r4, r6, r5, r3)     // Catch:{ all -> 0x0cba }
        L_0x0bfe:
            osf r2 = r1.a     // Catch:{ all -> 0x0cba }
            pxo r2 = r2.y     // Catch:{ all -> 0x0cba }
            boolean r2 = r2.a()     // Catch:{ all -> 0x0cba }
            if (r2 != 0) goto L_0x0c0a
            goto L_0x0c88
        L_0x0c0a:
            osf r2 = r1.a     // Catch:{ all -> 0x0cba }
            pxo r2 = r2.y     // Catch:{ all -> 0x0cba }
            java.lang.Object r3 = r1.n     // Catch:{ all -> 0x0cba }
            com.google.android.gms.search.queries.GlobalQueryCall$Request r3 = (com.google.android.gms.search.queries.GlobalQueryCall$Request) r3     // Catch:{ all -> 0x0cba }
            oty r4 = defpackage.oty.d     // Catch:{ all -> 0x0cba }
            aucd r4 = r4.o()     // Catch:{ all -> 0x0cba }
            byte[] r3 = defpackage.pxo.a((com.google.android.gms.common.internal.safeparcel.SafeParcelable) r3)     // Catch:{ all -> 0x0cba }
            auay r3 = defpackage.auay.a((byte[]) r3)     // Catch:{ all -> 0x0cba }
            boolean r5 = r4.c     // Catch:{ all -> 0x0cba }
            if (r5 != 0) goto L_0x0c25
            goto L_0x0c2b
        L_0x0c25:
            r4.c()     // Catch:{ all -> 0x0cba }
            r5 = 0
            r4.c = r5     // Catch:{ all -> 0x0cba }
        L_0x0c2b:
            aucj r5 = r4.b     // Catch:{ all -> 0x0cba }
            oty r5 = (defpackage.oty) r5     // Catch:{ all -> 0x0cba }
            r3.getClass()     // Catch:{ all -> 0x0cba }
            int r6 = r5.a     // Catch:{ all -> 0x0cba }
            r7 = 1
            r6 = r6 | r7
            r5.a = r6     // Catch:{ all -> 0x0cba }
            r5.b = r3     // Catch:{ all -> 0x0cba }
            byte[] r3 = defpackage.pxo.a((com.google.android.gms.common.internal.safeparcel.SafeParcelable) r8)     // Catch:{ all -> 0x0cba }
            auay r3 = defpackage.auay.a((byte[]) r3)     // Catch:{ all -> 0x0cba }
            boolean r5 = r4.c     // Catch:{ all -> 0x0cba }
            if (r5 != 0) goto L_0x0c47
            goto L_0x0c4d
        L_0x0c47:
            r4.c()     // Catch:{ all -> 0x0cba }
            r5 = 0
            r4.c = r5     // Catch:{ all -> 0x0cba }
        L_0x0c4d:
            aucj r5 = r4.b     // Catch:{ all -> 0x0cba }
            oty r5 = (defpackage.oty) r5     // Catch:{ all -> 0x0cba }
            r3.getClass()     // Catch:{ all -> 0x0cba }
            int r6 = r5.a     // Catch:{ all -> 0x0cba }
            r7 = 2
            r6 = r6 | r7
            r5.a = r6     // Catch:{ all -> 0x0cba }
            r5.c = r3     // Catch:{ all -> 0x0cba }
            oub r3 = defpackage.oub.c     // Catch:{ all -> 0x0cba }
            aucd r3 = r3.o()     // Catch:{ all -> 0x0cba }
            aucj r4 = r4.i()     // Catch:{ all -> 0x0cba }
            oty r4 = (defpackage.oty) r4     // Catch:{ all -> 0x0cba }
            boolean r5 = r3.c     // Catch:{ all -> 0x0cba }
            if (r5 != 0) goto L_0x0c6d
            goto L_0x0c73
        L_0x0c6d:
            r3.c()     // Catch:{ all -> 0x0cba }
            r5 = 0
            r3.c = r5     // Catch:{ all -> 0x0cba }
        L_0x0c73:
            aucj r5 = r3.b     // Catch:{ all -> 0x0cba }
            oub r5 = (defpackage.oub) r5     // Catch:{ all -> 0x0cba }
            r4.getClass()     // Catch:{ all -> 0x0cba }
            r5.b = r4     // Catch:{ all -> 0x0cba }
            r4 = 1
            r5.a = r4     // Catch:{ all -> 0x0cba }
            aucj r3 = r3.i()     // Catch:{ all -> 0x0cba }
            oub r3 = (defpackage.oub) r3     // Catch:{ all -> 0x0cba }
            r2.a((defpackage.oub) r3)     // Catch:{ all -> 0x0cba }
        L_0x0c88:
            com.google.android.gms.search.queries.GlobalQueryCall$Response r2 = new com.google.android.gms.search.queries.GlobalQueryCall$Response     // Catch:{ all -> 0x0cba }
            r2.<init>()     // Catch:{ all -> 0x0cba }
            com.google.android.gms.common.api.Status r3 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x0cba }
            r4 = 0
            r3.<init>(r4)     // Catch:{ all -> 0x0cba }
            r2.a = r3     // Catch:{ all -> 0x0cba }
            r2.b = r8     // Catch:{ all -> 0x0cba }
            java.lang.Object r3 = r1.n     // Catch:{ all -> 0x0cba }
            com.google.android.gms.search.queries.GlobalQueryCall$Request r3 = (com.google.android.gms.search.queries.GlobalQueryCall$Request) r3     // Catch:{ all -> 0x0cba }
            android.os.Bundle r3 = r3.e     // Catch:{ all -> 0x0cba }
            r2.c = r3     // Catch:{ all -> 0x0cba }
            monitor-exit(r16)     // Catch:{ all -> 0x0cba }
        L_0x0ca0:
            return r2
        L_0x0ca1:
            r0 = move-exception
            r1 = r6
            goto L_0x0cb7
        L_0x0ca4:
            r0 = move-exception
            r1 = r40
            goto L_0x0cb7
        L_0x0ca8:
            r0 = move-exception
            r2 = r0
            monitor-exit(r7)     // Catch:{ all -> 0x0ca8 }
            throw r2     // Catch:{ all -> 0x0cba }
        L_0x0cac:
            r0 = move-exception
            goto L_0x0cb1
        L_0x0cae:
            r0 = move-exception
            r16 = r8
        L_0x0cb1:
            r2 = r0
            monitor-exit(r9)     // Catch:{ all -> 0x0cac }
            throw r2     // Catch:{ all -> 0x0cba }
        L_0x0cb4:
            r0 = move-exception
            r16 = r8
        L_0x0cb7:
            r2 = r0
        L_0x0cb8:
            monitor-exit(r16)     // Catch:{ all -> 0x0cba }
            throw r2
        L_0x0cba:
            r0 = move-exception
            goto L_0x0cb7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aall.a():java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object a(Status status) {
        GlobalQueryCall$Response globalQueryCall$Response = new GlobalQueryCall$Response();
        globalQueryCall$Response.a = status;
        return globalQueryCall$Response;
    }

    /* access modifiers changed from: protected */
    public final void a(Exception exc) {
        if (this.c) {
            this.b.a(exc);
            boolean z = this.d;
            boolean z2 = false;
            if (z && exc != null) {
                z2 = true;
            }
            if (!z || z2) {
                pxp pxp = this.b;
                String str = ((GlobalQueryCall$Request) this.n).a;
                ozc ozc = this.o;
                aojk a2 = pxp.a(str, ozc.f, ozc.g);
                if (((Boolean) ozx.m.c()).booleanValue()) {
                    this.a.c.d(new aalk(this, aonk.LOG_QUERY_STATS, this.j, psd.b(this.a.b), a2));
                    return;
                }
                this.a.r.a(a2);
            }
        }
    }
}
