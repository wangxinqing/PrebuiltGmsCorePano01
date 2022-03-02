package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.internal.MessageWrapper;
import java.util.List;

/* renamed from: vcd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vcd extends bhv implements vcf {
    public vcd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.messages.internal.IMessageListener");
    }

    public final void a(MessageWrapper messageWrapper) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) messageWrapper);
        c(1, aQ);
    }

    public final void b(MessageWrapper messageWrapper) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) messageWrapper);
        c(2, aQ);
    }

    public final void a(List list) {
        Parcel aQ = aQ();
        aQ.writeTypedList(list);
        c(4, aQ);
    }
}
