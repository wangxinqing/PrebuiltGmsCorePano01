package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: azyx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azyx {
    private static final AtomicLong b = new AtomicLong();
    public final long a;
    private final String c;
    private final String d;

    public azyx(String str, String str2, long j) {
        amrl.a((Object) str, (Object) "typeName");
        amrl.a(!str.isEmpty(), (Object) "empty type");
        this.c = str;
        this.d = str2;
        this.a = j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.c;
        long j = this.a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 22);
        sb2.append(str);
        sb2.append("<");
        sb2.append(j);
        sb2.append(">");
        sb.append(sb2.toString());
        if (this.d != null) {
            sb.append(": (");
            sb.append(this.d);
            sb.append(')');
        }
        return sb.toString();
    }

    public static azyx a(Class cls, String str) {
        amrl.a((Object) cls, (Object) "type");
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return a(simpleName, str);
    }

    public static azyx a(String str, String str2) {
        return new azyx(str, str2, b.incrementAndGet());
    }
}
