package defpackage;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.R;

/* renamed from: ruw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ruw {
    public static rvu a;

    public static ruv a() {
        try {
            return new ruv(b().a((int) R.drawable.spotlight_poi));
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }

    private static rvu b() {
        rvu rvu = a;
        iva.a((Object) rvu, (Object) "IBitmapDescriptorFactory is not initialized");
        return rvu;
    }

    public static ruv a(Bitmap bitmap) {
        try {
            return new ruv(b().a(bitmap));
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }
}
