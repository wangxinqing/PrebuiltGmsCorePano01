package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: en  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class en {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public en(String str, String str2, String str3, List list, List list2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = Collections.unmodifiableList(list);
        this.e = Collections.unmodifiableList(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof en) {
            en enVar = (en) obj;
            if (this.a.equals(enVar.a) && this.b.equals(enVar.b) && this.c.equals(enVar.c) && this.d.equals(enVar.d)) {
                return this.e.equals(enVar.e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.a + "', onDelete='" + this.b + "', onUpdate='" + this.c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.e + '}';
    }
}
