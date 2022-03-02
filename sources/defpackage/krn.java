package defpackage;

import android.os.RemoteException;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.events.TransferStateEvent;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: krn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class krn implements ktj {
    public final kpk a;
    public volatile boolean b = false;
    private final Set c;
    private final ktl d;

    public krn(kpk kpk, ktl ktl) {
        iva.a((Object) kpk);
        this.a = kpk;
        iva.a((Object) ktl);
        this.d = ktl;
        JSONObject jSONObject = new JSONObject(kpk.e);
        kti.a(jSONObject);
        this.c = kti.b(jSONObject);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.b = true;
    }

    public final kpk b() {
        return this.a;
    }

    public final long c() {
        return this.a.b;
    }

    /* access modifiers changed from: package-private */
    public final void a(List list) {
        TransferStateEvent transferStateEvent = new TransferStateEvent(list);
        ktl ktl = this.d;
        try {
            ktl.b.c.a(ktl.a, (DriveEvent) transferStateEvent);
            ktm.a.a("Raised transfer state event to subscription: %s", transferStateEvent);
        } catch (Exception e) {
            ktm.a.c("SubscriptionStore", String.format("Error delivering transfer state event to subscription: %s", new Object[]{ktl.a}), e);
            throw new RemoteException();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(kmp kmp) {
        return !Collections.disjoint(this.c, kmp.aj());
    }
}
