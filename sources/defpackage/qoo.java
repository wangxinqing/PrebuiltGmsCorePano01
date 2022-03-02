package defpackage;

import android.database.Cursor;
import android.provider.MediaStore;

/* renamed from: qoo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qoo {
    public static aorr a(qsa qsa, qru qru, int i, int i2, qrd qrd) {
        qsg qsg = null;
        if (i == 10) {
            qsd a = qse.a();
            a.f = 1;
            a.a = 0L;
            a.c = MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI;
            a.d = qsa.a;
            Cursor a2 = qsa.d.a(a.a());
            if (a2 != null) {
                qsg = new qsh(a2);
            }
        } else if (i != 11) {
            qsd a3 = qse.a();
            a3.f = 1;
            a3.a = 0L;
            a3.c = MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI;
            a3.d = qsa.b;
            Cursor a4 = qsa.d.a(a3.a());
            if (a4 != null) {
                qsg = new qsk(a4);
            }
        } else {
            qsd a5 = qse.a();
            a5.f = 1;
            a5.a = 0L;
            a5.c = MediaStore.Audio.Artists.EXTERNAL_CONTENT_URI;
            a5.d = qsa.c;
            Cursor a6 = qsa.d.a(a5.a());
            if (a6 != null) {
                qsg = new qsi(a6);
            }
        }
        if (qsg == null) {
            return aorl.a((Object) false);
        }
        try {
            qri qri = new qri(i2);
            qri.c();
            qrd.a(qri);
            aorr a7 = qru.a(qsg, qri);
            qsg.close();
            return a7;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
