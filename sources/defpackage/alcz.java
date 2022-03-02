package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.location.places.PlacePhotoMetadataResult;
import com.google.android.gms.location.places.PlacePhotoResult;
import java.util.Iterator;

/* renamed from: alcz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alcz implements icm {
    final /* synthetic */ alda a;
    private final icm b;
    private final int c;
    private final int d;

    public alcz(alda alda, icm icm, int i, int i2) {
        this.a = alda;
        this.b = icm;
        this.c = i;
        this.d = i2;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        ric ric;
        PlacePhotoMetadataResult placePhotoMetadataResult = (PlacePhotoMetadataResult) icl;
        if (placePhotoMetadataResult.a.c()) {
            rid rid = placePhotoMetadataResult.c;
            if (rid.a() == 0) {
                rid.c();
                this.b.a(new PlacePhotoResult(new Status(13, "No photos returned"), (BitmapTeleporter) null));
                return;
            }
            Iterator it = rid.iterator();
            while (true) {
                if (!it.hasNext()) {
                    ric = null;
                    break;
                }
                ric ric2 = (ric) it.next();
                if (ric2.a() >= this.c && ric2.b() >= this.d) {
                    ric = (ric) ric2.r();
                    break;
                }
            }
            rid.c();
            if (ric == null) {
                this.b.a(new PlacePhotoResult(new Status(13, "No suitable photos returned"), (BitmapTeleporter) null));
                return;
            }
            icf a2 = ric.a(this.a.c, this.c, this.d);
            a2.a(this.b);
            this.a.k = a2;
            return;
        }
        this.b.a(new PlacePhotoResult(placePhotoMetadataResult.a, (BitmapTeleporter) null));
    }
}
