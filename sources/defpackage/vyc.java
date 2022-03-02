package defpackage;

import android.os.Parcel;
import com.google.android.gms.nearby.sharing.Contact;
import java.util.List;

/* renamed from: vyc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vyc extends bhw implements vyd {
    final /* synthetic */ acwd a;

    public vyc() {
        super("com.google.android.gms.nearby.sharing.internal.IContactsResultListener");
    }

    public final void a(List list) {
        this.a.a((Object) list);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vyc(acwd acwd) {
        super("com.google.android.gms.nearby.sharing.internal.IContactsResultListener");
        this.a = acwd;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a(parcel.createTypedArrayList(Contact.CREATOR));
        return true;
    }
}
