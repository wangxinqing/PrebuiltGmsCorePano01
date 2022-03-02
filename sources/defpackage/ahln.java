package defpackage;

import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: ahln  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahln extends ahlr {
    final /* synthetic */ ahlw a;
    private long b;
    private long c = -1;
    private int d = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahln(ahlw ahlw) {
        super(ahlw);
        this.a = ahlw;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        aizy aizy = this.a.a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.b = elapsedRealtime;
        this.c = elapsedRealtime;
        this.a.c.a(120000, false);
    }

    public final String b() {
        return "ConfirmingInVehicle";
    }

    /* access modifiers changed from: protected */
    public final void a(ahlr ahlr) {
        super.a(ahlr);
        this.a.c.c(120000);
    }

    public final void a(ActivityRecognitionResult activityRecognitionResult) {
        if (ahlw.b(activityRecognitionResult)) {
            aizy aizy = this.a.a;
            if (SystemClock.elapsedRealtime() - this.c >= 60000) {
                aizy aizy2 = this.a.a;
                this.c = SystemClock.elapsedRealtime();
                int i = this.d + 1;
                this.d = i;
                StringBuilder sb = new StringBuilder(26);
                sb.append("inVehicleCount=");
                sb.append(i);
                sb.toString();
                if (this.d > 1) {
                    aizy aizy3 = this.a.a;
                    if (SystemClock.elapsedRealtime() - this.b > 180000) {
                        ahlw ahlw = this.a;
                        ahlw.a((ahlr) new ahlo(ahlw));
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (!ahlw.a(activityRecognitionResult)) {
            aizy aizy4 = this.a.a;
            if (SystemClock.elapsedRealtime() - this.c <= 900000) {
                return;
            }
        }
        ahlw ahlw2 = this.a;
        ahlw2.a((ahlr) new ahlv(ahlw2));
    }
}
