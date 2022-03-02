package defpackage;

import java.util.logging.Level;

/* renamed from: anje  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anje implements anir {
    private final String a;
    private final anir b;

    public anje(RuntimeException runtimeException, anir anir) {
        StringBuilder sb = new StringBuilder("LOGGING ERROR: ");
        sb.append(runtimeException.getMessage());
        sb.append("\n  original message: ");
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
                sb.append(k.a(i));
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
        this.a = sb.toString();
        this.b = anir;
    }

    public final Level c() {
        return this.b.c().intValue() > Level.WARNING.intValue() ? this.b.c() : Level.WARNING;
    }

    public final long d() {
        return this.b.d();
    }

    public final String e() {
        return this.b.e();
    }

    public final anhy f() {
        return this.b.f();
    }

    public final anjd g() {
        return null;
    }

    public final Object[] h() {
        throw new IllegalStateException();
    }

    public final Object i() {
        return this.a;
    }

    public final boolean j() {
        return false;
    }

    public final aniv k() {
        return aniu.a;
    }
}
