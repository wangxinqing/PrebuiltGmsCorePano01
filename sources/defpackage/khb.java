package defpackage;

import android.content.Context;
import android.content.SyncResult;
import com.google.android.gms.drive.internal.QueryRequest;
import com.google.android.gms.drive.query.Query;
import java.util.Date;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: khb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class khb extends kez {
    public static final ith f = new ith("SyncMoreOperation", "");
    private final QueryRequest g;

    public khb(kec kec, QueryRequest queryRequest, kwg kwg) {
        super("SyncMoreOperation", kec, kwg, 67, (byte[]) null);
        this.g = queryRequest;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    public final void d(Context context) {
        njc.a((Object) this.g, "Invalid query request: no request");
        njc.a((Object) this.g.a, "Invalid query request: no query");
        Query a = this.a.a(this.g.a);
        this.c.a(a, false, (Integer) null, (Boolean) null, (Integer) null);
        kec kec = this.a;
        kha kha = new kha(this.b, this.c);
        iva.a((Object) a, (Object) "Query can't be null");
        iva.a((Object) a.a(), (Object) "Query can't have null spaces (have you validated them?)");
        boolean z = true;
        iva.b(!a.a().isEmpty(), "Query can't have empty spaces (have you validated them?)");
        ldd ldd = kec.p;
        Date a2 = ldd.a(a);
        if (a2 != null) {
            ldd.a.y.a(ldd.c);
            lcl a3 = ldd.a(a, a2);
            koa a4 = ldd.b.a(ldd.c, (lcp) lct.a(a3), a2.getTime());
            if (!a4.c()) {
                SyncResult syncResult = new SyncResult();
                lda lda = new lda(ldd.a, ldd.c, a4, new lez(syncResult), syncResult);
                ldc ldc = new ldc(ldd, a3, a2, kha);
                int intValue = ((Integer) jzq.aK.c()).intValue();
                if (lda.b.compareAndSet(false, true)) {
                    if (intValue < 0) {
                        z = false;
                    }
                    iva.b(z);
                    iva.a((Object) ldc);
                    String valueOf = String.valueOf(lda);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
                    sb.append("Running ");
                    sb.append(valueOf);
                    new lcz(lda, sb.toString(), intValue, ldc).start();
                    return;
                }
                throw new IllegalStateException("Already started.");
            }
            kha.a(false, 0);
            return;
        }
        kha.a(false, 0);
    }
}
