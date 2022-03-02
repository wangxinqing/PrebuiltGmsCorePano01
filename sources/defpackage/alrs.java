package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: alrs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alrs {
    public final alrt a;
    public final alyv b;
    public final List c;
    public final List d;
    public final String e;

    public alrs(alrt alrt, alyv alyv, List list, Collection collection, String str) {
        alys.a((Object) alrt, "otManagerState");
        this.a = alrt;
        alys.a((Object) alyv, "documentAcl");
        this.b = alyv;
        alys.a((Object) list, "snapshot");
        this.c = list;
        this.d = Collections.unmodifiableList(new ArrayList(collection));
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof alrs)) {
            alrs alrs = (alrs) obj;
            List list = this.d;
            if (list != null) {
                if (!list.equals(alrs.d)) {
                    return false;
                }
            } else if (alrs.d != null) {
                return false;
            }
            if (this.a.equals(alrs.a)) {
                List list2 = this.c;
                if (list2 != null) {
                    if (!list2.equals(alrs.c)) {
                        return false;
                    }
                } else if (alrs.c != null) {
                    return false;
                }
                String str = this.e;
                if (str != null) {
                    if (!str.equals(alrs.e)) {
                        return false;
                    }
                } else if (alrs.e != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.d;
        int i = 0;
        int hashCode = ((((((list != null ? list.hashCode() : 0) + 31) * 31) + this.b.hashCode()) * 31) + this.a.hashCode()) * 31;
        List list2 = this.c;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String str = this.e;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 90 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(str).length());
        sb.append("InitialLoadResult [otManagerState=");
        sb.append(valueOf);
        sb.append(", documentAcl=");
        sb.append(valueOf2);
        sb.append(", snapshot=");
        sb.append(valueOf3);
        sb.append(", initialSessions=");
        sb.append(valueOf4);
        sb.append(", xsrfToken=");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
