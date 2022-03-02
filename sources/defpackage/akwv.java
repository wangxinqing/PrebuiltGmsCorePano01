package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: akwv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class akwv implements acvp {
    private final akww a;

    public akwv(akww akww) {
        this.a = akww;
    }

    public final void a(acwa acwa) {
        akww akww = this.a;
        if (acwa.b()) {
            akww.b(Status.a);
            return;
        }
        if (Log.isLoggable("Places", 6)) {
            Log.e("Places", "Operation failed: RemovePlaceUpdates", acwa.e());
        }
        akww.b(Status.c);
    }
}
