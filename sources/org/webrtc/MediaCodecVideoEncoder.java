package org.webrtc;

import android.graphics.Matrix;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import com.android.volley.toolbox.ImageRequest;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.VideoFrame;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MediaCodecVideoEncoder {
    private static int b;
    private static final baxs i = new baxs("OMX.qcom.", 19, 1);
    private static final baxs j = new baxs("OMX.Exynos.", 23, 3);
    private static final baxs k = new baxs("OMX.Intel.", 21, 1);
    private static final baxs l = new baxs("OMX.qcom.", 24, 1);
    private static final baxs m;
    private static final baxs[] n;
    private static final baxs o = new baxs("OMX.qcom.", 19, 1);
    private static final baxs p = new baxs("OMX.Exynos.", 21, 2);
    private static final baxs q = new baxs("OMX.MTK.", 27, 2);
    private static final baxs r;
    private static final baxs[] s;
    private static final String[] t = {"SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4"};
    private static final int[] u = {19, 21, 2141391872, 2141391876};
    private static final int[] v = {2130708361};
    private double A;
    private int B;
    private int C;
    private int D;
    private long E;
    private long F;
    private ByteBuffer G;
    private int H = 1;
    private baxf I;
    public MediaCodec a;
    private Thread c;
    private ByteBuffer[] d;
    private baxb e;
    private int f;
    private int g;
    private Surface h;
    private int w;
    private int x;
    private double y;
    private double z;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    class OutputBufferInfo {
        public final int a;
        public final ByteBuffer b;
        public final boolean c;
        public final long d;

        public OutputBufferInfo(int i, ByteBuffer byteBuffer, boolean z, long j) {
            this.a = i;
            this.b = byteBuffer;
            this.c = z;
            this.d = j;
        }

        /* access modifiers changed from: package-private */
        public ByteBuffer getBuffer() {
            return this.b;
        }

        /* access modifiers changed from: package-private */
        public int getIndex() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public long getPresentationTimestampUs() {
            return this.d;
        }

        /* access modifiers changed from: package-private */
        public boolean isKeyFrame() {
            return this.c;
        }
    }

    static {
        new HashSet();
        baxs baxs = new baxs("OMX.Exynos.", 24, 2);
        m = baxs;
        n = new baxs[]{l, baxs};
        baxs baxs2 = new baxs("OMX.Exynos.", 23, 2);
        r = baxs2;
        s = new baxs[]{baxs2};
    }

    MediaCodecVideoEncoder() {
    }

    private static final double a(int i2) {
        double d2 = (double) i2;
        Double.isNaN(d2);
        return Math.pow(4.0d, d2 / 20.0d);
    }

    static boolean isTextureBuffer(VideoFrame.Buffer buffer) {
        return buffer instanceof bayp;
    }

    private static native void nativeFillInputBuffer(long j2, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5);

    private boolean setRates(int i2, int i3) {
        a();
        int i4 = i2 * ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
        int i5 = this.H;
        if (i5 == 3) {
            double d2 = (double) i4;
            Double.isNaN(d2);
            this.z = d2 / 8.0d;
            int i6 = this.C;
            if (i6 > 0 && i4 < i6) {
                double d3 = this.y;
                Double.isNaN(d2);
                double d4 = d3 * d2;
                double d5 = (double) i6;
                Double.isNaN(d5);
                this.y = d4 / d5;
            }
        }
        this.C = i4;
        this.D = i3;
        if (i5 == 2 && i3 > 0) {
            i4 = (i4 * 30) / i3;
            StringBuilder sb = new StringBuilder(59);
            sb.append("setRates: ");
            sb.append(i2);
            sb.append(" -> ");
            sb.append(i4 / ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
            sb.append(" kbps. Fps: ");
            sb.append(i3);
            Logging.d("MediaCodecVideoEncoder", sb.toString());
        } else if (i5 == 3) {
            int i7 = this.B;
            StringBuilder sb2 = new StringBuilder(67);
            sb2.append("setRates: ");
            sb2.append(i2);
            sb2.append(" kbps. Fps: ");
            sb2.append(i3);
            sb2.append(". ExpScale: ");
            sb2.append(i7);
            Logging.d("MediaCodecVideoEncoder", sb2.toString());
            int i8 = this.B;
            if (i8 != 0) {
                double d6 = (double) i4;
                double a2 = a(i8);
                Double.isNaN(d6);
                i4 = (int) (d6 * a2);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(44);
            sb3.append("setRates: ");
            sb3.append(i2);
            sb3.append(" kbps. Fps: ");
            sb3.append(i3);
            Logging.d("MediaCodecVideoEncoder", sb3.toString());
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", i4);
            this.a.setParameters(bundle);
            return true;
        } catch (IllegalStateException e2) {
            Logging.a("MediaCodecVideoEncoder", "setRates failed", (Throwable) e2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public int dequeueInputBuffer() {
        a();
        try {
            return this.a.dequeueInputBuffer(0);
        } catch (IllegalStateException e2) {
            Logging.a("MediaCodecVideoEncoder", "dequeueIntputBuffer failed", (Throwable) e2);
            return -2;
        }
    }

    public OutputBufferInfo dequeueOutputBuffer() {
        int i2;
        a();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer >= 0 && (bufferInfo.flags & 2) != 0) {
                int i3 = bufferInfo.offset;
                int i4 = bufferInfo.size;
                StringBuilder sb = new StringBuilder(62);
                sb.append("Config frame generated. Offset: ");
                sb.append(i3);
                sb.append(". Size: ");
                sb.append(i4);
                Logging.a("MediaCodecVideoEncoder", sb.toString());
                this.G = ByteBuffer.allocateDirect(bufferInfo.size);
                this.d[dequeueOutputBuffer].position(bufferInfo.offset);
                this.d[dequeueOutputBuffer].limit(bufferInfo.offset + bufferInfo.size);
                this.G.put(this.d[dequeueOutputBuffer]);
                String str = "";
                int i5 = 0;
                while (true) {
                    int i6 = 8;
                    if (bufferInfo.size < 8) {
                        i6 = bufferInfo.size;
                    }
                    if (i5 >= i6) {
                        break;
                    }
                    String valueOf = String.valueOf(str);
                    String hexString = Integer.toHexString(this.G.get(i5) & 255);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(hexString).length());
                    sb2.append(valueOf);
                    sb2.append(hexString);
                    sb2.append(" ");
                    str = sb2.toString();
                    i5++;
                }
                Logging.a("MediaCodecVideoEncoder", str);
                this.a.releaseOutputBuffer(dequeueOutputBuffer, false);
                dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0);
            }
            int i7 = dequeueOutputBuffer;
            if (i7 >= 0) {
                ByteBuffer duplicate = this.d[i7].duplicate();
                duplicate.position(bufferInfo.offset);
                duplicate.limit(bufferInfo.offset + bufferInfo.size);
                int i8 = bufferInfo.size;
                int i9 = this.D;
                if (i9 != 0 && this.H == 3) {
                    int i10 = this.C;
                    double d2 = this.y;
                    double d3 = (double) i8;
                    double d4 = (double) i10;
                    double d5 = (double) i9;
                    Double.isNaN(d5);
                    Double.isNaN(d4);
                    Double.isNaN(d3);
                    double d6 = d2 + (d3 - (d4 / (8.0d * d5)));
                    this.y = d6;
                    double d7 = this.A;
                    Double.isNaN(d5);
                    this.A = d7 + (1000.0d / d5);
                    double d8 = this.z * 3.0d;
                    double min = Math.min(d6, d8);
                    this.y = min;
                    double max = Math.max(min, -d8);
                    this.y = max;
                    if (this.A > 3000.0d) {
                        double d9 = this.z;
                        int i11 = this.B;
                        StringBuilder sb3 = new StringBuilder(57);
                        sb3.append("Acc: ");
                        sb3.append((int) max);
                        sb3.append(". Max: ");
                        sb3.append((int) d9);
                        sb3.append(". ExpScale: ");
                        sb3.append(i11);
                        Logging.a("MediaCodecVideoEncoder", sb3.toString());
                        double d10 = this.y;
                        double d11 = this.z;
                        if (d10 > d11) {
                            i2 = this.B - ((int) ((d10 / d11) + 0.5d));
                            this.B = i2;
                            this.y = d11;
                        } else {
                            double d12 = -d11;
                            if (d10 < d12) {
                                i2 = this.B + ((int) (((-d10) / d11) + 0.5d));
                                this.B = i2;
                                this.y = d12;
                            }
                            this.A = 0.0d;
                        }
                        int min2 = Math.min(i2, 20);
                        this.B = min2;
                        int max2 = Math.max(min2, -20);
                        this.B = max2;
                        double a2 = a(max2);
                        StringBuilder sb4 = new StringBuilder(71);
                        sb4.append("Adjusting bitrate scale to ");
                        sb4.append(max2);
                        sb4.append(". Value: ");
                        sb4.append(a2);
                        Logging.a("MediaCodecVideoEncoder", sb4.toString());
                        setRates(this.C / ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.D);
                        this.A = 0.0d;
                    }
                }
                int i12 = bufferInfo.flags & 1;
                if (i12 != 0) {
                    Logging.a("MediaCodecVideoEncoder", "Sync frame generated");
                }
                if (i12 != 0) {
                    if (this.w == 4) {
                        int capacity = this.G.capacity();
                        int i13 = bufferInfo.offset;
                        int i14 = bufferInfo.size;
                        StringBuilder sb5 = new StringBuilder(101);
                        sb5.append("Appending config frame of size ");
                        sb5.append(capacity);
                        sb5.append(" to output buffer with offset ");
                        sb5.append(i13);
                        sb5.append(", size ");
                        sb5.append(i14);
                        Logging.a("MediaCodecVideoEncoder", sb5.toString());
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.G.capacity() + bufferInfo.size);
                        this.G.rewind();
                        allocateDirect.put(this.G);
                        allocateDirect.put(duplicate);
                        allocateDirect.position(0);
                        return new OutputBufferInfo(i7, allocateDirect, true, bufferInfo.presentationTimeUs);
                    }
                }
                return new OutputBufferInfo(i7, duplicate.slice(), i12 != 0, bufferInfo.presentationTimeUs);
            } else if (i7 == -3) {
                this.d = this.a.getOutputBuffers();
                return dequeueOutputBuffer();
            } else if (i7 == -2) {
                return dequeueOutputBuffer();
            } else {
                if (i7 == -1) {
                    return null;
                }
                StringBuilder sb6 = new StringBuilder(32);
                sb6.append("dequeueOutputBuffer: ");
                sb6.append(i7);
                throw new RuntimeException(sb6.toString());
            }
        } catch (IllegalStateException e2) {
            Logging.a("MediaCodecVideoEncoder", "dequeueOutputBuffer failed", (Throwable) e2);
            return new OutputBufferInfo(-1, (ByteBuffer) null, false, -1);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean encodeBuffer(boolean z2, int i2, int i3, long j2) {
        a();
        try {
            a(z2, j2);
            this.a.queueInputBuffer(i2, 0, i3, j2, 0);
            return true;
        } catch (IllegalStateException e2) {
            Logging.a("MediaCodecVideoEncoder", "encodeBuffer failed", (Throwable) e2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean encodeFrame(long j2, boolean z2, VideoFrame videoFrame, int i2, long j3) {
        long j4 = j3;
        a();
        try {
            a(z2, j4);
            VideoFrame.Buffer buffer = videoFrame.getBuffer();
            if (!(buffer instanceof bayp)) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                int i3 = (this.g + 1) / 2;
                ByteBuffer dataY = i420.getDataY();
                ByteBuffer dataU = i420.getDataU();
                ByteBuffer dataV = i420.getDataV();
                int strideY = i420.getStrideY();
                int strideU = i420.getStrideU();
                int strideV = i420.getStrideV();
                if (dataY.capacity() < this.g * strideY) {
                    throw new RuntimeException("Y-plane buffer size too small.");
                } else if (dataU.capacity() < strideU * i3) {
                    throw new RuntimeException("U-plane buffer size too small.");
                } else if (dataV.capacity() >= i3 * strideV) {
                    nativeFillInputBuffer(j2, i2, dataY, strideY, dataU, strideU, dataV, strideV);
                    i420.release();
                    this.a.queueInputBuffer(i2, 0, ((this.f * this.g) * 3) / 2, j3, 0);
                } else {
                    throw new RuntimeException("V-plane buffer size too small.");
                }
            } else {
                bayp bayp = (bayp) buffer;
                baxb baxb = this.e;
                ((baxd) baxb).a();
                if (((baxd) baxb).d != EGL14.EGL_NO_SURFACE) {
                    synchronized (baxe.e) {
                        EGLDisplay eGLDisplay = ((baxd) baxb).c;
                        EGLSurface eGLSurface = ((baxd) baxb).d;
                        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, ((baxd) baxb).a)) {
                            String valueOf = String.valueOf(Integer.toHexString(EGL14.eglGetError()));
                            throw new RuntimeException(valueOf.length() == 0 ? new String("eglMakeCurrent failed: 0x") : "eglMakeCurrent failed: 0x".concat(valueOf));
                        }
                    }
                    GLES20.glClear(16384);
                    baxf baxf = this.I;
                    Matrix matrix = new Matrix();
                    int i4 = this.f;
                    int i5 = this.g;
                    Matrix matrix2 = new Matrix(bayp.b());
                    matrix2.preConcat(matrix);
                    float[] fArr = new float[9];
                    matrix2.getValues(fArr);
                    float[] fArr2 = {fArr[0], fArr[3], 0.0f, fArr[6], fArr[1], fArr[4], 0.0f, fArr[7], 0.0f, 0.0f, 1.0f, 0.0f, fArr[2], fArr[5], 0.0f, fArr[8]};
                    int c2 = bayp.c();
                    int i6 = c2 - 1;
                    if (c2 != 0) {
                        if (i6 == 0) {
                            int a2 = bayp.a();
                            baxf.a(1, fArr2);
                            GLES20.glActiveTexture(33984);
                            GLES20.glBindTexture(36197, a2);
                            GLES20.glViewport(0, 0, i4, i5);
                            GLES20.glDrawArrays(5, 0, 4);
                            GLES20.glBindTexture(36197, 0);
                        } else if (i6 == 1) {
                            int a3 = bayp.a();
                            baxf.a(2, fArr2);
                            GLES20.glActiveTexture(33984);
                            GLES20.glBindTexture(3553, a3);
                            GLES20.glViewport(0, 0, i4, i5);
                            GLES20.glDrawArrays(5, 0, 4);
                            GLES20.glBindTexture(3553, 0);
                        } else {
                            throw new RuntimeException("Unknown texture type.");
                        }
                        baxb baxb2 = this.e;
                        long nanos = TimeUnit.MICROSECONDS.toNanos(j4);
                        ((baxd) baxb2).a();
                        if (((baxd) baxb2).d != EGL14.EGL_NO_SURFACE) {
                            synchronized (baxe.e) {
                                EGLExt.eglPresentationTimeANDROID(((baxd) baxb2).c, ((baxd) baxb2).d, nanos);
                                EGL14.eglSwapBuffers(((baxd) baxb2).c, ((baxd) baxb2).d);
                            }
                        } else {
                            throw new RuntimeException("No EGLSurface - can't swap buffers");
                        }
                    } else {
                        throw null;
                    }
                } else {
                    throw new RuntimeException("No EGLSurface - can't make current");
                }
            }
            return true;
        } catch (RuntimeException e2) {
            Logging.a("MediaCodecVideoEncoder", "encodeFrame failed", (Throwable) e2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public int getColorFormat() {
        return this.x;
    }

    /* access modifiers changed from: package-private */
    public ByteBuffer[] getInputBuffers() {
        ByteBuffer[] inputBuffers = this.a.getInputBuffers();
        int length = inputBuffers.length;
        StringBuilder sb = new StringBuilder(26);
        sb.append("Input buffers: ");
        sb.append(length);
        Logging.a("MediaCodecVideoEncoder", sb.toString());
        return inputBuffers;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x016d, code lost:
        if (android.os.Build.VERSION.SDK_INT > 23) goto L_0x016f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean initEncode(int r19, int r20, int r21, int r22, int r23, int r24, boolean r25) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r9 = 145(0x91, float:2.03E-43)
            r8.<init>(r9)
            java.lang.String r9 = "Java initEncode: "
            r8.append(r9)
            r8.append(r0)
            java.lang.String r9 = ". Profile: "
            r8.append(r9)
            r8.append(r2)
            java.lang.String r9 = " : "
            r8.append(r9)
            r8.append(r3)
            java.lang.String r9 = " x "
            r8.append(r9)
            r8.append(r4)
            java.lang.String r9 = ". @ "
            r8.append(r9)
            r8.append(r5)
            java.lang.String r9 = " kbps. Fps: "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r9 = ". Encode from texture : "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "MediaCodecVideoEncoder"
            org.webrtc.Logging.a(r9, r8)
            r1.f = r3
            r1.g = r4
            java.lang.Thread r8 = r1.c
            if (r8 != 0) goto L_0x0336
            java.lang.String r8 = "video/x-vnd.on2.vp8"
            java.lang.String r11 = "video/x-vnd.on2.vp9"
            java.lang.String r12 = "Enabled"
            java.lang.String r13 = "video/avc"
            r14 = 2
            r15 = 1
            if (r0 != r15) goto L_0x00aa
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            baxs r11 = i
            r2.add(r11)
            baxs r11 = j
            r2.add(r11)
            java.lang.String r11 = "WebRTC-IntelVP8"
            java.lang.String r11 = org.webrtc.PeerConnectionFactory.a(r11)
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x008c
            baxs r11 = k
            r2.add(r11)
        L_0x008c:
            int r11 = r2.size()
            baxs[] r11 = new defpackage.baxs[r11]
            java.lang.Object[] r2 = r2.toArray(r11)
            baxs[] r2 = (defpackage.baxs[]) r2
            if (r7 != 0) goto L_0x009d
            int[] r11 = u
            goto L_0x009f
        L_0x009d:
            int[] r11 = v
        L_0x009f:
            baxr r2 = a(r8, r2, r11)
            r11 = r8
            r8 = 0
            r12 = 100
            goto L_0x0126
        L_0x00aa:
            if (r0 != r14) goto L_0x00be
            baxs[] r2 = n
            if (r7 != 0) goto L_0x00b3
            int[] r8 = u
            goto L_0x00b5
        L_0x00b3:
            int[] r8 = v
        L_0x00b5:
            baxr r2 = a(r11, r2, r8)
            r8 = 0
            r12 = 100
            goto L_0x0126
        L_0x00be:
            r8 = 4
            if (r0 != r8) goto L_0x031c
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            baxs r11 = o
            r8.add(r11)
            baxs r11 = p
            r8.add(r11)
            java.lang.String r11 = "WebRTC-MediaTekH264"
            java.lang.String r11 = org.webrtc.PeerConnectionFactory.a(r11)
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00e1
            baxs r11 = q
            r8.add(r11)
        L_0x00e1:
            int r11 = r8.size()
            baxs[] r11 = new defpackage.baxs[r11]
            java.lang.Object[] r8 = r8.toArray(r11)
            baxs[] r8 = (defpackage.baxs[]) r8
            if (r7 != 0) goto L_0x00f2
            int[] r11 = u
            goto L_0x00f4
        L_0x00f2:
            int[] r11 = v
        L_0x00f4:
            baxr r8 = a(r13, r8, r11)
            r11 = 3
            if (r2 != r11) goto L_0x011a
            baxs[] r2 = s
            if (r7 != 0) goto L_0x0103
            int[] r11 = u
            goto L_0x0105
        L_0x0103:
            int[] r11 = v
        L_0x0105:
            baxr r2 = a(r13, r2, r11)
            if (r2 == 0) goto L_0x0113
            java.lang.String r2 = "High profile H.264 encoder supported."
            org.webrtc.Logging.a(r9, r2)
            r2 = 1
            goto L_0x011c
        L_0x0113:
            java.lang.String r2 = "High profile H.264 encoder requested, but not supported. Use baseline."
            org.webrtc.Logging.a(r9, r2)
            goto L_0x011b
        L_0x011a:
        L_0x011b:
            r2 = 0
        L_0x011c:
            r11 = 20
            r11 = r13
            r12 = 20
            r17 = r8
            r8 = r2
            r2 = r17
        L_0x0126:
            if (r2 == 0) goto L_0x0302
            int r13 = r2.b
            r1.x = r13
            int r13 = r2.c
            r1.H = r13
            r10 = 30
            if (r13 == r14) goto L_0x0139
            int r10 = java.lang.Math.min(r6, r10)
            goto L_0x013a
        L_0x0139:
        L_0x013a:
            r14 = 0
            r1.E = r14
            r14 = -1
            r1.F = r14
            r13 = 1
            if (r0 == r13) goto L_0x0146
            goto L_0x0171
        L_0x0146:
            java.lang.String r14 = r2.a
            baxs r15 = i
            java.lang.String r15 = r15.a
            boolean r14 = r14.startsWith(r15)
            if (r14 == 0) goto L_0x0171
            int r14 = android.os.Build.VERSION.SDK_INT
            r15 = 21
            r6 = 15000(0x3a98, double:7.411E-320)
            if (r14 == r15) goto L_0x016f
            int r14 = android.os.Build.VERSION.SDK_INT
            r15 = 22
            if (r14 == r15) goto L_0x016f
            int r14 = android.os.Build.VERSION.SDK_INT
            r15 = 23
            if (r14 != r15) goto L_0x016b
            r6 = 20000(0x4e20, double:9.8813E-320)
            r1.E = r6
            goto L_0x0171
        L_0x016b:
            int r14 = android.os.Build.VERSION.SDK_INT
            if (r14 <= r15) goto L_0x0171
        L_0x016f:
            r1.E = r6
        L_0x0171:
            int r6 = r1.x
            int r7 = r1.H
            java.lang.String r7 = defpackage.baxq.a(r7)
            long r14 = r1.E
            int r16 = r7.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            int r0 = r16 + 116
            r13.<init>(r0)
            java.lang.String r0 = "Color format: "
            r13.append(r0)
            r13.append(r6)
            java.lang.String r0 = ". Bitrate adjustment: "
            r13.append(r0)
            r13.append(r7)
            java.lang.String r0 = ". Key frame interval: "
            r13.append(r0)
            r13.append(r14)
            java.lang.String r0 = " . Initial fps: "
            r13.append(r0)
            r13.append(r10)
            java.lang.String r0 = r13.toString()
            org.webrtc.Logging.a(r9, r0)
            int r0 = r5 * 1000
            r1.C = r0
            r1.D = r10
            double r5 = (double) r0
            r13 = 4620693217682128896(0x4020000000000000, double:8.0)
            java.lang.Double.isNaN(r5)
            double r5 = r5 / r13
            r1.z = r5
            r5 = 0
            r1.y = r5
            r1.A = r5
            r5 = 0
            r1.B = r5
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r1.c = r0
            android.media.MediaFormat r0 = android.media.MediaFormat.createVideoFormat(r11, r3, r4)     // Catch:{ IllegalStateException -> 0x02f7 }
            java.lang.String r3 = "bitrate"
            int r4 = r1.C     // Catch:{ IllegalStateException -> 0x02f7 }
            r0.setInteger(r3, r4)     // Catch:{ IllegalStateException -> 0x02f7 }
            java.lang.String r3 = "bitrate-mode"
            r4 = 2
            r0.setInteger(r3, r4)     // Catch:{ IllegalStateException -> 0x02f7 }
            java.lang.String r3 = "color-format"
            int r4 = r2.b     // Catch:{ IllegalStateException -> 0x02f7 }
            r0.setInteger(r3, r4)     // Catch:{ IllegalStateException -> 0x02f7 }
            java.lang.String r3 = "frame-rate"
            int r4 = r1.D     // Catch:{ IllegalStateException -> 0x02f7 }
            r0.setInteger(r3, r4)     // Catch:{ IllegalStateException -> 0x02f7 }
            java.lang.String r3 = "i-frame-interval"
            r0.setInteger(r3, r12)     // Catch:{ IllegalStateException -> 0x02f7 }
            if (r8 != 0) goto L_0x01f2
            goto L_0x0200
        L_0x01f2:
            java.lang.String r3 = "profile"
            r4 = 8
            r0.setInteger(r3, r4)     // Catch:{ IllegalStateException -> 0x02f7 }
            java.lang.String r3 = "level"
            r4 = 256(0x100, float:3.59E-43)
            r0.setInteger(r3, r4)     // Catch:{ IllegalStateException -> 0x02f7 }
        L_0x0200:
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ IllegalStateException -> 0x02f7 }
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ IllegalStateException -> 0x02f7 }
            int r4 = r4.length()     // Catch:{ IllegalStateException -> 0x02f7 }
            int r4 = r4 + 10
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x02f7 }
            r5.<init>(r4)     // Catch:{ IllegalStateException -> 0x02f7 }
            java.lang.String r4 = "  Format: "
            r5.append(r4)     // Catch:{ IllegalStateException -> 0x02f7 }
            r5.append(r3)     // Catch:{ IllegalStateException -> 0x02f7 }
            java.lang.String r3 = r5.toString()     // Catch:{ IllegalStateException -> 0x02f7 }
            org.webrtc.Logging.a(r9, r3)     // Catch:{ IllegalStateException -> 0x02f7 }
            java.lang.String r2 = r2.a     // Catch:{ IllegalStateException -> 0x02f7 }
            android.media.MediaCodec r2 = a((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x02f7 }
            r1.a = r2     // Catch:{ IllegalStateException -> 0x02f7 }
            r3 = r19
            r1.w = r3     // Catch:{ IllegalStateException -> 0x02f7 }
            if (r2 != 0) goto L_0x023b
            java.lang.String r0 = "Can not create media encoder"
            org.webrtc.Logging.b(r9, r0)     // Catch:{ IllegalStateException -> 0x02f7 }
            r18.release()     // Catch:{ IllegalStateException -> 0x02f7 }
            r2 = 0
            return r2
        L_0x023b:
            r3 = 0
            r4 = 1
            r2.configure(r0, r3, r3, r4)     // Catch:{ IllegalStateException -> 0x02f7 }
            if (r25 != 0) goto L_0x0245
            goto L_0x02c0
        L_0x0245:
            r0 = r3
            baxc r0 = (defpackage.baxc) r0     // Catch:{ IllegalStateException -> 0x02f7 }
            int[] r2 = defpackage.baxe.f     // Catch:{ IllegalStateException -> 0x02f7 }
            baxd r4 = new baxd     // Catch:{ IllegalStateException -> 0x02f7 }
            if (r0 != 0) goto L_0x02f6
            r4.<init>(r2)     // Catch:{ IllegalStateException -> 0x02f7 }
            r1.e = r4     // Catch:{ IllegalStateException -> 0x02f7 }
            android.media.MediaCodec r0 = r1.a     // Catch:{ IllegalStateException -> 0x02f7 }
            android.view.Surface r0 = r0.createInputSurface()     // Catch:{ IllegalStateException -> 0x02f7 }
            r1.h = r0     // Catch:{ IllegalStateException -> 0x02f7 }
            baxb r2 = r1.e     // Catch:{ IllegalStateException -> 0x02f7 }
            boolean r3 = r0 instanceof android.view.Surface     // Catch:{ IllegalStateException -> 0x02f7 }
            if (r3 == 0) goto L_0x02ee
            r3 = r2
            baxd r3 = (defpackage.baxd) r3     // Catch:{ IllegalStateException -> 0x02f7 }
            r3.a()     // Catch:{ IllegalStateException -> 0x02f7 }
            r3 = r2
            baxd r3 = (defpackage.baxd) r3     // Catch:{ IllegalStateException -> 0x02f7 }
            android.opengl.EGLSurface r3 = r3.d     // Catch:{ IllegalStateException -> 0x02f7 }
            android.opengl.EGLSurface r4 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch:{ IllegalStateException -> 0x02f7 }
            if (r3 != r4) goto L_0x02e6
            r3 = 1
            int[] r4 = new int[r3]     // Catch:{ IllegalStateException -> 0x02f7 }
            r3 = 12344(0x3038, float:1.7298E-41)
            r5 = 0
            r4[r5] = r3     // Catch:{ IllegalStateException -> 0x02f7 }
            r3 = r2
            baxd r3 = (defpackage.baxd) r3     // Catch:{ IllegalStateException -> 0x02f7 }
            android.opengl.EGLDisplay r3 = r3.c     // Catch:{ IllegalStateException -> 0x02f7 }
            r5 = r2
            baxd r5 = (defpackage.baxd) r5     // Catch:{ IllegalStateException -> 0x02f7 }
            android.opengl.EGLConfig r5 = r5.b     // Catch:{ IllegalStateException -> 0x02f7 }
            r6 = 0
            android.opengl.EGLSurface r0 = android.opengl.EGL14.eglCreateWindowSurface(r3, r5, r0, r4, r6)     // Catch:{ IllegalStateException -> 0x02f7 }
            r3 = r2
            baxd r3 = (defpackage.baxd) r3     // Catch:{ IllegalStateException -> 0x02f7 }
            r3.d = r0     // Catch:{ IllegalStateException -> 0x02f7 }
            baxd r2 = (defpackage.baxd) r2     // Catch:{ IllegalStateException -> 0x02f7 }
            android.opengl.EGLSurface r0 = r2.d     // Catch:{ IllegalStateException -> 0x02f7 }
            android.opengl.EGLSurface r2 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch:{ IllegalStateException -> 0x02f7 }
            if (r0 != r2) goto L_0x02b9
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ IllegalStateException -> 0x02f7 }
            int r2 = android.opengl.EGL14.eglGetError()     // Catch:{ IllegalStateException -> 0x02f7 }
            java.lang.String r2 = java.lang.Integer.toHexString(r2)     // Catch:{ IllegalStateException -> 0x02f7 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IllegalStateException -> 0x02f7 }
            java.lang.String r3 = "Failed to create window surface: 0x"
            int r4 = r2.length()     // Catch:{ IllegalStateException -> 0x02f7 }
            if (r4 != 0) goto L_0x02b1
            java.lang.String r2 = new java.lang.String     // Catch:{ IllegalStateException -> 0x02f7 }
            r2.<init>(r3)     // Catch:{ IllegalStateException -> 0x02f7 }
            goto L_0x02b5
        L_0x02b1:
            java.lang.String r2 = r3.concat(r2)     // Catch:{ IllegalStateException -> 0x02f7 }
        L_0x02b5:
            r0.<init>(r2)     // Catch:{ IllegalStateException -> 0x02f7 }
            throw r0     // Catch:{ IllegalStateException -> 0x02f7 }
        L_0x02b9:
            baxf r0 = new baxf     // Catch:{ IllegalStateException -> 0x02f7 }
            r0.<init>()     // Catch:{ IllegalStateException -> 0x02f7 }
            r1.I = r0     // Catch:{ IllegalStateException -> 0x02f7 }
        L_0x02c0:
            android.media.MediaCodec r0 = r1.a     // Catch:{ IllegalStateException -> 0x02f7 }
            r0.start()     // Catch:{ IllegalStateException -> 0x02f7 }
            android.media.MediaCodec r0 = r1.a     // Catch:{ IllegalStateException -> 0x02f7 }
            java.nio.ByteBuffer[] r0 = r0.getOutputBuffers()     // Catch:{ IllegalStateException -> 0x02f7 }
            r1.d = r0     // Catch:{ IllegalStateException -> 0x02f7 }
            int r0 = r0.length     // Catch:{ IllegalStateException -> 0x02f7 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x02f7 }
            r3 = 27
            r2.<init>(r3)     // Catch:{ IllegalStateException -> 0x02f7 }
            java.lang.String r3 = "Output buffers: "
            r2.append(r3)     // Catch:{ IllegalStateException -> 0x02f7 }
            r2.append(r0)     // Catch:{ IllegalStateException -> 0x02f7 }
            java.lang.String r0 = r2.toString()     // Catch:{ IllegalStateException -> 0x02f7 }
            org.webrtc.Logging.a(r9, r0)     // Catch:{ IllegalStateException -> 0x02f7 }
            r0 = 1
            return r0
        L_0x02e6:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ IllegalStateException -> 0x02f7 }
            java.lang.String r2 = "Already has an EGLSurface"
            r0.<init>(r2)     // Catch:{ IllegalStateException -> 0x02f7 }
            throw r0     // Catch:{ IllegalStateException -> 0x02f7 }
        L_0x02ee:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x02f7 }
            java.lang.String r2 = "Input must be either a Surface or SurfaceTexture"
            r0.<init>(r2)     // Catch:{ IllegalStateException -> 0x02f7 }
            throw r0     // Catch:{ IllegalStateException -> 0x02f7 }
        L_0x02f6:
            throw r3     // Catch:{ IllegalStateException -> 0x02f7 }
        L_0x02f7:
            r0 = move-exception
            java.lang.String r2 = "initEncode failed"
            org.webrtc.Logging.a((java.lang.String) r9, (java.lang.String) r2, (java.lang.Throwable) r0)
            r18.release()
            r2 = 0
            return r2
        L_0x0302:
            r3 = r0
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r4 = 39
            r2.<init>(r4)
            java.lang.String r4 = "Can not find HW encoder for "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x031c:
            r3 = r0
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r4 = 43
            r2.<init>(r4)
            java.lang.String r4 = "initEncode: Non-supported codec "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0336:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "Forgot to release()?"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.MediaCodecVideoEncoder.initEncode(int, int, int, int, int, int, boolean):boolean");
    }

    public void release() {
        boolean z2;
        Logging.a("MediaCodecVideoEncoder", "Java releaseEncoder");
        a();
        baxp baxp = new baxp();
        if (this.a != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new baxo(this, baxp, countDownLatch)).start();
            if (!baym.a(countDownLatch)) {
                Logging.b("MediaCodecVideoEncoder", "Media encoder release timeout");
                z2 = true;
            } else {
                z2 = false;
            }
            this.a = null;
        } else {
            z2 = false;
        }
        this.c = null;
        baxf baxf = this.I;
        if (baxf != null) {
            baxg baxg = baxf.a;
            if (baxg != null) {
                baxg.b();
                baxf.a = null;
                baxf.b = 0;
            }
            this.I = null;
        }
        baxb baxb = this.e;
        if (baxb != null) {
            baxd baxd = (baxd) baxb;
            baxd.a();
            if (baxd.d != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(baxd.c, baxd.d);
                baxd.d = EGL14.EGL_NO_SURFACE;
            }
            synchronized (baxe.e) {
                if (!EGL14.eglMakeCurrent(((baxd) baxb).c, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT)) {
                    String valueOf = String.valueOf(Integer.toHexString(EGL14.eglGetError()));
                    throw new RuntimeException(valueOf.length() == 0 ? new String("eglDetachCurrent failed: 0x") : "eglDetachCurrent failed: 0x".concat(valueOf));
                }
            }
            EGL14.eglDestroyContext(baxd.c, baxd.a);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(baxd.c);
            baxd.a = EGL14.EGL_NO_CONTEXT;
            baxd.c = EGL14.EGL_NO_DISPLAY;
            baxd.b = null;
            this.e = null;
        }
        Surface surface = this.h;
        if (surface != null) {
            surface.release();
            this.h = null;
        }
        if (!z2) {
            Exception exc = baxp.a;
            if (exc == null) {
                Logging.a("MediaCodecVideoEncoder", "Java releaseEncoder done");
                return;
            }
            RuntimeException runtimeException = new RuntimeException(exc);
            StackTraceElement[] stackTrace = baxp.a.getStackTrace();
            StackTraceElement[] stackTrace2 = runtimeException.getStackTrace();
            int length = stackTrace.length;
            int length2 = stackTrace2.length;
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[(length + length2)];
            System.arraycopy(stackTrace, 0, stackTraceElementArr, 0, length);
            System.arraycopy(stackTrace2, 0, stackTraceElementArr, length, length2);
            runtimeException.setStackTrace(stackTraceElementArr);
            throw runtimeException;
        }
        b++;
        throw new RuntimeException("Media encoder release timeout.");
    }

    /* access modifiers changed from: package-private */
    public boolean releaseOutputBuffer(int i2) {
        a();
        try {
            this.a.releaseOutputBuffer(i2, false);
            return true;
        } catch (IllegalStateException e2) {
            Logging.a("MediaCodecVideoEncoder", "releaseOutputBuffer failed", (Throwable) e2);
            return false;
        }
    }

    static MediaCodec a(String str) {
        try {
            return MediaCodec.createByCodecName(str);
        } catch (Exception e2) {
            return null;
        }
    }

    private static baxr a(String str, baxs[] baxsArr, int[] iArr) {
        int i2;
        MediaCodecInfo mediaCodecInfo;
        String str2;
        boolean z2;
        int i3;
        String str3 = str;
        baxs[] baxsArr2 = baxsArr;
        int[] iArr2 = iArr;
        int i4 = Build.VERSION.SDK_INT;
        if (!str3.equals("video/avc")) {
            i2 = 0;
        } else if (!Arrays.asList(t).contains(Build.MODEL)) {
            i2 = 0;
        } else {
            String str4 = Build.MODEL;
            StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 39);
            sb.append("Model: ");
            sb.append(str4);
            sb.append(" has black listed H.264 encoder.");
            Logging.c("MediaCodecVideoEncoder", sb.toString());
            return null;
        }
        while (i2 < MediaCodecList.getCodecCount()) {
            try {
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i2);
            } catch (IllegalArgumentException e2) {
                Logging.a("MediaCodecVideoEncoder", "Cannot retrieve encoder codec info", (Throwable) e2);
                mediaCodecInfo = null;
            }
            if (mediaCodecInfo != null && mediaCodecInfo.isEncoder()) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                int length = supportedTypes.length;
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        if (supportedTypes[i5].equals(str3)) {
                            str2 = mediaCodecInfo.getName();
                            break;
                        }
                        i5++;
                    } else {
                        str2 = null;
                        break;
                    }
                }
                if (str2 != null) {
                    String valueOf = String.valueOf(str2);
                    Logging.d("MediaCodecVideoEncoder", valueOf.length() == 0 ? new String("Found candidate encoder ") : "Found candidate encoder ".concat(valueOf));
                    int length2 = baxsArr2.length;
                    int i6 = 0;
                    while (true) {
                        z2 = true;
                        if (i6 >= length2) {
                            i3 = 1;
                            z2 = false;
                            break;
                        }
                        baxs baxs = baxsArr2[i6];
                        if (str2.startsWith(baxs.a)) {
                            if (Build.VERSION.SDK_INT < baxs.b) {
                                int i7 = Build.VERSION.SDK_INT;
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 49);
                                sb2.append("Codec ");
                                sb2.append(str2);
                                sb2.append(" is disabled due to SDK version ");
                                sb2.append(i7);
                                Logging.c("MediaCodecVideoEncoder", sb2.toString());
                            } else {
                                i3 = baxs.c;
                                if (i3 != 1) {
                                    String a2 = baxq.a(i3);
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 36 + a2.length());
                                    sb3.append("Codec ");
                                    sb3.append(str2);
                                    sb3.append(" requires bitrate adjustment: ");
                                    sb3.append(a2);
                                    Logging.c("MediaCodecVideoEncoder", sb3.toString());
                                } else {
                                    i3 = 1;
                                }
                            }
                        }
                        i6++;
                    }
                    if (z2) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str3);
                            for (int hexString : capabilitiesForType.colorFormats) {
                                String valueOf2 = String.valueOf(Integer.toHexString(hexString));
                                Logging.d("MediaCodecVideoEncoder", valueOf2.length() == 0 ? new String("   Color: 0x") : "   Color: 0x".concat(valueOf2));
                            }
                            for (int i8 : iArr2) {
                                for (int i9 : capabilitiesForType.colorFormats) {
                                    if (i9 == i8) {
                                        String hexString2 = Integer.toHexString(i9);
                                        String a3 = baxq.a(i3);
                                        StringBuilder sb4 = new StringBuilder(str.length() + 66 + String.valueOf(str2).length() + String.valueOf(hexString2).length() + a3.length());
                                        sb4.append("Found target encoder for mime ");
                                        sb4.append(str3);
                                        sb4.append(" : ");
                                        sb4.append(str2);
                                        sb4.append(". Color: 0x");
                                        sb4.append(hexString2);
                                        sb4.append(". Bitrate adjustment: ");
                                        sb4.append(a3);
                                        Logging.a("MediaCodecVideoEncoder", sb4.toString());
                                        return new baxr(str2, i9, i3);
                                    }
                                }
                            }
                            continue;
                        } catch (IllegalArgumentException e3) {
                            Logging.a("MediaCodecVideoEncoder", "Cannot retrieve encoder capabilities", (Throwable) e3);
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            i2++;
        }
        return null;
    }

    private final void a() {
        if (this.c.getId() != Thread.currentThread().getId()) {
            String valueOf = String.valueOf(this.c);
            String valueOf2 = String.valueOf(Thread.currentThread());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 68 + String.valueOf(valueOf2).length());
            sb.append("MediaCodecVideoEncoder previously operated on ");
            sb.append(valueOf);
            sb.append(" but is now called on ");
            sb.append(valueOf2);
            throw new RuntimeException(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r9, long r10) {
        /*
            r8 = this;
            r0 = 500(0x1f4, double:2.47E-321)
            long r10 = r10 + r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 / r0
            long r0 = r8.F
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0012
            r8.F = r10
            r0 = r10
            goto L_0x0013
        L_0x0012:
        L_0x0013:
            r4 = 0
            if (r9 != 0) goto L_0x0023
            long r5 = r8.E
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x0023
            long r0 = r0 + r5
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0023
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r9 != 0) goto L_0x002a
            if (r0 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return
        L_0x002a:
            java.lang.String r0 = "MediaCodecVideoEncoder"
            if (r9 != 0) goto L_0x0034
            java.lang.String r9 = "Sync frame forced"
            org.webrtc.Logging.a(r0, r9)
            goto L_0x003a
        L_0x0034:
            java.lang.String r9 = "Sync frame request"
            org.webrtc.Logging.a(r0, r9)
        L_0x003a:
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r0 = "request-sync"
            r9.putInt(r0, r4)
            android.media.MediaCodec r0 = r8.a
            r0.setParameters(r9)
            r8.F = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.MediaCodecVideoEncoder.a(boolean, long):void");
    }
}
