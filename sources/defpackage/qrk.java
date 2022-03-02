package defpackage;

import android.provider.MediaStore;
import java.util.concurrent.Executor;

/* renamed from: qrk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qrk extends qru {
    public qrk(aplf aplf, Executor executor, qsx qsx) {
        super(aplf, executor, qsx);
    }

    public final aorr a() {
        return a(this.a.b("MusicAlbum"), (Integer) 10);
    }

    /* access modifiers changed from: protected */
    public final boolean b() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ aplu a(qsv qsv) {
        qsn qsn = (qsn) qsv;
        if (!qsn.b().booleanValue()) {
            return null;
        }
        aply b = aplz.b();
        String valueOf = String.valueOf(MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI);
        String valueOf2 = String.valueOf(qsn.g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("/");
        sb.append(valueOf2);
        b.b(sb.toString());
        String str = qsn.a;
        if (str == null) {
            str = "Untitled Album";
        }
        b.c(str);
        String str2 = qsn.b;
        if (str2 != null) {
            b.a(str2);
        }
        Integer num = qsn.d;
        if (num != null) {
            b.a("numTracks", (long) num.intValue());
        }
        if (qsn.c != null) {
            aply c = aplz.c();
            c.c(qsn.c);
            b.a("byArtist", c);
        }
        return b.a();
    }
}
