package defpackage;

import com.google.android.gms.auth.api.credentials.Credential;
import java.util.concurrent.Executor;

/* renamed from: fkf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fkf implements aoqb {
    private final fkm a;
    private final pyv b;
    private final String c;
    private final String d;
    private final String e;

    public fkf(fkm fkm, pyv pyv, String str, String str2, String str3) {
        this.a = fkm;
        this.b = pyv;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final aorr a(Object obj) {
        fkm fkm = this.a;
        Credential credential = (Credential) obj;
        return aooz.a(fkm.d.b(new fki(fkm, this.b, this.c, this.d, this.e, credential)), Exception.class, (amqy) new fkj(credential), (Executor) aoqm.a);
    }
}
