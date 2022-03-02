package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: amie  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amie {
    public static final amie a = new amie();
    public String b = "";
    public boolean c = false;
    private List d = Collections.emptyList();

    private amie() {
    }

    public static amid b() {
        return new amid();
    }

    public final List a() {
        return Collections.unmodifiableList(this.d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amie) {
            amie amie = (amie) obj;
            return alyr.a(this.d, amie.d) && alyr.a(this.b, amie.b) && alyr.a(Boolean.valueOf(this.c), Boolean.valueOf(amie.c));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.b, Boolean.valueOf(this.c)});
    }

    public amie(amid amid) {
        this.d = Collections.unmodifiableList(amid.a);
        this.b = amid.b;
        this.c = amid.c;
    }
}
