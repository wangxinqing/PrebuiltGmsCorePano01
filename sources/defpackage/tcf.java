package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.OpenFileDescriptorRequest;

/* renamed from: tcf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tcf implements jhz {
    private final OpenFileDescriptorRequest a;

    public tcf(OpenFileDescriptorRequest openFileDescriptorRequest) {
        this.a = openFileDescriptorRequest;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        tcl tcl = (tcl) obj;
        acwd acwd = (acwd) obj2;
        try {
            ((tbz) tcl.x()).a((tbw) new tce(acwd), this.a);
        } catch (RemoteException e) {
            ihd.a(Status.c, (Object) null, acwd);
        }
    }
}
