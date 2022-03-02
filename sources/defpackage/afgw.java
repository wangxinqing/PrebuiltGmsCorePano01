package defpackage;

import android.accounts.Account;

/* renamed from: afgw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afgw extends afgy {
    private final Account a;
    private final String b;

    public afgw(Account account, String str) {
        if (account != null) {
            this.a = account;
            if (str != null) {
                this.b = str;
                return;
            }
            throw new NullPointerException("Null channelKey");
        }
        throw new NullPointerException("Null account");
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
        if (obj instanceof afgy) {
            afgy afgy = (afgy) obj;
            return this.a.equals(afgy.a()) && this.b.equals(afgy.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40 + str.length());
        sb.append("AccountChannelKey{account=");
        sb.append(valueOf);
        sb.append(", channelKey=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
