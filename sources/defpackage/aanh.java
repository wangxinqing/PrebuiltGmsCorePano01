package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.security.snet.OperationLauncherIntentOperation;

/* renamed from: aanh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aanh extends aanp {
    private final int a = 1;
    private final zzw b;
    private final aang d;

    static {
        aanh.class.getSimpleName();
    }

    public aanh(Context context, zzw zzw) {
        this(context, zzw, aang.a(context));
    }

    public final void a(Context context) {
        if (this.a != 1) {
            this.d.a(this.b);
            this.d.c();
            if (!aann.b(context, "com.android.vending")) {
                b(new Status(12003));
            } else if (this.d.f()) {
            } else {
                if (aann.b(context)) {
                    this.d.a(new Status(0), 0);
                } else if (!aans.c(context)) {
                    b(new Status(12003));
                } else if (aann.a(context) >= 80700200) {
                    Intent addFlags = new Intent("com.google.android.vending.verifier.REQUEST_CONSENT").setPackage("com.android.vending").addFlags(268435456);
                    ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(addFlags, !jkr.b() ? 65536 : 131072);
                    if (resolveActivity != null) {
                        addFlags.setClassName("com.android.vending", resolveActivity.activityInfo.name);
                        int i = aani.b;
                        PendingIntent service = PendingIntent.getService(context, 0, IntentOperation.getStartIntent(context, OperationLauncherIntentOperation.class, "com.google.android.gms.security.apis.verifyapps.CONSENT_RESULT").putExtra("nonce", aang.a(context).d()), JGCastService.FLAG_PRIVATE_DISPLAY);
                        this.d.a(service);
                        addFlags.putExtra("consent_result_intent", service);
                    } else {
                        addFlags = null;
                    }
                    if (addFlags == null) {
                        b(new Status(12003));
                    } else {
                        a(context, addFlags);
                    }
                } else {
                    b(new Status(12003));
                }
            }
        } else {
            boolean b2 = aann.b(context);
            zzw zzw = this.b;
            if (zzw != null) {
                zzw.a(new Status(0), b2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void b(Status status) {
        aang.a(this.c).a(status, 1);
    }

    public aanh(Context context, zzw zzw, aang aang) {
        super(context, "vappsprompt");
        this.b = zzw;
        this.d = aang;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(Context context, Intent intent) {
        if (!this.d.f()) {
            this.d.e();
            aank.a(context).b(1);
            context.startActivity(intent);
        }
    }
}
