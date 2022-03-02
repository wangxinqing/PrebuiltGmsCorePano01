package defpackage;

/* renamed from: nue  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nue extends nug {
    final String a;
    final boolean b;

    public nue(amnc amnc) {
        this(amnc, false);
    }

    public final int a() {
        return 3;
    }

    public final String toString() {
        String nug = super.toString();
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(nug).length() + 23);
        sb.append(nug);
        sb.append(" deleted_messages=");
        sb.append(z);
        return sb.toString();
    }

    public nue(amnc amnc, boolean z) {
        super(amnc);
        this.a = amnc.f;
        this.b = z;
    }
}
