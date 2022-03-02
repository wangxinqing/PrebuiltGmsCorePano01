package defpackage;

import android.os.RemoteException;

/* renamed from: wtf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class wtf implements igp {
    public final void a(Object obj, Object obj2) {
        try {
            ((wsy) ((wsv) obj).x()).c(new wtk((acwd) obj2));
        } catch (RemoteException e) {
            ((acwd) obj2).b((Exception) e);
        }
    }
}
