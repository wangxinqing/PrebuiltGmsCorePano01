package defpackage;

import android.accounts.Account;

/* renamed from: aere  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aere extends aerd {
    public final Account a;
    public final aukh b;

    public aere(Account account, aukh aukh) {
        if (account != null) {
            this.a = account;
            if (aukh != null) {
                this.b = aukh;
                return;
            }
            throw new NullPointerException("Null channelId");
        }
        throw new NullPointerException("Null account");
    }

    public final Account a() {
        return this.a;
    }

    public final aukh b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aerd) {
            aerd aerd = (aerd) obj;
            return this.a.equals(aerd.a()) && this.b.equals(aerd.b());
        }
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        aukh aukh = this.b;
        int i = aukh.S;
        if (i == 0) {
            i = aueh.a.a((Object) aukh).a(aukh);
            aukh.S = i;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41 + String.valueOf(valueOf2).length());
        sb.append("AccountChannelIdKey{account=");
        sb.append(valueOf);
        sb.append(", channelId=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
