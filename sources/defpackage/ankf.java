package defpackage;

import java.util.Calendar;
import java.util.Date;

/* renamed from: ankf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ankf extends ankg {
    private final anke c;

    public ankf(anin anin, int i, anke anke) {
        super(anin, i);
        this.c = anke;
        StringBuilder sb = new StringBuilder("%");
        anin.a(sb);
        sb.append(!anin.b() ? 't' : 'T');
        sb.append(anke.G);
        sb.toString();
    }

    public final void a(ankh ankh, Object obj) {
        anke anke = this.c;
        anin anin = this.b;
        if ((obj instanceof Date) || (obj instanceof Calendar) || (obj instanceof Long)) {
            StringBuilder sb = new StringBuilder("%");
            anin.a(sb);
            sb.append(!anin.b() ? 't' : 'T');
            sb.append(anke.G);
            ((anjb) ankh).c.append(String.format(anjb.a, sb.toString(), new Object[]{obj}));
            return;
        }
        StringBuilder sb2 = ((anjb) ankh).c;
        char c2 = anke.G;
        StringBuilder sb3 = new StringBuilder(3);
        sb3.append("%t");
        sb3.append(c2);
        anjb.a(sb2, obj, sb3.toString());
    }
}
