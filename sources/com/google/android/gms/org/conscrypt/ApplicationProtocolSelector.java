package com.google.android.gms.org.conscrypt;

import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSocket;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ApplicationProtocolSelector {
    public abstract String selectApplicationProtocol(SSLEngine sSLEngine, List list);

    public abstract String selectApplicationProtocol(SSLSocket sSLSocket, List list);
}
