package defpackage;

import com.google.android.contextmanager.fence.PlaceFenceHelper;

/* renamed from: byv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class byv extends bva {
    final /* synthetic */ byy a;
    final /* synthetic */ PlaceFenceHelper b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public byv(PlaceFenceHelper placeFenceHelper, String str, Object[] objArr, byy byy) {
        super(str, objArr);
        this.b = placeFenceHelper;
        this.a = byy;
    }

    public final void a(Exception exc) {
        this.b.b.remove(this.a);
    }
}
