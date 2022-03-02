package defpackage;

import java.util.ArrayList;
import java.util.Locale;

/* renamed from: arol  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arol {
    public final ArrayList a = new ArrayList();
    public final arok b;
    public int c;
    public int d;

    public arol(arok arok) {
        if (arok.a()) {
            this.b = arok;
            this.c = -1;
            return;
        }
        throw new IllegalArgumentException("First fragment is required for construction.");
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "Fragment{%s}, lastFragmentReceived=%d, currentTransferLength=%d", new Object[]{this.b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }
}
