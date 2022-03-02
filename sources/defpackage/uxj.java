package defpackage;

/* renamed from: uxj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uxj {
    public String a;
    public boolean b;
    public String c;
    public int d = -1;

    public final uxk a() {
        return new uxk(this);
    }

    public final void b() {
        this.b = true;
    }

    public final void a(String str) {
        if (!str.startsWith("0p:")) {
            throw new IllegalArgumentException(str.length() == 0 ? new String("Invalid zero party package name: ") : "Invalid zero party package name: ".concat(str));
        }
        this.a = str;
    }
}
