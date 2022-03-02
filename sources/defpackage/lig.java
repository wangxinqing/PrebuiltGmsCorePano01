package defpackage;

import com.google.android.gms.drive.events.internal.TransferProgressData;

/* renamed from: lig  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lig implements kip {
    final /* synthetic */ lih a;
    private final khq b;
    private final knc c;
    private long d = 0;

    public lig(lih lih, khq khq, knc knc) {
        this.a = lih;
        this.b = khq;
        this.c = knc;
    }

    public final synchronized Long a() {
        long j;
        j = this.d;
        return j >= 0 ? Long.valueOf(j) : null;
    }

    public final synchronized void a(int i) {
    }

    public final synchronized void a(long j, long j2) {
        this.d = j2;
        try {
            kmp a2 = this.a.b.a(this.b, this.c);
            this.a.j.a(new TransferProgressData(1, a2.g(), 2, j, j2), a2);
        } catch (kcs e) {
        }
    }
}
