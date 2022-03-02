package org.webrtc;

import java.util.Arrays;
import org.webrtc.PeerConnection;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class IceCandidate {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final PeerConnection.AdapterType e;

    public IceCandidate(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = "";
        this.e = PeerConnection.AdapterType.UNKNOWN;
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof IceCandidate) {
            IceCandidate iceCandidate = (IceCandidate) obj;
            if (!a(this.a, iceCandidate.a) || this.b != iceCandidate.b || !a(this.c, iceCandidate.c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public String getSdp() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public String getSdpMid() {
        return this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c});
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e.toString();
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 15 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append(str);
        sb.append(":");
        sb.append(i);
        sb.append(":");
        sb.append(str2);
        sb.append(":");
        sb.append(str3);
        sb.append(":");
        sb.append(str4);
        return sb.toString();
    }

    IceCandidate(String str, int i, String str2, String str3, PeerConnection.AdapterType adapterType) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = adapterType;
    }
}
