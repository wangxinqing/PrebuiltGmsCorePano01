package defpackage;

/* renamed from: lmv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lmv {
    private static final ith a = new ith("JsonValues", "");

    static Object a(String str) {
        try {
            return new alze(str).a((alzf) alzc.a);
        } catch (IllegalArgumentException e) {
            a.b("JsonValues", String.format("Invalid JSON in Realtime data model: %s", new Object[]{str}), (Throwable) e);
            return null;
        }
    }
}
