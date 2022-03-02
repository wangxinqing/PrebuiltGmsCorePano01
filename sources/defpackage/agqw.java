package defpackage;

import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Pattern;

/* renamed from: agqw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agqw {
    public final agrg a;

    public agqw() {
        agrg agrg = new agrg();
        agrg.e = agrf.a;
        this.a = agrg;
        agrg.c = new aekp();
    }

    public final agqu a() {
        this.a.f = new agqv();
        agrg agrg = this.a;
        Context context = agrg.a;
        if (context != null) {
            agrg.d = new agop(context);
            agrg agrg2 = this.a;
            String str = agrg2.a == null ? " context" : "";
            if (agrg2.b == null) {
                str = str.concat(" instanceId");
            }
            if (agrg2.c == null) {
                str = String.valueOf(str).concat(" clock");
            }
            if (agrg2.d == null) {
                str = String.valueOf(str).concat(" loggerFactory");
            }
            if (agrg2.e == null) {
                str = String.valueOf(str).concat(" facsClientFactory");
            }
            if (agrg2.f == null) {
                str = String.valueOf(str).concat(" flags");
            }
            if (str.isEmpty()) {
                return new agri(new agqy(agrg2.a, agrg2.b, agrg2.c, agrg2.d, agrg2.e, agrg2.f));
            }
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        }
        throw new IllegalStateException("Property \"context\" has not been set");
    }

    @Deprecated
    public final void a(String str) {
        this.a.b = str;
    }

    public final void b(String str) {
        amrl.a(Pattern.matches("[a-z]+", str), "Module must be non-empty and [a-z]: %s", (Object) str);
        amrl.a(!Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"default", "unused", "special", "reserved", "shared", "virtual", "managed"}))).contains(str), "Module name is reserved and cannot be used: %s", (Object) str);
        this.a.b = str;
    }

    public final void a(Context context) {
        agrg agrg = this.a;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            agrg.a = applicationContext;
            return;
        }
        throw new NullPointerException("Null context");
    }
}
