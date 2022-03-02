package defpackage;

import android.os.Message;
import android.util.Log;
import com.android.volley.toolbox.ImageRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: aimu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aimu extends aimr {
    final /* synthetic */ aing a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aimu(aing aing, aiml aiml) {
        super(aing, aiml);
        this.a = aing;
    }

    public final aoaq a() {
        return aoaq.DISABLED;
    }

    public final String g() {
        return "DisabledState";
    }

    public final void k() {
        super.k();
        aiml aiml = this.b;
        aiml.e.a();
        aiml.d.a();
        aiko.a.a(-1293285128, -1);
        if (!aycg.a.a().preserveGeofencesWhenNetworkLocationTurnsOff()) {
            aiju aiju = aiml.f;
            aiju.a(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
            aiju.e.a();
            try {
                aiju.b();
            } catch (IOException e) {
                if (aiju.b != null) {
                    aiju.b.a((Collection) new ArrayList());
                }
            }
        } else {
            aiml.f.a();
        }
    }

    public final boolean a(Message message) {
        boolean z = aikq.a;
        int i = message.what;
        if (i == 1) {
            if (this.a.x.a()) {
                if (Log.isLoggable("GeofencerStateMachine", 4)) {
                    aikq.a("GeofencerStateMachine", "Network location enabled.");
                }
                if (this.b.c()) {
                    aing aing = this.a;
                    aing.b((ains) aing.c);
                } else {
                    aing aing2 = this.a;
                    aing2.b((ains) aing2.a);
                }
            }
            return true;
        } else if (i == 4) {
            if (Log.isLoggable("GeofencerStateMachine", 5)) {
                aikq.c("GeofencerStateMachine", "Ignoring addGeofence because network location is disabled.");
            }
            ((aily) message.obj).a((Object) Integer.valueOf(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS));
            return true;
        } else if (i != 5) {
            return b(message);
        } else {
            a((ainr) message.obj);
            return true;
        }
    }
}
