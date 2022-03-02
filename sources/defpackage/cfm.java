package defpackage;

import android.content.Context;
import com.google.android.gms.contextmanager.ContextData;
import java.util.List;

/* renamed from: cfm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cfm extends ccv {
    public static final ccj b = new ccj(new cfk(), "TimeIntervalsProducer", new int[]{36}, new int[]{10007});
    public List j;
    public chl k;
    private atrn l;
    private final cfl m = new cfl(this);

    public cfm(Context context, bsz bsz, String str, but but) {
        super(context, bsz, b, str, but);
    }

    /* access modifiers changed from: protected */
    public final void a() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.util.ArrayList} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long b(long r12) {
        /*
            r11 = this;
            chl r0 = r11.k
            java.util.TimeZone r1 = r0.a
            java.util.Calendar r1 = defpackage.bvl.a((long) r12, (java.util.TimeZone) r1)
            atsd r1 = defpackage.bvl.a((java.util.Calendar) r1)
            chk r2 = r0.b
            int r3 = r1.b
            int r4 = r1.c
            int r5 = r1.d
            int r1 = r1.e
            int r1 = defpackage.atsp.a(r1)
            r6 = 1
            if (r1 == 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r1 = 1
        L_0x001f:
            r7 = -1
            int r1 = r1 + r7
            android.util.SparseArray r8 = r2.b
            int r3 = defpackage.chk.a(r3, r4, r5)
            java.util.ArrayList r4 = defpackage.chk.a
            java.lang.Object r3 = r8.get(r3, r4)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0041
            android.util.SparseArray r2 = r2.c
            java.util.ArrayList r3 = defpackage.chk.a
            java.lang.Object r1 = r2.get(r1, r3)
            r3 = r1
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            goto L_0x0042
        L_0x0041:
        L_0x0042:
            java.util.Collections.sort(r3)
            java.util.TimeZone r1 = r0.a
            long r1 = defpackage.bvl.b(r12, r1)
            chi r0 = r0.c
            java.util.List r4 = r0.b
            chh r5 = new chh
            r5.<init>(r1)
            if (r4 == 0) goto L_0x0060
            int r4 = java.util.Collections.binarySearch(r4, r5)
            if (r4 >= 0) goto L_0x0061
            int r4 = -r4
            int r4 = r4 + -2
            goto L_0x0061
        L_0x0060:
            r4 = -1
        L_0x0061:
            if (r4 < 0) goto L_0x0079
            java.util.List r5 = r0.b
            java.lang.Object r5 = r5.get(r4)
            chh r5 = (defpackage.chh) r5
            long r8 = r5.a
            int r10 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r10 > 0) goto L_0x0079
            long r8 = r5.b
            int r5 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x0079
            r7 = r4
            goto L_0x007a
        L_0x0079:
        L_0x007a:
            if (r7 < 0) goto L_0x0087
            java.util.List r0 = r0.b
            java.lang.Object r0 = r0.get(r7)
            chh r0 = (defpackage.chh) r0
            java.util.List r0 = r0.c
            goto L_0x0089
        L_0x0087:
            amzy r0 = defpackage.chi.a
        L_0x0089:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r3.size()
            int r4 = r0.size()
            int r2 = r2 + r4
            r1.<init>(r2)
            int r2 = r3.size()
            r4 = 0
        L_0x009c:
            r5 = 3
            r7 = 2
            if (r4 >= r2) goto L_0x00c5
            java.lang.Object r8 = r3.get(r4)
            atsr r8 = (defpackage.atsr) r8
            atsr r9 = defpackage.atsr.UNKNOWN_DAY_TYPE
            atsl r9 = defpackage.atsl.UNKNOWN_DAY_PART
            int r8 = r8.ordinal()
            if (r8 == r6) goto L_0x00bd
            if (r8 == r7) goto L_0x00ba
            if (r8 == r5) goto L_0x00b7
            atrm r5 = defpackage.atrm.UNKNOWN
            goto L_0x00bf
        L_0x00b7:
            atrm r5 = defpackage.atrm.HOLIDAY
            goto L_0x00bf
        L_0x00ba:
            atrm r5 = defpackage.atrm.WEEKEND
            goto L_0x00bf
        L_0x00bd:
            atrm r5 = defpackage.atrm.WEEKDAY
        L_0x00bf:
            r1.add(r5)
            int r4 = r4 + 1
            goto L_0x009c
        L_0x00c5:
            java.util.Iterator r0 = r0.iterator()
        L_0x00c9:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00f8
            java.lang.Object r2 = r0.next()
            atsl r2 = (defpackage.atsl) r2
            atsr r3 = defpackage.atsr.UNKNOWN_DAY_TYPE
            atsl r3 = defpackage.atsl.UNKNOWN_DAY_PART
            int r2 = r2.ordinal()
            if (r2 == r6) goto L_0x00f2
            if (r2 == r7) goto L_0x00ef
            if (r2 == r5) goto L_0x00ec
            r3 = 4
            if (r2 == r3) goto L_0x00e9
            atrm r2 = defpackage.atrm.UNKNOWN
            goto L_0x00f4
        L_0x00e9:
            atrm r2 = defpackage.atrm.NIGHT
            goto L_0x00f4
        L_0x00ec:
            atrm r2 = defpackage.atrm.EVENING
            goto L_0x00f4
        L_0x00ef:
            atrm r2 = defpackage.atrm.AFTERNOON
            goto L_0x00f4
        L_0x00f2:
            atrm r2 = defpackage.atrm.MORNING
        L_0x00f4:
            r1.add(r2)
            goto L_0x00c9
        L_0x00f8:
            java.util.Collections.sort(r1)
            boolean r0 = r11.g()
            if (r0 != 0) goto L_0x010b
            r11.a(r1, r12)
            chl r0 = r11.k
            long r12 = r0.a((long) r12)
            return r12
        L_0x010b:
            java.util.List r0 = r11.j
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0135
            jjg r0 = defpackage.bxk.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r2 = 143(0x8f, float:2.0E-43)
            java.lang.String r3 = "cfm"
            java.lang.String r4 = "b"
            java.lang.String r5 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r4, (int) r2, (java.lang.String) r5)
            anih r0 = (defpackage.anih) r0
            java.lang.String r2 = "[TimeIntervalsProducer] Got same value as before for attributes %s"
            r0.a((java.lang.String) r2, (java.lang.Object) r1)
            chl r0 = r11.k
            long r12 = r0.a((long) r12)
            return r12
        L_0x0135:
            r2 = -1
            long r2 = r2 + r12
            r11.a((long) r2)
            r11.a(r1, r12)
            chl r0 = r11.k
            long r12 = r0.a((long) r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfm.b(long):long");
    }

    public final void a(List list, long j2) {
        aucd o = atrn.c.o();
        if (!list.isEmpty()) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            atrn atrn = (atrn) o.b;
            if (!atrn.a.a()) {
                atrn.a = aucj.a(atrn.a);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                atrn.a.d(((atrm) list.get(i)).i);
            }
            this.j = list;
        }
        atrn atrn2 = (atrn) o.i();
        this.l = atrn2;
        new Object[1][0] = atrn2;
        jti jti = new jti(10, 36, 2);
        jti.a(jut.b(j2));
        jti.a(atrn.d, this.l);
        d(jti.a());
    }

    /* access modifiers changed from: protected */
    public final void b() {
        cbi.k().a((Runnable) this.m);
        a(cbi.i().a());
    }

    public final void b(ContextData contextData) {
        if (contextData == null) {
            ((anih) ((anih) bxk.a.b()).a("cfm", "b", 60, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[TimeIntervalsProducer] onReceive: null ContextData received.");
        } else if (contextData.g() != 10007) {
            ((anih) ((anih) bxk.a.b()).a("cfm", "b", 66, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[TimeIntervalsProducer] onReceive: received ContextData not LOCALE_BASED_TIME_MODEL");
        } else {
            atst atst = (atst) contextData.a((aubq) atst.f);
            if (atst == null) {
                ((anih) ((anih) bxk.a.b()).a("cfm", "b", 73, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[TimeIntervalsProducer] onReceive: could not read LocaleBasedTimeModel from ContextData");
                return;
            }
            new Object[1][0] = atst;
            chl chl = this.k;
            if (chl == null) {
                this.k = new chl(atst);
            } else {
                chl.a(atst);
            }
            cbi.k().a((Runnable) this.m);
            this.m.a(bvq.a("ProduceTimeIntervalsOperation"));
        }
    }
}
