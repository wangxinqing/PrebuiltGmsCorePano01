package org.webrtc;

import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Metrics {
    public final Map a = new HashMap();

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class HistogramInfo {
        public final Map a = new HashMap();

        public HistogramInfo(int i, int i2, int i3) {
        }

        public void addSample(int i, int i2) {
            this.a.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    Metrics() {
    }

    private void add(String str, HistogramInfo histogramInfo) {
        this.a.put(str, histogramInfo);
    }
}
