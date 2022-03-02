package defpackage;

/* renamed from: ankg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ankg {
    public final int a;
    public final anin b;

    protected ankg(anin anin, int i) {
        if (anin == null) {
            throw new IllegalArgumentException("format options cannot be null");
        } else if (i >= 0) {
            this.a = i;
            this.b = anin;
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("invalid index: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public abstract void a(ankh ankh, Object obj);
}
