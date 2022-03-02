package defpackage;

import android.telephony.TelephonyManager;
import java.util.List;

/* renamed from: aiyg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aiyg extends TelephonyManager.CellInfoCallback {
    final /* synthetic */ aiyj a;
    private final long b;
    private final aivo c;

    public aiyg(aiyj aiyj, aivo aivo, long j) {
        this.a = aiyj;
        this.c = aivo;
        this.b = j;
    }

    public final void onCellInfo(List list) {
        aiaj a2 = this.a.a(list, this.b, aiaj.a);
        if (a2 == null) {
            this.c.a((aiaj[]) null);
            return;
        }
        this.c.a(new aiaj[]{a2});
    }
}
