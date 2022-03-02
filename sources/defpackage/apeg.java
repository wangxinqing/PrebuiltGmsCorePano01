package defpackage;

import java.util.Locale;

/* renamed from: apeg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class apeg {
    protected apeg() {
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract apei d();

    public final String toString() {
        return String.format(Locale.US, "StringPoolSpan{%s, start=%d, stop=%d}", new Object[]{d().a(a()), Integer.valueOf(b()), Integer.valueOf(c())});
    }
}
