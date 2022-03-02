package defpackage;

/* renamed from: uzu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uzu {
    public static auzf a(int i, byte[] bArr) {
        aucf aucf = (aucf) auzf.d.o();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        auzf auzf = (auzf) aucf.b;
        auzf.b = i - 1;
        auzf.a |= 1;
        auay a = auay.a(bArr);
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        auzf auzf2 = (auzf) aucf.b;
        a.getClass();
        auzf2.a |= 2;
        auzf2.c = a;
        return (auzf) aucf.i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(defpackage.auzf r8) {
        /*
            java.lang.String r0 = "null"
            if (r8 == 0) goto L_0x0086
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r3 = r8.a
            r4 = 1
            r3 = r3 & r4
            r5 = 0
            if (r3 == 0) goto L_0x0019
            int r3 = r8.b
            int r3 = defpackage.avaw.a(r3)
            if (r3 == 0) goto L_0x0017
            goto L_0x001a
        L_0x0017:
            r3 = 1
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            if (r3 == 0) goto L_0x003c
            int r6 = r3 + -1
            if (r6 == r4) goto L_0x0039
            if (r6 == r1) goto L_0x0036
            r7 = 3
            if (r6 == r7) goto L_0x0033
            r7 = 4
            if (r6 == r7) goto L_0x0030
            r7 = 106(0x6a, float:1.49E-43)
            if (r6 == r7) goto L_0x002d
            goto L_0x003c
        L_0x002d:
            java.lang.String r3 = "MAGIC_PAIR"
            goto L_0x006a
        L_0x0030:
            java.lang.String r3 = "EDDYSTONE_EIDR"
            goto L_0x006a
        L_0x0033:
            java.lang.String r3 = "ALTBEACON"
            goto L_0x006a
        L_0x0036:
            java.lang.String r3 = "EDDYSTONE_UID"
            goto L_0x006a
        L_0x0039:
            java.lang.String r3 = "IBEACON"
            goto L_0x006a
        L_0x003c:
            if (r3 == 0) goto L_0x0045
            int r3 = r3 + -1
            java.lang.String r3 = java.lang.Integer.toString(r3)
            goto L_0x0046
        L_0x0045:
            r3 = r0
        L_0x0046:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r6 = java.lang.String.valueOf(r3)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r6 = r6 + 21
            r7.<init>(r6)
            java.lang.String r6 = "UNKNOWN_BEACON_TYPE("
            r7.append(r6)
            r7.append(r3)
            java.lang.String r3 = ")"
            r7.append(r3)
            java.lang.String r3 = r7.toString()
        L_0x006a:
            r2[r5] = r3
            int r3 = r8.a
            r1 = r1 & r3
            if (r1 == 0) goto L_0x007c
            auay r8 = r8.c
            byte[] r8 = r8.k()
            java.lang.String r0 = defpackage.jjp.a((byte[]) r8)
            goto L_0x007d
        L_0x007c:
        L_0x007d:
            r2[r4] = r0
            java.lang.String r8 = "BeaconId{type=%s, id=%s}"
            java.lang.String r8 = java.lang.String.format(r8, r2)
            return r8
        L_0x0086:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uzu.a(auzf):java.lang.String");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.Iterable r4) {
        /*
            if (r4 == 0) goto L_0x0023
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r4.size()
            r2 = 0
        L_0x000c:
            if (r2 >= r1) goto L_0x001e
            java.lang.Object r3 = r4.get(r2)
            auzf r3 = (defpackage.auzf) r3
            java.lang.String r3 = a((defpackage.auzf) r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto L_0x000c
        L_0x001e:
            java.lang.String r4 = r0.toString()
            return r4
        L_0x0023:
            java.lang.String r4 = "null"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uzu.a(java.lang.Iterable):java.lang.String");
    }
}
