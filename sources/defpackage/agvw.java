package defpackage;

import android.net.Uri;

/* renamed from: agvw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agvw {
    final String a;
    final Uri b;
    final String c;
    final String d;
    final boolean e;
    final boolean f;
    final boolean g;
    final boolean h;
    final amqy i;

    public agvw(Uri uri) {
        this((String) null, uri, "", "", false, false, (amqy) null);
    }

    public final agvw a() {
        if (!this.c.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        } else if (this.i == null) {
            return new agvw(this.a, this.b, this.c, this.d, true, this.f, (amqy) null);
        } else {
            throw new IllegalStateException("Cannot skip gservices both always and conditionally");
        }
    }

    public final agvw b() {
        return new agvw(this.a, this.b, this.c, this.d, this.e, true, this.i);
    }

    public agvw(String str) {
        this(str, (Uri) null, "", "", false, false, (amqy) null);
    }

    public final agvw b(String str) {
        return new agvw(this.a, this.b, this.c, str, this.e, this.f, this.i);
    }

    public final agvx c(String str) {
        return agvx.a(this, str, 0.5d);
    }

    private agvw(String str, Uri uri, String str2, String str3, boolean z, boolean z2, amqy amqy) {
        this.a = str;
        this.b = uri;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = false;
        this.h = false;
        this.i = amqy;
    }

    public final agvw a(amqy amqy) {
        if (!this.e) {
            return new agvw(this.a, this.b, this.c, this.d, false, this.f, amqy);
        }
        throw new IllegalStateException("Cannot skip gservices both always and conditionally");
    }

    public final agvw a(String str) {
        if (!this.e) {
            return new agvw(this.a, this.b, str, this.d, false, this.f, this.i);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final agvx a(String str, long j) {
        return agvx.a(this, str, j);
    }

    public final agvx a(String str, Object obj, agvv agvv) {
        return agvx.a(this, str, obj, agvv);
    }

    public final agvx a(String str, String str2) {
        return agvx.a(this, str, str2);
    }

    public final agvx a(String str, boolean z) {
        return agvx.a(this, str, z);
    }
}
