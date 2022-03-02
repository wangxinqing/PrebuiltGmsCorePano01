package defpackage;

import android.accounts.Account;

/* renamed from: apzc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apzc extends apza {
    public final Account a;
    public final String b;

    public apzc(Account account, String str) {
        this.a = account;
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null scope");
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
        if (obj instanceof apza) {
            apza apza = (apza) obj;
            return this.a.equals(apza.a()) && this.b.equals(apza.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33 + str.length());
        sb.append("AccountAndScope{account=");
        sb.append(valueOf);
        sb.append(", scope=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
