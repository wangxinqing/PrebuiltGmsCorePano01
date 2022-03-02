package defpackage;

import java.net.URL;

/* renamed from: lha  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lha implements lic {
    public final lho a;

    public lha(lho lho) {
        this.a = lho;
    }

    public final lib a(URL url) {
        this.a.a("Connection is not permitted");
        try {
            return new lgz(this, url);
        } catch (Exception e) {
            izj.a();
            throw e;
        }
    }
}
