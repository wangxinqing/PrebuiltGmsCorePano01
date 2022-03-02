package defpackage;

import android.accounts.Account;

/* renamed from: aezw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aezw extends aezx {
    private final aulm a;
    private final aukh b;
    private final Account c;
    private final boolean d;
    private final boolean e;

    public aezw(aulm aulm, aukh aukh, Account account, boolean z, boolean z2) {
        if (aulm != null) {
            this.a = aulm;
            if (aukh != null) {
                this.b = aukh;
                this.c = account;
                this.d = z;
                this.e = z2;
                return;
            }
            throw new NullPointerException("Null channelId");
        }
        throw new NullPointerException("Null identity");
    }

    public final aulm a() {
        return this.a;
    }

    public final aukh b() {
        return this.b;
    }

    public final Account c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        r1 = r4.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r4) goto L_0x004a
            boolean r1 = r5 instanceof defpackage.aezx
            r2 = 0
            if (r1 == 0) goto L_0x0049
            aezx r5 = (defpackage.aezx) r5
            aulm r1 = r4.a
            aulm r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
            aukh r1 = r4.b
            aukh r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
            android.accounts.Account r1 = r4.c
            if (r1 == 0) goto L_0x0031
            android.accounts.Account r3 = r5.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0031:
            android.accounts.Account r1 = r5.c()
            if (r1 == 0) goto L_0x0038
        L_0x0037:
            goto L_0x0049
        L_0x0038:
            boolean r1 = r4.d
            boolean r3 = r5.d()
            if (r1 != r3) goto L_0x0049
            boolean r1 = r4.e
            boolean r5 = r5.e()
            if (r1 != r5) goto L_0x0049
            return r0
        L_0x0049:
            return r2
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aezw.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        aulm aulm = this.a;
        int i = aulm.S;
        if (i == 0) {
            i = aueh.a.a((Object) aulm).a(aulm);
            aulm.S = i;
        }
        int i2 = (i ^ 1000003) * 1000003;
        aukh aukh = this.b;
        int i3 = aukh.S;
        if (i3 == 0) {
            i3 = aueh.a.a((Object) aukh).a(aukh);
            aukh.S = i3;
        }
        int i4 = (i2 ^ i3) * 1000003;
        Account account = this.c;
        int i5 = 1237;
        int hashCode = (((i4 ^ (account != null ? account.hashCode() : 0)) * 1000003) ^ (!this.d ? 1237 : 1231)) * 1000003;
        if (this.e) {
            i5 = 1231;
        }
        return hashCode ^ i5;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        boolean z2 = this.e;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 82 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ChannelNotification{identity=");
        sb.append(valueOf);
        sb.append(", channelId=");
        sb.append(valueOf2);
        sb.append(", account=");
        sb.append(valueOf3);
        sb.append(", updated=");
        sb.append(z);
        sb.append(", deleted=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
