package defpackage;

/* renamed from: how  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class how {
    protected final int a;

    public how(int i) {
        if (i > 0) {
            this.a = i;
            return;
        }
        StringBuilder sb = new StringBuilder(22);
        sb.append("bad alias: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof how) && this.a == ((how) obj).a;
        }
        return true;
    }
}
