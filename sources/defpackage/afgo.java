package defpackage;

/* renamed from: afgo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
enum afgo {
    NO_RESULT,
    PENDING_FIRST_GOOD,
    BAD_RESULT,
    GOOD_RESULT;

    public final void a(afgp afgp) {
        boolean z;
        int ordinal = ordinal();
        boolean z2 = false;
        if (ordinal == 0) {
            int i = afgp.h;
            if (afgp.d == null) {
                z = true;
            } else {
                z = false;
            }
            amrl.b(z, (Object) "bestResult should be null");
            if (afgp.e == 0) {
                z2 = true;
            }
            amrl.b(z2, (Object) "no pending futures");
        } else if (ordinal == 1) {
            int i2 = afgp.h;
            amrl.b(afgp.d instanceof aosh, (Object) "bestResult should be null");
            amrl.b(!afgp.d.isDone(), (Object) "bestResult should be pending");
            if (afgp.e > 0) {
                z2 = true;
            }
            amrl.b(z2, (Object) "there should be a pending future.");
        } else if (ordinal == 2) {
            int i3 = afgp.h;
            amrl.b(afgp.d.isDone(), (Object) "bestResult should be done");
            if (afgp.e == 0) {
                z2 = true;
            }
            amrl.b(z2, (Object) "no pending futures");
        } else if (ordinal == 3) {
            int i4 = afgp.h;
            amrl.b(afgp.d.isDone(), (Object) "bestResult should be done");
        } else {
            throw null;
        }
    }
}
