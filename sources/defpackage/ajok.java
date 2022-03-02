package defpackage;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* renamed from: ajok  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class ajok extends qvy {
    final /* synthetic */ ajol a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajok(ajol ajol) {
        super("location");
        this.a = ajol;
    }

    public final void a(ComponentName componentName) {
        if (!aztb.u()) {
            if (Log.isLoggable("GCoreLocationSettings", 4)) {
                Log.i("GCoreLocationSettings", "BaseUserLocationSettingsChimeraActivity.onServiceDisconnected()");
            }
            this.a.b = null;
        }
    }

    public void a(ComponentName componentName, IBinder iBinder) {
        ajlk ajlk;
        if (!aztb.u()) {
            ajol ajol = this.a;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.location.reporting.service.IPreferenceService");
                ajlk = queryLocalInterface instanceof ajlk ? (ajlk) queryLocalInterface : new ajli(iBinder);
            } else {
                ajlk = null;
            }
            ajol.b = ajlk;
            this.a.f();
        }
    }
}
