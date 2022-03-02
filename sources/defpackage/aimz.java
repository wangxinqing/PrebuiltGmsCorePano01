package defpackage;

import android.os.Message;
import android.util.Log;

/* renamed from: aimz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aimz extends aimr {
    final /* synthetic */ aing a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aimz(aing aing, aiml aiml) {
        super(aing, aiml);
        this.a = aing;
    }

    public final aoaq a() {
        return aoaq.NO_GEOFENCE;
    }

    public final String g() {
        return "NoGeofenceState";
    }

    public final void k() {
        super.k();
        this.b.e();
    }

    public final boolean a(Message message) {
        boolean z = aikq.a;
        int i = message.what;
        if (i == 1) {
            if (!this.a.x.a()) {
                if (Log.isLoggable("GeofencerStateMachine", 4)) {
                    aikq.a("GeofencerStateMachine", "Network location disabled.");
                }
                aing aing = this.a;
                aing.b((ains) aing.b);
            }
            return true;
        } else if (i != 10) {
            if (i != 16) {
                switch (i) {
                    case 4:
                        this.a.a(message);
                        aing aing2 = this.a;
                        aing2.b((ains) aing2.c);
                        return true;
                    case 5:
                        a((ainr) message.obj);
                        return true;
                    case 6:
                    case 7:
                    case 8:
                        return true;
                }
            } else if (this.b.c()) {
                this.a.a(message);
                aing aing3 = this.a;
                aing3.b((ains) aing3.c);
                return true;
            }
            return b(message);
        } else {
            this.b.g();
            return true;
        }
    }
}
