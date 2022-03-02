package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: drk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class drk implements icm {
    final /* synthetic */ jzy a;
    final /* synthetic */ drm b;

    public drk(drm drm, jzy jzy) {
        this.b = drm;
        this.a = jzy;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        Status status = (Status) icl;
        if (!status.c()) {
            drm drm = this.b;
            drm.a = this.a;
            drm.e();
            this.b.b.a(false);
            String valueOf = String.valueOf(status);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
            sb.append("Unable to set preferences, result ");
            sb.append(valueOf);
            Log.e("DataManagementActivity", sb.toString());
            this.b.f();
        }
    }
}
