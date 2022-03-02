package defpackage;

import android.provider.MediaStore;
import android.text.TextUtils;
import java.util.concurrent.Executor;

/* renamed from: qrn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qrn extends qru {
    public qrn(aplf aplf, Executor executor, qsx qsx) {
        super(aplf, executor, qsx);
    }

    public final aorr a() {
        return a(this.a.b("MusicPlaylist"), (Integer) 12);
    }

    /* access modifiers changed from: protected */
    public final boolean b() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ aplu a(qsv qsv) {
        qst qst = (qst) qsv;
        if (!qst.b().booleanValue() || TextUtils.isEmpty(qst.a)) {
            return null;
        }
        String valueOf = String.valueOf(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI);
        String valueOf2 = String.valueOf(qst.g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("/");
        sb.append(valueOf2);
        String sb2 = sb.toString();
        aply aply = new aply("MusicPlaylist");
        aply.b(sb2);
        aply.c(qst.a);
        return aply.a();
    }
}
