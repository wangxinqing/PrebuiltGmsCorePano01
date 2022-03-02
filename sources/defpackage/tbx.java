package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobstore.DeleteFileRequest;
import com.google.android.gms.mobstore.OpenFileDescriptorRequest;
import com.google.android.gms.mobstore.RenameRequest;

/* renamed from: tbx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tbx extends bhv implements tbz {
    public tbx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mobstore.IMobStoreFileService");
    }

    public final void a(tbw tbw, DeleteFileRequest deleteFileRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) tbw);
        bhx.a(aQ, (Parcelable) deleteFileRequest);
        b(2, aQ);
    }

    public final void a(tbw tbw, OpenFileDescriptorRequest openFileDescriptorRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) tbw);
        bhx.a(aQ, (Parcelable) openFileDescriptorRequest);
        b(1, aQ);
    }

    public final void a(tbw tbw, RenameRequest renameRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) tbw);
        bhx.a(aQ, (Parcelable) renameRequest);
        b(3, aQ);
    }
}
