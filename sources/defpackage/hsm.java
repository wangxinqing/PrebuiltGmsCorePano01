package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: hsm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hsm extends iby implements hom {
    public hsm(Context context) {
        super(context, hol.a, (ibm) null, (igu) new icz());
    }

    public static hom a(Context context) {
        return new hsm(context);
    }

    public final icf a(hoi hoi) {
        hsl hsl = new hsl(hoi, this.j);
        super.a(2, (idf) hsl);
        return hsl;
    }

    public final void a(long j, TimeUnit timeUnit) {
        try {
            acws.a(a((ihb) new hsk()), j, timeUnit);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException | TimeoutException e2) {
        }
    }
}
