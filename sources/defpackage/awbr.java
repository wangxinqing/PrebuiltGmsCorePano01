package defpackage;

/* renamed from: awbr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awbr extends batj {
    final /* synthetic */ awbt a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awbr(awbt awbt, baua baua) {
        super(baua);
        this.a = awbt;
    }

    public final long c(batd batd, long j) {
        int i = this.a.a;
        if (i != 0) {
            long c = super.c(batd, Math.min(j, (long) i));
            if (c != -1) {
                awbt awbt = this.a;
                awbt.a = (int) (((long) awbt.a) - c);
                return c;
            }
        }
        return -1;
    }
}
