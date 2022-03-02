package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: kwk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kwk extends bhw implements IInterface {
    public final /* synthetic */ kov a;
    public final /* synthetic */ ksp b;
    public final /* synthetic */ ksw c;
    private final AtomicBoolean d;

    public kwk() {
        super("com.google.android.gms.drive.internal.IEventReleaseCallback");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        String str;
        if (i != 1) {
            return false;
        }
        boolean a2 = bhx.a(parcel);
        if (!a2) {
            str = "dismiss";
        } else {
            str = "snooze";
        }
        if (this.d.getAndSet(true)) {
            ksw.a.b("EventDistributor", "Event released multiple times: %s", str);
        } else {
            ksw.a.a("Event released remotely: %s", str);
            this.c.h.execute(new ksv(this, a2));
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kwk(ksw ksw, kov kov, ksp ksp) {
        super("com.google.android.gms.drive.internal.IEventReleaseCallback");
        this.c = ksw;
        this.a = kov;
        this.b = ksp;
        this.d = new AtomicBoolean(false);
    }
}
