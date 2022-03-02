package defpackage;

/* renamed from: arwm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class arwm implements Runnable {
    public final String m;

    public arwm(String str) {
        this.m = str;
    }

    public final String toString() {
        String str = this.m;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 10);
        sb.append("Runnable[");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
