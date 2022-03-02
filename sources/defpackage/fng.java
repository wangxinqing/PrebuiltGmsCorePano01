package defpackage;

/* renamed from: fng  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fng implements fcu {
    private final String a;
    private final fcu b;
    private final String c;

    public fng(String str, String str2, fcu fcu) {
        iva.c(str);
        this.a = str;
        iva.a((Object) fcu);
        this.b = fcu;
        this.c = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0038, code lost:
        if (defpackage.amsk.a(',').b().a().c(r3.c).contains(defpackage.jhg.b(defpackage.ihs.b(), r3.a, "SHA-256")) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aorr a(defpackage.fde r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.c
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = r3.c
            java.lang.String r1 = "*"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x003d
            ihs r0 = defpackage.ihs.b()     // Catch:{ NameNotFoundException -> 0x003b }
            java.lang.String r1 = r3.a     // Catch:{ NameNotFoundException -> 0x003b }
            java.lang.String r2 = "SHA-256"
            java.lang.String r0 = defpackage.jhg.b(r0, r1, r2)     // Catch:{ NameNotFoundException -> 0x003b }
            r1 = 44
            amsk r1 = defpackage.amsk.a((char) r1)     // Catch:{ NameNotFoundException -> 0x003b }
            amsk r1 = r1.b()     // Catch:{ NameNotFoundException -> 0x003b }
            amsk r1 = r1.a()     // Catch:{ NameNotFoundException -> 0x003b }
            java.lang.String r2 = r3.c     // Catch:{ NameNotFoundException -> 0x003b }
            java.util.List r1 = r1.c(r2)     // Catch:{ NameNotFoundException -> 0x003b }
            boolean r0 = r1.contains(r0)     // Catch:{ NameNotFoundException -> 0x003b }
            if (r0 == 0) goto L_0x0044
            goto L_0x003d
        L_0x003b:
            r4 = move-exception
            goto L_0x0044
        L_0x003d:
            fcu r0 = r3.b
            aorr r4 = r0.a(r4)
            return r4
        L_0x0044:
            r4 = 28443(0x6f1b, float:3.9857E-41)
            qbf r4 = defpackage.qbf.a((int) r4)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fng.a(fde):aorr");
    }

    public final qbk a() {
        return this.b.a();
    }
}
