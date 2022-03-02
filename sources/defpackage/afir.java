package defpackage;

import android.accounts.Account;
import java.util.Arrays;

/* renamed from: afir  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afir extends afiu {
    public final String a;
    public final Account b;
    public final byte[] c;

    public afir(String str, Account account, byte[] bArr) {
        if (str != null) {
            this.a = str;
            if (account != null) {
                this.b = account;
                if (bArr != null) {
                    this.c = bArr;
                    return;
                }
                throw new NullPointerException("Null channelId");
            }
            throw new NullPointerException("Null account");
        }
        throw new NullPointerException("Null action");
    }

    public final String a() {
        return this.a;
    }

    public final Account b() {
        return this.b;
    }

    public final byte[] c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afiu) {
            afiu afiu = (afiu) obj;
            if (this.a.equals(afiu.a()) && this.b.equals(afiu.b())) {
                if (Arrays.equals(this.c, afiu instanceof afir ? ((afir) afiu).c : afiu.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ Arrays.hashCode(this.c);
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String arrays = Arrays.toString(this.c);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 54 + String.valueOf(valueOf).length() + String.valueOf(arrays).length());
        sb.append("MdhBroadcastListenerKey{action=");
        sb.append(str);
        sb.append(", account=");
        sb.append(valueOf);
        sb.append(", channelId=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
