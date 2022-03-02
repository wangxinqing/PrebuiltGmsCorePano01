package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: avzm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avzm {
    public final avzj a;
    public final avzh b;
    public final int c;
    public final String d;
    public final avyz e;
    public final avzb f;
    public final avzn g;
    public final avzm h;
    public final avzm i;
    public final avzm j;

    public avzm(avzl avzl) {
        this.a = avzl.a;
        this.b = avzl.b;
        this.c = avzl.c;
        this.d = avzl.d;
        this.e = avzl.e;
        this.f = avzl.f.a();
        this.g = avzl.g;
        this.h = avzl.h;
        this.i = avzl.i;
        this.j = avzl.j;
    }

    public final avzl a() {
        return new avzl(this);
    }

    public final List b() {
        String str;
        int i2 = this.c;
        if (i2 == 401) {
            str = "WWW-Authenticate";
        } else if (i2 != 407) {
            return Collections.emptyList();
        } else {
            str = "Proxy-Authenticate";
        }
        return awcw.b(this.f, str);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        int i2 = this.c;
        String str = this.d;
        String str2 = this.a.a.e;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append("Response{protocol=");
        sb.append(valueOf);
        sb.append(", code=");
        sb.append(i2);
        sb.append(", message=");
        sb.append(str);
        sb.append(", url=");
        sb.append(str2);
        sb.append('}');
        return sb.toString();
    }

    public final String a(String str) {
        String a2 = this.f.a(str);
        if (a2 == null) {
            return null;
        }
        return a2;
    }
}
