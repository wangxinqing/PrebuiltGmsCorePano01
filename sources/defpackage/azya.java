package defpackage;

/* renamed from: azya  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azya {
    public final azxz a;
    public final babj b;

    public azya(azxz azxz, babj babj) {
        amrl.a((Object) azxz, (Object) "state is null");
        this.a = azxz;
        amrl.a((Object) babj, (Object) "status is null");
        this.b = babj;
    }

    public static azya a(azxz azxz) {
        boolean z;
        if (azxz != azxz.TRANSIENT_FAILURE) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z, (Object) "state is TRANSIENT_ERROR. Use forError() instead");
        return new azya(azxz, babj.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof azya) {
            azya azya = (azya) obj;
            if (!this.a.equals(azya.a) || !this.b.equals(azya.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        if (this.b.a()) {
            return this.a.toString();
        }
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
