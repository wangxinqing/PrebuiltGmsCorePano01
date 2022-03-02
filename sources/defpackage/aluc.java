package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: aluc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class aluc extends altx implements alsj {
    private Map c;
    private int d;

    public aluc(aluc aluc, aluh aluh) {
        super(aluc.a, aluh, true);
        this.d = 0;
        this.c = aluc.c;
        this.d = aluc.d;
    }

    private static final amjf c(amjf amjf) {
        return amjf == null ? aluw.a : amjf;
    }

    public final int a() {
        return this.c.size();
    }

    public final alse b() {
        if (a() > 0) {
            return this.b.a(i(), alss.d);
        }
        return alse.a;
    }

    public final amiw i() {
        amid b = amie.b();
        String d2 = d();
        for (String a : this.c.keySet()) {
            b.a(aluv.a(d2, a, aluw.a));
        }
        return aluv.a(b);
    }

    public final List k() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.c.entrySet()) {
            arrayList.add(aluv.a(d(), (String) entry.getKey(), (amjf) entry.getValue()));
        }
        return arrayList;
    }

    public final int l() {
        return this.d + 24;
    }

    public final Iterable o() {
        return this.c.values();
    }

    /* access modifiers changed from: protected */
    public final void r() {
        this.c = new HashMap(this.c);
    }

    public aluc(aluh aluh, amjf amjf) {
        super(amjf, aluh, false);
        this.d = 0;
        this.c = new HashMap();
    }

    public final int a(alsn alsn) {
        int i = 17;
        for (Map.Entry entry : c()) {
            i = (((i * 37) + ((String) entry.getKey()).hashCode()) * 37) + ((Integer) alsn.a((amjf) entry.getValue())).intValue();
        }
        return i;
    }

    public final Set c() {
        return Collections.unmodifiableMap(this.c).entrySet();
    }

    public final alse a(String str) {
        if (a((Object) str)) {
            return this.b.a(aluv.a(d(), str, aluw.a), alss.d);
        }
        return alse.a;
    }

    public final amjf b(Object obj) {
        return c((amjf) this.c.get(obj));
    }

    public final String b(alsn alsn) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        boolean z = true;
        for (Map.Entry entry : c()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append((String) entry.getKey());
            sb.append(": ");
            sb.append((String) alsn.a((amjf) entry.getValue()));
            z = false;
        }
        sb.append("}");
        return sb.toString();
    }

    public final alse a(String str, amjf amjf) {
        return this.b.a(aluv.a(d(), str, c(amjf)), alss.d);
    }

    public final alse a(Map map) {
        amid b = amie.b();
        String d2 = d();
        for (Map.Entry entry : map.entrySet()) {
            b.a(aluv.a(d2, (String) entry.getKey(), c((amjf) entry.getValue())));
        }
        return this.b.a(aluv.a(b), alss.d);
    }

    public final amiw a(amiw amiw) {
        a(amiw, amiv.UPDATE);
        String str = amiw.e().b;
        return aluv.a(d(), str, b((Object) str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.amiw r8, defpackage.alss r9, defpackage.alty r10) {
        /*
            r7 = this;
            amiv r0 = defpackage.amiv.UPDATE
            r7.a(r8, r0)
            r7.q()
            amjn r8 = r8.e()
            java.lang.String r4 = r8.b
            amjf r5 = r8.c
            java.util.Map r8 = r7.c
            java.lang.Object r8 = r8.get(r4)
            amjf r8 = (defpackage.amjf) r8
            if (r8 != 0) goto L_0x001e
            amjf r8 = defpackage.aluw.a
            r6 = r8
            goto L_0x001f
        L_0x001e:
            r6 = r8
        L_0x001f:
            boolean r8 = defpackage.aluw.b((defpackage.amjf) r5)
            amjf r0 = defpackage.aluw.a
            boolean r0 = defpackage.aluw.a((defpackage.amjf) r6, (defpackage.amjf) r0)
            r0 = r0 ^ 1
            r8 = r8 ^ 1
            if (r8 == 0) goto L_0x0054
            java.util.Map r8 = r7.c
            r8.put(r4, r5)
            r7.a((defpackage.amjf) r5)
            int r8 = r7.d
            int r1 = defpackage.aluw.a((defpackage.amjf) r5)
            int r8 = r8 + r1
            r7.d = r8
            if (r0 == 0) goto L_0x004a
            int r0 = defpackage.aluw.a((defpackage.amjf) r6)
            int r8 = r8 - r0
            r7.d = r8
            goto L_0x006d
        L_0x004a:
            int r0 = r4.length()
            int r0 = r0 + 8
            int r8 = r8 + r0
            r7.d = r8
            goto L_0x0070
        L_0x0054:
            java.util.Map r8 = r7.c
            r8.remove(r4)
            if (r0 == 0) goto L_0x0070
            int r8 = r7.d
            int r0 = r4.length()
            int r0 = r0 + 8
            int r8 = r8 - r0
            r7.d = r8
            int r0 = defpackage.aluw.a((defpackage.amjf) r6)
            int r8 = r8 - r0
            r7.d = r8
        L_0x006d:
            r7.b((defpackage.amjf) r6)
        L_0x0070:
            boolean r8 = r10.a
            if (r8 == 0) goto L_0x0089
            boolean r8 = defpackage.aluw.a((defpackage.amjf) r6, (defpackage.amjf) r5)
            if (r8 != 0) goto L_0x0089
            alto r8 = new alto
            java.util.List r3 = r10.d()
            r0 = r8
            r1 = r7
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r10.a((defpackage.altj) r8)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aluc.a(amiw, alss, alty):void");
    }

    public final void a(String str, alss alss, alty alty) {
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            if (aluw.a(str, (amjf) it.next())) {
                it.remove();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.altt r7, defpackage.alsk r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.alsj
            r1 = 0
            if (r0 == 0) goto L_0x004a
            alsj r8 = (defpackage.alsj) r8
            int r0 = r6.a()
            int r2 = r8.a()
            if (r0 != r2) goto L_0x004a
            java.util.Set r0 = r6.c()
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0048
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r8.a((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0047
            amjf r3 = r8.b(r3)
            java.lang.Object r2 = r2.getValue()
            amjf r2 = (defpackage.amjf) r2
            aluh r4 = r6.b
            alsg r5 = r8.j()
            boolean r2 = r7.a(r3, r2, r4, r5)
            if (r2 != 0) goto L_0x0019
        L_0x0047:
            return r1
        L_0x0048:
            r7 = 1
            return r7
        L_0x004a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aluc.a(altt, alsk):boolean");
    }

    public final boolean a(Object obj) {
        return this.c.containsKey(obj);
    }
}
