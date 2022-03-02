package defpackage;

/* renamed from: ahly  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahly extends ahkj {
    private boolean a = false;
    private ajbi b = null;
    private ajbi c = null;

    public ahly(ahix ahix) {
        super(ahix);
        ativ.a(this.j);
    }

    public final void b(boolean z) {
        super.b(z);
        if (!this.a) {
            this.d.a(false);
            c(39);
        }
    }

    public final void g() {
        super.g();
        if (this.d.z.a()) {
            ajbi ajbi = this.d.z;
            this.b = ajbi;
            ajbi.a(this);
        }
        if (this.d.A.a()) {
            ajbi ajbi2 = this.d.A;
            this.c = ajbi2;
            ajbi2.a(this);
        }
        if (this.b == null && this.c == null) {
            this.h.a(aico.SMD_STATE_ENTERED, 1);
        } else {
            this.h.a(aico.SMD_STATE_ENTERED, 0);
        }
    }

    public final void h() {
        super.h();
        this.a = true;
        ajbi ajbi = this.b;
        if (ajbi != null && ajbi.b()) {
            this.b.c();
        }
        ajbi ajbi2 = this.c;
        if (ajbi2 != null && ajbi2.b()) {
            this.c.c();
        }
        this.h.a(aico.SMD_STATE_EXITED);
    }

    public final String p() {
        return "WatchSignificantMotionDetectionState";
    }
}
