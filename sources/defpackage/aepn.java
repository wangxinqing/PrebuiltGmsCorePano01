package defpackage;

import android.accounts.Account;

/* renamed from: aepn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aepn extends aeps {
    private final String a;
    private final Account b;
    private final aukh c;
    private final String d;

    public aepn(String str, Account account, aukh aukh, String str2) {
        if (str != null) {
            this.a = str;
            if (account != null) {
                this.b = account;
                if (aukh != null) {
                    this.c = aukh;
                    if (str2 != null) {
                        this.d = str2;
                        return;
                    }
                    throw new NullPointerException("Null action");
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

    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeps) {
            aeps aeps = (aeps) obj;
            return this.a.equals(aeps.a()) && this.b.equals(aeps.b()) && this.c.equals(aeps.c()) && this.d.equals(aeps.d());
        }
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        aukh aukh = this.c;
        int i = aukh.S;
        if (i == 0) {
            i = aueh.a.a((Object) aukh).a(aukh);
            aukh.S = i;
        }
        return ((hashCode ^ i) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String str2 = this.d;
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 67 + length2 + String.valueOf(valueOf2).length() + str2.length());
        sb.append("CoreBroadcastSubscriptionKey{appId=");
        sb.append(str);
        sb.append(", account=");
        sb.append(valueOf);
        sb.append(", channelId=");
        sb.append(valueOf2);
        sb.append(", action=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
