package defpackage;

/* renamed from: jmt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class jmt implements jly {
    public int a = Integer.MAX_VALUE;
    public int b;
    public CharSequence c;

    public int a() {
        return this.b;
    }

    public void a(int i) {
        throw null;
    }

    public void a(CharSequence charSequence) {
        throw null;
    }

    public CharSequence b() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    public boolean d() {
        return true;
    }

    public abstract int e();

    public abstract jms f();

    /* renamed from: a */
    public int compareTo(jly jly) {
        return jlx.a(this, jly);
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        int hashCode = hashCode();
        int c2 = c();
        String valueOf = String.valueOf(b());
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 25 + String.valueOf(valueOf).length());
        sb.append(simpleName);
        sb.append("@");
        sb.append(hashCode);
        sb.append(":");
        sb.append(c2);
        sb.append(":");
        sb.append(valueOf);
        return sb.toString();
    }
}
