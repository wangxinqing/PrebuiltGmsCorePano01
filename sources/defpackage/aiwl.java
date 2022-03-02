package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.location.ActivityRecognitionRequest;

/* renamed from: aiwl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiwl {
    public final ahpm a;
    private final Context b;
    private final alv c;
    private final aiwk d = new aiwk(this);

    public aiwl(ahpm ahpm, Context context) {
        this.a = ahpm;
        this.b = context;
        this.c = alv.a(context);
    }

    private final PendingIntent b() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(this.b, "com.google.android.location.internal.PendingIntentCallbackService"));
        intent.setPackage(this.b.getPackageName());
        intent.setAction("com.google.android.location.internal.action.AR_TRANSITION_RESULT");
        return PendingIntent.getService(this.b, 0, intent, 134217728);
    }

    public final void a() {
        atir atir = new atir(this.b.getPackageName());
        PendingIntent b2 = b();
        atir.b(b2);
        if (atir.a(this.b) == null) {
            b2.cancel();
        }
    }

    public final void a(long j) {
        rck rck = new rck();
        rck.a(j);
        rck.c = true;
        rck.e = "ActivityTransitionApi:AR";
        ActivityRecognitionRequest a2 = rck.a();
        atir atir = new atir(this.b.getPackageName());
        atir.a(true);
        atir.a(a2, b());
        if (atir.a(this.b) != null) {
            StringBuilder sb = new StringBuilder(76);
            sb.append("Enable RealActivityRecognitionServiceClient at interval ");
            sb.append(j);
            sb.toString();
            String a3 = asvl.a("com.google.android.location.internal.action.AR_TRANSITION_RESULT");
            if (a3 != null) {
                this.c.a(this.d, new IntentFilter(a3));
            }
        }
    }
}
