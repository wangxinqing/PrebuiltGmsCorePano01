package defpackage;

import java.net.URI;

/* renamed from: apzw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apzw extends aqaq {
    public final URI a;
    public final long b;
    public final Integer c;
    public final Integer d;

    public apzw(URI uri, long j, Integer num, Integer num2) {
        this.a = uri;
        this.b = j;
        this.c = num;
        this.d = num2;
    }

    public final URI a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final Integer c() {
        return this.c;
    }

    public final Integer d() {
        return this.d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        r1 = r7.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r1 = r7.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 == r7) goto L_0x004f
            boolean r1 = r8 instanceof defpackage.aqaq
            r2 = 0
            if (r1 == 0) goto L_0x004e
            aqaq r8 = (defpackage.aqaq) r8
            java.net.URI r1 = r7.a
            java.net.URI r3 = r8.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004d
            long r3 = r7.b
            long r5 = r8.b()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x004d
            java.lang.Integer r1 = r7.c
            if (r1 == 0) goto L_0x002f
            java.lang.Integer r3 = r8.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004d
        L_0x002e:
            goto L_0x0036
        L_0x002f:
            java.lang.Integer r1 = r8.c()
            if (r1 != 0) goto L_0x004d
            goto L_0x002e
        L_0x0036:
            java.lang.Integer r1 = r7.d
            if (r1 == 0) goto L_0x0045
            java.lang.Integer r8 = r8.d()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x004b
            goto L_0x004c
        L_0x0045:
            java.lang.Integer r8 = r8.d()
            if (r8 == 0) goto L_0x004c
        L_0x004b:
            goto L_0x004d
        L_0x004c:
            return r0
        L_0x004d:
            return r2
        L_0x004e:
            return r2
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apzw.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode();
        long j = this.b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Integer num = this.c;
        int i3 = 0;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 ^ i) * 1000003;
        Integer num2 = this.d;
        if (num2 != null) {
            i3 = num2.hashCode();
        }
        return i4 ^ i3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 106 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ChannelRuntimeConfig{uri=");
        sb.append(valueOf);
        sb.append(", grpcIdleTimeoutMillis=");
        sb.append(j);
        sb.append(", trafficStatsUid=");
        sb.append(valueOf2);
        sb.append(", trafficStatsTag=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
