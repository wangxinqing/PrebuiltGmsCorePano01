package defpackage;

import java.util.List;

/* renamed from: grw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class grw extends gsc {
    public final String a;
    public final int b;
    public final List c;

    public grw(String str, int i, List list) {
        if (str != null) {
            this.a = str;
            this.b = i;
            if (list != null) {
                this.c = list;
                return;
            }
            throw new NullPointerException("Null value");
        }
        throw new NullPointerException("Null key");
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final List c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gsc) {
            gsc gsc = (gsc) obj;
            return this.a.equals(gsc.a()) && this.b == gsc.b() && this.c.equals(gsc.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(str.length() + 58 + String.valueOf(valueOf).length());
        sb.append("BackupKeyValueEntry{key=");
        sb.append(str);
        sb.append(", valueLength=");
        sb.append(i);
        sb.append(", value=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
