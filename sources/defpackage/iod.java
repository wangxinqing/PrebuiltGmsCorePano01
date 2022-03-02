package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.phenotype.Configurations;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: iod  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class iod extends yfb {
    private final Configurations e;

    public iod(Context context, yey yey, String str, Configurations configurations) {
        super(yey, str, jkq.b(str), context);
        this.e = configurations;
    }

    private final boolean a(String str, int i) {
        if (i > 0) {
            a(this.e);
            try {
                acws.a(this.a.a(this.e.a), 10000, TimeUnit.MILLISECONDS);
                return true;
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                String str2 = this.b;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 41);
                sb.append("Committing snapshot for ");
                sb.append(str2);
                sb.append(" failed, retrying");
                Log.w("PhenotypeFallbackFix", sb.toString(), e2);
                return a(str, i - 1);
            }
        } else {
            String valueOf = String.valueOf(this.b);
            Log.w("PhenotypeFallbackFix", valueOf.length() == 0 ? new String("No more attempts remaining, giving up for ") : "No more attempts remaining, giving up for ".concat(valueOf));
            return false;
        }
    }

    public final boolean a(String str) {
        return a(str, 3);
    }
}
