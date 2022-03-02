package defpackage;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.IdToken;
import java.util.concurrent.Callable;

/* renamed from: fki  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fki implements Callable {
    private final fkm a;
    private final pyv b;
    private final String c;
    private final String d;
    private final String e;
    private final Credential f;

    public fki(fkm fkm, pyv pyv, String str, String str2, String str3, Credential credential) {
        this.a = fkm;
        this.b = pyv;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = credential;
    }

    public final Object call() {
        fkm fkm = this.a;
        pyv pyv = this.b;
        String str = this.c;
        String str2 = this.d;
        String str3 = this.e;
        Credential credential = this.f;
        IdToken a2 = fkm.c.a(pyv, str, str2, str3);
        eug eug = new eug(credential);
        eug.c = amzy.a((Object) a2);
        return eug.a();
    }
}
