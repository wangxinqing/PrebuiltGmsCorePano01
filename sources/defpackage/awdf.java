package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: awdf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class awdf extends HttpsURLConnection {
    private final HttpURLConnection a;

    public awdf(HttpURLConnection httpURLConnection) {
        super(httpURLConnection.getURL());
        this.a = httpURLConnection;
    }

    /* access modifiers changed from: protected */
    public abstract avyz a();

    public final void addRequestProperty(String str, String str2) {
        this.a.addRequestProperty(str, str2);
    }

    public final void connect() {
        this.connected = true;
        this.a.connect();
    }

    public final void disconnect() {
        this.a.disconnect();
    }

    public final boolean getAllowUserInteraction() {
        return this.a.getAllowUserInteraction();
    }

    public final String getCipherSuite() {
        avyz a2 = a();
        if (a2 != null) {
            return a2.a;
        }
        return null;
    }

    public final int getConnectTimeout() {
        return this.a.getConnectTimeout();
    }

    public final Object getContent() {
        return this.a.getContent();
    }

    public final String getContentEncoding() {
        return this.a.getContentEncoding();
    }

    public final int getContentLength() {
        return this.a.getContentLength();
    }

    public final String getContentType() {
        return this.a.getContentType();
    }

    public final long getDate() {
        return this.a.getDate();
    }

    public final boolean getDefaultUseCaches() {
        return this.a.getDefaultUseCaches();
    }

    public final boolean getDoInput() {
        return this.a.getDoInput();
    }

    public final boolean getDoOutput() {
        return this.a.getDoOutput();
    }

    public final InputStream getErrorStream() {
        return this.a.getErrorStream();
    }

    public final long getExpiration() {
        return this.a.getExpiration();
    }

    public final String getHeaderField(int i) {
        return this.a.getHeaderField(i);
    }

    public final long getHeaderFieldDate(String str, long j) {
        return this.a.getHeaderFieldDate(str, j);
    }

    public final int getHeaderFieldInt(String str, int i) {
        return this.a.getHeaderFieldInt(str, i);
    }

    public final String getHeaderFieldKey(int i) {
        return this.a.getHeaderFieldKey(i);
    }

    public final Map getHeaderFields() {
        return this.a.getHeaderFields();
    }

    public final long getIfModifiedSince() {
        return this.a.getIfModifiedSince();
    }

    public final InputStream getInputStream() {
        return this.a.getInputStream();
    }

    public final boolean getInstanceFollowRedirects() {
        return this.a.getInstanceFollowRedirects();
    }

    public final long getLastModified() {
        return this.a.getLastModified();
    }

    public final Certificate[] getLocalCertificates() {
        avyz a2 = a();
        if (a2 != null) {
            List list = a2.c;
            if (!list.isEmpty()) {
                return (Certificate[]) list.toArray(new Certificate[list.size()]);
            }
        }
        return null;
    }

    public final Principal getLocalPrincipal() {
        avyz a2 = a();
        if (a2 == null || a2.c.isEmpty()) {
            return null;
        }
        return ((X509Certificate) a2.c.get(0)).getSubjectX500Principal();
    }

    public final OutputStream getOutputStream() {
        return this.a.getOutputStream();
    }

    public final Principal getPeerPrincipal() {
        avyz a2 = a();
        if (a2 == null || a2.b.isEmpty()) {
            return null;
        }
        return ((X509Certificate) a2.b.get(0)).getSubjectX500Principal();
    }

    public final Permission getPermission() {
        return this.a.getPermission();
    }

    public final int getReadTimeout() {
        return this.a.getReadTimeout();
    }

    public final String getRequestMethod() {
        return this.a.getRequestMethod();
    }

    public final Map getRequestProperties() {
        return this.a.getRequestProperties();
    }

    public final String getRequestProperty(String str) {
        return this.a.getRequestProperty(str);
    }

    public final int getResponseCode() {
        return this.a.getResponseCode();
    }

    public final String getResponseMessage() {
        return this.a.getResponseMessage();
    }

    public final Certificate[] getServerCertificates() {
        avyz a2 = a();
        if (a2 != null) {
            List list = a2.b;
            if (!list.isEmpty()) {
                return (Certificate[]) list.toArray(new Certificate[list.size()]);
            }
        }
        return null;
    }

    public final URL getURL() {
        return this.a.getURL();
    }

    public final boolean getUseCaches() {
        return this.a.getUseCaches();
    }

    public final void setAllowUserInteraction(boolean z) {
        this.a.setAllowUserInteraction(z);
    }

    public final void setChunkedStreamingMode(int i) {
        this.a.setChunkedStreamingMode(i);
    }

    public final void setConnectTimeout(int i) {
        this.a.setConnectTimeout(i);
    }

    public final void setDefaultUseCaches(boolean z) {
        this.a.setDefaultUseCaches(z);
    }

    public final void setDoInput(boolean z) {
        this.a.setDoInput(z);
    }

    public final void setDoOutput(boolean z) {
        this.a.setDoOutput(z);
    }

    public final void setFixedLengthStreamingMode(int i) {
        this.a.setFixedLengthStreamingMode(i);
    }

    public final void setIfModifiedSince(long j) {
        this.a.setIfModifiedSince(j);
    }

    public final void setInstanceFollowRedirects(boolean z) {
        this.a.setInstanceFollowRedirects(z);
    }

    public final void setReadTimeout(int i) {
        this.a.setReadTimeout(i);
    }

    public final void setRequestMethod(String str) {
        this.a.setRequestMethod(str);
    }

    public final void setRequestProperty(String str, String str2) {
        this.a.setRequestProperty(str, str2);
    }

    public final void setUseCaches(boolean z) {
        this.a.setUseCaches(z);
    }

    public final String toString() {
        return this.a.toString();
    }

    public final boolean usingProxy() {
        return this.a.usingProxy();
    }

    public final Object getContent(Class[] clsArr) {
        return this.a.getContent(clsArr);
    }

    public final String getHeaderField(String str) {
        return this.a.getHeaderField(str);
    }
}
