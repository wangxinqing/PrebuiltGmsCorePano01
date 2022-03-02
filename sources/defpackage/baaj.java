package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: baaj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baaj {
    public final baai a;
    public final String b;
    public final String c;
    public final baah d;
    public final baah e;
    private final boolean f;

    public baaj(baai baai, String str, baah baah, baah baah2, boolean z) {
        String str2;
        new AtomicReferenceArray(2);
        amrl.a((Object) baai, (Object) "type");
        this.a = baai;
        amrl.a((Object) str, (Object) "fullMethodName");
        this.b = str;
        amrl.a((Object) str, (Object) "fullMethodName");
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf != -1) {
            str2 = str.substring(0, lastIndexOf);
        } else {
            str2 = null;
        }
        this.c = str2;
        amrl.a((Object) baah, (Object) "requestMarshaller");
        this.d = baah;
        amrl.a((Object) baah2, (Object) "responseMarshaller");
        this.e = baah2;
        this.f = z;
    }

    public static baag a() {
        baag baag = new baag();
        baag.a = null;
        baag.b = null;
        return baag;
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("fullMethodName", (Object) this.b);
        a2.a("type", (Object) this.a);
        a2.a("idempotent", false);
        a2.a("safe", false);
        a2.a("sampledToLocalTracing", this.f);
        a2.a("requestMarshaller", (Object) this.d);
        a2.a("responseMarshaller", (Object) this.e);
        a2.a("schemaDescriptor", (Object) null);
        a2.a();
        return a2.toString();
    }

    @Deprecated
    public static baaj a(baai baai, String str, baah baah, baah baah2) {
        return new baaj(baai, str, baah, baah2, false);
    }

    public static String a(String str, String str2) {
        amrl.a((Object) str, (Object) "fullServiceName");
        amrl.a((Object) str2, (Object) "methodName");
        StringBuilder sb = new StringBuilder(str.length() + 1 + str2.length());
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return sb.toString();
    }
}
