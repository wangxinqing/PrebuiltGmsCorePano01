package defpackage;

/* renamed from: anif  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anif {
    public final String a;
    private final Class b;

    protected anif(String str, Class cls) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("identifier must not be empty");
        } else if (!ankq.a(str.charAt(0))) {
            throw new IllegalArgumentException(str.length() == 0 ? new String("identifier must start with an ASCII letter: ") : "identifier must start with an ASCII letter: ".concat(str));
        } else {
            for (int i = 1; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!ankq.a(charAt) && ((charAt < '0' || charAt > '9') && charAt != '_')) {
                    throw new IllegalArgumentException(str.length() == 0 ? new String("identifier must contain only ASCII letters, digits or underscore: ") : "identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                }
            }
            this.a = str;
            ankq.a(cls, "class");
            this.b = cls;
        }
    }

    public static anif a(String str, Class cls) {
        return new anif(str, cls);
    }

    public final String toString() {
        String name = getClass().getName();
        String str = this.a;
        String name2 = this.b.getName();
        int length = String.valueOf(name).length();
        StringBuilder sb = new StringBuilder(length + 3 + str.length() + String.valueOf(name2).length());
        sb.append(name);
        sb.append("/");
        sb.append(str);
        sb.append("[");
        sb.append(name2);
        sb.append("]");
        return sb.toString();
    }

    public final Object a(Object obj) {
        return this.b.cast(obj);
    }
}
