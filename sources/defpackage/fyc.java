package defpackage;

/* renamed from: fyc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fyc implements acvp {
    final /* synthetic */ fyg a;

    public fyc(fyg fyg) {
        this.a = fyg;
    }

    public final void a(acwa acwa) {
        if (acwa.e() != null) {
            fyg.a.e("startNewAccountCheckinAsync throwing Exception: ", acwa.e(), new Object[0]);
            return;
        }
        int intValue = ((Integer) acwa.d()).intValue();
        if (!ibt.d(intValue)) {
            iwd iwd = fyg.a;
            StringBuilder sb = new StringBuilder(27);
            sb.append("Checkin failed: ");
            sb.append(intValue);
            iwd.e(sb.toString(), new Object[0]);
            return;
        }
        acwa a2 = this.a.c.a((ihb) new gvh());
        a2.a((acvv) new fye());
        a2.a((acvs) new fyd());
    }
}
