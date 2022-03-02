package defpackage;

import android.accounts.Account;

/* renamed from: afdq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afdq extends afdx {
    private final String a;
    private final Account b;
    private final aukh c;
    private final aump d;
    private final aukf e;
    private final long f;
    private final int g;
    private final long h;

    public afdq(String str, Account account, aukh aukh, aump aump, aukf aukf, long j, int i, long j2) {
        if (str != null) {
            this.a = str;
            if (account != null) {
                this.b = account;
                if (aukh != null) {
                    this.c = aukh;
                    this.d = aump;
                    this.e = aukf;
                    this.f = j;
                    this.g = i;
                    this.h = j2;
                    return;
                }
                throw new NullPointerException("Null channelId");
            }
            throw new NullPointerException("Null account");
        }
        throw new NullPointerException("Null appId");
    }

    public final String a() {
        return this.a;
    }

    public final Account b() {
        return this.b;
    }

    public final aukh c() {
        return this.c;
    }

    public final aump d() {
        return this.d;
    }

    public final aukf e() {
        return this.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        r1 = r7.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        r1 = r7.e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 == r7) goto L_0x0079
            boolean r1 = r8 instanceof defpackage.afdx
            r2 = 0
            if (r1 == 0) goto L_0x0078
            afdx r8 = (defpackage.afdx) r8
            java.lang.String r1 = r7.a
            java.lang.String r3 = r8.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0077
            android.accounts.Account r1 = r7.b
            android.accounts.Account r3 = r8.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0077
            aukh r1 = r7.c
            aukh r3 = r8.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0077
            aump r1 = r7.d
            if (r1 == 0) goto L_0x003d
            aump r3 = r8.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0077
        L_0x003c:
            goto L_0x0044
        L_0x003d:
            aump r1 = r8.d()
            if (r1 != 0) goto L_0x0077
            goto L_0x003c
        L_0x0044:
            aukf r1 = r7.e
            if (r1 == 0) goto L_0x0053
            aukf r3 = r8.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0053:
            aukf r1 = r8.e()
            if (r1 == 0) goto L_0x005a
        L_0x0059:
            goto L_0x0077
        L_0x005a:
            long r3 = r7.f
            long r5 = r8.f()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0077
            int r1 = r7.g
            int r3 = r8.g()
            if (r1 != r3) goto L_0x0077
            long r3 = r7.h
            long r5 = r8.h()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x0077
            return r0
        L_0x0077:
            return r2
        L_0x0078:
            return r2
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afdq.equals(java.lang.Object):boolean");
    }

    public final long f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    public final long h() {
        return this.h;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        aukh aukh = this.c;
        int i2 = aukh.S;
        if (i2 == 0) {
            i2 = aueh.a.a((Object) aukh).a(aukh);
            aukh.S = i2;
        }
        int i3 = (hashCode ^ i2) * 1000003;
        aump aump = this.d;
        int i4 = 0;
        if (aump != null) {
            i = aump.S;
            if (i == 0) {
                i = aueh.a.a((Object) aump).a(aump);
                aump.S = i;
            }
        } else {
            i = 0;
        }
        int i5 = (i3 ^ i) * 1000003;
        aukf aukf = this.e;
        if (aukf != null && (i4 = aukf.S) == 0) {
            i4 = aueh.a.a((Object) aukf).a(aukf);
            aukf.S = i4;
        }
        long j = this.f;
        int i6 = this.g;
        long j2 = this.h;
        return ((((((i5 ^ i4) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i6) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        long j = this.f;
        int i = this.g;
        long j2 = this.h;
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 172 + length2 + length3 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Subscription{appId=");
        sb.append(str);
        sb.append(", account=");
        sb.append(valueOf);
        sb.append(", channelId=");
        sb.append(valueOf2);
        sb.append(", syncPolicy=");
        sb.append(valueOf3);
        sb.append(", channelFilter=");
        sb.append(valueOf4);
        sb.append(", elapsedRealtime=");
        sb.append(j);
        sb.append(", bootCount=");
        sb.append(i);
        sb.append(", currentTimeMillis=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
