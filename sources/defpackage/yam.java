package defpackage;

import java.util.List;

/* renamed from: yam  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yam extends yao {
    private final amzy a;
    private final String b;
    private final boolean c;

    public yam(amzy amzy, String str, boolean z) {
        if (amzy != null) {
            this.a = amzy;
            if (str != null) {
                this.b = str;
                this.c = z;
                return;
            }
            throw new NullPointerException("Null token");
        }
        throw new NullPointerException("Null dataItems");
    }

    public final amzy a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yao) {
            yao yao = (yao) obj;
            return anda.a((List) this.a, (Object) yao.a()) && this.b.equals(yao.b()) && this.c == yao.c();
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (!this.c ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42 + str.length());
        sb.append("Page{dataItems=");
        sb.append(valueOf);
        sb.append(", token=");
        sb.append(str);
        sb.append(", isLastPage=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
