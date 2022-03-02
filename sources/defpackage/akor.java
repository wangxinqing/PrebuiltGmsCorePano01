package defpackage;

/* renamed from: akor  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akor {
    public final int a;
    public final akop b;
    public final akop c;

    public akor(int i, akop akop, akop akop2) {
        this.a = i;
        this.b = akop;
        this.c = akop2;
    }

    public final String toString() {
        int i = this.a;
        String akop = this.b.toString();
        akop akop2 = this.c;
        String akop3 = akop2 != null ? akop2.toString() : "null";
        StringBuilder sb = new StringBuilder(String.valueOf(akop).length() + 69 + String.valueOf(akop3).length());
        sb.append("SegmenterResult {action=");
        sb.append(i);
        sb.append(" currentSegment=");
        sb.append(akop);
        sb.append(" previousSegment=");
        sb.append(akop3);
        sb.append("}");
        return sb.toString();
    }
}
