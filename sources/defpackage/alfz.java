package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.ProtocolException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.apache.http.impl.client.RequestWrapper;

/* renamed from: alfz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alfz {
    public static final Pattern a = Pattern.compile("(^|[\\s;,]+)([^()<>@,;:\\\"/\\[\\]\\?={}\\s]+)\\s*=\\s*(\"[^\"]*\"|[^,;\\s\"]+)");
    private static final int b = ".".codePointAt(0);
    private static final String[] c = {"google.com", "googleapis.com"};
    private static final Pattern d = Pattern.compile("[^,;\\s\"]+");

    public static String a(String str) {
        if (str == null) {
            return "\"\"";
        }
        if (d.matcher(str).matches()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append("\"");
        sb.append(str);
        sb.append("\"");
        return sb.toString();
    }

    public static String a(String str, String str2) {
        Matcher matcher = a.matcher(str);
        while (matcher.find()) {
            if (matcher.group(2).equals(str2)) {
                String group = matcher.group();
                String trim = group.substring(group.indexOf("=") + 1).trim();
                return trim.startsWith("\"") ? trim.substring(1, trim.length() - 1) : trim;
            }
        }
        return null;
    }

    public static RequestWrapper a(HttpUriRequest httpUriRequest) {
        EntityEnclosingRequestWrapper entityEnclosingRequestWrapper;
        try {
            if (httpUriRequest instanceof HttpEntityEnclosingRequest) {
                entityEnclosingRequestWrapper = new EntityEnclosingRequestWrapper((HttpEntityEnclosingRequest) httpUriRequest);
            } else {
                entityEnclosingRequestWrapper = new RequestWrapper(httpUriRequest);
            }
            entityEnclosingRequestWrapper.resetHeaders();
            return entityEnclosingRequestWrapper;
        } catch (ProtocolException e) {
            throw new ClientProtocolException(e);
        }
    }

    public static boolean a(HttpUriRequest httpUriRequest, alga alga) {
        if (alga != null) {
            for (String str : c) {
                String host = httpUriRequest.getURI().getHost();
                if (str.length() <= host.length()) {
                    if (str.equalsIgnoreCase(host)) {
                        return true;
                    }
                    int length = host.length() - 1;
                    int length2 = str.length() - 1;
                    while (true) {
                        if (length2 >= 0) {
                            if (Character.toLowerCase(host.codePointAt(length)) != Character.toLowerCase(str.codePointAt(length2))) {
                                break;
                            }
                            length--;
                            length2--;
                        } else if (host.codePointAt(length) == b) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
