package defpackage;

/* renamed from: awds  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awds implements bapu, awdn {
    private static final Object a = new Object();
    private volatile bapu b;
    private volatile Object c = a;

    private awds(bapu bapu) {
        this.b = bapu;
    }

    public static bapu a(bapu bapu) {
        awdx.a(bapu);
        return !(bapu instanceof awds) ? new awds(bapu) : bapu;
    }

    public static awdn b(bapu bapu) {
        if (bapu instanceof awdn) {
            return (awdn) bapu;
        }
        awdx.a(bapu);
        return new awds(bapu);
    }

    public final Object a() {
        Object obj = this.c;
        if (obj == a) {
            synchronized (this) {
                obj = this.c;
                if (obj == a) {
                    obj = this.b.a();
                    Object obj2 = this.c;
                    if (obj2 != a) {
                        if (!(obj2 instanceof awdw)) {
                            if (obj2 != obj) {
                                String valueOf = String.valueOf(obj2);
                                String valueOf2 = String.valueOf(obj);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
                                sb.append("Scoped provider was invoked recursively returning different results: ");
                                sb.append(valueOf);
                                sb.append(" & ");
                                sb.append(valueOf2);
                                sb.append(". This is likely due to a circular dependency.");
                                throw new IllegalStateException(sb.toString());
                            }
                        }
                    }
                    this.c = obj;
                    this.b = null;
                }
            }
        }
        return obj;
    }
}
