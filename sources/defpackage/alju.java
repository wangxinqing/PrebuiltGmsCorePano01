package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: alju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alju {
    private static final alkd a = new alkd("LoggingConsentProvider");
    private final Context b;

    public final boolean a() {
        alke.a();
        try {
            return ((ick) acws.a(adrz.b(this.b).o(), 30, TimeUnit.SECONDS)).p();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            a.a("Failed to get consent status", e);
            return false;
        }
    }

    public alju(Context context) {
        this.b = context;
    }
}
