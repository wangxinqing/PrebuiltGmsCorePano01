package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.SystemClock;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.VideoFrame;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MediaCodecVideoDecoder {
    private static int b;
    private static final String[] f = {"OMX.qcom.", "OMX.Exynos."};
    private static final List g = Arrays.asList(new Integer[]{19, 21, 2141391872, 2141391873, 2141391874, 2141391875, 2141391876});
    public MediaCodec a;
    private Thread c;
    private ByteBuffer[] d;
    private ByteBuffer[] e;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private final Queue n = new ArrayDeque();
    private final Queue o = new ArrayDeque();

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    class DecodedOutputBuffer {
        public final int a;
        public final long b;
        public final long c;
        public final long d;
        public final long e;
        private final int f;
        private final int g;

        public DecodedOutputBuffer(int i, int i2, int i3, long j, long j2, long j3, long j4) {
            this.a = i;
            this.f = i2;
            this.g = i3;
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
        }

        /* access modifiers changed from: package-private */
        public long getDecodeTimeMs() {
            return this.e;
        }

        /* access modifiers changed from: package-private */
        public int getIndex() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public long getNtpTimestampMs() {
            return this.d;
        }

        /* access modifiers changed from: package-private */
        public int getOffset() {
            return this.f;
        }

        /* access modifiers changed from: package-private */
        public long getPresentationTimestampMs() {
            return this.b;
        }

        /* access modifiers changed from: package-private */
        public int getSize() {
            return this.g;
        }

        /* access modifiers changed from: package-private */
        public long getTimestampMs() {
            return this.c;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    class DecodedTextureBuffer {
        /* access modifiers changed from: package-private */
        public long getDecodeTimeMs() {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public long getFrameDelayMs() {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public long getNtpTimestampMs() {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public long getPresentationTimestampMs() {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public long getTimeStampMs() {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public VideoFrame.Buffer getVideoFrameBuffer() {
            throw null;
        }
    }

    static {
        new HashSet();
    }

    MediaCodecVideoDecoder() {
    }

    private final void a() {
        if (this.c.getId() != Thread.currentThread().getId()) {
            String valueOf = String.valueOf(this.c);
            String valueOf2 = String.valueOf(Thread.currentThread());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 68 + String.valueOf(valueOf2).length());
            sb.append("MediaCodecVideoDecoder previously operated on ");
            sb.append(valueOf);
            sb.append(" but is now called on ");
            sb.append(valueOf2);
            throw new IllegalStateException(sb.toString());
        }
    }

    private int dequeueInputBuffer() {
        a();
        try {
            return this.a.dequeueInputBuffer(500000);
        } catch (IllegalStateException e2) {
            Logging.a("MediaCodecVideoDecoder", "dequeueIntputBuffer failed", (Throwable) e2);
            return -2;
        }
    }

    private DecodedOutputBuffer dequeueOutputBuffer(int i2) {
        long j2;
        int i3;
        int i4;
        int i5;
        a();
        if (this.n.isEmpty()) {
            return null;
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        while (true) {
            int dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, TimeUnit.MILLISECONDS.toMicros((long) i2));
            if (dequeueOutputBuffer == -3) {
                ByteBuffer[] outputBuffers = this.a.getOutputBuffers();
                this.e = outputBuffers;
                int length = outputBuffers.length;
                StringBuilder sb = new StringBuilder(43);
                sb.append("Decoder output buffers changed: ");
                sb.append(length);
                Logging.a("MediaCodecVideoDecoder", sb.toString());
                if (this.m) {
                    throw new RuntimeException("Unexpected output buffer change event.");
                }
            } else if (dequeueOutputBuffer == -2) {
                MediaFormat outputFormat = this.a.getOutputFormat();
                String valueOf = String.valueOf(outputFormat.toString());
                Logging.a("MediaCodecVideoDecoder", valueOf.length() == 0 ? new String("Decoder format changed: ") : "Decoder format changed: ".concat(valueOf));
                if (!outputFormat.containsKey("crop-left") || !outputFormat.containsKey("crop-right") || !outputFormat.containsKey("crop-bottom") || !outputFormat.containsKey("crop-top")) {
                    i3 = outputFormat.getInteger("width");
                    i4 = outputFormat.getInteger("height");
                } else {
                    i3 = (outputFormat.getInteger("crop-right") + 1) - outputFormat.getInteger("crop-left");
                    i4 = (outputFormat.getInteger("crop-bottom") + 1) - outputFormat.getInteger("crop-top");
                }
                if (this.m && !(i3 == (i5 = this.i) && i4 == this.j)) {
                    int i6 = this.j;
                    StringBuilder sb2 = new StringBuilder(87);
                    sb2.append("Unexpected size change. Configured ");
                    sb2.append(i5);
                    sb2.append("*");
                    sb2.append(i6);
                    sb2.append(". New ");
                    sb2.append(i3);
                    sb2.append("*");
                    sb2.append(i4);
                } else {
                    this.i = i3;
                    this.j = i4;
                    if (outputFormat.containsKey("color-format")) {
                        int integer = outputFormat.getInteger("color-format");
                        this.h = integer;
                        String valueOf2 = String.valueOf(Integer.toHexString(integer));
                        Logging.a("MediaCodecVideoDecoder", valueOf2.length() == 0 ? new String("Color: 0x") : "Color: 0x".concat(valueOf2));
                        if (!g.contains(Integer.valueOf(this.h))) {
                            int i7 = this.h;
                            StringBuilder sb3 = new StringBuilder(39);
                            sb3.append("Non supported color format: ");
                            sb3.append(i7);
                            throw new IllegalStateException(sb3.toString());
                        }
                    }
                    if (outputFormat.containsKey("stride")) {
                        this.k = outputFormat.getInteger("stride");
                    }
                    if (outputFormat.containsKey("slice-height")) {
                        this.l = outputFormat.getInteger("slice-height");
                    }
                    int i8 = this.k;
                    int i9 = this.l;
                    StringBuilder sb4 = new StringBuilder(56);
                    sb4.append("Frame stride and slice height: ");
                    sb4.append(i8);
                    sb4.append(" x ");
                    sb4.append(i9);
                    Logging.a("MediaCodecVideoDecoder", sb4.toString());
                    this.k = Math.max(this.i, this.k);
                    this.l = Math.max(this.j, this.l);
                }
            } else if (dequeueOutputBuffer == -1) {
                return null;
            } else {
                this.m = true;
                baxn baxn = (baxn) this.n.remove();
                long elapsedRealtime = SystemClock.elapsedRealtime() - baxn.a;
                if (elapsedRealtime > 200) {
                    int size = this.n.size();
                    StringBuilder sb5 = new StringBuilder(124);
                    sb5.append("Very high decode time: ");
                    sb5.append(elapsedRealtime);
                    sb5.append("ms. Q size: ");
                    sb5.append(size);
                    sb5.append(". Might be caused by resuming H264 decoding after a pause.");
                    Logging.b("MediaCodecVideoDecoder", sb5.toString());
                    j2 = 200;
                } else {
                    j2 = elapsedRealtime;
                }
                int i10 = bufferInfo.offset;
                int i11 = bufferInfo.size;
                long millis = TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs);
                long j3 = baxn.b;
                long j4 = baxn.c;
                SystemClock.elapsedRealtime();
                return new DecodedOutputBuffer(dequeueOutputBuffer, i10, i11, millis, j3, j4, j2);
            }
        }
        int i62 = this.j;
        StringBuilder sb22 = new StringBuilder(87);
        sb22.append("Unexpected size change. Configured ");
        sb22.append(i5);
        sb22.append("*");
        sb22.append(i62);
        sb22.append(". New ");
        sb22.append(i3);
        sb22.append("*");
        sb22.append(i4);
        throw new RuntimeException(sb22.toString());
    }

    private DecodedTextureBuffer dequeueTextureBuffer(int i2) {
        a();
        throw new IllegalStateException("dequeueTexture() called for byte buffer decoding.");
    }

    private boolean initDecode(int i2, int i3, int i4) {
        String str;
        String[] strArr;
        baxm baxm;
        MediaCodecInfo mediaCodecInfo;
        String str2;
        int i5 = i2;
        int i6 = i3;
        int i7 = i4;
        if (this.c == null) {
            if (i5 == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add("OMX.qcom.");
                arrayList.add("OMX.Nvidia.");
                arrayList.add("OMX.Exynos.");
                arrayList.add("OMX.Intel.");
                if (PeerConnectionFactory.a("WebRTC-MediaTekVP8").equals("Enabled") && Build.VERSION.SDK_INT >= 24) {
                    arrayList.add("OMX.MTK.");
                }
                str = "video/x-vnd.on2.vp8";
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            } else if (i5 == 2) {
                str = "video/x-vnd.on2.vp9";
                strArr = f;
            } else if (i5 == 4) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("OMX.qcom.");
                arrayList2.add("OMX.Intel.");
                arrayList2.add("OMX.Exynos.");
                if (PeerConnectionFactory.a("WebRTC-MediaTekH264").equals("Enabled") && Build.VERSION.SDK_INT >= 27) {
                    arrayList2.add("OMX.MTK.");
                }
                str = "video/avc";
                strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            } else {
                StringBuilder sb = new StringBuilder(43);
                sb.append("initDecode: Non-supported codec ");
                sb.append(i5);
                throw new RuntimeException(sb.toString());
            }
            int i8 = Build.VERSION.SDK_INT;
            Logging.a("MediaCodecVideoDecoder", str.length() == 0 ? new String("Trying to find HW decoder for mime ") : "Trying to find HW decoder for mime ".concat(str));
            int i9 = 0;
            loop0:
            while (true) {
                if (i9 < MediaCodecList.getCodecCount()) {
                    try {
                        mediaCodecInfo = MediaCodecList.getCodecInfoAt(i9);
                    } catch (IllegalArgumentException e2) {
                        Logging.a("MediaCodecVideoDecoder", "Cannot retrieve decoder codec info", (Throwable) e2);
                        mediaCodecInfo = null;
                    }
                    if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder()) {
                        String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 < length) {
                                if (supportedTypes[i10].equals(str)) {
                                    str2 = mediaCodecInfo.getName();
                                    break;
                                }
                                i10++;
                            } else {
                                str2 = null;
                                break;
                            }
                        }
                        if (str2 != null) {
                            String valueOf = String.valueOf(str2);
                            Logging.a("MediaCodecVideoDecoder", valueOf.length() == 0 ? new String("Found candidate decoder ") : "Found candidate decoder ".concat(valueOf));
                            int length2 = strArr.length;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= length2) {
                                    continue;
                                    break;
                                } else if (!str2.startsWith(strArr[i11])) {
                                    i11++;
                                } else {
                                    try {
                                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                                        for (int hexString : capabilitiesForType.colorFormats) {
                                            String valueOf2 = String.valueOf(Integer.toHexString(hexString));
                                            Logging.d("MediaCodecVideoDecoder", valueOf2.length() == 0 ? new String("   Color: 0x") : "   Color: 0x".concat(valueOf2));
                                        }
                                        for (Integer intValue : g) {
                                            int intValue2 = intValue.intValue();
                                            int[] iArr = capabilitiesForType.colorFormats;
                                            int length3 = iArr.length;
                                            int i12 = 0;
                                            while (i12 < length3) {
                                                MediaCodecInfo.CodecCapabilities codecCapabilities = capabilitiesForType;
                                                int i13 = iArr[i12];
                                                if (i13 == intValue2) {
                                                    String hexString2 = Integer.toHexString(i13);
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 32 + String.valueOf(hexString2).length());
                                                    sb2.append("Found target decoder ");
                                                    sb2.append(str2);
                                                    sb2.append(". Color: 0x");
                                                    sb2.append(hexString2);
                                                    Logging.a("MediaCodecVideoDecoder", sb2.toString());
                                                    baxm = new baxm(str2, i13);
                                                    break loop0;
                                                }
                                                i12++;
                                                capabilitiesForType = codecCapabilities;
                                            }
                                            MediaCodecInfo.CodecCapabilities codecCapabilities2 = capabilitiesForType;
                                        }
                                        continue;
                                    } catch (IllegalArgumentException e3) {
                                        Logging.a("MediaCodecVideoDecoder", "Cannot retrieve decoder capabilities", (Throwable) e3);
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    i9++;
                } else {
                    Logging.a("MediaCodecVideoDecoder", str.length() == 0 ? new String("No HW decoder found for mime ") : "No HW decoder found for mime ".concat(str));
                    baxm = null;
                }
            }
            if (baxm != null) {
                String hexString3 = Integer.toHexString(baxm.b);
                StringBuilder sb3 = new StringBuilder(String.valueOf(hexString3).length() + 87);
                sb3.append("Java initDecode: ");
                sb3.append(i5);
                sb3.append(" : ");
                sb3.append(i6);
                sb3.append(" x ");
                sb3.append(i7);
                sb3.append(". Color: 0x");
                sb3.append(hexString3);
                sb3.append(". Use Surface: false");
                Logging.a("MediaCodecVideoDecoder", sb3.toString());
                this.c = Thread.currentThread();
                try {
                    this.i = i6;
                    this.j = i7;
                    this.k = i6;
                    this.l = i7;
                    MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str, i6, i7);
                    createVideoFormat.setInteger("color-format", baxm.b);
                    String valueOf3 = String.valueOf(createVideoFormat);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 10);
                    sb4.append("  Format: ");
                    sb4.append(valueOf3);
                    Logging.a("MediaCodecVideoDecoder", sb4.toString());
                    MediaCodec a2 = MediaCodecVideoEncoder.a(baxm.a);
                    this.a = a2;
                    if (a2 != null) {
                        a2.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 0);
                        this.a.start();
                        this.h = baxm.b;
                        this.e = this.a.getOutputBuffers();
                        this.d = this.a.getInputBuffers();
                        this.n.clear();
                        this.m = false;
                        this.o.clear();
                        int length4 = this.d.length;
                        int length5 = this.e.length;
                        StringBuilder sb5 = new StringBuilder(55);
                        sb5.append("Input buffers: ");
                        sb5.append(length4);
                        sb5.append(". Output buffers: ");
                        sb5.append(length5);
                        Logging.a("MediaCodecVideoDecoder", sb5.toString());
                        return true;
                    }
                    Logging.b("MediaCodecVideoDecoder", "Can not create media decoder");
                    return false;
                } catch (IllegalStateException e4) {
                    Logging.a("MediaCodecVideoDecoder", "initDecode failed", (Throwable) e4);
                    return false;
                }
            } else {
                StringBuilder sb6 = new StringBuilder(38);
                sb6.append("Cannot find HW decoder for ");
                sb6.append(i5);
                throw new RuntimeException(sb6.toString());
            }
        } else {
            throw new RuntimeException("initDecode: Forgot to release()?");
        }
    }

    private boolean queueInputBuffer(int i2, int i3, long j2, long j3, long j4) {
        a();
        try {
            this.d[i2].position(0);
            this.d[i2].limit(i3);
            this.n.add(new baxn(SystemClock.elapsedRealtime(), j3, j4));
            this.a.queueInputBuffer(i2, 0, i3, j2, 0);
            return true;
        } catch (IllegalStateException e2) {
            Logging.a("MediaCodecVideoDecoder", "decode failed", (Throwable) e2);
            return false;
        }
    }

    private void release() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("Java releaseDecoder. Total number of dropped frames: 0");
        Logging.a("MediaCodecVideoDecoder", sb.toString());
        a();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new baxl(this, countDownLatch)).start();
        if (!baym.a(countDownLatch)) {
            Logging.b("MediaCodecVideoDecoder", "Media decoder release timeout");
            b++;
        }
        this.a = null;
        this.c = null;
        Logging.a("MediaCodecVideoDecoder", "Java releaseDecoder done");
    }

    private void reset(int i2, int i3) {
        if (this.c == null || this.a == null) {
            throw new RuntimeException("Incorrect reset call for non-initialized decoder.");
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Java reset: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        Logging.a("MediaCodecVideoDecoder", sb.toString());
        this.a.flush();
        this.i = i2;
        this.j = i3;
        this.n.clear();
        this.o.clear();
        this.m = false;
    }

    private void returnDecodedOutputBuffer(int i2) {
        a();
        this.a.releaseOutputBuffer(i2, false);
    }

    /* access modifiers changed from: package-private */
    public int getColorFormat() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public int getHeight() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public ByteBuffer[] getInputBuffers() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public ByteBuffer[] getOutputBuffers() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public int getSliceHeight() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public int getStride() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public int getWidth() {
        return this.i;
    }
}
