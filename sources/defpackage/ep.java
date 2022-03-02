package defpackage;

import java.util.List;

/* renamed from: ep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ep {
    public final String a;
    public final boolean b;
    public final List c;

    public ep(String str, boolean z, List list) {
        this.a = str;
        this.b = z;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ep) {
            ep epVar = (ep) obj;
            if (this.b == epVar.b && this.c.equals(epVar.c)) {
                if (this.a.startsWith("index_")) {
                    return epVar.a.startsWith("index_");
                }
                return this.a.equals(epVar.a);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (!this.a.startsWith("index_")) {
            i = this.a.hashCode();
        } else {
            i = -1184239155;
        }
        return (((i * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Index{name='" + this.a + "', unique=" + this.b + ", columns=" + this.c + '}';
    }
}
