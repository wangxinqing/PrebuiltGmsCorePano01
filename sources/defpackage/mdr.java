package defpackage;

import android.accounts.Account;

/* renamed from: mdr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mdr extends mdt {
    private final Account a;

    public mdr(Account account) {
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
        if (obj instanceof mdt) {
            return this.a.equals(((mdt) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("FacsCacheOptions{account=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
