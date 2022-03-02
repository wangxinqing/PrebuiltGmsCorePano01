package defpackage;

/* renamed from: abqv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abqv extends tim {
    final /* synthetic */ abqw a;
    private final String b;

    public abqv(abqw abqw, String str) {
        this.a = abqw;
        this.b = str;
    }

    public final void a(String str) {
        this.a.a(str);
    }

    public final void a(String str, til til) {
        String str2 = this.a.g;
        if (str2 != null && str2.equals(str)) {
            iwd iwd = abqw.b;
            String str3 = til.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 36 + String.valueOf(str).length());
            sb.append("Connection initiated from device:");
            sb.append(str3);
            sb.append(" (");
            sb.append(str);
            sb.append(")");
            iwd.a(sb.toString(), new Object[0]);
            String str4 = til.b;
            this.a.h = abwg.a(2, str4, jhy.a(this.b));
            abqw abqw = this.a;
            tiq tiq = abqw.c;
            if (tiq != null) {
                tiq.a(str, (tjd) new acbm(abqw.d, abqw.n));
                return;
            }
            return;
        }
        iwd iwd2 = abqw.b;
        String str5 = this.a.g;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 84 + String.valueOf(str5).length());
        sb2.append("Connection endpoint id (");
        sb2.append(str);
        sb2.append(") does not match endpoint ID we connected with (");
        sb2.append(str5);
        sb2.append(")! Skipping.");
        iwd2.d(sb2.toString(), new Object[0]);
    }

    public final void a(String str, tip tip) {
        String str2 = this.a.g;
        if (str2 == null || !str2.equals(str)) {
            iwd iwd = abqw.b;
            String str3 = this.a.g;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 84 + String.valueOf(str3).length());
            sb.append("Connection endpoint id (");
            sb.append(str);
            sb.append(") does not match endpoint ID we connected with (");
            sb.append(str3);
            sb.append(")! Skipping.");
            iwd.d(sb.toString(), new Object[0]);
        } else if (!tip.a.c()) {
            abqw.b.e("Unsuccessful connection.", new Object[0]);
            acau acau = this.a.e;
            if (acau != null) {
                acau.a(10584);
            }
        } else {
            abqw abqw = this.a;
            abom a2 = abqw.k.a();
            a2.a = true;
            a2.d = true;
            abqw.k = a2.a();
        }
    }
}
