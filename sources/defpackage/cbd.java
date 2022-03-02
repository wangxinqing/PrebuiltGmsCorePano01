package defpackage;

/* renamed from: cbd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cbd extends jus {
    public final atkp a;

    public cbd(atkp atkp) {
        iva.a((Object) atkp);
        this.a = atkp;
    }

    public final int a() {
        int a2 = atko.a(this.a.b);
        if (a2 == 0) {
            a2 = 1;
        }
        return a2 - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(a()));
        int a2 = a();
        if (a2 == 1) {
            sb.append(" durn=");
            int a3 = a();
            if (a3 == 1) {
                sb.append(this.a.c);
            } else {
                String valueOf = String.valueOf(Integer.toString(a3));
                throw new IllegalStateException(valueOf.length() == 0 ? new String("No duration for type ") : "No duration for type ".concat(valueOf));
            }
        } else if (a2 == 2) {
            sb.append(" cnt=");
            int a4 = a();
            if (a4 == 2) {
                sb.append((long) this.a.d);
            } else {
                String valueOf2 = String.valueOf(Integer.toString(a4));
                throw new IllegalStateException(valueOf2.length() == 0 ? new String("No count for type ") : "No count for type ".concat(valueOf2));
            }
        }
        return sb.toString();
    }
}
