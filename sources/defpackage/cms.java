package defpackage;

import android.content.Context;

/* renamed from: cms  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cms extends cmx {
    public final Context a;
    public final cpp b;
    public final cpp c;
    private final String d;

    public cms(Context context, cpp cpp, cpp cpp2, String str) {
        if (context != null) {
            this.a = context;
            this.b = cpp;
            this.c = cpp2;
            if (str != null) {
                this.d = str;
                return;
            }
            throw new NullPointerException("Null backendName");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public final Context a() {
        return this.a;
    }

    public final cpp b() {
        return this.b;
    }

    public final cpp c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cmx) {
            cmx cmx = (cmx) obj;
            return this.a.equals(cmx.a()) && this.b.equals(cmx.b()) && this.c.equals(cmx.c()) && this.d.equals(cmx.d());
        }
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String str = this.d;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 79 + length2 + String.valueOf(valueOf3).length() + str.length());
        sb.append("CreationContext{applicationContext=");
        sb.append(valueOf);
        sb.append(", wallClock=");
        sb.append(valueOf2);
        sb.append(", monotonicClock=");
        sb.append(valueOf3);
        sb.append(", backendName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
