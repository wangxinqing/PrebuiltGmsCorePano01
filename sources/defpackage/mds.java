package defpackage;

import android.accounts.Account;

/* renamed from: mds  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mds extends mei {
    private final Account a;

    public mds(Account account) {
        if (account != null) {
            this.a = account;
            return;
        }
        throw new NullPointerException("Null account");
    }

    public final Account b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mei) {
            return this.a.equals(((mei) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("FacsInternalSyncOptions{account=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
