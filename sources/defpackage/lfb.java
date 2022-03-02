package defpackage;

import android.content.SyncResult;

/* renamed from: lfb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lfb implements lff {
    private final kkf a;
    private final kkz b;

    public lfb(lsm lsm, kkz kkz) {
        iva.a((Object) kkz);
        this.b = kkz;
        this.a = lsm.d;
    }

    public final void a(SyncResult syncResult) {
    }

    public final boolean a() {
        return false;
    }

    public final String b() {
        return "ChangeLogSyncAlgorithm";
    }

    public final void a(lea lea, lnk lnk, SyncResult syncResult) {
        ldw ldw = new ldw(leb.a(syncResult));
        klb b2 = this.a.b(this.b.a);
        lea lea2 = lea;
        lea2.a(lcq.a(new lcn(b2.e + 1, this.a.d(this.b)), (String) null, 0), (Long) null, this.b, Integer.MAX_VALUE, ldw, lnk);
    }
}
