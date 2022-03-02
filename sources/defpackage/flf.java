package defpackage;

/* renamed from: flf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class flf {
    public final String a;
    public final Object b;
    protected final amqt c;

    protected flf(String str, Object obj, amqt amqt) {
        iva.c(str);
        this.a = str;
        this.b = obj;
        iva.a((Object) amqt);
        this.c = amqt;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 9);
        sb.append("Setting<");
        sb.append(str);
        sb.append(">");
        return sb.toString();
    }
}
