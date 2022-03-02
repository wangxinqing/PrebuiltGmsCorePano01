package defpackage;

import android.content.Context;
import com.google.android.gms.gcm.GcmDiagnosticsReceiver;
import com.google.android.gms.gcm.connection.HeartbeatChimeraAlarm;

/* renamed from: nsj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nsj {
    public final GcmDiagnosticsReceiver a = new GcmDiagnosticsReceiver();
    public final Context b;
    public final HeartbeatChimeraAlarm c;
    public final nva d;
    public final nrj e;

    public nsj(HeartbeatChimeraAlarm heartbeatChimeraAlarm, nva nva, nrj nrj, Context context) {
        this.b = context;
        this.c = heartbeatChimeraAlarm;
        this.d = nva;
        this.e = nrj;
    }
}
