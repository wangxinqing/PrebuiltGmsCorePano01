package defpackage;

import java.util.Collections;
import java.util.Map;

/* renamed from: aloz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aloz implements alpf {
    public final alrf a;
    private final String b;
    private final String c;
    private final String d;
    private final alvx e = new alvx();
    private final alow f;
    private final alqt g;
    private final alqe h;

    public aloz(String str, String str2, String str3, alpg alpg, alow alow, alqt alqt, alre alre) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.f = alow;
        this.g = alqt;
        this.a = alre.a(new alrj());
        this.h = new alox(alpg);
    }

    public final alqd a(String str, String str2) {
        alqd alqd = new alqd();
        String str3 = this.b;
        if (!str3.endsWith("/")) {
            alqd.a = String.valueOf(str3).concat("/");
        } else {
            alqd.a = str3;
        }
        alqd.a("rctype", this.c);
        alqd.a("rcver", this.d);
        alqd.a("id", str);
        if (str2 != null) {
            alqd.a("sid", str2);
        }
        alqd.a(this.h);
        return alqd;
    }

    public final alpl b(String str, String str2) {
        return new alpe(this, str, str2);
    }

    public final alqr a(alqy alqy) {
        return ((alrc) this.g).b(alqy);
    }

    public final void a(int i) {
        if (i == 0) {
            return;
        }
        if (i == 401) {
            this.f.e("The OAuth token must be refreshed.");
        } else if (i == 423) {
            this.f.a("A different session already created the file.");
        } else if (i == 403) {
            this.f.c("Access denied to file.");
        } else if (i != 404) {
            alow alow = this.f;
            StringBuilder sb = new StringBuilder(51);
            sb.append("Server returned unexpected HTTP status: ");
            sb.append(i);
            alow.d(sb.toString());
        } else {
            this.f.b("File not found.");
        }
    }

    public final void a(String str, alpi alpi) {
        a("gs", a(str, (String) null).a(), Collections.emptyMap(), (String) null, alpi, this.e);
    }

    public final void a(String str, alqf alqf, Map map, String str2, alpi alpi, alva alva) {
        alqx alqx;
        if (str2 == null) {
            alqx = alqx.GET;
        } else {
            alqx = alqx.POST;
        }
        alqv alqv = new alqv(((alrc) this.g).b(alqy.a(alqf, str, map, alqx, str2)));
        alqv.c = new aloy(this, alva, alpi);
        alqv.a();
    }
}
