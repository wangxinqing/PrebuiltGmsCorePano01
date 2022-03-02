package defpackage;

import android.os.Parcel;
import com.google.android.gms.contextmanager.ContextData;

/* renamed from: jxb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class jxb extends bhw implements jxc {
    public jxb() {
        super("com.google.android.gms.contextmanager.internal.IContextListener");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((ContextData) bhx.a(parcel, ContextData.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
