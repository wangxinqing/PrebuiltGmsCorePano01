package defpackage;

import com.google.android.gms.phenotype.Configurations;

/* renamed from: abvk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abvk implements acvv {
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        iwd iwd = abvn.a;
        String valueOf = String.valueOf((Configurations) obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
        sb.append("Syncing smartdevice configuration successfully. configs=");
        sb.append(valueOf);
        iwd.b(sb.toString(), new Object[0]);
    }
}
