package defpackage;

import android.os.RemoteException;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.DriveEvent;

/* renamed from: ktk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ktk implements ksj {
    final /* synthetic */ ktm a;
    private final String b;

    public ktk(ktm ktm, String str) {
        this.a = ktm;
        this.b = str;
    }

    public final void a(ChangesAvailableEvent changesAvailableEvent) {
        try {
            this.a.c.a(this.b, (DriveEvent) changesAvailableEvent);
            ktm.a.a("Raised changes available event to subscription: %s", changesAvailableEvent);
        } catch (Exception e) {
            ktm.a.c("SubscriptionStore", String.format("Error delivering changes available event to subscription: %s", new Object[]{this.b}), e);
            throw new RemoteException();
        }
    }
}
