package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import org.webrtc.BuiltinAudioDecoderFactoryFactory;
import org.webrtc.BuiltinAudioEncoderFactoryFactory;
import org.webrtc.ContextUtils;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.Logging;
import org.webrtc.MediaConstraints;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.SSLCertificateVerifier;
import org.webrtc.SessionDescription;
import org.webrtc.VideoDecoderFactory;
import org.webrtc.VideoEncoderFactory;
import org.webrtc.audio.JavaAudioDeviceModule;
import org.webrtc.audio.WebRtcAudioRecord;
import org.webrtc.audio.WebRtcAudioTrack;

/* renamed from: usp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class usp {
    private static PeerConnectionFactory e;
    public final PeerConnection a;
    public final aosh b = aosh.f();
    public final ulw c;
    final umh d;
    private final Context f;
    private uso g;
    private final Executor h;

    public usp(Context context, ulw ulw, umh umh, List list, Executor executor) {
        long j;
        this.f = context;
        this.d = umh;
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(list);
        usk usk = new usk(this);
        Context context2 = this.f;
        PeerConnection peerConnection = null;
        if (e == null) {
            bayh bayh = new bayh(context2);
            bayi bayi = new bayi(bayh.a, bayh.b, bayh.c);
            ContextUtils.initialize(bayi.a);
            String str = bayi.c;
            synchronized (baxu.b) {
                if (baxu.c) {
                    Logging.a(baxu.a, "Native library has already been loaded.");
                } else {
                    Logging.a(baxu.a, str.length() == 0 ? new String("Loading native library: ") : "Loading native library: ".concat(str));
                    baxu.c = baxt.a(str);
                }
            }
            PeerConnectionFactory.nativeInitializeAndroidGlobals();
            PeerConnectionFactory.nativeInitializeFieldTrials(bayi.b);
            Logging.a("PeerConnectionFactory", "PeerConnectionFactory was initialized without an injected Loggable. Any existing Loggable will be deleted.");
            PeerConnectionFactory.nativeDeleteLoggable();
            bayg bayg = new bayg();
            PeerConnectionFactory.a();
            if (bayg.a == null) {
                bayq bayq = new bayq(ContextUtils.getApplicationContext());
                Logging.a("JavaAudioDeviceModule", "createAudioDeviceModule");
                if (bayq.f) {
                    Logging.a("JavaAudioDeviceModule", "HW NS will be used.");
                } else {
                    if (bayu.b()) {
                        Logging.a("JavaAudioDeviceModule", "Overriding default behavior; now using WebRTC NS!");
                    }
                    Logging.a("JavaAudioDeviceModule", "HW NS will not be used.");
                }
                if (bayq.e) {
                    Logging.a("JavaAudioDeviceModule", "HW AEC will be used.");
                } else {
                    if (bayu.a()) {
                        Logging.a("JavaAudioDeviceModule", "Overriding default behavior; now using WebRTC AEC!");
                    }
                    Logging.a("JavaAudioDeviceModule", "HW AEC will not be used.");
                }
                bayg.a = new JavaAudioDeviceModule(bayq.a, bayq.b, new WebRtcAudioRecord(bayq.a, bayq.b, bayq.e, bayq.f), new WebRtcAudioTrack(bayq.a, bayq.b, (byte[]) null), bayq.c, bayq.d);
            }
            Context applicationContext = ContextUtils.getApplicationContext();
            JavaAudioDeviceModule javaAudioDeviceModule = bayg.a;
            synchronized (javaAudioDeviceModule.g) {
                long j2 = javaAudioDeviceModule.h;
                if (j2 == 0) {
                    long nativeCreateAudioDeviceModule = JavaAudioDeviceModule.nativeCreateAudioDeviceModule(javaAudioDeviceModule.a, javaAudioDeviceModule.b, javaAudioDeviceModule.c, javaAudioDeviceModule.d, javaAudioDeviceModule.e, javaAudioDeviceModule.f, false, false);
                    javaAudioDeviceModule.h = nativeCreateAudioDeviceModule;
                    j = nativeCreateAudioDeviceModule;
                } else {
                    j = j2;
                }
            }
            e = PeerConnectionFactory.nativeCreatePeerConnectionFactory(applicationContext, (PeerConnectionFactory.Options) null, j, BuiltinAudioEncoderFactoryFactory.nativeCreateBuiltinAudioEncoderFactory(), BuiltinAudioDecoderFactoryFactory.nativeCreateBuiltinAudioDecoderFactory(), (VideoEncoderFactory) null, (VideoDecoderFactory) null, 0, 0, 0, 0, 0, 0);
        }
        PeerConnectionFactory peerConnectionFactory = e;
        if (peerConnectionFactory.a != 0) {
            long nativeCreatePeerConnectionObserver = PeerConnection.nativeCreatePeerConnectionObserver(usk);
            if (nativeCreatePeerConnectionObserver != 0) {
                long nativeCreatePeerConnection = PeerConnectionFactory.nativeCreatePeerConnection(peerConnectionFactory.a, rTCConfiguration, (MediaConstraints) null, nativeCreatePeerConnectionObserver, (SSLCertificateVerifier) null);
                if (nativeCreatePeerConnection != 0) {
                    peerConnection = new PeerConnection(nativeCreatePeerConnection);
                }
            }
            this.a = peerConnection;
            this.g = uso.INITIALIZED;
            this.c = ulw;
            this.h = executor;
            return;
        }
        throw new IllegalStateException("PeerConnectionFactory has been disposed.");
    }

    private final void d(SessionDescription sessionDescription) {
        aosh f2 = aosh.f();
        this.a.nativeSetRemoteDescription(new usi(f2, sessionDescription), sessionDescription);
        SessionDescription sessionDescription2 = (SessionDescription) thr.c("setRemoteSessionDescription", f2, aymi.O());
    }

    public final synchronized SessionDescription a() {
        SessionDescription sessionDescription;
        if (a(uso.INITIALIZED, uso.CREATING_OFFER)) {
            aosh f2 = aosh.f();
            DataChannel nativeCreateDataChannel = this.a.nativeCreateDataChannel("dataChannel", new DataChannel.Init());
            nativeCreateDataChannel.a(new usn(this, nativeCreateDataChannel));
            this.a.nativeCreateOffer(new usf(this, f2), new MediaConstraints());
            sessionDescription = (SessionDescription) thr.c("createOffer", f2, aymi.O());
        } else {
            sessionDescription = null;
        }
        return sessionDescription;
    }

    public final synchronized SessionDescription b() {
        SessionDescription sessionDescription;
        if (a(uso.RECEIVED_OFFER, uso.CREATING_ANSWER)) {
            aosh f2 = aosh.f();
            this.a.nativeCreateAnswer(new usg(this, f2), new MediaConstraints());
            sessionDescription = (SessionDescription) thr.c("createAnswer", f2, aymi.O());
        } else {
            sessionDescription = null;
        }
        return sessionDescription;
    }

    public final synchronized void c(SessionDescription sessionDescription) {
        if (a(uso.INITIALIZED, uso.RECEIVED_OFFER)) {
            d(sessionDescription);
        }
    }

    public final synchronized void e() {
        ((anih) ((anih) ulh.a.d()).a("usp", "e", 360, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Data channel state changed to connected.");
        if (!a(uso.WAITING_TO_CONNECT, uso.CONNECTED)) {
            d();
        }
    }

    public final synchronized boolean c() {
        if (this.g == uso.ENDED) {
            return false;
        }
        this.g = uso.ENDED;
        this.b.cancel(true);
        a((Runnable) new use(this));
        ((anih) ((anih) ulh.a.d()).a("usp", "c", 314, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Closed WebRTC connection.");
        return true;
    }

    public final synchronized void d() {
        if (c()) {
            umh umh = this.d;
            umh.a.a((Runnable) new ume(umh));
        }
    }

    public final synchronized void b(SessionDescription sessionDescription) {
        if (a(uso.WAITING_FOR_ANSWER, uso.WAITING_TO_CONNECT)) {
            d(sessionDescription);
        }
    }

    public final synchronized SessionDescription a(SessionDescription sessionDescription) {
        aosh f2;
        f2 = aosh.f();
        this.a.nativeSetLocalDescription(new ush(f2, sessionDescription), sessionDescription);
        return (SessionDescription) thr.c("setLocalSessionDescription", f2, aymi.O());
    }

    public final void a(Runnable runnable) {
        this.h.execute(runnable);
    }

    public final synchronized void a(PeerConnection.PeerConnectionState peerConnectionState) {
        if (peerConnectionState == PeerConnection.PeerConnectionState.CLOSED || peerConnectionState == PeerConnection.PeerConnectionState.FAILED || peerConnectionState == PeerConnection.PeerConnectionState.DISCONNECTED) {
            d();
        }
    }

    public final synchronized boolean a(List list) {
        if (this.g == uso.ENDED) {
            ((anih) ((anih) ulh.a.c()).a("usp", "a", 259, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("You cannot add ice candidates to a disconnected session.");
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IceCandidate iceCandidate = (IceCandidate) it.next();
            if (!this.a.nativeAddIceCandidate(iceCandidate.a, iceCandidate.b, iceCandidate.c)) {
                ((anih) ((anih) ulh.a.c()).a("usp", "a", 265, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to add remote ice candidate.");
                return false;
            }
        }
        return true;
    }

    public final boolean a(uso uso, uso uso2) {
        if (uso != this.g) {
            ((anih) ((anih) ulh.a.c()).a("usp", "a", 368, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Invalid state transition to %s: current state is %s but expected %s.", (Object) uso2, (Object) this.g, (Object) uso);
            return false;
        }
        this.g = uso2;
        return true;
    }
}
