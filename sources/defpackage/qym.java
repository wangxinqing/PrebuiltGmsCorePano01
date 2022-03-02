package defpackage;

import android.accounts.Account;

/* renamed from: qym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qym extends raq {
    public final auco a;
    public final boolean b;
    private final Account c;

    public qym(auco auco, Account account, boolean z) {
        if (auco != null) {
            this.a = auco;
            this.c = account;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null syncId");
    }

    public final auco a() {
        return this.a;
    }

    public final Account b() {
        return this.c;
    }

    public final boolean c() {
        return this.b;
    }

    public final String d() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r1 = r4.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r4) goto L_0x003c
            boolean r1 = r5 instanceof defpackage.raq
            r2 = 0
            if (r1 == 0) goto L_0x003b
            raq r5 = (defpackage.raq) r5
            auco r1 = r4.a
            auco r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003b
            android.accounts.Account r1 = r4.c
            if (r1 == 0) goto L_0x0025
            android.accounts.Account r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002b
            goto L_0x002c
        L_0x0025:
            android.accounts.Account r1 = r5.b()
            if (r1 == 0) goto L_0x002c
        L_0x002b:
            goto L_0x003b
        L_0x002c:
            boolean r1 = r4.b
            boolean r3 = r5.c()
            if (r1 != r3) goto L_0x003b
            java.lang.String r5 = r5.d()
            if (r5 != 0) goto L_0x003b
            return r0
        L_0x003b:
            return r2
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qym.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Account account = this.c;
        return (((hashCode ^ (account != null ? account.hashCode() : 0)) * 1000003) ^ (!this.b ? 1237 : 1231)) * 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.c);
        boolean z = this.b;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 64 + String.valueOf(valueOf2).length() + String.valueOf((Object) null).length());
        sb.append("ChannelKey{syncId=");
        sb.append(valueOf);
        sb.append(", accountInternal=");
        sb.append(valueOf2);
        sb.append(", allAccounts=");
        sb.append(z);
        sb.append(", subId=null}");
        return sb.toString();
    }
}
