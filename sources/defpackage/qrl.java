package defpackage;

import android.provider.MediaStore;
import android.text.TextUtils;
import java.util.concurrent.Executor;

/* renamed from: qrl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qrl extends qru {
    public qrl(aplf aplf, Executor executor, qsx qsx) {
        super(aplf, executor, qsx);
    }

    public final aorr a() {
        return a(this.a.b("MusicGroup"), (Integer) 11);
    }

    /* access modifiers changed from: protected */
    public final boolean b() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ aplu a(qsv qsv) {
        qsp qsp = (qsp) qsv;
        if (!qsp.b().booleanValue() || TextUtils.isEmpty(qsp.a)) {
            return null;
        }
        aply c = aplz.c();
        String valueOf = String.valueOf(MediaStore.Audio.Artists.EXTERNAL_CONTENT_URI);
        String valueOf2 = String.valueOf(qsp.g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("/");
        sb.append(valueOf2);
        c.b(sb.toString());
        c.c(qsp.a);
        return c.a();
    }
}
