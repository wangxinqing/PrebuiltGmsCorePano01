package defpackage;

import android.os.IBinder;
import com.google.android.gms.auth.api.credentials.manager.yolo.CredentialsInternalChimeraService;

/* renamed from: fnh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class fnh implements niz {
    private final CredentialsInternalChimeraService a;
    private final String b;

    public fnh(CredentialsInternalChimeraService credentialsInternalChimeraService, String str) {
        this.a = credentialsInternalChimeraService;
        this.b = str;
    }

    public final IBinder asBinder() {
        return new fge(this.a, this.b);
    }
}
