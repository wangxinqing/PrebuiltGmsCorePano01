package defpackage;

/* renamed from: atxy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class atxy {
    public final String a;
    public final boolean b;

    public atxy(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 9);
        sb.append("{");
        sb.append(str);
        sb.append(", ");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
