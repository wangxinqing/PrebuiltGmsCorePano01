package defpackage;

import android.app.PendingIntent;
import java.util.Arrays;

/* renamed from: vdv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vdv {
    public final vcf a;
    public final PendingIntent b;

    private vdv(vcf vcf, PendingIntent pendingIntent) {
        this.a = vcf;
        this.b = pendingIntent;
    }

    public static vdv a(PendingIntent pendingIntent) {
        iva.a((Object) pendingIntent);
        return new vdv((vcf) null, pendingIntent);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vdv) {
            vdv vdv = (vdv) obj;
            return ius.a(this.a, vdv.a) && ius.a(this.b, vdv.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        vcf vcf = this.a;
        if (vcf != null) {
            String valueOf = String.valueOf(vcf.asBinder());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append("UnsubscribeOperation[listener=");
            sb.append(valueOf);
            sb.append("]");
            return sb.toString();
        }
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 36);
        sb2.append("UnsubscribeOperation[pendingIntent=");
        sb2.append(valueOf2);
        sb2.append("]");
        return sb2.toString();
    }

    public static vdv a(vcf vcf) {
        iva.a((Object) vcf);
        return new vdv(vcf, (PendingIntent) null);
    }
}
