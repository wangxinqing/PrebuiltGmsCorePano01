package defpackage;

import android.os.Parcel;
import com.google.android.gms.clearcut.CollectForDebugParcelable;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: hsw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hsw extends bhw implements hsx {
    final /* synthetic */ hsl a;

    public hsw() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    public final void a(Status status) {
        this.a.a((icl) status);
    }

    public final void b(Status status) {
        throw new UnsupportedOperationException();
    }

    public final void c(Status status) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hsw(hsl hsl) {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
        this.a = hsl;
    }

    public final void a(Status status, long j) {
        throw new UnsupportedOperationException();
    }

    public final void b(Status status, long j) {
        throw new UnsupportedOperationException();
    }

    public final void a(Status status, CollectForDebugParcelable collectForDebugParcelable) {
        throw new UnsupportedOperationException();
    }

    public final void b(Status status, CollectForDebugParcelable collectForDebugParcelable) {
        throw new UnsupportedOperationException();
    }

    public final void a(DataHolder dataHolder) {
        throw new UnsupportedOperationException();
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                a((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 2:
                b((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 3:
                a((Status) bhx.a(parcel, Status.CREATOR), parcel.readLong());
                return true;
            case 4:
                c((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 5:
                b((Status) bhx.a(parcel, Status.CREATOR), parcel.readLong());
                return true;
            case 6:
                Status status = (Status) bhx.a(parcel, Status.CREATOR);
                LogEventParcelable[] logEventParcelableArr = (LogEventParcelable[]) parcel.createTypedArray(LogEventParcelable.CREATOR);
                throw new UnsupportedOperationException();
            case 7:
                a((DataHolder) bhx.a(parcel, DataHolder.CREATOR));
                return true;
            case 8:
                a((Status) bhx.a(parcel, Status.CREATOR), (CollectForDebugParcelable) bhx.a(parcel, CollectForDebugParcelable.CREATOR));
                return true;
            case 9:
                b((Status) bhx.a(parcel, Status.CREATOR), (CollectForDebugParcelable) bhx.a(parcel, CollectForDebugParcelable.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
