package defpackage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: anjv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anjv extends LogRecord implements anja {
    private final anir a;

    public anjv(anir anir) {
        super(anir.c(), (String) null);
        this.a = anir;
        anhy f = anir.f();
        setSourceClassName(f.a());
        setSourceMethodName(f.b());
        setLoggerName(anir.e());
        setMillis(TimeUnit.NANOSECONDS.toMillis(anir.d()));
    }

    public static void a(anir anir, StringBuilder sb) {
        sb.append("  original message: ");
        if (anir.g() == null) {
            sb.append(anir.i());
        } else {
            sb.append(anir.g().b);
            sb.append("\n  original arguments:");
            for (Object a2 : anir.h()) {
                sb.append("\n    ");
                sb.append(anjb.a(a2));
            }
        }
        aniv k = anir.k();
        if (k.a() > 0) {
            sb.append("\n  metadata:");
            for (int i = 0; i < k.a(); i++) {
                sb.append("\n    ");
                sb.append(k.a(i).a);
                sb.append(": ");
                sb.append(k.b(i));
            }
        }
        sb.append("\n  level: ");
        sb.append(anir.c());
        sb.append("\n  timestamp (nanos): ");
        sb.append(anir.d());
        sb.append("\n  class: ");
        sb.append(anir.f().a());
        sb.append("\n  method: ");
        sb.append(anir.f().b());
        sb.append("\n  line number: ");
        sb.append(anir.f().c());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" {\n  message: ");
        sb.append(getMessage());
        sb.append("\n  arguments: ");
        sb.append(getParameters() != null ? Arrays.asList(getParameters()) : "<none>");
        sb.append(10);
        a(this.a, sb);
        sb.append("\n}");
        return sb.toString();
    }

    public anjv(anir anir, byte[] bArr) {
        this(anir);
        anjb.a(anir, (anja) this);
    }

    public final void a(Level level, String str, Throwable th) {
        setMessage(str);
        setThrown(th);
    }

    public anjv(RuntimeException runtimeException, anir anir) {
        this(anir);
        setLevel(anir.c().intValue() >= Level.WARNING.intValue() ? anir.c() : Level.WARNING);
        setThrown(runtimeException);
        StringBuilder sb = new StringBuilder("LOGGING ERROR: ");
        sb.append(runtimeException.getMessage());
        sb.append(10);
        a(anir, sb);
        setMessage(sb.toString());
    }
}
