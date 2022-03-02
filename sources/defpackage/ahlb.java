package defpackage;

/* renamed from: ahlb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahlb extends ahkj {
    private boolean a = false;
    private final ajbi b;

    public ahlb(ahix ahix) {
        super(ahix);
        this.b = !ahix.z.a() ? ahix.A.a() ? ahix.A : null : ahix.z;
    }

    public final void b(boolean z) {
        super.b(z);
        if (!this.a) {
            c(39);
        }
    }

    public final void g() {
        super.g();
        this.a = false;
        ajbi ajbi = this.b;
        if (ajbi == null || !ajbi.a(this)) {
            this.h.a(aico.SMD_STATE_ENTERED, 1);
            a((ahle) new ahkg(this.d));
            return;
        }
        this.h.a(aico.SMD_STATE_ENTERED, 0);
    }

    public final void h() {
        super.h();
        this.a = true;
        ajbi ajbi = this.b;
        if (ajbi != null) {
            ajbi.c();
        }
        this.h.a(aico.SMD_STATE_EXITED);
    }

    public final String p() {
        return "SignificantMotionDetectionState";
    }
}
