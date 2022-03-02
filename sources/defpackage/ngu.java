package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fonts.FontFetchResult;

/* renamed from: ngu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ngu extends bhv implements IInterface {
    public ngu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fonts.internal.IFontsCallbacks");
    }

    public final void a(FontFetchResult fontFetchResult) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) fontFetchResult);
        b(1, aQ);
    }
}
