package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;

/* renamed from: cqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cqo extends bhw implements IInterface {
    final /* synthetic */ BlockingQueue a;

    public cqo() {
        super("com.google.android.finsky.zapp.protocol.IPlayModuleServiceCallbacks");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        int readInt = parcel.readInt();
        ArrayList createTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
        Bundle bundle = (Bundle) bhx.a(parcel, Bundle.CREATOR);
        if (this.a.peek() != null) {
            return true;
        }
        this.a.add(new cqc(readInt, createTypedArrayList, bundle));
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cqo(BlockingQueue blockingQueue) {
        super("com.google.android.finsky.zapp.protocol.IPlayModuleServiceCallbacks");
        this.a = blockingQueue;
    }
}
