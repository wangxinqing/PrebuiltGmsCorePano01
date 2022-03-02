package defpackage;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.plus.audience.AudienceSelectionListPersonView;

/* renamed from: yon  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yon implements icm {
    final /* synthetic */ Object a;
    final /* synthetic */ AudienceSelectionListPersonView b;
    final /* synthetic */ String c;
    final /* synthetic */ boolean d;
    final /* synthetic */ yoy e;

    public yon(yoy yoy, Object obj, AudienceSelectionListPersonView audienceSelectionListPersonView, String str, boolean z) {
        this.e = yoy;
        this.a = obj;
        this.b = audienceSelectionListPersonView;
        this.c = str;
        this.d = z;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        Bitmap a2;
        wlj wlj = (wlj) icl;
        ParcelFileDescriptor b2 = wlj.b();
        try {
            if (wlj.aO().c()) {
                if (this.a == this.b.d) {
                    if (!(b2 == null || (a2 = wlu.a(b2)) == null)) {
                        this.e.D.a((Object) this.c, (Object) a2);
                        this.e.a(this.b, a2, this.d);
                    }
                }
            }
        } finally {
            jjt.a(b2);
        }
    }
}
