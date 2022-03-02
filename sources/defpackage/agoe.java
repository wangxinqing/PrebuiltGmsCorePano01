package defpackage;

/* renamed from: agoe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agoe extends agny {
    private final String a;
    private final String b;

    public agoe(String str, String str2) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return null;
    }

    public final String c() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r1 = r4.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r4) goto L_0x0034
            boolean r1 = r5 instanceof defpackage.agny
            r2 = 0
            if (r1 == 0) goto L_0x0033
            agny r5 = (defpackage.agny) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0033
            java.lang.String r1 = r5.b()
            if (r1 != 0) goto L_0x0033
            java.lang.String r1 = r4.b
            if (r1 == 0) goto L_0x002b
            java.lang.String r5 = r5.c()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0031
            goto L_0x0032
        L_0x002b:
            java.lang.String r5 = r5.c()
            if (r5 == 0) goto L_0x0032
        L_0x0031:
            goto L_0x0033
        L_0x0032:
            return r0
        L_0x0033:
            return r2
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agoe.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * -721379959;
        String str = this.b;
        return hashCode ^ (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf((Object) null).length() + String.valueOf(str2).length());
        sb.append("ApplicationId{packageName=");
        sb.append(str);
        sb.append(", moduleName=null, instanceId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
