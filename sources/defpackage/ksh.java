package defpackage;

import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.internal.OnEventResponse;

/* renamed from: ksh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ksh implements ksj {
    final /* synthetic */ ksi a;

    public ksh(ksi ksi) {
        this.a = ksi;
    }

    public final void a(ChangesAvailableEvent changesAvailableEvent) {
        this.a.b.a(new OnEventResponse(changesAvailableEvent));
    }
}
