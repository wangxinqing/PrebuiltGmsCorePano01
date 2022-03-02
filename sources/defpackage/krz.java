package defpackage;

import com.google.android.gms.drive.events.TransferProgressEvent;

/* renamed from: krz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class krz implements krp {
    private final TransferProgressEvent a;
    private final String b;

    public krz(TransferProgressEvent transferProgressEvent, String str) {
        this.a = transferProgressEvent;
        this.b = str;
    }

    public final boolean a(kta kta) {
        TransferProgressEvent transferProgressEvent = this.a;
        String str = this.b;
        ith ith = ksd.a;
        if (((ktn) kta).a(transferProgressEvent)) {
            ksd.a.a("Raised %s progress event to listener: %s", str, transferProgressEvent);
        }
        return true;
    }
}
