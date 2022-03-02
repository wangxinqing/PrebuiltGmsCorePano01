package defpackage;

import android.media.AudioRecord;
import android.os.SystemClock;
import com.android.volley.toolbox.ImageRequest;
import java.util.Locale;

/* renamed from: ahvq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahvq implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ ahvs b;

    public ahvq(ahvs ahvs, int i) {
        this.b = ahvs;
        this.a = i;
    }

    public final void run() {
        ahvs ahvs = this.b;
        int i = this.a;
        while (ahvs.a) {
            if (ahvs.a && ahvs.a) {
                try {
                    ahvs.b = new AudioRecord.Builder().setAudioSource(ahvs.g()).setAudioFormat(ahvs.c()).setBufferSizeInBytes(i).build();
                    if (ahvs.b.getState() != 0) {
                        ahvs.b.startRecording();
                        if (ahvs.b.getRecordingState() != 1) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            int channelCount = ahvs.b.getChannelCount();
                            int bufferSizeInFrames = ahvs.b.getBufferSizeInFrames();
                            ahsr ahsr = ahvs.h;
                            ahsr.post(new ahsp(ahsr, ahvs.g(), ahvs.d(), channelCount));
                            if (ahvs.b.getRoutedDevice() != null) {
                                Locale.getDefault();
                                Object[] objArr = {ahvs.b.getRoutedDevice().getProductName(), Integer.valueOf(ahvs.b.getRoutedDevice().getType())};
                            }
                            boolean a2 = ahvs.a(bufferSizeInFrames, channelCount, elapsedRealtime);
                            if (a2) {
                                try {
                                    ahvs.b.stop();
                                } catch (IllegalArgumentException e) {
                                }
                            }
                            ahvs.b.release();
                            ahvs.b = null;
                            if (a2) {
                            }
                        } else {
                            ahvs.b.release();
                        }
                    }
                } catch (IllegalStateException e2) {
                    ahvs.b.release();
                }
                Locale.getDefault();
                new Object[1][0] = Integer.valueOf(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e3) {
                }
            }
        }
    }
}
