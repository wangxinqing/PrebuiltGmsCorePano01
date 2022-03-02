package defpackage;

import java.util.ArrayList;

/* renamed from: akoh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akoh {
    public final long a;
    private final ArrayList b;

    public akoh(long j, ArrayList arrayList) {
        this.a = j;
        this.b = arrayList;
    }

    public final int a() {
        return this.b.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof akoh) {
            akoh akoh = (akoh) obj;
            if (this.a == akoh.a && a() == akoh.a()) {
                for (int i = 0; i < a(); i++) {
                    if (!a(i).equals(akoh.a(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((int) this.a) * 7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WifiScan [deliveryTime=");
        sb.append(this.a);
        sb.append(", devices=[");
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((akog) arrayList.get(i)).toString());
            sb.append(", ");
        }
        sb.append("]]");
        return sb.toString();
    }

    public final akog a(int i) {
        return (akog) this.b.get(i);
    }
}
