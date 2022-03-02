package defpackage;

/* renamed from: angn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class angn extends anax {
    final transient Object a;
    private transient int b;

    public angn(Object obj) {
        amrl.a(obj);
        this.a = obj;
    }

    public final int a(Object[] objArr, int i) {
        objArr[i] = this.a;
        return i + 1;
    }

    public final boolean contains(Object obj) {
        return this.a.equals(obj);
    }

    public final boolean f() {
        return false;
    }

    public final boolean g() {
        return this.b != 0;
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int hashCode = this.a.hashCode();
        this.b = hashCode;
        return hashCode;
    }

    public final amzy i() {
        return amzy.a(this.a);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.a.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    public angn(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    /* renamed from: a */
    public final anhj iterator() {
        return new anbx(this.a);
    }
}
