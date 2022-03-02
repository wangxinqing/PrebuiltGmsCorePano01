package defpackage;

/* renamed from: ahpw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahpw implements icm {
    final /* synthetic */ icc a;

    public ahpw(icc icc) {
        this.a = icc;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        adsw adsw = (adsw) icl;
        if (adsw.a.c()) {
            ahpx.c = adsw.b();
            boolean z = ahpx.c;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Successfully queried usage reporting status, can track AR: ");
            sb.append(z);
            sb.toString();
        }
        this.a.g();
    }
}
