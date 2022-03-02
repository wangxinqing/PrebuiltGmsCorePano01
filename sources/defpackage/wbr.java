package defpackage;

import android.accounts.Account;

/* renamed from: wbr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wbr extends wbn {
    public final Account a;
    public final String b;

    public wbr(Account account, String str) {
        this.a = account;
        this.b = str;
    }

    public final Account a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wbn) {
            wbn wbn = (wbn) obj;
            return this.a.equals(wbn.a()) && this.b.equals(wbn.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33 + String.valueOf(str).length());
        sb.append("AccountInfo{account=");
        sb.append(valueOf);
        sb.append(", accountId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
