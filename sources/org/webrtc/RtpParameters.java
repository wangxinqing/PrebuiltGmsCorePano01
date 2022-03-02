package org.webrtc;

import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RtpParameters {
    public final String a;
    public DegradationPreference b;
    public final List c;
    public final List d;
    private final Rtcp e;
    private final List f;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class Codec {
        public int a;
        public String b;
        MediaStreamTrack.MediaType c;
        public Integer d;
        public Integer e;
        public Map f;

        Codec(int i, String str, MediaStreamTrack.MediaType mediaType, Integer num, Integer num2, Map map) {
            this.a = i;
            this.b = str;
            this.c = mediaType;
            this.d = num;
            this.e = num2;
            this.f = map;
        }

        /* access modifiers changed from: package-private */
        public Integer getClockRate() {
            return this.d;
        }

        /* access modifiers changed from: package-private */
        public MediaStreamTrack.MediaType getKind() {
            return this.c;
        }

        /* access modifiers changed from: package-private */
        public String getName() {
            return this.b;
        }

        /* access modifiers changed from: package-private */
        public Integer getNumChannels() {
            return this.e;
        }

        /* access modifiers changed from: package-private */
        public Map getParameters() {
            return this.f;
        }

        /* access modifiers changed from: package-private */
        public int getPayloadType() {
            return this.a;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum DegradationPreference {
        DISABLED,
        MAINTAIN_FRAMERATE,
        MAINTAIN_RESOLUTION,
        BALANCED;

        static DegradationPreference fromNativeIndex(int i) {
            return values()[i];
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class Encoding {
        public String a;
        public boolean b;
        public Integer c;
        public Integer d;
        public Integer e;
        public Integer f;
        public Double g;
        public Long h;

        Encoding(String str, boolean z, Integer num, Integer num2, Integer num3, Integer num4, Double d2, Long l) {
            this.a = str;
            this.b = z;
            this.c = num;
            this.d = num2;
            this.e = num3;
            this.f = num4;
            this.g = d2;
            this.h = l;
        }

        /* access modifiers changed from: package-private */
        public boolean getActive() {
            return this.b;
        }

        /* access modifiers changed from: package-private */
        public Integer getMaxBitrateBps() {
            return this.c;
        }

        /* access modifiers changed from: package-private */
        public Integer getMaxFramerate() {
            return this.e;
        }

        /* access modifiers changed from: package-private */
        public Integer getMinBitrateBps() {
            return this.d;
        }

        /* access modifiers changed from: package-private */
        public Integer getNumTemporalLayers() {
            return this.f;
        }

        /* access modifiers changed from: package-private */
        public String getRid() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public Double getScaleResolutionDownBy() {
            return this.g;
        }

        /* access modifiers changed from: package-private */
        public Long getSsrc() {
            return this.h;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class HeaderExtension {
        private final String a;
        private final int b;
        private final boolean c;

        HeaderExtension(String str, int i, boolean z) {
            this.a = str;
            this.b = i;
            this.c = z;
        }

        public boolean getEncrypted() {
            return this.c;
        }

        public int getId() {
            return this.b;
        }

        public String getUri() {
            return this.a;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class Rtcp {
        private final String a;
        private final boolean b;

        Rtcp(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public String getCname() {
            return this.a;
        }

        public boolean getReducedSize() {
            return this.b;
        }
    }

    RtpParameters(String str, DegradationPreference degradationPreference, Rtcp rtcp, List list, List list2, List list3) {
        this.a = str;
        this.b = degradationPreference;
        this.e = rtcp;
        this.f = list;
        this.c = list2;
        this.d = list3;
    }

    /* access modifiers changed from: package-private */
    public List getCodecs() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public DegradationPreference getDegradationPreference() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public List getEncodings() {
        return this.c;
    }

    public List getHeaderExtensions() {
        return this.f;
    }

    public Rtcp getRtcp() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public String getTransactionId() {
        return this.a;
    }
}
