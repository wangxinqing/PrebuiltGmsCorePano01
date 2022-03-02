package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.ulr.ApiExperimentTokens;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: ajit  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajit {
    public final String a;
    private ApiExperimentTokens b = null;
    private long c = 0;
    private boolean d = false;

    public ajit(String str) {
        this.a = str;
    }

    private static ArrayList a(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(length);
        for (byte[] bArr2 : bArr) {
            if (!(bArr2 == null || bArr2.length == 0)) {
                arrayList.add(Base64.encodeToString(bArr2, 10));
            }
        }
        return arrayList;
    }

    private final void b() {
        this.c = SystemClock.elapsedRealtime() + TimeUnit.SECONDS.toMillis(aztb.a.a().br());
    }

    public final synchronized void a() {
        if (!this.d) {
            this.c = 0;
            this.d = true;
            return;
        }
        this.d = false;
    }

    public final synchronized ApiExperimentTokens a(Context context) {
        if (SystemClock.elapsedRealtime() > this.c) {
            String str = this.a;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.c;
            StringBuilder sb = new StringBuilder(str.length() + 48);
            sb.append("get(");
            sb.append(str);
            sb.append("): ");
            sb.append(elapsedRealtime);
            sb.append(">");
            sb.append(j);
            sb.toString();
            b(context);
        }
        return this.b;
    }

    public final synchronized void b(Context context) {
        b();
        new ajis(this, context).start();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(ExperimentTokens experimentTokens) {
        String str;
        ApiExperimentTokens apiExperimentTokens = null;
        if (experimentTokens != null) {
            try {
                ArrayList a2 = a(experimentTokens.i);
                ArrayList a3 = a(experimentTokens.f);
                byte[] bArr = experimentTokens.c;
                if (bArr == null || bArr.length == 0) {
                    str = null;
                } else {
                    str = Base64.encodeToString(bArr, 10);
                }
                apiExperimentTokens = new ApiExperimentTokens(a2, a3, str, a(experimentTokens.d), a(experimentTokens.g), a(experimentTokens.e));
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b = apiExperimentTokens;
        b();
        this.d = false;
        String str2 = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(str2.length() + 23 + String.valueOf(valueOf).length());
        sb.append("ApiExperimentTokens(");
        sb.append(str2);
        sb.append("): ");
        sb.append(valueOf);
        sb.toString();
    }
}
