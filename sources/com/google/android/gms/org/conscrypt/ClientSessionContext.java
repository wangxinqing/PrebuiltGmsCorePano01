package com.google.android.gms.org.conscrypt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ClientSessionContext extends AbstractSessionContext {
    private SSLClientSessionCache persistentCache;
    private final Map sessionsByHostAndPort = new HashMap();

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    final class HostAndPort {
        final String host;
        final int port;

        public HostAndPort(String str, int i) {
            this.host = str;
            this.port = i;
        }

        public boolean equals(Object obj) {
            if (obj instanceof HostAndPort) {
                HostAndPort hostAndPort = (HostAndPort) obj;
                if (!this.host.equals(hostAndPort.host) || this.port != hostAndPort.port) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.host.hashCode() * 31) + this.port;
        }
    }

    public ClientSessionContext() {
        super(10);
    }

    private NativeSslSession getSession(String str, int i) {
        NativeSslSession nativeSslSession;
        byte[] sessionData;
        NativeSslSession newInstance;
        if (str == null) {
            return null;
        }
        HostAndPort hostAndPort = new HostAndPort(str, i);
        synchronized (this.sessionsByHostAndPort) {
            List list = (List) this.sessionsByHostAndPort.get(hostAndPort);
            if (list == null || list.size() <= 0) {
                nativeSslSession = null;
            } else {
                nativeSslSession = (NativeSslSession) list.get(0);
            }
        }
        if (nativeSslSession != null && nativeSslSession.isValid()) {
            return nativeSslSession;
        }
        SSLClientSessionCache sSLClientSessionCache = this.persistentCache;
        if (sSLClientSessionCache == null || (sessionData = sSLClientSessionCache.getSessionData(str, i)) == null || (newInstance = NativeSslSession.newInstance(this, sessionData, str, i)) == null || !newInstance.isValid()) {
            return null;
        }
        putSession(hostAndPort, newInstance);
        return newInstance;
    }

    private void putSession(HostAndPort hostAndPort, NativeSslSession nativeSslSession) {
        synchronized (this.sessionsByHostAndPort) {
            List list = (List) this.sessionsByHostAndPort.get(hostAndPort);
            if (list == null) {
                list = new ArrayList();
                this.sessionsByHostAndPort.put(hostAndPort, list);
            }
            if (list.size() > 0 && ((NativeSslSession) list.get(0)).isSingleUse() != nativeSslSession.isSingleUse()) {
                while (!list.isEmpty()) {
                    removeSession((NativeSslSession) list.get(0));
                }
                this.sessionsByHostAndPort.put(hostAndPort, list);
            }
            list.add(nativeSslSession);
        }
    }

    private void removeSession(HostAndPort hostAndPort, NativeSslSession nativeSslSession) {
        synchronized (this.sessionsByHostAndPort) {
            List list = (List) this.sessionsByHostAndPort.get(hostAndPort);
            if (list != null) {
                list.remove(nativeSslSession);
                if (list.isEmpty()) {
                    this.sessionsByHostAndPort.remove(hostAndPort);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.google.android.gms.org.conscrypt.NativeSslSession getCachedSession(java.lang.String r7, int r8, com.google.android.gms.org.conscrypt.SSLParametersImpl r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            if (r7 == 0) goto L_0x003e
            com.google.android.gms.org.conscrypt.NativeSslSession r7 = r6.getSession(r7, r8)     // Catch:{ all -> 0x0043 }
            if (r7 == 0) goto L_0x003e
            java.lang.String r8 = r7.getProtocol()     // Catch:{ all -> 0x0043 }
            java.lang.String[] r1 = r9.enabledProtocols     // Catch:{ all -> 0x0043 }
            int r2 = r1.length     // Catch:{ all -> 0x0043 }
            r3 = 0
            r4 = 0
        L_0x0013:
            if (r4 >= r2) goto L_0x003e
            r5 = r1[r4]     // Catch:{ all -> 0x0043 }
            boolean r5 = r8.equals(r5)     // Catch:{ all -> 0x0043 }
            if (r5 == 0) goto L_0x0040
            java.lang.String r8 = r7.getCipherSuite()     // Catch:{ all -> 0x0043 }
            java.lang.String[] r9 = r9.getEnabledCipherSuites()     // Catch:{ all -> 0x0043 }
            int r1 = r9.length     // Catch:{ all -> 0x0043 }
        L_0x0026:
            if (r3 >= r1) goto L_0x003e
            r2 = r9[r3]     // Catch:{ all -> 0x0043 }
            boolean r2 = r8.equals(r2)     // Catch:{ all -> 0x0043 }
            if (r2 != 0) goto L_0x0033
            int r3 = r3 + 1
            goto L_0x0026
        L_0x0033:
            boolean r8 = r7.isSingleUse()     // Catch:{ all -> 0x0043 }
            if (r8 == 0) goto L_0x003c
            r6.removeSession(r7)     // Catch:{ all -> 0x0043 }
        L_0x003c:
            monitor-exit(r6)
            return r7
        L_0x003e:
            monitor-exit(r6)
            return r0
        L_0x0040:
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0043:
            r7 = move-exception
            monitor-exit(r6)
            goto L_0x0047
        L_0x0046:
            throw r7
        L_0x0047:
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.ClientSessionContext.getCachedSession(java.lang.String, int, com.google.android.gms.org.conscrypt.SSLParametersImpl):com.google.android.gms.org.conscrypt.NativeSslSession");
    }

    public NativeSslSession getSessionFromPersistentCache(byte[] bArr) {
        return null;
    }

    public void onBeforeAddSession(NativeSslSession nativeSslSession) {
        byte[] bytes;
        String peerHost = nativeSslSession.getPeerHost();
        int peerPort = nativeSslSession.getPeerPort();
        if (peerHost != null) {
            putSession(new HostAndPort(peerHost, peerPort), nativeSslSession);
            if (this.persistentCache != null && !nativeSslSession.isSingleUse() && (bytes = nativeSslSession.toBytes()) != null) {
                this.persistentCache.putSessionData(nativeSslSession.toSSLSession(), bytes);
            }
        }
    }

    public void onBeforeRemoveSession(NativeSslSession nativeSslSession) {
        String peerHost = nativeSslSession.getPeerHost();
        if (peerHost != null) {
            removeSession(new HostAndPort(peerHost, nativeSslSession.getPeerPort()), nativeSslSession);
        }
    }

    public void setPersistentCache(SSLClientSessionCache sSLClientSessionCache) {
        this.persistentCache = sSLClientSessionCache;
    }

    /* access modifiers changed from: package-private */
    public int size() {
        int i;
        synchronized (this.sessionsByHostAndPort) {
            i = 0;
            for (List size : this.sessionsByHostAndPort.values()) {
                i += size.size();
            }
        }
        return i;
    }
}
