package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import java.util.Arrays;

/* renamed from: vaq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vaq {
    final IBinder a;
    final PendingIntent b;

    public vaq(PendingIntent pendingIntent) {
        this.a = null;
        this.b = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vaq) {
            vaq vaq = (vaq) obj;
            return ius.a(this.a, vaq.a) && ius.a(this.b, vaq.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public vaq(vcf vcf) {
        this.a = vcf.asBinder();
        this.b = null;
    }
}
