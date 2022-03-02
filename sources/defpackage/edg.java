package defpackage;

import android.media.AudioRecord;
import android.os.Process;
import java.nio.ByteBuffer;

/* renamed from: edg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class edg implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ edh b;

    public edg(edh edh, int i) {
        this.b = edh;
        this.a = i;
    }

    public final void run() {
        jjg jjg = edx.a;
        Process.setThreadPriority(-19);
        eef eef = this.b.f;
        if (eef.a == null) {
            eef.a = new AudioRecord(eef.c, eef.e, eef.b, 2, eef.a(eef.f));
        }
        AudioRecord audioRecord = eef.a;
        try {
            audioRecord.startRecording();
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.a);
            while (!this.b.e.get()) {
                int read = audioRecord.read(allocateDirect, allocateDirect.capacity());
                if (read > 0) {
                    allocateDirect.limit(read);
                    allocateDirect.position(0);
                    for (ecf a2 : (ecf[]) this.b.b.a) {
                        a2.a(allocateDirect);
                    }
                    allocateDirect.clear();
                } else if (read == -3) {
                    this.b.c.a(17);
                    this.b.e.set(true);
                    this.b.f();
                }
                System.currentTimeMillis();
                long j = this.b.g;
            }
            this.b.g = 0;
            try {
                audioRecord.stop();
            } catch (IllegalStateException e) {
                anih anih = (anih) edx.a.b();
                anih.a((Throwable) e);
                ((anih) anih.a("edg", "run", 242, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Error when stopping AudioRecord");
            }
            edu.a(this.b.a);
            eef eef2 = this.b.f;
            eef2.a.release();
            eef2.a = null;
            this.b.e.set(false);
            this.b.d.set(false);
            for (ecf a3 : (ecf[]) this.b.b.a) {
                a3.a();
            }
        } catch (IllegalStateException e2) {
            this.b.c.a(16);
            this.b.f();
            this.b.d.set(false);
        }
    }
}
