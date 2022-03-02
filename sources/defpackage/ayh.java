package defpackage;

/* renamed from: ayh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayh implements ayc {
    public final boolean a;
    public final int b;

    public ayh(int i, boolean z) {
        this.b = i;
        this.a = z;
    }

    public final avu a(avc avc, ayu ayu) {
        if (avc.j) {
            return new awd(this);
        }
        bay.a("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MergePaths{mode=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "EXCLUDE_INTERSECTIONS" : "INTERSECT" : "SUBTRACT" : "ADD" : "MERGE");
        sb.append('}');
        return sb.toString();
    }
}
