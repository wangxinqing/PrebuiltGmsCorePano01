package defpackage;

import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: ammu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ammu extends ammq {
    private static final long serialVersionUID = 4556936364828217687L;
    private final Object a;
    private Map b;
    private ammr c;

    protected ammu() {
        this((ammr) null);
    }

    private final boolean b() {
        return this.b == null;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }

    public final Map a() {
        Map map;
        synchronized (this.a) {
            if (!b()) {
                map = this.b;
                amrl.a((Object) map, (Object) "requestMetadata");
            } else {
                synchronized (this.a) {
                    this.b = null;
                    this.c = null;
                    throw new IllegalStateException("OAuth2Credentials instance does not support refreshing the access token. An instance with a new access token should be used, or a derived type that supports refreshing.");
                }
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ammu) {
            ammu ammu = (ammu) obj;
            if (!Objects.equals(this.b, ammu.b) || !Objects.equals(this.c, ammu.c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.b, this.c});
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("requestMetadata", (Object) this.b);
        a2.a("temporaryAccess", (Object) this.c);
        return a2.toString();
    }

    @Deprecated
    public ammu(ammr ammr) {
        this.a = new byte[0];
        if (ammr != null) {
            this.c = ammr;
            String valueOf = String.valueOf(ammr.a);
            this.b = Collections.singletonMap("Authorization", Collections.singletonList(valueOf.length() == 0 ? new String("Bearer ") : "Bearer ".concat(valueOf)));
        }
    }

    public final void a(Executor executor, baca baca) {
        synchronized (this.a) {
            if (!b()) {
                Map map = this.b;
                amrl.a((Object) map, (Object) "cached requestMetadata");
                baca.a(map);
                return;
            }
            executor.execute(new ammp(this, baca));
        }
    }
}
