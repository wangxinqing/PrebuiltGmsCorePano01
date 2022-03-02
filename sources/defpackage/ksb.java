package defpackage;

import com.google.android.gms.drive.events.ChangeEvent;

/* renamed from: ksb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ksb implements krp {
    private final ksd a;
    private final ChangeEvent b;
    private final kmp c;

    public ksb(ksd ksd, ChangeEvent changeEvent, kmp kmp) {
        this.a = ksd;
        this.b = changeEvent;
        this.c = kmp;
    }

    public final boolean a(kta kta) {
        ksd ksd = this.a;
        ChangeEvent changeEvent = this.b;
        kmp kmp = this.c;
        if (((kse) kta).a(changeEvent, kmp.y())) {
            ksd.a.a("Raised change event to listener: %s", changeEvent);
            ksd.a(25, kmp);
        }
        return true;
    }
}
