package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;

/* renamed from: mru  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mru {
    public final arxt a;

    public mru(Context context) {
        this.a = new arxt(context, arwg.a("FastPair").c());
    }

    public static Bitmap a(uaj uaj) {
        if ((uaj.a & 8388608) == 0) {
            return null;
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(uaj.z.k(), 0, uaj.z.a());
        if (!aryg.a(decodeByteArray)) {
            return null;
        }
        return decodeByteArray;
    }

    private final uaj a(tzj tzj) {
        try {
            auay auay = tzj.c;
            aubs c = aubs.c();
            uaj uaj = uaj.K;
            try {
                aubc h = auay.h();
                aucj aucj = (aucj) uaj.c(4);
                aueq a2 = aueh.a.a((Object) aucj);
                a2.a(aucj, aubd.a(h), c);
                a2.d(aucj);
                h.a(0);
                aucj.b(aucj);
                return (uaj) aucj;
            } catch (IOException e) {
                if (!(e.getCause() instanceof auda)) {
                    throw new auda(e.getMessage());
                }
                throw ((auda) e.getCause());
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof auda) {
                    throw ((auda) e2.getCause());
                }
                throw e2;
            } catch (auda e3) {
                throw e3;
            } catch (auda e4) {
                throw e4;
            }
        } catch (auda e5) {
            anih anih = (anih) mte.a.c();
            anih.a((Throwable) e5);
            ((anih) anih.a("mru", "a", 52, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FindDevice: Failed to read device from Footprints based on cached item.");
            return null;
        }
    }
}
