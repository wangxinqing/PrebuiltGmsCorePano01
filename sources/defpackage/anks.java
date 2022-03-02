package defpackage;

/* renamed from: anks  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anks extends anhy {
    private final StackTraceElement b;

    public anks(StackTraceElement stackTraceElement) {
        ankq.a(stackTraceElement, "stack element");
        this.b = stackTraceElement;
    }

    public final String a() {
        return this.b.getClassName();
    }

    public final String b() {
        return this.b.getMethodName();
    }

    public final int c() {
        return Math.max(this.b.getLineNumber(), 0);
    }

    public final String d() {
        return this.b.getFileName();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof anks) && this.b.equals(((anks) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
