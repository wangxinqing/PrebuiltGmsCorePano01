package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;

/* renamed from: get  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class get extends bhw implements IInterface {
    final /* synthetic */ acwd a;

    public get() {
        super("com.google.android.gms.auth.folsom.internal.ISharedKeyCallback");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public get(acwd acwd) {
        super("com.google.android.gms.auth.folsom.internal.ISharedKeyCallback");
        this.a = acwd;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) bhx.a(parcel, Status.CREATOR);
        SharedKey[] sharedKeyArr = (SharedKey[]) parcel.createTypedArray(SharedKey.CREATOR);
        if (status.c()) {
            this.a.a((Object) Arrays.asList(sharedKeyArr));
        } else {
            this.a.a((Exception) irj.a(status));
        }
        return true;
    }
}
