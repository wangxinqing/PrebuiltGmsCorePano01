package defpackage;

import android.os.RemoteException;
import com.google.android.gms.location.internal.FusedLocationProviderResult;

/* renamed from: aido  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aido {
    private final rge a;

    public aido(rge rge) {
        this.a = rge;
    }

    public final void a() {
        rge rge = this.a;
        String[] strArr = aiei.a;
        try {
            rge.a(FusedLocationProviderResult.a);
        } catch (RemoteException e) {
            aihr.a("Client died before delivering flush location result", new Object[0]);
        }
    }
}
