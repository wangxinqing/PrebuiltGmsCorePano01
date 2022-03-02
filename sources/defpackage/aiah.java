package defpackage;

/* renamed from: aiah  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiah extends aiav {
    public final int a;
    public final aiaj b;

    private aiah(int i, aibe aibe, aiau aiau, long j, aiaj aiaj, boolean z) {
        super(aibe, aiau, j, z);
        this.a = i;
        this.b = aiaj;
    }

    public static aiah a(int i, aiau aiau, aiaj aiaj) {
        return new aiah(i, (aibe) null, aiau, 0, aiaj, true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb, this);
        return sb.toString();
    }

    public static aiah a(int i, aibe aibe, long j, aiaj aiaj) {
        return new aiah(i, aibe, aiau.OK, j, aiaj, false);
    }

    public static aiah a(aiau aiau, long j, aiaj aiaj) {
        return new aiah(0, (aibe) null, aiau, j, aiaj, false);
    }

    public static void a(StringBuilder sb, aiah aiah) {
        if (aiah != null) {
            sb.append("CellLocatorResult [type=");
            int i = aiah.a;
            sb.append(i != 1 ? i != 2 ? "None" : "CellFingerprint" : "CellPrimaryOnly");
            sb.append(", primary=");
            aiaj.a(sb, aiah.b);
            sb.append("], Cache={}, ");
            aiav.a(sb, aiah);
            sb.append("]");
            return;
        }
        sb.append("null");
    }
}
