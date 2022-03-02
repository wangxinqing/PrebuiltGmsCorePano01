package defpackage;

/* renamed from: anht  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anht extends aniv {
    public Object[] a = new Object[8];
    public int b = 0;

    public final int a() {
        return this.b;
    }

    public final Object b(int i) {
        if (i < this.b) {
            return this.a[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.b; i++) {
            sb.append(" '");
            sb.append(a(i));
            sb.append("': ");
            sb.append(b(i));
        }
        sb.append(" }");
        return sb.toString();
    }

    public final int a(anif anif) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i + i].equals(anif)) {
                return i;
            }
        }
        return -1;
    }

    public final anif a(int i) {
        if (i < this.b) {
            return (anif) this.a[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    public final Object b(anif anif) {
        int a2 = a(anif);
        if (a2 != -1) {
            return anif.a(this.a[a2 + a2 + 1]);
        }
        return null;
    }
}
