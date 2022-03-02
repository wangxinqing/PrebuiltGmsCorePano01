package defpackage;

import com.google.android.gms.audiomodem.AudioStreamParams;
import com.google.android.gms.audiomodem.Encoding;
import java.io.FileInputStream;

/* renamed from: efw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class efw implements Runnable {
    private final efz a;
    private final AudioStreamParams b;
    private final efi c;

    public efw(efz efz, AudioStreamParams audioStreamParams, efi efi) {
        this.a = efz;
        this.b = audioStreamParams;
        this.c = efi;
    }

    public final void run() {
        efz efz = this.a;
        AudioStreamParams audioStreamParams = this.b;
        efi efi = this.c;
        eda eda = efz.b;
        jjg jjg = edx.a;
        FileInputStream fileInputStream = new FileInputStream(audioStreamParams.a.getFileDescriptor());
        eeo eeo = eda.e;
        edj edj = new edj(fileInputStream, audioStreamParams.c, audioStreamParams.d);
        eeo.a();
        eeo.b = edj;
        for (Encoding encoding : eeo.a.keySet()) {
            eeo.b.a((ecf) eeo.a.get(encoding));
        }
        eda.a.postDelayed(new ecv(efi), 2000);
    }
}
