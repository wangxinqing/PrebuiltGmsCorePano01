package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.location.places.PlacePhotoResult;

/* renamed from: akjb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akjb {
    private final rjx a;
    private PlacePhotoResult b;
    private Status c;
    private boolean d = false;

    public akjb(rjx rjx) {
        this.a = rjx;
    }

    private final void a() {
        PlacePhotoResult placePhotoResult;
        if (!this.d) {
            Status status = this.c;
            if (status != null && !status.c()) {
                b(new PlacePhotoResult(this.c, (BitmapTeleporter) null));
                return;
            }
            PlacePhotoResult placePhotoResult2 = this.b;
            if (placePhotoResult2 != null && !placePhotoResult2.a.c()) {
                b(new PlacePhotoResult(this.b.a, (BitmapTeleporter) null));
            } else if (this.c != null && (placePhotoResult = this.b) != null) {
                b(placePhotoResult);
            }
        }
    }

    private final void b(PlacePhotoResult placePhotoResult) {
        this.d = true;
        try {
            this.a.a(placePhotoResult);
        } catch (RemoteException e) {
        }
    }

    public final synchronized void a(Status status) {
        this.c = status;
        a();
    }

    public final synchronized void a(PlacePhotoResult placePhotoResult) {
        this.b = placePhotoResult;
        a();
    }
}
