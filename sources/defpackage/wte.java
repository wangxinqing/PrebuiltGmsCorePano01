package defpackage;

import android.os.RemoteException;

/* renamed from: wte  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wte implements igp {
    public final void a(Object obj, Object obj2) {
        try {
            ((wsy) ((wsv) obj).x()).b(new wtj((acwd) obj2));
        } catch (RemoteException e) {
            ((acwd) obj2).b((Exception) e);
        }
    }
}
