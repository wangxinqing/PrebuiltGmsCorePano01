package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: ahcy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahcy extends ahef {
    public final Uri a;
    public final audx b;
    public final amzy c;
    public final ahfm d;
    public final aubs e;
    public final ahga f;

    public ahcy(Uri uri, audx audx, ahga ahga, amzy amzy, ahfm ahfm, aubs aubs) {
        this.a = uri;
        this.b = audx;
        this.f = ahga;
        this.c = amzy;
        this.d = ahfm;
        this.e = aubs;
    }

    public final Uri a() {
        return this.a;
    }

    public final audx b() {
        return this.b;
    }

    public final amzy c() {
        return this.c;
    }

    public final ahfm d() {
        return this.d;
    }

    public final aubs e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahef) {
            ahef ahef = (ahef) obj;
            return this.a.equals(ahef.a()) && this.b.equals(ahef.b()) && this.f.equals(ahef.f()) && anda.a((List) this.c, (Object) ahef.c()) && this.d.equals(ahef.d()) && this.e.equals(ahef.e());
        }
    }

    public final ahga f() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.c);
        String valueOf5 = String.valueOf(this.d);
        String valueOf6 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 94 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("ProtoDataStoreConfig{uri=");
        sb.append(valueOf);
        sb.append(", schema=");
        sb.append(valueOf2);
        sb.append(", handler=");
        sb.append(valueOf3);
        sb.append(", migrations=");
        sb.append(valueOf4);
        sb.append(", variantConfig=");
        sb.append(valueOf5);
        sb.append(", extensionRegistry=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}
