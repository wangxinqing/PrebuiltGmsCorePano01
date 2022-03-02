package com.google.android.gms.org.conscrypt;

import java.security.Principal;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class SessionSnapshot implements ConscryptSession {
    private final String cipherSuite;
    private final long creationTime;
    private final byte[] id;
    private final long lastAccessedTime;
    private final String peerHost;
    private final int peerPort;
    private final byte[] peerTlsSctData;
    private final String protocol;
    private final String requestedServerName;
    private final SSLSessionContext sessionContext;
    private final List statusResponses;

    public SessionSnapshot(ConscryptSession conscryptSession) {
        this.sessionContext = conscryptSession.getSessionContext();
        this.id = conscryptSession.getId();
        this.requestedServerName = conscryptSession.getRequestedServerName();
        this.statusResponses = conscryptSession.getStatusResponses();
        this.peerTlsSctData = conscryptSession.getPeerSignedCertificateTimestamp();
        this.creationTime = conscryptSession.getCreationTime();
        this.lastAccessedTime = conscryptSession.getLastAccessedTime();
        this.cipherSuite = conscryptSession.getCipherSuite();
        this.protocol = conscryptSession.getProtocol();
        this.peerHost = conscryptSession.getPeerHost();
        this.peerPort = conscryptSession.getPeerPort();
    }

    public int getApplicationBufferSize() {
        return 16384;
    }

    public String getCipherSuite() {
        return this.cipherSuite;
    }

    public long getCreationTime() {
        return this.creationTime;
    }

    public byte[] getId() {
        return this.id;
    }

    public long getLastAccessedTime() {
        return this.lastAccessedTime;
    }

    public Certificate[] getLocalCertificates() {
        return null;
    }

    public Principal getLocalPrincipal() {
        return null;
    }

    public int getPacketBufferSize() {
        return 16709;
    }

    public X509Certificate[] getPeerCertificateChain() {
        throw new SSLPeerUnverifiedException("No peer certificates");
    }

    public String getPeerHost() {
        return this.peerHost;
    }

    public int getPeerPort() {
        return this.peerPort;
    }

    public Principal getPeerPrincipal() {
        throw new SSLPeerUnverifiedException("No peer certificates");
    }

    public byte[] getPeerSignedCertificateTimestamp() {
        byte[] bArr = this.peerTlsSctData;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return null;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getRequestedServerName() {
        return this.requestedServerName;
    }

    public SSLSessionContext getSessionContext() {
        return this.sessionContext;
    }

    public List getStatusResponses() {
        ArrayList arrayList = new ArrayList(this.statusResponses.size());
        for (byte[] clone : this.statusResponses) {
            arrayList.add((byte[]) clone.clone());
        }
        return arrayList;
    }

    public Object getValue(String str) {
        throw new UnsupportedOperationException("All calls to this method should be intercepted by ProvidedSessionDecorator.");
    }

    public String[] getValueNames() {
        throw new UnsupportedOperationException("All calls to this method should be intercepted by ProvidedSessionDecorator.");
    }

    public void invalidate() {
    }

    public boolean isValid() {
        return false;
    }

    public void putValue(String str, Object obj) {
        throw new UnsupportedOperationException("All calls to this method should be intercepted by ProvidedSessionDecorator.");
    }

    public void removeValue(String str) {
        throw new UnsupportedOperationException("All calls to this method should be intercepted by ProvidedSessionDecorator.");
    }

    public java.security.cert.X509Certificate[] getPeerCertificates() {
        throw new SSLPeerUnverifiedException("No peer certificates");
    }
}
