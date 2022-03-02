package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* renamed from: babj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class babj {
    public static final List a;
    public static final babj b = babg.OK.a();
    public static final babj c = babg.CANCELLED.a();
    public static final babj d = babg.UNKNOWN.a();
    public static final babj e = babg.INVALID_ARGUMENT.a();
    public static final babj f = babg.DEADLINE_EXCEEDED.a();
    public static final babj g = babg.NOT_FOUND.a();
    public static final babj h = babg.ALREADY_EXISTS.a();
    public static final babj i = babg.PERMISSION_DENIED.a();
    public static final babj j = babg.UNAUTHENTICATED.a();
    public static final babj k = babg.RESOURCE_EXHAUSTED.a();
    public static final babj l = babg.FAILED_PRECONDITION.a();
    public static final babj m = babg.ABORTED.a();
    public static final babj n = babg.INTERNAL.a();
    public static final babj o = babg.UNAVAILABLE.a();
    static final baab p = baab.a("grpc-status", false, new babh());
    static final baab q;
    private static final baae u;
    public final babg r;
    public final String s;
    public final Throwable t;

    static {
        Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));
        TreeMap treeMap = new TreeMap();
        babg[] values = babg.values();
        int length = values.length;
        int i2 = 0;
        while (i2 < length) {
            babg babg = values[i2];
            babj babj = (babj) treeMap.put(Integer.valueOf(babg.r), new babj(babg, (String) null, (Throwable) null));
            if (babj == null) {
                i2++;
            } else {
                String name = babj.r.name();
                String name2 = babg.name();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 34 + String.valueOf(name2).length());
                sb.append("Code value duplication between ");
                sb.append(name);
                sb.append(" & ");
                sb.append(name2);
                throw new IllegalStateException(sb.toString());
            }
        }
        a = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        babg.OUT_OF_RANGE.a();
        babg.UNIMPLEMENTED.a();
        babg.DATA_LOSS.a();
        babi babi = new babi();
        u = babi;
        q = baab.a("grpc-message", false, babi);
    }

    private babj(babg babg, String str, Throwable th) {
        amrl.a((Object) babg, (Object) "code");
        this.r = babg;
        this.s = str;
        this.t = th;
    }

    public static babj a(babg babg) {
        return babg.a();
    }

    public final babj b(String str) {
        if (str == null) {
            return this;
        }
        String str2 = this.s;
        if (str2 == null) {
            return new babj(this.r, str, this.t);
        }
        babg babg = this.r;
        StringBuilder sb = new StringBuilder(str2.length() + 1 + str.length());
        sb.append(str2);
        sb.append("\n");
        sb.append(str);
        return new babj(babg, sb.toString(), this.t);
    }

    public final babk c() {
        return new babk(this);
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("code", (Object) this.r.name());
        a2.a("description", (Object) this.s);
        Throwable th = this.t;
        Object obj = th;
        if (th != null) {
            obj = amtb.d(th);
        }
        a2.a("cause", obj);
        return a2.toString();
    }

    public static babj a(Throwable th) {
        amrl.a((Object) th, (Object) "t");
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof babk) {
                return ((babk) th2).a;
            }
            if (th2 instanceof babl) {
                return ((babl) th2).a;
            }
        }
        return d.b(th);
    }

    public final babj b(Throwable th) {
        return !amqx.a(this.t, th) ? new babj(this.r, this.s, th) : this;
    }

    public final babl b() {
        return new babl(this);
    }

    static String a(babj babj) {
        if (babj.s == null) {
            return babj.r.toString();
        }
        String valueOf = String.valueOf(babj.r);
        String str = babj.s;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(": ");
        sb.append(str);
        return sb.toString();
    }

    public final babj a(String str) {
        return !amqx.a(this.s, str) ? new babj(this.r, str, this.t) : this;
    }

    public final babl a(baaf baaf) {
        return new babl(this, baaf);
    }

    public final boolean a() {
        return babg.OK == this.r;
    }
}
