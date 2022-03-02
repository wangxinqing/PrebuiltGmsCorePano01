package defpackage;

import java.util.Map;

/* renamed from: cmd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cmd extends cmi {
    private final String a;
    private final Integer b;
    private final cmg c;
    private final long d;
    private final long e;
    private final Map f;

    public cmd(String str, Integer num, cmg cmg, long j, long j2, Map map) {
        this.a = str;
        this.b = num;
        this.c = cmg;
        this.d = j;
        this.e = j2;
        this.f = map;
    }

    public final String a() {
        return this.a;
    }

    public final Integer b() {
        return this.b;
    }

    public final cmg c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final long e() {
        return this.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r1 = r7.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 == r7) goto L_0x005a
            boolean r1 = r8 instanceof defpackage.cmi
            r2 = 0
            if (r1 == 0) goto L_0x0059
            cmi r8 = (defpackage.cmi) r8
            java.lang.String r1 = r7.a
            java.lang.String r3 = r8.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            java.lang.Integer r1 = r7.b
            if (r1 == 0) goto L_0x0025
            java.lang.Integer r3 = r8.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002b
            goto L_0x002c
        L_0x0025:
            java.lang.Integer r1 = r8.b()
            if (r1 == 0) goto L_0x002c
        L_0x002b:
            goto L_0x0059
        L_0x002c:
            cmg r1 = r7.c
            cmg r3 = r8.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            long r3 = r7.d
            long r5 = r8.d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            long r3 = r7.e
            long r5 = r8.e()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            java.util.Map r1 = r7.f
            java.util.Map r8 = r8.f()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0059
            return r0
        L_0x0059:
            return r2
        L_0x005a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmd.equals(java.lang.Object):boolean");
    }

    public final Map f() {
        return this.f;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = this.c.hashCode();
        long j = this.d;
        long j2 = this.e;
        return ((((((((hashCode ^ i) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        long j = this.d;
        long j2 = this.e;
        String valueOf3 = String.valueOf(this.f);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 137 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("EventInternal{transportName=");
        sb.append(str);
        sb.append(", code=");
        sb.append(valueOf);
        sb.append(", encodedPayload=");
        sb.append(valueOf2);
        sb.append(", eventMillis=");
        sb.append(j);
        sb.append(", uptimeMillis=");
        sb.append(j2);
        sb.append(", autoMetadata=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
