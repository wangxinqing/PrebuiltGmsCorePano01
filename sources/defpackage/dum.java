package defpackage;

/* renamed from: dum  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dum {
    private static final dum d = new dum(-1, -1, -1);
    public final long a;
    public final long b;
    private final int c;

    private dum(int i, long j, long j2) {
        if (!(i == -1 || i == 0)) {
            i = 1;
        }
        iva.b(true);
        this.c = i;
        this.a = j;
        this.b = j2;
    }

    public static dum a(String[] strArr) {
        int i;
        if (strArr != null && strArr.length >= 3) {
            if ("documents".equals(strArr[0])) {
                i = 0;
            } else if ("tags".equals(strArr[0])) {
                i = 1;
            }
            try {
                long parseLong = Long.parseLong(strArr[1]);
                long parseLong2 = Long.parseLong(strArr[2]);
                return (parseLong < 0 || parseLong2 < 1) ? d : new dum(i, parseLong, parseLong2);
            } catch (NumberFormatException e) {
            }
        }
        return d;
    }

    public final boolean a() {
        return this.c == 0;
    }

    public final boolean b() {
        return this.c == 1;
    }

    public final boolean c() {
        return this.a == 0 && (a() || b());
    }

    public final String toString() {
        int i = this.c;
        if (i == -1) {
            return "SyncQuery[type=Unrecognized]";
        }
        String str = i != 0 ? "Tags" : "Documents";
        long j = this.a;
        long j2 = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 76);
        sb.append("SyncQuery[type=");
        sb.append(str);
        sb.append(", lastSeqNo=");
        sb.append(j);
        sb.append(", limit=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }
}
