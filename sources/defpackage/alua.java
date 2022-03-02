package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: alua  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class alua {
    protected final alui a;
    final alsu b;
    final alss c;
    protected final alty d;
    private boolean e;

    public alua(alui alui, alsu alsu, alss alss, boolean z) {
        this.a = alui;
        this.b = alsu;
        this.c = alss;
        this.d = new alty(z);
    }

    public abstract alse a();

    public abstract alse a(amiw amiw);

    /* access modifiers changed from: protected */
    public abstract void a(alsk alsk);

    public abstract void a(String str, altz altz);

    /* access modifiers changed from: package-private */
    public final void a(String str, amiw amiw) {
        Map b2 = this.a.b(str);
        if (!b2.isEmpty()) {
            ArrayList arrayList = new ArrayList(b2.values());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                alsp alsp = (alsp) arrayList.get(i);
                a((alsk) alsp);
                this.a.a(alsp.d(), true);
                ((alug) alsp).a(amiw, this.c, this.d);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void b(amiw amiw);

    public abstract boolean b();

    /* access modifiers changed from: package-private */
    public final void c() {
        alys.b(!this.e, "Already committed this change.");
    }

    /* access modifiers changed from: protected */
    public abstract void c(amiw amiw);

    /* access modifiers changed from: package-private */
    public final void d() {
        this.e = true;
    }

    /* access modifiers changed from: protected */
    public void e(amiw amiw) {
        f(amiw);
    }

    /* access modifiers changed from: protected */
    public void f(amiw amiw) {
        b(amiw);
        String str = amiw.c;
        altx a2 = this.a.a(str, true);
        if (a2 != null) {
            a((alsk) a2);
            int l = a2.l();
            a2.a(amiw, this.c, this.d);
            int l2 = a2.l();
            a(str, amiw);
            this.a.f += l2 - l;
            c(amiw);
            return;
        }
        String valueOf = String.valueOf(amiw);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(valueOf).length());
        sb.append("No object with ID ");
        sb.append(str);
        sb.append(" when applying: ");
        sb.append(valueOf);
        throw new altd(sb.toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v21, types: [int] */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(defpackage.amiw r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            amiv r2 = defpackage.amiv.KIND_NOT_SET
            amiv r2 = r1.b
            int r2 = r2.ordinal()
            r3 = 0
            r4 = 1
            switch(r2) {
                case 0: goto L_0x0248;
                case 1: goto L_0x0195;
                case 2: goto L_0x0151;
                case 3: goto L_0x014d;
                case 4: goto L_0x0011;
                case 5: goto L_0x0149;
                case 6: goto L_0x014d;
                case 7: goto L_0x014d;
                case 8: goto L_0x0040;
                case 9: goto L_0x014d;
                case 10: goto L_0x0017;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L_0x0017:
            amie r1 = r18.h()
            alty r2 = r0.d
            java.lang.String r3 = r1.b
            r2.a((java.lang.String) r3)
            java.util.List r1 = r1.a()
            java.util.Iterator r1 = r1.iterator()
        L_0x002a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x003a
            java.lang.Object r2 = r1.next()
            amiw r2 = (defpackage.amiw) r2
            r0.d(r2)
            goto L_0x002a
        L_0x003a:
            alty r1 = r0.d
            r1.c()
            return
        L_0x0040:
            r17.b(r18)
            amit r2 = r18.f()
            java.lang.String r5 = r1.c
            java.lang.String r2 = r2.d
            alui r6 = r0.a
            altx r6 = r6.a(r5, r4)
            alud r6 = (defpackage.alud) r6
            alui r7 = r0.a
            altx r4 = r7.a(r2, r4)
            r8 = r4
            alud r8 = (defpackage.alud) r8
            r0.a((defpackage.alsk) r6)
            r0.a((defpackage.alsk) r8)
            if (r8 == 0) goto L_0x00c6
            alss r9 = r0.c
            alty r4 = r0.d
            r8.q()
            amit r7 = r18.f()
            int r11 = r7.c
            int r10 = r7.b
            aluh r12 = r8.b
            java.lang.String r13 = r1.c
            altx r12 = r12.b(r13)
            r13 = r12
            alud r13 = (defpackage.alud) r13
            java.util.ArrayList r12 = new java.util.ArrayList
            java.util.List r14 = r13.c
            int r15 = r10 + 1
            java.util.List r14 = r14.subList(r10, r15)
            r12.<init>(r14)
            java.util.List r14 = r8.c
            int r7 = r7.c
            r14.addAll(r7, r12)
            int r7 = r12.size()
        L_0x0096:
            if (r3 >= r7) goto L_0x00ae
            java.lang.Object r14 = r12.get(r3)
            amjf r14 = (defpackage.amjf) r14
            int r15 = r8.d
            int r16 = defpackage.aluw.a((defpackage.amjf) r14)
            int r15 = r15 + r16
            r8.d = r15
            r8.a((defpackage.amjf) r14)
            int r3 = r3 + 1
            goto L_0x0096
        L_0x00ae:
            boolean r3 = r4.a
            if (r3 != 0) goto L_0x00b3
            goto L_0x00c6
        L_0x00b3:
            altp r3 = new altp
            java.util.List r14 = r4.d()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
            r7 = r3
            r10 = r14
            r14 = r15
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r4.a((defpackage.altj) r3)
        L_0x00c6:
            alss r9 = r0.c
            alty r3 = r0.d
            r6.q()
            amit r4 = r18.f()
            int r7 = r4.b
            int r8 = r4.c
            java.lang.String r4 = r4.d
            java.lang.String r10 = r1.c
            boolean r10 = r4.equals(r10)
            if (r10 != 0) goto L_0x00e0
            goto L_0x00e6
        L_0x00e0:
            if (r8 >= r7) goto L_0x00e6
            int r7 = r7 + 1
            r11 = r7
            goto L_0x00e7
        L_0x00e6:
            r11 = r7
        L_0x00e7:
            java.util.List r7 = r6.c
            int r10 = r11 + 1
            java.util.List r15 = r7.subList(r11, r10)
            boolean r7 = r3.a
            if (r7 == 0) goto L_0x0119
            aluh r7 = r6.b
            altx r4 = r7.b(r4)
            r13 = r4
            alsi r13 = (defpackage.alsi) r13
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r15)
            altq r4 = new altq
            java.util.List r10 = r3.d()
            if (r13 == 0) goto L_0x010f
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r14 = r7
            goto L_0x0111
        L_0x010f:
            r7 = 0
            r14 = r7
        L_0x0111:
            r7 = r4
            r8 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r3.a((defpackage.altj) r4)
        L_0x0119:
            java.util.Iterator r3 = r15.iterator()
        L_0x011d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0136
            java.lang.Object r4 = r3.next()
            amjf r4 = (defpackage.amjf) r4
            int r7 = r6.d
            int r8 = defpackage.aluw.a((defpackage.amjf) r4)
            int r7 = r7 - r8
            r6.d = r7
            r6.b((defpackage.amjf) r4)
            goto L_0x011d
        L_0x0136:
            r15.clear()
            boolean r3 = r2.equals(r5)
            if (r3 != 0) goto L_0x0142
            r0.a((java.lang.String) r2, (defpackage.amiw) r1)
        L_0x0142:
            r0.a((java.lang.String) r5, (defpackage.amiw) r1)
            r17.c(r18)
            return
        L_0x0149:
            r17.e(r18)
            return
        L_0x014d:
            r17.f(r18)
            return
        L_0x0151:
            java.lang.String r2 = r1.c
            java.lang.String r3 = "root"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x018d
            alui r3 = r0.a
            java.util.Set r3 = r3.a()
            java.util.Iterator r3 = r3.iterator()
        L_0x0165:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x017f
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            alui r5 = r0.a
            altx r4 = r5.a((java.lang.String) r4)
            alss r5 = r0.c
            alty r6 = r0.d
            r4.a((java.lang.String) r2, (defpackage.alss) r5, (defpackage.alty) r6)
            goto L_0x0165
        L_0x017f:
            alui r3 = r0.a
            r3.d()
            java.util.Map r3 = r3.d
            r3.remove(r2)
            r17.c(r18)
            return
        L_0x018d:
            alth r1 = new alth
            java.lang.String r2 = "The root object can not be destroyed."
            r1.<init>(r2)
            throw r1
        L_0x0195:
            java.lang.String r2 = r1.c
            amih r5 = r18.a()
            alui r6 = r0.a
            altx r6 = r6.a((java.lang.String) r2)
            if (r6 == 0) goto L_0x01ac
            amiw r2 = r6.i()
            r0.d(r2)
            goto L_0x0244
        L_0x01ac:
            alui r6 = r0.a
            altx r7 = r6.a((java.lang.String) r2)
            if (r7 != 0) goto L_0x01b6
            r3 = 1
            goto L_0x01b7
        L_0x01b6:
        L_0x01b7:
            java.lang.String r7 = java.lang.String.valueOf(r2)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r7 = r7 + 31
            r8.<init>(r7)
            java.lang.String r7 = "Object with ID "
            r8.append(r7)
            r8.append(r2)
            java.lang.String r7 = " already exists."
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            defpackage.alys.b(r3, r7)
            alun r3 = r6.b
            amjd r7 = defpackage.amjf.c()
            r7.a((java.lang.String) r2)
            amjf r7 = r7.a()
            amig r8 = defpackage.amig.KIND_NOT_SET
            amig r8 = r5.b
            int r8 = r8.ordinal()
            if (r8 == r4) goto L_0x022f
            r4 = 2
            if (r8 == r4) goto L_0x0227
            r4 = 3
            if (r8 == r4) goto L_0x021f
            r4 = 4
            if (r8 == r4) goto L_0x0217
            r4 = 5
            if (r8 != r4) goto L_0x020b
            alur r4 = new alur
            amiy r5 = r5.a()
            java.lang.String r5 = r5.b
            aluh r3 = r3.a
            r4.<init>(r5, r3, r7)
            goto L_0x0236
        L_0x020b:
            alti r1 = new alti
            java.lang.String r2 = ""
            amiw r2 = defpackage.aluv.a((java.lang.String) r2, (defpackage.amih) r5)
            r1.<init>(r2)
            throw r1
        L_0x0217:
            alug r4 = new alug
            aluh r3 = r3.a
            r4.<init>((defpackage.aluh) r3, (defpackage.amjf) r7)
            goto L_0x0236
        L_0x021f:
            aluf r4 = new aluf
            aluh r3 = r3.a
            r4.<init>((defpackage.aluh) r3, (defpackage.amjf) r7)
            goto L_0x0236
        L_0x0227:
            alud r4 = new alud
            aluh r3 = r3.a
            r4.<init>((defpackage.aluh) r3, (defpackage.amjf) r7)
            goto L_0x0236
        L_0x022f:
            alue r4 = new alue
            aluh r3 = r3.a
            r4.<init>((defpackage.aluh) r3, (defpackage.amjf) r7)
        L_0x0236:
            java.util.Map r3 = r6.d
            r3.put(r2, r4)
            int r2 = r6.f
            int r3 = r4.l()
            int r2 = r2 + r3
            r6.f = r2
        L_0x0244:
            r17.c(r18)
            return
        L_0x0248:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alua.d(amiw):void");
    }
}
