package defpackage;

import android.provider.MediaStore;
import java.util.concurrent.Executor;

/* renamed from: qrm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qrm extends qru {
    public qrm(aplf aplf, Executor executor, qsx qsx) {
        super(aplf, executor, qsx);
    }

    public final aorr a() {
        return a(this.a.b("MusicRecording"), (Integer) 2);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ aplu a(qsv qsv) {
        qsr qsr = (qsr) qsv;
        aply aply = new aply("MusicRecording");
        if (!qsr.b().booleanValue()) {
            return null;
        }
        String valueOf = String.valueOf(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
        String valueOf2 = String.valueOf(qsr.g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("/");
        sb.append(valueOf2);
        aply.b(sb.toString());
        String str = qsr.a;
        if (str == null) {
            str = "Music";
        }
        aply.c(str);
        if (qsr.b != null) {
            aply b = aplz.b();
            b.c(qsr.b);
            aply.a("inAlbum", b);
        }
        Long l = qsr.c;
        if (l != null) {
            aply.a("albumId", l.longValue());
        }
        if (qsr.d != null) {
            aply c = aplz.c();
            c.c(qsr.d);
            aply.a("byArtist", c);
        }
        Long l2 = qsr.e;
        if (l2 != null) {
            aply.a("artistId", l2.longValue());
        }
        return aply.a();
    }
}
