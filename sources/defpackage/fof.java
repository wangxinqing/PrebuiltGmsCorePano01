package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.HintRequest;
import java.util.concurrent.Executor;

/* renamed from: fof  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fof implements fcu {
    public static final iwd a = ehv.b("ListHintsOperation");
    public final amzy b;
    public final HintRequest c;
    private final Context d;

    public fof(Context context, HintRequest hintRequest) {
        this.d = context;
        amzt j = amzy.j();
        int i = jhg.a;
        j.c(new fkv(context));
        j.c(new fkp(context));
        j.c(fkm.a(context));
        j.c(new fku(context));
        if (((Boolean) fdf.b.c()).booleanValue()) {
            j.c(new flp(context));
        }
        this.b = j.a();
        this.c = hintRequest;
    }

    public final aorr a(fde fde) {
        return aopr.a(aopr.a(new fmo(this.d).a(fde), (aoqb) new fnw(this, fde), (Executor) aoqm.a), fnx.a, (Executor) aoqm.a);
    }

    public final qbk a() {
        return qbk.AUTH_API_CREDENTIALS_LIST_HINTS;
    }
}
