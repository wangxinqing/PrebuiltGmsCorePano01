package defpackage;

import com.google.android.gms.drive.events.ChangeEvent;

/* renamed from: krv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class krv implements krp {
    private final krx a;
    private final ChangeEvent b;
    private final kmp c;

    public krv(krx krx, ChangeEvent changeEvent, kmp kmp) {
        this.a = krx;
        this.b = changeEvent;
        this.c = kmp;
    }

    public final boolean a(kta kta) {
        krx krx = this.a;
        ChangeEvent changeEvent = this.b;
        kmp kmp = this.c;
        if (((kse) kta).a(changeEvent, kmp.y())) {
            krx.a.a("Raised change event to listener: %s", changeEvent);
            krx.a(25, kmp);
        }
        return true;
    }
}
