package org.webrtc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.webrtc.DataChannel;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PeerConnection {
    public final List a = new ArrayList();
    public final long b;
    public List c = new ArrayList();
    public List d = new ArrayList();
    public List e = new ArrayList();

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum AdapterType {
        UNKNOWN(0),
        ETHERNET(1),
        WIFI(2),
        CELLULAR(4),
        VPN(8),
        LOOPBACK(16),
        ADAPTER_TYPE_ANY(32);
        
        private static final Map i = null;
        public final Integer h;

        static {
            int i2;
            i = new HashMap();
            for (AdapterType adapterType : values()) {
                i.put(adapterType.h, adapterType);
            }
        }

        private AdapterType(Integer num) {
            this.h = num;
        }

        static AdapterType fromNativeIndex(int i2) {
            return (AdapterType) i.get(Integer.valueOf(i2));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum BundlePolicy {
        BALANCED,
        MAXBUNDLE,
        MAXCOMPAT
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum CandidateNetworkPolicy {
        ALL,
        LOW_COST
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum ContinualGatheringPolicy {
        GATHER_ONCE,
        GATHER_CONTINUALLY
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum IceConnectionState {
        NEW,
        CHECKING,
        CONNECTED,
        COMPLETED,
        FAILED,
        DISCONNECTED,
        CLOSED;

        static IceConnectionState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum IceGatheringState {
        NEW,
        GATHERING,
        COMPLETE;

        static IceGatheringState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class IceServer {
        @Deprecated
        public final String a;
        public final List b;
        public final String c;
        public final String d;
        public final TlsCertPolicy e;
        public final String f;

        public IceServer(String str, List list, String str2, String str3, TlsCertPolicy tlsCertPolicy, String str4) {
            if (str == null || list.isEmpty()) {
                throw new IllegalArgumentException("uri == null || urls == null || urls.isEmpty()");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((String) it.next()) == null) {
                    String valueOf = String.valueOf(list);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                    sb.append("urls element is null: ");
                    sb.append(valueOf);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("username == null");
            } else if (str3 != null) {
                this.a = str;
                this.b = list;
                this.c = str2;
                this.d = str3;
                this.e = tlsCertPolicy;
                this.f = str4;
            } else {
                throw new IllegalArgumentException("password == null");
            }
        }

        public static bayf a(String str) {
            return new bayf(Collections.singletonList(str));
        }

        public final boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            if (obj instanceof IceServer) {
                IceServer iceServer = (IceServer) obj;
                if (this.a.equals(iceServer.a) && this.b.equals(iceServer.b) && this.c.equals(iceServer.c) && this.d.equals(iceServer.d) && this.e.equals(iceServer.e) && this.f.equals(iceServer.f)) {
                    throw null;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public String getHostname() {
            return this.f;
        }

        /* access modifiers changed from: package-private */
        public String getPassword() {
            return this.d;
        }

        /* access modifiers changed from: package-private */
        public List getTlsAlpnProtocols() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public TlsCertPolicy getTlsCertPolicy() {
            return this.e;
        }

        /* access modifiers changed from: package-private */
        public List getTlsEllipticCurves() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public List getUrls() {
            return this.b;
        }

        /* access modifiers changed from: package-private */
        public String getUsername() {
            return this.c;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, null, null});
        }

        public final String toString() {
            String valueOf = String.valueOf(this.b);
            String str = this.c;
            String str2 = this.d;
            String valueOf2 = String.valueOf(this.e);
            String str3 = this.f;
            String valueOf3 = String.valueOf((Object) null);
            String valueOf4 = String.valueOf((Object) null);
            int length = String.valueOf(valueOf).length();
            int length2 = str.length();
            int length3 = str2.length();
            int length4 = String.valueOf(valueOf2).length();
            int length5 = str3.length();
            StringBuilder sb = new StringBuilder(length + 16 + length2 + length3 + length4 + length5 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
            sb.append(valueOf);
            sb.append(" [");
            sb.append(str);
            sb.append(":");
            sb.append(str2);
            sb.append("] [");
            sb.append(valueOf2);
            sb.append("] [");
            sb.append(str3);
            sb.append("] [");
            sb.append(valueOf3);
            sb.append("] [");
            sb.append(valueOf4);
            sb.append("]");
            return sb.toString();
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum IceTransportsType {
        NONE,
        RELAY,
        NOHOST,
        ALL
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum KeyType {
        RSA,
        ECDSA
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface Observer {
        void onAddStream(MediaStream mediaStream);

        void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr);

        void onConnectionChange(PeerConnectionState peerConnectionState);

        void onDataChannel(DataChannel dataChannel);

        void onIceCandidate(IceCandidate iceCandidate);

        void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr);

        void onIceConnectionChange(IceConnectionState iceConnectionState);

        void onIceConnectionReceivingChange(boolean z);

        void onIceGatheringChange(IceGatheringState iceGatheringState);

        void onRemoveStream(MediaStream mediaStream);

        void onRenegotiationNeeded();

        void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent);

        void onSignalingChange(SignalingState signalingState);

        void onStandardizedIceConnectionChange(IceConnectionState iceConnectionState);

        void onTrack(RtpTransceiver rtpTransceiver);
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum PeerConnectionState {
        NEW,
        CONNECTING,
        CONNECTED,
        DISCONNECTED,
        FAILED,
        CLOSED;

        static PeerConnectionState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum PortPrunePolicy {
        NO_PRUNE,
        PRUNE_BASED_ON_PRIORITY,
        KEEP_FIRST_READY
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class RTCConfiguration {
        public IceTransportsType a = IceTransportsType.ALL;
        public List b;
        public BundlePolicy c = BundlePolicy.BALANCED;
        public RtcpMuxPolicy d = RtcpMuxPolicy.REQUIRE;
        public TcpCandidatePolicy e = TcpCandidatePolicy.ENABLED;
        public CandidateNetworkPolicy f = CandidateNetworkPolicy.ALL;
        public int g;
        public int h;
        public int i;
        public KeyType j;
        public ContinualGatheringPolicy k;
        public PortPrunePolicy l;
        public int m;
        public boolean n;
        public AdapterType o;
        public SdpSemantics p;

        public RTCConfiguration(List list) {
            this.b = list;
            this.g = 50;
            this.h = -1;
            this.i = -1;
            this.j = KeyType.ECDSA;
            this.k = ContinualGatheringPolicy.GATHER_ONCE;
            this.l = PortPrunePolicy.NO_PRUNE;
            this.m = 5;
            this.n = true;
            this.o = AdapterType.UNKNOWN;
            this.p = SdpSemantics.PLAN_B;
        }

        /* access modifiers changed from: package-private */
        public boolean getActiveResetSrtpParams() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public Boolean getAllowCodecSwitching() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public boolean getAudioJitterBufferFastAccelerate() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public int getAudioJitterBufferMaxPackets() {
            return this.g;
        }

        /* access modifiers changed from: package-private */
        public BundlePolicy getBundlePolicy() {
            return this.c;
        }

        /* access modifiers changed from: package-private */
        public CandidateNetworkPolicy getCandidateNetworkPolicy() {
            return this.f;
        }

        /* access modifiers changed from: package-private */
        public RtcCertificatePem getCertificate() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public Boolean getCombinedAudioVideoBwe() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public ContinualGatheringPolicy getContinualGatheringPolicy() {
            return this.k;
        }

        /* access modifiers changed from: package-private */
        public CryptoOptions getCryptoOptions() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public boolean getDisableIPv6OnWifi() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean getDisableIpv6() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean getEnableCpuOveruseDetection() {
            return this.n;
        }

        /* access modifiers changed from: package-private */
        public boolean getEnableDscp() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public Boolean getEnableDtlsSrtp() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public boolean getEnableRtpDataChannel() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public int getIceBackupCandidatePairPingInterval() {
            return this.i;
        }

        /* access modifiers changed from: package-private */
        public int getIceCandidatePoolSize() {
            return 0;
        }

        /* access modifiers changed from: package-private */
        public Integer getIceCheckIntervalStrongConnectivity() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public Integer getIceCheckIntervalWeakConnectivity() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public Integer getIceCheckMinInterval() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public int getIceConnectionReceivingTimeout() {
            return this.h;
        }

        /* access modifiers changed from: package-private */
        public List getIceServers() {
            return this.b;
        }

        /* access modifiers changed from: package-private */
        public IceTransportsType getIceTransportsType() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public Integer getIceUnwritableMinChecks() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public Integer getIceUnwritableTimeout() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public KeyType getKeyType() {
            return this.j;
        }

        /* access modifiers changed from: package-private */
        public int getMaxIPv6Networks() {
            return this.m;
        }

        /* access modifiers changed from: package-private */
        public AdapterType getNetworkPreference() {
            return this.o;
        }

        /* access modifiers changed from: package-private */
        public boolean getPresumeWritableWhenFullyRelayed() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean getPruneTurnPorts() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public RtcpMuxPolicy getRtcpMuxPolicy() {
            return this.d;
        }

        /* access modifiers changed from: package-private */
        public Integer getScreencastMinBitrate() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public SdpSemantics getSdpSemantics() {
            return this.p;
        }

        /* access modifiers changed from: package-private */
        public Integer getStunCandidateKeepaliveInterval() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public boolean getSurfaceIceCandidatesOnIceTransportTypeChanged() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean getSuspendBelowMinBitrate() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public TcpCandidatePolicy getTcpCandidatePolicy() {
            return this.e;
        }

        /* access modifiers changed from: package-private */
        public TurnCustomizer getTurnCustomizer() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public String getTurnLoggingId() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public PortPrunePolicy getTurnPortPrunePolicy() {
            return this.l;
        }

        /* access modifiers changed from: package-private */
        public boolean getUseMediaTransport() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean getUseMediaTransportForDataChannels() {
            return false;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum RtcpMuxPolicy {
        NEGOTIATE,
        REQUIRE
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum SdpSemantics {
        PLAN_B,
        UNIFIED_PLAN
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum SignalingState {
        STABLE,
        HAVE_LOCAL_OFFER,
        HAVE_LOCAL_PRANSWER,
        HAVE_REMOTE_OFFER,
        HAVE_REMOTE_PRANSWER,
        CLOSED;

        static SignalingState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum TcpCandidatePolicy {
        ENABLED,
        DISABLED
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum TlsCertPolicy {
        TLS_CERT_POLICY_SECURE,
        TLS_CERT_POLICY_INSECURE_NO_CHECK
    }

    public PeerConnection(long j) {
        this.b = j;
    }

    public static native long nativeCreatePeerConnectionObserver(Observer observer);

    public static native void nativeFreeOwnedPeerConnection(long j);

    /* access modifiers changed from: package-private */
    public long getNativeOwnedPeerConnection() {
        return this.b;
    }

    public native boolean nativeAddIceCandidate(String str, int i, String str2);

    public native void nativeClose();

    public native void nativeCreateAnswer(SdpObserver sdpObserver, MediaConstraints mediaConstraints);

    public native DataChannel nativeCreateDataChannel(String str, DataChannel.Init init);

    public native void nativeCreateOffer(SdpObserver sdpObserver, MediaConstraints mediaConstraints);

    public native void nativeRemoveLocalStream(long j);

    public native void nativeSetLocalDescription(SdpObserver sdpObserver, SessionDescription sessionDescription);

    public native void nativeSetRemoteDescription(SdpObserver sdpObserver, SessionDescription sessionDescription);
}
