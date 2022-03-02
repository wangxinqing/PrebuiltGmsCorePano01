package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: adbt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adbt implements acys, icl {
    private final Status a;
    private final acys b;

    public adbt(Status status, acys acys) {
        this.a = status;
        this.b = acys;
    }

    public final boolean a() {
        Status status = this.a;
        if (status != null && status.c()) {
            return this.b.a();
        }
        Log.e("DevDataUplOptInStatRes", "Cant call to canUploadSupplementalWebAndAppActivity as getOptInStatus failed");
        return false;
    }

    public final Status aO() {
        return this.a;
    }

    public final boolean b() {
        Status status = this.a;
        if (status != null && status.c()) {
            return this.b.b();
        }
        Log.e("DevDataUplOptInStatRes", "Cant call to canUploadDeviceInformation as getOptInStatus failed");
        return false;
    }
}
