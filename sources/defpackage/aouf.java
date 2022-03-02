package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: aouf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aouf implements aoud {
    private final aoui a;
    private final Class b;

    public aouf(aoui aoui, Class cls) {
        if (aoui.b().contains(cls) || Void.class.equals(cls)) {
            this.a = aoui;
            this.b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{aoui.toString(), cls.getName()}));
    }

    private final Object b(audx audx) {
        if (!Void.class.equals(this.b)) {
            this.a.a(audx);
            return this.a.a(audx, this.b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    private final aoue c() {
        return new aoue(this.a.c());
    }

    public final Object a(auay auay) {
        try {
            return b(this.a.a(auay));
        } catch (auda e) {
            String valueOf = String.valueOf(this.a.a.getName());
            throw new GeneralSecurityException(valueOf.length() == 0 ? new String("Failures parsing proto of type ") : "Failures parsing proto of type ".concat(valueOf), e);
        }
    }

    public final Class b() {
        return this.b;
    }

    public final aoyu c(auay auay) {
        try {
            audx a2 = c().a(auay);
            aucd o = aoyu.d.o();
            String a3 = a();
            if (o.c) {
                o.c();
                o.c = false;
            }
            a3.getClass();
            ((aoyu) o.b).a = a3;
            auay au = a2.au();
            if (o.c) {
                o.c();
                o.c = false;
            }
            au.getClass();
            ((aoyu) o.b).b = au;
            int d = this.a.d();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ((aoyu) o.b).c = aoyt.a(d);
            return (aoyu) o.i();
        } catch (auda e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    public final Object a(audx audx) {
        String valueOf = String.valueOf(this.a.a.getName());
        String str = valueOf.length() == 0 ? new String("Expected proto of type ") : "Expected proto of type ".concat(valueOf);
        if (this.a.a.isInstance(audx)) {
            return b(audx);
        }
        throw new GeneralSecurityException(str);
    }

    public final audx b(auay auay) {
        try {
            return c().a(auay);
        } catch (auda e) {
            String valueOf = String.valueOf(this.a.c().a.getName());
            throw new GeneralSecurityException(valueOf.length() == 0 ? new String("Failures parsing proto of type ") : "Failures parsing proto of type ".concat(valueOf), e);
        }
    }

    public final String a() {
        return this.a.a();
    }
}
