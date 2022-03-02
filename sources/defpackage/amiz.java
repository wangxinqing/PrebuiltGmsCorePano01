package defpackage;

import java.util.Arrays;

/* renamed from: amiz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amiz {
    public static final amiz a = new amiz();
    private final String b = "";
    private final int c = 0;
    private final String d = "";
    private final amii e = amii.SHIFT_AFTER_DELETE;

    private amiz() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amiz) {
            amiz amiz = (amiz) obj;
            if (alyr.a(this.b, amiz.b)) {
                int i = amiz.c;
                return alyr.a(0, 0) && alyr.a(this.d, amiz.d) && alyr.a(this.e, amiz.e);
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, 0, this.d, this.b});
    }
}
