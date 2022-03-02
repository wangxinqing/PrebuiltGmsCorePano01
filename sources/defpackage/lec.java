package defpackage;

import com.google.android.gms.drive.DriveId;
import java.util.Locale;

/* renamed from: lec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class lec implements ldz {
    private final ldz a;

    protected lec(ldz ldz) {
        iva.a((Object) ldz);
        this.a = ldz;
    }

    public DriveId a(krk krk, lnj lnj, boolean z) {
        return this.a.a(krk, lnj, z);
    }

    public String toString() {
        return String.format(Locale.US, "ForwardingFeedProcessor[%s]", new Object[]{this.a});
    }

    public final void a(long j) {
        this.a.a(j);
    }

    public void a(String str) {
        this.a.a(str);
    }

    public void a(krk krk) {
        this.a.a(krk);
    }

    public void a(krk krk, lno lno) {
        this.a.a(krk, lno);
    }
}
