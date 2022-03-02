package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;

/* renamed from: abxl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abxl extends bhv implements abxn {
    public abxl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.d2d.internal.ITargetBootstrapListener");
    }

    public final void a(int i) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        b(7, aQ);
    }

    public final void b() {
        b(2, aQ());
    }

    public final void c() {
        b(4, aQ());
    }

    public final void a(BootstrapCompletionResult bootstrapCompletionResult) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) bootstrapCompletionResult);
        c(8, aQ);
    }

    public final void b(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        b(6, aQ);
    }

    public final void a(TargetConnectionArgs targetConnectionArgs) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) targetConnectionArgs);
        b(1, aQ);
    }

    public final void a(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        b(5, aQ);
    }

    public final boolean a(BootstrapProgressResult bootstrapProgressResult) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) bootstrapProgressResult);
        Parcel a = a(3, aQ);
        boolean a2 = bhx.a(a);
        a.recycle();
        return a2;
    }
}
