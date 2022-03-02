package defpackage;

import java.util.List;

/* renamed from: jsc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jsc extends jsb {
    private final amri a;
    private final amri b;
    private final amri c;
    private final amzy d;
    private final amzy e;
    private final amzy f;
    private final amzy g;
    private final amzy h;
    private final amzy i;
    private final amri j;

    public jsc(amri amri, amri amri2, amri amri3, amzy amzy, amzy amzy2, amzy amzy3, amzy amzy4, amzy amzy5, amzy amzy6, amri amri4) {
        this.a = amri;
        this.b = amri2;
        this.c = amri3;
        if (amzy != null) {
            this.d = amzy;
            if (amzy2 != null) {
                this.e = amzy2;
                if (amzy3 != null) {
                    this.f = amzy3;
                    if (amzy4 != null) {
                        this.g = amzy4;
                        if (amzy5 != null) {
                            this.h = amzy5;
                            if (amzy6 != null) {
                                this.i = amzy6;
                                this.j = amri4;
                                return;
                            }
                            throw new NullPointerException("Null userDefined");
                        }
                        throw new NullPointerException("Null sipAddress");
                    }
                    throw new NullPointerException("Null instantMessaging");
                }
                throw new NullPointerException("Null relations");
            }
            throw new NullPointerException("Null links");
        }
        throw new NullPointerException("Null events");
    }

    public final amri a() {
        return this.a;
    }

    public final amri b() {
        return this.b;
    }

    public final amri c() {
        return this.c;
    }

    public final amzy d() {
        return this.d;
    }

    public final amzy e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jsb) {
            jsb jsb = (jsb) obj;
            return this.a.equals(jsb.a()) && this.b.equals(jsb.b()) && this.c.equals(jsb.c()) && anda.a((List) this.d, (Object) jsb.d()) && anda.a((List) this.e, (Object) jsb.e()) && anda.a((List) this.f, (Object) jsb.f()) && anda.a((List) this.g, (Object) jsb.g()) && anda.a((List) this.h, (Object) jsb.h()) && anda.a((List) this.i, (Object) jsb.i()) && this.j.equals(jsb.j());
        }
    }

    public final amzy f() {
        return this.f;
    }

    public final amzy g() {
        return this.g;
    }

    public final amzy h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode();
    }

    public final amzy i() {
        return this.i;
    }

    public final amri j() {
        return this.j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        String valueOf8 = String.valueOf(this.h);
        String valueOf9 = String.valueOf(this.i);
        String valueOf10 = String.valueOf(this.j);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        StringBuilder sb = new StringBuilder(length + 130 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + String.valueOf(valueOf9).length() + String.valueOf(valueOf10).length());
        sb.append("AboutCardData{introduction=");
        sb.append(valueOf);
        sb.append(", birthday=");
        sb.append(valueOf2);
        sb.append(", gender=");
        sb.append(valueOf3);
        sb.append(", events=");
        sb.append(valueOf4);
        sb.append(", links=");
        sb.append(valueOf5);
        sb.append(", relations=");
        sb.append(valueOf6);
        sb.append(", instantMessaging=");
        sb.append(valueOf7);
        sb.append(", sipAddress=");
        sb.append(valueOf8);
        sb.append(", userDefined=");
        sb.append(valueOf9);
        sb.append(", note=");
        sb.append(valueOf10);
        sb.append("}");
        return sb.toString();
    }
}
