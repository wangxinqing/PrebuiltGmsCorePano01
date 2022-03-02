package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdd.FileGroupRequest;

/* renamed from: rxv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class rxv implements jhz {
    private final FileGroupRequest a;

    public rxv(FileGroupRequest fileGroupRequest) {
        this.a = fileGroupRequest;
    }

    public final void a(Object obj, Object obj2) {
        FileGroupRequest fileGroupRequest = this.a;
        rya rya = (rya) obj;
        acwd acwd = (acwd) obj2;
        try {
            ((rxe) rya.x()).a((ifu) new rxx(acwd), fileGroupRequest);
        } catch (RemoteException e) {
            ihd.a(Status.c, acwd);
        }
    }
}
