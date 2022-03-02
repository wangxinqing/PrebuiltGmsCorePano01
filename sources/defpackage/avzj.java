package defpackage;

import java.io.IOException;
import java.net.URI;
import java.net.URL;

/* renamed from: avzj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avzj {
    public final avzd a;
    public final String b;
    public final avzb c;
    public final avzk d;
    public final Object e;
    public volatile URL f;
    public volatile avyl g;
    private volatile URI h;

    public avzj(avzi avzi) {
        this.a = avzi.a;
        this.b = avzi.b;
        this.c = avzi.c.a();
        this.d = avzi.d;
        Object obj = avzi.e;
        this.e = obj == null ? this : obj;
    }

    public final String a(String str) {
        return this.c.a(str);
    }

    public final avzi b() {
        return new avzi(this);
    }

    public final boolean c() {
        return this.a.a.equals("https");
    }

    public final String toString() {
        String str = this.b;
        String valueOf = String.valueOf(this.a);
        Object obj = this.e;
        if (obj == this) {
            obj = null;
        }
        String valueOf2 = String.valueOf(obj);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 28 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("Request{method=");
        sb.append(str);
        sb.append(", url=");
        sb.append(valueOf);
        sb.append(", tag=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }

    public final URI a() {
        try {
            URI uri = this.h;
            if (uri != null) {
                return uri;
            }
            URI b2 = this.a.b();
            this.h = b2;
            return b2;
        } catch (IllegalStateException e2) {
            throw new IOException(e2.getMessage());
        }
    }
}
