package defpackage;

import android.content.Context;
import com.google.android.gms.contextmanager.ContextData;

/* renamed from: cdi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cdi extends cfd {
    public static final ccj b = new ccj(new cdh(), "DestinationPredictionProducer", new int[]{46}, new int[]{1, 6});

    public cdi(Context context, bsz bsz, String str, but but) {
        super(context, bsz, b, str, but);
    }

    public static atuk a(atjl atjl) {
        byte[] a = ContextData.a(atjl);
        if (a == null) {
            return null;
        }
        try {
            return (atuk) aucj.a((aucj) atuk.b, a, aubs.c());
        } catch (auda e) {
            anih anih = (anih) bxk.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("cdi", "a", 69, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[DestinationPredictionProducer] Invalid prediction received.");
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
    }

    /* access modifiers changed from: protected */
    public final void b() {
    }
}
