package defpackage;

import com.google.android.gms.awareness.snapshot.internal.Snapshot;

/* renamed from: cid  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cid extends bva {
    final /* synthetic */ long a;
    final /* synthetic */ cie b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cid(cie cie, String str, Object[] objArr, long j) {
        super(str, objArr);
        this.b = cie;
        this.a = j;
    }

    public final void a(Exception exc) {
        this.b.c.a(13, (Snapshot) null);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
        cbi.k().a(this.b, this.a, bvq.a("BeaconSnapshotSubscribeTimeout"));
    }
}
