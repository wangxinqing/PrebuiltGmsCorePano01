package defpackage;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;
import java.io.File;
import java.io.IOException;

/* renamed from: ufc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ufc implements igp {
    private final String a;
    private final tjc b;

    public ufc(String str, tjc tjc) {
        this.a = str;
        this.b = tjc;
    }

    public final void a(Object obj, Object obj2) {
        Pair pair;
        String str = this.a;
        tjc tjc = this.b;
        ueq ueq = (ueq) obj;
        ufs ufs = new ufs((acwd) obj2);
        String[] strArr = {str};
        try {
            int i = tjc.b;
            if (i == 1) {
                uil uil = new uil();
                uil.a(tjc.a);
                uil.a(tjc.b);
                uil.a(tjc.c);
                pair = Pair.create(uil.a, (Object) null);
            } else if (i != 2) {
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor[] createPipe2 = ParcelFileDescriptor.createPipe();
                uil uil2 = new uil();
                uil2.a(tjc.a);
                uil2.a(tjc.b);
                uil2.a(createPipe[0]);
                ParcelFileDescriptor parcelFileDescriptor = createPipe2[0];
                ParcelablePayload parcelablePayload = uil2.a;
                parcelablePayload.g = parcelFileDescriptor;
                pair = Pair.create(parcelablePayload, Pair.create(createPipe[1], createPipe2[1]));
            } else {
                File file = tjc.d.a;
                String absolutePath = file != null ? file.getAbsolutePath() : null;
                uil uil3 = new uil();
                uil3.a(tjc.a);
                uil3.a(tjc.b);
                uil3.a(tjc.d.b);
                uil3.a(absolutePath);
                uil3.b(tjc.d.c);
                pair = Pair.create(uil3.a, (Object) null);
            }
            uir uir = new uir();
            uir.a((uha) new uen(ufs));
            uir.a(strArr);
            uir.a((ParcelablePayload) pair.first);
            ((ugu) ueq.x()).a(uir.a);
            if (pair.second != null) {
                Pair pair2 = (Pair) pair.second;
                uik uik = ueq.w;
                tjb tjb = tjc.e;
                if (tjb.b == null) {
                    tjb.b = new ParcelFileDescriptor.AutoCloseInputStream(tjb.a);
                }
                uik.a.execute(new uij(uik, tjb.b, new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) pair2.first), tjc.a, new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) pair2.second)));
            }
        } catch (IOException e) {
            Log.e("NearbyConnections", String.format("Unable to create PFD pipe for streaming payload %d from client to service.", new Object[]{Long.valueOf(tjc.a)}), e);
            throw e;
        } catch (IOException e2) {
            ufs.a((Object) ueq.b(8013));
        }
    }
}
