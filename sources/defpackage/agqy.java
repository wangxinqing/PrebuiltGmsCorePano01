package defpackage;

import android.content.Context;

/* renamed from: agqy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agqy extends agrh {
    public final Context a;
    public final String b;
    public final aekn c;
    public final agop d;
    private final agrf e;
    private final agqv f;

    public agqy(Context context, String str, aekn aekn, agop agop, agrf agrf, agqv agqv) {
        this.a = context;
        this.b = str;
        this.c = aekn;
        this.d = agop;
        this.e = agrf;
        this.f = agqv;
    }

    public final Context a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final aekn c() {
        return this.c;
    }

    public final agop d() {
        return this.d;
    }

    public final agrf e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agrh) {
            agrh agrh = (agrh) obj;
            return this.a.equals(agrh.a()) && this.b.equals(agrh.b()) && this.c.equals(agrh.c()) && this.d.equals(agrh.d()) && this.e.equals(agrh.e()) && this.f.equals(agrh.f());
        }
    }

    public final agqv f() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 79 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("Deps{context=");
        sb.append(valueOf);
        sb.append(", instanceId=");
        sb.append(str);
        sb.append(", clock=");
        sb.append(valueOf2);
        sb.append(", loggerFactory=");
        sb.append(valueOf3);
        sb.append(", facsClientFactory=");
        sb.append(valueOf4);
        sb.append(", flags=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
